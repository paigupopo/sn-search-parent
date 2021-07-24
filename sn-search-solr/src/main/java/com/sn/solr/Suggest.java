package com.sn.solr;

import com.sn.mapper.*;
import com.sn.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.Query;
import org.springframework.data.solr.core.query.SimpleQuery;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@SuppressWarnings("all")
public class Suggest {

    @Autowired
    private JournalarticleMapper journalarticleMapper;

    @Autowired
    private HwadeeSuggestMapper hwadeeSuggestMapper;

    @Autowired
    private HwadeePollsMapper pollsMapper;

    @Autowired
    private LayoutsetMapper mapper;

    @Autowired
    private HwadeeMailboxMapper mailboxMapper;

    @Autowired
    private HwadeeInterviewnoticeMapper interviewnoticeMapper;

    @Autowired
    private VirtualhostMapper virtualhostMapper;

    @Autowired
    private SolrTemplate solrTemplate;

    @Autowired
    private GroupMapper groupMapper;

    HtmlUtils htmlUtil = new HtmlUtils();

    //意见征集数据
    public void importHs() {
        System.out.println("start hs");
        try {

            List list = hwadeeSuggestMapper.selectHSList();
            for (int i = 0; i < list.size(); i++) {
                HwadeeSuggest suggest = (HwadeeSuggest) list.get(i);

                suggest.setGroupname(groupMapper.getGroupName(suggest.getGroup()));
                //对url路径进行处理

                if (suggest.getGroup() == 10184) {
                    suggest.setUrl("http://www.suining.gov.cn/web/sn/yjzj?p_p_id=suggest1_WAR_hdjlportlet_INSTANCE_MTLd5SMS8ljb&p_p_lifecycle=0&p_p_state=maximized&p_p_mode=view&p_p_col_id=column-2&p_p_col_pos=1&p_p_col_count=3&_suggest1_WAR_hdjlportlet_INSTANCE_MTLd5SMS8ljb_jspPage=%2Fhtml%2Fsuggest2%2Fview.jsp&_suggest1_WAR_hdjlportlet_INSTANCE_MTLd5SMS8ljb_Id=" + suggest.getId());
                } else {
                    Long l = mapper.selectout(suggest.getGroup());
                    String s = virtualhostMapper.selectURL(l);
                    System.out.println(s);
                    if ( s != null ) {
                        suggest.setUrl("http://" + s + "/zmhd?p_p_id=suggestindex_WAR_hdjlportlet&p_p_lifecycle=0&p_p_state=maximized&p_p_mode=view&p_p_col_id=_118_INSTANCE_8GKtv9I9LPRl__column-2&p_p_col_pos=2&p_p_col_count=4&_suggestindex_WAR_hdjlportlet_jspPage=" +
                                "%2Fhtml%2Fsuggest2%2Fview.jsp&_suggestindex_WAR_hdjlportlet_Id=" + suggest.getId());
                    } else {
                        suggest.setUrl("http://www.suining.gov.cn/zmhd?p_p_id=suggestindex_WAR_hdjlportlet&p_p_lifecycle=0&p_p_state=maximized&p_p_mode=view&p_p_col_id=_118_INSTANCE_8GKtv9I9LPRl__column-2&p_p_col_pos=2&p_p_col_count=4&_suggestindex_WAR_hdjlportlet_jspPage=" +
                                "%2Fhtml%2Fsuggest2%2Fview.jsp&_suggestindex_WAR_hdjlportlet_Id=" + suggest.getId());
                    }
                }
                String content = suggest.getContent();
                String s = htmlUtil.Html2Text(content);
                suggest.setContent(s);
                suggest.setId(suggest.getGroup() + suggest.getId());
            }
            solrTemplate.saveBeans(list);

            solrTemplate.commit();
        } catch (Exception e) {

            System.out.println("hs==========erro");
            e.printStackTrace();
        }

        System.out.println("hs=============end");



    }

