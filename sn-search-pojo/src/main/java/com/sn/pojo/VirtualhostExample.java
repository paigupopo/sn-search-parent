package com.sn.pojo;

import java.util.ArrayList;
import java.util.List;

public class VirtualhostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VirtualhostExample() {
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

        public Criteria andVirtualhostidIsNull() {
            addCriterion("virtualHostId is null");
            return (Criteria) this;
        }

        public Criteria andVirtualhostidIsNotNull() {
            addCriterion("virtualHostId is not null");
            return (Criteria) this;
        }

        public Criteria andVirtualhostidEqualTo(Long value) {
            addCriterion("virtualHostId =", value, "virtualhostid");
            return (Criteria) this;
        }

        public Criteria andVirtualhostidNotEqualTo(Long value) {
            addCriterion("virtualHostId <>", value, "virtualhostid");
            return (Criteria) this;
        }

        public Criteria andVirtualhostidGreaterThan(Long value) {
            addCriterion("virtualHostId >", value, "virtualhostid");
            return (Criteria) this;
        }

        public Criteria andVirtualhostidGreaterThanOrEqualTo(Long value) {
            addCriterion("virtualHostId >=", value, "virtualhostid");
            return (Criteria) this;
        }

        public Criteria andVirtualhostidLessThan(Long value) {
            addCriterion("virtualHostId <", value, "virtualhostid");
            return (Criteria) this;
        }

        public Criteria andVirtualhostidLessThanOrEqualTo(Long value) {
            addCriterion("virtualHostId <=", value, "virtualhostid");
            return (Criteria) this;
        }

        public Criteria andVirtualhostidIn(List<Long> values) {
            addCriterion("virtualHostId in", values, "virtualhostid");
            return (Criteria) this;
        }

        public Criteria andVirtualhostidNotIn(List<Long> values) {
            addCriterion("virtualHostId not in", values, "virtualhostid");
            return (Criteria) this;
        }

        public Criteria andVirtualhostidBetween(Long value1, Long value2) {
            addCriterion("virtualHostId between", value1, value2, "virtualhostid");
            return (Criteria) this;
        }

        public Criteria andVirtualhostidNotBetween(Long value1, Long value2) {
            addCriterion("virtualHostId not between", value1, value2, "virtualhostid");
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

        public Criteria andLayoutsetidIsNull() {
            addCriterion("layoutSetId is null");
            return (Criteria) this;
        }

        public Criteria andLayoutsetidIsNotNull() {
            addCriterion("layoutSetId is not null");
            return (Criteria) this;
        }

        public Criteria andLayoutsetidEqualTo(Long value) {
            addCriterion("layoutSetId =", value, "layoutsetid");
            return (Criteria) this;
        }

        public Criteria andLayoutsetidNotEqualTo(Long value) {
            addCriterion("layoutSetId <>", value, "layoutsetid");
            return (Criteria) this;
        }

        public Criteria andLayoutsetidGreaterThan(Long value) {
            addCriterion("layoutSetId >", value, "layoutsetid");
            return (Criteria) this;
        }

        public Criteria andLayoutsetidGreaterThanOrEqualTo(Long value) {
            addCriterion("layoutSetId >=", value, "layoutsetid");
            return (Criteria) this;
        }

        public Criteria andLayoutsetidLessThan(Long value) {
            addCriterion("layoutSetId <", value, "layoutsetid");
            return (Criteria) this;
        }

        public Criteria andLayoutsetidLessThanOrEqualTo(Long value) {
            addCriterion("layoutSetId <=", value, "layoutsetid");
            return (Criteria) this;
        }

        public Criteria andLayoutsetidIn(List<Long> values) {
            addCriterion("layoutSetId in", values, "layoutsetid");
            return (Criteria) this;
        }

        public Criteria andLayoutsetidNotIn(List<Long> values) {
            addCriterion("layoutSetId not in", values, "layoutsetid");
            return (Criteria) this;
        }

        public Criteria andLayoutsetidBetween(Long value1, Long value2) {
            addCriterion("layoutSetId between", value1, value2, "layoutsetid");
            return (Criteria) this;
        }

        public Criteria andLayoutsetidNotBetween(Long value1, Long value2) {
            addCriterion("layoutSetId not between", value1, value2, "layoutsetid");
            return (Criteria) this;
        }

        public Criteria andHostnameIsNull() {
            addCriterion("hostname is null");
            return (Criteria) this;
        }

        public Criteria andHostnameIsNotNull() {
            addCriterion("hostname is not null");
            return (Criteria) this;
        }

        public Criteria andHostnameEqualTo(String value) {
            addCriterion("hostname =", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotEqualTo(String value) {
            addCriterion("hostname <>", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameGreaterThan(String value) {
            addCriterion("hostname >", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameGreaterThanOrEqualTo(String value) {
            addCriterion("hostname >=", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLessThan(String value) {
            addCriterion("hostname <", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLessThanOrEqualTo(String value) {
            addCriterion("hostname <=", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLike(String value) {
            addCriterion("hostname like", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotLike(String value) {
            addCriterion("hostname not like", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameIn(List<String> values) {
            addCriterion("hostname in", values, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotIn(List<String> values) {
            addCriterion("hostname not in", values, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameBetween(String value1, String value2) {
            addCriterion("hostname between", value1, value2, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotBetween(String value1, String value2) {
            addCriterion("hostname not between", value1, value2, "hostname");
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