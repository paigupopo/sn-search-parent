package com.sn.search.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.sn.mapper.*;
import com.sn.pojo.*;
import com.sn.search.SearchInterface;
import hwadee.common.HighlightQueryFactory;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.*;
import org.springframework.data.solr.core.query.result.FacetPage;
import org.springframework.data.solr.core.query.result.HighlightEntry;
import org.springframework.data.solr.core.query.result.HighlightEntry.Highlight;
import org.springframework.data.solr.core.query.result.HighlightPage;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;

@Service(timeout = 5000)
@SuppressWarnings("all")
public class SearchImpl implements SearchInterface {


    @Autowired
    private CmspublishedarticleMapper mapper;

    @Autowired
    private LogoMapper logoMapper;

    @Autowired
    private CmsGovernmenthotsMapper governmenthotsMapper;

    @Autowired
    private CmsGovernmenthotsitermMapper governmenthotsitermMapper;

    @Autowired
    private AssetcategoryMapper assetcategoryMapper;
    @Autowired
    private SolrTemplate solrTemplate;

    private final static String regEx = "[`~！@#$%^&*()+=|{}:;\\\\[\\\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？' \" \"]";

    @Override
    public Map search(Map searchMap) {
        Map map = new HashMap();

        //字符处理
        String keywords = (String) searchMap.get("keywords");
        searchMap.put("keywords", Pattern.compile(regEx).matcher(keywords).replaceAll("").trim());//关键字去掉字符\

        Map resmap = null;
        if ("政策文件".equals(searchMap.get("group")) || "政务动态".equals(searchMap.get("group")) || "政策解读".equals(searchMap.get("group")) ) {
            resmap = searchListNew(searchMap);
        } else {
            resmap = searchList(searchMap);
        }
        //1.查询列表
        map.putAll(resmap);

        return map;
    }

    /**
     * logo设置
     * @param groupId
     * @return
     */
    @Override
    public String selectLogo(Long groupId) {
        return logoMapper.selectLogo(groupId);
    }

    @Override
    public List<String> getCategoryName(String cateGoryFlag) {
        List<String> res = mapper.getCategoryName(cateGoryFlag);
        return res;
    }

    private Map searchListNew(Map searchMap) {
        Map map = new HashMap();

        HighlightQueryFactory fc = new HighlightQueryFactory();


        // 关键字查询和站点查询
        fc.addCriteria(searchMap);
        if ("政策文件".equals(searchMap.get("group"))) {
            fc.addCriteria("jo_cateGoryFlag", "1");

        } else if ("政策解读".equals(searchMap.get("group"))) {
            fc.addCriteria("jo_cateGoryFlag", "2");
        } else {
            fc.addExclude("jo_cateGoryFlag", "1");
            fc.addExclude("jo_cateGoryFlag", "2");
        }

        if (StringUtils.isNotEmpty((String)searchMap.get("categoryName")) && !"不限".equals(searchMap.get("categoryName"))) {
            fc.addExclude("jo_categoryName", (String)searchMap.get("categoryName"));
        }

        // 分页
        fc.setPage(searchMap);
        // 排序
        fc.setSort(searchMap);
        // 高级搜索
        fc.setSpecialSearch(searchMap);

        //***********  获取高亮结果集  ***********
        HighlightPage<Journalarticle> page = solrTemplate.queryForHighlightPage(fc.getQuery(), Journalarticle.class);

        //获取高亮入口集合
        List<HighlightEntry<Journalarticle>> highlighted = page.getHighlighted();
        for (HighlightEntry<Journalarticle> entry : highlighted) {
            //获取高亮列表
            List<Highlight> highlights = entry.getHighlights();

            if (highlights.size() > 0 && highlights.get(0).getSnipplets().size() > 0) {
                Journalarticle entity = entry.getEntity();
                entity.setContent(highlights.get(0).getSnipplets().get(0));
            }
        }
        map.put("rows", page.getContent());
        map.put("totalPages", page.getTotalPages());//返回总页数
        map.put("total", page.getTotalElements());//返回总记录数
        return map;
    }



    //查询列表
    private Map searchList(Map searchMap) {

        Map map = new HashMap();

        if(searchMap.get("group").equals("全部")) {

            //对领导数据进行检索
            FacetQuery querys = new SimpleFacetQuery();
            Criteria criterias = new Criteria("qal_keywords").is(searchMap.get("keywords"));
            querys.addCriteria(criterias);

            FacetPage<Leader> leaders = solrTemplate.queryForFacetPage(querys, Leader.class);
                for (Leader leader : leaders) {
                    leader.setQalImg("http://www.suining.gov.cn" + leader.getQalImg());
                }
                if (leaders.getContent().size() != 0) {
                map.put("leader", leaders.getContent());
            }




            //高亮选项初始化
            HighlightQuery query = new SimpleHighlightQuery();
            //设置高亮显示
            HighlightOptions options = new HighlightOptions();
            // options.addField("jo_title");
            options.addField("jo_content");
           //设置高亮前后缀
            options.setSimplePrefix("<em style='color:red'>");
            options.setSimplePostfix("</em>");
            //设置高亮选项
            query.setHighlightOptions(options);


            // 关键字查询和站点查询
            String o1 = (String) searchMap.get("title");
            //是否点击标题查询
            if (o1 != null && o1 != "" && o1.equals("2")) {
                //点击标题后 站点是否存在
                if (searchMap.get("groupId") != null || !"".equals(searchMap.get("groupId"))) {
                    //存在,根据站点和关键字搜索
                    Criteria criteria1 = new Criteria("jo_title").is(searchMap.get("keywords"));
                    Crotch crotch1 = criteria1.and("jo_groupId").is(searchMap.get("groupId"));
                    query.addCriteria(crotch1);
                } else {

                    Criteria criteria = new Criteria("jo_title").is(searchMap.get("keywords"));
                    query.addCriteria(criteria);
                }

                //判断站点是否存在,根据站点和关键字搜索
            } else if (searchMap.get("groupId") != null && !searchMap.get("groupId").equals("")) {
                Criteria criteria = new Criteria("jo_keywords").is(searchMap.get("keywords"));
                Crotch crotch = criteria.and("jo_groupId").is(searchMap.get("groupId"));
                query.addCriteria(crotch);
            } else {
                //不存在就根据关键字搜索
                Criteria criteria = new Criteria("jo_keywords").is(searchMap.get("keywords"));
                query.addCriteria(criteria);
            }
            //高级搜索
            if (searchMap.get("group1") != null && searchMap.get("group1").equals(0)) {
                Criteria criteria = null;
                StringBuilder builder = new StringBuilder("");
                //判断输入框是否有数据
                StringBuilder gao1 = builder.append("\"").append(searchMap.get("gao1")).append("\"");
                if(searchMap.get("gao")!=null&&!searchMap.get("gao").equals("")){
                    //字符处理
                    String keywords = (String) searchMap.get("gao");
                    keywords= Pattern.compile(regEx).matcher(keywords).replaceAll("").trim();//关键字去掉字符\

                    criteria = new Criteria("jo_keywords").is(keywords);
                }
                //判断对象是否有数据
                if(criteria == null){
                    String keywords = gao1.toString();
                    //字符处理
                    keywords= Pattern.compile(regEx).matcher(keywords).replaceAll("").trim();//关键字去掉字符\


                    criteria = new Criteria("jo_keywords").is(keywords);
                }else{
                    String keywords = gao1.toString();
                    //字符处理
                    keywords= Pattern.compile(regEx).matcher(keywords).replaceAll("").trim();//关键字去掉字符\

                    criteria.and("jo_keywords").is(keywords);
                }
                //判断输入框是否有数据
                if(searchMap.get("gao2")!=null&&!"".equals(searchMap.get("gao2"))){

                    String keywords = (String) searchMap.get("gao2");
                    //字符处理
                    keywords = Pattern.compile(regEx).matcher(keywords).replaceAll("").trim();//关键字去掉字符\
                  criteria.and("jo_keywords").is(keywords);
                }
                //判断不搜索的关键字是否为null或者空字符
                if(searchMap.get("gao3")!=null&&!"".equals(searchMap.get("gao3"))){
                    String keywords = (String) searchMap.get("gao3");
                    //字符处理
                    keywords = Pattern.compile(regEx).matcher(keywords).replaceAll("").trim();
                    Criteria criteria1 = criteria.not().is(searchMap.get("gao3"));
                } else if (searchMap.get("layoutname") !=null&&!"".equals(searchMap.get("layoutname"))&&!searchMap.get("layoutname").equals("请选择")) {
                    //是否选择栏目
                    StringBuilder builder1 = new StringBuilder("");
                    StringBuilder cro = builder1.append("\"").append(searchMap.get("layoutname")).append("\"");
                    Crotch crotch3 = criteria.and("jo_name").is(cro);
                    query.addCriteria(crotch3);

                 //判断是否根据标题搜索
                }else if (searchMap.get("title1") != null && "1".equals(searchMap.get("title1"))) {
                        //让输入框的数据根据标题搜索
                    Criteria criteria1=null;
                    //判断第一个数据框是否有数据
                    if(searchMap.get("gao")!=null&&!searchMap.get("gao").equals("")){
                        String keywords = (String) searchMap.get("gao");
                        //字符处理
                        keywords =  Pattern.compile(regEx).matcher(keywords).replaceAll("").trim();
                        criteria1 = new Criteria("jo_title").is(keywords);
                    }
                    //判断对象是否为null
                    if(criteria1==null){
                        //字符处理
                        Pattern.compile(regEx).matcher(gao1).replaceAll("").trim();
                        criteria1=new Criteria("jo_title").is(gao1);
                    }else{
                        //字符处理
                        Pattern.compile(regEx).matcher(gao1).replaceAll("").trim();
                        criteria1.and("jo_title").is(gao1);
                    }
                    //判断第三个输入框是否有数据
                    if(searchMap.get("gao2")!=null&&!searchMap.get("gao2").equals("")){
                        String keywords = (String) searchMap.get("gao2");
                        //字符处理
                        keywords =  Pattern.compile(regEx).matcher(keywords).replaceAll("").trim();
                        criteria1.and("jo_title").is(keywords);
                    }
                    //判断最后的输入框是否有数据
                    if(searchMap.get("gao3")!=null&&!searchMap.get("gao3").equals("")){

                        String keywords = (String) searchMap.get("gao3");
                        //字符处理
                        keywords = Pattern.compile(regEx).matcher(keywords).replaceAll("").trim();
                      criteria1.not().is(keywords);
                    }
                    //拼接站点id
                    Crotch crotch = criteria1.and("jo_groupId").is(searchMap.get("groupId"));
                    query.addCriteria(crotch);
                    }
                }

            //判断用户选择的时间字段
            String time = (String) searchMap.get("time");
            if (time != null && time != "" && time.equals("一周内")) {
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.WEEK_OF_MONTH, -1);//一周内
                Date pastDate = calendar.getTime();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'16:00:00'Z'");
                StringBuilder builder = new StringBuilder("");
                builder.append("[" + sdf.format(pastDate) + " TO " + sdf.format(new Date()) + "]");
                Criteria criteria = new Criteria("jo_createdate").is(builder);

                query.addCriteria(criteria);
            }
            if (time != null && time != "" && "一月内".equals(time)) {
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.MONTH, -1);//一月内
                Date pastDate = calendar.getTime();

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'16:00:00'Z'");
                StringBuilder builder = new StringBuilder("");
                builder.append("[" + sdf.format(pastDate) + " TO " + sdf.format(new Date()) + "]");
                Criteria criteria = new Criteria("jo_createdate").is(builder);
                query.addCriteria(criteria);
            }


