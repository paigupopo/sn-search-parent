package com.sn.pojo;

import org.apache.solr.client.solrj.beans.Field;

import java.io.Serializable;
import java.util.Date;

public class HwadeeInterviewnotice implements Serializable {
    @Field
    private Long id;

    @Field("hv_groupid")
    private Long groupid;

    @Field("hv_groupname")
    private String groupname;

    private Integer onlinestate;

    @Field("hv_onlinetime")
    private Date onlinedate;

    private String onlinetime;

    private String onlineguest;

    @Field("hv_onlinetitle")
    private String onlinetitle;

    private String onlinedepart;

    @Field("hv_remark")
    private String remark;

    @Field("hv_url")
    private String imgurl;

    private Integer ispush;

    private Integer noticetype;

    private Integer noticestate;

    private Integer istop;

    private Integer isvalid;

    private Integer isdeleted;

    private String creater;


    private Date updatedate;

    @Field("hv_url")
    private String url;

    private static final long serialVersionUID = 1L;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getGroupid() {
        return groupid;
    }

    public void setGroupid(Long groupid) {
        this.groupid = groupid;
    }

    public Integer getOnlinestate() {
        return onlinestate;
    }

    public void setOnlinestate(Integer onlinestate) {
        this.onlinestate = onlinestate;
    }

    public Date getOnlinedate() {
        return onlinedate;
    }

    public void setOnlinedate(Date onlinedate) {
        this.onlinedate = onlinedate;
    }

    public String getOnlinetime() {
        return onlinetime;
    }

    public void setOnlinetime(String onlinetime) {
        this.onlinetime = onlinetime == null ? null : onlinetime.trim();
    }

    public String getOnlineguest() {
        return onlineguest;
    }

    public void setOnlineguest(String onlineguest) {
        this.onlineguest = onlineguest == null ? null : onlineguest.trim();
    }

    public String getOnlinetitle() {
        return onlinetitle;
    }

    public void setOnlinetitle(String onlinetitle) {
        this.onlinetitle = onlinetitle == null ? null : onlinetitle.trim();
    }

    public String getOnlinedepart() {
        return onlinedepart;
    }

    public void setOnlinedepart(String onlinedepart) {
        this.onlinedepart = onlinedepart == null ? null : onlinedepart.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public Integer getIspush() {
        return ispush;
    }

    public void setIspush(Integer ispush) {
        this.ispush = ispush;
    }

    public Integer getNoticetype() {
        return noticetype;
    }

    public void setNoticetype(Integer noticetype) {
        this.noticetype = noticetype;
    }

    public Integer getNoticestate() {
        return noticestate;
    }

    public void setNoticestate(Integer noticestate) {
        this.noticestate = noticestate;
    }

    public Integer getIstop() {
        return istop;
    }

    public void setIstop(Integer istop) {
        this.istop = istop;
    }

    public Integer getIsvalid() {
        return isvalid;
    }

    public void setIsvalid(Integer isvalid) {
        this.isvalid = isvalid;
    }

    public Integer getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Integer isdeleted) {
        this.isdeleted = isdeleted;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
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
        sb.append(", noticeid=").append(id);
        sb.append(", groupid=").append(groupid);
        sb.append(", onlinestate=").append(onlinestate);
        sb.append(", onlinedate=").append(onlinedate);
        sb.append(", onlinetime=").append(onlinetime);
        sb.append(", onlineguest=").append(onlineguest);
        sb.append(", onlinetitle=").append(onlinetitle);
        sb.append(", onlinedepart=").append(onlinedepart);
        sb.append(", remark=").append(remark);
        sb.append(", imgurl=").append(imgurl);
        sb.append(", ispush=").append(ispush);
        sb.append(", noticetype=").append(noticetype);
        sb.append(", noticestate=").append(noticestate);
        sb.append(", istop=").append(istop);
        sb.append(", isvalid=").append(isvalid);
        sb.append(", isdeleted=").append(isdeleted);
        sb.append(", creater=").append(creater);
        sb.append(", updatedate=").append(updatedate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}