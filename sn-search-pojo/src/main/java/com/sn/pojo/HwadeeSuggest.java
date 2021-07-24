package com.sn.pojo;

import org.apache.solr.client.solrj.beans.Field;

import java.io.Serializable;
import java.util.Date;

public class HwadeeSuggest implements Serializable {
    @Field
    private Long id;

    @Field("hw_title")
    private String title;

    @Field("hw_content")
    private String content;

    @Field("hw_url")
    private String url;

    @Field("hw_time")
    private Date time;

    private String starttime;

    private String endtime;

    @Field("hw_group")
    private Long group;

    @Field("hw_groupname")
    private String groupname;

    private Long userid;

    private Long number;

    private Long totnumber;

    private Long status;

    private String reason;

    private String reasontwo;

    private Long beiyong2;

    private Long beiyong3;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime == null ? null : starttime.trim();
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }

    public Long getGroup() {
        return group;
    }

    public void setGroup(Long group) {
        this.group = group;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Long getTotnumber() {
        return totnumber;
    }

    public void setTotnumber(Long totnumber) {
        this.totnumber = totnumber;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getReasontwo() {
        return reasontwo;
    }

    public void setReasontwo(String reasontwo) {
        this.reasontwo = reasontwo == null ? null : reasontwo.trim();
    }

    public Long getBeiyong2() {
        return beiyong2;
    }

    public void setBeiyong2(Long beiyong2) {
        this.beiyong2 = beiyong2;
    }

    public Long getBeiyong3() {
        return beiyong3;
    }

    public void setBeiyong3(Long beiyong3) {
        this.beiyong3 = beiyong3;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", content=").append(content);
        sb.append(", time=").append(time);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", group=").append(group);
        sb.append(", userid=").append(userid);
        sb.append(", number=").append(number);
        sb.append(", totnumber=").append(totnumber);
        sb.append(", status=").append(status);
        sb.append(", reason=").append(reason);
        sb.append(", reasontwo=").append(reasontwo);
        sb.append(", beiyong2=").append(beiyong2);
        sb.append(", beiyong3=").append(beiyong3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}