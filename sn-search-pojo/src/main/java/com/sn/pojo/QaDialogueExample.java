package com.sn.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QaDialogueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QaDialogueExample() {
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

        public Criteria andQadIdIsNull() {
            addCriterion("qad_Id is null");
            return (Criteria) this;
        }

        public Criteria andQadIdIsNotNull() {
            addCriterion("qad_Id is not null");
            return (Criteria) this;
        }

        public Criteria andQadIdEqualTo(Integer value) {
            addCriterion("qad_Id =", value, "qadId");
            return (Criteria) this;
        }

        public Criteria andQadIdNotEqualTo(Integer value) {
            addCriterion("qad_Id <>", value, "qadId");
            return (Criteria) this;
        }

        public Criteria andQadIdGreaterThan(Integer value) {
            addCriterion("qad_Id >", value, "qadId");
            return (Criteria) this;
        }

        public Criteria andQadIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("qad_Id >=", value, "qadId");
            return (Criteria) this;
        }

        public Criteria andQadIdLessThan(Integer value) {
            addCriterion("qad_Id <", value, "qadId");
            return (Criteria) this;
        }

        public Criteria andQadIdLessThanOrEqualTo(Integer value) {
            addCriterion("qad_Id <=", value, "qadId");
            return (Criteria) this;
        }

        public Criteria andQadIdIn(List<Integer> values) {
            addCriterion("qad_Id in", values, "qadId");
            return (Criteria) this;
        }

        public Criteria andQadIdNotIn(List<Integer> values) {
            addCriterion("qad_Id not in", values, "qadId");
            return (Criteria) this;
        }

        public Criteria andQadIdBetween(Integer value1, Integer value2) {
            addCriterion("qad_Id between", value1, value2, "qadId");
            return (Criteria) this;
        }

        public Criteria andQadIdNotBetween(Integer value1, Integer value2) {
            addCriterion("qad_Id not between", value1, value2, "qadId");
            return (Criteria) this;
        }

        public Criteria andQadTitleIsNull() {
            addCriterion("qad_Title is null");
            return (Criteria) this;
        }

        public Criteria andQadTitleIsNotNull() {
            addCriterion("qad_Title is not null");
            return (Criteria) this;
        }

        public Criteria andQadTitleEqualTo(String value) {
            addCriterion("qad_Title =", value, "qadTitle");
            return (Criteria) this;
        }

        public Criteria andQadTitleNotEqualTo(String value) {
            addCriterion("qad_Title <>", value, "qadTitle");
            return (Criteria) this;
        }

        public Criteria andQadTitleGreaterThan(String value) {
            addCriterion("qad_Title >", value, "qadTitle");
            return (Criteria) this;
        }

        public Criteria andQadTitleGreaterThanOrEqualTo(String value) {
            addCriterion("qad_Title >=", value, "qadTitle");
            return (Criteria) this;
        }

        public Criteria andQadTitleLessThan(String value) {
            addCriterion("qad_Title <", value, "qadTitle");
            return (Criteria) this;
        }

        public Criteria andQadTitleLessThanOrEqualTo(String value) {
            addCriterion("qad_Title <=", value, "qadTitle");
            return (Criteria) this;
        }

        public Criteria andQadTitleLike(String value) {
            addCriterion("qad_Title like", value, "qadTitle");
            return (Criteria) this;
        }

        public Criteria andQadTitleNotLike(String value) {
            addCriterion("qad_Title not like", value, "qadTitle");
            return (Criteria) this;
        }

        public Criteria andQadTitleIn(List<String> values) {
            addCriterion("qad_Title in", values, "qadTitle");
            return (Criteria) this;
        }

        public Criteria andQadTitleNotIn(List<String> values) {
            addCriterion("qad_Title not in", values, "qadTitle");
            return (Criteria) this;
        }

        public Criteria andQadTitleBetween(String value1, String value2) {
            addCriterion("qad_Title between", value1, value2, "qadTitle");
            return (Criteria) this;
        }

        public Criteria andQadTitleNotBetween(String value1, String value2) {
            addCriterion("qad_Title not between", value1, value2, "qadTitle");
            return (Criteria) this;
        }

        public Criteria andQadCreatetimeIsNull() {
            addCriterion("qad_Createtime is null");
            return (Criteria) this;
        }

        public Criteria andQadCreatetimeIsNotNull() {
            addCriterion("qad_Createtime is not null");
            return (Criteria) this;
        }

        public Criteria andQadCreatetimeEqualTo(Date value) {
            addCriterion("qad_Createtime =", value, "qadCreatetime");
            return (Criteria) this;
        }

        public Criteria andQadCreatetimeNotEqualTo(Date value) {
            addCriterion("qad_Createtime <>", value, "qadCreatetime");
            return (Criteria) this;
        }

        public Criteria andQadCreatetimeGreaterThan(Date value) {
            addCriterion("qad_Createtime >", value, "qadCreatetime");
            return (Criteria) this;
        }

        public Criteria andQadCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("qad_Createtime >=", value, "qadCreatetime");
            return (Criteria) this;
        }

        public Criteria andQadCreatetimeLessThan(Date value) {
            addCriterion("qad_Createtime <", value, "qadCreatetime");
            return (Criteria) this;
        }

        public Criteria andQadCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("qad_Createtime <=", value, "qadCreatetime");
            return (Criteria) this;
        }

        public Criteria andQadCreatetimeIn(List<Date> values) {
            addCriterion("qad_Createtime in", values, "qadCreatetime");
            return (Criteria) this;
        }

        public Criteria andQadCreatetimeNotIn(List<Date> values) {
            addCriterion("qad_Createtime not in", values, "qadCreatetime");
            return (Criteria) this;
        }

        public Criteria andQadCreatetimeBetween(Date value1, Date value2) {
            addCriterion("qad_Createtime between", value1, value2, "qadCreatetime");
            return (Criteria) this;
        }

        public Criteria andQadCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("qad_Createtime not between", value1, value2, "qadCreatetime");
            return (Criteria) this;
        }

        public Criteria andQadContentIsNull() {
            addCriterion("qad_Content is null");
            return (Criteria) this;
        }

        public Criteria andQadContentIsNotNull() {
            addCriterion("qad_Content is not null");
            return (Criteria) this;
        }

        public Criteria andQadContentEqualTo(String value) {
            addCriterion("qad_Content =", value, "qadContent");
            return (Criteria) this;
        }

        public Criteria andQadContentNotEqualTo(String value) {
            addCriterion("qad_Content <>", value, "qadContent");
            return (Criteria) this;
        }

        public Criteria andQadContentGreaterThan(String value) {
            addCriterion("qad_Content >", value, "qadContent");
            return (Criteria) this;
        }

        public Criteria andQadContentGreaterThanOrEqualTo(String value) {
            addCriterion("qad_Content >=", value, "qadContent");
            return (Criteria) this;
        }

        public Criteria andQadContentLessThan(String value) {
            addCriterion("qad_Content <", value, "qadContent");
            return (Criteria) this;
        }

        public Criteria andQadContentLessThanOrEqualTo(String value) {
            addCriterion("qad_Content <=", value, "qadContent");
            return (Criteria) this;
        }

        public Criteria andQadContentLike(String value) {
            addCriterion("qad_Content like", value, "qadContent");
            return (Criteria) this;
        }

        public Criteria andQadContentNotLike(String value) {
            addCriterion("qad_Content not like", value, "qadContent");
            return (Criteria) this;
        }

        public Criteria andQadContentIn(List<String> values) {
            addCriterion("qad_Content in", values, "qadContent");
            return (Criteria) this;
        }

        public Criteria andQadContentNotIn(List<String> values) {
            addCriterion("qad_Content not in", values, "qadContent");
            return (Criteria) this;
        }

        public Criteria andQadContentBetween(String value1, String value2) {
            addCriterion("qad_Content between", value1, value2, "qadContent");
            return (Criteria) this;
        }

        public Criteria andQadContentNotBetween(String value1, String value2) {
            addCriterion("qad_Content not between", value1, value2, "qadContent");
            return (Criteria) this;
        }

        public Criteria andQadStateIsNull() {
            addCriterion("qad_State is null");
            return (Criteria) this;
        }

        public Criteria andQadStateIsNotNull() {
            addCriterion("qad_State is not null");
            return (Criteria) this;
        }

        public Criteria andQadStateEqualTo(Integer value) {
            addCriterion("qad_State =", value, "qadState");
            return (Criteria) this;
        }

        public Criteria andQadStateNotEqualTo(Integer value) {
            addCriterion("qad_State <>", value, "qadState");
            return (Criteria) this;
        }

        public Criteria andQadStateGreaterThan(Integer value) {
            addCriterion("qad_State >", value, "qadState");
            return (Criteria) this;
        }

        public Criteria andQadStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("qad_State >=", value, "qadState");
            return (Criteria) this;
        }

        public Criteria andQadStateLessThan(Integer value) {
            addCriterion("qad_State <", value, "qadState");
            return (Criteria) this;
        }

        public Criteria andQadStateLessThanOrEqualTo(Integer value) {
            addCriterion("qad_State <=", value, "qadState");
            return (Criteria) this;
        }

        public Criteria andQadStateIn(List<Integer> values) {
            addCriterion("qad_State in", values, "qadState");
            return (Criteria) this;
        }

        public Criteria andQadStateNotIn(List<Integer> values) {
            addCriterion("qad_State not in", values, "qadState");
            return (Criteria) this;
        }

        public Criteria andQadStateBetween(Integer value1, Integer value2) {
            addCriterion("qad_State between", value1, value2, "qadState");
            return (Criteria) this;
        }

        public Criteria andQadStateNotBetween(Integer value1, Integer value2) {
            addCriterion("qad_State not between", value1, value2, "qadState");
            return (Criteria) this;
        }

        public Criteria andQadUpdatetimeIsNull() {
            addCriterion("qad_UpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andQadUpdatetimeIsNotNull() {
            addCriterion("qad_UpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andQadUpdatetimeEqualTo(Date value) {
            addCriterion("qad_UpdateTime =", value, "qadUpdatetime");
            return (Criteria) this;
        }

        public Criteria andQadUpdatetimeNotEqualTo(Date value) {
            addCriterion("qad_UpdateTime <>", value, "qadUpdatetime");
            return (Criteria) this;
        }

        public Criteria andQadUpdatetimeGreaterThan(Date value) {
            addCriterion("qad_UpdateTime >", value, "qadUpdatetime");
            return (Criteria) this;
        }

        public Criteria andQadUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("qad_UpdateTime >=", value, "qadUpdatetime");
            return (Criteria) this;
        }

        public Criteria andQadUpdatetimeLessThan(Date value) {
            addCriterion("qad_UpdateTime <", value, "qadUpdatetime");
            return (Criteria) this;
        }

        public Criteria andQadUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("qad_UpdateTime <=", value, "qadUpdatetime");
            return (Criteria) this;
        }

        public Criteria andQadUpdatetimeIn(List<Date> values) {
            addCriterion("qad_UpdateTime in", values, "qadUpdatetime");
            return (Criteria) this;
        }

        public Criteria andQadUpdatetimeNotIn(List<Date> values) {
            addCriterion("qad_UpdateTime not in", values, "qadUpdatetime");
            return (Criteria) this;
        }

        public Criteria andQadUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("qad_UpdateTime between", value1, value2, "qadUpdatetime");
            return (Criteria) this;
        }

        public Criteria andQadUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("qad_UpdateTime not between", value1, value2, "qadUpdatetime");
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