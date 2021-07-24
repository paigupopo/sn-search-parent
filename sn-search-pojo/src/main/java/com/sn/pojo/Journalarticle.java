package com.sn.pojo;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Journalarticle implements Serializable {

    @Field
    private long id;

    private String uuid;

    private long resourceprimkey;

    @Field("jo_groupId")
    private long groupId;

    @Field("jo_groupname")
    private String groupname;

    private long companyid;

    private long userid;

    @Field("jo_categoryId")
    private Long categoryid;

    @Field("jo_username")
    private String username;

    @Field("jo_createdate")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdate;

    private Date modifieddate;

    private long folderid;

    private long classnameid;

    private long classpk;

    private String treepath;

    private String articleid;

    private Double version;

    @Field("jo_title")
    private String title;

    private String urltitle;

    private String description;

    @Field("jo_content")
    private String content;

    private String type;

    private String structureid;

    private String templateid;

    private String layoutuuid;

    @Field("jo_imgUrl")
    private String imgUrl;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date displaydate;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date expirationdate;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date reviewdate;

    private Byte indexable;

    private Byte smallimage;

    private long smallimageid;

    private String smallimageurl;

    private Integer status;

    private long statusbyuserid;

    private String statusbyusername;

    private Date statusdate;
    @Field("jo_url")
    private String url;

    @Field("jo_name")
    private String name;

    @Field("jo_parentLayoutId")
    private Long parentLayoutId;

    @Field("jo_categoryName")
    private String categoryName;

    @Field("jo_cateGoryFlag")
    private String cateGoryFlag;

    public Long getParentLayoutId() {
        return parentLayoutId;
    }

    public void setParentLayoutId(Long parentLayoutId) {
        this.parentLayoutId = parentLayoutId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    public Long getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Long categoryid) {
        this.categoryid = categoryid;
    }

    public void setStatusbyuserid(long statusbyuserid) {
        this.statusbyuserid = statusbyuserid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    private  Cmspublishedarticle cmspublishedarticle;

    public Cmspublishedarticle getCmspublishedarticle() {
        return cmspublishedarticle;
    }

    public void setCmspublishedarticle(Cmspublishedarticle cmspublishedarticle) {
        this.cmspublishedarticle = cmspublishedarticle;
    }

    private Layout layout;

    public Layout getLayout() {
        return layout;
    }

    public void setLayout(Layout layout) {
        this.layout = layout;
    }

    private static final long serialVersionUID = 1L;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }


    public Journalarticle() {
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public long getResourceprimkey() {
        return resourceprimkey;
    }

    public void setResourceprimkey(long resourceprimkey) {
        this.resourceprimkey = resourceprimkey;
    }

    public long getGroupid() {
        return groupId;
    }

    public void setGroupid(long groupid) {
        this.groupId = groupid;
    }

    public long getCompanyid() {
        return companyid;
    }

    public void setCompanyid(long companyid) {
        this.companyid = companyid;
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
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

    public long getFolderid() {
        return folderid;
    }

    public void setFolderid(long folderid) {
        this.folderid = folderid;
    }

    public long getClassnameid() {
        return classnameid;
    }

    public void setClassnameid(long classnameid) {
        this.classnameid = classnameid;
    }

    public long getClasspk() {
        return classpk;
    }

    public void setClasspk(long classpk) {
        this.classpk = classpk;
    }

    public String getTreepath() {
        return treepath;
    }

    public void setTreepath(String treepath) {
        this.treepath = treepath == null ? null : treepath.trim();
    }

    public String getArticleid() {
        return articleid;
    }

    public void setArticleid(String articleid) {
        this.articleid = articleid == null ? null : articleid.trim();
    }

    public Double getVersion() {
        return version;
    }

    public void setVersion(Double version) {
        this.version = version;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getUrltitle() {
        return urltitle;
    }

    public void setUrltitle(String urltitle) {
        this.urltitle = urltitle == null ? null : urltitle.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getStructureid() {
        return structureid;
    }

    public void setStructureid(String structureid) {
        this.structureid = structureid == null ? null : structureid.trim();
    }

    public String getTemplateid() {
        return templateid;
    }

    public void setTemplateid(String templateid) {
        this.templateid = templateid == null ? null : templateid.trim();
    }

    public String getLayoutuuid() {
        return layoutuuid;
    }

    public void setLayoutuuid(String layoutuuid) {
        this.layoutuuid = layoutuuid == null ? null : layoutuuid.trim();
    }

    public Date getDisplaydate() {
        return displaydate;
    }

    public void setDisplaydate(Date displaydate) {
        this.displaydate = displaydate;
    }


    public Date getExpirationdate() {
        return expirationdate;
    }

    public void setExpirationdate(Date expirationdate) {
        this.expirationdate = expirationdate;
    }


    public Date getReviewdate() {
        return reviewdate;
    }

    public void setReviewdate(Date reviewdate) {
        this.reviewdate = reviewdate;
    }

    public Byte getIndexable() {
        return indexable;
    }

    public void setIndexable(Byte indexable) {
        this.indexable = indexable;
    }

    public Byte getSmallimage() {
        return smallimage;
    }

    public void setSmallimage(Byte smallimage) {
        this.smallimage = smallimage;
    }

    public long getSmallimageid() {
        return smallimageid;
    }

    public void setSmallimageid(long smallimageid) {
        this.smallimageid = smallimageid;
    }

    public String getSmallimageurl() {
        return smallimageurl;
    }

    public void setSmallimageurl(String smallimageurl) {
        this.smallimageurl = smallimageurl == null ? null : smallimageurl.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public long getStatusbyuserid() {
        return statusbyuserid;
    }

    public void setStatusbyuserid(Long statusbyuserid) {
        this.statusbyuserid = statusbyuserid;
    }

    public String getStatusbyusername() {
        return statusbyusername;
    }

    public void setStatusbyusername(String statusbyusername) {
        this.statusbyusername = statusbyusername == null ? null : statusbyusername.trim();
    }

    public Date getStatusdate() {
        return statusdate;
    }

    public void setStatusdate(Date statusdate) {
        this.statusdate = statusdate;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCateGoryFlag() {
        return cateGoryFlag;
    }

    public void setCateGoryFlag(String cateGoryFlag) {
        this.cateGoryFlag = cateGoryFlag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", uuid=").append(uuid);
        sb.append(", resourceprimkey=").append(resourceprimkey);
        sb.append(", groupid=").append(groupId);
        sb.append(", companyid=").append(companyid);
        sb.append(", userid=").append(userid);
        sb.append(", username=").append(username);
        sb.append(", createdate=").append(createdate);
        sb.append(", modifieddate=").append(modifieddate);
        sb.append(", folderid=").append(folderid);
        sb.append(", classnameid=").append(classnameid);
        sb.append(", classpk=").append(classpk);
        sb.append(", treepath=").append(treepath);
        sb.append(", articleid=").append(articleid);
        sb.append(", version=").append(version);
        sb.append(", title=").append(title);
        sb.append(", urltitle=").append(urltitle);
        sb.append(", description=").append(description);
        sb.append(", content=").append(content);
        sb.append(", type=").append(type);
        sb.append(", structureid=").append(structureid);
        sb.append(", templateid=").append(templateid);
        sb.append(", layoutuuid=").append(layoutuuid);
        sb.append(", displaydate=").append(displaydate);
        sb.append(", expirationdate=").append(expirationdate);
        sb.append(", reviewdate=").append(reviewdate);
        sb.append(", indexable=").append(indexable);
        sb.append(", smallimage=").append(smallimage);
        sb.append(", smallimageid=").append(smallimageid);
        sb.append(", smallimageurl=").append(smallimageurl);
        sb.append(", status=").append(status);
        sb.append(", statusbyuserid=").append(statusbyuserid);
        sb.append(", statusbyusername=").append(statusbyusername);
        sb.append(", statusdate=").append(statusdate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}