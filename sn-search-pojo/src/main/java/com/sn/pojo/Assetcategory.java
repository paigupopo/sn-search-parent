package com.sn.pojo;

import java.io.Serializable;
import java.util.Date;

public class Assetcategory implements Serializable {
    private Long categoryid;

    private String uuid;

    private Long groupid;

    private Long companyid;

    private Long userid;

    private String username;

    private Date createdate;

    private Date modifieddate;

    private Long parentcategoryid;

    private Long leftcategoryid;

    private Long rightcategoryid;

    private String name;

    private String title;

    private String description;

    private Long vocabularyid;

    private static final long serialVersionUID = 1L;

    public Long getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Long categoryid) {
        this.categoryid = categoryid;
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

    public Long getParentcategoryid() {
        return parentcategoryid;
    }

    public void setParentcategoryid(Long parentcategoryid) {
        this.parentcategoryid = parentcategoryid;
    }

    public Long getLeftcategoryid() {
        return leftcategoryid;
    }

    public void setLeftcategoryid(Long leftcategoryid) {
        this.leftcategoryid = leftcategoryid;
    }

    public Long getRightcategoryid() {
        return rightcategoryid;
    }

    public void setRightcategoryid(Long rightcategoryid) {
        this.rightcategoryid = rightcategoryid;
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

    public Long getVocabularyid() {
        return vocabularyid;
    }

    public void setVocabularyid(Long vocabularyid) {
        this.vocabularyid = vocabularyid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", categoryid=").append(categoryid);
        sb.append(", uuid=").append(uuid);
        sb.append(", groupid=").append(groupid);
        sb.append(", companyid=").append(companyid);
        sb.append(", userid=").append(userid);
        sb.append(", username=").append(username);
        sb.append(", createdate=").append(createdate);
        sb.append(", modifieddate=").append(modifieddate);
        sb.append(", parentcategoryid=").append(parentcategoryid);
        sb.append(", leftcategoryid=").append(leftcategoryid);
        sb.append(", rightcategoryid=").append(rightcategoryid);
        sb.append(", name=").append(name);
        sb.append(", title=").append(title);
        sb.append(", description=").append(description);
        sb.append(", vocabularyid=").append(vocabularyid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}