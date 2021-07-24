package com.sn.pojo;

import org.apache.solr.client.solrj.beans.Field;

import java.io.Serializable;
import java.util.Date;

public class QaDialogue implements Serializable {


    @Field
    private Integer id;

    @Field("qad_title")
    private String qadTitle;

    private Date qadCreatetime;

    @Field("qad_content")
    private String qadContent;

    private Integer qadState;

    private Date qadUpdatetime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getQadId() {
        return id;
    }

    public void setQadId(Integer qadId) {
        this.id = qadId;
    }

    public String getQadTitle() {
        return qadTitle;
    }

    public void setQadTitle(String qadTitle) {
        this.qadTitle = qadTitle == null ? null : qadTitle.trim();
    }

    public Date getQadCreatetime() {
        return qadCreatetime;
    }

    public void setQadCreatetime(Date qadCreatetime) {
        this.qadCreatetime = qadCreatetime;
    }

    public String getQadContent() {
        return qadContent;
    }

    public void setQadContent(String qadContent) {
        this.qadContent = qadContent == null ? null : qadContent.trim();
    }

    public Integer getQadState() {
        return qadState;
    }

    public void setQadState(Integer qadState) {
        this.qadState = qadState;
    }

    public Date getQadUpdatetime() {
        return qadUpdatetime;
    }

    public void setQadUpdatetime(Date qadUpdatetime) {
        this.qadUpdatetime = qadUpdatetime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", qadId=").append(id);
        sb.append(", qadTitle=").append(qadTitle);
        sb.append(", qadCreatetime=").append(qadCreatetime);
        sb.append(", qadContent=").append(qadContent);
        sb.append(", qadState=").append(qadState);
        sb.append(", qadUpdatetime=").append(qadUpdatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}