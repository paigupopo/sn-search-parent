package com.sn.solr;

import com.alibaba.fastjson.JSON;
import com.sn.mapper.JournalarticleMapper;
import com.sn.pojo.Journalarticle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
@SuppressWarnings("all")
public class TestSrc {




    @Autowired
    private SolrTemplate solrTemplate;

    @Autowired
    private  JournalarticleMapper journalarticleMapper;


    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("classpath*:spring/applicationContext*.xml");
        TestSrc testsrc = (TestSrc) context.getBean("testSrc");

    }


    private  void srcMain() {
        List list = journalarticleMapper.selectCMSList(0, 10184);

        for (int i = 0; i < list.size(); i++) {
            Journalarticle journalar = JSON.parseObject(JSON.toJSONString(list.get(i)), Journalarticle.class);
            String content = journalar.getContent();
            List<String> img = getImg(content);
            for (String s : img) {
                Pattern p1=Pattern.compile("\"(.*?)\"");
                Matcher matcher = p1.matcher(s);
                if(matcher.find()){
                    System.out.println(matcher.group(1));
                }
            }
            System.out.println(journalar.getUrl());

        }

    }

    /**
     * @param s
     * @return 获得图片
     */
    private   List<String> getImg(String s) {
        String regex;
        List<String> list = new ArrayList<String>();
        regex = "src=\"(.*?)\"";
        Pattern pa = Pattern.compile(regex, Pattern.DOTALL);
        Matcher ma = pa.matcher(s);
        while (ma.find()) {
            list.add(ma.group());
        }
        return list;
    }




}