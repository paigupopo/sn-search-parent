/*
package com.sn.solr;

import com.alibaba.fastjson.JSON;
import com.sn.mapper.CmsGovaffairsimportrecordMapper;
import com.sn.mapper.JournalarticleMapper;
import com.sn.mapper.LeaderMapper;
import com.sn.mapper.QaDialogueMapper;
import com.sn.pojo.*;
import org.apache.solr.client.solrj.response.UpdateResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.com.data.solr.core.SolrTemplate;
import org.springframework.com.data.solr.core.query.Query;
import org.springframework.com.data.solr.core.query.SimpleQuery;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
@SuppressWarnings("all")
public class Lead {

    @Autowired
    private SolrTemplate solrTemplate;

    @Autowired
    private LeaderMapper mapper;

    @Autowired
    private JournalarticleMapper journalarticleMapper;
    @Autowired
    private CmsGovaffairsimportrecordMapper cmsmapper;

    @Autowired
    private QaDialogueMapper qaDialogueMapper;

    HtmlUtils htmlUtils=new HtmlUtils();



    public   long randomLong(){
        Random  random=new Random();
        StringBuilder sb=new StringBuilder();

        for (int i = 0; i < 10; i++) {
            int i1 = random.nextInt(10);
            sb.append(i1);

        }
       return Long.valueOf(sb.toString());


    }

    //设置 数据为后台审核之后 导入solr

    public void  importLeader(){



        //开始执行
        System.out.println("start");
        LeaderExample leaderExample=new LeaderExample();

        List<Leader> leaders = mapper.selectByExample(leaderExample);
        for (Leader leader : leaders) {

            long l1 = randomLong();

            leader.setId(l1+leader.getId());
            System.out.println(leader.getId());
        }
       solrTemplate.saveBeans(leaders);
        System.out.println(leaders.size());

        QaDialogueExample qaDialogueExample=new QaDialogueExample();

        List<QaDialogue> qaDialogues = qaDialogueMapper.selectByExample(qaDialogueExample);
        System.out.println(qaDialogues.size());
        solrTemplate.saveBeans(qaDialogues);


        List<CmsGovaffairsimportrecord> cmsGovaffairsimportrecords = cmsmapper.selectList();
        System.out.println(cmsGovaffairsimportrecords.size());

        for (CmsGovaffairsimportrecord cmsGovaffairsimportrecord : cmsGovaffairsimportrecords) {

            String gatype = cmsGovaffairsimportrecord.getGatype();

            String[] split = gatype.split("-");
            for (int i = 0; i < split.length; i++) {
                System.out.println(split[0]);
                cmsGovaffairsimportrecord.setGatype(split[0]);
            }
        }
        solrTemplate.saveBeans(cmsGovaffairsimportrecords);

      solrTemplate.commit();
        System.out.println(
                "end"
        );

    }


    public void deleteSolr(){

        Query query=new SimpleQuery("qal_qalName:*");

        Query query1=new SimpleQuery("cmg_keywords:*");

        UpdateResponse delete = solrTemplate.delete(query);
        UpdateResponse delete1 = solrTemplate.delete(query1);
        solrTemplate.commit();
        System.out.println("删除数据");

    }

    public static void main(String[] args) {

        ApplicationContext context1 = new ClassPathXmlApplicationContext(
                "classpath*:spring/applicationContext*.xml");
        Lead lead = (Lead) context1.getBean("lead");
        lead.deleteSolr();
      lead.importLeader();
        System.out.println("end");
    }

}
*/
