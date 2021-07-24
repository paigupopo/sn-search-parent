package com.sn.pojo;

import java.util.ArrayList;
import java.util.List;

public class LeaderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LeaderExample() {
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

        public Criteria andQalIdIsNull() {
            addCriterion("qal_id is null");
            return (Criteria) this;
        }

        public Criteria andQalIdIsNotNull() {
            addCriterion("qal_id is not null");
            return (Criteria) this;
        }

        public Criteria andQalIdEqualTo(Long value) {
            addCriterion("qal_id =", value, "qalId");
            return (Criteria) this;
        }

        public Criteria andQalIdNotEqualTo(Long value) {
            addCriterion("qal_id <>", value, "qalId");
            return (Criteria) this;
        }

        public Criteria andQalIdGreaterThan(Long value) {
            addCriterion("qal_id >", value, "qalId");
            return (Criteria) this;
        }

        public Criteria andQalIdGreaterThanOrEqualTo(Long value) {
            addCriterion("qal_id >=", value, "qalId");
            return (Criteria) this;
        }

        public Criteria andQalIdLessThan(Long value) {
            addCriterion("qal_id <", value, "qalId");
            return (Criteria) this;
        }

        public Criteria andQalIdLessThanOrEqualTo(Long value) {
            addCriterion("qal_id <=", value, "qalId");
            return (Criteria) this;
        }

        public Criteria andQalIdIn(List<Long> values) {
            addCriterion("qal_id in", values, "qalId");
            return (Criteria) this;
        }

        public Criteria andQalIdNotIn(List<Long> values) {
            addCriterion("qal_id not in", values, "qalId");
            return (Criteria) this;
        }

        public Criteria andQalIdBetween(Long value1, Long value2) {
            addCriterion("qal_id between", value1, value2, "qalId");
            return (Criteria) this;
        }

        public Criteria andQalIdNotBetween(Long value1, Long value2) {
            addCriterion("qal_id not between", value1, value2, "qalId");
            return (Criteria) this;
        }

        public Criteria andQalNameIsNull() {
            addCriterion("qal_Name is null");
            return (Criteria) this;
        }

        public Criteria andQalNameIsNotNull() {
            addCriterion("qal_Name is not null");
            return (Criteria) this;
        }

        public Criteria andQalNameEqualTo(String value) {
            addCriterion("qal_Name =", value, "qalName");
            return (Criteria) this;
        }

        public Criteria andQalNameNotEqualTo(String value) {
            addCriterion("qal_Name <>", value, "qalName");
            return (Criteria) this;
        }

        public Criteria andQalNameGreaterThan(String value) {
            addCriterion("qal_Name >", value, "qalName");
            return (Criteria) this;
        }

        public Criteria andQalNameGreaterThanOrEqualTo(String value) {
            addCriterion("qal_Name >=", value, "qalName");
            return (Criteria) this;
        }

        public Criteria andQalNameLessThan(String value) {
            addCriterion("qal_Name <", value, "qalName");
            return (Criteria) this;
        }

        public Criteria andQalNameLessThanOrEqualTo(String value) {
            addCriterion("qal_Name <=", value, "qalName");
            return (Criteria) this;
        }

        public Criteria andQalNameLike(String value) {
            addCriterion("qal_Name like", value, "qalName");
            return (Criteria) this;
        }

        public Criteria andQalNameNotLike(String value) {
            addCriterion("qal_Name not like", value, "qalName");
            return (Criteria) this;
        }

        public Criteria andQalNameIn(List<String> values) {
            addCriterion("qal_Name in", values, "qalName");
            return (Criteria) this;
        }

        public Criteria andQalNameNotIn(List<String> values) {
            addCriterion("qal_Name not in", values, "qalName");
            return (Criteria) this;
        }

        public Criteria andQalNameBetween(String value1, String value2) {
            addCriterion("qal_Name between", value1, value2, "qalName");
            return (Criteria) this;
        }

