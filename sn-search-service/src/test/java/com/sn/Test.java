/*
package com.sn.solr;

import com.sn.mapper.KnowledgelibMapper;
import com.sn.mapper.QaDialogueMapper;
import com.sn.pojo.Knowledgelib;
import com.sn.pojo.KnowledgelibExample;
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
public class Test {

    @Autowired
    private QaDialogueMapper qaDialogueMapper;
    
    @Autowired
    private SolrTemplate solrTemplate;

    @Autowired
    private KnowledgelibMapper mapper;

    */
/**
     * 导入数据
     *//*

    public void importd(){

        HtmlUtils htmlUtils=new HtmlUtils();
        QaDialogueExample qaDialogueExample=new QaDialogueExample();

        List<QaDialogue> qaDialogues = qaDialogueMapper.selectByExample(qaDialogueExample);
        System.out.println(qaDialogues.size());
        System.out.println(qaDialogues);

        for (int i = 0; i < qaDialogues.size(); i++) {
            solrTemplate.saveBean(qaDialogues.get(i));
        }

        KnowledgelibExample example=new KnowledgelibExample();
        List<Knowledgelib> knowledgelibs = mapper.selectByExample(example);
        for (Knowledgelib knowledgelib : knowledgelibs) {
            String qaklContent = knowledgelib.getQaklContent();
            String s = htmlUtils.Html2Text(qaklContent);
            knowledgelib.setQaklContent(s);
            System.out.println(knowledgelib.getQaklContent());
        }
        solrTemplate.saveBeans(knowledgelibs);
        solrTemplate.commit();

        System.out.println("结束");

    }

    
   
    
    
    
    
    
    
    
    
    
    
    
   
}
*/
