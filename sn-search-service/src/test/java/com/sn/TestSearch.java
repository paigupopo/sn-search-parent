package com.sn;


import com.alibaba.dubbo.config.annotation.Reference;


import com.sn.pojo.Cmspublishedarticle;
import org.junit.Test;

import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.Criteria;
import org.springframework.data.solr.core.query.Query;
import org.springframework.data.solr.core.query.SimpleQuery;
import org.springframework.data.solr.core.query.result.ScoredPage;

import java.util.HashMap;
import java.util.Map;

public class TestSearch{


    @Reference
    private SolrTemplate solrTemplate;


    @Test
   public void search(){






   }

        }
