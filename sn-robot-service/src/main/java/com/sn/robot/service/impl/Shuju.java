package com.sn.robot.service.impl;

import com.sn.mapper.KnowledgelibMapper;
import com.sn.pojo.Knowledgelib;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.Query;
import org.springframework.data.solr.core.query.SimpleQuery;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@SuppressWarnings("all")
public class Shuju {

    @Autowired
    private SolrTemplate solrTemplate;

    @Autowired
    private KnowledgelibMapper mapper;


    HtmlUtils htmlUtils=new HtmlUtils();
    public  void importsj(){

        /**
         * 为了防止数据重复 这里更新数据之前删除数据
         */

        Query query3=new SimpleQuery("qakl_title:*");
        solrTemplate.delete(query3);
        /**
         * 上传机器人数据
         */

        List<Knowledgelib> knowledgelibs = mapper.solrStart();
        for (Knowledgelib knowledgelib : knowledgelibs) {

            knowledgelib.setId(knowledgelib.getId()*knowledgelib.getId());

            knowledgelib.setQaklContent(htmlUtils.Html2Text(knowledgelib.getQaklContent()));
        }


        solrTemplate.saveBeans(knowledgelibs);

        solrTemplate.commit();

    }


}
