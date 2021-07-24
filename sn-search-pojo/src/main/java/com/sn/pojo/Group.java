package com.sn.pojo;

import java.io.Serializable;

public class Group implements Serializable {
    private Long groupid;

    private String uuid;

    private Long companyid;

    private Long creatoruserid;

    private Long classnameid;

    private Long classpk;

    private Long parentgroupid;

    private Long livegroupid;

    private String treepath;

    private String name;

    private String description;

    private Integer type;

    private String typesettings;

    private Byte manualmembership;

    private Integer membershiprestriction;

    private String friendlyurl;

    private Byte site;

    private Integer remotestaginggroupcount;

    private Byte active;

    private static final long serialVersionUID = 1L;

    public Long getGroupid() {
        return groupid;
    }

    public void setGroupid(Long groupid) {
        this.groupid = groupid;
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

    public Long getCreatoruserid() {
        return creatoruserid;
    }

    public void setCreatoruserid(Long creatoruserid) {
        this.creatoruserid = creatoruserid;
    }

    public Long getClassnameid() {
        return classnameid;
    }

    public void setClassnameid(Long classnameid) {
        this.classnameid = classnameid;
    }

    public Long getClasspk() {
        return classpk;
    }

    public void setClasspk(Long classpk) {
        this.classpk = classpk;
    }

    public Long getParentgroupid() {
        return parentgroupid;
    }

    public void setParentgroupid(Long parentgroupid) {
        this.parentgroupid = parentgroupid;
    }

    public Long getLivegroupid() {
        return livegroupid;
    }

    public void setLivegroupid(Long livegroupid) {
        this.livegroupid = livegroupid;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTypesettings() {
        return typesettings;
    }

    public void setTypesettings(String typesettings) {
        this.typesettings = typesettings == null ? null : typesettings.trim();
    }

    public Byte getManualmembership() {
        return manualmembership;
    }

    public void setManualmembership(Byte manualmembership) {
        this.manualmembership = manualmembership;
    }

    public Integer getMembershiprestriction() {
        return membershiprestriction;
    }

    public void setMembershiprestriction(Integer membershiprestriction) {
        this.membershiprestriction = membershiprestriction;
    }

    public String getFriendlyurl() {
        return friendlyurl;
    }

    public void setFriendlyurl(String friendlyurl) {
        this.friendlyurl = friendlyurl == null ? null : friendlyurl.trim();
    }

    public Byte getSite() {
        return site;
    }

    public void setSite(Byte site) {
        this.site = site;
    }

    public Integer getRemotestaginggroupcount() {
        return remotestaginggroupcount;
    }

    public void setRemotestaginggroupcount(Integer remotestaginggroupcount) {
        this.remotestaginggroupcount = remotestaginggroupcount;
    }

    public Byte getActive() {
        return active;
    }

    public void setActive(Byte active) {
        this.active = active;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", groupid=").append(groupid);
        sb.append(", uuid=").append(uuid);
        sb.append(", companyid=").append(companyid);
        sb.append(", creatoruserid=").append(creatoruserid);
        sb.append(", classnameid=").append(classnameid);
        sb.append(", classpk=").append(classpk);
        sb.append(", parentgroupid=").append(parentgroupid);
        sb.append(", livegroupid=").append(livegroupid);
        sb.append(", treepath=").append(treepath);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", type=").append(type);
        sb.append(", typesettings=").append(typesettings);
        sb.append(", manualmembership=").append(manualmembership);
        sb.append(", membershiprestriction=").append(membershiprestriction);
        sb.append(", friendlyurl=").append(friendlyurl);
        sb.append(", site=").append(site);
        sb.append(", remotestaginggroupcount=").append(remotestaginggroupcount);
        sb.append(", active=").append(active);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}