        public Criteria andQalNameNotBetween(String value1, String value2) {
            addCriterion("qal_Name not between", value1, value2, "qalName");
            return (Criteria) this;
        }

        public Criteria andQalResignIsNull() {
            addCriterion("qal_Resign is null");
            return (Criteria) this;
        }

        public Criteria andQalResignIsNotNull() {
            addCriterion("qal_Resign is not null");
            return (Criteria) this;
        }

        public Criteria andQalResignEqualTo(String value) {
            addCriterion("qal_Resign =", value, "qalResign");
            return (Criteria) this;
        }

        public Criteria andQalResignNotEqualTo(String value) {
            addCriterion("qal_Resign <>", value, "qalResign");
            return (Criteria) this;
        }

        public Criteria andQalResignGreaterThan(String value) {
            addCriterion("qal_Resign >", value, "qalResign");
            return (Criteria) this;
        }

        public Criteria andQalResignGreaterThanOrEqualTo(String value) {
            addCriterion("qal_Resign >=", value, "qalResign");
            return (Criteria) this;
        }

        public Criteria andQalResignLessThan(String value) {
            addCriterion("qal_Resign <", value, "qalResign");
            return (Criteria) this;
        }

        public Criteria andQalResignLessThanOrEqualTo(String value) {
            addCriterion("qal_Resign <=", value, "qalResign");
            return (Criteria) this;
        }

        public Criteria andQalResignLike(String value) {
            addCriterion("qal_Resign like", value, "qalResign");
            return (Criteria) this;
        }

        public Criteria andQalResignNotLike(String value) {
            addCriterion("qal_Resign not like", value, "qalResign");
            return (Criteria) this;
        }

        public Criteria andQalResignIn(List<String> values) {
            addCriterion("qal_Resign in", values, "qalResign");
            return (Criteria) this;
        }

        public Criteria andQalResignNotIn(List<String> values) {
            addCriterion("qal_Resign not in", values, "qalResign");
            return (Criteria) this;
        }

        public Criteria andQalResignBetween(String value1, String value2) {
            addCriterion("qal_Resign between", value1, value2, "qalResign");
            return (Criteria) this;
        }

        public Criteria andQalResignNotBetween(String value1, String value2) {
            addCriterion("qal_Resign not between", value1, value2, "qalResign");
            return (Criteria) this;
        }

        public Criteria andQalSynopsisIsNull() {
            addCriterion("qal_Synopsis is null");
            return (Criteria) this;
        }

        public Criteria andQalSynopsisIsNotNull() {
            addCriterion("qal_Synopsis is not null");
            return (Criteria) this;
        }

        public Criteria andQalSynopsisEqualTo(String value) {
            addCriterion("qal_Synopsis =", value, "qalSynopsis");
            return (Criteria) this;
        }

        public Criteria andQalSynopsisNotEqualTo(String value) {
            addCriterion("qal_Synopsis <>", value, "qalSynopsis");
            return (Criteria) this;
        }

        public Criteria andQalSynopsisGreaterThan(String value) {
            addCriterion("qal_Synopsis >", value, "qalSynopsis");
            return (Criteria) this;
        }

        public Criteria andQalSynopsisGreaterThanOrEqualTo(String value) {
            addCriterion("qal_Synopsis >=", value, "qalSynopsis");
            return (Criteria) this;
        }

        public Criteria andQalSynopsisLessThan(String value) {
            addCriterion("qal_Synopsis <", value, "qalSynopsis");
            return (Criteria) this;
        }

        public Criteria andQalSynopsisLessThanOrEqualTo(String value) {
            addCriterion("qal_Synopsis <=", value, "qalSynopsis");
            return (Criteria) this;
        }

        public Criteria andQalSynopsisLike(String value) {
            addCriterion("qal_Synopsis like", value, "qalSynopsis");
            return (Criteria) this;
        }

