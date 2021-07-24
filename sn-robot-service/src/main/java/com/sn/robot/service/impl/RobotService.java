package com.sn.robot.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.sn.pojo.*;
import com.sn.search.RobotInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.Criteria;
import org.springframework.data.solr.core.query.FacetQuery;
import org.springframework.data.solr.core.query.SimpleFacetQuery;
import org.springframework.data.solr.core.query.result.FacetPage;

import java.util.*;
import java.util.regex.Pattern;

@Service(timeout = 10000)
@SuppressWarnings("all")
public class RobotService implements RobotInterface {
    Map <Object,String> map1=new HashMap<>();

    @Autowired
    private SolrTemplate solrTemplate;

    @Autowired
    private KnowServiceImpl knowService;

    @Override
    public Map search(Map searchMap) {
        Map map=new HashMap();


        String regEx = "[`~！@#$%^&*()+=|{}:;\\\\[\\\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？' \" \"]";
        //字符处理
        String keywords= (String)searchMap.get("keywords");
        //对输入的关键字关键字去掉字符
        searchMap.put("keywords", Pattern.compile(regEx).matcher(keywords).replaceAll("").trim());

        map.putAll(searchList(searchMap));

        return map;
    }


    public Map searchList(Map searchMap) {

        Map map = new HashMap();
        FacetQuery query2 =new SimpleFacetQuery();
        //获取用户输入的关键字
        String keyword = (String) searchMap.get("keywords");
        Criteria criteria2 = new Criteria("cms_keywords").is(keyword);
        query2.addCriteria(criteria2);
        //首先对敏感词进行过滤,查看用户输入的是否是关键字
        FacetPage<CmsSensitiveword> cmsSensitivewords = solrTemplate.queryForFacetPage(query2, CmsSensitiveword.class);
        if (cmsSensitivewords.getContent().size() != 0) {
            map.put("min",cmsSensitivewords.getContent());
            return map;
        } else {
            //如果不是,判断用户输入的是否是寒暄数据
            FacetQuery query = new SimpleFacetQuery();
            //和用户进行寒暄交互
            Criteria criteria = new Criteria("qad_keywords").is(searchMap.get("keywords").toString());
            query.addCriteria(criteria);

            FacetPage<QaDialogue> qaDialogues = solrTemplate.queryForFacetPage( query, QaDialogue.class);


            if (qaDialogues.getContent().size() == 0) {
                //对领导数据进行展示
                String basePath = com.hwadee.common.MyUtil.getBasePath();
                FacetQuery querys = new SimpleFacetQuery();
                Criteria criterias = new Criteria("qal_keywords").is(searchMap.get("keywords"));
                querys.addCriteria(criterias);
                FacetPage<Leader> leaders = solrTemplate.queryForFacetPage( querys, Leader.class);
                for (Leader leader : leaders) {
                    leader.setQalImg(basePath+leader.getQalImg());

                }

               if(leaders.getContent().size()!=0){
                   map.put("leader",leaders.getContent());
               }
                if (leaders.getContent().size() == 0) {
                   //对文章列表数据进行展示
                    FacetQuery querys1=new SimpleFacetQuery();
                    querys1.setRows(3);
                    Criteria criteriass=new Criteria("jo_title").is(searchMap.get("keywords"));

                    querys1.addCriteria(criteriass);
                    FacetPage<Journalarticle> journalarticles = solrTemplate.queryForFacetPage( querys1, Journalarticle.class);
                    map.put("jo", journalarticles.getContent());
                    if (journalarticles.getContent().size()>=0) {
                        FacetQuery query3 = new SimpleFacetQuery();
                        query3.setRows(3);
                        //对政务服务数据进行处理展示
                        Criteria criteria1 = new Criteria("qakl_title").is(searchMap.get("keywords"));
                        query3.addCriteria(criteria1);
                        FacetPage<Knowledgelib> knowledgelibs = solrTemplate.queryForFacetPage( query3, Knowledgelib.class);

                        map.put("rows", knowledgelibs.getContent());
                        if (knowledgelibs.getContent().size() >= 0) {
                            //对机器人问答数据进行展示
                            FacetQuery query1 = new SimpleFacetQuery();
                            query1.setRows(4);
                            Criteria criteria11 = new Criteria("cmg_keywords").is(searchMap.get("keywords"));
                            query1.addCriteria(criteria11);
                            FacetPage<CmsGovaffairsimportrecord> cmsGovaffairsimportrecords = solrTemplate.queryForFacetPage( query1, CmsGovaffairsimportrecord.class);
                            map.put("row", cmsGovaffairsimportrecords.getContent());
                        }
                    }
                }
            } else {
                map.put("qs", qaDialogues.getContent());

            }
        }
        return map;
    }



}