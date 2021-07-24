package com.sn.pojo;

import org.apache.solr.client.solrj.beans.Field;

import java.io.Serializable;
import java.util.Date;

public class HwadeePolls implements Serializable {

    @Field
    private  Long id;


    private String polltype;

    @Field("hp_name")
    private String name;

    @Field("hp_starttime")
    private Date starttime;

    private Date endtime;

    private String createperson;

    private Date createtime;

    private Integer status;

    private Long siteid;

    private Long pass;

    private String reason;

    private Integer isallowrepeatvote;

    @Field("hp_url")
    private  String url;

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

    public Long getid() {
        return id;
    }

    public void setid(Long id) {
        this.id = id;
    }

    public String getPolltype() {
        return polltype;
    }

    public void setPolltype(String polltype) {
        this.polltype = polltype == null ? null : polltype.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getCreateperson() {
        return createperson;
    }

    public void setCreateperson(String createperson) {
        this.createperson = createperson == null ? null : createperson.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getSiteid() {
        return siteid;
    }

    public void setSiteid(Long siteid) {
        this.siteid = siteid;
    }

    public Long getPass() {
        return pass;
    }

    public void setPass(Long pass) {
        this.pass = pass;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Integer getIsallowrepeatvote() {
        return isallowrepeatvote;
    }

    public void setIsallowrepeatvote(Integer isallowrepeatvote) {
        this.isallowrepeatvote = isallowrepeatvote;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", polltype=").append(polltype);
        sb.append(", name=").append(name);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", createperson=").append(createperson);
        sb.append(", createtime=").append(createtime);
        sb.append(", status=").append(status);
        sb.append(", siteid=").append(siteid);
        sb.append(", pass=").append(pass);
        sb.append(", reason=").append(reason);
        sb.append(", isallowrepeatvote=").append(isallowrepeatvote);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}