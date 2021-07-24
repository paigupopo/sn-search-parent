package com.sn.pojo;

import org.apache.solr.client.solrj.beans.Field;

import java.io.Serializable;
import java.util.Date;

public class Cmspublishedarticle implements Serializable {
    @Field
    private long id;


    private Long resourceprimkey;

    private Long refererresourceprimkey;

    private Integer status;
    @Field("cm_groupid")
    private Long groupid;

    private Long categoryid;

    private Long plid;

    private Date displaydate;

    private Long userid;

    @Field("cm_username")
    private String username;

    @Field("cm_title")
    private String title;

    private String urltitle;

    private String mobiletitle;

    @Field("cm_url")
    private String url;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    @Field("cm_content")
    private String content;

    @Field("cm_createdate")
    private Date createdate;

    private static final long serialVersionUID = 1L;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getResourceprimkey() {
        return resourceprimkey;
    }

    public void setResourceprimkey(Long resourceprimkey) {
        this.resourceprimkey = resourceprimkey;
    }

    public Long getRefererresourceprimkey() {
        return refererresourceprimkey;
    }

    public void setRefererresourceprimkey(Long refererresourceprimkey) {
        this.refererresourceprimkey = refererresourceprimkey;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getGroupid() {
        return groupid;
    }

    public void setGroupid(Long groupid) {
        this.groupid = groupid;
    }

    public Long getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Long categoryid) {
        this.categoryid = categoryid;
    }

    public Long getPlid() {
        return plid;
    }

    public void setPlid(Long plid) {
        this.plid = plid;
    }

    public Date getDisplaydate() {
        return displaydate;
    }

    public void setDisplaydate(Date displaydate) {
        this.displaydate = displaydate;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getUrltitle() {
        return urltitle;
    }

    public void setUrltitle(String urltitle) {
        this.urltitle = urltitle == null ? null : urltitle.trim();
    }

    public String getMobiletitle() {
        return mobiletitle;
    }

    public void setMobiletitle(String mobiletitle) {
        this.mobiletitle = mobiletitle == null ? null : mobiletitle.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", resourceprimkey=").append(resourceprimkey);
        sb.append(", refererresourceprimkey=").append(refererresourceprimkey);
        sb.append(", status=").append(status);
        sb.append(", groupid=").append(groupid);
        sb.append(", categoryid=").append(categoryid);
        sb.append(", plid=").append(plid);
        sb.append(", displaydate=").append(displaydate);
        sb.append(", userid=").append(userid);
        sb.append(", username=").append(username);
        sb.append(", title=").append(title);
        sb.append(", urltitle=").append(urltitle);
        sb.append(", mobiletitle=").append(mobiletitle);
        sb.append(", url=").append(url);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}