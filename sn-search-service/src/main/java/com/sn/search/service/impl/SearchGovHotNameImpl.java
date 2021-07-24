package com.sn.search.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.sn.mapper.CmsGovernmenthotsMapper;
import com.sn.mapper.CmsGovernmenthotsitermMapper;
import com.sn.pojo.CmsGovernmenthots;
import com.sn.pojo.CmsGovernmenthotsiterm;
import com.sn.pojo.Journalarticle;
import com.sn.search.SearchNameInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.Criteria;
import org.springframework.data.solr.core.query.Crotch;
import org.springframework.data.solr.core.query.HighlightQuery;
import org.springframework.data.solr.core.query.SimpleHighlightQuery;
import org.springframework.data.solr.core.query.result.HighlightPage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

@Service(timeout = 8000)
@SuppressWarnings("all")
public class SearchGovHotNameImpl implements SearchNameInterface {

    @Autowired
    private SolrTemplate solrTemplate;

    @Autowired
    private CmsGovernmenthotsMapper governmenthotsMapper;

    private  String govhotname;


    @Autowired
    private CmsGovernmenthotsitermMapper governmenthotsitermMapper;
    @Override
    public Map searchName(Map searchMap) {
        Map map = new HashMap();

        String regEx = "[`~！@#$%^&*()+=|{}:;\\\\[\\\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？' \" \"]";
        //字符处理
        String keywords = (String) searchMap.get("keywords");
        searchMap.put("keywords", Pattern.compile(regEx).matcher(keywords).replaceAll("").trim());//关键字去掉字符\

        //1.查询列表
        map.putAll(searchListName(searchMap));

        return map;
    }

    private Map searchListName(Map searchMap) {

        Map map = new HashMap();
        Object keywords0 = searchMap.get("keywords");
        //获取用户访问的IP地址
        if(keywords0!=null||keywords0!=""){
            Object along = searchMap.get("groupIp");
            List<CmsGovernmenthotsiterm> list = governmenthotsitermMapper.govHotIP( along);
            //当搜索记录存在时
            if(list.size()>0){
                HighlightQuery queryHotName = new SimpleHighlightQuery();
                for (int i = 0; i < list.size(); i++) {
                    List<CmsGovernmenthots> listName = governmenthotsMapper.GovHotName(list.get(i).getGovhotid());
                    for (int j = 0; j < listName.size(); j++) {
                        //获取搜索的当前用户搜索的记录关键字
                         govhotname = listName.get(0).getGovhotname();
                    }
                }
                //对这些关键字进行搜索，获取数据记录
                Criteria criteriaHotName=new Criteria("jo_title").is(govhotname);
                //将数据根据站点查询数据
                Crotch crotchName = criteriaHotName.and("jo_groupId").is(searchMap.get("groupId"));
                queryHotName.addCriteria(crotchName);
                //控制展示条数
                queryHotName.setRows(4);
                HighlightPage<Journalarticle> page = solrTemplate.queryForHighlightPage(queryHotName, Journalarticle.class);
                //将查询的数据封装保存
                map.put("hotName",page.getContent());

                //当搜索记录不存在时
            }else{
                HighlightQuery queryHotName = new SimpleHighlightQuery();
                //展示遂宁资讯 政策文件  公示公告 的几条数据
                Criteria criteria=new Criteria("jo_username").is("遂宁资讯");
                Crotch crotch2 = criteria.and("jo_groupId").is(searchMap.get("groupId"));
                queryHotName.addCriteria(crotch2);
                queryHotName.setRows(2);
                HighlightPage<Journalarticle> page = solrTemplate.queryForHighlightPage(queryHotName, Journalarticle.class);
                map.put("hotName",page.getContent());

                HighlightQuery query=new SimpleHighlightQuery();
                Criteria criteria1=new Criteria("jo_username").is("政策文件");
                Crotch crotch = criteria1.and("jo_groupId").is(searchMap.get("groupId"));
                query.addCriteria(crotch);
                query.setRows(2);
                HighlightPage<Journalarticle> page2 = solrTemplate.queryForHighlightPage(query, Journalarticle.class);
                map.put("hotNam",page2.getContent());

                HighlightQuery querygs=new SimpleHighlightQuery();
                Criteria criteriags=new Criteria("jo_username").is("公示公告");
                Crotch crotchgs= criteriags.and("jo_groupId").is(searchMap.get("groupId"));
                querygs.addCriteria(crotchgs);
                querygs.setRows(2);
                HighlightPage<Journalarticle> pagegs = solrTemplate.queryForHighlightPage(querygs, Journalarticle.class);
                map.put("hotNamegs",pagegs.getContent());

            }
        }
        return  map;
    }
}
