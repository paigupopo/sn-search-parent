package com.sn.pojo;

import java.io.Serializable;

public class CmsGovernmenthots implements Serializable {
    private Long govhotid;

    private String govhotname;

    private Integer govcustom;

    private CmsGovernmenthotsiterm cmsGovernmenthotsiterm;

    public CmsGovernmenthotsiterm getCmsGovernmenthotsiterm() {
        return cmsGovernmenthotsiterm;
    }

    public void setCmsGovernmenthotsiterm(CmsGovernmenthotsiterm cmsGovernmenthotsiterm) {
        this.cmsGovernmenthotsiterm = cmsGovernmenthotsiterm;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    private static final long serialVersionUID = 1L;

    public Long getGovhotid() {
        return govhotid;
    }

    public void setGovhotid(Long govhotid) {
        this.govhotid = govhotid;
    }

    public String getGovhotname() {
        return govhotname;
    }

    public void setGovhotname(String govhotname) {
        this.govhotname = govhotname == null ? null : govhotname.trim();
    }

    public Integer getGovcustom() {
        return govcustom;
    }

    public void setGovcustom(Integer govcustom) {
        this.govcustom = govcustom;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", govhotid=").append(govhotid);
        sb.append(", govhotname=").append(govhotname);
        sb.append(", govcustom=").append(govcustom);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}