            if (time != null && time != "" && time.equals("一年内")) {
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.YEAR, -1);//一年
                Date pastDate = calendar.getTime();

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'16:00:00'Z'");


                StringBuilder builder = new StringBuilder("");
                builder.append("[" + sdf.format(pastDate) + " TO " + sdf.format(new Date()) + "]");
                Criteria criteria = new Criteria("jo_createdate").is(builder);
                query.addCriteria(criteria);
            }

            // 分页
            Integer pageNo = (Integer) searchMap.get("pageNo");//获取页码
            if (pageNo == null) {
                pageNo = 1;
            }
            Integer pageSize = (Integer) searchMap.get("pageSize");//获取页大小
            if (pageSize == null) {
                pageSize = 10;
            }
            query.setOffset((pageNo - 1) * pageSize);//起始索引
            query.setRows(pageSize);//每页记录数
            //按时间排序
            String sortValue = (String) searchMap.get("sort");//ASC DESC
            String sortField = (String) searchMap.get("sortField");//排序字段
            if (sortValue != null && !sortValue.equals("")) {
                if (sortValue.equals("ASC")) {
                    Sort sort = new Sort(Sort.Direction.ASC, "jo_" + sortField);
                    query.addSort(sort);
                }
                if (sortValue.equals("DESC")) {
                    Sort sort = new Sort(Sort.Direction.DESC, "jo_" + sortField);
                    query.addSort(sort);
                }
            }


            //***********  获取高亮结果集  ***********
            HighlightPage<Journalarticle> page = solrTemplate.queryForHighlightPage(query, Journalarticle.class);
            //获取高亮入口集合
            List<HighlightEntry<Journalarticle>> highlighted = page.getHighlighted();
            for (HighlightEntry<Journalarticle> entry : highlighted) {
                //获取高亮列表
                List<Highlight> highlights = entry.getHighlights();

                if (highlights.size() > 0 && highlights.get(0).getSnipplets().size() > 0) {
                    //获取每一个高亮数据
                    Journalarticle entity = entry.getEntity();
                    //设置高亮选项
                    entity.setContent(highlights.get(0).getSnipplets().get(0));
                }
            }
            map.put("rows", page.getContent());

            //高亮选项初始化
            HighlightQuery query1 = new SimpleHighlightQuery();
            //设置高亮显示
            HighlightOptions options1 = new HighlightOptions();

            options1.addField("cmg_title");
//        //设置高亮前后缀
            options1.setSimplePrefix("<em style='color:red'>");
            options1.setSimplePostfix("</em>");
            //设置高亮选项
            query1.setHighlightOptions(options1);

            // 关键字查询和站点查询
            String title = (String) searchMap.get("title");
            //是否点击标题查询
            if (title != null && title != "" && title.equals("2")) {
                //点击标题后 站点是否存在
                if (searchMap.get("groupId") == null || "".equals(searchMap.get("groupId"))) {
                    Criteria criteria = new Criteria("cmg_title").is(searchMap.get("keywords"));
                    query1.addCriteria(criteria);
                } else {
                    Criteria criteria1 = new Criteria("cmg_title").is(searchMap.get("keywords"));
                    Crotch crotch1 = criteria1.and("cmg_groupid").is(searchMap.get("groupId"));
                    query1.addCriteria(crotch1);
                }

            } else if (searchMap.get("groupId") != null && !searchMap.get("groupId").equals("")) {
                Criteria criteria = new Criteria("cmg_keywords").is(searchMap.get("keywords"));
                Crotch crotch = criteria.and("cmg_groupid").is(searchMap.get("groupId"));
                query1.addCriteria(crotch);
            } else {
                Criteria criteria = new Criteria("cmg_keywords").is(searchMap.get("keywords"));
                query1.addCriteria(criteria);
            }

            // 分页
            Integer pageNo1 = (Integer) searchMap.get("pageNo");//获取页码
            if (pageNo1 == null) {
                pageNo1 = 1;
            }
            Integer pageSize1 = (Integer) searchMap.get("pageSize");//获取页大小
            if (pageSize1 == null) {
                pageSize1 = 3;
            }
            query1.setOffset((pageNo1 - 1) * pageSize1);//起始索引
            query1.setRows(pageSize1);//每页记录数
            //***********  获取高亮结果集  ***********
            HighlightPage<CmsGovaffairsimportrecord> page1 = solrTemplate.queryForHighlightPage(query1, CmsGovaffairsimportrecord.class);
            //获取高亮入口集合
            List<HighlightEntry<CmsGovaffairsimportrecord>> highlighted1 = page1.getHighlighted();
            for (HighlightEntry<CmsGovaffairsimportrecord> entry : highlighted1) {
                //获取高亮列表
                List<HighlightEntry.Highlight> highlights = entry.getHighlights();

                if (highlights.size() > 0 && highlights.get(0).getSnipplets().size() > 0) {
                    CmsGovaffairsimportrecord entity = entry.getEntity();
                    entity.setTitle(highlights.get(0).getSnipplets().get(0));
                }

            }
            map.put("row", page1.getContent());

            HighlightQuery highlightQuery = new SimpleHighlightQuery();
            HighlightOptions highlightOptions = new HighlightOptions();

            highlightOptions.addField("hw_content");
