/*
package com.sn.solr;

import com.sn.mapper.CmsSensitivewordMapper;
import com.sn.pojo.CmsSensitiveword;
import com.sn.pojo.CmsSensitivewordExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Word {
    @Autowired
    private SolrTemplate solrTemplate;

    @Autowired
    private CmsSensitivewordMapper mapper;


    public  void  importCmsSensitiveword(){
        Lead lead=new Lead();


        CmsSensitivewordExample example=new CmsSensitivewordExample();
        List<CmsSensitiveword> cmsSensitivewords = mapper.selectByExample(example);

        System.out.println(
                cmsSensitivewords.size()
        );
        for (CmsSensitiveword cmsSensitiveword : cmsSensitivewords) {

            long l = lead.randomLong();
            cmsSensitiveword.setId(l);
            System.out.println(cmsSensitiveword.getWord());
        }
        solrTemplate.saveBeans(cmsSensitivewords);

        solrTemplate.commit();
        System.out.println("sucess");

    }




}
*/
