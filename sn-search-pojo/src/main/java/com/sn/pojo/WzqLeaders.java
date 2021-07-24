package com.sn.pojo;

import org.apache.solr.client.solrj.beans.Field;

import java.io.Serializable;

public class WzqLeaders implements Serializable {
    @Field
    private Long id;

    @Field("qal_qalName")
    private String leadersname;

    private String sex;

    private String nation;

    private String birthdate;

    private String nativeplace;

    private String education;

    private String incumbent;

    @Field("qal_qalWork")
    private String work;

    private String photo;

    @Field("qal_qalImg")
    private String photobig;

    @Field("qal_qalSynopsis")
    private String resume;

    @Field("qal_qalResume")
    private String resumes;

    private Integer ordernub;

    @Field("qal_qalResign")
    private String remark;

    private String remark1;


    @Field("qal_qalUrl")
    private  String imgUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    private static final long serialVersionUID = 1L;

    public Long getLeadersid() {
        return id;
    }

    public void setLeadersid(Long leadersid) {
        this.id = leadersid;
    }

    public String getLeadersname() {
        return leadersname;
    }

    public void setLeadersname(String leadersname) {
        this.leadersname = leadersname == null ? null : leadersname.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate == null ? null : birthdate.trim();
    }

    public String getNativeplace() {
        return nativeplace;
    }

    public void setNativeplace(String nativeplace) {
        this.nativeplace = nativeplace == null ? null : nativeplace.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getIncumbent() {
        return incumbent;
    }

    public void setIncumbent(String incumbent) {
        this.incumbent = incumbent == null ? null : incumbent.trim();
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work == null ? null : work.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public String getPhotobig() {
        return photobig;
    }

    public void setPhotobig(String photobig) {
        this.photobig = photobig == null ? null : photobig.trim();
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume == null ? null : resume.trim();
    }

    public String getResumes() {
        return resumes;
    }

    public void setResumes(String resumes) {
        this.resumes = resumes == null ? null : resumes.trim();
    }

    public Integer getOrdernub() {
        return ordernub;
    }

    public void setOrdernub(Integer ordernub) {
        this.ordernub = ordernub;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", leadersid=").append(id);
        sb.append(", leadersname=").append(leadersname);
        sb.append(", sex=").append(sex);
        sb.append(", nation=").append(nation);
        sb.append(", birthdate=").append(birthdate);
        sb.append(", nativeplace=").append(nativeplace);
        sb.append(", education=").append(education);
        sb.append(", incumbent=").append(incumbent);
        sb.append(", work=").append(work);
        sb.append(", photo=").append(photo);
        sb.append(", photobig=").append(photobig);
        sb.append(", resume=").append(resume);
        sb.append(", resumes=").append(resumes);
        sb.append(", ordernub=").append(ordernub);
        sb.append(", remark=").append(remark);
        sb.append(", remark1=").append(remark1);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}