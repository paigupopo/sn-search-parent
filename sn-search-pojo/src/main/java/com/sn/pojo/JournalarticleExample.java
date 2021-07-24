package com.sn.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JournalarticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JournalarticleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id_ is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id_ is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id_ =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id_ <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id_ >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id_ >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id_ <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id_ <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id_ in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id_ not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id_ between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id_ not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUuidIsNull() {
            addCriterion("uuid_ is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid_ is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("uuid_ =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("uuid_ <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("uuid_ >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("uuid_ >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("uuid_ <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("uuid_ <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("uuid_ like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("uuid_ not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("uuid_ in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("uuid_ not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("uuid_ between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("uuid_ not between", value1, value2, "uuid");
            return (Criteria) this;
        }


        public Criteria andResourceprimkeyIsNull() {
            addCriterion("resourcePrimKey is null");
            return (Criteria) this;
        }

        public Criteria andResourceprimkeyIsNotNull() {
            addCriterion("resourcePrimKey is not null");
            return (Criteria) this;
        }

        public Criteria andResourceprimkeyEqualTo(Long value) {
            addCriterion("resourcePrimKey =", value, "resourceprimkey");
            return (Criteria) this;
        }

        public Criteria andResourceprimkeyNotEqualTo(Long value) {
            addCriterion("resourcePrimKey <>", value, "resourceprimkey");
            return (Criteria) this;
        }

        public Criteria andResourceprimkeyGreaterThan(Long value) {
            addCriterion("resourcePrimKey >", value, "resourceprimkey");
            return (Criteria) this;
        }

        public Criteria andResourceprimkeyGreaterThanOrEqualTo(Long value) {
            addCriterion("resourcePrimKey >=", value, "resourceprimkey");
            return (Criteria) this;
        }

        public Criteria andResourceprimkeyLessThan(Long value) {
            addCriterion("resourcePrimKey <", value, "resourceprimkey");
            return (Criteria) this;
        }

        public Criteria andResourceprimkeyLessThanOrEqualTo(Long value) {
            addCriterion("resourcePrimKey <=", value, "resourceprimkey");
            return (Criteria) this;
        }

        public Criteria andResourceprimkeyIn(List<Long> values) {
            addCriterion("resourcePrimKey in", values, "resourceprimkey");
            return (Criteria) this;
        }

        public Criteria andResourceprimkeyNotIn(List<Long> values) {
            addCriterion("resourcePrimKey not in", values, "resourceprimkey");
            return (Criteria) this;
        }

        public Criteria andResourceprimkeyBetween(Long value1, Long value2) {
            addCriterion("resourcePrimKey between", value1, value2, "resourceprimkey");
            return (Criteria) this;
        }

        public Criteria andResourceprimkeyNotBetween(Long value1, Long value2) {
            addCriterion("resourcePrimKey not between", value1, value2, "resourceprimkey");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNull() {
            addCriterion("groupId is null");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNotNull() {
            addCriterion("groupId is not null");
            return (Criteria) this;
        }

        public Criteria andGroupidEqualTo(Long value) {
            addCriterion("groupId =", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotEqualTo(Long value) {
            addCriterion("groupId <>", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThan(Long value) {
            addCriterion("groupId >", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThanOrEqualTo(Long value) {
            addCriterion("groupId >=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThan(Long value) {
            addCriterion("groupId <", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThanOrEqualTo(Long value) {
            addCriterion("groupId <=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidIn(List<Long> values) {
            addCriterion("groupId in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotIn(List<Long> values) {
            addCriterion("groupId not in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidBetween(Long value1, Long value2) {
            addCriterion("groupId between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotBetween(Long value1, Long value2) {
            addCriterion("groupId not between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNull() {
            addCriterion("companyId is null");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNotNull() {
            addCriterion("companyId is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyidEqualTo(Long value) {
            addCriterion("companyId =", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotEqualTo(Long value) {
            addCriterion("companyId <>", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThan(Long value) {
            addCriterion("companyId >", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThanOrEqualTo(Long value) {
            addCriterion("companyId >=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThan(Long value) {
            addCriterion("companyId <", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThanOrEqualTo(Long value) {
            addCriterion("companyId <=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIn(List<Long> values) {
            addCriterion("companyId in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotIn(List<Long> values) {
            addCriterion("companyId not in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidBetween(Long value1, Long value2) {
            addCriterion("companyId between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotBetween(Long value1, Long value2) {
            addCriterion("companyId not between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("createDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("createDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("createDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("createDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("createDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("createDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("createDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("createDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("createDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("createDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andModifieddateIsNull() {
            addCriterion("modifiedDate is null");
            return (Criteria) this;
        }

        public Criteria andModifieddateIsNotNull() {
            addCriterion("modifiedDate is not null");
            return (Criteria) this;
        }

        public Criteria andModifieddateEqualTo(Date value) {
            addCriterion("modifiedDate =", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateNotEqualTo(Date value) {
            addCriterion("modifiedDate <>", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateGreaterThan(Date value) {
            addCriterion("modifiedDate >", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateGreaterThanOrEqualTo(Date value) {
            addCriterion("modifiedDate >=", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateLessThan(Date value) {
            addCriterion("modifiedDate <", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateLessThanOrEqualTo(Date value) {
            addCriterion("modifiedDate <=", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateIn(List<Date> values) {
            addCriterion("modifiedDate in", values, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateNotIn(List<Date> values) {
            addCriterion("modifiedDate not in", values, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateBetween(Date value1, Date value2) {
            addCriterion("modifiedDate between", value1, value2, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateNotBetween(Date value1, Date value2) {
            addCriterion("modifiedDate not between", value1, value2, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andFolderidIsNull() {
            addCriterion("folderId is null");
            return (Criteria) this;
        }

        public Criteria andFolderidIsNotNull() {
            addCriterion("folderId is not null");
            return (Criteria) this;
        }

        public Criteria andFolderidEqualTo(Long value) {
            addCriterion("folderId =", value, "folderid");
            return (Criteria) this;
        }

        public Criteria andFolderidNotEqualTo(Long value) {
            addCriterion("folderId <>", value, "folderid");
            return (Criteria) this;
        }

        public Criteria andFolderidGreaterThan(Long value) {
            addCriterion("folderId >", value, "folderid");
            return (Criteria) this;
        }

        public Criteria andFolderidGreaterThanOrEqualTo(Long value) {
            addCriterion("folderId >=", value, "folderid");
            return (Criteria) this;
        }

        public Criteria andFolderidLessThan(Long value) {
            addCriterion("folderId <", value, "folderid");
            return (Criteria) this;
        }

        public Criteria andFolderidLessThanOrEqualTo(Long value) {
            addCriterion("folderId <=", value, "folderid");
            return (Criteria) this;
        }

        public Criteria andFolderidIn(List<Long> values) {
            addCriterion("folderId in", values, "folderid");
            return (Criteria) this;
        }

        public Criteria andFolderidNotIn(List<Long> values) {
            addCriterion("folderId not in", values, "folderid");
            return (Criteria) this;
        }

        public Criteria andFolderidBetween(Long value1, Long value2) {
            addCriterion("folderId between", value1, value2, "folderid");
            return (Criteria) this;
        }

        public Criteria andFolderidNotBetween(Long value1, Long value2) {
            addCriterion("folderId not between", value1, value2, "folderid");
            return (Criteria) this;
        }

        public Criteria andClassnameidIsNull() {
            addCriterion("classNameId is null");
            return (Criteria) this;
        }

        public Criteria andClassnameidIsNotNull() {
            addCriterion("classNameId is not null");
            return (Criteria) this;
        }

        public Criteria andClassnameidEqualTo(Long value) {
            addCriterion("classNameId =", value, "classnameid");
            return (Criteria) this;
        }

        public Criteria andClassnameidNotEqualTo(Long value) {
            addCriterion("classNameId <>", value, "classnameid");
            return (Criteria) this;
        }

        public Criteria andClassnameidGreaterThan(Long value) {
            addCriterion("classNameId >", value, "classnameid");
            return (Criteria) this;
        }

        public Criteria andClassnameidGreaterThanOrEqualTo(Long value) {
            addCriterion("classNameId >=", value, "classnameid");
            return (Criteria) this;
        }

        public Criteria andClassnameidLessThan(Long value) {
            addCriterion("classNameId <", value, "classnameid");
            return (Criteria) this;
        }

        public Criteria andClassnameidLessThanOrEqualTo(Long value) {
            addCriterion("classNameId <=", value, "classnameid");
            return (Criteria) this;
        }

        public Criteria andClassnameidIn(List<Long> values) {
            addCriterion("classNameId in", values, "classnameid");
            return (Criteria) this;
        }

        public Criteria andClassnameidNotIn(List<Long> values) {
            addCriterion("classNameId not in", values, "classnameid");
            return (Criteria) this;
        }

        public Criteria andClassnameidBetween(Long value1, Long value2) {
            addCriterion("classNameId between", value1, value2, "classnameid");
            return (Criteria) this;
        }

        public Criteria andClassnameidNotBetween(Long value1, Long value2) {
            addCriterion("classNameId not between", value1, value2, "classnameid");
            return (Criteria) this;
        }

        public Criteria andClasspkIsNull() {
            addCriterion("classPK is null");
            return (Criteria) this;
        }

        public Criteria andClasspkIsNotNull() {
            addCriterion("classPK is not null");
            return (Criteria) this;
        }

        public Criteria andClasspkEqualTo(Long value) {
            addCriterion("classPK =", value, "classpk");
            return (Criteria) this;
        }

        public Criteria andClasspkNotEqualTo(Long value) {
            addCriterion("classPK <>", value, "classpk");
            return (Criteria) this;
        }

        public Criteria andClasspkGreaterThan(Long value) {
            addCriterion("classPK >", value, "classpk");
            return (Criteria) this;
        }

        public Criteria andClasspkGreaterThanOrEqualTo(Long value) {
            addCriterion("classPK >=", value, "classpk");
            return (Criteria) this;
        }

        public Criteria andClasspkLessThan(Long value) {
            addCriterion("classPK <", value, "classpk");
            return (Criteria) this;
        }

        public Criteria andClasspkLessThanOrEqualTo(Long value) {
            addCriterion("classPK <=", value, "classpk");
            return (Criteria) this;
        }

        public Criteria andClasspkIn(List<Long> values) {
            addCriterion("classPK in", values, "classpk");
            return (Criteria) this;
        }

        public Criteria andClasspkNotIn(List<Long> values) {
            addCriterion("classPK not in", values, "classpk");
            return (Criteria) this;
        }

        public Criteria andClasspkBetween(Long value1, Long value2) {
            addCriterion("classPK between", value1, value2, "classpk");
            return (Criteria) this;
        }

        public Criteria andClasspkNotBetween(Long value1, Long value2) {
            addCriterion("classPK not between", value1, value2, "classpk");
            return (Criteria) this;
        }

        public Criteria andTreepathIsNull() {
            addCriterion("treePath is null");
            return (Criteria) this;
        }

        public Criteria andTreepathIsNotNull() {
            addCriterion("treePath is not null");
            return (Criteria) this;
        }

        public Criteria andTreepathEqualTo(String value) {
            addCriterion("treePath =", value, "treepath");
            return (Criteria) this;
        }

        public Criteria andTreepathNotEqualTo(String value) {
            addCriterion("treePath <>", value, "treepath");
            return (Criteria) this;
        }

        public Criteria andTreepathGreaterThan(String value) {
            addCriterion("treePath >", value, "treepath");
            return (Criteria) this;
        }

        public Criteria andTreepathGreaterThanOrEqualTo(String value) {
            addCriterion("treePath >=", value, "treepath");
            return (Criteria) this;
        }

        public Criteria andTreepathLessThan(String value) {
            addCriterion("treePath <", value, "treepath");
            return (Criteria) this;
        }

        public Criteria andTreepathLessThanOrEqualTo(String value) {
            addCriterion("treePath <=", value, "treepath");
            return (Criteria) this;
        }

        public Criteria andTreepathLike(String value) {
            addCriterion("treePath like", value, "treepath");
            return (Criteria) this;
        }

        public Criteria andTreepathNotLike(String value) {
            addCriterion("treePath not like", value, "treepath");
            return (Criteria) this;
        }

        public Criteria andTreepathIn(List<String> values) {
            addCriterion("treePath in", values, "treepath");
            return (Criteria) this;
        }

        public Criteria andTreepathNotIn(List<String> values) {
            addCriterion("treePath not in", values, "treepath");
            return (Criteria) this;
        }

        public Criteria andTreepathBetween(String value1, String value2) {
            addCriterion("treePath between", value1, value2, "treepath");
            return (Criteria) this;
        }

        public Criteria andTreepathNotBetween(String value1, String value2) {
            addCriterion("treePath not between", value1, value2, "treepath");
            return (Criteria) this;
        }

        public Criteria andArticleidIsNull() {
            addCriterion("articleId is null");
            return (Criteria) this;
        }

        public Criteria andArticleidIsNotNull() {
            addCriterion("articleId is not null");
            return (Criteria) this;
        }

        public Criteria andArticleidEqualTo(String value) {
            addCriterion("articleId =", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidNotEqualTo(String value) {
            addCriterion("articleId <>", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidGreaterThan(String value) {
            addCriterion("articleId >", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidGreaterThanOrEqualTo(String value) {
            addCriterion("articleId >=", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidLessThan(String value) {
            addCriterion("articleId <", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidLessThanOrEqualTo(String value) {
            addCriterion("articleId <=", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidLike(String value) {
            addCriterion("articleId like", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidNotLike(String value) {
            addCriterion("articleId not like", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidIn(List<String> values) {
            addCriterion("articleId in", values, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidNotIn(List<String> values) {
            addCriterion("articleId not in", values, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidBetween(String value1, String value2) {
            addCriterion("articleId between", value1, value2, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidNotBetween(String value1, String value2) {
            addCriterion("articleId not between", value1, value2, "articleid");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Double value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Double value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Double value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Double value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Double value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Double value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Double> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Double> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Double value1, Double value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Double value1, Double value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andUrltitleIsNull() {
            addCriterion("urlTitle is null");
            return (Criteria) this;
        }

        public Criteria andUrltitleIsNotNull() {
            addCriterion("urlTitle is not null");
            return (Criteria) this;
        }

        public Criteria andUrltitleEqualTo(String value) {
            addCriterion("urlTitle =", value, "urltitle");
            return (Criteria) this;
        }

        public Criteria andUrltitleNotEqualTo(String value) {
            addCriterion("urlTitle <>", value, "urltitle");
            return (Criteria) this;
        }

        public Criteria andUrltitleGreaterThan(String value) {
            addCriterion("urlTitle >", value, "urltitle");
            return (Criteria) this;
        }

        public Criteria andUrltitleGreaterThanOrEqualTo(String value) {
            addCriterion("urlTitle >=", value, "urltitle");
            return (Criteria) this;
        }

        public Criteria andUrltitleLessThan(String value) {
            addCriterion("urlTitle <", value, "urltitle");
            return (Criteria) this;
        }

        public Criteria andUrltitleLessThanOrEqualTo(String value) {
            addCriterion("urlTitle <=", value, "urltitle");
            return (Criteria) this;
        }

        public Criteria andUrltitleLike(String value) {
            addCriterion("urlTitle like", value, "urltitle");
            return (Criteria) this;
        }

        public Criteria andUrltitleNotLike(String value) {
            addCriterion("urlTitle not like", value, "urltitle");
            return (Criteria) this;
        }

        public Criteria andUrltitleIn(List<String> values) {
            addCriterion("urlTitle in", values, "urltitle");
            return (Criteria) this;
        }

        public Criteria andUrltitleNotIn(List<String> values) {
            addCriterion("urlTitle not in", values, "urltitle");
            return (Criteria) this;
        }

        public Criteria andUrltitleBetween(String value1, String value2) {
            addCriterion("urlTitle between", value1, value2, "urltitle");
            return (Criteria) this;
        }

        public Criteria andUrltitleNotBetween(String value1, String value2) {
            addCriterion("urlTitle not between", value1, value2, "urltitle");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type_ is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type_ is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type_ =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type_ <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type_ >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type_ >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type_ <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type_ <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type_ like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type_ not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type_ in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type_ not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type_ between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type_ not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andStructureidIsNull() {
            addCriterion("structureId is null");
            return (Criteria) this;
        }

        public Criteria andStructureidIsNotNull() {
            addCriterion("structureId is not null");
            return (Criteria) this;
        }

        public Criteria andStructureidEqualTo(String value) {
            addCriterion("structureId =", value, "structureid");
            return (Criteria) this;
        }

        public Criteria andStructureidNotEqualTo(String value) {
            addCriterion("structureId <>", value, "structureid");
            return (Criteria) this;
        }

        public Criteria andStructureidGreaterThan(String value) {
            addCriterion("structureId >", value, "structureid");
            return (Criteria) this;
        }

        public Criteria andStructureidGreaterThanOrEqualTo(String value) {
            addCriterion("structureId >=", value, "structureid");
            return (Criteria) this;
        }

        public Criteria andStructureidLessThan(String value) {
            addCriterion("structureId <", value, "structureid");
            return (Criteria) this;
        }

        public Criteria andStructureidLessThanOrEqualTo(String value) {
            addCriterion("structureId <=", value, "structureid");
            return (Criteria) this;
        }

        public Criteria andStructureidLike(String value) {
            addCriterion("structureId like", value, "structureid");
            return (Criteria) this;
        }

        public Criteria andStructureidNotLike(String value) {
            addCriterion("structureId not like", value, "structureid");
            return (Criteria) this;
        }

        public Criteria andStructureidIn(List<String> values) {
            addCriterion("structureId in", values, "structureid");
            return (Criteria) this;
        }

        public Criteria andStructureidNotIn(List<String> values) {
            addCriterion("structureId not in", values, "structureid");
            return (Criteria) this;
        }

        public Criteria andStructureidBetween(String value1, String value2) {
            addCriterion("structureId between", value1, value2, "structureid");
            return (Criteria) this;
        }

        public Criteria andStructureidNotBetween(String value1, String value2) {
            addCriterion("structureId not between", value1, value2, "structureid");
            return (Criteria) this;
        }

        public Criteria andTemplateidIsNull() {
            addCriterion("templateId is null");
            return (Criteria) this;
        }

        public Criteria andTemplateidIsNotNull() {
            addCriterion("templateId is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateidEqualTo(String value) {
            addCriterion("templateId =", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidNotEqualTo(String value) {
            addCriterion("templateId <>", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidGreaterThan(String value) {
            addCriterion("templateId >", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidGreaterThanOrEqualTo(String value) {
            addCriterion("templateId >=", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidLessThan(String value) {
            addCriterion("templateId <", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidLessThanOrEqualTo(String value) {
            addCriterion("templateId <=", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidLike(String value) {
            addCriterion("templateId like", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidNotLike(String value) {
            addCriterion("templateId not like", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidIn(List<String> values) {
            addCriterion("templateId in", values, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidNotIn(List<String> values) {
            addCriterion("templateId not in", values, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidBetween(String value1, String value2) {
            addCriterion("templateId between", value1, value2, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidNotBetween(String value1, String value2) {
            addCriterion("templateId not between", value1, value2, "templateid");
            return (Criteria) this;
        }

        public Criteria andLayoutuuidIsNull() {
            addCriterion("layoutUuid is null");
            return (Criteria) this;
        }

        public Criteria andLayoutuuidIsNotNull() {
            addCriterion("layoutUuid is not null");
            return (Criteria) this;
        }

        public Criteria andLayoutuuidEqualTo(String value) {
            addCriterion("layoutUuid =", value, "layoutuuid");
            return (Criteria) this;
        }

        public Criteria andLayoutuuidNotEqualTo(String value) {
            addCriterion("layoutUuid <>", value, "layoutuuid");
            return (Criteria) this;
        }

        public Criteria andLayoutuuidGreaterThan(String value) {
            addCriterion("layoutUuid >", value, "layoutuuid");
            return (Criteria) this;
        }

        public Criteria andLayoutuuidGreaterThanOrEqualTo(String value) {
            addCriterion("layoutUuid >=", value, "layoutuuid");
            return (Criteria) this;
        }

        public Criteria andLayoutuuidLessThan(String value) {
            addCriterion("layoutUuid <", value, "layoutuuid");
            return (Criteria) this;
        }

        public Criteria andLayoutuuidLessThanOrEqualTo(String value) {
            addCriterion("layoutUuid <=", value, "layoutuuid");
            return (Criteria) this;
        }

        public Criteria andLayoutuuidLike(String value) {
            addCriterion("layoutUuid like", value, "layoutuuid");
            return (Criteria) this;
        }

        public Criteria andLayoutuuidNotLike(String value) {
            addCriterion("layoutUuid not like", value, "layoutuuid");
            return (Criteria) this;
        }

        public Criteria andLayoutuuidIn(List<String> values) {
            addCriterion("layoutUuid in", values, "layoutuuid");
            return (Criteria) this;
        }

        public Criteria andLayoutuuidNotIn(List<String> values) {
            addCriterion("layoutUuid not in", values, "layoutuuid");
            return (Criteria) this;
        }

        public Criteria andLayoutuuidBetween(String value1, String value2) {
            addCriterion("layoutUuid between", value1, value2, "layoutuuid");
            return (Criteria) this;
        }

        public Criteria andLayoutuuidNotBetween(String value1, String value2) {
            addCriterion("layoutUuid not between", value1, value2, "layoutuuid");
            return (Criteria) this;
        }

        public Criteria andDisplaydateIsNull() {
            addCriterion("displayDate is null");
            return (Criteria) this;
        }

        public Criteria andDisplaydateIsNotNull() {
            addCriterion("displayDate is not null");
            return (Criteria) this;
        }

        public Criteria andDisplaydateEqualTo(Date value) {
            addCriterion("displayDate =", value, "displaydate");
            return (Criteria) this;
        }

        public Criteria andDisplaydateNotEqualTo(Date value) {
            addCriterion("displayDate <>", value, "displaydate");
            return (Criteria) this;
        }

        public Criteria andDisplaydateGreaterThan(Date value) {
            addCriterion("displayDate >", value, "displaydate");
            return (Criteria) this;
        }

        public Criteria andDisplaydateGreaterThanOrEqualTo(Date value) {
            addCriterion("displayDate >=", value, "displaydate");
            return (Criteria) this;
        }

        public Criteria andDisplaydateLessThan(Date value) {
            addCriterion("displayDate <", value, "displaydate");
            return (Criteria) this;
        }

        public Criteria andDisplaydateLessThanOrEqualTo(Date value) {
            addCriterion("displayDate <=", value, "displaydate");
            return (Criteria) this;
        }

        public Criteria andDisplaydateIn(List<Date> values) {
            addCriterion("displayDate in", values, "displaydate");
            return (Criteria) this;
        }

        public Criteria andDisplaydateNotIn(List<Date> values) {
            addCriterion("displayDate not in", values, "displaydate");
            return (Criteria) this;
        }

        public Criteria andDisplaydateBetween(Date value1, Date value2) {
            addCriterion("displayDate between", value1, value2, "displaydate");
            return (Criteria) this;
        }

        public Criteria andDisplaydateNotBetween(Date value1, Date value2) {
            addCriterion("displayDate not between", value1, value2, "displaydate");
            return (Criteria) this;
        }

        public Criteria andExpirationdateIsNull() {
            addCriterion("expirationDate is null");
            return (Criteria) this;
        }

        public Criteria andExpirationdateIsNotNull() {
            addCriterion("expirationDate is not null");
            return (Criteria) this;
        }

        public Criteria andExpirationdateEqualTo(Date value) {
            addCriterion("expirationDate =", value, "expirationdate");
            return (Criteria) this;
        }

        public Criteria andExpirationdateNotEqualTo(Date value) {
            addCriterion("expirationDate <>", value, "expirationdate");
            return (Criteria) this;
        }

        public Criteria andExpirationdateGreaterThan(Date value) {
            addCriterion("expirationDate >", value, "expirationdate");
            return (Criteria) this;
        }

        public Criteria andExpirationdateGreaterThanOrEqualTo(Date value) {
            addCriterion("expirationDate >=", value, "expirationdate");
            return (Criteria) this;
        }

        public Criteria andExpirationdateLessThan(Date value) {
            addCriterion("expirationDate <", value, "expirationdate");
            return (Criteria) this;
        }

        public Criteria andExpirationdateLessThanOrEqualTo(Date value) {
            addCriterion("expirationDate <=", value, "expirationdate");
            return (Criteria) this;
        }

        public Criteria andExpirationdateIn(List<Date> values) {
            addCriterion("expirationDate in", values, "expirationdate");
            return (Criteria) this;
        }

        public Criteria andExpirationdateNotIn(List<Date> values) {
            addCriterion("expirationDate not in", values, "expirationdate");
            return (Criteria) this;
        }

        public Criteria andExpirationdateBetween(Date value1, Date value2) {
            addCriterion("expirationDate between", value1, value2, "expirationdate");
            return (Criteria) this;
        }

        public Criteria andExpirationdateNotBetween(Date value1, Date value2) {
            addCriterion("expirationDate not between", value1, value2, "expirationdate");
            return (Criteria) this;
        }

        public Criteria andReviewdateIsNull() {
            addCriterion("reviewDate is null");
            return (Criteria) this;
        }

        public Criteria andReviewdateIsNotNull() {
            addCriterion("reviewDate is not null");
            return (Criteria) this;
        }

        public Criteria andReviewdateEqualTo(Date value) {
            addCriterion("reviewDate =", value, "reviewdate");
            return (Criteria) this;
        }

        public Criteria andReviewdateNotEqualTo(Date value) {
            addCriterion("reviewDate <>", value, "reviewdate");
            return (Criteria) this;
        }

        public Criteria andReviewdateGreaterThan(Date value) {
            addCriterion("reviewDate >", value, "reviewdate");
            return (Criteria) this;
        }

        public Criteria andReviewdateGreaterThanOrEqualTo(Date value) {
            addCriterion("reviewDate >=", value, "reviewdate");
            return (Criteria) this;
        }

        public Criteria andReviewdateLessThan(Date value) {
            addCriterion("reviewDate <", value, "reviewdate");
            return (Criteria) this;
        }

        public Criteria andReviewdateLessThanOrEqualTo(Date value) {
            addCriterion("reviewDate <=", value, "reviewdate");
            return (Criteria) this;
        }

        public Criteria andReviewdateIn(List<Date> values) {
            addCriterion("reviewDate in", values, "reviewdate");
            return (Criteria) this;
        }

        public Criteria andReviewdateNotIn(List<Date> values) {
            addCriterion("reviewDate not in", values, "reviewdate");
            return (Criteria) this;
        }

        public Criteria andReviewdateBetween(Date value1, Date value2) {
            addCriterion("reviewDate between", value1, value2, "reviewdate");
            return (Criteria) this;
        }

        public Criteria andReviewdateNotBetween(Date value1, Date value2) {
            addCriterion("reviewDate not between", value1, value2, "reviewdate");
            return (Criteria) this;
        }

        public Criteria andIndexableIsNull() {
            addCriterion("indexable is null");
            return (Criteria) this;
        }

        public Criteria andIndexableIsNotNull() {
            addCriterion("indexable is not null");
            return (Criteria) this;
        }

        public Criteria andIndexableEqualTo(Byte value) {
            addCriterion("indexable =", value, "indexable");
            return (Criteria) this;
        }

        public Criteria andIndexableNotEqualTo(Byte value) {
            addCriterion("indexable <>", value, "indexable");
            return (Criteria) this;
        }

        public Criteria andIndexableGreaterThan(Byte value) {
            addCriterion("indexable >", value, "indexable");
            return (Criteria) this;
        }

        public Criteria andIndexableGreaterThanOrEqualTo(Byte value) {
            addCriterion("indexable >=", value, "indexable");
            return (Criteria) this;
        }

        public Criteria andIndexableLessThan(Byte value) {
            addCriterion("indexable <", value, "indexable");
            return (Criteria) this;
        }

        public Criteria andIndexableLessThanOrEqualTo(Byte value) {
            addCriterion("indexable <=", value, "indexable");
            return (Criteria) this;
        }

        public Criteria andIndexableIn(List<Byte> values) {
            addCriterion("indexable in", values, "indexable");
            return (Criteria) this;
        }

        public Criteria andIndexableNotIn(List<Byte> values) {
            addCriterion("indexable not in", values, "indexable");
            return (Criteria) this;
        }

        public Criteria andIndexableBetween(Byte value1, Byte value2) {
            addCriterion("indexable between", value1, value2, "indexable");
            return (Criteria) this;
        }

        public Criteria andIndexableNotBetween(Byte value1, Byte value2) {
            addCriterion("indexable not between", value1, value2, "indexable");
            return (Criteria) this;
        }

        public Criteria andSmallimageIsNull() {
            addCriterion("smallImage is null");
            return (Criteria) this;
        }

        public Criteria andSmallimageIsNotNull() {
            addCriterion("smallImage is not null");
            return (Criteria) this;
        }

        public Criteria andSmallimageEqualTo(Byte value) {
            addCriterion("smallImage =", value, "smallimage");
            return (Criteria) this;
        }

        public Criteria andSmallimageNotEqualTo(Byte value) {
            addCriterion("smallImage <>", value, "smallimage");
            return (Criteria) this;
        }

        public Criteria andSmallimageGreaterThan(Byte value) {
            addCriterion("smallImage >", value, "smallimage");
            return (Criteria) this;
        }

        public Criteria andSmallimageGreaterThanOrEqualTo(Byte value) {
            addCriterion("smallImage >=", value, "smallimage");
            return (Criteria) this;
        }

        public Criteria andSmallimageLessThan(Byte value) {
            addCriterion("smallImage <", value, "smallimage");
            return (Criteria) this;
        }

        public Criteria andSmallimageLessThanOrEqualTo(Byte value) {
            addCriterion("smallImage <=", value, "smallimage");
            return (Criteria) this;
        }

        public Criteria andSmallimageIn(List<Byte> values) {
            addCriterion("smallImage in", values, "smallimage");
            return (Criteria) this;
        }

        public Criteria andSmallimageNotIn(List<Byte> values) {
            addCriterion("smallImage not in", values, "smallimage");
            return (Criteria) this;
        }

        public Criteria andSmallimageBetween(Byte value1, Byte value2) {
            addCriterion("smallImage between", value1, value2, "smallimage");
            return (Criteria) this;
        }

        public Criteria andSmallimageNotBetween(Byte value1, Byte value2) {
            addCriterion("smallImage not between", value1, value2, "smallimage");
            return (Criteria) this;
        }

        public Criteria andSmallimageidIsNull() {
            addCriterion("smallImageId is null");
            return (Criteria) this;
        }

        public Criteria andSmallimageidIsNotNull() {
            addCriterion("smallImageId is not null");
            return (Criteria) this;
        }

        public Criteria andSmallimageidEqualTo(Long value) {
            addCriterion("smallImageId =", value, "smallimageid");
            return (Criteria) this;
        }

        public Criteria andSmallimageidNotEqualTo(Long value) {
            addCriterion("smallImageId <>", value, "smallimageid");
            return (Criteria) this;
        }

        public Criteria andSmallimageidGreaterThan(Long value) {
            addCriterion("smallImageId >", value, "smallimageid");
            return (Criteria) this;
        }

        public Criteria andSmallimageidGreaterThanOrEqualTo(Long value) {
            addCriterion("smallImageId >=", value, "smallimageid");
            return (Criteria) this;
        }

        public Criteria andSmallimageidLessThan(Long value) {
            addCriterion("smallImageId <", value, "smallimageid");
            return (Criteria) this;
        }

        public Criteria andSmallimageidLessThanOrEqualTo(Long value) {
            addCriterion("smallImageId <=", value, "smallimageid");
            return (Criteria) this;
        }

        public Criteria andSmallimageidIn(List<Long> values) {
            addCriterion("smallImageId in", values, "smallimageid");
            return (Criteria) this;
        }

        public Criteria andSmallimageidNotIn(List<Long> values) {
            addCriterion("smallImageId not in", values, "smallimageid");
            return (Criteria) this;
        }

        public Criteria andSmallimageidBetween(Long value1, Long value2) {
            addCriterion("smallImageId between", value1, value2, "smallimageid");
            return (Criteria) this;
        }

        public Criteria andSmallimageidNotBetween(Long value1, Long value2) {
            addCriterion("smallImageId not between", value1, value2, "smallimageid");
            return (Criteria) this;
        }

        public Criteria andSmallimageurlIsNull() {
            addCriterion("smallImageURL is null");
            return (Criteria) this;
        }

        public Criteria andSmallimageurlIsNotNull() {
            addCriterion("smallImageURL is not null");
            return (Criteria) this;
        }

        public Criteria andSmallimageurlEqualTo(String value) {
            addCriterion("smallImageURL =", value, "smallimageurl");
            return (Criteria) this;
        }

        public Criteria andSmallimageurlNotEqualTo(String value) {
            addCriterion("smallImageURL <>", value, "smallimageurl");
            return (Criteria) this;
        }

        public Criteria andSmallimageurlGreaterThan(String value) {
            addCriterion("smallImageURL >", value, "smallimageurl");
            return (Criteria) this;
        }

        public Criteria andSmallimageurlGreaterThanOrEqualTo(String value) {
            addCriterion("smallImageURL >=", value, "smallimageurl");
            return (Criteria) this;
        }

        public Criteria andSmallimageurlLessThan(String value) {
            addCriterion("smallImageURL <", value, "smallimageurl");
            return (Criteria) this;
        }

        public Criteria andSmallimageurlLessThanOrEqualTo(String value) {
            addCriterion("smallImageURL <=", value, "smallimageurl");
            return (Criteria) this;
        }

        public Criteria andSmallimageurlLike(String value) {
            addCriterion("smallImageURL like", value, "smallimageurl");
            return (Criteria) this;
        }

        public Criteria andSmallimageurlNotLike(String value) {
            addCriterion("smallImageURL not like", value, "smallimageurl");
            return (Criteria) this;
        }

        public Criteria andSmallimageurlIn(List<String> values) {
            addCriterion("smallImageURL in", values, "smallimageurl");
            return (Criteria) this;
        }

        public Criteria andSmallimageurlNotIn(List<String> values) {
            addCriterion("smallImageURL not in", values, "smallimageurl");
            return (Criteria) this;
        }

        public Criteria andSmallimageurlBetween(String value1, String value2) {
            addCriterion("smallImageURL between", value1, value2, "smallimageurl");
            return (Criteria) this;
        }

        public Criteria andSmallimageurlNotBetween(String value1, String value2) {
            addCriterion("smallImageURL not between", value1, value2, "smallimageurl");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusbyuseridIsNull() {
            addCriterion("statusByUserId is null");
            return (Criteria) this;
        }

        public Criteria andStatusbyuseridIsNotNull() {
            addCriterion("statusByUserId is not null");
            return (Criteria) this;
        }

        public Criteria andStatusbyuseridEqualTo(Long value) {
            addCriterion("statusByUserId =", value, "statusbyuserid");
            return (Criteria) this;
        }

        public Criteria andStatusbyuseridNotEqualTo(Long value) {
            addCriterion("statusByUserId <>", value, "statusbyuserid");
            return (Criteria) this;
        }

        public Criteria andStatusbyuseridGreaterThan(Long value) {
            addCriterion("statusByUserId >", value, "statusbyuserid");
            return (Criteria) this;
        }

        public Criteria andStatusbyuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("statusByUserId >=", value, "statusbyuserid");
            return (Criteria) this;
        }

        public Criteria andStatusbyuseridLessThan(Long value) {
            addCriterion("statusByUserId <", value, "statusbyuserid");
            return (Criteria) this;
        }

        public Criteria andStatusbyuseridLessThanOrEqualTo(Long value) {
            addCriterion("statusByUserId <=", value, "statusbyuserid");
            return (Criteria) this;
        }

        public Criteria andStatusbyuseridIn(List<Long> values) {
            addCriterion("statusByUserId in", values, "statusbyuserid");
            return (Criteria) this;
        }

        public Criteria andStatusbyuseridNotIn(List<Long> values) {
            addCriterion("statusByUserId not in", values, "statusbyuserid");
            return (Criteria) this;
        }

        public Criteria andStatusbyuseridBetween(Long value1, Long value2) {
            addCriterion("statusByUserId between", value1, value2, "statusbyuserid");
            return (Criteria) this;
        }

        public Criteria andStatusbyuseridNotBetween(Long value1, Long value2) {
            addCriterion("statusByUserId not between", value1, value2, "statusbyuserid");
            return (Criteria) this;
        }

        public Criteria andStatusbyusernameIsNull() {
            addCriterion("statusByUserName is null");
            return (Criteria) this;
        }

        public Criteria andStatusbyusernameIsNotNull() {
            addCriterion("statusByUserName is not null");
            return (Criteria) this;
        }

        public Criteria andStatusbyusernameEqualTo(String value) {
            addCriterion("statusByUserName =", value, "statusbyusername");
            return (Criteria) this;
        }

        public Criteria andStatusbyusernameNotEqualTo(String value) {
            addCriterion("statusByUserName <>", value, "statusbyusername");
            return (Criteria) this;
        }

        public Criteria andStatusbyusernameGreaterThan(String value) {
            addCriterion("statusByUserName >", value, "statusbyusername");
            return (Criteria) this;
        }

        public Criteria andStatusbyusernameGreaterThanOrEqualTo(String value) {
            addCriterion("statusByUserName >=", value, "statusbyusername");
            return (Criteria) this;
        }

        public Criteria andStatusbyusernameLessThan(String value) {
            addCriterion("statusByUserName <", value, "statusbyusername");
            return (Criteria) this;
        }

        public Criteria andStatusbyusernameLessThanOrEqualTo(String value) {
            addCriterion("statusByUserName <=", value, "statusbyusername");
            return (Criteria) this;
        }

        public Criteria andStatusbyusernameLike(String value) {
            addCriterion("statusByUserName like", value, "statusbyusername");
            return (Criteria) this;
        }

        public Criteria andStatusbyusernameNotLike(String value) {
            addCriterion("statusByUserName not like", value, "statusbyusername");
            return (Criteria) this;
        }

        public Criteria andStatusbyusernameIn(List<String> values) {
            addCriterion("statusByUserName in", values, "statusbyusername");
            return (Criteria) this;
        }

        public Criteria andStatusbyusernameNotIn(List<String> values) {
            addCriterion("statusByUserName not in", values, "statusbyusername");
            return (Criteria) this;
        }

        public Criteria andStatusbyusernameBetween(String value1, String value2) {
            addCriterion("statusByUserName between", value1, value2, "statusbyusername");
            return (Criteria) this;
        }

        public Criteria andStatusbyusernameNotBetween(String value1, String value2) {
            addCriterion("statusByUserName not between", value1, value2, "statusbyusername");
            return (Criteria) this;
        }

        public Criteria andStatusdateIsNull() {
            addCriterion("statusDate is null");
            return (Criteria) this;
        }

        public Criteria andStatusdateIsNotNull() {
            addCriterion("statusDate is not null");
            return (Criteria) this;
        }

        public Criteria andStatusdateEqualTo(Date value) {
            addCriterion("statusDate =", value, "statusdate");
            return (Criteria) this;
        }

        public Criteria andStatusdateNotEqualTo(Date value) {
            addCriterion("statusDate <>", value, "statusdate");
            return (Criteria) this;
        }

        public Criteria andStatusdateGreaterThan(Date value) {
            addCriterion("statusDate >", value, "statusdate");
            return (Criteria) this;
        }

        public Criteria andStatusdateGreaterThanOrEqualTo(Date value) {
            addCriterion("statusDate >=", value, "statusdate");
            return (Criteria) this;
        }

        public Criteria andStatusdateLessThan(Date value) {
            addCriterion("statusDate <", value, "statusdate");
            return (Criteria) this;
        }

        public Criteria andStatusdateLessThanOrEqualTo(Date value) {
            addCriterion("statusDate <=", value, "statusdate");
            return (Criteria) this;
        }

        public Criteria andStatusdateIn(List<Date> values) {
            addCriterion("statusDate in", values, "statusdate");
            return (Criteria) this;
        }

        public Criteria andStatusdateNotIn(List<Date> values) {
            addCriterion("statusDate not in", values, "statusdate");
            return (Criteria) this;
        }

        public Criteria andStatusdateBetween(Date value1, Date value2) {
            addCriterion("statusDate between", value1, value2, "statusdate");
            return (Criteria) this;
        }

        public Criteria andStatusdateNotBetween(Date value1, Date value2) {
            addCriterion("statusDate not between", value1, value2, "statusdate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}