        public Criteria andQalSynopsisNotLike(String value) {
            addCriterion("qal_Synopsis not like", value, "qalSynopsis");
            return (Criteria) this;
        }

        public Criteria andQalSynopsisIn(List<String> values) {
            addCriterion("qal_Synopsis in", values, "qalSynopsis");
            return (Criteria) this;
        }

        public Criteria andQalSynopsisNotIn(List<String> values) {
            addCriterion("qal_Synopsis not in", values, "qalSynopsis");
            return (Criteria) this;
        }

        public Criteria andQalSynopsisBetween(String value1, String value2) {
            addCriterion("qal_Synopsis between", value1, value2, "qalSynopsis");
            return (Criteria) this;
        }

        public Criteria andQalSynopsisNotBetween(String value1, String value2) {
            addCriterion("qal_Synopsis not between", value1, value2, "qalSynopsis");
            return (Criteria) this;
        }

        public Criteria andQalResumeIsNull() {
            addCriterion("qal_Resume is null");
            return (Criteria) this;
        }

        public Criteria andQalResumeIsNotNull() {
            addCriterion("qal_Resume is not null");
            return (Criteria) this;
        }

        public Criteria andQalResumeEqualTo(String value) {
            addCriterion("qal_Resume =", value, "qalResume");
            return (Criteria) this;
        }

        public Criteria andQalResumeNotEqualTo(String value) {
            addCriterion("qal_Resume <>", value, "qalResume");
            return (Criteria) this;
        }

        public Criteria andQalResumeGreaterThan(String value) {
            addCriterion("qal_Resume >", value, "qalResume");
            return (Criteria) this;
        }

        public Criteria andQalResumeGreaterThanOrEqualTo(String value) {
            addCriterion("qal_Resume >=", value, "qalResume");
            return (Criteria) this;
        }

        public Criteria andQalResumeLessThan(String value) {
            addCriterion("qal_Resume <", value, "qalResume");
            return (Criteria) this;
        }

        public Criteria andQalResumeLessThanOrEqualTo(String value) {
            addCriterion("qal_Resume <=", value, "qalResume");
            return (Criteria) this;
        }

        public Criteria andQalResumeLike(String value) {
            addCriterion("qal_Resume like", value, "qalResume");
            return (Criteria) this;
        }

        public Criteria andQalResumeNotLike(String value) {
            addCriterion("qal_Resume not like", value, "qalResume");
            return (Criteria) this;
        }

        public Criteria andQalResumeIn(List<String> values) {
            addCriterion("qal_Resume in", values, "qalResume");
            return (Criteria) this;
        }

        public Criteria andQalResumeNotIn(List<String> values) {
            addCriterion("qal_Resume not in", values, "qalResume");
            return (Criteria) this;
        }

        public Criteria andQalResumeBetween(String value1, String value2) {
            addCriterion("qal_Resume between", value1, value2, "qalResume");
            return (Criteria) this;
        }

        public Criteria andQalResumeNotBetween(String value1, String value2) {
            addCriterion("qal_Resume not between", value1, value2, "qalResume");
            return (Criteria) this;
        }

        public Criteria andQalAchievementIsNull() {
            addCriterion("qal_Achievement is null");
            return (Criteria) this;
        }

        public Criteria andQalAchievementIsNotNull() {
            addCriterion("qal_Achievement is not null");
            return (Criteria) this;
        }

        public Criteria andQalAchievementEqualTo(String value) {
            addCriterion("qal_Achievement =", value, "qalAchievement");
            return (Criteria) this;
        }

        public Criteria andQalAchievementNotEqualTo(String value) {
            addCriterion("qal_Achievement <>", value, "qalAchievement");
            return (Criteria) this;
        }

        public Criteria andQalAchievementGreaterThan(String value) {
            addCriterion("qal_Achievement >", value, "qalAchievement");
            return (Criteria) this;
        }

        public Criteria andQalAchievementGreaterThanOrEqualTo(String value) {
            addCriterion("qal_Achievement >=", value, "qalAchievement");
            return (Criteria) this;
        }

