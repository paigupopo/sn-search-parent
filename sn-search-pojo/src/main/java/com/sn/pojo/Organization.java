package com.sn.pojo;

import java.io.Serializable;
import java.util.Date;

public class Organization implements Serializable {
    private Long organizationid;

    private String uuid;

    private Long companyid;

    private Long userid;

    private String username;

    private Date createdate;

    private Date modifieddate;

    private Long parentorganizationid;

    private String treepath;

    private String name;

    private String type;

    private Byte recursable;

    private Long regionid;

    private Long countryid;

    private Integer statusid;

    private String comments;

    private static final long serialVersionUID = 1L;

    public Long getOrganizationid() {
        return organizationid;
    }

    public void setOrganizationid(Long organizationid) {
        this.organizationid = organizationid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
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

    public Long getParentorganizationid() {
        return parentorganizationid;
    }

    public void setParentorganizationid(Long parentorganizationid) {
        this.parentorganizationid = parentorganizationid;
    }

    public String getTreepath() {
        return treepath;
    }

    public void setTreepath(String treepath) {
        this.treepath = treepath == null ? null : treepath.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Byte getRecursable() {
        return recursable;
    }

    public void setRecursable(Byte recursable) {
        this.recursable = recursable;
    }

    public Long getRegionid() {
        return regionid;
    }

    public void setRegionid(Long regionid) {
        this.regionid = regionid;
    }

    public Long getCountryid() {
        return countryid;
    }

    public void setCountryid(Long countryid) {
        this.countryid = countryid;
    }

    public Integer getStatusid() {
        return statusid;
    }

    public void setStatusid(Integer statusid) {
        this.statusid = statusid;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", organizationid=").append(organizationid);
        sb.append(", uuid=").append(uuid);
        sb.append(", companyid=").append(companyid);
        sb.append(", userid=").append(userid);
        sb.append(", username=").append(username);
        sb.append(", createdate=").append(createdate);
        sb.append(", modifieddate=").append(modifieddate);
        sb.append(", parentorganizationid=").append(parentorganizationid);
        sb.append(", treepath=").append(treepath);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", recursable=").append(recursable);
        sb.append(", regionid=").append(regionid);
        sb.append(", countryid=").append(countryid);
        sb.append(", statusid=").append(statusid);
        sb.append(", comments=").append(comments);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}