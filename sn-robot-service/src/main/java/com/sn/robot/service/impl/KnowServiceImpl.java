package com.sn.robot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.sn.pojo.Knowledgelib;
import com.sn.search.KnowInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.Criteria;
import org.springframework.data.solr.core.query.Query;
import org.springframework.data.solr.core.query.SimpleQuery;
import org.springframework.data.solr.core.query.result.ScoredPage;

import java.util.HashMap;
import java.util.Map;

@Service
@SuppressWarnings("all")
public class KnowServiceImpl implements KnowInterface {

    @Autowired
    private SolrTemplate solrTemplate;
    @Override
    public Map search(Map searchMap) {

        Map map=new HashMap();
        Query query=new SimpleQuery();
        Criteria criteria=new Criteria("qakl_keywords").is(searchMap.get("keywords"));

        query.addCriteria(criteria);
        ScoredPage<Knowledgelib> knowledgelibs = solrTemplate.queryForPage(query, Knowledgelib.class);

        map.put("rows", knowledgelibs.getContent());
        return map;

    }
}
