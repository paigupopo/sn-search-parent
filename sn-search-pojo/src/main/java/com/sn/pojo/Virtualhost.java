package com.sn.pojo;

import java.io.Serializable;

public class Virtualhost implements Serializable {
    private Long virtualhostid;

    private Long companyid;

    private Long layoutsetid;

    private String hostname;

    private static final long serialVersionUID = 1L;

    public Long getVirtualhostid() {
        return virtualhostid;
    }

    public void setVirtualhostid(Long virtualhostid) {
        this.virtualhostid = virtualhostid;
    }

    public Long getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Long companyid) {
        this.companyid = companyid;
    }

    public Long getLayoutsetid() {
        return layoutsetid;
    }

    public void setLayoutsetid(Long layoutsetid) {
        this.layoutsetid = layoutsetid;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname == null ? null : hostname.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", virtualhostid=").append(virtualhostid);
        sb.append(", companyid=").append(companyid);
        sb.append(", layoutsetid=").append(layoutsetid);
        sb.append(", hostname=").append(hostname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}