        public Criteria andQalAchievementLessThan(String value) {
            addCriterion("qal_Achievement <", value, "qalAchievement");
            return (Criteria) this;
        }

        public Criteria andQalAchievementLessThanOrEqualTo(String value) {
            addCriterion("qal_Achievement <=", value, "qalAchievement");
            return (Criteria) this;
        }

        public Criteria andQalAchievementLike(String value) {
            addCriterion("qal_Achievement like", value, "qalAchievement");
            return (Criteria) this;
        }

        public Criteria andQalAchievementNotLike(String value) {
            addCriterion("qal_Achievement not like", value, "qalAchievement");
            return (Criteria) this;
        }

        public Criteria andQalAchievementIn(List<String> values) {
            addCriterion("qal_Achievement in", values, "qalAchievement");
            return (Criteria) this;
        }

        public Criteria andQalAchievementNotIn(List<String> values) {
            addCriterion("qal_Achievement not in", values, "qalAchievement");
            return (Criteria) this;
        }

        public Criteria andQalAchievementBetween(String value1, String value2) {
            addCriterion("qal_Achievement between", value1, value2, "qalAchievement");
            return (Criteria) this;
        }

        public Criteria andQalAchievementNotBetween(String value1, String value2) {
            addCriterion("qal_Achievement not between", value1, value2, "qalAchievement");
            return (Criteria) this;
        }

        public Criteria andQalWorkIsNull() {
            addCriterion("qal_Work is null");
            return (Criteria) this;
        }

        public Criteria andQalWorkIsNotNull() {
            addCriterion("qal_Work is not null");
            return (Criteria) this;
        }

        public Criteria andQalWorkEqualTo(String value) {
            addCriterion("qal_Work =", value, "qalWork");
            return (Criteria) this;
        }

        public Criteria andQalWorkNotEqualTo(String value) {
            addCriterion("qal_Work <>", value, "qalWork");
            return (Criteria) this;
        }

        public Criteria andQalWorkGreaterThan(String value) {
            addCriterion("qal_Work >", value, "qalWork");
            return (Criteria) this;
        }

        public Criteria andQalWorkGreaterThanOrEqualTo(String value) {
            addCriterion("qal_Work >=", value, "qalWork");
            return (Criteria) this;
        }

        public Criteria andQalWorkLessThan(String value) {
            addCriterion("qal_Work <", value, "qalWork");
            return (Criteria) this;
        }

        public Criteria andQalWorkLessThanOrEqualTo(String value) {
            addCriterion("qal_Work <=", value, "qalWork");
            return (Criteria) this;
        }

        public Criteria andQalWorkLike(String value) {
            addCriterion("qal_Work like", value, "qalWork");
            return (Criteria) this;
        }

        public Criteria andQalWorkNotLike(String value) {
            addCriterion("qal_Work not like", value, "qalWork");
            return (Criteria) this;
        }

        public Criteria andQalWorkIn(List<String> values) {
            addCriterion("qal_Work in", values, "qalWork");
            return (Criteria) this;
        }

        public Criteria andQalWorkNotIn(List<String> values) {
            addCriterion("qal_Work not in", values, "qalWork");
            return (Criteria) this;
        }

        public Criteria andQalWorkBetween(String value1, String value2) {
            addCriterion("qal_Work between", value1, value2, "qalWork");
            return (Criteria) this;
        }

        public Criteria andQalWorkNotBetween(String value1, String value2) {
            addCriterion("qal_Work not between", value1, value2, "qalWork");
            return (Criteria) this;
        }

        public Criteria andQalUrlIsNull() {
            addCriterion("qal_url is null");
            return (Criteria) this;
        }

        public Criteria andQalUrlIsNotNull() {
            addCriterion("qal_url is not null");
            return (Criteria) this;
        }