//        //设置高亮前后缀
            highlightOptions.setSimplePrefix("<em style='color:red'>");
            highlightOptions.setSimplePostfix("</em>");
            //设置高亮选项
            highlightQuery.setHighlightOptions(highlightOptions);

            // 关键字查询和站点查询
            String title1 = (String) searchMap.get("title");
            //是否点击标题查询
            if (title1 != null && title1 != "" && title1.equals("2")) {
                //点击标题后 站点是否存在
                if (searchMap.get("groupId") == null && "".equals(searchMap.get("groupId"))) {
                    Criteria criteria = new Criteria("hw_title").is(searchMap.get("keywords"));
                    highlightQuery.addCriteria(criteria);
                } else {
                    Criteria criteria1 = new Criteria("hw_title").is(searchMap.get("keywords"));
                    Crotch crotch1 = criteria1.and("hw_group").is(searchMap.get("groupId"));
                    highlightQuery.addCriteria(crotch1);
                }
            } else if (searchMap.get("groupId") != null && !searchMap.get("groupId").equals("")) {
                Criteria criteria = new Criteria("hw_keywords").is(searchMap.get("keywords"));
                Crotch crotch = criteria.and("hw_group").is(searchMap.get("groupId"));
                highlightQuery.addCriteria(crotch);
            } else {
                Criteria criteria = new Criteria("hw_keywords").is(searchMap.get("keywords"));
                highlightQuery.addCriteria(criteria);
            }

            //g高级搜索
            if (searchMap.get("group1") != null && searchMap.get("group1").equals(0)) {
                StringBuilder builder = new StringBuilder("");

                StringBuilder gao1 = builder.append("\"").append(searchMap.get("gao1")).append("\"");
                Criteria criteria = new Criteria("hw_keywords").is(searchMap.get("gao"));
                Crotch jo_keywords = criteria.and("hw_keywords").is(gao1);
                Crotch crotch = jo_keywords.and("hw_keywords").is(searchMap.get("gao2"));
                if(searchMap.get("gao3")!=null&&!searchMap.get("gao3").equals("")){
                    Crotch crotch2 = crotch.not().is(searchMap.get("gao3"));
                    Crotch crotch1 = crotch2.and("hw_group").is(searchMap.get("groupId"));
                    if (searchMap.get("title1") != null && searchMap.get("title1").equals("1")) {

                        Criteria criteria1 = new Criteria("hw_title").is(searchMap.get("gao"));
                        Crotch jo_keywords1 = criteria1.and("hw_title").is(gao1);
                        Crotch crotch0 = jo_keywords1.and("hw_title").is(searchMap.get("gao2"));
                        if (searchMap.get("gao3")!=null&&!searchMap.get("gao3").equals("")){
                            Crotch crotch20 = crotch0.not().is(searchMap.get("gao3"));
                            Crotch crotch10 = crotch20.and("hw_group").is(searchMap.get("groupId"));
                            highlightQuery.addCriteria(crotch10);
                        }
                    }else {
                        highlightQuery.addCriteria(crotch1);
                    }

                }



            }

            // 分页
            Integer pageNo2 = (Integer) searchMap.get("pageNo");//获取页码
            if (pageNo2 == null) {
                pageNo2 = 1;
            }
            Integer pageSize2 = (Integer) searchMap.get("pageSize");//获取页大小
            if (pageSize2 == null) {
                pageSize2 = 3;
            }
            highlightQuery.setOffset((pageNo2 - 1) * pageSize2);//起始索引
            highlightQuery.setRows(pageSize2);//每页记录数

            String sort0 = (String) searchMap.get("sort");//ASC DESC
            String sortField1 = (String) searchMap.get("sortField");//排序字段

            if (sort0 != null && !sort0.equals("")) {
                if (sort0.equals("ASC")) {
                    Sort sort = new Sort(Sort.Direction.ASC, "hw_time");
                    highlightQuery.addSort(sort);
                }
                if (sort0 != null&&sort0.equals("DESC")) {
                    Sort sort = new Sort(Sort.Direction.DESC, "hw_time");
                    highlightQuery.addSort(sort);
                }
            }

//按时间搜索
            String time1 = (String) searchMap.get("time");
            if (time1 != null && time1 != "" && time1.equals("一周内")) {
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.WEEK_OF_MONTH, -1);//一周内
                Date pastDate = calendar.getTime();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'16:00:00'Z'");
                StringBuilder builder = new StringBuilder("");
                builder.append("[" + sdf.format(pastDate) + " TO " + sdf.format(new Date()) + "]");
                Criteria criteria = new Criteria("hw_time").is(builder);

                highlightQuery.addCriteria(criteria);
            }
            if (time1 != null && time1 != "" && time1.equals("一月内")) {
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.MONTH, -1);//一月内
                Date pastDate = calendar.getTime();

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'16:00:00'Z'");
                StringBuilder builder = new StringBuilder("");
                builder.append("[" + sdf.format(pastDate) + " TO " + sdf.format(new Date()) + "]");
                Criteria criteria = new Criteria("hw_time").is(builder);
                highlightQuery.addCriteria(criteria);
            }


            if (time != null && time != "" && time.equals("一年内")) {
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.YEAR, -1);//一年
                Date pastDate = calendar.getTime();

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'16:00:00'Z'");


                StringBuilder builder = new StringBuilder("");
                builder.append("[" + sdf.format(pastDate) + " TO " + sdf.format(new Date()) + "]");
                Criteria criteria = new Criteria("hw_time").is(builder);
                highlightQuery.addCriteria(criteria);
            }


            //***********  获取高亮结果集  ***********
            HighlightPage<HwadeeSuggest> page2 = solrTemplate.queryForHighlightPage(highlightQuery, HwadeeSuggest.class);
            //获取高亮入口集合
            List<HighlightEntry<HwadeeSuggest>> highlighted2 = page2.getHighlighted();
            for (HighlightEntry<HwadeeSuggest> entry : highlighted2) {
                //获取高亮列表
                List<HighlightEntry.Highlight> highlights = entry.getHighlights();

                if (highlights.size() > 0 && highlights.get(0).getSnipplets().size() > 0) {
                    HwadeeSuggest entity = entry.getEntity();
                    entity.setContent(highlights.get(0).getSnipplets().get(0));
                }
            }
            map.put("su", page2.getContent());

            HighlightQuery query2 = new SimpleHighlightQuery();
            HighlightOptions options2 = new HighlightOptions();

            options2.addField("hp_name");
//        //设置高亮前后缀
            options2.setSimplePrefix("<em style='color:red'>");
            options2.setSimplePostfix("</em>");
            //设置高亮选项
            query2.setHighlightOptions(options2);

            // 关键字查询和站点查询
            String title2 = (String) searchMap.get("title");
            //是否点击标题查询
            if (title2 != null && title2 != "" && title2.equals("2")) {

                Criteria criteria1 = new Criteria("hp_name").is(searchMap.get("keywords"));
                query2.addCriteria(criteria1);
            } else {
                Criteria criteria = new Criteria("hp_keywords").is(searchMap.get("keywords"));
                query2.addCriteria(criteria);
            }




            //g高级搜索
            if (searchMap.get("group1") != null && searchMap.get("group1").equals(0)) {
                StringBuilder builder = new StringBuilder("");

                StringBuilder gao1 = builder.append("\"").append(searchMap.get("gao1")).append("\"");
                Criteria criteria = new Criteria("hp_keywords").is(searchMap.get("gao"));
                Crotch jo_keywords = criteria.and("hp_keywords").is(gao1);
                Crotch crotch = jo_keywords.and("hp_keywords").is(searchMap.get("gao2"));
                if(searchMap.get("gao3")!=null&&!searchMap.get("gao3").equals("")){
                    Crotch crotch2 = crotch.not().is(searchMap.get("gao3"));

                    if (searchMap.get("title1") != null && searchMap.get("title1").equals("1")) {

                        Criteria criteria1 = new Criteria("hp_name").is(searchMap.get("gao"));
                        Crotch jo_keywords1 = criteria1.and("hp_name").is(gao1);
                        Crotch crotch0 = jo_keywords1.and("hp_name").is(searchMap.get("gao2"));
                        if(searchMap.get("gao3")!=null&&!searchMap.get("gao3").equals("")){
                            Crotch crotch20 = crotch0.not().is(searchMap.get("gao3"));
                            query2.addCriteria(crotch20);
                        }
                    } else {
                        query2.addCriteria(crotch2);
                    }
                }

            }

            // 分页
            Integer pageNo3 = (Integer) searchMap.get("pageNo");//获取页码
            if (pageNo3== null) {
                pageNo3 = 1;
            }
            Integer pageSize3 = (Integer) searchMap.get("pageSize");//获取页大小
            if (pageSize3 == null) {
                pageSize3 = 3;
            }
            query2.setOffset((pageNo3 - 1) * pageSize3);//起始索引
            query2.setRows(pageSize3);//每页记录数


            //按时间排序
            String sor = (String) searchMap.get("sort");//ASC DESC

            if (sor != null && !sor.equals("")) {
                if (sor.equals("ASC")) {
                    Sort sort = new Sort(Sort.Direction.ASC, "hp_starttime");
                    query2.addSort(sort);
                }
                if (sor != null&&sor.equals("DESC")) {
                    Sort sort = new Sort(Sort.Direction.DESC, "hp_starttime");
                    query2.addSort(sort);
                }
            }

