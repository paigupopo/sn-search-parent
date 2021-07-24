package com.sn.pojo;

import java.io.Serializable;
import java.util.Date;

public class CmsGovernmenthotsiterm implements Serializable {
    private Long itemid;

    private Long id;

    private Date hotdate;

    private String cityaddress;

    private String hotresource;

    private Long groupid;

    private String domainurl;

    private Integer itemcount;

    private String govHotName;

    private  CmsNationalregion cmsNationalregion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGovHotName() {
        return govHotName;
    }

    public void setGovHotName(String govHotName) {
        this.govHotName = govHotName;
    }


    public CmsNationalregion getCmsNationalregion() {
        return cmsNationalregion;
    }

    public void setCmsNationalregion(CmsNationalregion cmsNationalregion) {
        this.cmsNationalregion = cmsNationalregion;
    }

    public String getGovhotName() {
        return govHotName;
    }

    public void setGovhotName(String govhotName) {
        this.govHotName = govhotName;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    private static final long serialVersionUID = 1L;

    public Long getItemid() {
        return itemid;
    }

    public void setItemid(Long itemid) {
        this.itemid = itemid;
    }

    public Long getGovhotid() {
        return id;
    }

    public void setGovhotid(Long govhotid) {
        this.id = govhotid;
    }

    public Date getHotdate() {
        return hotdate;
    }

    public void setHotdate(Date hotdate) {
        this.hotdate = hotdate;
    }

    public String getCityaddress() {
        return cityaddress;
    }

    public void setCityaddress(String cityaddress) {
        this.cityaddress = cityaddress == null ? null : cityaddress.trim();
    }

    public String getHotresource() {
        return hotresource;
    }

    public void setHotresource(String hotresource) {
        this.hotresource = hotresource == null ? null : hotresource.trim();
    }

    public Long getGroupid() {
        return groupid;
    }

    public void setGroupid(Long groupid) {
        this.groupid = groupid;
    }

    public String getDomainurl() {
        return domainurl;
    }

    public void setDomainurl(String domainurl) {
        this.domainurl = domainurl == null ? null : domainurl.trim();
    }

    public Integer getItemcount() {
        return itemcount;
    }

    public void setItemcount(Integer itemcount) {
        this.itemcount = itemcount;
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", itemid=").append(itemid);
        sb.append(", govhotid=").append(id);
        sb.append(", hotdate=").append(hotdate);
        sb.append(", cityaddress=").append(cityaddress);
        sb.append(", hotresource=").append(hotresource);
        sb.append(", groupid=").append(groupid);
        sb.append(", domainurl=").append(domainurl);
        sb.append(", itemcount=").append(itemcount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}