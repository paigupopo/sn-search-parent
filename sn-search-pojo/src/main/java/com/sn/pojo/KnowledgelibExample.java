package com.sn.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class KnowledgelibExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KnowledgelibExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andQaklRevisionIsNull() {
            addCriterion("qakl_Revision is null");
            return (Criteria) this;
        }

        public Criteria andQaklRevisionIsNotNull() {
            addCriterion("qakl_Revision is not null");
            return (Criteria) this;
        }

        public Criteria andQaklRevisionEqualTo(Integer value) {
            addCriterion("qakl_Revision =", value, "qaklRevision");
            return (Criteria) this;
        }

        public Criteria andQaklRevisionNotEqualTo(Integer value) {
            addCriterion("qakl_Revision <>", value, "qaklRevision");
            return (Criteria) this;
        }

        public Criteria andQaklRevisionGreaterThan(Integer value) {
            addCriterion("qakl_Revision >", value, "qaklRevision");
            return (Criteria) this;
        }

        public Criteria andQaklRevisionGreaterThanOrEqualTo(Integer value) {
            addCriterion("qakl_Revision >=", value, "qaklRevision");
            return (Criteria) this;
        }

        public Criteria andQaklRevisionLessThan(Integer value) {
            addCriterion("qakl_Revision <", value, "qaklRevision");
            return (Criteria) this;
        }

        public Criteria andQaklRevisionLessThanOrEqualTo(Integer value) {
            addCriterion("qakl_Revision <=", value, "qaklRevision");
            return (Criteria) this;
        }

        public Criteria andQaklRevisionIn(List<Integer> values) {
            addCriterion("qakl_Revision in", values, "qaklRevision");
            return (Criteria) this;
        }

        public Criteria andQaklRevisionNotIn(List<Integer> values) {
            addCriterion("qakl_Revision not in", values, "qaklRevision");
            return (Criteria) this;
        }

        public Criteria andQaklRevisionBetween(Integer value1, Integer value2) {
            addCriterion("qakl_Revision between", value1, value2, "qaklRevision");
            return (Criteria) this;
        }

        public Criteria andQaklRevisionNotBetween(Integer value1, Integer value2) {
            addCriterion("qakl_Revision not between", value1, value2, "qaklRevision");
            return (Criteria) this;
        }

        public Criteria andQaklRecordcreatetimeIsNull() {
            addCriterion("qakl_Recordcreatetime is null");
            return (Criteria) this;
        }

        public Criteria andQaklRecordcreatetimeIsNotNull() {
            addCriterion("qakl_Recordcreatetime is not null");
            return (Criteria) this;
        }

        public Criteria andQaklRecordcreatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("qakl_Recordcreatetime =", value, "qaklRecordcreatetime");
            return (Criteria) this;
        }

        public Criteria andQaklRecordcreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("qakl_Recordcreatetime <>", value, "qaklRecordcreatetime");
            return (Criteria) this;
        }

        public Criteria andQaklRecordcreatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("qakl_Recordcreatetime >", value, "qaklRecordcreatetime");
            return (Criteria) this;
        }

        public Criteria andQaklRecordcreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("qakl_Recordcreatetime >=", value, "qaklRecordcreatetime");
            return (Criteria) this;
        }

        public Criteria andQaklRecordcreatetimeLessThan(Date value) {
            addCriterionForJDBCDate("qakl_Recordcreatetime <", value, "qaklRecordcreatetime");
            return (Criteria) this;
        }

        public Criteria andQaklRecordcreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("qakl_Recordcreatetime <=", value, "qaklRecordcreatetime");
            return (Criteria) this;
        }

        public Criteria andQaklRecordcreatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("qakl_Recordcreatetime in", values, "qaklRecordcreatetime");
            return (Criteria) this;
        }

        public Criteria andQaklRecordcreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("qakl_Recordcreatetime not in", values, "qaklRecordcreatetime");
            return (Criteria) this;
        }

        public Criteria andQaklRecordcreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("qakl_Recordcreatetime between", value1, value2, "qaklRecordcreatetime");
            return (Criteria) this;
        }

        public Criteria andQaklRecordcreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("qakl_Recordcreatetime not between", value1, value2, "qaklRecordcreatetime");
            return (Criteria) this;
        }

        public Criteria andQaklTitleIsNull() {
            addCriterion("qakl_Title is null");
            return (Criteria) this;
        }

        public Criteria andQaklTitleIsNotNull() {
            addCriterion("qakl_Title is not null");
            return (Criteria) this;
        }

        public Criteria andQaklTitleEqualTo(String value) {
            addCriterion("qakl_Title =", value, "qaklTitle");
            return (Criteria) this;
        }

        public Criteria andQaklTitleNotEqualTo(String value) {
            addCriterion("qakl_Title <>", value, "qaklTitle");
            return (Criteria) this;
        }

        public Criteria andQaklTitleGreaterThan(String value) {
            addCriterion("qakl_Title >", value, "qaklTitle");
            return (Criteria) this;
        }

        public Criteria andQaklTitleGreaterThanOrEqualTo(String value) {
            addCriterion("qakl_Title >=", value, "qaklTitle");
            return (Criteria) this;
        }

        public Criteria andQaklTitleLessThan(String value) {
            addCriterion("qakl_Title <", value, "qaklTitle");
            return (Criteria) this;
        }

        public Criteria andQaklTitleLessThanOrEqualTo(String value) {
            addCriterion("qakl_Title <=", value, "qaklTitle");
            return (Criteria) this;
        }

        public Criteria andQaklTitleLike(String value) {
            addCriterion("qakl_Title like", value, "qaklTitle");
            return (Criteria) this;
        }

        public Criteria andQaklTitleNotLike(String value) {
            addCriterion("qakl_Title not like", value, "qaklTitle");
            return (Criteria) this;
        }

        public Criteria andQaklTitleIn(List<String> values) {
            addCriterion("qakl_Title in", values, "qaklTitle");
            return (Criteria) this;
        }

        public Criteria andQaklTitleNotIn(List<String> values) {
            addCriterion("qakl_Title not in", values, "qaklTitle");
            return (Criteria) this;
        }

        public Criteria andQaklTitleBetween(String value1, String value2) {
            addCriterion("qakl_Title between", value1, value2, "qaklTitle");
            return (Criteria) this;
        }

        public Criteria andQaklTitleNotBetween(String value1, String value2) {
            addCriterion("qakl_Title not between", value1, value2, "qaklTitle");
            return (Criteria) this;
        }

        public Criteria andQaklContentIsNull() {
            addCriterion("qakl_Content is null");
            return (Criteria) this;
        }

        public Criteria andQaklContentIsNotNull() {
            addCriterion("qakl_Content is not null");
            return (Criteria) this;
        }

        public Criteria andQaklContentEqualTo(String value) {
            addCriterion("qakl_Content =", value, "qaklContent");
            return (Criteria) this;
        }

        public Criteria andQaklContentNotEqualTo(String value) {
            addCriterion("qakl_Content <>", value, "qaklContent");
            return (Criteria) this;
        }

        public Criteria andQaklContentGreaterThan(String value) {
            addCriterion("qakl_Content >", value, "qaklContent");
            return (Criteria) this;
        }

        public Criteria andQaklContentGreaterThanOrEqualTo(String value) {
            addCriterion("qakl_Content >=", value, "qaklContent");
            return (Criteria) this;
        }

        public Criteria andQaklContentLessThan(String value) {
            addCriterion("qakl_Content <", value, "qaklContent");
            return (Criteria) this;
        }

        public Criteria andQaklContentLessThanOrEqualTo(String value) {
            addCriterion("qakl_Content <=", value, "qaklContent");
            return (Criteria) this;
        }

        public Criteria andQaklContentLike(String value) {
            addCriterion("qakl_Content like", value, "qaklContent");
            return (Criteria) this;
        }

        public Criteria andQaklContentNotLike(String value) {
            addCriterion("qakl_Content not like", value, "qaklContent");
            return (Criteria) this;
        }

        public Criteria andQaklContentIn(List<String> values) {
            addCriterion("qakl_Content in", values, "qaklContent");
            return (Criteria) this;
        }

        public Criteria andQaklContentNotIn(List<String> values) {
            addCriterion("qakl_Content not in", values, "qaklContent");
            return (Criteria) this;
        }

        public Criteria andQaklContentBetween(String value1, String value2) {
            addCriterion("qakl_Content between", value1, value2, "qaklContent");
            return (Criteria) this;
        }

        public Criteria andQaklContentNotBetween(String value1, String value2) {
            addCriterion("qakl_Content not between", value1, value2, "qaklContent");
            return (Criteria) this;
        }

        public Criteria andQaklVisitcountIsNull() {
            addCriterion("qakl_Visitcount is null");
            return (Criteria) this;
        }

        public Criteria andQaklVisitcountIsNotNull() {
            addCriterion("qakl_Visitcount is not null");
            return (Criteria) this;
        }

        public Criteria andQaklVisitcountEqualTo(Integer value) {
            addCriterion("qakl_Visitcount =", value, "qaklVisitcount");
            return (Criteria) this;
        }

        public Criteria andQaklVisitcountNotEqualTo(Integer value) {
            addCriterion("qakl_Visitcount <>", value, "qaklVisitcount");
            return (Criteria) this;
        }

        public Criteria andQaklVisitcountGreaterThan(Integer value) {
            addCriterion("qakl_Visitcount >", value, "qaklVisitcount");
            return (Criteria) this;
        }

        public Criteria andQaklVisitcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("qakl_Visitcount >=", value, "qaklVisitcount");
            return (Criteria) this;
        }

        public Criteria andQaklVisitcountLessThan(Integer value) {
            addCriterion("qakl_Visitcount <", value, "qaklVisitcount");
            return (Criteria) this;
        }

        public Criteria andQaklVisitcountLessThanOrEqualTo(Integer value) {
            addCriterion("qakl_Visitcount <=", value, "qaklVisitcount");
            return (Criteria) this;
        }

        public Criteria andQaklVisitcountIn(List<Integer> values) {
            addCriterion("qakl_Visitcount in", values, "qaklVisitcount");
            return (Criteria) this;
        }

        public Criteria andQaklVisitcountNotIn(List<Integer> values) {
            addCriterion("qakl_Visitcount not in", values, "qaklVisitcount");
            return (Criteria) this;
        }

        public Criteria andQaklVisitcountBetween(Integer value1, Integer value2) {
            addCriterion("qakl_Visitcount between", value1, value2, "qaklVisitcount");
            return (Criteria) this;
        }

        public Criteria andQaklVisitcountNotBetween(Integer value1, Integer value2) {
            addCriterion("qakl_Visitcount not between", value1, value2, "qaklVisitcount");
            return (Criteria) this;
        }

        public Criteria andQaklStateIsNull() {
            addCriterion("qakl_State is null");
            return (Criteria) this;
        }

        public Criteria andQaklStateIsNotNull() {
            addCriterion("qakl_State is not null");
            return (Criteria) this;
        }

        public Criteria andQaklStateEqualTo(Integer value) {
            addCriterion("qakl_State =", value, "qaklState");
            return (Criteria) this;
        }

        public Criteria andQaklStateNotEqualTo(Integer value) {
            addCriterion("qakl_State <>", value, "qaklState");
            return (Criteria) this;
        }

        public Criteria andQaklStateGreaterThan(Integer value) {
            addCriterion("qakl_State >", value, "qaklState");
            return (Criteria) this;
        }

        public Criteria andQaklStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("qakl_State >=", value, "qaklState");
            return (Criteria) this;
        }

        public Criteria andQaklStateLessThan(Integer value) {
            addCriterion("qakl_State <", value, "qaklState");
            return (Criteria) this;
        }

        public Criteria andQaklStateLessThanOrEqualTo(Integer value) {
            addCriterion("qakl_State <=", value, "qaklState");
            return (Criteria) this;
        }

        public Criteria andQaklStateIn(List<Integer> values) {
            addCriterion("qakl_State in", values, "qaklState");
            return (Criteria) this;
        }

        public Criteria andQaklStateNotIn(List<Integer> values) {
            addCriterion("qakl_State not in", values, "qaklState");
            return (Criteria) this;
        }

        public Criteria andQaklStateBetween(Integer value1, Integer value2) {
            addCriterion("qakl_State between", value1, value2, "qaklState");
            return (Criteria) this;
        }

        public Criteria andQaklStateNotBetween(Integer value1, Integer value2) {
            addCriterion("qakl_State not between", value1, value2, "qaklState");
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