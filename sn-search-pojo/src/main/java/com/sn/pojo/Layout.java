package com.sn.pojo;

import java.io.Serializable;
import java.util.Date;

public class Layout implements Serializable {
    private Long plid;

    private String uuid;

    private Long groupid;

    private Long companyid;

    private Long userid;

    private String username;

    private Date createdate;

    private Date modifieddate;

    private Long privatelayout;

    private Long layoutid;

    private Long parentlayoutid;

    private String name;

    private String title;

    private String description;

    private String keywords;

    private String robots;

    private String type;

    private String typesettings;

    private Byte hidden;

    private String friendlyurl;

    private Byte iconimage;

    private Long iconimageid;

    private String themeid;

    private String colorschemeid;

    private String wapthemeid;

    private String wapcolorschemeid;

    private String css;

    private Integer priority;

    private String layoutprototypeuuid;

    private Byte layoutprototypelinkenabled;

    private String sourceprototypelayoutuuid;

    private  Cmspublishedarticle cmspublishedarticle;

    public Cmspublishedarticle getCmspublishedarticle() {
        return cmspublishedarticle;
    }

    public void setCmspublishedarticle(Cmspublishedarticle cmspublishedarticle) {
        this.cmspublishedarticle = cmspublishedarticle;
    }

    private static final long serialVersionUID = 1L;

    public Long getPlid() {
        return plid;
    }

    public void setPlid(Long plid) {
        this.plid = plid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
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

    public Long getPrivatelayout() {
        return privatelayout;
    }

    public void setPrivatelayout(Long privatelayout) {
        this.privatelayout = privatelayout;
    }

    public Long getLayoutid() {
        return layoutid;
    }

    public void setLayoutid(Long layoutid) {
        this.layoutid = layoutid;
    }

    public Long getParentlayoutid() {
        return parentlayoutid;
    }

    public void setParentlayoutid(Long parentlayoutid) {
        this.parentlayoutid = parentlayoutid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getRobots() {
        return robots;
    }

    public void setRobots(String robots) {
        this.robots = robots == null ? null : robots.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getTypesettings() {
        return typesettings;
    }

    public void setTypesettings(String typesettings) {
        this.typesettings = typesettings == null ? null : typesettings.trim();
    }

    public Byte getHidden() {
        return hidden;
    }

    public void setHidden(Byte hidden) {
        this.hidden = hidden;
    }

    public String getFriendlyurl() {
        return friendlyurl;
    }

    public void setFriendlyurl(String friendlyurl) {
        this.friendlyurl = friendlyurl == null ? null : friendlyurl.trim();
    }

    public Byte getIconimage() {
        return iconimage;
    }

    public void setIconimage(Byte iconimage) {
        this.iconimage = iconimage;
    }

    public Long getIconimageid() {
        return iconimageid;
    }

    public void setIconimageid(Long iconimageid) {
        this.iconimageid = iconimageid;
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

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getLayoutprototypeuuid() {
        return layoutprototypeuuid;
    }

    public void setLayoutprototypeuuid(String layoutprototypeuuid) {
        this.layoutprototypeuuid = layoutprototypeuuid == null ? null : layoutprototypeuuid.trim();
    }

    public Byte getLayoutprototypelinkenabled() {
        return layoutprototypelinkenabled;
    }

    public void setLayoutprototypelinkenabled(Byte layoutprototypelinkenabled) {
        this.layoutprototypelinkenabled = layoutprototypelinkenabled;
    }

    public String getSourceprototypelayoutuuid() {
        return sourceprototypelayoutuuid;
    }

    public void setSourceprototypelayoutuuid(String sourceprototypelayoutuuid) {
        this.sourceprototypelayoutuuid = sourceprototypelayoutuuid == null ? null : sourceprototypelayoutuuid.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", plid=").append(plid);
        sb.append(", uuid=").append(uuid);
        sb.append(", groupid=").append(groupid);
        sb.append(", companyid=").append(companyid);
        sb.append(", userid=").append(userid);
        sb.append(", username=").append(username);
        sb.append(", createdate=").append(createdate);
        sb.append(", modifieddate=").append(modifieddate);
        sb.append(", privatelayout=").append(privatelayout);
        sb.append(", layoutid=").append(layoutid);
        sb.append(", parentlayoutid=").append(parentlayoutid);
        sb.append(", name=").append(name);
        sb.append(", title=").append(title);
        sb.append(", description=").append(description);
        sb.append(", keywords=").append(keywords);
        sb.append(", robots=").append(robots);
        sb.append(", type=").append(type);
        sb.append(", typesettings=").append(typesettings);
        sb.append(", hidden=").append(hidden);
        sb.append(", friendlyurl=").append(friendlyurl);
        sb.append(", iconimage=").append(iconimage);
        sb.append(", iconimageid=").append(iconimageid);
        sb.append(", themeid=").append(themeid);
        sb.append(", colorschemeid=").append(colorschemeid);
        sb.append(", wapthemeid=").append(wapthemeid);
        sb.append(", wapcolorschemeid=").append(wapcolorschemeid);
        sb.append(", css=").append(css);
        sb.append(", priority=").append(priority);
        sb.append(", layoutprototypeuuid=").append(layoutprototypeuuid);
        sb.append(", layoutprototypelinkenabled=").append(layoutprototypelinkenabled);
        sb.append(", sourceprototypelayoutuuid=").append(sourceprototypelayoutuuid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}