        public Criteria andQalUrlEqualTo(String value) {
            addCriterion("qal_url =", value, "qalUrl");
            return (Criteria) this;
        }

        public Criteria andQalUrlNotEqualTo(String value) {
            addCriterion("qal_url <>", value, "qalUrl");
            return (Criteria) this;
        }

        public Criteria andQalUrlGreaterThan(String value) {
            addCriterion("qal_url >", value, "qalUrl");
            return (Criteria) this;
        }

        public Criteria andQalUrlGreaterThanOrEqualTo(String value) {
            addCriterion("qal_url >=", value, "qalUrl");
            return (Criteria) this;
        }

        public Criteria andQalUrlLessThan(String value) {
            addCriterion("qal_url <", value, "qalUrl");
            return (Criteria) this;
        }

        public Criteria andQalUrlLessThanOrEqualTo(String value) {
            addCriterion("qal_url <=", value, "qalUrl");
            return (Criteria) this;
        }

        public Criteria andQalUrlLike(String value) {
            addCriterion("qal_url like", value, "qalUrl");
            return (Criteria) this;
        }

        public Criteria andQalUrlNotLike(String value) {
            addCriterion("qal_url not like", value, "qalUrl");
            return (Criteria) this;
        }

        public Criteria andQalUrlIn(List<String> values) {
            addCriterion("qal_url in", values, "qalUrl");
            return (Criteria) this;
        }

        public Criteria andQalUrlNotIn(List<String> values) {
            addCriterion("qal_url not in", values, "qalUrl");
            return (Criteria) this;
        }

        public Criteria andQalUrlBetween(String value1, String value2) {
            addCriterion("qal_url between", value1, value2, "qalUrl");
            return (Criteria) this;
        }

        public Criteria andQalUrlNotBetween(String value1, String value2) {
            addCriterion("qal_url not between", value1, value2, "qalUrl");
            return (Criteria) this;
        }

        public Criteria andQalImgIsNull() {
            addCriterion("qal_img is null");
            return (Criteria) this;
        }

        public Criteria andQalImgIsNotNull() {
            addCriterion("qal_img is not null");
            return (Criteria) this;
        }

        public Criteria andQalImgEqualTo(String value) {
            addCriterion("qal_img =", value, "qalImg");
            return (Criteria) this;
        }

        public Criteria andQalImgNotEqualTo(String value) {
            addCriterion("qal_img <>", value, "qalImg");
            return (Criteria) this;
        }

        public Criteria andQalImgGreaterThan(String value) {
            addCriterion("qal_img >", value, "qalImg");
            return (Criteria) this;
        }

        public Criteria andQalImgGreaterThanOrEqualTo(String value) {
            addCriterion("qal_img >=", value, "qalImg");
            return (Criteria) this;
        }

        public Criteria andQalImgLessThan(String value) {
            addCriterion("qal_img <", value, "qalImg");
            return (Criteria) this;
        }

        public Criteria andQalImgLessThanOrEqualTo(String value) {
            addCriterion("qal_img <=", value, "qalImg");
            return (Criteria) this;
        }

        public Criteria andQalImgLike(String value) {
            addCriterion("qal_img like", value, "qalImg");
            return (Criteria) this;
        }

        public Criteria andQalImgNotLike(String value) {
            addCriterion("qal_img not like", value, "qalImg");
            return (Criteria) this;
        }

        public Criteria andQalImgIn(List<String> values) {
            addCriterion("qal_img in", values, "qalImg");
            return (Criteria) this;
        }

        public Criteria andQalImgNotIn(List<String> values) {
            addCriterion("qal_img not in", values, "qalImg");
            return (Criteria) this;
        }

        public Criteria andQalImgBetween(String value1, String value2) {
            addCriterion("qal_img between", value1, value2, "qalImg");
            return (Criteria) this;
        }

        public Criteria andQalImgNotBetween(String value1, String value2) {
            addCriterion("qal_img not between", value1, value2, "qalImg");
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