//按时间搜索
            String time2 = (String) searchMap.get("time");
            if (time2 != null && time2 != "" && time2.equals("一周内")) {
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.WEEK_OF_MONTH, -1);//一周内
                Date pastDate = calendar.getTime();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'16:00:00'Z'");
                StringBuilder builder = new StringBuilder("");
                builder.append("[" + sdf.format(pastDate) + " TO " + sdf.format(new Date()) + "]");
                Criteria criteria = new Criteria("hp_starttime").is(builder);

                query2.addCriteria(criteria);
            }
            if (time2 != null && time2 != "" && time2.equals("一月内")) {
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.MONTH, -1);//一月内
                Date pastDate = calendar.getTime();

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'16:00:00'Z'");
                StringBuilder builder = new StringBuilder("");
                builder.append("[" + sdf.format(pastDate) + " TO " + sdf.format(new Date()) + "]");
                Criteria criteria = new Criteria("hp_starttime").is(builder);
                query2.addCriteria(criteria);
            }


            if (time != null && time != "" && time.equals("一年内")) {
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.YEAR, -1);//一年
                Date pastDate = calendar.getTime();

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'16:00:00'Z'");


                StringBuilder builder = new StringBuilder("");
                builder.append("[" + sdf.format(pastDate) + " TO " + sdf.format(new Date()) + "]");
                Criteria criteria = new Criteria("hp_starttime").is(builder);
                query2.addCriteria(criteria);
            }
            //***********  获取高亮结果集  ***********
            HighlightPage<HwadeePolls> page3 = solrTemplate.queryForHighlightPage(query2, HwadeePolls.class);
            //获取高亮入口集合
            List<HighlightEntry<HwadeePolls>> highlighted3 = page3.getHighlighted();
            for (HighlightEntry<HwadeePolls> entry : highlighted3) {
                //获取高亮列表
                List<HighlightEntry.Highlight> highlights = entry.getHighlights();

                if (highlights.size() > 0 && highlights.get(0).getSnipplets().size() > 0) {
                    HwadeePolls entity = entry.getEntity();
                    entity.setName(highlights.get(0).getSnipplets().get(0));
                }
            }
            map.put("hp", page3.getContent());


            HighlightQuery queryhv = new SimpleHighlightQuery();
            HighlightOptions optionshv = new HighlightOptions();


            optionshv.addField("hv_remark");
