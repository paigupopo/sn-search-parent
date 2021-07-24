package com.sn.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WzqMailboxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WzqMailboxExample() {
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

        public Criteria andMessageidIsNull() {
            addCriterion("messageId is null");
            return (Criteria) this;
        }

        public Criteria andMessageidIsNotNull() {
            addCriterion("messageId is not null");
            return (Criteria) this;
        }

        public Criteria andMessageidEqualTo(Long value) {
            addCriterion("messageId =", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotEqualTo(Long value) {
            addCriterion("messageId <>", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidGreaterThan(Long value) {
            addCriterion("messageId >", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidGreaterThanOrEqualTo(Long value) {
            addCriterion("messageId >=", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidLessThan(Long value) {
            addCriterion("messageId <", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidLessThanOrEqualTo(Long value) {
            addCriterion("messageId <=", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidIn(List<Long> values) {
            addCriterion("messageId in", values, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotIn(List<Long> values) {
            addCriterion("messageId not in", values, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidBetween(Long value1, Long value2) {
            addCriterion("messageId between", value1, value2, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotBetween(Long value1, Long value2) {
            addCriterion("messageId not between", value1, value2, "messageid");
            return (Criteria) this;
        }

        public Criteria andQuestionmegidIsNull() {
            addCriterion("questionMegId is null");
            return (Criteria) this;
        }

        public Criteria andQuestionmegidIsNotNull() {
            addCriterion("questionMegId is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionmegidEqualTo(Long value) {
            addCriterion("questionMegId =", value, "questionmegid");
            return (Criteria) this;
        }

        public Criteria andQuestionmegidNotEqualTo(Long value) {
            addCriterion("questionMegId <>", value, "questionmegid");
            return (Criteria) this;
        }

        public Criteria andQuestionmegidGreaterThan(Long value) {
            addCriterion("questionMegId >", value, "questionmegid");
            return (Criteria) this;
        }

        public Criteria andQuestionmegidGreaterThanOrEqualTo(Long value) {
            addCriterion("questionMegId >=", value, "questionmegid");
            return (Criteria) this;
        }

        public Criteria andQuestionmegidLessThan(Long value) {
            addCriterion("questionMegId <", value, "questionmegid");
            return (Criteria) this;
        }

        public Criteria andQuestionmegidLessThanOrEqualTo(Long value) {
            addCriterion("questionMegId <=", value, "questionmegid");
            return (Criteria) this;
        }

        public Criteria andQuestionmegidIn(List<Long> values) {
            addCriterion("questionMegId in", values, "questionmegid");
            return (Criteria) this;
        }

        public Criteria andQuestionmegidNotIn(List<Long> values) {
            addCriterion("questionMegId not in", values, "questionmegid");
            return (Criteria) this;
        }

        public Criteria andQuestionmegidBetween(Long value1, Long value2) {
            addCriterion("questionMegId between", value1, value2, "questionmegid");
            return (Criteria) this;
        }

        public Criteria andQuestionmegidNotBetween(Long value1, Long value2) {
            addCriterion("questionMegId not between", value1, value2, "questionmegid");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNull() {
            addCriterion("companyName is null");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNotNull() {
            addCriterion("companyName is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynameEqualTo(String value) {
            addCriterion("companyName =", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotEqualTo(String value) {
            addCriterion("companyName <>", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThan(String value) {
            addCriterion("companyName >", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("companyName >=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThan(String value) {
            addCriterion("companyName <", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThanOrEqualTo(String value) {
            addCriterion("companyName <=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLike(String value) {
            addCriterion("companyName like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotLike(String value) {
            addCriterion("companyName not like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIn(List<String> values) {
            addCriterion("companyName in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotIn(List<String> values) {
            addCriterion("companyName not in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameBetween(String value1, String value2) {
            addCriterion("companyName between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotBetween(String value1, String value2) {
            addCriterion("companyName not between", value1, value2, "companyname");
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

        public Criteria andFixedphoneIsNull() {
            addCriterion("fixedPhone is null");
            return (Criteria) this;
        }

        public Criteria andFixedphoneIsNotNull() {
            addCriterion("fixedPhone is not null");
            return (Criteria) this;
        }

        public Criteria andFixedphoneEqualTo(String value) {
            addCriterion("fixedPhone =", value, "fixedphone");
            return (Criteria) this;
        }

        public Criteria andFixedphoneNotEqualTo(String value) {
            addCriterion("fixedPhone <>", value, "fixedphone");
            return (Criteria) this;
        }

        public Criteria andFixedphoneGreaterThan(String value) {
            addCriterion("fixedPhone >", value, "fixedphone");
            return (Criteria) this;
        }

        public Criteria andFixedphoneGreaterThanOrEqualTo(String value) {
            addCriterion("fixedPhone >=", value, "fixedphone");
            return (Criteria) this;
        }

        public Criteria andFixedphoneLessThan(String value) {
            addCriterion("fixedPhone <", value, "fixedphone");
            return (Criteria) this;
        }

        public Criteria andFixedphoneLessThanOrEqualTo(String value) {
            addCriterion("fixedPhone <=", value, "fixedphone");
            return (Criteria) this;
        }

        public Criteria andFixedphoneLike(String value) {
            addCriterion("fixedPhone like", value, "fixedphone");
            return (Criteria) this;
        }

        public Criteria andFixedphoneNotLike(String value) {
            addCriterion("fixedPhone not like", value, "fixedphone");
            return (Criteria) this;
        }

        public Criteria andFixedphoneIn(List<String> values) {
            addCriterion("fixedPhone in", values, "fixedphone");
            return (Criteria) this;
        }

        public Criteria andFixedphoneNotIn(List<String> values) {
            addCriterion("fixedPhone not in", values, "fixedphone");
            return (Criteria) this;
        }

        public Criteria andFixedphoneBetween(String value1, String value2) {
            addCriterion("fixedPhone between", value1, value2, "fixedphone");
            return (Criteria) this;
        }

        public Criteria andFixedphoneNotBetween(String value1, String value2) {
            addCriterion("fixedPhone not between", value1, value2, "fixedphone");
            return (Criteria) this;
        }

        public Criteria andPhonenumberIsNull() {
            addCriterion("phoneNumber is null");
            return (Criteria) this;
        }

        public Criteria andPhonenumberIsNotNull() {
            addCriterion("phoneNumber is not null");
            return (Criteria) this;
        }

        public Criteria andPhonenumberEqualTo(String value) {
            addCriterion("phoneNumber =", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotEqualTo(String value) {
            addCriterion("phoneNumber <>", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberGreaterThan(String value) {
            addCriterion("phoneNumber >", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberGreaterThanOrEqualTo(String value) {
            addCriterion("phoneNumber >=", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberLessThan(String value) {
            addCriterion("phoneNumber <", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberLessThanOrEqualTo(String value) {
            addCriterion("phoneNumber <=", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberLike(String value) {
            addCriterion("phoneNumber like", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotLike(String value) {
            addCriterion("phoneNumber not like", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberIn(List<String> values) {
            addCriterion("phoneNumber in", values, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotIn(List<String> values) {
            addCriterion("phoneNumber not in", values, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberBetween(String value1, String value2) {
            addCriterion("phoneNumber between", value1, value2, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotBetween(String value1, String value2) {
            addCriterion("phoneNumber not between", value1, value2, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andIpcontentIsNull() {
            addCriterion("ipContent is null");
            return (Criteria) this;
        }

        public Criteria andIpcontentIsNotNull() {
            addCriterion("ipContent is not null");
            return (Criteria) this;
        }

        public Criteria andIpcontentEqualTo(String value) {
            addCriterion("ipContent =", value, "ipcontent");
            return (Criteria) this;
        }

        public Criteria andIpcontentNotEqualTo(String value) {
            addCriterion("ipContent <>", value, "ipcontent");
            return (Criteria) this;
        }

        public Criteria andIpcontentGreaterThan(String value) {
            addCriterion("ipContent >", value, "ipcontent");
            return (Criteria) this;
        }

        public Criteria andIpcontentGreaterThanOrEqualTo(String value) {
            addCriterion("ipContent >=", value, "ipcontent");
            return (Criteria) this;
        }

        public Criteria andIpcontentLessThan(String value) {
            addCriterion("ipContent <", value, "ipcontent");
            return (Criteria) this;
        }

        public Criteria andIpcontentLessThanOrEqualTo(String value) {
            addCriterion("ipContent <=", value, "ipcontent");
            return (Criteria) this;
        }

        public Criteria andIpcontentLike(String value) {
            addCriterion("ipContent like", value, "ipcontent");
            return (Criteria) this;
        }

        public Criteria andIpcontentNotLike(String value) {
            addCriterion("ipContent not like", value, "ipcontent");
            return (Criteria) this;
        }

        public Criteria andIpcontentIn(List<String> values) {
            addCriterion("ipContent in", values, "ipcontent");
            return (Criteria) this;
        }

        public Criteria andIpcontentNotIn(List<String> values) {
            addCriterion("ipContent not in", values, "ipcontent");
            return (Criteria) this;
        }

        public Criteria andIpcontentBetween(String value1, String value2) {
            addCriterion("ipContent between", value1, value2, "ipcontent");
            return (Criteria) this;
        }

        public Criteria andIpcontentNotBetween(String value1, String value2) {
            addCriterion("ipContent not between", value1, value2, "ipcontent");
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

        public Criteria andCodeIsNull() {
            addCriterion("code_ is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code_ is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code_ =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code_ <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code_ >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code_ >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code_ <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code_ <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code_ like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code_ not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code_ in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code_ not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code_ between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code_ not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andMsgdateIsNull() {
            addCriterion("msgDate is null");
            return (Criteria) this;
        }

        public Criteria andMsgdateIsNotNull() {
            addCriterion("msgDate is not null");
            return (Criteria) this;
        }

        public Criteria andMsgdateEqualTo(Date value) {
            addCriterion("msgDate =", value, "msgdate");
            return (Criteria) this;
        }

        public Criteria andMsgdateNotEqualTo(Date value) {
            addCriterion("msgDate <>", value, "msgdate");
            return (Criteria) this;
        }

        public Criteria andMsgdateGreaterThan(Date value) {
            addCriterion("msgDate >", value, "msgdate");
            return (Criteria) this;
        }

        public Criteria andMsgdateGreaterThanOrEqualTo(Date value) {
            addCriterion("msgDate >=", value, "msgdate");
            return (Criteria) this;
        }

        public Criteria andMsgdateLessThan(Date value) {
            addCriterion("msgDate <", value, "msgdate");
            return (Criteria) this;
        }

        public Criteria andMsgdateLessThanOrEqualTo(Date value) {
            addCriterion("msgDate <=", value, "msgdate");
            return (Criteria) this;
        }

        public Criteria andMsgdateIn(List<Date> values) {
            addCriterion("msgDate in", values, "msgdate");
            return (Criteria) this;
        }

        public Criteria andMsgdateNotIn(List<Date> values) {
            addCriterion("msgDate not in", values, "msgdate");
            return (Criteria) this;
        }

        public Criteria andMsgdateBetween(Date value1, Date value2) {
            addCriterion("msgDate between", value1, value2, "msgdate");
            return (Criteria) this;
        }

        public Criteria andMsgdateNotBetween(Date value1, Date value2) {
            addCriterion("msgDate not between", value1, value2, "msgdate");
            return (Criteria) this;
        }

        public Criteria andReplycontentIsNull() {
            addCriterion("replyContent is null");
            return (Criteria) this;
        }

        public Criteria andReplycontentIsNotNull() {
            addCriterion("replyContent is not null");
            return (Criteria) this;
        }

        public Criteria andReplycontentEqualTo(String value) {
            addCriterion("replyContent =", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentNotEqualTo(String value) {
            addCriterion("replyContent <>", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentGreaterThan(String value) {
            addCriterion("replyContent >", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentGreaterThanOrEqualTo(String value) {
            addCriterion("replyContent >=", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentLessThan(String value) {
            addCriterion("replyContent <", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentLessThanOrEqualTo(String value) {
            addCriterion("replyContent <=", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentLike(String value) {
            addCriterion("replyContent like", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentNotLike(String value) {
            addCriterion("replyContent not like", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentIn(List<String> values) {
            addCriterion("replyContent in", values, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentNotIn(List<String> values) {
            addCriterion("replyContent not in", values, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentBetween(String value1, String value2) {
            addCriterion("replyContent between", value1, value2, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentNotBetween(String value1, String value2) {
            addCriterion("replyContent not between", value1, value2, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontent1IsNull() {
            addCriterion("replyContent1 is null");
            return (Criteria) this;
        }

        public Criteria andReplycontent1IsNotNull() {
            addCriterion("replyContent1 is not null");
            return (Criteria) this;
        }

        public Criteria andReplycontent1EqualTo(String value) {
            addCriterion("replyContent1 =", value, "replycontent1");
            return (Criteria) this;
        }

        public Criteria andReplycontent1NotEqualTo(String value) {
            addCriterion("replyContent1 <>", value, "replycontent1");
            return (Criteria) this;
        }

        public Criteria andReplycontent1GreaterThan(String value) {
            addCriterion("replyContent1 >", value, "replycontent1");
            return (Criteria) this;
        }

        public Criteria andReplycontent1GreaterThanOrEqualTo(String value) {
            addCriterion("replyContent1 >=", value, "replycontent1");
            return (Criteria) this;
        }

        public Criteria andReplycontent1LessThan(String value) {
            addCriterion("replyContent1 <", value, "replycontent1");
            return (Criteria) this;
        }

        public Criteria andReplycontent1LessThanOrEqualTo(String value) {
            addCriterion("replyContent1 <=", value, "replycontent1");
            return (Criteria) this;
        }

        public Criteria andReplycontent1Like(String value) {
            addCriterion("replyContent1 like", value, "replycontent1");
            return (Criteria) this;
        }

        public Criteria andReplycontent1NotLike(String value) {
            addCriterion("replyContent1 not like", value, "replycontent1");
            return (Criteria) this;
        }

        public Criteria andReplycontent1In(List<String> values) {
            addCriterion("replyContent1 in", values, "replycontent1");
            return (Criteria) this;
        }

        public Criteria andReplycontent1NotIn(List<String> values) {
            addCriterion("replyContent1 not in", values, "replycontent1");
            return (Criteria) this;
        }

        public Criteria andReplycontent1Between(String value1, String value2) {
            addCriterion("replyContent1 between", value1, value2, "replycontent1");
            return (Criteria) this;
        }

        public Criteria andReplycontent1NotBetween(String value1, String value2) {
            addCriterion("replyContent1 not between", value1, value2, "replycontent1");
            return (Criteria) this;
        }

        public Criteria andReplycontent12IsNull() {
            addCriterion("replyContent1_2 is null");
            return (Criteria) this;
        }

        public Criteria andReplycontent12IsNotNull() {
            addCriterion("replyContent1_2 is not null");
            return (Criteria) this;
        }

        public Criteria andReplycontent12EqualTo(String value) {
            addCriterion("replyContent1_2 =", value, "replycontent12");
            return (Criteria) this;
        }

        public Criteria andReplycontent12NotEqualTo(String value) {
            addCriterion("replyContent1_2 <>", value, "replycontent12");
            return (Criteria) this;
        }

        public Criteria andReplycontent12GreaterThan(String value) {
            addCriterion("replyContent1_2 >", value, "replycontent12");
            return (Criteria) this;
        }

        public Criteria andReplycontent12GreaterThanOrEqualTo(String value) {
            addCriterion("replyContent1_2 >=", value, "replycontent12");
            return (Criteria) this;
        }

        public Criteria andReplycontent12LessThan(String value) {
            addCriterion("replyContent1_2 <", value, "replycontent12");
            return (Criteria) this;
        }

        public Criteria andReplycontent12LessThanOrEqualTo(String value) {
            addCriterion("replyContent1_2 <=", value, "replycontent12");
            return (Criteria) this;
        }

        public Criteria andReplycontent12Like(String value) {
            addCriterion("replyContent1_2 like", value, "replycontent12");
            return (Criteria) this;
        }

        public Criteria andReplycontent12NotLike(String value) {
            addCriterion("replyContent1_2 not like", value, "replycontent12");
            return (Criteria) this;
        }

        public Criteria andReplycontent12In(List<String> values) {
            addCriterion("replyContent1_2 in", values, "replycontent12");
            return (Criteria) this;
        }

        public Criteria andReplycontent12NotIn(List<String> values) {
            addCriterion("replyContent1_2 not in", values, "replycontent12");
            return (Criteria) this;
        }

        public Criteria andReplycontent12Between(String value1, String value2) {
            addCriterion("replyContent1_2 between", value1, value2, "replycontent12");
            return (Criteria) this;
        }

        public Criteria andReplycontent12NotBetween(String value1, String value2) {
            addCriterion("replyContent1_2 not between", value1, value2, "replycontent12");
            return (Criteria) this;
        }

        public Criteria andReplycontent2IsNull() {
            addCriterion("replyContent2 is null");
            return (Criteria) this;
        }

        public Criteria andReplycontent2IsNotNull() {
            addCriterion("replyContent2 is not null");
            return (Criteria) this;
        }

        public Criteria andReplycontent2EqualTo(String value) {
            addCriterion("replyContent2 =", value, "replycontent2");
            return (Criteria) this;
        }

        public Criteria andReplycontent2NotEqualTo(String value) {
            addCriterion("replyContent2 <>", value, "replycontent2");
            return (Criteria) this;
        }

        public Criteria andReplycontent2GreaterThan(String value) {
            addCriterion("replyContent2 >", value, "replycontent2");
            return (Criteria) this;
        }

        public Criteria andReplycontent2GreaterThanOrEqualTo(String value) {
            addCriterion("replyContent2 >=", value, "replycontent2");
            return (Criteria) this;
        }

        public Criteria andReplycontent2LessThan(String value) {
            addCriterion("replyContent2 <", value, "replycontent2");
            return (Criteria) this;
        }

        public Criteria andReplycontent2LessThanOrEqualTo(String value) {
            addCriterion("replyContent2 <=", value, "replycontent2");
            return (Criteria) this;
        }

        public Criteria andReplycontent2Like(String value) {
            addCriterion("replyContent2 like", value, "replycontent2");
            return (Criteria) this;
        }

        public Criteria andReplycontent2NotLike(String value) {
            addCriterion("replyContent2 not like", value, "replycontent2");
            return (Criteria) this;
        }

        public Criteria andReplycontent2In(List<String> values) {
            addCriterion("replyContent2 in", values, "replycontent2");
            return (Criteria) this;
        }

        public Criteria andReplycontent2NotIn(List<String> values) {
            addCriterion("replyContent2 not in", values, "replycontent2");
            return (Criteria) this;
        }

        public Criteria andReplycontent2Between(String value1, String value2) {
            addCriterion("replyContent2 between", value1, value2, "replycontent2");
            return (Criteria) this;
        }

        public Criteria andReplycontent2NotBetween(String value1, String value2) {
            addCriterion("replyContent2 not between", value1, value2, "replycontent2");
            return (Criteria) this;
        }

        public Criteria andReplydateIsNull() {
            addCriterion("replyDate is null");
            return (Criteria) this;
        }

        public Criteria andReplydateIsNotNull() {
            addCriterion("replyDate is not null");
            return (Criteria) this;
        }

        public Criteria andReplydateEqualTo(Date value) {
            addCriterion("replyDate =", value, "replydate");
            return (Criteria) this;
        }

        public Criteria andReplydateNotEqualTo(Date value) {
            addCriterion("replyDate <>", value, "replydate");
            return (Criteria) this;
        }

        public Criteria andReplydateGreaterThan(Date value) {
            addCriterion("replyDate >", value, "replydate");
            return (Criteria) this;
        }

        public Criteria andReplydateGreaterThanOrEqualTo(Date value) {
            addCriterion("replyDate >=", value, "replydate");
            return (Criteria) this;
        }

        public Criteria andReplydateLessThan(Date value) {
            addCriterion("replyDate <", value, "replydate");
            return (Criteria) this;
        }

        public Criteria andReplydateLessThanOrEqualTo(Date value) {
            addCriterion("replyDate <=", value, "replydate");
            return (Criteria) this;
        }

        public Criteria andReplydateIn(List<Date> values) {
            addCriterion("replyDate in", values, "replydate");
            return (Criteria) this;
        }

        public Criteria andReplydateNotIn(List<Date> values) {
            addCriterion("replyDate not in", values, "replydate");
            return (Criteria) this;
        }

        public Criteria andReplydateBetween(Date value1, Date value2) {
            addCriterion("replyDate between", value1, value2, "replydate");
            return (Criteria) this;
        }

        public Criteria andReplydateNotBetween(Date value1, Date value2) {
            addCriterion("replyDate not between", value1, value2, "replydate");
            return (Criteria) this;
        }

        public Criteria andReplynameIsNull() {
            addCriterion("replyName is null");
            return (Criteria) this;
        }

        public Criteria andReplynameIsNotNull() {
            addCriterion("replyName is not null");
            return (Criteria) this;
        }

        public Criteria andReplynameEqualTo(String value) {
            addCriterion("replyName =", value, "replyname");
            return (Criteria) this;
        }

        public Criteria andReplynameNotEqualTo(String value) {
            addCriterion("replyName <>", value, "replyname");
            return (Criteria) this;
        }

        public Criteria andReplynameGreaterThan(String value) {
            addCriterion("replyName >", value, "replyname");
            return (Criteria) this;
        }

        public Criteria andReplynameGreaterThanOrEqualTo(String value) {
            addCriterion("replyName >=", value, "replyname");
            return (Criteria) this;
        }

        public Criteria andReplynameLessThan(String value) {
            addCriterion("replyName <", value, "replyname");
            return (Criteria) this;
        }

        public Criteria andReplynameLessThanOrEqualTo(String value) {
            addCriterion("replyName <=", value, "replyname");
            return (Criteria) this;
        }

        public Criteria andReplynameLike(String value) {
            addCriterion("replyName like", value, "replyname");
            return (Criteria) this;
        }

        public Criteria andReplynameNotLike(String value) {
            addCriterion("replyName not like", value, "replyname");
            return (Criteria) this;
        }

        public Criteria andReplynameIn(List<String> values) {
            addCriterion("replyName in", values, "replyname");
            return (Criteria) this;
        }

        public Criteria andReplynameNotIn(List<String> values) {
            addCriterion("replyName not in", values, "replyname");
            return (Criteria) this;
        }

        public Criteria andReplynameBetween(String value1, String value2) {
            addCriterion("replyName between", value1, value2, "replyname");
            return (Criteria) this;
        }

        public Criteria andReplynameNotBetween(String value1, String value2) {
            addCriterion("replyName not between", value1, value2, "replyname");
            return (Criteria) this;
        }

        public Criteria andReplydate1IsNull() {
            addCriterion("replyDate1 is null");
            return (Criteria) this;
        }

        public Criteria andReplydate1IsNotNull() {
            addCriterion("replyDate1 is not null");
            return (Criteria) this;
        }

        public Criteria andReplydate1EqualTo(Date value) {
            addCriterion("replyDate1 =", value, "replydate1");
            return (Criteria) this;
        }

        public Criteria andReplydate1NotEqualTo(Date value) {
            addCriterion("replyDate1 <>", value, "replydate1");
            return (Criteria) this;
        }

        public Criteria andReplydate1GreaterThan(Date value) {
            addCriterion("replyDate1 >", value, "replydate1");
            return (Criteria) this;
        }

        public Criteria andReplydate1GreaterThanOrEqualTo(Date value) {
            addCriterion("replyDate1 >=", value, "replydate1");
            return (Criteria) this;
        }

        public Criteria andReplydate1LessThan(Date value) {
            addCriterion("replyDate1 <", value, "replydate1");
            return (Criteria) this;
        }

        public Criteria andReplydate1LessThanOrEqualTo(Date value) {
            addCriterion("replyDate1 <=", value, "replydate1");
            return (Criteria) this;
        }

        public Criteria andReplydate1In(List<Date> values) {
            addCriterion("replyDate1 in", values, "replydate1");
            return (Criteria) this;
        }

        public Criteria andReplydate1NotIn(List<Date> values) {
            addCriterion("replyDate1 not in", values, "replydate1");
            return (Criteria) this;
        }

        public Criteria andReplydate1Between(Date value1, Date value2) {
            addCriterion("replyDate1 between", value1, value2, "replydate1");
            return (Criteria) this;
        }

        public Criteria andReplydate1NotBetween(Date value1, Date value2) {
            addCriterion("replyDate1 not between", value1, value2, "replydate1");
            return (Criteria) this;
        }

        public Criteria andReplyname1IsNull() {
            addCriterion("replyName1 is null");
            return (Criteria) this;
        }

        public Criteria andReplyname1IsNotNull() {
            addCriterion("replyName1 is not null");
            return (Criteria) this;
        }

        public Criteria andReplyname1EqualTo(String value) {
            addCriterion("replyName1 =", value, "replyname1");
            return (Criteria) this;
        }

        public Criteria andReplyname1NotEqualTo(String value) {
            addCriterion("replyName1 <>", value, "replyname1");
            return (Criteria) this;
        }

        public Criteria andReplyname1GreaterThan(String value) {
            addCriterion("replyName1 >", value, "replyname1");
            return (Criteria) this;
        }

        public Criteria andReplyname1GreaterThanOrEqualTo(String value) {
            addCriterion("replyName1 >=", value, "replyname1");
            return (Criteria) this;
        }

        public Criteria andReplyname1LessThan(String value) {
            addCriterion("replyName1 <", value, "replyname1");
            return (Criteria) this;
        }

        public Criteria andReplyname1LessThanOrEqualTo(String value) {
            addCriterion("replyName1 <=", value, "replyname1");
            return (Criteria) this;
        }

        public Criteria andReplyname1Like(String value) {
            addCriterion("replyName1 like", value, "replyname1");
            return (Criteria) this;
        }

        public Criteria andReplyname1NotLike(String value) {
            addCriterion("replyName1 not like", value, "replyname1");
            return (Criteria) this;
        }

        public Criteria andReplyname1In(List<String> values) {
            addCriterion("replyName1 in", values, "replyname1");
            return (Criteria) this;
        }

        public Criteria andReplyname1NotIn(List<String> values) {
            addCriterion("replyName1 not in", values, "replyname1");
            return (Criteria) this;
        }

        public Criteria andReplyname1Between(String value1, String value2) {
            addCriterion("replyName1 between", value1, value2, "replyname1");
            return (Criteria) this;
        }

        public Criteria andReplyname1NotBetween(String value1, String value2) {
            addCriterion("replyName1 not between", value1, value2, "replyname1");
            return (Criteria) this;
        }

        public Criteria andReplydate2IsNull() {
            addCriterion("replyDate2 is null");
            return (Criteria) this;
        }

        public Criteria andReplydate2IsNotNull() {
            addCriterion("replyDate2 is not null");
            return (Criteria) this;
        }

        public Criteria andReplydate2EqualTo(Date value) {
            addCriterion("replyDate2 =", value, "replydate2");
            return (Criteria) this;
        }

        public Criteria andReplydate2NotEqualTo(Date value) {
            addCriterion("replyDate2 <>", value, "replydate2");
            return (Criteria) this;
        }

        public Criteria andReplydate2GreaterThan(Date value) {
            addCriterion("replyDate2 >", value, "replydate2");
            return (Criteria) this;
        }

        public Criteria andReplydate2GreaterThanOrEqualTo(Date value) {
            addCriterion("replyDate2 >=", value, "replydate2");
            return (Criteria) this;
        }

        public Criteria andReplydate2LessThan(Date value) {
            addCriterion("replyDate2 <", value, "replydate2");
            return (Criteria) this;
        }

        public Criteria andReplydate2LessThanOrEqualTo(Date value) {
            addCriterion("replyDate2 <=", value, "replydate2");
            return (Criteria) this;
        }

        public Criteria andReplydate2In(List<Date> values) {
            addCriterion("replyDate2 in", values, "replydate2");
            return (Criteria) this;
        }

        public Criteria andReplydate2NotIn(List<Date> values) {
            addCriterion("replyDate2 not in", values, "replydate2");
            return (Criteria) this;
        }

        public Criteria andReplydate2Between(Date value1, Date value2) {
            addCriterion("replyDate2 between", value1, value2, "replydate2");
            return (Criteria) this;
        }

        public Criteria andReplydate2NotBetween(Date value1, Date value2) {
            addCriterion("replyDate2 not between", value1, value2, "replydate2");
            return (Criteria) this;
        }

        public Criteria andReplyname2IsNull() {
            addCriterion("replyName2 is null");
            return (Criteria) this;
        }

        public Criteria andReplyname2IsNotNull() {
            addCriterion("replyName2 is not null");
            return (Criteria) this;
        }

        public Criteria andReplyname2EqualTo(String value) {
            addCriterion("replyName2 =", value, "replyname2");
            return (Criteria) this;
        }

        public Criteria andReplyname2NotEqualTo(String value) {
            addCriterion("replyName2 <>", value, "replyname2");
            return (Criteria) this;
        }

        public Criteria andReplyname2GreaterThan(String value) {
            addCriterion("replyName2 >", value, "replyname2");
            return (Criteria) this;
        }

        public Criteria andReplyname2GreaterThanOrEqualTo(String value) {
            addCriterion("replyName2 >=", value, "replyname2");
            return (Criteria) this;
        }

        public Criteria andReplyname2LessThan(String value) {
            addCriterion("replyName2 <", value, "replyname2");
            return (Criteria) this;
        }

        public Criteria andReplyname2LessThanOrEqualTo(String value) {
            addCriterion("replyName2 <=", value, "replyname2");
            return (Criteria) this;
        }

        public Criteria andReplyname2Like(String value) {
            addCriterion("replyName2 like", value, "replyname2");
            return (Criteria) this;
        }

        public Criteria andReplyname2NotLike(String value) {
            addCriterion("replyName2 not like", value, "replyname2");
            return (Criteria) this;
        }

        public Criteria andReplyname2In(List<String> values) {
            addCriterion("replyName2 in", values, "replyname2");
            return (Criteria) this;
        }

        public Criteria andReplyname2NotIn(List<String> values) {
            addCriterion("replyName2 not in", values, "replyname2");
            return (Criteria) this;
        }

        public Criteria andReplyname2Between(String value1, String value2) {
            addCriterion("replyName2 between", value1, value2, "replyname2");
            return (Criteria) this;
        }

        public Criteria andReplyname2NotBetween(String value1, String value2) {
            addCriterion("replyName2 not between", value1, value2, "replyname2");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIsNull() {
            addCriterion("orgCode is null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIsNotNull() {
            addCriterion("orgCode is not null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeEqualTo(String value) {
            addCriterion("orgCode =", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotEqualTo(String value) {
            addCriterion("orgCode <>", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThan(String value) {
            addCriterion("orgCode >", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThanOrEqualTo(String value) {
            addCriterion("orgCode >=", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThan(String value) {
            addCriterion("orgCode <", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThanOrEqualTo(String value) {
            addCriterion("orgCode <=", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLike(String value) {
            addCriterion("orgCode like", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotLike(String value) {
            addCriterion("orgCode not like", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIn(List<String> values) {
            addCriterion("orgCode in", values, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotIn(List<String> values) {
            addCriterion("orgCode not in", values, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeBetween(String value1, String value2) {
            addCriterion("orgCode between", value1, value2, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotBetween(String value1, String value2) {
            addCriterion("orgCode not between", value1, value2, "orgcode");
            return (Criteria) this;
        }

        public Criteria andIspublicityIsNull() {
            addCriterion("isPublicity is null");
            return (Criteria) this;
        }

        public Criteria andIspublicityIsNotNull() {
            addCriterion("isPublicity is not null");
            return (Criteria) this;
        }

        public Criteria andIspublicityEqualTo(Integer value) {
            addCriterion("isPublicity =", value, "ispublicity");
            return (Criteria) this;
        }

        public Criteria andIspublicityNotEqualTo(Integer value) {
            addCriterion("isPublicity <>", value, "ispublicity");
            return (Criteria) this;
        }

        public Criteria andIspublicityGreaterThan(Integer value) {
            addCriterion("isPublicity >", value, "ispublicity");
            return (Criteria) this;
        }

        public Criteria andIspublicityGreaterThanOrEqualTo(Integer value) {
            addCriterion("isPublicity >=", value, "ispublicity");
            return (Criteria) this;
        }

        public Criteria andIspublicityLessThan(Integer value) {
            addCriterion("isPublicity <", value, "ispublicity");
            return (Criteria) this;
        }

        public Criteria andIspublicityLessThanOrEqualTo(Integer value) {
            addCriterion("isPublicity <=", value, "ispublicity");
            return (Criteria) this;
        }

        public Criteria andIspublicityIn(List<Integer> values) {
            addCriterion("isPublicity in", values, "ispublicity");
            return (Criteria) this;
        }

        public Criteria andIspublicityNotIn(List<Integer> values) {
            addCriterion("isPublicity not in", values, "ispublicity");
            return (Criteria) this;
        }

        public Criteria andIspublicityBetween(Integer value1, Integer value2) {
            addCriterion("isPublicity between", value1, value2, "ispublicity");
            return (Criteria) this;
        }

        public Criteria andIspublicityNotBetween(Integer value1, Integer value2) {
            addCriterion("isPublicity not between", value1, value2, "ispublicity");
            return (Criteria) this;
        }

        public Criteria andIssmsreplyIsNull() {
            addCriterion("IsSMSReply is null");
            return (Criteria) this;
        }

        public Criteria andIssmsreplyIsNotNull() {
            addCriterion("IsSMSReply is not null");
            return (Criteria) this;
        }

        public Criteria andIssmsreplyEqualTo(Integer value) {
            addCriterion("IsSMSReply =", value, "issmsreply");
            return (Criteria) this;
        }

        public Criteria andIssmsreplyNotEqualTo(Integer value) {
            addCriterion("IsSMSReply <>", value, "issmsreply");
            return (Criteria) this;
        }

        public Criteria andIssmsreplyGreaterThan(Integer value) {
            addCriterion("IsSMSReply >", value, "issmsreply");
            return (Criteria) this;
        }

        public Criteria andIssmsreplyGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsSMSReply >=", value, "issmsreply");
            return (Criteria) this;
        }

        public Criteria andIssmsreplyLessThan(Integer value) {
            addCriterion("IsSMSReply <", value, "issmsreply");
            return (Criteria) this;
        }

        public Criteria andIssmsreplyLessThanOrEqualTo(Integer value) {
            addCriterion("IsSMSReply <=", value, "issmsreply");
            return (Criteria) this;
        }

        public Criteria andIssmsreplyIn(List<Integer> values) {
            addCriterion("IsSMSReply in", values, "issmsreply");
            return (Criteria) this;
        }

        public Criteria andIssmsreplyNotIn(List<Integer> values) {
            addCriterion("IsSMSReply not in", values, "issmsreply");
            return (Criteria) this;
        }

        public Criteria andIssmsreplyBetween(Integer value1, Integer value2) {
            addCriterion("IsSMSReply between", value1, value2, "issmsreply");
            return (Criteria) this;
        }

        public Criteria andIssmsreplyNotBetween(Integer value1, Integer value2) {
            addCriterion("IsSMSReply not between", value1, value2, "issmsreply");
            return (Criteria) this;
        }

        public Criteria andIsreplyIsNull() {
            addCriterion("isReply is null");
            return (Criteria) this;
        }

        public Criteria andIsreplyIsNotNull() {
            addCriterion("isReply is not null");
            return (Criteria) this;
        }

        public Criteria andIsreplyEqualTo(Integer value) {
            addCriterion("isReply =", value, "isreply");
            return (Criteria) this;
        }

        public Criteria andIsreplyNotEqualTo(Integer value) {
            addCriterion("isReply <>", value, "isreply");
            return (Criteria) this;
        }

        public Criteria andIsreplyGreaterThan(Integer value) {
            addCriterion("isReply >", value, "isreply");
            return (Criteria) this;
        }

        public Criteria andIsreplyGreaterThanOrEqualTo(Integer value) {
            addCriterion("isReply >=", value, "isreply");
            return (Criteria) this;
        }

        public Criteria andIsreplyLessThan(Integer value) {
            addCriterion("isReply <", value, "isreply");
            return (Criteria) this;
        }

        public Criteria andIsreplyLessThanOrEqualTo(Integer value) {
            addCriterion("isReply <=", value, "isreply");
            return (Criteria) this;
        }

        public Criteria andIsreplyIn(List<Integer> values) {
            addCriterion("isReply in", values, "isreply");
            return (Criteria) this;
        }

        public Criteria andIsreplyNotIn(List<Integer> values) {
            addCriterion("isReply not in", values, "isreply");
            return (Criteria) this;
        }

        public Criteria andIsreplyBetween(Integer value1, Integer value2) {
            addCriterion("isReply between", value1, value2, "isreply");
            return (Criteria) this;
        }

        public Criteria andIsreplyNotBetween(Integer value1, Integer value2) {
            addCriterion("isReply not between", value1, value2, "isreply");
            return (Criteria) this;
        }

        public Criteria andMailtypeIsNull() {
            addCriterion("mailType is null");
            return (Criteria) this;
        }

        public Criteria andMailtypeIsNotNull() {
            addCriterion("mailType is not null");
            return (Criteria) this;
        }

        public Criteria andMailtypeEqualTo(Integer value) {
            addCriterion("mailType =", value, "mailtype");
            return (Criteria) this;
        }

        public Criteria andMailtypeNotEqualTo(Integer value) {
            addCriterion("mailType <>", value, "mailtype");
            return (Criteria) this;
        }

        public Criteria andMailtypeGreaterThan(Integer value) {
            addCriterion("mailType >", value, "mailtype");
            return (Criteria) this;
        }

        public Criteria andMailtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("mailType >=", value, "mailtype");
            return (Criteria) this;
        }

        public Criteria andMailtypeLessThan(Integer value) {
            addCriterion("mailType <", value, "mailtype");
            return (Criteria) this;
        }

        public Criteria andMailtypeLessThanOrEqualTo(Integer value) {
            addCriterion("mailType <=", value, "mailtype");
            return (Criteria) this;
        }

        public Criteria andMailtypeIn(List<Integer> values) {
            addCriterion("mailType in", values, "mailtype");
            return (Criteria) this;
        }

        public Criteria andMailtypeNotIn(List<Integer> values) {
            addCriterion("mailType not in", values, "mailtype");
            return (Criteria) this;
        }

        public Criteria andMailtypeBetween(Integer value1, Integer value2) {
            addCriterion("mailType between", value1, value2, "mailtype");
            return (Criteria) this;
        }

        public Criteria andMailtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("mailType not between", value1, value2, "mailtype");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andOfficecodeIsNull() {
            addCriterion("officeCode is null");
            return (Criteria) this;
        }

        public Criteria andOfficecodeIsNotNull() {
            addCriterion("officeCode is not null");
            return (Criteria) this;
        }

        public Criteria andOfficecodeEqualTo(String value) {
            addCriterion("officeCode =", value, "officecode");
            return (Criteria) this;
        }

        public Criteria andOfficecodeNotEqualTo(String value) {
            addCriterion("officeCode <>", value, "officecode");
            return (Criteria) this;
        }

        public Criteria andOfficecodeGreaterThan(String value) {
            addCriterion("officeCode >", value, "officecode");
            return (Criteria) this;
        }

        public Criteria andOfficecodeGreaterThanOrEqualTo(String value) {
            addCriterion("officeCode >=", value, "officecode");
            return (Criteria) this;
        }

        public Criteria andOfficecodeLessThan(String value) {
            addCriterion("officeCode <", value, "officecode");
            return (Criteria) this;
        }

        public Criteria andOfficecodeLessThanOrEqualTo(String value) {
            addCriterion("officeCode <=", value, "officecode");
            return (Criteria) this;
        }

        public Criteria andOfficecodeLike(String value) {
            addCriterion("officeCode like", value, "officecode");
            return (Criteria) this;
        }

        public Criteria andOfficecodeNotLike(String value) {
            addCriterion("officeCode not like", value, "officecode");
            return (Criteria) this;
        }

        public Criteria andOfficecodeIn(List<String> values) {
            addCriterion("officeCode in", values, "officecode");
            return (Criteria) this;
        }

        public Criteria andOfficecodeNotIn(List<String> values) {
            addCriterion("officeCode not in", values, "officecode");
            return (Criteria) this;
        }

        public Criteria andOfficecodeBetween(String value1, String value2) {
            addCriterion("officeCode between", value1, value2, "officecode");
            return (Criteria) this;
        }

        public Criteria andOfficecodeNotBetween(String value1, String value2) {
            addCriterion("officeCode not between", value1, value2, "officecode");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("idCard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("idCard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("idCard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("idCard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("idCard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("idCard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("idCard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("idCard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("idCard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("idCard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("idCard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("idCard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("idCard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("idCard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andQuerycodeIsNull() {
            addCriterion("queryCode is null");
            return (Criteria) this;
        }

        public Criteria andQuerycodeIsNotNull() {
            addCriterion("queryCode is not null");
            return (Criteria) this;
        }

        public Criteria andQuerycodeEqualTo(String value) {
            addCriterion("queryCode =", value, "querycode");
            return (Criteria) this;
        }

        public Criteria andQuerycodeNotEqualTo(String value) {
            addCriterion("queryCode <>", value, "querycode");
            return (Criteria) this;
        }

        public Criteria andQuerycodeGreaterThan(String value) {
            addCriterion("queryCode >", value, "querycode");
            return (Criteria) this;
        }

        public Criteria andQuerycodeGreaterThanOrEqualTo(String value) {
            addCriterion("queryCode >=", value, "querycode");
            return (Criteria) this;
        }

        public Criteria andQuerycodeLessThan(String value) {
            addCriterion("queryCode <", value, "querycode");
            return (Criteria) this;
        }

        public Criteria andQuerycodeLessThanOrEqualTo(String value) {
            addCriterion("queryCode <=", value, "querycode");
            return (Criteria) this;
        }

        public Criteria andQuerycodeLike(String value) {
            addCriterion("queryCode like", value, "querycode");
            return (Criteria) this;
        }

        public Criteria andQuerycodeNotLike(String value) {
            addCriterion("queryCode not like", value, "querycode");
            return (Criteria) this;
        }

        public Criteria andQuerycodeIn(List<String> values) {
            addCriterion("queryCode in", values, "querycode");
            return (Criteria) this;
        }

        public Criteria andQuerycodeNotIn(List<String> values) {
            addCriterion("queryCode not in", values, "querycode");
            return (Criteria) this;
        }

        public Criteria andQuerycodeBetween(String value1, String value2) {
            addCriterion("queryCode between", value1, value2, "querycode");
            return (Criteria) this;
        }

        public Criteria andQuerycodeNotBetween(String value1, String value2) {
            addCriterion("queryCode not between", value1, value2, "querycode");
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

        public Criteria andGroupidEqualTo(Integer value) {
            addCriterion("groupId =", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotEqualTo(Integer value) {
            addCriterion("groupId <>", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThan(Integer value) {
            addCriterion("groupId >", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("groupId >=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThan(Integer value) {
            addCriterion("groupId <", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThanOrEqualTo(Integer value) {
            addCriterion("groupId <=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidIn(List<Integer> values) {
            addCriterion("groupId in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotIn(List<Integer> values) {
            addCriterion("groupId not in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidBetween(Integer value1, Integer value2) {
            addCriterion("groupId between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotBetween(Integer value1, Integer value2) {
            addCriterion("groupId not between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andClgroupidIsNull() {
            addCriterion("clgroupId is null");
            return (Criteria) this;
        }

        public Criteria andClgroupidIsNotNull() {
            addCriterion("clgroupId is not null");
            return (Criteria) this;
        }

        public Criteria andClgroupidEqualTo(Integer value) {
            addCriterion("clgroupId =", value, "clgroupid");
            return (Criteria) this;
        }

        public Criteria andClgroupidNotEqualTo(Integer value) {
            addCriterion("clgroupId <>", value, "clgroupid");
            return (Criteria) this;
        }

        public Criteria andClgroupidGreaterThan(Integer value) {
            addCriterion("clgroupId >", value, "clgroupid");
            return (Criteria) this;
        }

        public Criteria andClgroupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("clgroupId >=", value, "clgroupid");
            return (Criteria) this;
        }

        public Criteria andClgroupidLessThan(Integer value) {
            addCriterion("clgroupId <", value, "clgroupid");
            return (Criteria) this;
        }

        public Criteria andClgroupidLessThanOrEqualTo(Integer value) {
            addCriterion("clgroupId <=", value, "clgroupid");
            return (Criteria) this;
        }

        public Criteria andClgroupidIn(List<Integer> values) {
            addCriterion("clgroupId in", values, "clgroupid");
            return (Criteria) this;
        }

        public Criteria andClgroupidNotIn(List<Integer> values) {
            addCriterion("clgroupId not in", values, "clgroupid");
            return (Criteria) this;
        }

        public Criteria andClgroupidBetween(Integer value1, Integer value2) {
            addCriterion("clgroupId between", value1, value2, "clgroupid");
            return (Criteria) this;
        }

        public Criteria andClgroupidNotBetween(Integer value1, Integer value2) {
            addCriterion("clgroupId not between", value1, value2, "clgroupid");
            return (Criteria) this;
        }

        public Criteria andAttoldfilenameIsNull() {
            addCriterion("attoldfilename is null");
            return (Criteria) this;
        }

        public Criteria andAttoldfilenameIsNotNull() {
            addCriterion("attoldfilename is not null");
            return (Criteria) this;
        }

        public Criteria andAttoldfilenameEqualTo(String value) {
            addCriterion("attoldfilename =", value, "attoldfilename");
            return (Criteria) this;
        }

        public Criteria andAttoldfilenameNotEqualTo(String value) {
            addCriterion("attoldfilename <>", value, "attoldfilename");
            return (Criteria) this;
        }

        public Criteria andAttoldfilenameGreaterThan(String value) {
            addCriterion("attoldfilename >", value, "attoldfilename");
            return (Criteria) this;
        }

        public Criteria andAttoldfilenameGreaterThanOrEqualTo(String value) {
            addCriterion("attoldfilename >=", value, "attoldfilename");
            return (Criteria) this;
        }

        public Criteria andAttoldfilenameLessThan(String value) {
            addCriterion("attoldfilename <", value, "attoldfilename");
            return (Criteria) this;
        }

        public Criteria andAttoldfilenameLessThanOrEqualTo(String value) {
            addCriterion("attoldfilename <=", value, "attoldfilename");
            return (Criteria) this;
        }

        public Criteria andAttoldfilenameLike(String value) {
            addCriterion("attoldfilename like", value, "attoldfilename");
            return (Criteria) this;
        }

        public Criteria andAttoldfilenameNotLike(String value) {
            addCriterion("attoldfilename not like", value, "attoldfilename");
            return (Criteria) this;
        }

        public Criteria andAttoldfilenameIn(List<String> values) {
            addCriterion("attoldfilename in", values, "attoldfilename");
            return (Criteria) this;
        }

        public Criteria andAttoldfilenameNotIn(List<String> values) {
            addCriterion("attoldfilename not in", values, "attoldfilename");
            return (Criteria) this;
        }

        public Criteria andAttoldfilenameBetween(String value1, String value2) {
            addCriterion("attoldfilename between", value1, value2, "attoldfilename");
            return (Criteria) this;
        }

        public Criteria andAttoldfilenameNotBetween(String value1, String value2) {
            addCriterion("attoldfilename not between", value1, value2, "attoldfilename");
            return (Criteria) this;
        }

        public Criteria andAttpathIsNull() {
            addCriterion("attPath is null");
            return (Criteria) this;
        }

        public Criteria andAttpathIsNotNull() {
            addCriterion("attPath is not null");
            return (Criteria) this;
        }

        public Criteria andAttpathEqualTo(String value) {
            addCriterion("attPath =", value, "attpath");
            return (Criteria) this;
        }

        public Criteria andAttpathNotEqualTo(String value) {
            addCriterion("attPath <>", value, "attpath");
            return (Criteria) this;
        }

        public Criteria andAttpathGreaterThan(String value) {
            addCriterion("attPath >", value, "attpath");
            return (Criteria) this;
        }

        public Criteria andAttpathGreaterThanOrEqualTo(String value) {
            addCriterion("attPath >=", value, "attpath");
            return (Criteria) this;
        }

        public Criteria andAttpathLessThan(String value) {
            addCriterion("attPath <", value, "attpath");
            return (Criteria) this;
        }

        public Criteria andAttpathLessThanOrEqualTo(String value) {
            addCriterion("attPath <=", value, "attpath");
            return (Criteria) this;
        }

        public Criteria andAttpathLike(String value) {
            addCriterion("attPath like", value, "attpath");
            return (Criteria) this;
        }

        public Criteria andAttpathNotLike(String value) {
            addCriterion("attPath not like", value, "attpath");
            return (Criteria) this;
        }

        public Criteria andAttpathIn(List<String> values) {
            addCriterion("attPath in", values, "attpath");
            return (Criteria) this;
        }

        public Criteria andAttpathNotIn(List<String> values) {
            addCriterion("attPath not in", values, "attpath");
            return (Criteria) this;
        }

        public Criteria andAttpathBetween(String value1, String value2) {
            addCriterion("attPath between", value1, value2, "attpath");
            return (Criteria) this;
        }

        public Criteria andAttpathNotBetween(String value1, String value2) {
            addCriterion("attPath not between", value1, value2, "attpath");
            return (Criteria) this;
        }

        public Criteria andFfgroupidIsNull() {
            addCriterion("ffgroupId is null");
            return (Criteria) this;
        }

        public Criteria andFfgroupidIsNotNull() {
            addCriterion("ffgroupId is not null");
            return (Criteria) this;
        }

        public Criteria andFfgroupidEqualTo(Integer value) {
            addCriterion("ffgroupId =", value, "ffgroupid");
            return (Criteria) this;
        }

        public Criteria andFfgroupidNotEqualTo(Integer value) {
            addCriterion("ffgroupId <>", value, "ffgroupid");
            return (Criteria) this;
        }

        public Criteria andFfgroupidGreaterThan(Integer value) {
            addCriterion("ffgroupId >", value, "ffgroupid");
            return (Criteria) this;
        }

        public Criteria andFfgroupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ffgroupId >=", value, "ffgroupid");
            return (Criteria) this;
        }

        public Criteria andFfgroupidLessThan(Integer value) {
            addCriterion("ffgroupId <", value, "ffgroupid");
            return (Criteria) this;
        }

        public Criteria andFfgroupidLessThanOrEqualTo(Integer value) {
            addCriterion("ffgroupId <=", value, "ffgroupid");
            return (Criteria) this;
        }

        public Criteria andFfgroupidIn(List<Integer> values) {
            addCriterion("ffgroupId in", values, "ffgroupid");
            return (Criteria) this;
        }

        public Criteria andFfgroupidNotIn(List<Integer> values) {
            addCriterion("ffgroupId not in", values, "ffgroupid");
            return (Criteria) this;
        }

        public Criteria andFfgroupidBetween(Integer value1, Integer value2) {
            addCriterion("ffgroupId between", value1, value2, "ffgroupid");
            return (Criteria) this;
        }

        public Criteria andFfgroupidNotBetween(Integer value1, Integer value2) {
            addCriterion("ffgroupId not between", value1, value2, "ffgroupid");
            return (Criteria) this;
        }

        public Criteria andFfgroupnameIsNull() {
            addCriterion("ffgroupName is null");
            return (Criteria) this;
        }

        public Criteria andFfgroupnameIsNotNull() {
            addCriterion("ffgroupName is not null");
            return (Criteria) this;
        }

        public Criteria andFfgroupnameEqualTo(String value) {
            addCriterion("ffgroupName =", value, "ffgroupname");
            return (Criteria) this;
        }

        public Criteria andFfgroupnameNotEqualTo(String value) {
            addCriterion("ffgroupName <>", value, "ffgroupname");
            return (Criteria) this;
        }

        public Criteria andFfgroupnameGreaterThan(String value) {
            addCriterion("ffgroupName >", value, "ffgroupname");
            return (Criteria) this;
        }

        public Criteria andFfgroupnameGreaterThanOrEqualTo(String value) {
            addCriterion("ffgroupName >=", value, "ffgroupname");
            return (Criteria) this;
        }

        public Criteria andFfgroupnameLessThan(String value) {
            addCriterion("ffgroupName <", value, "ffgroupname");
            return (Criteria) this;
        }

        public Criteria andFfgroupnameLessThanOrEqualTo(String value) {
            addCriterion("ffgroupName <=", value, "ffgroupname");
            return (Criteria) this;
        }

        public Criteria andFfgroupnameLike(String value) {
            addCriterion("ffgroupName like", value, "ffgroupname");
            return (Criteria) this;
        }

        public Criteria andFfgroupnameNotLike(String value) {
            addCriterion("ffgroupName not like", value, "ffgroupname");
            return (Criteria) this;
        }

        public Criteria andFfgroupnameIn(List<String> values) {
            addCriterion("ffgroupName in", values, "ffgroupname");
            return (Criteria) this;
        }

        public Criteria andFfgroupnameNotIn(List<String> values) {
            addCriterion("ffgroupName not in", values, "ffgroupname");
            return (Criteria) this;
        }

        public Criteria andFfgroupnameBetween(String value1, String value2) {
            addCriterion("ffgroupName between", value1, value2, "ffgroupname");
            return (Criteria) this;
        }

        public Criteria andFfgroupnameNotBetween(String value1, String value2) {
            addCriterion("ffgroupName not between", value1, value2, "ffgroupname");
            return (Criteria) this;
        }

        public Criteria andFfdateIsNull() {
            addCriterion("ffDate is null");
            return (Criteria) this;
        }

        public Criteria andFfdateIsNotNull() {
            addCriterion("ffDate is not null");
            return (Criteria) this;
        }

        public Criteria andFfdateEqualTo(Date value) {
            addCriterion("ffDate =", value, "ffdate");
            return (Criteria) this;
        }

        public Criteria andFfdateNotEqualTo(Date value) {
            addCriterion("ffDate <>", value, "ffdate");
            return (Criteria) this;
        }

        public Criteria andFfdateGreaterThan(Date value) {
            addCriterion("ffDate >", value, "ffdate");
            return (Criteria) this;
        }

        public Criteria andFfdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ffDate >=", value, "ffdate");
            return (Criteria) this;
        }

        public Criteria andFfdateLessThan(Date value) {
            addCriterion("ffDate <", value, "ffdate");
            return (Criteria) this;
        }

        public Criteria andFfdateLessThanOrEqualTo(Date value) {
            addCriterion("ffDate <=", value, "ffdate");
            return (Criteria) this;
        }

        public Criteria andFfdateIn(List<Date> values) {
            addCriterion("ffDate in", values, "ffdate");
            return (Criteria) this;
        }

        public Criteria andFfdateNotIn(List<Date> values) {
            addCriterion("ffDate not in", values, "ffdate");
            return (Criteria) this;
        }

        public Criteria andFfdateBetween(Date value1, Date value2) {
            addCriterion("ffDate between", value1, value2, "ffdate");
            return (Criteria) this;
        }

        public Criteria andFfdateNotBetween(Date value1, Date value2) {
            addCriterion("ffDate not between", value1, value2, "ffdate");
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