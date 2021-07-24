package com.sn.pojo;

import java.io.Serializable;

public class Classname implements Serializable {
    private Long classnameid;

    private String value;

    private static final long serialVersionUID = 1L;

    public Long getClassnameid() {
        return classnameid;
    }

    public void setClassnameid(Long classnameid) {
        this.classnameid = classnameid;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", classnameid=").append(classnameid);
        sb.append(", value=").append(value);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}