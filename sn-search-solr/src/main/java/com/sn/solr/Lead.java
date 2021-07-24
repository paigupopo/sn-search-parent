package com.sn.solr;


import com.sn.mapper.*;
import com.sn.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.Query;
import org.springframework.data.solr.core.query.SimpleQuery;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
@SuppressWarnings("all")
public class Lead {


    @Autowired
    private KnowledgelibMapper knowledgelibMapper;

    @Autowired
    private SolrTemplate solrTemplate;

    @Autowired
    private CmsGovaffairsimportrecordMapper cmsmapper;


    @Autowired
    private LeaderMapper mapper;

    @Autowired
    private JournalarticleMapper journalarticleMapper;


    @Autowired
    private WzqLeadersMapper leadersMapper;

    @Autowired
    private CmsSensitivewordMapper sensitivewordMapper;

    @Autowired
    private QaDialogueMapper qaDialogueMapper;

    HtmlUtils htmlUtils = new HtmlUtils();


    public Long randomLong() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            int i1 = random.nextInt(10);
            sb.append(i1);

        }
        return Long.valueOf(sb.toString());


    }

    //敏感词数据
    public void sensitiveword() {
        //开始执行
        System.out.println("start CmsSensitivewordExample");

        CmsSensitivewordExample example1 = new CmsSensitivewordExample();
        List<CmsSensitiveword> cmsSensitivewords =
                sensitivewordMapper.selectByExample(example1);

        for (CmsSensitiveword cmsSensitiveword : cmsSensitivewords) {
            Long id = cmsSensitiveword.getId();
            System.out.println("CmsSensitivewordExample:" + id);
            cmsSensitiveword.setId(randomLong());
        }

        solrTemplate.saveBeans(cmsSensitivewords);
        solrTemplate.commit();
        System.out.println("end CmsSensitivewordExample");

    }

    //寒暄数据导入
    public void qaDialogue() {
        QaDialogueExample qaDialogueExample = new QaDialogueExample();

        List<QaDialogue> qaDialogues = qaDialogueMapper.selectByExample(qaDialogueExample);
        for (QaDialogue qaDialogue : qaDialogues) {
            qaDialogue.setId(qaDialogue.getQadId() + 100);
        }

        System.out.println(qaDialogues.size());
        solrTemplate.saveBeans(qaDialogues);

        solrTemplate.commit();


        System.out.println(
                "end"
        );
    }


    //领导数据导入solr

    public void importLeader() {
        //开始执行  敏感词
        System.out.println("end CmsSensitivewordExample");
        //开始执行
        System.out.println("start  LeaderExample..");
        LeaderExample leaderExample = new LeaderExample();

        List<Leader> leaders = mapper.selectByExample(leaderExample);
        for (Leader leader : leaders) {

            long l1 = randomLong();

            leader.setId(l1 + leader.getId());
            System.out.println(leader.getId());
        }
        solrTemplate.saveBeans(leaders);
        solrTemplate.commit();
        System.out.println("end  LeaderExample.. " + leaders.size());


    }

    //政务服务
    public void cms() {

        CmsGovaffairsimportrecordExample example = new CmsGovaffairsimportrecordExample();




        List<CmsGovaffairsimportrecord> cmsGovaffairsimportrecords = cmsmapper.selectList();


        for (CmsGovaffairsimportrecord cmsGovaffairsimportrecord : cmsGovaffairsimportrecords) {

            cmsGovaffairsimportrecord.setId(cmsGovaffairsimportrecord.getId()+System.currentTimeMillis());

            String gatype = cmsGovaffairsimportrecord.getGatype();

            String[] split = gatype.split("-");
            for (int i = 0; i < split.length; i++) {
                System.out.println(split[0]);
                cmsGovaffairsimportrecord.setGatype(split[0]);
            }
        }
        solrTemplate.saveBeans(cmsGovaffairsimportrecords);

        solrTemplate.commit();
    }

    //知识库数据
    public void importKno() {

        System.out.println("start kno");
        try {
            KnowledgelibExample example = new KnowledgelibExample();
            List<Knowledgelib> knowledgelibs = knowledgelibMapper.selectByExample(example);
            for (Knowledgelib knowledgelib : knowledgelibs) {

                knowledgelib.setId(knowledgelib.getId() * knowledgelib.getId());

                knowledgelib.setQaklContent(htmlUtils.Html2Text(knowledgelib.getQaklContent()));
                System.out.println(knowledgelib.getQaklContent());
            }
            solrTemplate.saveBeans(knowledgelibs);
            solrTemplate.commit();
            System.out.println("end kno");

        } catch (Exception e) {
            System.out.println(" import messagemailbox. error");
            e.printStackTrace();
        }


    }


    public void deleteSolr() {

        Query query = new SimpleQuery("qal_qalName:*");
        Query querycms = new SimpleQuery("cms_word:*");
        Query query2 = new SimpleQuery("qad_title:*");
        Query query3 = new SimpleQuery("qakl_title:*");
        Query query1 = new SimpleQuery("cmg_title:*");
        System.out.println("start remove solr data..[qal qad qakl cmg]");
        solrTemplate.delete(query);
        solrTemplate.delete(querycms);
        solrTemplate.delete(query2);
        solrTemplate.delete(query1);
        solrTemplate.delete(query3);
        solrTemplate.commit();
        System.out.println("end remove solr data..[qal qad qakl cmg]");

    }


}
