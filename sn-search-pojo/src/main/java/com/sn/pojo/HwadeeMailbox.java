package com.sn.pojo;

import org.apache.solr.client.solrj.beans.Field;

import java.io.Serializable;
import java.util.Date;

public class HwadeeMailbox implements Serializable {
    @Field
    private Long id;

    private Long questionmegid;

    private String companyname;

    private String name;

    private String fixedphone;

    private String phonenumber;

    private String email;

    private String ipcontent;

    @Field("ma_title")
    private String title;

    @Field("ma_content")
    private String content;

    private String code;

    @Field("ma_msgDate")
    private Date msgdate;

    private String replycontent;

    private String replycontent1;

    private String replycontent2;

    private Date replydate;

    private String replyname;

    private Date replydate1;

    private String replyname1;

    private Date replydate2;

    private String replyname2;

    private String orgcode;

    private Integer ispublicity;

    private Integer issmsreply;

    private Integer isreply;

    private Integer mailtype;

    private String address;

    private String officecode;

    private String idcard;

    private String querycode;

    private String username;

    private Integer status;

    @Field("ma_groupId")
    private Long groupid;

    private Integer clgroupid;

    private String attoldfilename;

    private String attpath;

    private Long plid;
    @Field("ma_url")
    private  String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }


    private static final long serialVersionUID = 1L;

    public Long getid() {
        return id;
    }

    public void setid(Long id) {
        this.id = id;
    }

    public Long getQuestionmegid() {
        return questionmegid;
    }

    public void setQuestionmegid(Long questionmegid) {
        this.questionmegid = questionmegid;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getFixedphone() {
        return fixedphone;
    }

    public void setFixedphone(String fixedphone) {
        this.fixedphone = fixedphone == null ? null : fixedphone.trim();
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getIpcontent() {
        return ipcontent;
    }

    public void setIpcontent(String ipcontent) {
        this.ipcontent = ipcontent == null ? null : ipcontent.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Date getMsgdate() {
        return msgdate;
    }

    public void setMsgdate(Date msgdate) {
        this.msgdate = msgdate;
    }

    public String getReplycontent() {
        return replycontent;
    }

    public void setReplycontent(String replycontent) {
        this.replycontent = replycontent == null ? null : replycontent.trim();
    }

    public String getReplycontent1() {
        return replycontent1;
    }

    public void setReplycontent1(String replycontent1) {
        this.replycontent1 = replycontent1 == null ? null : replycontent1.trim();
    }

    public String getReplycontent2() {
        return replycontent2;
    }

    public void setReplycontent2(String replycontent2) {
        this.replycontent2 = replycontent2 == null ? null : replycontent2.trim();
    }

    public Date getReplydate() {
        return replydate;
    }

    public void setReplydate(Date replydate) {
        this.replydate = replydate;
    }

    public String getReplyname() {
        return replyname;
    }

    public void setReplyname(String replyname) {
        this.replyname = replyname == null ? null : replyname.trim();
    }

    public Date getReplydate1() {
        return replydate1;
    }

    public void setReplydate1(Date replydate1) {
        this.replydate1 = replydate1;
    }

    public String getReplyname1() {
        return replyname1;
    }

    public void setReplyname1(String replyname1) {
        this.replyname1 = replyname1 == null ? null : replyname1.trim();
    }

    public Date getReplydate2() {
        return replydate2;
    }

    public void setReplydate2(Date replydate2) {
        this.replydate2 = replydate2;
    }

    public String getReplyname2() {
        return replyname2;
    }

    public void setReplyname2(String replyname2) {
        this.replyname2 = replyname2 == null ? null : replyname2.trim();
    }

    public String getOrgcode() {
        return orgcode;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode == null ? null : orgcode.trim();
    }

    public Integer getIspublicity() {
        return ispublicity;
    }

    public void setIspublicity(Integer ispublicity) {
        this.ispublicity = ispublicity;
    }

    public Integer getIssmsreply() {
        return issmsreply;
    }

    public void setIssmsreply(Integer issmsreply) {
        this.issmsreply = issmsreply;
    }

    public Integer getIsreply() {
        return isreply;
    }

    public void setIsreply(Integer isreply) {
        this.isreply = isreply;
    }

    public Integer getMailtype() {
        return mailtype;
    }

    public void setMailtype(Integer mailtype) {
        this.mailtype = mailtype;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getOfficecode() {
        return officecode;
    }

    public void setOfficecode(String officecode) {
        this.officecode = officecode == null ? null : officecode.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getQuerycode() {
        return querycode;
    }

    public void setQuerycode(String querycode) {
        this.querycode = querycode == null ? null : querycode.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getGroupid() {
        return groupid;
    }

    public void setGroupid(Long groupid) {
        this.groupid = groupid;
    }

    public Integer getClgroupid() {
        return clgroupid;
    }

    public void setClgroupid(Integer clgroupid) {
        this.clgroupid = clgroupid;
    }

    public String getAttoldfilename() {
        return attoldfilename;
    }

    public void setAttoldfilename(String attoldfilename) {
        this.attoldfilename = attoldfilename == null ? null : attoldfilename.trim();
    }

    public String getAttpath() {
        return attpath;
    }

    public void setAttpath(String attpath) {
        this.attpath = attpath == null ? null : attpath.trim();
    }

    public Long getPlid() {
        return plid;
    }

    public void setPlid(Long plid) {
        this.plid = plid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", questionmegid=").append(questionmegid);
        sb.append(", companyname=").append(companyname);
        sb.append(", name=").append(name);
        sb.append(", fixedphone=").append(fixedphone);
        sb.append(", phonenumber=").append(phonenumber);
        sb.append(", email=").append(email);
        sb.append(", ipcontent=").append(ipcontent);
        sb.append(", title=").append(title);
        sb.append(", content=").append(content);
        sb.append(", code=").append(code);
        sb.append(", msgdate=").append(msgdate);
        sb.append(", replycontent=").append(replycontent);
        sb.append(", replycontent1=").append(replycontent1);
        sb.append(", replycontent2=").append(replycontent2);
        sb.append(", replydate=").append(replydate);
        sb.append(", replyname=").append(replyname);
        sb.append(", replydate1=").append(replydate1);
        sb.append(", replyname1=").append(replyname1);
        sb.append(", replydate2=").append(replydate2);
        sb.append(", replyname2=").append(replyname2);
        sb.append(", orgcode=").append(orgcode);
        sb.append(", ispublicity=").append(ispublicity);
        sb.append(", issmsreply=").append(issmsreply);
        sb.append(", isreply=").append(isreply);
        sb.append(", mailtype=").append(mailtype);
        sb.append(", address=").append(address);
        sb.append(", officecode=").append(officecode);
        sb.append(", idcard=").append(idcard);
        sb.append(", querycode=").append(querycode);
        sb.append(", username=").append(username);
        sb.append(", status=").append(status);
        sb.append(", groupid=").append(groupid);
        sb.append(", clgroupid=").append(clgroupid);
        sb.append(", attoldfilename=").append(attoldfilename);
        sb.append(", attpath=").append(attpath);
        sb.append(", plid=").append(plid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}