//        //设置高亮前后缀
            optionshv.setSimplePrefix("<em style='color:red'>");
            optionshv.setSimplePostfix("</em>");
            //设置高亮选项
            queryhv.setHighlightOptions(optionshv);

            // 关键字查询和站点查询
            String title0 = (String) searchMap.get("title");
            //是否点击标题查询
            if (title0 != null && title0 != "" && title0.equals("2")) {
                //点击标题后 站点是否存在
                if (searchMap.get("groupId") == null || searchMap.get("groupId").equals("")) {
                    Criteria criteria = new Criteria("hv_onlinetitle").is(searchMap.get("keywords"));
                    queryhv.addCriteria(criteria);
                } else {
                    Criteria criteria1 = new Criteria("hv_onlinetitle").is(searchMap.get("keywords"));
                    Crotch crotch1 = criteria1.and("hv_groupid").is(searchMap.get("groupId"));
                    queryhv.addCriteria(crotch1);
                }
            } else if (searchMap.get("groupId") != null && !searchMap.get("groupId").equals("")) {
                Criteria criteria = new Criteria("hv_keywords").is(searchMap.get("keywords"));
                Crotch crotch = criteria.and("hv_groupid").is(searchMap.get("groupId"));
                queryhv.addCriteria(crotch);
            } else {
                Criteria criteria = new Criteria("hv_keywords").is(searchMap.get("keywords"));
                queryhv.addCriteria(criteria);
            }
            // 分页
            Integer pageNo0 = (Integer) searchMap.get("pageNo");//获取页码
            if (pageNo0== null) {
                pageNo0 = 1;
            }
            Integer pageSize0 = (Integer) searchMap.get("pageSize");//获取页大小
            if (pageSize0 == null) {
                pageSize0 = 10;
            }
            queryhv.setOffset((pageNo - 1) * pageSize);//起始索引
            queryhv.setRows(pageSize);//每页记录数

            String date = (String) searchMap.get("sort");//ASC DESC

            if (date != null && !date.equals("")) {
                if (date.equals("ASC")) {
                    Sort sort = new Sort(Sort.Direction.ASC, "hv_onlinetime");
                    queryhv.addSort(sort);
                }
                if (date != null&&date.equals("DESC")) {
                    Sort sort = new Sort(Sort.Direction.DESC, "hv_onlinetime");
                    queryhv.addSort(sort);
                }
            }

            //按时间搜索
            String time0 = (String) searchMap.get("time");
            if (time2 != null && time2 != "" && time2.equals("一周内")) {
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.WEEK_OF_MONTH, -1);//一周内
                Date pastDate = calendar.getTime();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'16:00:00'Z'");
                StringBuilder builder = new StringBuilder("");
                builder.append("[" + sdf.format(pastDate) + " TO " + sdf.format(new Date()) + "]");
                Criteria criteria = new Criteria("hv_onlinetime").is(builder);

                queryhv.addCriteria(criteria);
            }
            if (time2 != null && time2 != "" && time2.equals("一月内")) {
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.MONTH, -1);//一月内
                Date pastDate = calendar.getTime();

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'16:00:00'Z'");
                StringBuilder builder = new StringBuilder("");
                builder.append("[" + sdf.format(pastDate) + " TO " + sdf.format(new Date()) + "]");
                Criteria criteria = new Criteria("hv_onlinetime").is(builder);
                queryhv.addCriteria(criteria);
            }


            if (time2!= null && time2 != "" && time2.equals("一年内")) {
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.YEAR, -1);//一年
                Date pastDate = calendar.getTime();

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'16:00:00'Z'");


                StringBuilder builder = new StringBuilder("");
                builder.append("[" + sdf.format(pastDate) + " TO " + sdf.format(new Date()) + "]");
                Criteria criteria = new Criteria("hv_onlinetime").is(builder);
                queryhv.addCriteria(criteria);
            }



            //***********  获取高亮结果集  ***********
            HighlightPage<HwadeeInterviewnotice> page0 = solrTemplate.queryForHighlightPage(queryhv, HwadeeInterviewnotice.class);
            //获取高亮入口集合
            List<HighlightEntry<HwadeeInterviewnotice>> highlighted0 = page0.getHighlighted();
            for (HighlightEntry<HwadeeInterviewnotice> entry : highlighted0) {
                //获取高亮列表
                List<HighlightEntry.Highlight> highlights = entry.getHighlights();

                if (highlights.size() > 0 && highlights.get(0).getSnipplets().size() > 0) {
                    HwadeeInterviewnotice entity = entry.getEntity();
                    entity.setRemark(highlights.get(0).getSnipplets().get(0));
                }
            }
            map.put("hv", page0.getContent());

            HighlightQuery queryma = new SimpleHighlightQuery();
            HighlightOptions optionsma = new HighlightOptions();
            optionsma.addField("ma_content");

            optionsma.setSimplePrefix("<em style='color:red'>");
            optionsma.setSimplePostfix("</em>");

            //设置高亮选项
            queryma.setHighlightOptions(optionsma);
            // 关键字查询和站点查询
            String titlema = (String) searchMap.get("title");
            //是否点击标题查询
            if (title0 != null && title0 != "" && title0.equals("2")) {
                //点击标题后 站点是否存在
                if (searchMap.get("groupId") == null || searchMap.get("groupId").equals("")) {
                    Criteria criteria = new Criteria("ma_title").is(searchMap.get("keywords"));
                    queryma.addCriteria(criteria);
                } else {
                    Criteria criteria1 = new Criteria("ma_title").is(searchMap.get("keywords"));
                    Crotch crotch1 = criteria1.and("ma_groupId").is(searchMap.get("groupId"));
                    queryma.addCriteria(crotch1);
                }
            } else if (searchMap.get("groupId") != null && !searchMap.get("groupId").equals("")) {
                Criteria criteria = new Criteria("ma_keywords").is(searchMap.get("keywords"));
                Crotch crotch = criteria.and("ma_groupId").is(searchMap.get("groupId"));
                queryma.addCriteria(crotch);
            } else {
                Criteria criteria = new Criteria("ma_keywords").is(searchMap.get("keywords"));
                queryma.addCriteria(criteria);
            }
            // 分页
            Integer pageNoma = (Integer) searchMap.get("pageNo");//获取页码
            if (pageNoma== null) {
                pageNoma = 1;
            }
            Integer pageSizema = (Integer) searchMap.get("pageSize");//获取页大小
            if (pageSizema == null) {
                pageSizema = 10;
            }
            queryma.setOffset((pageNo - 1) * pageSize);//起始索引
            queryma.setRows(pageSize);//每页记录数

            String datema = (String) searchMap.get("sort");//ASC DESC

            if (date != null && !date.equals("")) {
                if (date.equals("ASC")) {
                    Sort sort = new Sort(Sort.Direction.ASC, "ma_msgDate");
                    queryma.addSort(sort);
                }
                if (date != null&&date.equals("DESC")) {
                    Sort sort = new Sort(Sort.Direction.DESC, "ma_msgDate");
                    queryma.addSort(sort);
                }
            }

            //按时间搜索
            String timema = (String) searchMap.get("time");
            if (timema != null && timema != "" && timema.equals("一周内")) {
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.WEEK_OF_MONTH, -1);//一周内
                Date pastDate = calendar.getTime();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'16:00:00'Z'");
                StringBuilder builder = new StringBuilder("");
                builder.append("[" + sdf.format(pastDate) + " TO " + sdf.format(new Date()) + "]");
                Criteria criteria = new Criteria("ma_msgDate").is(builder);

                queryma.addCriteria(criteria);
            }
            if (timema != null && timema != "" && timema.equals("一月内")) {
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.MONTH, -1);//一月内
                Date pastDate = calendar.getTime();

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'16:00:00'Z'");
                StringBuilder builder = new StringBuilder("");
                builder.append("[" + sdf.format(pastDate) + " TO " + sdf.format(new Date()) + "]");
                Criteria criteria = new Criteria("ma_msgDate").is(builder);
                queryma.addCriteria(criteria);
            }


            if (time2!= null && time2 != "" && time2.equals("一年内")) {
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.YEAR, -1);//一年
                Date pastDate = calendar.getTime();

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'16:00:00'Z'");


                StringBuilder builder = new StringBuilder("");
                builder.append("[" + sdf.format(pastDate) + " TO " + sdf.format(new Date()) + "]");
                Criteria criteria = new Criteria("ma_msgDate").is(builder);
                queryma.addCriteria(criteria);
            }



            //***********  获取高亮结果集  ***********
            HighlightPage<HwadeeMailbox> pagema = solrTemplate.queryForHighlightPage(queryma, HwadeeMailbox.class);
            //获取高亮入口集合
            List<HighlightEntry<HwadeeMailbox>> highlightedma= pagema.getHighlighted();
            for (HighlightEntry<HwadeeMailbox> entry : highlightedma) {
                //获取高亮列表
                List<HighlightEntry.Highlight> highlights = entry.getHighlights();

                if (highlights.size() > 0 && highlights.get(0).getSnipplets().size() > 0) {
                    HwadeeMailbox entity = entry.getEntity();
                    entity.setContent(highlights.get(0).getSnipplets().get(0));
                }
            }
            map.put("ma", pagema.getContent());

            map.put("totalPages",pagema.getTotalPages()+page0.getTotalPages()+ page.getTotalPages()+page2.getTotalPages()+page3.getTotalElements()+page1.getTotalPages());//返回总页数
            map.put("total",pagema.getTotalElements()+page0.getTotalElements()+ page.getTotalElements()+page2.getTotalElements()+page1.getTotalElements()+page3.getTotalElements());//返回总记录数

            return map;


            
        }

        if(searchMap.get("group").equals("政务公开")){

            HighlightQuery query = new SimpleHighlightQuery();
            //设置高亮显示
            HighlightOptions options = new HighlightOptions();
            // options.addField("jo_title");
            options.addField("jo_content");
//        //设置高亮前后缀
            options.setSimplePrefix("<em style='color:red'>");
            options.setSimplePostfix("</em>");
            //设置高亮选项
            query.setHighlightOptions(options);

            // 关键字查询和站点查询

            String o1 = (String) searchMap.get("title");
            //是否点击标题查询
            if (o1 != null && o1 != "" && o1.equals("2")) {
                //点击标题后 站点是否存在
                if (searchMap.get("groupId") == null || searchMap.get("groupId").equals("")) {
                    Criteria criteria = new Criteria("jo_title").is(searchMap.get("keywords"));
                    query.addCriteria(criteria);
                } else {
                    Criteria criteria1 = new Criteria("jo_title").is(searchMap.get("keywords"));
                    Crotch crotch1 = criteria1.and("jo_groupId").is(searchMap.get("groupId"));
                    query.addCriteria(crotch1);
                }

            } else if (searchMap.get("groupId") != null && !searchMap.get("groupId").equals("")) {
                Criteria criteria = new Criteria("jo_keywords").is(searchMap.get("keywords"));
                Crotch crotch = criteria.and("jo_groupId").is(searchMap.get("groupId"));
                query.addCriteria(crotch);
            } else {
                Criteria criteria = new Criteria("jo_keywords").is(searchMap.get("keywords"));
                query.addCriteria(criteria);
            }

            // 分页
            Integer pageNo = (Integer) searchMap.get("pageNo");//获取页码
            if (pageNo == null) {
                pageNo = 1;
            }
            Integer pageSize = (Integer) searchMap.get("pageSize");//获取页大小
            if (pageSize == null) {
                pageSize = 10;
            }
            query.setOffset((pageNo - 1) * pageSize);//起始索引
            query.setRows(pageSize);//每页记录数
            //按时间排序
            String sortValue = (String) searchMap.get("sort");//ASC DESC
            String sortField = (String) searchMap.get("sortField");//排序字段
            if (sortValue != null && !sortValue.equals("")) {
                if (sortValue.equals("ASC")) {
                    Sort sort = new Sort(Sort.Direction.ASC, "jo_" + sortField);
                    query.addSort(sort);
                }
                if (sortValue.equals("DESC")) {
                    Sort sort = new Sort(Sort.Direction.DESC, "jo_" + sortField);
                    query.addSort(sort);
                }
            }
            String time = (String) searchMap.get("time");
            if(time !=null&& time!=""&&time.equals("一周内")){
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.WEEK_OF_MONTH,-1);//一周内
                Date pastDate = calendar.getTime();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'16:00:00'Z'");
                StringBuilder builder=new StringBuilder("");
                builder.append("["+sdf.format(pastDate)+" TO "+ sdf.format(new Date())+"]");
                Criteria criteria = new Criteria("jo_createdate").is(builder);

                query.addCriteria(criteria);
            } if(time !=null&& time!=""&&time.equals("一月内")){
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.MONTH, -1);//一月内
                Date pastDate = calendar.getTime();

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'16:00:00'Z'");
                StringBuilder builder=new StringBuilder("");
                builder.append("["+sdf.format(pastDate)+" TO "+ sdf.format(new Date())+"]");
                Criteria criteria = new Criteria("jo_createdate").is(builder);
                query.addCriteria(criteria);
            }
            if(time !=null&& time!=""&&time.equals("一年内")){
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.YEAR, -1);//一年
                Date pastDate = calendar.getTime();

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'16:00:00'Z'");


                StringBuilder builder=new StringBuilder("");
                builder.append("["+sdf.format(pastDate)+" TO "+ sdf.format(new Date())+"]");
                Criteria criteria = new Criteria("jo_createdate").is(builder);
                query.addCriteria(criteria);
            }
            //高级搜索
            if(searchMap.get("group1")!=null&&searchMap.get("group1").equals("高级搜索")){
                StringBuilder builder=new StringBuilder("");

                StringBuilder gao1 = builder.append("\"").append(searchMap.get("gao1")).append("\"");


                Criteria criteria=new Criteria("jo_keywords").is(searchMap.get("gao"));
                Crotch jo_keywords = criteria.and("jo_keywords").is(gao1);
                Crotch crotch = jo_keywords.and("jo_keywords").is(searchMap.get("gao2"));
                if(searchMap.get("gao3")!=null&&!searchMap.get("gao3").equals("")){
                    Crotch crotch2 = crotch.not().is(searchMap.get("gao3"));
                    Crotch crotch1 = crotch2.and("jo_groupId").is(searchMap.get("groupId"));

                    query.addCriteria(crotch1);
                }

            }



            //***********  获取高亮结果集  ***********

            HighlightPage<Journalarticle> page = solrTemplate.queryForHighlightPage(query, Journalarticle.class);

            //获取高亮入口集合
            List<HighlightEntry<Journalarticle>> highlighted = page.getHighlighted();
            for (HighlightEntry<Journalarticle> entry : highlighted) {
                //获取高亮列表
                List<Highlight> highlights = entry.getHighlights();

                if (highlights.size() > 0 && highlights.get(0).getSnipplets().size() > 0) {
                    Journalarticle entity = entry.getEntity();
                    entity.setContent(highlights.get(0).getSnipplets().get(0));
                }
            }
            map.put("rows", page.getContent());
            map.put("totalPages", page.getTotalPages());//返回总页数
            map.put("total", page.getTotalElements());//返回总记录数
            return map;

        }
        if (searchMap.get("group").equals("政务服务")) {

            //高亮选项初始化
            HighlightQuery query1 = new SimpleHighlightQuery();
            //设置高亮显示
            HighlightOptions options1 = new HighlightOptions();

            options1.addField("cmg_title");
//        //设置高亮前后缀
            options1.setSimplePrefix("<em style='color:red'>");
            options1.setSimplePostfix("</em>");
            //设置高亮选项
            query1.setHighlightOptions(options1);

            // 关键字查询和站点查询
            String title = (String) searchMap.get("title");
            //是否点击标题查询
            if (title != null && title != "" && title.equals("2")) {
                //点击标题后 站点是否存在
                if (searchMap.get("groupId") == null || searchMap.get("groupId").equals("")) {
                    Criteria criteria = new Criteria("cmg_title").is(searchMap.get("keywords"));
                    query1.addCriteria(criteria.and(""));
                } else {
                    Criteria criteria1 = new Criteria("cmg_title").is(searchMap.get("keywords"));
                    Crotch crotch1 = criteria1.and("cmg_groupid").is(searchMap.get("groupId"));
                    query1.addCriteria(crotch1);
                }

            } else if (searchMap.get("groupId") != null && !searchMap.get("groupId").equals("")) {
                Criteria criteria = new Criteria("cmg_keywords").is(searchMap.get("keywords"));
                Crotch crotch = criteria.and("cmg_groupid").is(searchMap.get("groupId"));
                query1.addCriteria(crotch);
            } else {
                Criteria criteria = new Criteria("cmg_keywords").is(searchMap.get("keywords"));
                query1.addCriteria(criteria);
            }

            String serviceType = (String)searchMap.get("serviceType");
            if (StringUtils.isNotEmpty(serviceType) && !"不限".equals(serviceType)) {
                Criteria criteria = new Criteria("cmg_gatype").is(serviceType.substring(0,2));
                query1.addCriteria(criteria);
            }

            // 分页
            Integer pageNo = (Integer) searchMap.get("pageNo");//获取页码
            if (pageNo == null) {
                pageNo = 1;
            }
            Integer pageSize = (Integer) searchMap.get("pageSize");//获取页大小
            if (pageSize == null) {
                pageSize = 10;
            }
            query1.setOffset((pageNo - 1) * pageSize);//起始索引
            query1.setRows(pageSize);//每页记录数
            //***********  获取高亮结果集  ***********
            HighlightPage<CmsGovaffairsimportrecord> page1 = solrTemplate.queryForHighlightPage(query1, CmsGovaffairsimportrecord.class);
            //获取高亮入口集合
            List<HighlightEntry<CmsGovaffairsimportrecord>> highlighted1 = page1.getHighlighted();
            for (HighlightEntry<CmsGovaffairsimportrecord> entry : highlighted1) {
                //获取高亮列表
                List<HighlightEntry.Highlight> highlights = entry.getHighlights();

                if (highlights.size() > 0 && highlights.get(0).getSnipplets().size() > 0) {
                    CmsGovaffairsimportrecord entity = entry.getEntity();
                    entity.setTitle(highlights.get(0).getSnipplets().get(0));
                }

            }
            map.put("row", page1.getContent());
            map.put("totalPages", page1.getTotalPages());//返回总页数
            map.put("total", page1.getTotalElements());//返回总记录数
            return map;

        }
        if (searchMap.get("group").equals("政民互动")) {
            HighlightQuery highlightQuery = new SimpleHighlightQuery();
            HighlightOptions highlightOptions = new HighlightOptions();

            highlightOptions.addField("hw_content");
//        //设置高亮前后缀
            highlightOptions.setSimplePrefix("<em style='color:red'>");
            highlightOptions.setSimplePostfix("</em>");
            //设置高亮选项
            highlightQuery.setHighlightOptions(highlightOptions);

            // 关键字查询和站点查询
            String title1 = (String) searchMap.get("title");
            //是否点击标题查询
            if (title1 != null && title1 != "" && title1.equals("2")) {
                //点击标题后 站点是否存在
                if (searchMap.get("groupId") == null || searchMap.get("groupId").equals("")) {
                    Criteria criteria = new Criteria("hw_title").is(searchMap.get("keywords"));
                    highlightQuery.addCriteria(criteria);
                } else {
                    Criteria criteria1 = new Criteria("hw_title").is(searchMap.get("keywords"));
                    Crotch crotch1 = criteria1.and("hw_group").is(searchMap.get("groupId"));
                    highlightQuery.addCriteria(crotch1);
                }
            } else if (searchMap.get("groupId") != null && !searchMap.get("groupId").equals("")) {
                Criteria criteria = new Criteria("hw_keywords").is(searchMap.get("keywords"));
                Crotch crotch = criteria.and("hw_group").is(searchMap.get("groupId"));
                highlightQuery.addCriteria(crotch);
            } else {
                Criteria criteria = new Criteria("hw_keywords").is(searchMap.get("keywords"));
                highlightQuery.addCriteria(criteria);
            }

            String sort0 = (String) searchMap.get("sort");//ASC DESC
            String sortField1 = (String) searchMap.get("sortField");//排序字段

            if (sort0 != null && !sort0.equals("")) {
                if (sort0.equals("ASC")) {
                    Sort sort = new Sort(Sort.Direction.ASC, "hw_time");
                    highlightQuery.addSort(sort);
                }
                if (sort0.equals("DESC")) {
                    Sort sort = new Sort(Sort.Direction.DESC, "hw_time");
                    highlightQuery.addSort(sort);
                }
            }


          //按时间搜索
            String time1 = (String) searchMap.get("time");
            if (time1 != null && time1 != "" && time1.equals("一周内")) {
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.WEEK_OF_MONTH, -1);//一周内
                Date pastDate = calendar.getTime();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'16:00:00'Z'");
                StringBuilder builder = new StringBuilder("");
                builder.append("[" + sdf.format(pastDate) + " TO " + sdf.format(new Date()) + "]");
                Criteria criteria = new Criteria("hw_time").is(builder);

                highlightQuery.addCriteria(criteria);
            }
            if (time1 != null && time1 != "" && time1.equals("一月内")) {
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.MONTH, -1);//一月内
                Date pastDate = calendar.getTime();

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'16:00:00'Z'");
                StringBuilder builder = new StringBuilder("");
                builder.append("[" + sdf.format(pastDate) + " TO " + sdf.format(new Date()) + "]");
                Criteria criteria = new Criteria("hw_time").is(builder);
                highlightQuery.addCriteria(criteria);
            }


            if (time1 != null && time1 != "" && time1.equals("一年内")) {
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.YEAR, -1);//一年
                Date pastDate = calendar.getTime();

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'16:00:00'Z'");


                StringBuilder builder = new StringBuilder("");
                builder.append("[" + sdf.format(pastDate) + " TO " + sdf.format(new Date()) + "]");
                Criteria criteria = new Criteria("hw_time").is(builder);
                highlightQuery.addCriteria(criteria);
            }



            // 分页

            //***********  获取高亮结果集  ***********
            HighlightPage<HwadeeSuggest> page2 = solrTemplate.queryForHighlightPage(highlightQuery, HwadeeSuggest.class);
            //获取高亮入口集合
            List<HighlightEntry<HwadeeSuggest>> highlighted2 = page2.getHighlighted();
            for (HighlightEntry<HwadeeSuggest> entry : highlighted2) {
                //获取高亮列表
                List<HighlightEntry.Highlight> highlights = entry.getHighlights();

                if (highlights.size() > 0 && highlights.get(0).getSnipplets().size() > 0) {
                    HwadeeSuggest entity = entry.getEntity();
                    entity.setContent(highlights.get(0).getSnipplets().get(0));
                }
            }
            map.put("su", page2.getContent());


            HighlightQuery query = new SimpleHighlightQuery();
            HighlightOptions options = new HighlightOptions();

            options.addField("hp_name");
