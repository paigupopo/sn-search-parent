package com.sn.pojo;

import java.util.ArrayList;
import java.util.List;

public class CmsGovernmenthotsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmsGovernmenthotsExample() {
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

        public Criteria andGovhotidIsNull() {
            addCriterion("govHotId is null");
            return (Criteria) this;
        }

        public Criteria andGovhotidIsNotNull() {
            addCriterion("govHotId is not null");
            return (Criteria) this;
        }

        public Criteria andGovhotidEqualTo(Long value) {
            addCriterion("govHotId =", value, "govhotid");
            return (Criteria) this;
        }

        public Criteria andGovhotidNotEqualTo(Long value) {
            addCriterion("govHotId <>", value, "govhotid");
            return (Criteria) this;
        }

        public Criteria andGovhotidGreaterThan(Long value) {
            addCriterion("govHotId >", value, "govhotid");
            return (Criteria) this;
        }

        public Criteria andGovhotidGreaterThanOrEqualTo(Long value) {
            addCriterion("govHotId >=", value, "govhotid");
            return (Criteria) this;
        }

        public Criteria andGovhotidLessThan(Long value) {
            addCriterion("govHotId <", value, "govhotid");
            return (Criteria) this;
        }

        public Criteria andGovhotidLessThanOrEqualTo(Long value) {
            addCriterion("govHotId <=", value, "govhotid");
            return (Criteria) this;
        }

        public Criteria andGovhotidIn(List<Long> values) {
            addCriterion("govHotId in", values, "govhotid");
            return (Criteria) this;
        }

        public Criteria andGovhotidNotIn(List<Long> values) {
            addCriterion("govHotId not in", values, "govhotid");
            return (Criteria) this;
        }

        public Criteria andGovhotidBetween(Long value1, Long value2) {
            addCriterion("govHotId between", value1, value2, "govhotid");
            return (Criteria) this;
        }

        public Criteria andGovhotidNotBetween(Long value1, Long value2) {
            addCriterion("govHotId not between", value1, value2, "govhotid");
            return (Criteria) this;
        }

        public Criteria andGovhotnameIsNull() {
            addCriterion("govHotName is null");
            return (Criteria) this;
        }

        public Criteria andGovhotnameIsNotNull() {
            addCriterion("govHotName is not null");
            return (Criteria) this;
        }

        public Criteria andGovhotnameEqualTo(String value) {
            addCriterion("govHotName =", value, "govhotname");
            return (Criteria) this;
        }

        public Criteria andGovhotnameNotEqualTo(String value) {
            addCriterion("govHotName <>", value, "govhotname");
            return (Criteria) this;
        }

        public Criteria andGovhotnameGreaterThan(String value) {
            addCriterion("govHotName >", value, "govhotname");
            return (Criteria) this;
        }

        public Criteria andGovhotnameGreaterThanOrEqualTo(String value) {
            addCriterion("govHotName >=", value, "govhotname");
            return (Criteria) this;
        }

        public Criteria andGovhotnameLessThan(String value) {
            addCriterion("govHotName <", value, "govhotname");
            return (Criteria) this;
        }

        public Criteria andGovhotnameLessThanOrEqualTo(String value) {
            addCriterion("govHotName <=", value, "govhotname");
            return (Criteria) this;
        }

        public Criteria andGovhotnameLike(String value) {
            addCriterion("govHotName like", value, "govhotname");
            return (Criteria) this;
        }

        public Criteria andGovhotnameNotLike(String value) {
            addCriterion("govHotName not like", value, "govhotname");
            return (Criteria) this;
        }

        public Criteria andGovhotnameIn(List<String> values) {
            addCriterion("govHotName in", values, "govhotname");
            return (Criteria) this;
        }

        public Criteria andGovhotnameNotIn(List<String> values) {
            addCriterion("govHotName not in", values, "govhotname");
            return (Criteria) this;
        }

        public Criteria andGovhotnameBetween(String value1, String value2) {
            addCriterion("govHotName between", value1, value2, "govhotname");
            return (Criteria) this;
        }

        public Criteria andGovhotnameNotBetween(String value1, String value2) {
            addCriterion("govHotName not between", value1, value2, "govhotname");
            return (Criteria) this;
        }

        public Criteria andGovcustomIsNull() {
            addCriterion("govCustom is null");
            return (Criteria) this;
        }

        public Criteria andGovcustomIsNotNull() {
            addCriterion("govCustom is not null");
            return (Criteria) this;
        }

        public Criteria andGovcustomEqualTo(Integer value) {
            addCriterion("govCustom =", value, "govcustom");
            return (Criteria) this;
        }

        public Criteria andGovcustomNotEqualTo(Integer value) {
            addCriterion("govCustom <>", value, "govcustom");
            return (Criteria) this;
        }

        public Criteria andGovcustomGreaterThan(Integer value) {
            addCriterion("govCustom >", value, "govcustom");
            return (Criteria) this;
        }

        public Criteria andGovcustomGreaterThanOrEqualTo(Integer value) {
            addCriterion("govCustom >=", value, "govcustom");
            return (Criteria) this;
        }

        public Criteria andGovcustomLessThan(Integer value) {
            addCriterion("govCustom <", value, "govcustom");
            return (Criteria) this;
        }

        public Criteria andGovcustomLessThanOrEqualTo(Integer value) {
            addCriterion("govCustom <=", value, "govcustom");
            return (Criteria) this;
        }

        public Criteria andGovcustomIn(List<Integer> values) {
            addCriterion("govCustom in", values, "govcustom");
            return (Criteria) this;
        }

        public Criteria andGovcustomNotIn(List<Integer> values) {
            addCriterion("govCustom not in", values, "govcustom");
            return (Criteria) this;
        }

        public Criteria andGovcustomBetween(Integer value1, Integer value2) {
            addCriterion("govCustom between", value1, value2, "govcustom");
            return (Criteria) this;
        }

        public Criteria andGovcustomNotBetween(Integer value1, Integer value2) {
            addCriterion("govCustom not between", value1, value2, "govcustom");
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