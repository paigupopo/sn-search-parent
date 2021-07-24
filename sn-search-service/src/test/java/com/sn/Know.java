/*
package com.sn.solr;

import com.alibaba.fastjson.JSON;
import com.sn.mapper.CmsGovaffairsimportrecordMapper;
import com.sn.mapper.JournalarticleMapper;
import com.sn.mapper.QaDialogueMapper;
import com.sn.pojo.CmsGovaffairsimportrecord;

import com.sn.pojo.Journalarticle;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Know {


    @Autowired(required=false)
    private JournalarticleMapper journalarticleMapper;



    public void importItemData() {

        //开始执行
        System.out.println("start");

        //获取站点信息集合
        List list = journalarticleMapper.selectGroupList();
        System.out.println(list);

        //拿到每一个站点
        for (int i = 0; i < list.size(); i++) {
            Object str = list.get(i);
            String str1 = str.toString();
            //把站点数据进行分割 拿到long数据
            long groupId = Long.valueOf(str1.substring(str1.indexOf("=") + 1, str1.lastIndexOf("}")));
            System.out.println(groupId);
            //根据站点拿到站点数据集合

            //判断站点是哪个地方的

            int total = journalarticleMapper.selectCMSCount(groupId);
            //把所有的数据进行分片处理
            int y = total / 10000;
            int bacth = y == 0 ? y : y + 1;
            System.out.println("bacth:" + bacth);

            for (int a = 0; a < bacth; a++) {
                //拿到每一条数据进行处理
                System.out.println(a * 10000);
                List journalarticles = journalarticleMapper.selectCMSList(a * 10000, groupId);
                System.out.println(journalarticles.size());
                //判断数据集合非空处理
                if (journalarticles != null && journalarticles.size() > 0) {

                    for (int n = 0; n < journalarticles.size(); n++) {
                        //将得到的数据集进行接送转换
                        Journalarticle journalar = JSON.parseObject(JSON.toJSONString(journalarticles.get(n)), Journalarticle.class);
                        String url = journalar.getUrl();
                        String content = journalar.getContent();

                        //对url路径进行处理
                        if (url.indexOf("http") != -1) {
                            journalar.setUrl(journalar.getUrl());
                        } else {
                            journalar.setUrl("http://www.suining.gov.cn" + journalar.getUrl());
                        }
                        String s = journalar.getTitle();


                String[] split = s.split("]]>");
                         for (String s1 : split) {
                             journalar.setContent(s1);
                         }

                        String s2 = journalar.getContent();

                        String[] split1 = s2.split("]]>");
                         for (String s3 : split1) {
                             journalar.setTitle(s3);
                         }


                        //solrTemplate.saveBean(journalar);
                    }
                    // solrTemplate.commit();
                    System.out.println("end");
                }
                journalarticles=null;
                System.gc();

            }


            System.out.println("end");
        }
    }
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext(
                "spring/applicationContext.xml");
        Know know = (Know) context.getBean("know");

        know.importItemData();
    }
}
*/
