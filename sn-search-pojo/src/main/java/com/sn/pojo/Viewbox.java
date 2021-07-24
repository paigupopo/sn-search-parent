package com.sn.pojo;

import org.apache.solr.client.solrj.beans.Field;

import java.io.Serializable;
import java.util.Date;

public class Viewbox implements Serializable {

    @Field
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Field("vb_fangtanbegintime")
    private Date fangtanbegintime;

    private Date fangtanendtime;

    private String fangtanname;

    private Integer status;

    @Field("vb_siteid")
    private Long siteid;

    private String diziid;

    @Field("vb_content")
    private String content;

    private String jiab;

    private String zcshow;

    @Field("vb_fangtanbj")
    private String fangtanbj;

    private String fangtanms;

    private String gongkaisx;

    private String gongkaifw;

    private String gongkaicx;

    private String zherenbm;

    @Field("vb_url")
    private  String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private static final long serialVersionUID = 1L;


    public Date getFangtanbegintime() {
        return fangtanbegintime;
    }

    public void setFangtanbegintime(Date fangtanbegintime) {
        this.fangtanbegintime = fangtanbegintime;
    }

    public Date getFangtanendtime() {
        return fangtanendtime;
    }

    public void setFangtanendtime(Date fangtanendtime) {
        this.fangtanendtime = fangtanendtime;
    }

    public String getFangtanname() {
        return fangtanname;
    }

    public void setFangtanname(String fangtanname) {
        this.fangtanname = fangtanname == null ? null : fangtanname.trim();
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

    public String getDiziid() {
        return diziid;
    }

    public void setDiziid(String diziid) {
        this.diziid = diziid == null ? null : diziid.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getJiab() {
        return jiab;
    }

    public void setJiab(String jiab) {
        this.jiab = jiab == null ? null : jiab.trim();
    }

    public String getZcshow() {
        return zcshow;
    }

    public void setZcshow(String zcshow) {
        this.zcshow = zcshow == null ? null : zcshow.trim();
    }

    public String getFangtanbj() {
        return fangtanbj;
    }

    public void setFangtanbj(String fangtanbj) {
        this.fangtanbj = fangtanbj == null ? null : fangtanbj.trim();
    }

    public String getFangtanms() {
        return fangtanms;
    }

    public void setFangtanms(String fangtanms) {
        this.fangtanms = fangtanms == null ? null : fangtanms.trim();
    }

    public String getGongkaisx() {
        return gongkaisx;
    }

    public void setGongkaisx(String gongkaisx) {
        this.gongkaisx = gongkaisx == null ? null : gongkaisx.trim();
    }

    public String getGongkaifw() {
        return gongkaifw;
    }

    public void setGongkaifw(String gongkaifw) {
        this.gongkaifw = gongkaifw == null ? null : gongkaifw.trim();
    }

    public String getGongkaicx() {
        return gongkaicx;
    }

    public void setGongkaicx(String gongkaicx) {
        this.gongkaicx = gongkaicx == null ? null : gongkaicx.trim();
    }

    public String getZherenbm() {
        return zherenbm;
    }

    public void setZherenbm(String zherenbm) {
        this.zherenbm = zherenbm == null ? null : zherenbm.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fangtanid=").append(id);
        sb.append(", fangtanbegintime=").append(fangtanbegintime);
        sb.append(", fangtanendtime=").append(fangtanendtime);
        sb.append(", fangtanname=").append(fangtanname);
        sb.append(", status=").append(status);
        sb.append(", siteid=").append(siteid);
        sb.append(", diziid=").append(diziid);
        sb.append(", content=").append(content);
        sb.append(", jiab=").append(jiab);
        sb.append(", zcshow=").append(zcshow);
        sb.append(", fangtanbj=").append(fangtanbj);
        sb.append(", fangtanms=").append(fangtanms);
        sb.append(", gongkaisx=").append(gongkaisx);
        sb.append(", gongkaifw=").append(gongkaifw);
        sb.append(", gongkaicx=").append(gongkaicx);
        sb.append(", zherenbm=").append(zherenbm);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}