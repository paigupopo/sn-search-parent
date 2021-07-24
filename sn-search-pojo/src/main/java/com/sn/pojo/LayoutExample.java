package com.sn.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LayoutExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LayoutExample() {
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

        public Criteria andPlidIsNull() {
            addCriterion("plid is null");
            return (Criteria) this;
        }

        public Criteria andPlidIsNotNull() {
            addCriterion("plid is not null");
            return (Criteria) this;
        }

        public Criteria andPlidEqualTo(Long value) {
            addCriterion("plid =", value, "plid");
            return (Criteria) this;
        }

        public Criteria andPlidNotEqualTo(Long value) {
            addCriterion("plid <>", value, "plid");
            return (Criteria) this;
        }

        public Criteria andPlidGreaterThan(Long value) {
            addCriterion("plid >", value, "plid");
            return (Criteria) this;
        }

        public Criteria andPlidGreaterThanOrEqualTo(Long value) {
            addCriterion("plid >=", value, "plid");
            return (Criteria) this;
        }

        public Criteria andPlidLessThan(Long value) {
            addCriterion("plid <", value, "plid");
            return (Criteria) this;
        }

        public Criteria andPlidLessThanOrEqualTo(Long value) {
            addCriterion("plid <=", value, "plid");
            return (Criteria) this;
        }

        public Criteria andPlidIn(List<Long> values) {
            addCriterion("plid in", values, "plid");
            return (Criteria) this;
        }

        public Criteria andPlidNotIn(List<Long> values) {
            addCriterion("plid not in", values, "plid");
            return (Criteria) this;
        }

        public Criteria andPlidBetween(Long value1, Long value2) {
            addCriterion("plid between", value1, value2, "plid");
            return (Criteria) this;
        }

        public Criteria andPlidNotBetween(Long value1, Long value2) {
            addCriterion("plid not between", value1, value2, "plid");
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

        public Criteria andPrivatelayoutIsNull() {
            addCriterion("privateLayout is null");
            return (Criteria) this;
        }

        public Criteria andPrivatelayoutIsNotNull() {
            addCriterion("privateLayout is not null");
            return (Criteria) this;
        }

        public Criteria andPrivatelayoutEqualTo(Long value) {
            addCriterion("privateLayout =", value, "privatelayout");
            return (Criteria) this;
        }

        public Criteria andPrivatelayoutNotEqualTo(Long value) {
            addCriterion("privateLayout <>", value, "privatelayout");
            return (Criteria) this;
        }

        public Criteria andPrivatelayoutGreaterThan(Long value) {
            addCriterion("privateLayout >", value, "privatelayout");
            return (Criteria) this;
        }

        public Criteria andPrivatelayoutGreaterThanOrEqualTo(Long value) {
            addCriterion("privateLayout >=", value, "privatelayout");
            return (Criteria) this;
        }

        public Criteria andPrivatelayoutLessThan(Long value) {
            addCriterion("privateLayout <", value, "privatelayout");
            return (Criteria) this;
        }

        public Criteria andPrivatelayoutLessThanOrEqualTo(Long value) {
            addCriterion("privateLayout <=", value, "privatelayout");
            return (Criteria) this;
        }

        public Criteria andPrivatelayoutIn(List<Long> values) {
            addCriterion("privateLayout in", values, "privatelayout");
            return (Criteria) this;
        }

        public Criteria andPrivatelayoutNotIn(List<Long> values) {
            addCriterion("privateLayout not in", values, "privatelayout");
            return (Criteria) this;
        }

        public Criteria andPrivatelayoutBetween(Long value1, Long value2) {
            addCriterion("privateLayout between", value1, value2, "privatelayout");
            return (Criteria) this;
        }

        public Criteria andPrivatelayoutNotBetween(Long value1, Long value2) {
            addCriterion("privateLayout not between", value1, value2, "privatelayout");
            return (Criteria) this;
        }

        public Criteria andLayoutidIsNull() {
            addCriterion("layoutId is null");
            return (Criteria) this;
        }

        public Criteria andLayoutidIsNotNull() {
            addCriterion("layoutId is not null");
            return (Criteria) this;
        }

        public Criteria andLayoutidEqualTo(Long value) {
            addCriterion("layoutId =", value, "layoutid");
            return (Criteria) this;
        }

        public Criteria andLayoutidNotEqualTo(Long value) {
            addCriterion("layoutId <>", value, "layoutid");
            return (Criteria) this;
        }

        public Criteria andLayoutidGreaterThan(Long value) {
            addCriterion("layoutId >", value, "layoutid");
            return (Criteria) this;
        }

        public Criteria andLayoutidGreaterThanOrEqualTo(Long value) {
            addCriterion("layoutId >=", value, "layoutid");
            return (Criteria) this;
        }

        public Criteria andLayoutidLessThan(Long value) {
            addCriterion("layoutId <", value, "layoutid");
            return (Criteria) this;
        }

        public Criteria andLayoutidLessThanOrEqualTo(Long value) {
            addCriterion("layoutId <=", value, "layoutid");
            return (Criteria) this;
        }

        public Criteria andLayoutidIn(List<Long> values) {
            addCriterion("layoutId in", values, "layoutid");
            return (Criteria) this;
        }

        public Criteria andLayoutidNotIn(List<Long> values) {
            addCriterion("layoutId not in", values, "layoutid");
            return (Criteria) this;
        }

        public Criteria andLayoutidBetween(Long value1, Long value2) {
            addCriterion("layoutId between", value1, value2, "layoutid");
            return (Criteria) this;
        }

        public Criteria andLayoutidNotBetween(Long value1, Long value2) {
            addCriterion("layoutId not between", value1, value2, "layoutid");
            return (Criteria) this;
        }

        public Criteria andParentlayoutidIsNull() {
            addCriterion("parentLayoutId is null");
            return (Criteria) this;
        }

        public Criteria andParentlayoutidIsNotNull() {
            addCriterion("parentLayoutId is not null");
            return (Criteria) this;
        }

        public Criteria andParentlayoutidEqualTo(Long value) {
            addCriterion("parentLayoutId =", value, "parentlayoutid");
            return (Criteria) this;
        }

        public Criteria andParentlayoutidNotEqualTo(Long value) {
            addCriterion("parentLayoutId <>", value, "parentlayoutid");
            return (Criteria) this;
        }

        public Criteria andParentlayoutidGreaterThan(Long value) {
            addCriterion("parentLayoutId >", value, "parentlayoutid");
            return (Criteria) this;
        }

        public Criteria andParentlayoutidGreaterThanOrEqualTo(Long value) {
            addCriterion("parentLayoutId >=", value, "parentlayoutid");
            return (Criteria) this;
        }

        public Criteria andParentlayoutidLessThan(Long value) {
            addCriterion("parentLayoutId <", value, "parentlayoutid");
            return (Criteria) this;
        }

        public Criteria andParentlayoutidLessThanOrEqualTo(Long value) {
            addCriterion("parentLayoutId <=", value, "parentlayoutid");
            return (Criteria) this;
        }

        public Criteria andParentlayoutidIn(List<Long> values) {
            addCriterion("parentLayoutId in", values, "parentlayoutid");
            return (Criteria) this;
        }

        public Criteria andParentlayoutidNotIn(List<Long> values) {
            addCriterion("parentLayoutId not in", values, "parentlayoutid");
            return (Criteria) this;
        }

        public Criteria andParentlayoutidBetween(Long value1, Long value2) {
            addCriterion("parentLayoutId between", value1, value2, "parentlayoutid");
            return (Criteria) this;
        }

        public Criteria andParentlayoutidNotBetween(Long value1, Long value2) {
            addCriterion("parentLayoutId not between", value1, value2, "parentlayoutid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
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

        public Criteria andKeywordsIsNull() {
            addCriterion("keywords is null");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNotNull() {
            addCriterion("keywords is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordsEqualTo(String value) {
            addCriterion("keywords =", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotEqualTo(String value) {
            addCriterion("keywords <>", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThan(String value) {
            addCriterion("keywords >", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("keywords >=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThan(String value) {
            addCriterion("keywords <", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThanOrEqualTo(String value) {
            addCriterion("keywords <=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLike(String value) {
            addCriterion("keywords like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotLike(String value) {
            addCriterion("keywords not like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsIn(List<String> values) {
            addCriterion("keywords in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotIn(List<String> values) {
            addCriterion("keywords not in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsBetween(String value1, String value2) {
            addCriterion("keywords between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotBetween(String value1, String value2) {
            addCriterion("keywords not between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andRobotsIsNull() {
            addCriterion("robots is null");
            return (Criteria) this;
        }

        public Criteria andRobotsIsNotNull() {
            addCriterion("robots is not null");
            return (Criteria) this;
        }

        public Criteria andRobotsEqualTo(String value) {
            addCriterion("robots =", value, "robots");
            return (Criteria) this;
        }

        public Criteria andRobotsNotEqualTo(String value) {
            addCriterion("robots <>", value, "robots");
            return (Criteria) this;
        }

        public Criteria andRobotsGreaterThan(String value) {
            addCriterion("robots >", value, "robots");
            return (Criteria) this;
        }

        public Criteria andRobotsGreaterThanOrEqualTo(String value) {
            addCriterion("robots >=", value, "robots");
            return (Criteria) this;
        }

        public Criteria andRobotsLessThan(String value) {
            addCriterion("robots <", value, "robots");
            return (Criteria) this;
        }

        public Criteria andRobotsLessThanOrEqualTo(String value) {
            addCriterion("robots <=", value, "robots");
            return (Criteria) this;
        }

        public Criteria andRobotsLike(String value) {
            addCriterion("robots like", value, "robots");
            return (Criteria) this;
        }

        public Criteria andRobotsNotLike(String value) {
            addCriterion("robots not like", value, "robots");
            return (Criteria) this;
        }

        public Criteria andRobotsIn(List<String> values) {
            addCriterion("robots in", values, "robots");
            return (Criteria) this;
        }

        public Criteria andRobotsNotIn(List<String> values) {
            addCriterion("robots not in", values, "robots");
            return (Criteria) this;
        }

        public Criteria andRobotsBetween(String value1, String value2) {
            addCriterion("robots between", value1, value2, "robots");
            return (Criteria) this;
        }

        public Criteria andRobotsNotBetween(String value1, String value2) {
            addCriterion("robots not between", value1, value2, "robots");
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

        public Criteria andTypesettingsIsNull() {
            addCriterion("typeSettings is null");
            return (Criteria) this;
        }

        public Criteria andTypesettingsIsNotNull() {
            addCriterion("typeSettings is not null");
            return (Criteria) this;
        }

        public Criteria andTypesettingsEqualTo(String value) {
            addCriterion("typeSettings =", value, "typesettings");
            return (Criteria) this;
        }

        public Criteria andTypesettingsNotEqualTo(String value) {
            addCriterion("typeSettings <>", value, "typesettings");
            return (Criteria) this;
        }

        public Criteria andTypesettingsGreaterThan(String value) {
            addCriterion("typeSettings >", value, "typesettings");
            return (Criteria) this;
        }

        public Criteria andTypesettingsGreaterThanOrEqualTo(String value) {
            addCriterion("typeSettings >=", value, "typesettings");
            return (Criteria) this;
        }

        public Criteria andTypesettingsLessThan(String value) {
            addCriterion("typeSettings <", value, "typesettings");
            return (Criteria) this;
        }

        public Criteria andTypesettingsLessThanOrEqualTo(String value) {
            addCriterion("typeSettings <=", value, "typesettings");
            return (Criteria) this;
        }

        public Criteria andTypesettingsLike(String value) {
            addCriterion("typeSettings like", value, "typesettings");
            return (Criteria) this;
        }

        public Criteria andTypesettingsNotLike(String value) {
            addCriterion("typeSettings not like", value, "typesettings");
            return (Criteria) this;
        }

        public Criteria andTypesettingsIn(List<String> values) {
            addCriterion("typeSettings in", values, "typesettings");
            return (Criteria) this;
        }

        public Criteria andTypesettingsNotIn(List<String> values) {
            addCriterion("typeSettings not in", values, "typesettings");
            return (Criteria) this;
        }

        public Criteria andTypesettingsBetween(String value1, String value2) {
            addCriterion("typeSettings between", value1, value2, "typesettings");
            return (Criteria) this;
        }

        public Criteria andTypesettingsNotBetween(String value1, String value2) {
            addCriterion("typeSettings not between", value1, value2, "typesettings");
            return (Criteria) this;
        }

        public Criteria andHiddenIsNull() {
            addCriterion("hidden_ is null");
            return (Criteria) this;
        }

        public Criteria andHiddenIsNotNull() {
            addCriterion("hidden_ is not null");
            return (Criteria) this;
        }

        public Criteria andHiddenEqualTo(Byte value) {
            addCriterion("hidden_ =", value, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenNotEqualTo(Byte value) {
            addCriterion("hidden_ <>", value, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenGreaterThan(Byte value) {
            addCriterion("hidden_ >", value, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenGreaterThanOrEqualTo(Byte value) {
            addCriterion("hidden_ >=", value, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenLessThan(Byte value) {
            addCriterion("hidden_ <", value, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenLessThanOrEqualTo(Byte value) {
            addCriterion("hidden_ <=", value, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenIn(List<Byte> values) {
            addCriterion("hidden_ in", values, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenNotIn(List<Byte> values) {
            addCriterion("hidden_ not in", values, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenBetween(Byte value1, Byte value2) {
            addCriterion("hidden_ between", value1, value2, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenNotBetween(Byte value1, Byte value2) {
            addCriterion("hidden_ not between", value1, value2, "hidden");
            return (Criteria) this;
        }

        public Criteria andFriendlyurlIsNull() {
            addCriterion("friendlyURL is null");
            return (Criteria) this;
        }

        public Criteria andFriendlyurlIsNotNull() {
            addCriterion("friendlyURL is not null");
            return (Criteria) this;
        }

        public Criteria andFriendlyurlEqualTo(String value) {
            addCriterion("friendlyURL =", value, "friendlyurl");
            return (Criteria) this;
        }

        public Criteria andFriendlyurlNotEqualTo(String value) {
            addCriterion("friendlyURL <>", value, "friendlyurl");
            return (Criteria) this;
        }

        public Criteria andFriendlyurlGreaterThan(String value) {
            addCriterion("friendlyURL >", value, "friendlyurl");
            return (Criteria) this;
        }

        public Criteria andFriendlyurlGreaterThanOrEqualTo(String value) {
            addCriterion("friendlyURL >=", value, "friendlyurl");
            return (Criteria) this;
        }

        public Criteria andFriendlyurlLessThan(String value) {
            addCriterion("friendlyURL <", value, "friendlyurl");
            return (Criteria) this;
        }

        public Criteria andFriendlyurlLessThanOrEqualTo(String value) {
            addCriterion("friendlyURL <=", value, "friendlyurl");
            return (Criteria) this;
        }

        public Criteria andFriendlyurlLike(String value) {
            addCriterion("friendlyURL like", value, "friendlyurl");
            return (Criteria) this;
        }

        public Criteria andFriendlyurlNotLike(String value) {
            addCriterion("friendlyURL not like", value, "friendlyurl");
            return (Criteria) this;
        }

        public Criteria andFriendlyurlIn(List<String> values) {
            addCriterion("friendlyURL in", values, "friendlyurl");
            return (Criteria) this;
        }

        public Criteria andFriendlyurlNotIn(List<String> values) {
            addCriterion("friendlyURL not in", values, "friendlyurl");
            return (Criteria) this;
        }

        public Criteria andFriendlyurlBetween(String value1, String value2) {
            addCriterion("friendlyURL between", value1, value2, "friendlyurl");
            return (Criteria) this;
        }

        public Criteria andFriendlyurlNotBetween(String value1, String value2) {
            addCriterion("friendlyURL not between", value1, value2, "friendlyurl");
            return (Criteria) this;
        }

        public Criteria andIconimageIsNull() {
            addCriterion("iconImage is null");
            return (Criteria) this;
        }

        public Criteria andIconimageIsNotNull() {
            addCriterion("iconImage is not null");
            return (Criteria) this;
        }

        public Criteria andIconimageEqualTo(Byte value) {
            addCriterion("iconImage =", value, "iconimage");
            return (Criteria) this;
        }

        public Criteria andIconimageNotEqualTo(Byte value) {
            addCriterion("iconImage <>", value, "iconimage");
            return (Criteria) this;
        }

        public Criteria andIconimageGreaterThan(Byte value) {
            addCriterion("iconImage >", value, "iconimage");
            return (Criteria) this;
        }

        public Criteria andIconimageGreaterThanOrEqualTo(Byte value) {
            addCriterion("iconImage >=", value, "iconimage");
            return (Criteria) this;
        }

        public Criteria andIconimageLessThan(Byte value) {
            addCriterion("iconImage <", value, "iconimage");
            return (Criteria) this;
        }

        public Criteria andIconimageLessThanOrEqualTo(Byte value) {
            addCriterion("iconImage <=", value, "iconimage");
            return (Criteria) this;
        }

        public Criteria andIconimageIn(List<Byte> values) {
            addCriterion("iconImage in", values, "iconimage");
            return (Criteria) this;
        }

        public Criteria andIconimageNotIn(List<Byte> values) {
            addCriterion("iconImage not in", values, "iconimage");
            return (Criteria) this;
        }

        public Criteria andIconimageBetween(Byte value1, Byte value2) {
            addCriterion("iconImage between", value1, value2, "iconimage");
            return (Criteria) this;
        }

        public Criteria andIconimageNotBetween(Byte value1, Byte value2) {
            addCriterion("iconImage not between", value1, value2, "iconimage");
            return (Criteria) this;
        }

        public Criteria andIconimageidIsNull() {
            addCriterion("iconImageId is null");
            return (Criteria) this;
        }

        public Criteria andIconimageidIsNotNull() {
            addCriterion("iconImageId is not null");
            return (Criteria) this;
        }

        public Criteria andIconimageidEqualTo(Long value) {
            addCriterion("iconImageId =", value, "iconimageid");
            return (Criteria) this;
        }

        public Criteria andIconimageidNotEqualTo(Long value) {
            addCriterion("iconImageId <>", value, "iconimageid");
            return (Criteria) this;
        }

        public Criteria andIconimageidGreaterThan(Long value) {
            addCriterion("iconImageId >", value, "iconimageid");
            return (Criteria) this;
        }

        public Criteria andIconimageidGreaterThanOrEqualTo(Long value) {
            addCriterion("iconImageId >=", value, "iconimageid");
            return (Criteria) this;
        }

        public Criteria andIconimageidLessThan(Long value) {
            addCriterion("iconImageId <", value, "iconimageid");
            return (Criteria) this;
        }

        public Criteria andIconimageidLessThanOrEqualTo(Long value) {
            addCriterion("iconImageId <=", value, "iconimageid");
            return (Criteria) this;
        }

        public Criteria andIconimageidIn(List<Long> values) {
            addCriterion("iconImageId in", values, "iconimageid");
            return (Criteria) this;
        }

        public Criteria andIconimageidNotIn(List<Long> values) {
            addCriterion("iconImageId not in", values, "iconimageid");
            return (Criteria) this;
        }

        public Criteria andIconimageidBetween(Long value1, Long value2) {
            addCriterion("iconImageId between", value1, value2, "iconimageid");
            return (Criteria) this;
        }

        public Criteria andIconimageidNotBetween(Long value1, Long value2) {
            addCriterion("iconImageId not between", value1, value2, "iconimageid");
            return (Criteria) this;
        }

        public Criteria andThemeidIsNull() {
            addCriterion("themeId is null");
            return (Criteria) this;
        }

        public Criteria andThemeidIsNotNull() {
            addCriterion("themeId is not null");
            return (Criteria) this;
        }

        public Criteria andThemeidEqualTo(String value) {
            addCriterion("themeId =", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidNotEqualTo(String value) {
            addCriterion("themeId <>", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidGreaterThan(String value) {
            addCriterion("themeId >", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidGreaterThanOrEqualTo(String value) {
            addCriterion("themeId >=", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidLessThan(String value) {
            addCriterion("themeId <", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidLessThanOrEqualTo(String value) {
            addCriterion("themeId <=", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidLike(String value) {
            addCriterion("themeId like", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidNotLike(String value) {
            addCriterion("themeId not like", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidIn(List<String> values) {
            addCriterion("themeId in", values, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidNotIn(List<String> values) {
            addCriterion("themeId not in", values, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidBetween(String value1, String value2) {
            addCriterion("themeId between", value1, value2, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidNotBetween(String value1, String value2) {
            addCriterion("themeId not between", value1, value2, "themeid");
            return (Criteria) this;
        }

        public Criteria andColorschemeidIsNull() {
            addCriterion("colorSchemeId is null");
            return (Criteria) this;
        }

        public Criteria andColorschemeidIsNotNull() {
            addCriterion("colorSchemeId is not null");
            return (Criteria) this;
        }

        public Criteria andColorschemeidEqualTo(String value) {
            addCriterion("colorSchemeId =", value, "colorschemeid");
            return (Criteria) this;
        }

        public Criteria andColorschemeidNotEqualTo(String value) {
            addCriterion("colorSchemeId <>", value, "colorschemeid");
            return (Criteria) this;
        }

        public Criteria andColorschemeidGreaterThan(String value) {
            addCriterion("colorSchemeId >", value, "colorschemeid");
            return (Criteria) this;
        }

        public Criteria andColorschemeidGreaterThanOrEqualTo(String value) {
            addCriterion("colorSchemeId >=", value, "colorschemeid");
            return (Criteria) this;
        }

        public Criteria andColorschemeidLessThan(String value) {
            addCriterion("colorSchemeId <", value, "colorschemeid");
            return (Criteria) this;
        }

        public Criteria andColorschemeidLessThanOrEqualTo(String value) {
            addCriterion("colorSchemeId <=", value, "colorschemeid");
            return (Criteria) this;
        }

        public Criteria andColorschemeidLike(String value) {
            addCriterion("colorSchemeId like", value, "colorschemeid");
            return (Criteria) this;
        }

        public Criteria andColorschemeidNotLike(String value) {
            addCriterion("colorSchemeId not like", value, "colorschemeid");
            return (Criteria) this;
        }

        public Criteria andColorschemeidIn(List<String> values) {
            addCriterion("colorSchemeId in", values, "colorschemeid");
            return (Criteria) this;
        }

        public Criteria andColorschemeidNotIn(List<String> values) {
            addCriterion("colorSchemeId not in", values, "colorschemeid");
            return (Criteria) this;
        }

        public Criteria andColorschemeidBetween(String value1, String value2) {
            addCriterion("colorSchemeId between", value1, value2, "colorschemeid");
            return (Criteria) this;
        }

        public Criteria andColorschemeidNotBetween(String value1, String value2) {
            addCriterion("colorSchemeId not between", value1, value2, "colorschemeid");
            return (Criteria) this;
        }

        public Criteria andWapthemeidIsNull() {
            addCriterion("wapThemeId is null");
            return (Criteria) this;
        }

        public Criteria andWapthemeidIsNotNull() {
            addCriterion("wapThemeId is not null");
            return (Criteria) this;
        }

        public Criteria andWapthemeidEqualTo(String value) {
            addCriterion("wapThemeId =", value, "wapthemeid");
            return (Criteria) this;
        }

        public Criteria andWapthemeidNotEqualTo(String value) {
            addCriterion("wapThemeId <>", value, "wapthemeid");
            return (Criteria) this;
        }

        public Criteria andWapthemeidGreaterThan(String value) {
            addCriterion("wapThemeId >", value, "wapthemeid");
            return (Criteria) this;
        }

        public Criteria andWapthemeidGreaterThanOrEqualTo(String value) {
            addCriterion("wapThemeId >=", value, "wapthemeid");
            return (Criteria) this;
        }

        public Criteria andWapthemeidLessThan(String value) {
            addCriterion("wapThemeId <", value, "wapthemeid");
            return (Criteria) this;
        }

        public Criteria andWapthemeidLessThanOrEqualTo(String value) {
            addCriterion("wapThemeId <=", value, "wapthemeid");
            return (Criteria) this;
        }

        public Criteria andWapthemeidLike(String value) {
            addCriterion("wapThemeId like", value, "wapthemeid");
            return (Criteria) this;
        }

        public Criteria andWapthemeidNotLike(String value) {
            addCriterion("wapThemeId not like", value, "wapthemeid");
            return (Criteria) this;
        }

        public Criteria andWapthemeidIn(List<String> values) {
            addCriterion("wapThemeId in", values, "wapthemeid");
            return (Criteria) this;
        }

        public Criteria andWapthemeidNotIn(List<String> values) {
            addCriterion("wapThemeId not in", values, "wapthemeid");
            return (Criteria) this;
        }

        public Criteria andWapthemeidBetween(String value1, String value2) {
            addCriterion("wapThemeId between", value1, value2, "wapthemeid");
            return (Criteria) this;
        }

        public Criteria andWapthemeidNotBetween(String value1, String value2) {
            addCriterion("wapThemeId not between", value1, value2, "wapthemeid");
            return (Criteria) this;
        }

        public Criteria andWapcolorschemeidIsNull() {
            addCriterion("wapColorSchemeId is null");
            return (Criteria) this;
        }

        public Criteria andWapcolorschemeidIsNotNull() {
            addCriterion("wapColorSchemeId is not null");
            return (Criteria) this;
        }

        public Criteria andWapcolorschemeidEqualTo(String value) {
            addCriterion("wapColorSchemeId =", value, "wapcolorschemeid");
            return (Criteria) this;
        }

        public Criteria andWapcolorschemeidNotEqualTo(String value) {
            addCriterion("wapColorSchemeId <>", value, "wapcolorschemeid");
            return (Criteria) this;
        }

        public Criteria andWapcolorschemeidGreaterThan(String value) {
            addCriterion("wapColorSchemeId >", value, "wapcolorschemeid");
            return (Criteria) this;
        }

        public Criteria andWapcolorschemeidGreaterThanOrEqualTo(String value) {
            addCriterion("wapColorSchemeId >=", value, "wapcolorschemeid");
            return (Criteria) this;
        }

        public Criteria andWapcolorschemeidLessThan(String value) {
            addCriterion("wapColorSchemeId <", value, "wapcolorschemeid");
            return (Criteria) this;
        }

        public Criteria andWapcolorschemeidLessThanOrEqualTo(String value) {
            addCriterion("wapColorSchemeId <=", value, "wapcolorschemeid");
            return (Criteria) this;
        }

        public Criteria andWapcolorschemeidLike(String value) {
            addCriterion("wapColorSchemeId like", value, "wapcolorschemeid");
            return (Criteria) this;
        }

        public Criteria andWapcolorschemeidNotLike(String value) {
            addCriterion("wapColorSchemeId not like", value, "wapcolorschemeid");
            return (Criteria) this;
        }

        public Criteria andWapcolorschemeidIn(List<String> values) {
            addCriterion("wapColorSchemeId in", values, "wapcolorschemeid");
            return (Criteria) this;
        }

        public Criteria andWapcolorschemeidNotIn(List<String> values) {
            addCriterion("wapColorSchemeId not in", values, "wapcolorschemeid");
            return (Criteria) this;
        }

        public Criteria andWapcolorschemeidBetween(String value1, String value2) {
            addCriterion("wapColorSchemeId between", value1, value2, "wapcolorschemeid");
            return (Criteria) this;
        }

        public Criteria andWapcolorschemeidNotBetween(String value1, String value2) {
            addCriterion("wapColorSchemeId not between", value1, value2, "wapcolorschemeid");
            return (Criteria) this;
        }

        public Criteria andCssIsNull() {
            addCriterion("css is null");
            return (Criteria) this;
        }

        public Criteria andCssIsNotNull() {
            addCriterion("css is not null");
            return (Criteria) this;
        }

        public Criteria andCssEqualTo(String value) {
            addCriterion("css =", value, "css");
            return (Criteria) this;
        }

        public Criteria andCssNotEqualTo(String value) {
            addCriterion("css <>", value, "css");
            return (Criteria) this;
        }

        public Criteria andCssGreaterThan(String value) {
            addCriterion("css >", value, "css");
            return (Criteria) this;
        }

        public Criteria andCssGreaterThanOrEqualTo(String value) {
            addCriterion("css >=", value, "css");
            return (Criteria) this;
        }

        public Criteria andCssLessThan(String value) {
            addCriterion("css <", value, "css");
            return (Criteria) this;
        }

        public Criteria andCssLessThanOrEqualTo(String value) {
            addCriterion("css <=", value, "css");
            return (Criteria) this;
        }

        public Criteria andCssLike(String value) {
            addCriterion("css like", value, "css");
            return (Criteria) this;
        }

        public Criteria andCssNotLike(String value) {
            addCriterion("css not like", value, "css");
            return (Criteria) this;
        }

        public Criteria andCssIn(List<String> values) {
            addCriterion("css in", values, "css");
            return (Criteria) this;
        }

        public Criteria andCssNotIn(List<String> values) {
            addCriterion("css not in", values, "css");
            return (Criteria) this;
        }

        public Criteria andCssBetween(String value1, String value2) {
            addCriterion("css between", value1, value2, "css");
            return (Criteria) this;
        }

        public Criteria andCssNotBetween(String value1, String value2) {
            addCriterion("css not between", value1, value2, "css");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Integer value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Integer value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Integer value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Integer value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Integer> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Integer> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Integer value1, Integer value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("priority not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andLayoutprototypeuuidIsNull() {
            addCriterion("layoutPrototypeUuid is null");
            return (Criteria) this;
        }

        public Criteria andLayoutprototypeuuidIsNotNull() {
            addCriterion("layoutPrototypeUuid is not null");
            return (Criteria) this;
        }

        public Criteria andLayoutprototypeuuidEqualTo(String value) {
            addCriterion("layoutPrototypeUuid =", value, "layoutprototypeuuid");
            return (Criteria) this;
        }

        public Criteria andLayoutprototypeuuidNotEqualTo(String value) {
            addCriterion("layoutPrototypeUuid <>", value, "layoutprototypeuuid");
            return (Criteria) this;
        }

        public Criteria andLayoutprototypeuuidGreaterThan(String value) {
            addCriterion("layoutPrototypeUuid >", value, "layoutprototypeuuid");
            return (Criteria) this;
        }

        public Criteria andLayoutprototypeuuidGreaterThanOrEqualTo(String value) {
            addCriterion("layoutPrototypeUuid >=", value, "layoutprototypeuuid");
            return (Criteria) this;
        }

        public Criteria andLayoutprototypeuuidLessThan(String value) {
            addCriterion("layoutPrototypeUuid <", value, "layoutprototypeuuid");
            return (Criteria) this;
        }

        public Criteria andLayoutprototypeuuidLessThanOrEqualTo(String value) {
            addCriterion("layoutPrototypeUuid <=", value, "layoutprototypeuuid");
            return (Criteria) this;
        }

        public Criteria andLayoutprototypeuuidLike(String value) {
            addCriterion("layoutPrototypeUuid like", value, "layoutprototypeuuid");
            return (Criteria) this;
        }

        public Criteria andLayoutprototypeuuidNotLike(String value) {
            addCriterion("layoutPrototypeUuid not like", value, "layoutprototypeuuid");
            return (Criteria) this;
        }

        public Criteria andLayoutprototypeuuidIn(List<String> values) {
            addCriterion("layoutPrototypeUuid in", values, "layoutprototypeuuid");
            return (Criteria) this;
        }

        public Criteria andLayoutprototypeuuidNotIn(List<String> values) {
            addCriterion("layoutPrototypeUuid not in", values, "layoutprototypeuuid");
            return (Criteria) this;
        }

        public Criteria andLayoutprototypeuuidBetween(String value1, String value2) {
            addCriterion("layoutPrototypeUuid between", value1, value2, "layoutprototypeuuid");
            return (Criteria) this;
        }

        public Criteria andLayoutprototypeuuidNotBetween(String value1, String value2) {
            addCriterion("layoutPrototypeUuid not between", value1, value2, "layoutprototypeuuid");
            return (Criteria) this;
        }

        public Criteria andLayoutprototypelinkenabledIsNull() {
            addCriterion("layoutPrototypeLinkEnabled is null");
            return (Criteria) this;
        }

        public Criteria andLayoutprototypelinkenabledIsNotNull() {
            addCriterion("layoutPrototypeLinkEnabled is not null");
            return (Criteria) this;
        }

        public Criteria andLayoutprototypelinkenabledEqualTo(Byte value) {
            addCriterion("layoutPrototypeLinkEnabled =", value, "layoutprototypelinkenabled");
            return (Criteria) this;
        }

        public Criteria andLayoutprototypelinkenabledNotEqualTo(Byte value) {
            addCriterion("layoutPrototypeLinkEnabled <>", value, "layoutprototypelinkenabled");
            return (Criteria) this;
        }

        public Criteria andLayoutprototypelinkenabledGreaterThan(Byte value) {
            addCriterion("layoutPrototypeLinkEnabled >", value, "layoutprototypelinkenabled");
            return (Criteria) this;
        }

        public Criteria andLayoutprototypelinkenabledGreaterThanOrEqualTo(Byte value) {
            addCriterion("layoutPrototypeLinkEnabled >=", value, "layoutprototypelinkenabled");
            return (Criteria) this;
        }

        public Criteria andLayoutprototypelinkenabledLessThan(Byte value) {
            addCriterion("layoutPrototypeLinkEnabled <", value, "layoutprototypelinkenabled");
            return (Criteria) this;
        }

        public Criteria andLayoutprototypelinkenabledLessThanOrEqualTo(Byte value) {
            addCriterion("layoutPrototypeLinkEnabled <=", value, "layoutprototypelinkenabled");
            return (Criteria) this;
        }

        public Criteria andLayoutprototypelinkenabledIn(List<Byte> values) {
            addCriterion("layoutPrototypeLinkEnabled in", values, "layoutprototypelinkenabled");
            return (Criteria) this;
        }

        public Criteria andLayoutprototypelinkenabledNotIn(List<Byte> values) {
            addCriterion("layoutPrototypeLinkEnabled not in", values, "layoutprototypelinkenabled");
            return (Criteria) this;
        }

        public Criteria andLayoutprototypelinkenabledBetween(Byte value1, Byte value2) {
            addCriterion("layoutPrototypeLinkEnabled between", value1, value2, "layoutprototypelinkenabled");
            return (Criteria) this;
        }

        public Criteria andLayoutprototypelinkenabledNotBetween(Byte value1, Byte value2) {
            addCriterion("layoutPrototypeLinkEnabled not between", value1, value2, "layoutprototypelinkenabled");
            return (Criteria) this;
        }

        public Criteria andSourceprototypelayoutuuidIsNull() {
            addCriterion("sourcePrototypeLayoutUuid is null");
            return (Criteria) this;
        }

        public Criteria andSourceprototypelayoutuuidIsNotNull() {
            addCriterion("sourcePrototypeLayoutUuid is not null");
            return (Criteria) this;
        }

        public Criteria andSourceprototypelayoutuuidEqualTo(String value) {
            addCriterion("sourcePrototypeLayoutUuid =", value, "sourceprototypelayoutuuid");
            return (Criteria) this;
        }

        public Criteria andSourceprototypelayoutuuidNotEqualTo(String value) {
            addCriterion("sourcePrototypeLayoutUuid <>", value, "sourceprototypelayoutuuid");
            return (Criteria) this;
        }

        public Criteria andSourceprototypelayoutuuidGreaterThan(String value) {
            addCriterion("sourcePrototypeLayoutUuid >", value, "sourceprototypelayoutuuid");
            return (Criteria) this;
        }

        public Criteria andSourceprototypelayoutuuidGreaterThanOrEqualTo(String value) {
            addCriterion("sourcePrototypeLayoutUuid >=", value, "sourceprototypelayoutuuid");
            return (Criteria) this;
        }

        public Criteria andSourceprototypelayoutuuidLessThan(String value) {
            addCriterion("sourcePrototypeLayoutUuid <", value, "sourceprototypelayoutuuid");
            return (Criteria) this;
        }

        public Criteria andSourceprototypelayoutuuidLessThanOrEqualTo(String value) {
            addCriterion("sourcePrototypeLayoutUuid <=", value, "sourceprototypelayoutuuid");
            return (Criteria) this;
        }

        public Criteria andSourceprototypelayoutuuidLike(String value) {
            addCriterion("sourcePrototypeLayoutUuid like", value, "sourceprototypelayoutuuid");
            return (Criteria) this;
        }

        public Criteria andSourceprototypelayoutuuidNotLike(String value) {
            addCriterion("sourcePrototypeLayoutUuid not like", value, "sourceprototypelayoutuuid");
            return (Criteria) this;
        }

        public Criteria andSourceprototypelayoutuuidIn(List<String> values) {
            addCriterion("sourcePrototypeLayoutUuid in", values, "sourceprototypelayoutuuid");
            return (Criteria) this;
        }

        public Criteria andSourceprototypelayoutuuidNotIn(List<String> values) {
            addCriterion("sourcePrototypeLayoutUuid not in", values, "sourceprototypelayoutuuid");
            return (Criteria) this;
        }

        public Criteria andSourceprototypelayoutuuidBetween(String value1, String value2) {
            addCriterion("sourcePrototypeLayoutUuid between", value1, value2, "sourceprototypelayoutuuid");
            return (Criteria) this;
        }

        public Criteria andSourceprototypelayoutuuidNotBetween(String value1, String value2) {
            addCriterion("sourcePrototypeLayoutUuid not between", value1, value2, "sourceprototypelayoutuuid");
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