    //网上调查数据
    public void importHp() {
        List<HwadeePolls> list = pollsMapper.selectHpList();
        for (int i = 0; i < list.size(); i++) {
            HwadeePolls polls = (HwadeePolls) list.get(i);

            Long siteid = polls.getSiteid();
            Long aLong = mapper.selectout(siteid);
            System.out.println(siteid);
            String s = virtualhostMapper.selectURL(aLong);
            if (siteid == 10184) {
                polls.setUrl("http://www.suining.gov.cn/wsdc?p_p_id=pollsvote_WAR_hdjlportlet&p_p_lifecycle=0&p_p_state=maximized&p_p_mode=view&p_p_col_id=column-2&p_p_col_pos=2&p_p_col_count=3&_pollsvote_WAR_hdjlportlet_pollsId=" + polls.getid()
                        + "&_pollsvote_WAR_hdjlportlet_jspPage=%2Fhtml%2Fpollsvote%2FshowVote.jsp");
            } else {
                if (s != null && !s.equals("")) {
                    polls.setUrl("http://" + s + "/wsdc?p_p_id=pollsvote_WAR_hdjlportlet&p_p_lifecycle=0&p_p_state=maximized&p_p_mode=view&p_p_col_id=column-2&p_p_col_pos=2&p_p_col_count=3&_pollsvote_WAR_hdjlportlet_pollsId=" + polls.getid()
                            + "&_pollsvote_WAR_hdjlportlet_jspPage=%2Fhtml%2Fpollsvote%2FshowVote.jsp");
                } else {
                    polls.setUrl("http://www.suining.gov.cn/wsdc?p_p_id=pollsvote_WAR_hdjlportlet&p_p_lifecycle=0&p_p_state=maximized&p_p_mode=view&p_p_col_id=column-2&p_p_col_pos=2&p_p_col_count=3&_pollsvote_WAR_hdjlportlet_pollsId=" + polls.getid()
                            + "&_pollsvote_WAR_hdjlportlet_jspPage=%2Fhtml%2Fpollsvote%2FshowVote.jsp");
                }
            }
            polls.setid(polls.getid() * 2 + polls.getid());
            System.out.println(polls.getUrl());

        }
        solrTemplate.saveBeans(list);
        solrTemplate.commit();
    }

    //在线访谈数据
    public void importHv() {

        System.out.println("fangtan......start ");

        try {
            HwadeeInterviewnoticeExample example = new HwadeeInterviewnoticeExample();

            List<HwadeeInterviewnotice> hwadeeInterviewnotices = interviewnoticeMapper.selectByExample(example);
            System.out.println(hwadeeInterviewnotices.size());




            for (HwadeeInterviewnotice hwadeeInterviewnotice : hwadeeInterviewnotices) {



                Long groupid = hwadeeInterviewnotice.getGroupid();
                if (groupid != 0) {
                    Long l = mapper.selectout(groupid);
                    String s = virtualhostMapper.selectURL(l);
                    if (groupid == 10184) {
                        hwadeeInterviewnotice.setUrl("http://www.suining.gov.cn/zmhd?p_p_id=looklive_WAR_online_interviewportlet&p_p_lifecycle=0&p_p_state=maximized&p_p_mode=view&p_p_col_id=_118_INSTANCE_8GKtv9I9LPRl__column-1&p_p_col_count=1&_looklive_WAR_online_interviewportlet_jspPage=%2Fhtml%2Fcom%2Fhwadee%2Flooklive%2FrecordPreview.jsp&_looklive_WAR_online_interviewportlet_noticeId="+hwadeeInterviewnotice.getId());
                    } else if ( s == null ||s.equals("")) {
                        hwadeeInterviewnotice.setUrl("http://www.suining.gov.cn/zmhd?p_p_id=looklive_WAR_online_interviewportlet&p_p_lifecycle=0&p_p_state=maximized&p_p_mode=view&p_p_col_id=_118_INSTANCE_8GKtv9I9LPRl__column-1&p_p_col_count=1&_looklive_WAR_online_interviewportlet_jspPage=%2Fhtml%2Fcom%2Fhwadee%2Flooklive%2FrecordPreview.jsp&_looklive_WAR_online_interviewportlet_noticeId="+hwadeeInterviewnotice.getId());;
                    } else {
                         hwadeeInterviewnotice.setUrl("http://"+s+"/zmhd?p_p_id=looklive_WAR_online_interviewportlet&p_p_lifecycle=0&p_p_state=maximized&p_p_mode=view&p_p_col_id=_118_INSTANCE_8GKtv9I9LPRl__column-1&p_p_col_count=1&_looklive_WAR_online_interviewportlet_jspPage=%2Fhtml%2Fcom%2Fhwadee%2Flooklive%2FrecordPreview.jsp&_looklive_WAR_online_interviewportlet_noticeId="+hwadeeInterviewnotice.getId());;
                    }
                    System.out.println(hwadeeInterviewnotice.getUrl());
                }
                hwadeeInterviewnotice.setGroupname(groupMapper.getGroupName(groupid));
                hwadeeInterviewnotice.setId(hwadeeInterviewnotice.getId()+System.currentTimeMillis());

            }
            solrTemplate.saveBeans(hwadeeInterviewnotices);
            solrTemplate.commit();
        } catch (Exception e) {
            System.out.println("import HwadeeInterviewnotice. error");
            e.printStackTrace();
        }


    }

