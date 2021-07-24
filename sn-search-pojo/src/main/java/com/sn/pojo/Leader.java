package com.sn.pojo;

import org.apache.solr.client.solrj.beans.Field;

import java.io.Serializable;

public class Leader implements Serializable {


    @Field
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private Long qalId;

    @Field("qal_qalName")
    private String qalName;

    @Field("qal_qalResign")
    private String qalResign;

    @Field("qal_qalSynopsis")
    private String qalSynopsis;

    @Field("qal_qalResume")
    private String qalResume;

    @Field("qal_qalAchievement")
    private String qalAchievement;

    @Field("qal_qalWork")
    private String qalWork;

    @Field("qal_qalUrl")
    private String qalUrl;

    @Field("qal_qalImg")
    private String qalImg;

    private static final long serialVersionUID = 1L;



    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    public Long getQalId() {
        return qalId;
    }

    public void setQalId(Long qalId) {
        this.qalId = qalId;
    }

    public String getQalName() {
        return qalName;
    }

    public void setQalName(String qalName) {
        this.qalName = qalName == null ? null : qalName.trim();
    }

    public String getQalResign() {
        return qalResign;
    }

    public void setQalResign(String qalResign) {
        this.qalResign = qalResign == null ? null : qalResign.trim();
    }

    public String getQalSynopsis() {
        return qalSynopsis;
    }

    public void setQalSynopsis(String qalSynopsis) {
        this.qalSynopsis = qalSynopsis == null ? null : qalSynopsis.trim();
    }

    public String getQalResume() {
        return qalResume;
    }

    public void setQalResume(String qalResume) {
        this.qalResume = qalResume == null ? null : qalResume.trim();
    }

    public String getQalAchievement() {
        return qalAchievement;
    }

    public void setQalAchievement(String qalAchievement) {
        this.qalAchievement = qalAchievement == null ? null : qalAchievement.trim();
    }

    public String getQalWork() {
        return qalWork;
    }

    public void setQalWork(String qalWork) {
        this.qalWork = qalWork == null ? null : qalWork.trim();
    }

    public String getQalUrl() {
        return qalUrl;
    }

    public void setQalUrl(String qalUrl) {
        this.qalUrl = qalUrl == null ? null : qalUrl.trim();
    }

    public String getQalImg() {
        return qalImg;
    }

    public void setQalImg(String qalImg) {
        this.qalImg = qalImg == null ? null : qalImg.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", qalId=").append(qalId);
        sb.append(", qalName=").append(qalName);
        sb.append(", qalResign=").append(qalResign);
        sb.append(", qalSynopsis=").append(qalSynopsis);
        sb.append(", qalResume=").append(qalResume);
        sb.append(", qalAchievement=").append(qalAchievement);
        sb.append(", qalWork=").append(qalWork);
        sb.append(", qalUrl=").append(qalUrl);
        sb.append(", qalImg=").append(qalImg);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}