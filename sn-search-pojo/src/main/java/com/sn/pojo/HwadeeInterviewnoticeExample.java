package com.sn.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HwadeeInterviewnoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HwadeeInterviewnoticeExample() {
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

        public Criteria andNoticeidIsNull() {
            addCriterion("noticeId is null");
            return (Criteria) this;
        }

        public Criteria andNoticeidIsNotNull() {
            addCriterion("noticeId is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeidEqualTo(Long value) {
            addCriterion("noticeId =", value, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidNotEqualTo(Long value) {
            addCriterion("noticeId <>", value, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidGreaterThan(Long value) {
            addCriterion("noticeId >", value, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidGreaterThanOrEqualTo(Long value) {
            addCriterion("noticeId >=", value, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidLessThan(Long value) {
            addCriterion("noticeId <", value, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidLessThanOrEqualTo(Long value) {
            addCriterion("noticeId <=", value, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidIn(List<Long> values) {
            addCriterion("noticeId in", values, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidNotIn(List<Long> values) {
            addCriterion("noticeId not in", values, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidBetween(Long value1, Long value2) {
            addCriterion("noticeId between", value1, value2, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidNotBetween(Long value1, Long value2) {
            addCriterion("noticeId not between", value1, value2, "noticeid");
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

        public Criteria andOnlinestateIsNull() {
            addCriterion("onlineState is null");
            return (Criteria) this;
        }

        public Criteria andOnlinestateIsNotNull() {
            addCriterion("onlineState is not null");
            return (Criteria) this;
        }

        public Criteria andOnlinestateEqualTo(Integer value) {
            addCriterion("onlineState =", value, "onlinestate");
            return (Criteria) this;
        }

        public Criteria andOnlinestateNotEqualTo(Integer value) {
            addCriterion("onlineState <>", value, "onlinestate");
            return (Criteria) this;
        }

        public Criteria andOnlinestateGreaterThan(Integer value) {
            addCriterion("onlineState >", value, "onlinestate");
            return (Criteria) this;
        }

        public Criteria andOnlinestateGreaterThanOrEqualTo(Integer value) {
            addCriterion("onlineState >=", value, "onlinestate");
            return (Criteria) this;
        }

        public Criteria andOnlinestateLessThan(Integer value) {
            addCriterion("onlineState <", value, "onlinestate");
            return (Criteria) this;
        }

        public Criteria andOnlinestateLessThanOrEqualTo(Integer value) {
            addCriterion("onlineState <=", value, "onlinestate");
            return (Criteria) this;
        }

        public Criteria andOnlinestateIn(List<Integer> values) {
            addCriterion("onlineState in", values, "onlinestate");
            return (Criteria) this;
        }

        public Criteria andOnlinestateNotIn(List<Integer> values) {
            addCriterion("onlineState not in", values, "onlinestate");
            return (Criteria) this;
        }

        public Criteria andOnlinestateBetween(Integer value1, Integer value2) {
            addCriterion("onlineState between", value1, value2, "onlinestate");
            return (Criteria) this;
        }

        public Criteria andOnlinestateNotBetween(Integer value1, Integer value2) {
            addCriterion("onlineState not between", value1, value2, "onlinestate");
            return (Criteria) this;
        }

        public Criteria andOnlinedateIsNull() {
            addCriterion("onlineDate is null");
            return (Criteria) this;
        }

        public Criteria andOnlinedateIsNotNull() {
            addCriterion("onlineDate is not null");
            return (Criteria) this;
        }

        public Criteria andOnlinedateEqualTo(Date value) {
            addCriterion("onlineDate =", value, "onlinedate");
            return (Criteria) this;
        }

        public Criteria andOnlinedateNotEqualTo(Date value) {
            addCriterion("onlineDate <>", value, "onlinedate");
            return (Criteria) this;
        }

        public Criteria andOnlinedateGreaterThan(Date value) {
            addCriterion("onlineDate >", value, "onlinedate");
            return (Criteria) this;
        }

        public Criteria andOnlinedateGreaterThanOrEqualTo(Date value) {
            addCriterion("onlineDate >=", value, "onlinedate");
            return (Criteria) this;
        }

        public Criteria andOnlinedateLessThan(Date value) {
            addCriterion("onlineDate <", value, "onlinedate");
            return (Criteria) this;
        }

        public Criteria andOnlinedateLessThanOrEqualTo(Date value) {
            addCriterion("onlineDate <=", value, "onlinedate");
            return (Criteria) this;
        }

        public Criteria andOnlinedateIn(List<Date> values) {
            addCriterion("onlineDate in", values, "onlinedate");
            return (Criteria) this;
        }

        public Criteria andOnlinedateNotIn(List<Date> values) {
            addCriterion("onlineDate not in", values, "onlinedate");
            return (Criteria) this;
        }

        public Criteria andOnlinedateBetween(Date value1, Date value2) {
            addCriterion("onlineDate between", value1, value2, "onlinedate");
            return (Criteria) this;
        }

        public Criteria andOnlinedateNotBetween(Date value1, Date value2) {
            addCriterion("onlineDate not between", value1, value2, "onlinedate");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeIsNull() {
            addCriterion("onlineTime is null");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeIsNotNull() {
            addCriterion("onlineTime is not null");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeEqualTo(String value) {
            addCriterion("onlineTime =", value, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeNotEqualTo(String value) {
            addCriterion("onlineTime <>", value, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeGreaterThan(String value) {
            addCriterion("onlineTime >", value, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeGreaterThanOrEqualTo(String value) {
            addCriterion("onlineTime >=", value, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeLessThan(String value) {
            addCriterion("onlineTime <", value, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeLessThanOrEqualTo(String value) {
            addCriterion("onlineTime <=", value, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeLike(String value) {
            addCriterion("onlineTime like", value, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeNotLike(String value) {
            addCriterion("onlineTime not like", value, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeIn(List<String> values) {
            addCriterion("onlineTime in", values, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeNotIn(List<String> values) {
            addCriterion("onlineTime not in", values, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeBetween(String value1, String value2) {
            addCriterion("onlineTime between", value1, value2, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeNotBetween(String value1, String value2) {
            addCriterion("onlineTime not between", value1, value2, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlineguestIsNull() {
            addCriterion("onlineGuest is null");
            return (Criteria) this;
        }

        public Criteria andOnlineguestIsNotNull() {
            addCriterion("onlineGuest is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineguestEqualTo(String value) {
            addCriterion("onlineGuest =", value, "onlineguest");
            return (Criteria) this;
        }

        public Criteria andOnlineguestNotEqualTo(String value) {
            addCriterion("onlineGuest <>", value, "onlineguest");
            return (Criteria) this;
        }

        public Criteria andOnlineguestGreaterThan(String value) {
            addCriterion("onlineGuest >", value, "onlineguest");
            return (Criteria) this;
        }

        public Criteria andOnlineguestGreaterThanOrEqualTo(String value) {
            addCriterion("onlineGuest >=", value, "onlineguest");
            return (Criteria) this;
        }

        public Criteria andOnlineguestLessThan(String value) {
            addCriterion("onlineGuest <", value, "onlineguest");
            return (Criteria) this;
        }

        public Criteria andOnlineguestLessThanOrEqualTo(String value) {
            addCriterion("onlineGuest <=", value, "onlineguest");
            return (Criteria) this;
        }

        public Criteria andOnlineguestLike(String value) {
            addCriterion("onlineGuest like", value, "onlineguest");
            return (Criteria) this;
        }

        public Criteria andOnlineguestNotLike(String value) {
            addCriterion("onlineGuest not like", value, "onlineguest");
            return (Criteria) this;
        }

        public Criteria andOnlineguestIn(List<String> values) {
            addCriterion("onlineGuest in", values, "onlineguest");
            return (Criteria) this;
        }

        public Criteria andOnlineguestNotIn(List<String> values) {
            addCriterion("onlineGuest not in", values, "onlineguest");
            return (Criteria) this;
        }

        public Criteria andOnlineguestBetween(String value1, String value2) {
            addCriterion("onlineGuest between", value1, value2, "onlineguest");
            return (Criteria) this;
        }

        public Criteria andOnlineguestNotBetween(String value1, String value2) {
            addCriterion("onlineGuest not between", value1, value2, "onlineguest");
            return (Criteria) this;
        }

        public Criteria andOnlinetitleIsNull() {
            addCriterion("onlineTitle is null");
            return (Criteria) this;
        }

        public Criteria andOnlinetitleIsNotNull() {
            addCriterion("onlineTitle is not null");
            return (Criteria) this;
        }

        public Criteria andOnlinetitleEqualTo(String value) {
            addCriterion("onlineTitle =", value, "onlinetitle");
            return (Criteria) this;
        }

        public Criteria andOnlinetitleNotEqualTo(String value) {
            addCriterion("onlineTitle <>", value, "onlinetitle");
            return (Criteria) this;
        }

        public Criteria andOnlinetitleGreaterThan(String value) {
            addCriterion("onlineTitle >", value, "onlinetitle");
            return (Criteria) this;
        }

        public Criteria andOnlinetitleGreaterThanOrEqualTo(String value) {
            addCriterion("onlineTitle >=", value, "onlinetitle");
            return (Criteria) this;
        }

        public Criteria andOnlinetitleLessThan(String value) {
            addCriterion("onlineTitle <", value, "onlinetitle");
            return (Criteria) this;
        }

        public Criteria andOnlinetitleLessThanOrEqualTo(String value) {
            addCriterion("onlineTitle <=", value, "onlinetitle");
            return (Criteria) this;
        }

        public Criteria andOnlinetitleLike(String value) {
            addCriterion("onlineTitle like", value, "onlinetitle");
            return (Criteria) this;
        }

        public Criteria andOnlinetitleNotLike(String value) {
            addCriterion("onlineTitle not like", value, "onlinetitle");
            return (Criteria) this;
        }

        public Criteria andOnlinetitleIn(List<String> values) {
            addCriterion("onlineTitle in", values, "onlinetitle");
            return (Criteria) this;
        }

        public Criteria andOnlinetitleNotIn(List<String> values) {
            addCriterion("onlineTitle not in", values, "onlinetitle");
            return (Criteria) this;
        }

        public Criteria andOnlinetitleBetween(String value1, String value2) {
            addCriterion("onlineTitle between", value1, value2, "onlinetitle");
            return (Criteria) this;
        }

        public Criteria andOnlinetitleNotBetween(String value1, String value2) {
            addCriterion("onlineTitle not between", value1, value2, "onlinetitle");
            return (Criteria) this;
        }

        public Criteria andOnlinedepartIsNull() {
            addCriterion("onlineDepart is null");
            return (Criteria) this;
        }

        public Criteria andOnlinedepartIsNotNull() {
            addCriterion("onlineDepart is not null");
            return (Criteria) this;
        }

        public Criteria andOnlinedepartEqualTo(String value) {
            addCriterion("onlineDepart =", value, "onlinedepart");
            return (Criteria) this;
        }

        public Criteria andOnlinedepartNotEqualTo(String value) {
            addCriterion("onlineDepart <>", value, "onlinedepart");
            return (Criteria) this;
        }

        public Criteria andOnlinedepartGreaterThan(String value) {
            addCriterion("onlineDepart >", value, "onlinedepart");
            return (Criteria) this;
        }

        public Criteria andOnlinedepartGreaterThanOrEqualTo(String value) {
            addCriterion("onlineDepart >=", value, "onlinedepart");
            return (Criteria) this;
        }

        public Criteria andOnlinedepartLessThan(String value) {
            addCriterion("onlineDepart <", value, "onlinedepart");
            return (Criteria) this;
        }

        public Criteria andOnlinedepartLessThanOrEqualTo(String value) {
            addCriterion("onlineDepart <=", value, "onlinedepart");
            return (Criteria) this;
        }

        public Criteria andOnlinedepartLike(String value) {
            addCriterion("onlineDepart like", value, "onlinedepart");
            return (Criteria) this;
        }

        public Criteria andOnlinedepartNotLike(String value) {
            addCriterion("onlineDepart not like", value, "onlinedepart");
            return (Criteria) this;
        }

        public Criteria andOnlinedepartIn(List<String> values) {
            addCriterion("onlineDepart in", values, "onlinedepart");
            return (Criteria) this;
        }

        public Criteria andOnlinedepartNotIn(List<String> values) {
            addCriterion("onlineDepart not in", values, "onlinedepart");
            return (Criteria) this;
        }

        public Criteria andOnlinedepartBetween(String value1, String value2) {
            addCriterion("onlineDepart between", value1, value2, "onlinedepart");
            return (Criteria) this;
        }

        public Criteria andOnlinedepartNotBetween(String value1, String value2) {
            addCriterion("onlineDepart not between", value1, value2, "onlinedepart");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNull() {
            addCriterion("imgUrl is null");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNotNull() {
            addCriterion("imgUrl is not null");
            return (Criteria) this;
        }

        public Criteria andImgurlEqualTo(String value) {
            addCriterion("imgUrl =", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotEqualTo(String value) {
            addCriterion("imgUrl <>", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThan(String value) {
            addCriterion("imgUrl >", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("imgUrl >=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThan(String value) {
            addCriterion("imgUrl <", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThanOrEqualTo(String value) {
            addCriterion("imgUrl <=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLike(String value) {
            addCriterion("imgUrl like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotLike(String value) {
            addCriterion("imgUrl not like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlIn(List<String> values) {
            addCriterion("imgUrl in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotIn(List<String> values) {
            addCriterion("imgUrl not in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlBetween(String value1, String value2) {
            addCriterion("imgUrl between", value1, value2, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotBetween(String value1, String value2) {
            addCriterion("imgUrl not between", value1, value2, "imgurl");
            return (Criteria) this;
        }

        public Criteria andIspushIsNull() {
            addCriterion("isPush is null");
            return (Criteria) this;
        }

        public Criteria andIspushIsNotNull() {
            addCriterion("isPush is not null");
            return (Criteria) this;
        }

        public Criteria andIspushEqualTo(Integer value) {
            addCriterion("isPush =", value, "ispush");
            return (Criteria) this;
        }

        public Criteria andIspushNotEqualTo(Integer value) {
            addCriterion("isPush <>", value, "ispush");
            return (Criteria) this;
        }

        public Criteria andIspushGreaterThan(Integer value) {
            addCriterion("isPush >", value, "ispush");
            return (Criteria) this;
        }

        public Criteria andIspushGreaterThanOrEqualTo(Integer value) {
            addCriterion("isPush >=", value, "ispush");
            return (Criteria) this;
        }

        public Criteria andIspushLessThan(Integer value) {
            addCriterion("isPush <", value, "ispush");
            return (Criteria) this;
        }

        public Criteria andIspushLessThanOrEqualTo(Integer value) {
            addCriterion("isPush <=", value, "ispush");
            return (Criteria) this;
        }

        public Criteria andIspushIn(List<Integer> values) {
            addCriterion("isPush in", values, "ispush");
            return (Criteria) this;
        }

        public Criteria andIspushNotIn(List<Integer> values) {
            addCriterion("isPush not in", values, "ispush");
            return (Criteria) this;
        }

        public Criteria andIspushBetween(Integer value1, Integer value2) {
            addCriterion("isPush between", value1, value2, "ispush");
            return (Criteria) this;
        }

        public Criteria andIspushNotBetween(Integer value1, Integer value2) {
            addCriterion("isPush not between", value1, value2, "ispush");
            return (Criteria) this;
        }

        public Criteria andNoticetypeIsNull() {
            addCriterion("noticeType is null");
            return (Criteria) this;
        }

        public Criteria andNoticetypeIsNotNull() {
            addCriterion("noticeType is not null");
            return (Criteria) this;
        }

        public Criteria andNoticetypeEqualTo(Integer value) {
            addCriterion("noticeType =", value, "noticetype");
            return (Criteria) this;
        }

        public Criteria andNoticetypeNotEqualTo(Integer value) {
            addCriterion("noticeType <>", value, "noticetype");
            return (Criteria) this;
        }

        public Criteria andNoticetypeGreaterThan(Integer value) {
            addCriterion("noticeType >", value, "noticetype");
            return (Criteria) this;
        }

        public Criteria andNoticetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("noticeType >=", value, "noticetype");
            return (Criteria) this;
        }

        public Criteria andNoticetypeLessThan(Integer value) {
            addCriterion("noticeType <", value, "noticetype");
            return (Criteria) this;
        }

        public Criteria andNoticetypeLessThanOrEqualTo(Integer value) {
            addCriterion("noticeType <=", value, "noticetype");
            return (Criteria) this;
        }

        public Criteria andNoticetypeIn(List<Integer> values) {
            addCriterion("noticeType in", values, "noticetype");
            return (Criteria) this;
        }

        public Criteria andNoticetypeNotIn(List<Integer> values) {
            addCriterion("noticeType not in", values, "noticetype");
            return (Criteria) this;
        }

        public Criteria andNoticetypeBetween(Integer value1, Integer value2) {
            addCriterion("noticeType between", value1, value2, "noticetype");
            return (Criteria) this;
        }

        public Criteria andNoticetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("noticeType not between", value1, value2, "noticetype");
            return (Criteria) this;
        }

        public Criteria andNoticestateIsNull() {
            addCriterion("noticeState is null");
            return (Criteria) this;
        }

        public Criteria andNoticestateIsNotNull() {
            addCriterion("noticeState is not null");
            return (Criteria) this;
        }

        public Criteria andNoticestateEqualTo(Integer value) {
            addCriterion("noticeState =", value, "noticestate");
            return (Criteria) this;
        }

        public Criteria andNoticestateNotEqualTo(Integer value) {
            addCriterion("noticeState <>", value, "noticestate");
            return (Criteria) this;
        }

        public Criteria andNoticestateGreaterThan(Integer value) {
            addCriterion("noticeState >", value, "noticestate");
            return (Criteria) this;
        }

        public Criteria andNoticestateGreaterThanOrEqualTo(Integer value) {
            addCriterion("noticeState >=", value, "noticestate");
            return (Criteria) this;
        }

        public Criteria andNoticestateLessThan(Integer value) {
            addCriterion("noticeState <", value, "noticestate");
            return (Criteria) this;
        }

        public Criteria andNoticestateLessThanOrEqualTo(Integer value) {
            addCriterion("noticeState <=", value, "noticestate");
            return (Criteria) this;
        }

        public Criteria andNoticestateIn(List<Integer> values) {
            addCriterion("noticeState in", values, "noticestate");
            return (Criteria) this;
        }

        public Criteria andNoticestateNotIn(List<Integer> values) {
            addCriterion("noticeState not in", values, "noticestate");
            return (Criteria) this;
        }

        public Criteria andNoticestateBetween(Integer value1, Integer value2) {
            addCriterion("noticeState between", value1, value2, "noticestate");
            return (Criteria) this;
        }

        public Criteria andNoticestateNotBetween(Integer value1, Integer value2) {
            addCriterion("noticeState not between", value1, value2, "noticestate");
            return (Criteria) this;
        }

        public Criteria andIstopIsNull() {
            addCriterion("isTop is null");
            return (Criteria) this;
        }

        public Criteria andIstopIsNotNull() {
            addCriterion("isTop is not null");
            return (Criteria) this;
        }

        public Criteria andIstopEqualTo(Integer value) {
            addCriterion("isTop =", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotEqualTo(Integer value) {
            addCriterion("isTop <>", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopGreaterThan(Integer value) {
            addCriterion("isTop >", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopGreaterThanOrEqualTo(Integer value) {
            addCriterion("isTop >=", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopLessThan(Integer value) {
            addCriterion("isTop <", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopLessThanOrEqualTo(Integer value) {
            addCriterion("isTop <=", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopIn(List<Integer> values) {
            addCriterion("isTop in", values, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotIn(List<Integer> values) {
            addCriterion("isTop not in", values, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopBetween(Integer value1, Integer value2) {
            addCriterion("isTop between", value1, value2, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotBetween(Integer value1, Integer value2) {
            addCriterion("isTop not between", value1, value2, "istop");
            return (Criteria) this;
        }

        public Criteria andIsvalidIsNull() {
            addCriterion("isValid is null");
            return (Criteria) this;
        }

        public Criteria andIsvalidIsNotNull() {
            addCriterion("isValid is not null");
            return (Criteria) this;
        }

        public Criteria andIsvalidEqualTo(Integer value) {
            addCriterion("isValid =", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotEqualTo(Integer value) {
            addCriterion("isValid <>", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidGreaterThan(Integer value) {
            addCriterion("isValid >", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidGreaterThanOrEqualTo(Integer value) {
            addCriterion("isValid >=", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidLessThan(Integer value) {
            addCriterion("isValid <", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidLessThanOrEqualTo(Integer value) {
            addCriterion("isValid <=", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidIn(List<Integer> values) {
            addCriterion("isValid in", values, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotIn(List<Integer> values) {
            addCriterion("isValid not in", values, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidBetween(Integer value1, Integer value2) {
            addCriterion("isValid between", value1, value2, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotBetween(Integer value1, Integer value2) {
            addCriterion("isValid not between", value1, value2, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIsNull() {
            addCriterion("isDeleted is null");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIsNotNull() {
            addCriterion("isDeleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeletedEqualTo(Integer value) {
            addCriterion("isDeleted =", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotEqualTo(Integer value) {
            addCriterion("isDeleted <>", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThan(Integer value) {
            addCriterion("isDeleted >", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("isDeleted >=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThan(Integer value) {
            addCriterion("isDeleted <", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThanOrEqualTo(Integer value) {
            addCriterion("isDeleted <=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIn(List<Integer> values) {
            addCriterion("isDeleted in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotIn(List<Integer> values) {
            addCriterion("isDeleted not in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedBetween(Integer value1, Integer value2) {
            addCriterion("isDeleted between", value1, value2, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("isDeleted not between", value1, value2, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNull() {
            addCriterion("updateDate is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNotNull() {
            addCriterion("updateDate is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateEqualTo(Date value) {
            addCriterion("updateDate =", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotEqualTo(Date value) {
            addCriterion("updateDate <>", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThan(Date value) {
            addCriterion("updateDate >", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("updateDate >=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThan(Date value) {
            addCriterion("updateDate <", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThanOrEqualTo(Date value) {
            addCriterion("updateDate <=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIn(List<Date> values) {
            addCriterion("updateDate in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotIn(List<Date> values) {
            addCriterion("updateDate not in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateBetween(Date value1, Date value2) {
            addCriterion("updateDate between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotBetween(Date value1, Date value2) {
            addCriterion("updateDate not between", value1, value2, "updatedate");
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