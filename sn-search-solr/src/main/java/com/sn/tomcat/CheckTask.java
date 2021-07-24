package com.sn.tomcat;

import com.sn.solr.Lead;
import com.sn.solr.Solr;
import com.sn.solr.Suggest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

@Component
public class CheckTask extends TimerTask {


    @Override
        public void run() {
            ApplicationContext context1 = new ClassPathXmlApplicationContext(
                    "classpath*:**/applicationContext*.xml");


       Solr solr = (Solr) context1.getBean("solr");

        Date date =new Date();
        SimpleDateFormat format=new SimpleDateFormat("HH");
        String format1 = format.format(date);
        int i = Integer.parseInt(format1);
        //特定的时间段清除数据
        if(i>=0&&i<=5){
            //凌晨清空数据
            solr.deletejo();
        }
        if(i>21&&i<24){
            solr.deletejo();
        }

     solr.importItemData();


        Lead lead = (Lead) context1.getBean("lead");

        lead.deleteSolr();
       lead.qaDialogue();
       lead.sensitiveword();
        lead.importLeader();
        lead.importKno();
        lead.cms();


        Suggest suggest = (Suggest) context1.getBean("suggest");

        suggest.delete();
        suggest.importHv();
        suggest.importHp();
        suggest.importMa();
        suggest.importHs();




    }



}
