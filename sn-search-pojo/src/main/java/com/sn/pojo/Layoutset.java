package com.sn.pojo;

import java.io.Serializable;
import java.util.Date;

public class Layoutset implements Serializable {
    private Long layoutsetid;

    private Long groupid;

    private Long companyid;

    private Date createdate;

    private Date modifieddate;

    private Byte privatelayout;

    private Byte logo;

    private Long logoid;

    private String themeid;

    private String colorschemeid;

    private String wapthemeid;

    private String wapcolorschemeid;

    private String css;

    private Integer pagecount;

    private String layoutsetprototypeuuid;

    private Byte layoutsetprototypelinkenabled;

    private String settings;



    private static final long serialVersionUID = 1L;

    public Long getLayoutsetid() {
        return layoutsetid;
    }

    public void setLayoutsetid(Long layoutsetid) {
        this.layoutsetid = layoutsetid;
    }

    public Long getGroupid() {
        return groupid;
    }

    public void setGroupid(Long groupid) {
        this.groupid = groupid;
    }

    public Long getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Long companyid) {
        this.companyid = companyid;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getModifieddate() {
        return modifieddate;
    }

    public void setModifieddate(Date modifieddate) {
        this.modifieddate = modifieddate;
    }

    public Byte getPrivatelayout() {
        return privatelayout;
    }

    public void setPrivatelayout(Byte privatelayout) {
        this.privatelayout = privatelayout;
    }

    public Byte getLogo() {
        return logo;
    }

    public void setLogo(Byte logo) {
        this.logo = logo;
    }

    public Long getLogoid() {
        return logoid;
    }

    public void setLogoid(Long logoid) {
        this.logoid = logoid;
    }

    public String getThemeid() {
        return themeid;
    }

    public void setThemeid(String themeid) {
        this.themeid = themeid == null ? null : themeid.trim();
    }

    public String getColorschemeid() {
        return colorschemeid;
    }

    public void setColorschemeid(String colorschemeid) {
        this.colorschemeid = colorschemeid == null ? null : colorschemeid.trim();
    }

    public String getWapthemeid() {
        return wapthemeid;
    }

    public void setWapthemeid(String wapthemeid) {
        this.wapthemeid = wapthemeid == null ? null : wapthemeid.trim();
    }

    public String getWapcolorschemeid() {
        return wapcolorschemeid;
    }

    public void setWapcolorschemeid(String wapcolorschemeid) {
        this.wapcolorschemeid = wapcolorschemeid == null ? null : wapcolorschemeid.trim();
    }

    public String getCss() {
        return css;
    }

    public void setCss(String css) {
        this.css = css == null ? null : css.trim();
    }

    public Integer getPagecount() {
        return pagecount;
    }

    public void setPagecount(Integer pagecount) {
        this.pagecount = pagecount;
    }

    public String getLayoutsetprototypeuuid() {
        return layoutsetprototypeuuid;
    }

    public void setLayoutsetprototypeuuid(String layoutsetprototypeuuid) {
        this.layoutsetprototypeuuid = layoutsetprototypeuuid == null ? null : layoutsetprototypeuuid.trim();
    }

    public Byte getLayoutsetprototypelinkenabled() {
        return layoutsetprototypelinkenabled;
    }

    public void setLayoutsetprototypelinkenabled(Byte layoutsetprototypelinkenabled) {
        this.layoutsetprototypelinkenabled = layoutsetprototypelinkenabled;
    }

    public String getSettings() {
        return settings;
    }

    public void setSettings(String settings) {
        this.settings = settings == null ? null : settings.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", layoutsetid=").append(layoutsetid);
        sb.append(", groupid=").append(groupid);
        sb.append(", companyid=").append(companyid);
        sb.append(", createdate=").append(createdate);
        sb.append(", modifieddate=").append(modifieddate);
        sb.append(", privatelayout=").append(privatelayout);
        sb.append(", logo=").append(logo);
        sb.append(", logoid=").append(logoid);
        sb.append(", themeid=").append(themeid);
        sb.append(", colorschemeid=").append(colorschemeid);
        sb.append(", wapthemeid=").append(wapthemeid);
        sb.append(", wapcolorschemeid=").append(wapcolorschemeid);
        sb.append(", css=").append(css);
        sb.append(", pagecount=").append(pagecount);
        sb.append(", layoutsetprototypeuuid=").append(layoutsetprototypeuuid);
        sb.append(", layoutsetprototypelinkenabled=").append(layoutsetprototypelinkenabled);
        sb.append(", settings=").append(settings);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}