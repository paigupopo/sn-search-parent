package com.sn.pojo;

import org.apache.solr.client.solrj.beans.Field;

import java.io.Serializable;

public class CmsGovaffairsimportrecord implements Serializable {

    @Field
    private Long id;

    @Field("cmg_gatype")
    private String gatype;

    @Field("cmg_title")
    private String title;

    @Field("cmg_url")
    private String url;

    @Field("cmg_groupid")
    private Long groupid;

    private Long status;

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
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

    public String getGatype() {
        return gatype;
    }

    public void setGatype(String gatype) {
        this.gatype = gatype == null ? null : gatype.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Long getGroupid() {
        return groupid;
    }

    public void setGroupid(Long groupid) {
        this.groupid = groupid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", gatype=").append(gatype);
        sb.append(", title=").append(title);
        sb.append(", url=").append(url);
        sb.append(", groupid=").append(groupid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}