    //信箱数据导入
    public void importMa() {


        System.out.println("xinxiang......start");

        try {
            HwadeeMailboxExample mailboxExample = new HwadeeMailboxExample();

            List list = journalarticleMapper.selectGroupList();


            List<HwadeeMailbox> hwadeeMailboxes = mailboxMapper.selectByExample(mailboxExample);
            for (HwadeeMailbox hwadeeMailbox : hwadeeMailboxes) {
                Long groupid = hwadeeMailbox.getGroupid();

                if (groupid != 0) {
                    Long l = mapper.selectout(groupid);
                    String s = virtualhostMapper.selectURL(l);
                    if (groupid == 10184) {
                        hwadeeMailbox.setUrl("http://www.suining.gov.cn/zmhd?p_p_id=messagemailbox_WAR_hdjlportlet&p_p_lifecycle=0&p_p_state=maximized&p_p_mode=view&p_p_col_id=_118_INSTANCE_iNmVZ9vyk7As__column-3&p_p_col_count=1&_messagemailbox_WAR_hdjlportlet_flag=true&_messagemailbox_WAR_hdjlportlet_jspPage=%2Fhtml%2Fmessagemailbox%2FshowMessage.jsp&_messagemailbox_WAR_hdjlportlet_messageId=" + hwadeeMailbox.getid());

                    } else if (s == null || s.equals("")) {
                        hwadeeMailbox.setUrl("http://www.suining.gov.cn/zmhd?p_p_id=messagemailbox_WAR_hdjlportlet&p_p_lifecycle=0&p_p_state=maximized&p_p_mode=view&p_p_col_id=_118_INSTANCE_iNmVZ9vyk7As__column-3&p_p_col_count=1&_messagemailbox_WAR_hdjlportlet_flag=true&_messagemailbox_WAR_hdjlportlet_jspPage=%2Fhtml%2Fmessagemailbox%2FshowMessage.jsp&_messagemailbox_WAR_hdjlportlet_messageId=" + hwadeeMailbox.getid());
                    } else {
                        hwadeeMailbox.setUrl("http://" + s + "/zmhd?p_p_id=messagemailbox_WAR_hdjlportlet&p_p_lifecycle=0&p_p_state=maximized&p_p_mode=view&p_p_col_id=_118_INSTANCE_iNmVZ9vyk7As__column-3&p_p_col_count=1&_messagemailbox_WAR_hdjlportlet_flag=true&_messagemailbox_WAR_hdjlportlet_jspPage=%2Fhtml%2Fmessagemailbox%2FshowMessage.jsp&_messagemailbox_WAR_hdjlportlet_messageId=" + hwadeeMailbox.getid());

                    }


                }
            }
            solrTemplate.saveBeans(hwadeeMailboxes);

            solrTemplate.commit();
            System.out.println("xinxiang......end");

        } catch (Exception e) {
            System.out.println("import messagemailbox. error");
            e.printStackTrace();
        }

    }


    public void delete() {
        Query query = new SimpleQuery("hw_title:*");
        Query query2 = new SimpleQuery("hp_name:*");
        Query query1 = new SimpleQuery("hv_onlinetitle:*");
        Query queryma = new SimpleQuery("ma_title:*");

        solrTemplate.delete(query);
        solrTemplate.delete(query2);
        solrTemplate.delete(query1);
       solrTemplate.delete(queryma);
        solrTemplate.commit();
        System.out.println("删除数据");




    }






}