//        //设置高亮前后缀
            options.setSimplePrefix("<em style='color:red'>");
            options.setSimplePostfix("</em>");
            //设置高亮选项
            query.setHighlightOptions(options);

            // 关键字查询和站点查询
            String title = (String) searchMap.get("title");
            //是否点击标题查询
            if (title != null && title != "" && title.equals("2")) {

                Criteria criteria1 = new Criteria("hp_name").is(searchMap.get("keywords"));
                query.addCriteria(criteria1);
            } else {
                Criteria criteria = new Criteria("hp_keywords").is(searchMap.get("keywords"));
                query.addCriteria(criteria);
            }

            // 分页
            Integer pageNo = (Integer) searchMap.get("pageNo");//获取页码
            if (pageNo== null) {
                pageNo = 1;
            }
            Integer pageSize = (Integer) searchMap.get("pageSize");//获取页大小
            if (pageSize == null) {
                pageSize = 10;
            }
            query.setOffset((pageNo - 1) * pageSize);//起始索引
            query.setRows(pageSize);//每页记录数

            String sor = (String) searchMap.get("sort");//ASC DESC

            if (sor != null && !sor.equals("")) {
                if (sor.equals("ASC")) {
                    Sort sort = new Sort(Sort.Direction.ASC, "hp_starttime");
                    query.addSort(sort);
                }
                if (sor != null&&sor.equals("DESC")) {
                    Sort sort = new Sort(Sort.Direction.DESC, "hp_starttime");
                    query.addSort(sort);
                }
            }

          //按时间搜索
            String time2 = (String) searchMap.get("time");
            if (time2 != null && time2 != "" && time2.equals("一周内")) {
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.WEEK_OF_MONTH, -1);//一周内
                Date pastDate = calendar.getTime();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'16:00:00'Z'");
                StringBuilder builder = new StringBuilder("");
                builder.append("[" + sdf.format(pastDate) + " TO " + sdf.format(new Date()) + "]");
                Criteria criteria = new Criteria("hp_starttime").is(builder);

                query.addCriteria(criteria);
            }
            if (time2 != null && time2 != "" && time2.equals("一月内")) {
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.MONTH, -1);//一月内
                Date pastDate = calendar.getTime();

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'16:00:00'Z'");
                StringBuilder builder = new StringBuilder("");
                builder.append("[" + sdf.format(pastDate) + " TO " + sdf.format(new Date()) + "]");
                Criteria criteria = new Criteria("hp_starttime").is(builder);
                query.addCriteria(criteria);
            }


            if (time2!= null && time2 != "" && time2.equals("一年内")) {
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.YEAR, -1);//一年
                Date pastDate = calendar.getTime();

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'16:00:00'Z'");


                StringBuilder builder = new StringBuilder("");
                builder.append("[" + sdf.format(pastDate) + " TO " + sdf.format(new Date()) + "]");
                Criteria criteria = new Criteria("hp_starttime").is(builder);
                query.addCriteria(criteria);
            }


            //***********  获取高亮结果集  ***********
            HighlightPage<HwadeePolls> page = solrTemplate.queryForHighlightPage(query, HwadeePolls.class);
            //获取高亮入口集合
            List<HighlightEntry<HwadeePolls>> highlighted = page.getHighlighted();
            for (HighlightEntry<HwadeePolls> entry : highlighted) {
                //获取高亮列表
                List<HighlightEntry.Highlight> highlights = entry.getHighlights();

                if (highlights.size() > 0 && highlights.get(0).getSnipplets().size() > 0) {
                    HwadeePolls entity = entry.getEntity();
                    entity.setName(highlights.get(0).getSnipplets().get(0));
                }
            }
            map.put("hp", page.getContent());

            HighlightQuery queryhv = new SimpleHighlightQuery();
            HighlightOptions optionshv = new HighlightOptions();


            optionshv.addField("hv_remark");
