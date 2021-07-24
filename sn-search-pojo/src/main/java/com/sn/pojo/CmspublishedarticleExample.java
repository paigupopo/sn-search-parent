package com.sn.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CmspublishedarticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmspublishedarticleExample() {
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

        public Criteria andRefererresourceprimkeyIsNull() {
            addCriterion("refererResourcePrimKey is null");
            return (Criteria) this;
        }

        public Criteria andRefererresourceprimkeyIsNotNull() {
            addCriterion("refererResourcePrimKey is not null");
            return (Criteria) this;
        }

        public Criteria andRefererresourceprimkeyEqualTo(Long value) {
            addCriterion("refererResourcePrimKey =", value, "refererresourceprimkey");
            return (Criteria) this;
        }

        public Criteria andRefererresourceprimkeyNotEqualTo(Long value) {
            addCriterion("refererResourcePrimKey <>", value, "refererresourceprimkey");
            return (Criteria) this;
        }

        public Criteria andRefererresourceprimkeyGreaterThan(Long value) {
            addCriterion("refererResourcePrimKey >", value, "refererresourceprimkey");
            return (Criteria) this;
        }

        public Criteria andRefererresourceprimkeyGreaterThanOrEqualTo(Long value) {
            addCriterion("refererResourcePrimKey >=", value, "refererresourceprimkey");
            return (Criteria) this;
        }

        public Criteria andRefererresourceprimkeyLessThan(Long value) {
            addCriterion("refererResourcePrimKey <", value, "refererresourceprimkey");
            return (Criteria) this;
        }

        public Criteria andRefererresourceprimkeyLessThanOrEqualTo(Long value) {
            addCriterion("refererResourcePrimKey <=", value, "refererresourceprimkey");
            return (Criteria) this;
        }

        public Criteria andRefererresourceprimkeyIn(List<Long> values) {
            addCriterion("refererResourcePrimKey in", values, "refererresourceprimkey");
            return (Criteria) this;
        }

        public Criteria andRefererresourceprimkeyNotIn(List<Long> values) {
            addCriterion("refererResourcePrimKey not in", values, "refererresourceprimkey");
            return (Criteria) this;
        }

        public Criteria andRefererresourceprimkeyBetween(Long value1, Long value2) {
            addCriterion("refererResourcePrimKey between", value1, value2, "refererresourceprimkey");
            return (Criteria) this;
        }

        public Criteria andRefererresourceprimkeyNotBetween(Long value1, Long value2) {
            addCriterion("refererResourcePrimKey not between", value1, value2, "refererresourceprimkey");
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

        public Criteria andCategoryidIsNull() {
            addCriterion("categoryId is null");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNotNull() {
            addCriterion("categoryId is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryidEqualTo(Long value) {
            addCriterion("categoryId =", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotEqualTo(Long value) {
            addCriterion("categoryId <>", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThan(Long value) {
            addCriterion("categoryId >", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThanOrEqualTo(Long value) {
            addCriterion("categoryId >=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThan(Long value) {
            addCriterion("categoryId <", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThanOrEqualTo(Long value) {
            addCriterion("categoryId <=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidIn(List<Long> values) {
            addCriterion("categoryId in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotIn(List<Long> values) {
            addCriterion("categoryId not in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidBetween(Long value1, Long value2) {
            addCriterion("categoryId between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotBetween(Long value1, Long value2) {
            addCriterion("categoryId not between", value1, value2, "categoryid");
            return (Criteria) this;
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

        public Criteria andMobiletitleIsNull() {
            addCriterion("mobileTitle is null");
            return (Criteria) this;
        }

        public Criteria andMobiletitleIsNotNull() {
            addCriterion("mobileTitle is not null");
            return (Criteria) this;
        }

        public Criteria andMobiletitleEqualTo(String value) {
            addCriterion("mobileTitle =", value, "mobiletitle");
            return (Criteria) this;
        }

        public Criteria andMobiletitleNotEqualTo(String value) {
            addCriterion("mobileTitle <>", value, "mobiletitle");
            return (Criteria) this;
        }

        public Criteria andMobiletitleGreaterThan(String value) {
            addCriterion("mobileTitle >", value, "mobiletitle");
            return (Criteria) this;
        }

        public Criteria andMobiletitleGreaterThanOrEqualTo(String value) {
            addCriterion("mobileTitle >=", value, "mobiletitle");
            return (Criteria) this;
        }

        public Criteria andMobiletitleLessThan(String value) {
            addCriterion("mobileTitle <", value, "mobiletitle");
            return (Criteria) this;
        }

        public Criteria andMobiletitleLessThanOrEqualTo(String value) {
            addCriterion("mobileTitle <=", value, "mobiletitle");
            return (Criteria) this;
        }

        public Criteria andMobiletitleLike(String value) {
            addCriterion("mobileTitle like", value, "mobiletitle");
            return (Criteria) this;
        }

        public Criteria andMobiletitleNotLike(String value) {
            addCriterion("mobileTitle not like", value, "mobiletitle");
            return (Criteria) this;
        }

        public Criteria andMobiletitleIn(List<String> values) {
            addCriterion("mobileTitle in", values, "mobiletitle");
            return (Criteria) this;
        }

        public Criteria andMobiletitleNotIn(List<String> values) {
            addCriterion("mobileTitle not in", values, "mobiletitle");
            return (Criteria) this;
        }

        public Criteria andMobiletitleBetween(String value1, String value2) {
            addCriterion("mobileTitle between", value1, value2, "mobiletitle");
            return (Criteria) this;
        }

        public Criteria andMobiletitleNotBetween(String value1, String value2) {
            addCriterion("mobileTitle not between", value1, value2, "mobiletitle");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
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