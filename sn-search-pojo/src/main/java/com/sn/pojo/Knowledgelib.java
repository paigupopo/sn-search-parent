package com.sn.pojo;

import org.apache.solr.client.solrj.beans.Field;

import java.io.Serializable;
import java.util.Date;

public class Knowledgelib implements Serializable {
    @Field
    private Integer id;

    private Date qaklRecordcreatetime;

    @Field("qakl_title")
    private String qaklTitle;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Field("qakl_content")
    private String qaklContent;

    private Integer qaklVisitcount;

    @Field("qakl_state")
    private Integer qaklState;

    private static final long serialVersionUID = 1L;

    public Integer getQaklRevision() {
        return id;
    }

    public void setQaklRevision(Integer qaklRevision) {
        this.id = qaklRevision;
    }

    public Date getQaklRecordcreatetime() {
        return qaklRecordcreatetime;
    }

    public void setQaklRecordcreatetime(Date qaklRecordcreatetime) {
        this.qaklRecordcreatetime = qaklRecordcreatetime;
    }

    public String getQaklTitle() {
        return qaklTitle;
    }

    public void setQaklTitle(String qaklTitle) {
        this.qaklTitle = qaklTitle == null ? null : qaklTitle.trim();
    }

    public String getQaklContent() {
        return qaklContent;
    }

    public void setQaklContent(String qaklContent) {
        this.qaklContent = qaklContent == null ? null : qaklContent.trim();
    }

    public Integer getQaklVisitcount() {
        return qaklVisitcount;
    }

    public void setQaklVisitcount(Integer qaklVisitcount) {
        this.qaklVisitcount = qaklVisitcount;
    }

    public Integer getQaklState() {
        return qaklState;
    }

    public void setQaklState(Integer qaklState) {
        this.qaklState = qaklState;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", qaklRevision=").append(id);
        sb.append(", qaklRecordcreatetime=").append(qaklRecordcreatetime);
        sb.append(", qaklTitle=").append(qaklTitle);
        sb.append(", qaklContent=").append(qaklContent);
        sb.append(", qaklVisitcount=").append(qaklVisitcount);
        sb.append(", qaklState=").append(qaklState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}