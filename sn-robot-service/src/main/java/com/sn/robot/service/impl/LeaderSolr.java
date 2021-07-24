package com.sn.robot.service.impl;

import com.sn.mapper.LeaderMapper;
import com.sn.pojo.LeaderExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.Query;
import org.springframework.data.solr.core.query.SimpleQuery;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
@SuppressWarnings("all")
public class LeaderSolr {

    @Autowired
    private SolrTemplate solrTemplate;

    @Autowired
    private LeaderMapper mapper;

    public   Long randomLong(){
        Random random=new Random();
        StringBuilder sb=new StringBuilder();

        for (int i = 0; i < 10; i++) {
            int i1 = random.nextInt(10);
            sb.append(i1);

        }
        return Long.valueOf(sb.toString());


    }

    public void importLeader(){
        LeaderExample leaderExample=new LeaderExample();
        /**
         * 为了防止数据重复 选择全量同步
         */
        Query query=new SimpleQuery("qal_qalName:*");
        solrTemplate.delete(query);

        /**
         * 导入领导数据
         */
        List<com.sn.pojo.Leader> leaders = mapper.selectByExample(leaderExample);
        for (
                com.sn.pojo.Leader leader : leaders) {

            long l1 = randomLong();

            leader.setId(l1+leader.getId());
        }
        solrTemplate.saveBeans(leaders);
        solrTemplate.commit();
    }



}
