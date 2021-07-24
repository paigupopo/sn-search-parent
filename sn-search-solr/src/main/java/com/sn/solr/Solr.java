package com.sn.solr;

import com.alibaba.fastjson.JSON;
import com.sn.mapper.*;
import com.sn.pojo.Journalarticle;
import org.apache.log4j.Logger;
import org.apache.solr.client.solrj.response.UpdateResponse;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.Query;
import org.springframework.data.solr.core.query.SimpleQuery;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@Component
@SuppressWarnings("all")

public class Solr {

    @Autowired
    private JournalarticleMapper journalarticleMapper;

    @Autowired
    private GroupMapper groupMapper;

    @Autowired
    private LayoutsetMapper mapper;

    @Autowired
    private VirtualhostMapper virtualhostMapper;

    @Autowired
    private LayoutMapper layoutMapper;

    @Autowired
    private SolrTemplate solrTemplate;

    @Autowired
    private CmspublishedarticleMapper cmspublishedarticleMapper;

    Logger log = Logger.getLogger(Solr.class);

    HtmlUtils htmlUtils = new HtmlUtils();

    //设置 数据为后台审核之后 导入solr


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
            String groupname = groupMapper.getGroupName(groupId);

            System.out.println(groupId);
            //判断站点是哪个地方的
            int total = journalarticleMapper.selectCMSCount(groupId);
            //把所有的数据进行分片处理
            int y = total / 10000;
            int bacth = y;
            if (total % 10000 != 0) {
                bacth += 1;
            }
            System.out.println("bacth:" + bacth);
            for (int a = 0; a < bacth; a++) {
                //拿到每一条数据进行处理
                System.out.println(a * 1000);
                //根据站点拿到站点数据集合
                List list1 = journalarticleMapper.selectCMSList(a * 10000, groupId);
                System.out.println(list1.size());

                try {
                    //判断数据集合非空处理
                    if (list1 != null && list1.size() > 0) {

                        for (int n = 0; n < list1.size(); n++) {
                            //将得到的数据集进行接送转换
                            Journalarticle journalar = JSON.parseObject(JSON.toJSONString(list1.get(n)), Journalarticle.class);
                            String url = journalar.getUrl();
                            String content = journalar.getContent();

                            List<String> img = getImg(content);
                            for (String s : img) {
                                Pattern p1 = Pattern.compile("\"(.*?)\"");
                                Matcher matcher = p1.matcher(s);


                                if (matcher.find()) {

                                    if (matcher.group(1).contains("http")) {
                                        journalar.setImgUrl(matcher.group(1));
                                    } else {
                                        if (matcher.group(1).contains("documents") && groupId == 10184) {
                                            journalar.setImgUrl("http://www.suining.gov.cn/" + matcher.group(1));

                                        } else {
                                            long l = mapper.selectout(groupId);

                                            String s1 = virtualhostMapper.selectURL(l);

                                            if (matcher.group(1).contains("documents") && s1 != null && !s1.equals("")) {
                                                journalar.setImgUrl("http://" + s1 + matcher.group(1));

                                            } else {
                                                Long parentId = groupMapper.selectparentGroupid(groupId);
                                                Long aLong = mapper.selectout(parentId);
                                                String imgSrc = virtualhostMapper.selectURL(aLong);
                                                if (matcher.group(1).contains("documents") && imgSrc != null && !imgSrc.equals("")) {
                                                    journalar.setImgUrl("http://" + imgSrc + matcher.group(1));
                                                } else if (matcher.group(1).contains("documents")) {

                                                    journalar.setImgUrl("http://www.suining.gov.cn/" + matcher.group(1));

                                                }
                                            }

                                        }

                                    }
                                }
                            }

                            journalar.setName(htmlUtils.Html2Text(journalar.getName()));

                            Document parse1 = Jsoup.parse(content);
                            String text1 = parse1.text();

                            String s1 = htmlUtils.Html2Text(text1);

                            journalar.setContent(s1);

                            //对url路径进行处理
                            if (url != null && url.indexOf("http") != -1) {
                                journalar.setUrl(journalar.getUrl());
                            } else {
                                if (groupId == 10184) {
                                    journalar.setUrl("http://www.suining.gov.cn" + journalar.getUrl());
                                } else {
                                    long l = mapper.selectout(groupId);

                                    String s = virtualhostMapper.selectURL(l);

                                    if (s != null && !s.equals("")) {
                                        journalar.setUrl("http://" + s + journalar.getUrl());

                                    } else {
                                        Long parentId = groupMapper.selectparentGroupid(groupId);
                                        Long aLong = mapper.selectout(parentId);
                                        String webUrl = virtualhostMapper.selectURL(aLong);
                                        if (webUrl != null && !webUrl.equals("")) {
                                            journalar.setUrl("http://" + webUrl + journalar.getUrl());
                                        } else {
                                            journalar.setUrl("http://www.suining.gov.cn" + journalar.getUrl());

                                        }
                                    }
                                }
                            }

                            String s = journalar.getTitle();

                            Document parse = Jsoup.parse(s);
                            String text = parse.text();
                            String s2 = htmlUtils.Html2Text(text);
                            journalar.setTitle(s2);

                            journalar.setName(htmlUtils.Html2Text(journalar.getName()));
                            journalar.setGroupname(groupname);
                            solrTemplate.saveBean(journalar);
                        }
                        solrTemplate.commit();
                        System.out.println("end");
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                    log.error(e);
                    System.out.println(e);
                }

            }
            System.out.println("end");
        }


    }

    public void deletejo() {

        Query query1 = new SimpleQuery("jo_keywords:*");
        UpdateResponse delete1 = solrTemplate.delete(query1);
        solrTemplate.commit();
        System.out.println("删除数据");
    }

    public void layout() {

/*
        List<Layout> list = layoutMapper.selectName();

        for (Layout layout : list) {
            layout.setName(htmlUtils.Html2Text(layout.getName()));
            System.out.println(layout.getName());
        }
        System.out.println(list.size());
        System.out.println(list);;
*/
        //判断站点是哪个地方的

        int total = journalarticleMapper.selectCMSCount(10184);
        String groupname = groupMapper.getGroupName((long)10184);
        //把所有的数据进行分片处理
        int y = total / 10000;

        int bacth = y;
        if (total % 10000 != 0) {
            bacth += 1;
        }
        System.out.println("bacth:" + bacth);
        for (int a = 0; a < bacth; a++) {
            //拿到每一条数据进行处理
            System.out.println(a * 10000);
            List list1 = journalarticleMapper.selectCMSList(a * 10000, 10184);
            System.out.println(list1.size());

            try {
                //判断数据集合非空处理
                if (list1 != null && list1.size() > 0) {

                    for (int n = 0; n < list1.size(); n++) {
                        //将得到的数据集进行接送转换
                        Journalarticle journalar = JSON.parseObject(JSON.toJSONString(list1.get(n)), Journalarticle.class);
                        String url = journalar.getUrl();
                        String content = journalar.getContent();

                        List<String> img = getImg(content);
                        for (String s : img) {
                            Pattern p1 = Pattern.compile("\"(.*?)\"");
                            Matcher matcher = p1.matcher(s);
                            if (matcher.find()) {
                                if (url.indexOf("http") != -1) {
                                    journalar.setImgUrl(journalar.getImgUrl());
                                } else {
                                    if (10184 == 10184) {
                                        journalar.setImgUrl("http://www.suining.gov.cn" + matcher.group(1));
                                    } else {
                                        long l = 10184;

                                        String s1 = virtualhostMapper.selectURL(l);

                                        if (s1 != null && !s1.equals("")) {
                                            journalar.setImgUrl("http://" + s1 + matcher.group(1));

                                        } else {
                                            journalar.setImgUrl("http://www.suining.gov.cn" + matcher.group(1));
                                        }
                                    }
                                }
                            }
                        }

                        Document parse1 = Jsoup.parse(content);
                        String text1 = parse1.text();

                        String s1 = htmlUtils.Html2Text(text1);

                        journalar.setContent(s1);

                        //对url路径进行处理
                        if (url != null && url.indexOf("http") != -1) {
                            journalar.setUrl(journalar.getUrl());
                        } else {
                            if (10184 == 10184) {
                                journalar.setUrl("http://www.suining.gov.cn" + journalar.getUrl());
                            } else {
                                long l = 10184;

                                String s = virtualhostMapper.selectURL(l);

                                if (s != null && !s.equals("")) {
                                    journalar.setUrl("http://" + s + journalar.getUrl());

                                } else {
                                    journalar.setUrl("http://www.suining.gov.cn" + journalar.getUrl());
                                }
                            }
                        }

                        String s = journalar.getTitle();

                        Document parse = Jsoup.parse(s);
                        String text = parse.text();
                        String s2 = htmlUtils.Html2Text(text);
                        journalar.setTitle(s2);

                        journalar.setName(htmlUtils.Html2Text(journalar.getName()));

                        journalar.setGroupname(groupname);
                        solrTemplate.saveBean(journalar);
                    }
                    solrTemplate.commit();
                    System.out.println("end");
                }

            } catch (Exception e) {
                System.out.println("RuntimeException:" + e.getMessage());
            }

        }
        System.out.println("end");

    }


    /**
     * @param s
     * @return 获得图片
     */
    private List<String> getImg(String s) {
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