//        //设置高亮前后缀
            optionshv.setSimplePrefix("<em style='color:red'>");
            optionshv.setSimplePostfix("</em>");
            //设置高亮选项
            queryhv.setHighlightOptions(optionshv);

            // 关键字查询和站点查询
            String title0 = (String) searchMap.get("title");
            //是否点击标题查询
            if (title0 != null && title0 != "" && title0.equals("2")) {
                //点击标题后 站点是否存在
                if (searchMap.get("groupId") == null || searchMap.get("groupId").equals("")) {
                    Criteria criteria = new Criteria("hv_onlinetitle").is(searchMap.get("keywords"));
                    queryhv.addCriteria(criteria);
                } else {
                    Criteria criteria1 = new Criteria("hv_onlinetitle").is(searchMap.get("keywords"));
                    Crotch crotch1 = criteria1.and("hv_groupid").is(searchMap.get("groupId"));
                    queryhv.addCriteria(crotch1);
                }
            } else if (searchMap.get("groupId") != null && !searchMap.get("groupId").equals("")) {
                Criteria criteria = new Criteria("hv_keywords").is(searchMap.get("keywords"));
                Crotch crotch = criteria.and("hv_groupid").is(searchMap.get("groupId"));
                queryhv.addCriteria(crotch);
            } else {
                Criteria criteria = new Criteria("hv_keywords").is(searchMap.get("keywords"));
                queryhv.addCriteria(criteria);
            }
            // 分页
            Integer pageNo0 = (Integer) searchMap.get("pageNo");//获取页码
            if (pageNo0== null) {
                pageNo0 = 1;
            }
            Integer pageSize0 = (Integer) searchMap.get("pageSize");//获取页大小
            if (pageSize0 == null) {
                pageSize0 = 10;
            }
            queryhv.setOffset((pageNo - 1) * pageSize);//起始索引
            queryhv.setRows(pageSize);//每页记录数

            String date = (String) searchMap.get("sort");//ASC DESC

            if (date != null && !date.equals("")) {
                if (date.equals("ASC")) {
                    Sort sort = new Sort(Sort.Direction.ASC, "hv_onlinetime");
                    queryhv.addSort(sort);
                }
                if (date != null&&date.equals("DESC")) {
                    Sort sort = new Sort(Sort.Direction.DESC, "hv_onlinetime");
                    queryhv.addSort(sort);
                }
            }

            //按时间搜索
            String time0 = (String) searchMap.get("time");
            if (time2 != null && time2 != "" && time2.equals("一周内")) {
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.WEEK_OF_MONTH, -1);//一周内
                Date pastDate = calendar.getTime();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'16:00:00'Z'");
                StringBuilder builder = new StringBuilder("");
                builder.append("[" + sdf.format(pastDate) + " TO " + sdf.format(new Date()) + "]");
                Criteria criteria = new Criteria("hv_onlinetime").is(builder);

                queryhv.addCriteria(criteria);
            }
            if (time2 != null && time2 != "" && time2.equals("一月内")) {
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.MONTH, -1);//一月内
                Date pastDate = calendar.getTime();

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'16:00:00'Z'");
                StringBuilder builder = new StringBuilder("");
                builder.append("[" + sdf.format(pastDate) + " TO " + sdf.format(new Date()) + "]");
                Criteria criteria = new Criteria("hv_onlinetime").is(builder);
                queryhv.addCriteria(criteria);
            }


            if (time2!= null && time2 != "" && time2.equals("一年内")) {
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.YEAR, -1);//一年
                Date pastDate = calendar.getTime();

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'16:00:00'Z'");


                StringBuilder builder = new StringBuilder("");
                builder.append("[" + sdf.format(pastDate) + " TO " + sdf.format(new Date()) + "]");
                Criteria criteria = new Criteria("hv_onlinetime").is(builder);
                queryhv.addCriteria(criteria);
            }



            //***********  获取高亮结果集  ***********
            HighlightPage<HwadeeInterviewnotice> page0 = solrTemplate.queryForHighlightPage(queryhv, HwadeeInterviewnotice.class);
            //获取高亮入口集合
            List<HighlightEntry<HwadeeInterviewnotice>> highlighted0 = page0.getHighlighted();
            for (HighlightEntry<HwadeeInterviewnotice> entry : highlighted0) {
                //获取高亮列表
                List<HighlightEntry.Highlight> highlights = entry.getHighlights();

                if (highlights.size() > 0 && highlights.get(0).getSnipplets().size() > 0) {
                    HwadeeInterviewnotice entity = entry.getEntity();
                    entity.setRemark(highlights.get(0).getSnipplets().get(0));
                }
            }
            map.put("hv", page0.getContent());

            HighlightQuery queryma = new SimpleHighlightQuery();
            HighlightOptions optionsma = new HighlightOptions();
            optionsma.addField("ma_content");

            optionsma.setSimplePrefix("<em style='color:red'>");
            optionsma.setSimplePostfix("</em>");

            //设置高亮选项
            queryma.setHighlightOptions(optionsma);
            // 关键字查询和站点查询
            String titlema = (String) searchMap.get("title");
            //是否点击标题查询
            if (title0 != null && title0 != "" && title0.equals("2")) {
                //点击标题后 站点是否存在
                if (searchMap.get("groupId") == null || searchMap.get("groupId").equals("")) {
                    Criteria criteria = new Criteria("ma_title").is(searchMap.get("keywords"));
                    queryma.addCriteria(criteria);
                } else {
                    Criteria criteria1 = new Criteria("ma_title").is(searchMap.get("keywords"));
                    Crotch crotch1 = criteria1.and("ma_groupId").is(searchMap.get("groupId"));
                    queryma.addCriteria(crotch1);
                }
            } else if (searchMap.get("groupId") != null && !searchMap.get("groupId").equals("")) {
                Criteria criteria = new Criteria("ma_keywords").is(searchMap.get("keywords"));
                Crotch crotch = criteria.and("ma_groupId").is(searchMap.get("groupId"));
                queryma.addCriteria(crotch);
            } else {
                Criteria criteria = new Criteria("ma_keywords").is(searchMap.get("keywords"));
                queryma.addCriteria(criteria);
            }
            // 分页
            Integer pageNoma = (Integer) searchMap.get("pageNo");//获取页码
            if (pageNoma== null) {
                pageNoma = 1;
            }
            Integer pageSizema = (Integer) searchMap.get("pageSize");//获取页大小
            if (pageSizema == null) {
                pageSizema = 10;
            }
            queryma.setOffset((pageNo - 1) * pageSize);//起始索引
            queryma.setRows(pageSize);//每页记录数

            String datema = (String) searchMap.get("sort");//ASC DESC

            if (date != null && !date.equals("")) {
                if (date.equals("ASC")) {
                    Sort sort = new Sort(Sort.Direction.ASC, "ma_msgDate");
                    queryma.addSort(sort);
                }
                if (date != null&&date.equals("DESC")) {
                    Sort sort = new Sort(Sort.Direction.DESC, "ma_msgDate");
                    queryma.addSort(sort);
                }
            }

            //按时间搜索
            String timema = (String) searchMap.get("time");
            if (timema != null && timema != "" && timema.equals("一周内")) {
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.WEEK_OF_MONTH, -1);//一周内
                Date pastDate = calendar.getTime();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'16:00:00'Z'");
                StringBuilder builder = new StringBuilder("");
                builder.append("[" + sdf.format(pastDate) + " TO " + sdf.format(new Date()) + "]");
                Criteria criteria = new Criteria("ma_msgDate").is(builder);

                queryma.addCriteria(criteria);
            }
            if (timema != null && timema != "" && timema.equals("一月内")) {
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.MONTH, -1);//一月内
                Date pastDate = calendar.getTime();

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'16:00:00'Z'");
                StringBuilder builder = new StringBuilder("");
                builder.append("[" + sdf.format(pastDate) + " TO " + sdf.format(new Date()) + "]");
                Criteria criteria = new Criteria("ma_msgDate").is(builder);
                queryma.addCriteria(criteria);
            }


            if (time2!= null && time2 != "" && time2.equals("一年内")) {
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.YEAR, -1);//一年
                Date pastDate = calendar.getTime();

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'16:00:00'Z'");


                StringBuilder builder = new StringBuilder("");
                builder.append("[" + sdf.format(pastDate) + " TO " + sdf.format(new Date()) + "]");
                Criteria criteria = new Criteria("ma_msgDate").is(builder);
                queryma.addCriteria(criteria);
            }



            //***********  获取高亮结果集  ***********
            HighlightPage<HwadeeMailbox> pagema = solrTemplate.queryForHighlightPage(queryma, HwadeeMailbox.class);
            //获取高亮入口集合
            List<HighlightEntry<HwadeeMailbox>> highlightedma= pagema.getHighlighted();
            for (HighlightEntry<HwadeeMailbox> entry : highlightedma) {
                //获取高亮列表
                List<HighlightEntry.Highlight> highlights = entry.getHighlights();

                if (highlights.size() > 0 && highlights.get(0).getSnipplets().size() > 0) {
                    HwadeeMailbox entity = entry.getEntity();
                    entity.setContent(highlights.get(0).getSnipplets().get(0));
                }
            }
            map.put("ma", pagema.getContent());
            map.put("totalPages",pagema.getTotalPages()+ page.getTotalPages()+page2.getTotalPages()+page0.getTotalPages());//返回总页数
            map.put("total", pagema.getTotalElements()+page.getTotalElements()+page2.getTotalElements()+page0.getTotalElements());//返回总记录数

            return map;
        }


        if(searchMap.get("group").equals("图片")){

            HighlightQuery query00=new SimpleHighlightQuery();

            if(searchMap.get("groupId") != null && !searchMap.get("groupId").equals("")) {
                Criteria criteria1 = new Criteria("jo_keywords").is(searchMap.get("keywords"));
                Crotch crotch = criteria1.and("jo_groupId").is(searchMap.get("groupId"));
                Crotch jo_imgUrl = criteria1.and("jo_imgUrl");
                query00.addCriteria(crotch);
                query00.addCriteria(jo_imgUrl);
            }


                // 分页
                Integer pageNo = (Integer) searchMap.get("pageNo");//获取页码
                if (pageNo == null) {
                    pageNo = 1;
                }
                Integer pageSize = (Integer) searchMap.get("pageSize");//获取页大小
                if (pageSize == null) {
                    pageSize = 30;
                }
                query00.setOffset((pageNo - 1) * pageSize);//起始索引

            query00.setRows(30);
                HighlightPage<Journalarticle> page00 = solrTemplate.queryForHighlightPage(query00, Journalarticle.class);


                    map.put("tu",page00.getContent());
                    map.put("totalPages",page00.getTotalPages());
                    map.put("total",page00.getTotalElements());

            }

        return map;


    }

}