/*
package com.sn.solr;

import com.sn.mapper.CmsGovaffairsimportrecordMapper;
import com.sn.mapper.CmsSensitivewordMapper;
import com.sn.mapper.KnowledgelibMapper;
import com.sn.mapper.QaDialogueMapper;
import com.sn.pojo.QaDialogue;
import com.sn.pojo.QaDialogueExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.com.data.solr.core.SolrTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@SuppressWarnings("all")
public class Shuju {

    @Autowired
    private SolrTemplate solrTemplate;

    @Autowired
    private KnowledgelibMapper mapper;

    @Autowired
    private CmsGovaffairsimportrecordMapper cmsGovaffairsimportrecordMapper;

    @Autowired
    private CmsSensitivewordMapper cmsSensitivewordMapper;


    @Autowired
    private QaDialogueMapper qaDialogueMapper;
    HtmlUtils htmlUtils=new HtmlUtils();
    public  void importsj(){
      */
/*  KnowledgelibExample example=new KnowledgelibExample();
        List<Knowledgelib> knowledgelibs = mapper.selectByExample(example);
        for (Knowledgelib knowledgelib : knowledgelibs) {
            String qaklContent = knowledgelib.getQaklContent();
            String s = htmlUtils.Html2Text(qaklContent);
            knowledgelib.setQaklContent(s);
            System.out.println(knowledgelib.getQaklContent());
        }
        solrTemplate.saveBeans(knowledgelibs);*//*


        QaDialogueExample qaDialogueExample=new QaDialogueExample();

       List<QaDialogue> qaDialogues = qaDialogueMapper.selectByExample(qaDialogueExample);
        System.out.println(qaDialogues.size());
       System.out.println(qaDialogues);

      for (int i = 0; i < qaDialogues.size(); i++) {
            solrTemplate.saveBean(qaDialogues.get(i));
      }
        System.out.println("2start");
        System.out.println("1start");

//        QaDialogueExample qaDialogueExample=new QaDialogueExample();
//
//        List<QaDialogue> qaDialogues = qaDialogueMapper.selectByExample(qaDialogueExample);
//        System.out.println(qaDialogues.size());
//        System.out.println(qaDialogues);
//
//        for (int i = 0; i < qaDialogues.size(); i++) {
//            solrTemplate.saveBean(qaDialogues.get(i));
//        }
//        System.out.println("2start");
//
//
//        List<CmsGovaffairsimportrecord> cmsGovaffairsimportrecords = cmsGovaffairsimportrecordMapper.selectList();
//        System.out.println(cmsGovaffairsimportrecords.size());
//        for (CmsGovaffairsimportrecord cmsGovaffairsimportrecord : cmsGovaffairsimportrecords) {
//
//
//            String gatype = cmsGovaffairsimportrecord.getGatype();
//
//            String[] split = gatype.split("-");
//            for (int i = 0; i < split.length; i++) {
//                System.out.println(split[0]);
//                cmsGovaffairsimportrecord.setGatype(split[0]);
//            }
//
//        }
//        System.out.println("3start");
//
//        solrTemplate.saveBeans(cmsGovaffairsimportrecords);
//
//
//        CmsSensitivewordExample example1=new CmsSensitivewordExample();
//        List<CmsSensitiveword> cmsSensitivewords =cmsSensitivewordMapper .selectByExample(example1);
//        solrTemplate.saveBeans(cmsSensitivewords);
//        System.out.println("4start");
        solrTemplate.commit();
        System.out.println("sucess");

    }



}
*/
