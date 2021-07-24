package com.sn.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ViewboxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ViewboxExample() {
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

        public Criteria andFangtanidIsNull() {
            addCriterion("fangtanId is null");
            return (Criteria) this;
        }

        public Criteria andFangtanidIsNotNull() {
            addCriterion("fangtanId is not null");
            return (Criteria) this;
        }

        public Criteria andFangtanidEqualTo(Long value) {
            addCriterion("fangtanId =", value, "fangtanid");
            return (Criteria) this;
        }

        public Criteria andFangtanidNotEqualTo(Long value) {
            addCriterion("fangtanId <>", value, "fangtanid");
            return (Criteria) this;
        }

        public Criteria andFangtanidGreaterThan(Long value) {
            addCriterion("fangtanId >", value, "fangtanid");
            return (Criteria) this;
        }

        public Criteria andFangtanidGreaterThanOrEqualTo(Long value) {
            addCriterion("fangtanId >=", value, "fangtanid");
            return (Criteria) this;
        }

        public Criteria andFangtanidLessThan(Long value) {
            addCriterion("fangtanId <", value, "fangtanid");
            return (Criteria) this;
        }

        public Criteria andFangtanidLessThanOrEqualTo(Long value) {
            addCriterion("fangtanId <=", value, "fangtanid");
            return (Criteria) this;
        }

        public Criteria andFangtanidIn(List<Long> values) {
            addCriterion("fangtanId in", values, "fangtanid");
            return (Criteria) this;
        }

        public Criteria andFangtanidNotIn(List<Long> values) {
            addCriterion("fangtanId not in", values, "fangtanid");
            return (Criteria) this;
        }

        public Criteria andFangtanidBetween(Long value1, Long value2) {
            addCriterion("fangtanId between", value1, value2, "fangtanid");
            return (Criteria) this;
        }

        public Criteria andFangtanidNotBetween(Long value1, Long value2) {
            addCriterion("fangtanId not between", value1, value2, "fangtanid");
            return (Criteria) this;
        }

        public Criteria andFangtanbegintimeIsNull() {
            addCriterion("fangtanbeginTime is null");
            return (Criteria) this;
        }

        public Criteria andFangtanbegintimeIsNotNull() {
            addCriterion("fangtanbeginTime is not null");
            return (Criteria) this;
        }

        public Criteria andFangtanbegintimeEqualTo(Date value) {
            addCriterion("fangtanbeginTime =", value, "fangtanbegintime");
            return (Criteria) this;
        }

        public Criteria andFangtanbegintimeNotEqualTo(Date value) {
            addCriterion("fangtanbeginTime <>", value, "fangtanbegintime");
            return (Criteria) this;
        }

        public Criteria andFangtanbegintimeGreaterThan(Date value) {
            addCriterion("fangtanbeginTime >", value, "fangtanbegintime");
            return (Criteria) this;
        }

        public Criteria andFangtanbegintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("fangtanbeginTime >=", value, "fangtanbegintime");
            return (Criteria) this;
        }

        public Criteria andFangtanbegintimeLessThan(Date value) {
            addCriterion("fangtanbeginTime <", value, "fangtanbegintime");
            return (Criteria) this;
        }

        public Criteria andFangtanbegintimeLessThanOrEqualTo(Date value) {
            addCriterion("fangtanbeginTime <=", value, "fangtanbegintime");
            return (Criteria) this;
        }

        public Criteria andFangtanbegintimeIn(List<Date> values) {
            addCriterion("fangtanbeginTime in", values, "fangtanbegintime");
            return (Criteria) this;
        }

        public Criteria andFangtanbegintimeNotIn(List<Date> values) {
            addCriterion("fangtanbeginTime not in", values, "fangtanbegintime");
            return (Criteria) this;
        }

        public Criteria andFangtanbegintimeBetween(Date value1, Date value2) {
            addCriterion("fangtanbeginTime between", value1, value2, "fangtanbegintime");
            return (Criteria) this;
        }

        public Criteria andFangtanbegintimeNotBetween(Date value1, Date value2) {
            addCriterion("fangtanbeginTime not between", value1, value2, "fangtanbegintime");
            return (Criteria) this;
        }

        public Criteria andFangtanendtimeIsNull() {
            addCriterion("fangtanendTime is null");
            return (Criteria) this;
        }

        public Criteria andFangtanendtimeIsNotNull() {
            addCriterion("fangtanendTime is not null");
            return (Criteria) this;
        }

        public Criteria andFangtanendtimeEqualTo(Date value) {
            addCriterion("fangtanendTime =", value, "fangtanendtime");
            return (Criteria) this;
        }

        public Criteria andFangtanendtimeNotEqualTo(Date value) {
            addCriterion("fangtanendTime <>", value, "fangtanendtime");
            return (Criteria) this;
        }

        public Criteria andFangtanendtimeGreaterThan(Date value) {
            addCriterion("fangtanendTime >", value, "fangtanendtime");
            return (Criteria) this;
        }

        public Criteria andFangtanendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("fangtanendTime >=", value, "fangtanendtime");
            return (Criteria) this;
        }

        public Criteria andFangtanendtimeLessThan(Date value) {
            addCriterion("fangtanendTime <", value, "fangtanendtime");
            return (Criteria) this;
        }

        public Criteria andFangtanendtimeLessThanOrEqualTo(Date value) {
            addCriterion("fangtanendTime <=", value, "fangtanendtime");
            return (Criteria) this;
        }

        public Criteria andFangtanendtimeIn(List<Date> values) {
            addCriterion("fangtanendTime in", values, "fangtanendtime");
            return (Criteria) this;
        }

        public Criteria andFangtanendtimeNotIn(List<Date> values) {
            addCriterion("fangtanendTime not in", values, "fangtanendtime");
            return (Criteria) this;
        }

        public Criteria andFangtanendtimeBetween(Date value1, Date value2) {
            addCriterion("fangtanendTime between", value1, value2, "fangtanendtime");
            return (Criteria) this;
        }

        public Criteria andFangtanendtimeNotBetween(Date value1, Date value2) {
            addCriterion("fangtanendTime not between", value1, value2, "fangtanendtime");
            return (Criteria) this;
        }

        public Criteria andFangtannameIsNull() {
            addCriterion("fangtanName is null");
            return (Criteria) this;
        }

        public Criteria andFangtannameIsNotNull() {
            addCriterion("fangtanName is not null");
            return (Criteria) this;
        }

        public Criteria andFangtannameEqualTo(String value) {
            addCriterion("fangtanName =", value, "fangtanname");
            return (Criteria) this;
        }

        public Criteria andFangtannameNotEqualTo(String value) {
            addCriterion("fangtanName <>", value, "fangtanname");
            return (Criteria) this;
        }

        public Criteria andFangtannameGreaterThan(String value) {
            addCriterion("fangtanName >", value, "fangtanname");
            return (Criteria) this;
        }

        public Criteria andFangtannameGreaterThanOrEqualTo(String value) {
            addCriterion("fangtanName >=", value, "fangtanname");
            return (Criteria) this;
        }

        public Criteria andFangtannameLessThan(String value) {
            addCriterion("fangtanName <", value, "fangtanname");
            return (Criteria) this;
        }

        public Criteria andFangtannameLessThanOrEqualTo(String value) {
            addCriterion("fangtanName <=", value, "fangtanname");
            return (Criteria) this;
        }

        public Criteria andFangtannameLike(String value) {
            addCriterion("fangtanName like", value, "fangtanname");
            return (Criteria) this;
        }

        public Criteria andFangtannameNotLike(String value) {
            addCriterion("fangtanName not like", value, "fangtanname");
            return (Criteria) this;
        }

        public Criteria andFangtannameIn(List<String> values) {
            addCriterion("fangtanName in", values, "fangtanname");
            return (Criteria) this;
        }

        public Criteria andFangtannameNotIn(List<String> values) {
            addCriterion("fangtanName not in", values, "fangtanname");
            return (Criteria) this;
        }

        public Criteria andFangtannameBetween(String value1, String value2) {
            addCriterion("fangtanName between", value1, value2, "fangtanname");
            return (Criteria) this;
        }

        public Criteria andFangtannameNotBetween(String value1, String value2) {
            addCriterion("fangtanName not between", value1, value2, "fangtanname");
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

        public Criteria andSiteidIsNull() {
            addCriterion("siteId is null");
            return (Criteria) this;
        }

        public Criteria andSiteidIsNotNull() {
            addCriterion("siteId is not null");
            return (Criteria) this;
        }

        public Criteria andSiteidEqualTo(String value) {
            addCriterion("siteId =", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotEqualTo(String value) {
            addCriterion("siteId <>", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidGreaterThan(String value) {
            addCriterion("siteId >", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidGreaterThanOrEqualTo(String value) {
            addCriterion("siteId >=", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidLessThan(String value) {
            addCriterion("siteId <", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidLessThanOrEqualTo(String value) {
            addCriterion("siteId <=", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidLike(String value) {
            addCriterion("siteId like", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotLike(String value) {
            addCriterion("siteId not like", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidIn(List<String> values) {
            addCriterion("siteId in", values, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotIn(List<String> values) {
            addCriterion("siteId not in", values, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidBetween(String value1, String value2) {
            addCriterion("siteId between", value1, value2, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotBetween(String value1, String value2) {
            addCriterion("siteId not between", value1, value2, "siteid");
            return (Criteria) this;
        }

        public Criteria andDiziidIsNull() {
            addCriterion("diziId is null");
            return (Criteria) this;
        }

        public Criteria andDiziidIsNotNull() {
            addCriterion("diziId is not null");
            return (Criteria) this;
        }

        public Criteria andDiziidEqualTo(String value) {
            addCriterion("diziId =", value, "diziid");
            return (Criteria) this;
        }

        public Criteria andDiziidNotEqualTo(String value) {
            addCriterion("diziId <>", value, "diziid");
            return (Criteria) this;
        }

        public Criteria andDiziidGreaterThan(String value) {
            addCriterion("diziId >", value, "diziid");
            return (Criteria) this;
        }

        public Criteria andDiziidGreaterThanOrEqualTo(String value) {
            addCriterion("diziId >=", value, "diziid");
            return (Criteria) this;
        }

        public Criteria andDiziidLessThan(String value) {
            addCriterion("diziId <", value, "diziid");
            return (Criteria) this;
        }

        public Criteria andDiziidLessThanOrEqualTo(String value) {
            addCriterion("diziId <=", value, "diziid");
            return (Criteria) this;
        }

        public Criteria andDiziidLike(String value) {
            addCriterion("diziId like", value, "diziid");
            return (Criteria) this;
        }

        public Criteria andDiziidNotLike(String value) {
            addCriterion("diziId not like", value, "diziid");
            return (Criteria) this;
        }

        public Criteria andDiziidIn(List<String> values) {
            addCriterion("diziId in", values, "diziid");
            return (Criteria) this;
        }

        public Criteria andDiziidNotIn(List<String> values) {
            addCriterion("diziId not in", values, "diziid");
            return (Criteria) this;
        }

        public Criteria andDiziidBetween(String value1, String value2) {
            addCriterion("diziId between", value1, value2, "diziid");
            return (Criteria) this;
        }

        public Criteria andDiziidNotBetween(String value1, String value2) {
            addCriterion("diziId not between", value1, value2, "diziid");
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

        public Criteria andJiabIsNull() {
            addCriterion("jiab is null");
            return (Criteria) this;
        }

        public Criteria andJiabIsNotNull() {
            addCriterion("jiab is not null");
            return (Criteria) this;
        }

        public Criteria andJiabEqualTo(String value) {
            addCriterion("jiab =", value, "jiab");
            return (Criteria) this;
        }

        public Criteria andJiabNotEqualTo(String value) {
            addCriterion("jiab <>", value, "jiab");
            return (Criteria) this;
        }

        public Criteria andJiabGreaterThan(String value) {
            addCriterion("jiab >", value, "jiab");
            return (Criteria) this;
        }

        public Criteria andJiabGreaterThanOrEqualTo(String value) {
            addCriterion("jiab >=", value, "jiab");
            return (Criteria) this;
        }

        public Criteria andJiabLessThan(String value) {
            addCriterion("jiab <", value, "jiab");
            return (Criteria) this;
        }

        public Criteria andJiabLessThanOrEqualTo(String value) {
            addCriterion("jiab <=", value, "jiab");
            return (Criteria) this;
        }

        public Criteria andJiabLike(String value) {
            addCriterion("jiab like", value, "jiab");
            return (Criteria) this;
        }

        public Criteria andJiabNotLike(String value) {
            addCriterion("jiab not like", value, "jiab");
            return (Criteria) this;
        }

        public Criteria andJiabIn(List<String> values) {
            addCriterion("jiab in", values, "jiab");
            return (Criteria) this;
        }

        public Criteria andJiabNotIn(List<String> values) {
            addCriterion("jiab not in", values, "jiab");
            return (Criteria) this;
        }

        public Criteria andJiabBetween(String value1, String value2) {
            addCriterion("jiab between", value1, value2, "jiab");
            return (Criteria) this;
        }

        public Criteria andJiabNotBetween(String value1, String value2) {
            addCriterion("jiab not between", value1, value2, "jiab");
            return (Criteria) this;
        }

        public Criteria andZcshowIsNull() {
            addCriterion("zcshow is null");
            return (Criteria) this;
        }

        public Criteria andZcshowIsNotNull() {
            addCriterion("zcshow is not null");
            return (Criteria) this;
        }

        public Criteria andZcshowEqualTo(String value) {
            addCriterion("zcshow =", value, "zcshow");
            return (Criteria) this;
        }

        public Criteria andZcshowNotEqualTo(String value) {
            addCriterion("zcshow <>", value, "zcshow");
            return (Criteria) this;
        }

        public Criteria andZcshowGreaterThan(String value) {
            addCriterion("zcshow >", value, "zcshow");
            return (Criteria) this;
        }

        public Criteria andZcshowGreaterThanOrEqualTo(String value) {
            addCriterion("zcshow >=", value, "zcshow");
            return (Criteria) this;
        }

        public Criteria andZcshowLessThan(String value) {
            addCriterion("zcshow <", value, "zcshow");
            return (Criteria) this;
        }

        public Criteria andZcshowLessThanOrEqualTo(String value) {
            addCriterion("zcshow <=", value, "zcshow");
            return (Criteria) this;
        }

        public Criteria andZcshowLike(String value) {
            addCriterion("zcshow like", value, "zcshow");
            return (Criteria) this;
        }

        public Criteria andZcshowNotLike(String value) {
            addCriterion("zcshow not like", value, "zcshow");
            return (Criteria) this;
        }

        public Criteria andZcshowIn(List<String> values) {
            addCriterion("zcshow in", values, "zcshow");
            return (Criteria) this;
        }

        public Criteria andZcshowNotIn(List<String> values) {
            addCriterion("zcshow not in", values, "zcshow");
            return (Criteria) this;
        }

        public Criteria andZcshowBetween(String value1, String value2) {
            addCriterion("zcshow between", value1, value2, "zcshow");
            return (Criteria) this;
        }

        public Criteria andZcshowNotBetween(String value1, String value2) {
            addCriterion("zcshow not between", value1, value2, "zcshow");
            return (Criteria) this;
        }

        public Criteria andFangtanbjIsNull() {
            addCriterion("fangtanBj is null");
            return (Criteria) this;
        }

        public Criteria andFangtanbjIsNotNull() {
            addCriterion("fangtanBj is not null");
            return (Criteria) this;
        }

        public Criteria andFangtanbjEqualTo(String value) {
            addCriterion("fangtanBj =", value, "fangtanbj");
            return (Criteria) this;
        }

        public Criteria andFangtanbjNotEqualTo(String value) {
            addCriterion("fangtanBj <>", value, "fangtanbj");
            return (Criteria) this;
        }

        public Criteria andFangtanbjGreaterThan(String value) {
            addCriterion("fangtanBj >", value, "fangtanbj");
            return (Criteria) this;
        }

        public Criteria andFangtanbjGreaterThanOrEqualTo(String value) {
            addCriterion("fangtanBj >=", value, "fangtanbj");
            return (Criteria) this;
        }

        public Criteria andFangtanbjLessThan(String value) {
            addCriterion("fangtanBj <", value, "fangtanbj");
            return (Criteria) this;
        }

        public Criteria andFangtanbjLessThanOrEqualTo(String value) {
            addCriterion("fangtanBj <=", value, "fangtanbj");
            return (Criteria) this;
        }

        public Criteria andFangtanbjLike(String value) {
            addCriterion("fangtanBj like", value, "fangtanbj");
            return (Criteria) this;
        }

        public Criteria andFangtanbjNotLike(String value) {
            addCriterion("fangtanBj not like", value, "fangtanbj");
            return (Criteria) this;
        }

        public Criteria andFangtanbjIn(List<String> values) {
            addCriterion("fangtanBj in", values, "fangtanbj");
            return (Criteria) this;
        }

        public Criteria andFangtanbjNotIn(List<String> values) {
            addCriterion("fangtanBj not in", values, "fangtanbj");
            return (Criteria) this;
        }

        public Criteria andFangtanbjBetween(String value1, String value2) {
            addCriterion("fangtanBj between", value1, value2, "fangtanbj");
            return (Criteria) this;
        }

        public Criteria andFangtanbjNotBetween(String value1, String value2) {
            addCriterion("fangtanBj not between", value1, value2, "fangtanbj");
            return (Criteria) this;
        }

        public Criteria andFangtanmsIsNull() {
            addCriterion("fangtanMs is null");
            return (Criteria) this;
        }

        public Criteria andFangtanmsIsNotNull() {
            addCriterion("fangtanMs is not null");
            return (Criteria) this;
        }

        public Criteria andFangtanmsEqualTo(String value) {
            addCriterion("fangtanMs =", value, "fangtanms");
            return (Criteria) this;
        }

        public Criteria andFangtanmsNotEqualTo(String value) {
            addCriterion("fangtanMs <>", value, "fangtanms");
            return (Criteria) this;
        }

        public Criteria andFangtanmsGreaterThan(String value) {
            addCriterion("fangtanMs >", value, "fangtanms");
            return (Criteria) this;
        }

        public Criteria andFangtanmsGreaterThanOrEqualTo(String value) {
            addCriterion("fangtanMs >=", value, "fangtanms");
            return (Criteria) this;
        }

        public Criteria andFangtanmsLessThan(String value) {
            addCriterion("fangtanMs <", value, "fangtanms");
            return (Criteria) this;
        }

        public Criteria andFangtanmsLessThanOrEqualTo(String value) {
            addCriterion("fangtanMs <=", value, "fangtanms");
            return (Criteria) this;
        }

        public Criteria andFangtanmsLike(String value) {
            addCriterion("fangtanMs like", value, "fangtanms");
            return (Criteria) this;
        }

        public Criteria andFangtanmsNotLike(String value) {
            addCriterion("fangtanMs not like", value, "fangtanms");
            return (Criteria) this;
        }

        public Criteria andFangtanmsIn(List<String> values) {
            addCriterion("fangtanMs in", values, "fangtanms");
            return (Criteria) this;
        }

        public Criteria andFangtanmsNotIn(List<String> values) {
            addCriterion("fangtanMs not in", values, "fangtanms");
            return (Criteria) this;
        }

        public Criteria andFangtanmsBetween(String value1, String value2) {
            addCriterion("fangtanMs between", value1, value2, "fangtanms");
            return (Criteria) this;
        }

        public Criteria andFangtanmsNotBetween(String value1, String value2) {
            addCriterion("fangtanMs not between", value1, value2, "fangtanms");
            return (Criteria) this;
        }

        public Criteria andGongkaisxIsNull() {
            addCriterion("gongkaiSx is null");
            return (Criteria) this;
        }

        public Criteria andGongkaisxIsNotNull() {
            addCriterion("gongkaiSx is not null");
            return (Criteria) this;
        }

        public Criteria andGongkaisxEqualTo(String value) {
            addCriterion("gongkaiSx =", value, "gongkaisx");
            return (Criteria) this;
        }

        public Criteria andGongkaisxNotEqualTo(String value) {
            addCriterion("gongkaiSx <>", value, "gongkaisx");
            return (Criteria) this;
        }

        public Criteria andGongkaisxGreaterThan(String value) {
            addCriterion("gongkaiSx >", value, "gongkaisx");
            return (Criteria) this;
        }

        public Criteria andGongkaisxGreaterThanOrEqualTo(String value) {
            addCriterion("gongkaiSx >=", value, "gongkaisx");
            return (Criteria) this;
        }

        public Criteria andGongkaisxLessThan(String value) {
            addCriterion("gongkaiSx <", value, "gongkaisx");
            return (Criteria) this;
        }

        public Criteria andGongkaisxLessThanOrEqualTo(String value) {
            addCriterion("gongkaiSx <=", value, "gongkaisx");
            return (Criteria) this;
        }

        public Criteria andGongkaisxLike(String value) {
            addCriterion("gongkaiSx like", value, "gongkaisx");
            return (Criteria) this;
        }

        public Criteria andGongkaisxNotLike(String value) {
            addCriterion("gongkaiSx not like", value, "gongkaisx");
            return (Criteria) this;
        }

        public Criteria andGongkaisxIn(List<String> values) {
            addCriterion("gongkaiSx in", values, "gongkaisx");
            return (Criteria) this;
        }

        public Criteria andGongkaisxNotIn(List<String> values) {
            addCriterion("gongkaiSx not in", values, "gongkaisx");
            return (Criteria) this;
        }

        public Criteria andGongkaisxBetween(String value1, String value2) {
            addCriterion("gongkaiSx between", value1, value2, "gongkaisx");
            return (Criteria) this;
        }

        public Criteria andGongkaisxNotBetween(String value1, String value2) {
            addCriterion("gongkaiSx not between", value1, value2, "gongkaisx");
            return (Criteria) this;
        }

        public Criteria andGongkaifwIsNull() {
            addCriterion("gongkaiFw is null");
            return (Criteria) this;
        }

        public Criteria andGongkaifwIsNotNull() {
            addCriterion("gongkaiFw is not null");
            return (Criteria) this;
        }

        public Criteria andGongkaifwEqualTo(String value) {
            addCriterion("gongkaiFw =", value, "gongkaifw");
            return (Criteria) this;
        }

        public Criteria andGongkaifwNotEqualTo(String value) {
            addCriterion("gongkaiFw <>", value, "gongkaifw");
            return (Criteria) this;
        }

        public Criteria andGongkaifwGreaterThan(String value) {
            addCriterion("gongkaiFw >", value, "gongkaifw");
            return (Criteria) this;
        }

        public Criteria andGongkaifwGreaterThanOrEqualTo(String value) {
            addCriterion("gongkaiFw >=", value, "gongkaifw");
            return (Criteria) this;
        }

        public Criteria andGongkaifwLessThan(String value) {
            addCriterion("gongkaiFw <", value, "gongkaifw");
            return (Criteria) this;
        }

        public Criteria andGongkaifwLessThanOrEqualTo(String value) {
            addCriterion("gongkaiFw <=", value, "gongkaifw");
            return (Criteria) this;
        }

        public Criteria andGongkaifwLike(String value) {
            addCriterion("gongkaiFw like", value, "gongkaifw");
            return (Criteria) this;
        }

        public Criteria andGongkaifwNotLike(String value) {
            addCriterion("gongkaiFw not like", value, "gongkaifw");
            return (Criteria) this;
        }

        public Criteria andGongkaifwIn(List<String> values) {
            addCriterion("gongkaiFw in", values, "gongkaifw");
            return (Criteria) this;
        }

        public Criteria andGongkaifwNotIn(List<String> values) {
            addCriterion("gongkaiFw not in", values, "gongkaifw");
            return (Criteria) this;
        }

        public Criteria andGongkaifwBetween(String value1, String value2) {
            addCriterion("gongkaiFw between", value1, value2, "gongkaifw");
            return (Criteria) this;
        }

        public Criteria andGongkaifwNotBetween(String value1, String value2) {
            addCriterion("gongkaiFw not between", value1, value2, "gongkaifw");
            return (Criteria) this;
        }

        public Criteria andGongkaicxIsNull() {
            addCriterion("gongkaiCx is null");
            return (Criteria) this;
        }

        public Criteria andGongkaicxIsNotNull() {
            addCriterion("gongkaiCx is not null");
            return (Criteria) this;
        }

        public Criteria andGongkaicxEqualTo(String value) {
            addCriterion("gongkaiCx =", value, "gongkaicx");
            return (Criteria) this;
        }

        public Criteria andGongkaicxNotEqualTo(String value) {
            addCriterion("gongkaiCx <>", value, "gongkaicx");
            return (Criteria) this;
        }

        public Criteria andGongkaicxGreaterThan(String value) {
            addCriterion("gongkaiCx >", value, "gongkaicx");
            return (Criteria) this;
        }

        public Criteria andGongkaicxGreaterThanOrEqualTo(String value) {
            addCriterion("gongkaiCx >=", value, "gongkaicx");
            return (Criteria) this;
        }

        public Criteria andGongkaicxLessThan(String value) {
            addCriterion("gongkaiCx <", value, "gongkaicx");
            return (Criteria) this;
        }

        public Criteria andGongkaicxLessThanOrEqualTo(String value) {
            addCriterion("gongkaiCx <=", value, "gongkaicx");
            return (Criteria) this;
        }

        public Criteria andGongkaicxLike(String value) {
            addCriterion("gongkaiCx like", value, "gongkaicx");
            return (Criteria) this;
        }

        public Criteria andGongkaicxNotLike(String value) {
            addCriterion("gongkaiCx not like", value, "gongkaicx");
            return (Criteria) this;
        }

        public Criteria andGongkaicxIn(List<String> values) {
            addCriterion("gongkaiCx in", values, "gongkaicx");
            return (Criteria) this;
        }

        public Criteria andGongkaicxNotIn(List<String> values) {
            addCriterion("gongkaiCx not in", values, "gongkaicx");
            return (Criteria) this;
        }

        public Criteria andGongkaicxBetween(String value1, String value2) {
            addCriterion("gongkaiCx between", value1, value2, "gongkaicx");
            return (Criteria) this;
        }

        public Criteria andGongkaicxNotBetween(String value1, String value2) {
            addCriterion("gongkaiCx not between", value1, value2, "gongkaicx");
            return (Criteria) this;
        }

        public Criteria andZherenbmIsNull() {
            addCriterion("zherenBm is null");
            return (Criteria) this;
        }

        public Criteria andZherenbmIsNotNull() {
            addCriterion("zherenBm is not null");
            return (Criteria) this;
        }

        public Criteria andZherenbmEqualTo(String value) {
            addCriterion("zherenBm =", value, "zherenbm");
            return (Criteria) this;
        }

        public Criteria andZherenbmNotEqualTo(String value) {
            addCriterion("zherenBm <>", value, "zherenbm");
            return (Criteria) this;
        }

        public Criteria andZherenbmGreaterThan(String value) {
            addCriterion("zherenBm >", value, "zherenbm");
            return (Criteria) this;
        }

        public Criteria andZherenbmGreaterThanOrEqualTo(String value) {
            addCriterion("zherenBm >=", value, "zherenbm");
            return (Criteria) this;
        }

        public Criteria andZherenbmLessThan(String value) {
            addCriterion("zherenBm <", value, "zherenbm");
            return (Criteria) this;
        }

        public Criteria andZherenbmLessThanOrEqualTo(String value) {
            addCriterion("zherenBm <=", value, "zherenbm");
            return (Criteria) this;
        }

        public Criteria andZherenbmLike(String value) {
            addCriterion("zherenBm like", value, "zherenbm");
            return (Criteria) this;
        }

        public Criteria andZherenbmNotLike(String value) {
            addCriterion("zherenBm not like", value, "zherenbm");
            return (Criteria) this;
        }

        public Criteria andZherenbmIn(List<String> values) {
            addCriterion("zherenBm in", values, "zherenbm");
            return (Criteria) this;
        }

        public Criteria andZherenbmNotIn(List<String> values) {
            addCriterion("zherenBm not in", values, "zherenbm");
            return (Criteria) this;
        }

        public Criteria andZherenbmBetween(String value1, String value2) {
            addCriterion("zherenBm between", value1, value2, "zherenbm");
            return (Criteria) this;
        }

        public Criteria andZherenbmNotBetween(String value1, String value2) {
            addCriterion("zherenBm not between", value1, value2, "zherenbm");
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