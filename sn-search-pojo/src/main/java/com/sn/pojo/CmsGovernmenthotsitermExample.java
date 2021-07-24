package com.sn.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CmsGovernmenthotsitermExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmsGovernmenthotsitermExample() {
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

        public Criteria andItemidIsNull() {
            addCriterion("itemId is null");
            return (Criteria) this;
        }

        public Criteria andItemidIsNotNull() {
            addCriterion("itemId is not null");
            return (Criteria) this;
        }

        public Criteria andItemidEqualTo(Long value) {
            addCriterion("itemId =", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotEqualTo(Long value) {
            addCriterion("itemId <>", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidGreaterThan(Long value) {
            addCriterion("itemId >", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidGreaterThanOrEqualTo(Long value) {
            addCriterion("itemId >=", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidLessThan(Long value) {
            addCriterion("itemId <", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidLessThanOrEqualTo(Long value) {
            addCriterion("itemId <=", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidIn(List<Long> values) {
            addCriterion("itemId in", values, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotIn(List<Long> values) {
            addCriterion("itemId not in", values, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidBetween(Long value1, Long value2) {
            addCriterion("itemId between", value1, value2, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotBetween(Long value1, Long value2) {
            addCriterion("itemId not between", value1, value2, "itemid");
            return (Criteria) this;
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

        public Criteria andHotdateIsNull() {
            addCriterion("hotDate is null");
            return (Criteria) this;
        }

        public Criteria andHotdateIsNotNull() {
            addCriterion("hotDate is not null");
            return (Criteria) this;
        }

        public Criteria andHotdateEqualTo(Date value) {
            addCriterion("hotDate =", value, "hotdate");
            return (Criteria) this;
        }

        public Criteria andHotdateNotEqualTo(Date value) {
            addCriterion("hotDate <>", value, "hotdate");
            return (Criteria) this;
        }

        public Criteria andHotdateGreaterThan(Date value) {
            addCriterion("hotDate >", value, "hotdate");
            return (Criteria) this;
        }

        public Criteria andHotdateGreaterThanOrEqualTo(Date value) {
            addCriterion("hotDate >=", value, "hotdate");
            return (Criteria) this;
        }

        public Criteria andHotdateLessThan(Date value) {
            addCriterion("hotDate <", value, "hotdate");
            return (Criteria) this;
        }

        public Criteria andHotdateLessThanOrEqualTo(Date value) {
            addCriterion("hotDate <=", value, "hotdate");
            return (Criteria) this;
        }

        public Criteria andHotdateIn(List<Date> values) {
            addCriterion("hotDate in", values, "hotdate");
            return (Criteria) this;
        }

        public Criteria andHotdateNotIn(List<Date> values) {
            addCriterion("hotDate not in", values, "hotdate");
            return (Criteria) this;
        }

        public Criteria andHotdateBetween(Date value1, Date value2) {
            addCriterion("hotDate between", value1, value2, "hotdate");
            return (Criteria) this;
        }

        public Criteria andHotdateNotBetween(Date value1, Date value2) {
            addCriterion("hotDate not between", value1, value2, "hotdate");
            return (Criteria) this;
        }

        public Criteria andCityaddressIsNull() {
            addCriterion("cityAddress is null");
            return (Criteria) this;
        }

        public Criteria andCityaddressIsNotNull() {
            addCriterion("cityAddress is not null");
            return (Criteria) this;
        }

        public Criteria andCityaddressEqualTo(String value) {
            addCriterion("cityAddress =", value, "cityaddress");
            return (Criteria) this;
        }

        public Criteria andCityaddressNotEqualTo(String value) {
            addCriterion("cityAddress <>", value, "cityaddress");
            return (Criteria) this;
        }

        public Criteria andCityaddressGreaterThan(String value) {
            addCriterion("cityAddress >", value, "cityaddress");
            return (Criteria) this;
        }

        public Criteria andCityaddressGreaterThanOrEqualTo(String value) {
            addCriterion("cityAddress >=", value, "cityaddress");
            return (Criteria) this;
        }

        public Criteria andCityaddressLessThan(String value) {
            addCriterion("cityAddress <", value, "cityaddress");
            return (Criteria) this;
        }

        public Criteria andCityaddressLessThanOrEqualTo(String value) {
            addCriterion("cityAddress <=", value, "cityaddress");
            return (Criteria) this;
        }

        public Criteria andCityaddressLike(String value) {
            addCriterion("cityAddress like", value, "cityaddress");
            return (Criteria) this;
        }

        public Criteria andCityaddressNotLike(String value) {
            addCriterion("cityAddress not like", value, "cityaddress");
            return (Criteria) this;
        }

        public Criteria andCityaddressIn(List<String> values) {
            addCriterion("cityAddress in", values, "cityaddress");
            return (Criteria) this;
        }

        public Criteria andCityaddressNotIn(List<String> values) {
            addCriterion("cityAddress not in", values, "cityaddress");
            return (Criteria) this;
        }

        public Criteria andCityaddressBetween(String value1, String value2) {
            addCriterion("cityAddress between", value1, value2, "cityaddress");
            return (Criteria) this;
        }

        public Criteria andCityaddressNotBetween(String value1, String value2) {
            addCriterion("cityAddress not between", value1, value2, "cityaddress");
            return (Criteria) this;
        }

        public Criteria andHotresourceIsNull() {
            addCriterion("hotResource is null");
            return (Criteria) this;
        }

        public Criteria andHotresourceIsNotNull() {
            addCriterion("hotResource is not null");
            return (Criteria) this;
        }

        public Criteria andHotresourceEqualTo(String value) {
            addCriterion("hotResource =", value, "hotresource");
            return (Criteria) this;
        }

        public Criteria andHotresourceNotEqualTo(String value) {
            addCriterion("hotResource <>", value, "hotresource");
            return (Criteria) this;
        }

        public Criteria andHotresourceGreaterThan(String value) {
            addCriterion("hotResource >", value, "hotresource");
            return (Criteria) this;
        }

        public Criteria andHotresourceGreaterThanOrEqualTo(String value) {
            addCriterion("hotResource >=", value, "hotresource");
            return (Criteria) this;
        }

        public Criteria andHotresourceLessThan(String value) {
            addCriterion("hotResource <", value, "hotresource");
            return (Criteria) this;
        }

        public Criteria andHotresourceLessThanOrEqualTo(String value) {
            addCriterion("hotResource <=", value, "hotresource");
            return (Criteria) this;
        }

        public Criteria andHotresourceLike(String value) {
            addCriterion("hotResource like", value, "hotresource");
            return (Criteria) this;
        }

        public Criteria andHotresourceNotLike(String value) {
            addCriterion("hotResource not like", value, "hotresource");
            return (Criteria) this;
        }

        public Criteria andHotresourceIn(List<String> values) {
            addCriterion("hotResource in", values, "hotresource");
            return (Criteria) this;
        }

        public Criteria andHotresourceNotIn(List<String> values) {
            addCriterion("hotResource not in", values, "hotresource");
            return (Criteria) this;
        }

        public Criteria andHotresourceBetween(String value1, String value2) {
            addCriterion("hotResource between", value1, value2, "hotresource");
            return (Criteria) this;
        }

        public Criteria andHotresourceNotBetween(String value1, String value2) {
            addCriterion("hotResource not between", value1, value2, "hotresource");
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

        public Criteria andDomainurlIsNull() {
            addCriterion("domainUrl is null");
            return (Criteria) this;
        }

        public Criteria andDomainurlIsNotNull() {
            addCriterion("domainUrl is not null");
            return (Criteria) this;
        }

        public Criteria andDomainurlEqualTo(String value) {
            addCriterion("domainUrl =", value, "domainurl");
            return (Criteria) this;
        }

        public Criteria andDomainurlNotEqualTo(String value) {
            addCriterion("domainUrl <>", value, "domainurl");
            return (Criteria) this;
        }

        public Criteria andDomainurlGreaterThan(String value) {
            addCriterion("domainUrl >", value, "domainurl");
            return (Criteria) this;
        }

        public Criteria andDomainurlGreaterThanOrEqualTo(String value) {
            addCriterion("domainUrl >=", value, "domainurl");
            return (Criteria) this;
        }

        public Criteria andDomainurlLessThan(String value) {
            addCriterion("domainUrl <", value, "domainurl");
            return (Criteria) this;
        }

        public Criteria andDomainurlLessThanOrEqualTo(String value) {
            addCriterion("domainUrl <=", value, "domainurl");
            return (Criteria) this;
        }

        public Criteria andDomainurlLike(String value) {
            addCriterion("domainUrl like", value, "domainurl");
            return (Criteria) this;
        }

        public Criteria andDomainurlNotLike(String value) {
            addCriterion("domainUrl not like", value, "domainurl");
            return (Criteria) this;
        }

        public Criteria andDomainurlIn(List<String> values) {
            addCriterion("domainUrl in", values, "domainurl");
            return (Criteria) this;
        }

        public Criteria andDomainurlNotIn(List<String> values) {
            addCriterion("domainUrl not in", values, "domainurl");
            return (Criteria) this;
        }

        public Criteria andDomainurlBetween(String value1, String value2) {
            addCriterion("domainUrl between", value1, value2, "domainurl");
            return (Criteria) this;
        }

        public Criteria andDomainurlNotBetween(String value1, String value2) {
            addCriterion("domainUrl not between", value1, value2, "domainurl");
            return (Criteria) this;
        }

        public Criteria andItemcountIsNull() {
            addCriterion("itemCount is null");
            return (Criteria) this;
        }

        public Criteria andItemcountIsNotNull() {
            addCriterion("itemCount is not null");
            return (Criteria) this;
        }

        public Criteria andItemcountEqualTo(Integer value) {
            addCriterion("itemCount =", value, "itemcount");
            return (Criteria) this;
        }

        public Criteria andItemcountNotEqualTo(Integer value) {
            addCriterion("itemCount <>", value, "itemcount");
            return (Criteria) this;
        }

        public Criteria andItemcountGreaterThan(Integer value) {
            addCriterion("itemCount >", value, "itemcount");
            return (Criteria) this;
        }

        public Criteria andItemcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("itemCount >=", value, "itemcount");
            return (Criteria) this;
        }

        public Criteria andItemcountLessThan(Integer value) {
            addCriterion("itemCount <", value, "itemcount");
            return (Criteria) this;
        }

        public Criteria andItemcountLessThanOrEqualTo(Integer value) {
            addCriterion("itemCount <=", value, "itemcount");
            return (Criteria) this;
        }

        public Criteria andItemcountIn(List<Integer> values) {
            addCriterion("itemCount in", values, "itemcount");
            return (Criteria) this;
        }

        public Criteria andItemcountNotIn(List<Integer> values) {
            addCriterion("itemCount not in", values, "itemcount");
            return (Criteria) this;
        }

        public Criteria andItemcountBetween(Integer value1, Integer value2) {
            addCriterion("itemCount between", value1, value2, "itemcount");
            return (Criteria) this;
        }

        public Criteria andItemcountNotBetween(Integer value1, Integer value2) {
            addCriterion("itemCount not between", value1, value2, "itemcount");
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