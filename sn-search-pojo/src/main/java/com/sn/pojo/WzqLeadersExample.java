package com.sn.pojo;

import java.util.ArrayList;
import java.util.List;

public class WzqLeadersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WzqLeadersExample() {
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

        public Criteria andLeadersidIsNull() {
            addCriterion("leadersId is null");
            return (Criteria) this;
        }

        public Criteria andLeadersidIsNotNull() {
            addCriterion("leadersId is not null");
            return (Criteria) this;
        }

        public Criteria andLeadersidEqualTo(Long value) {
            addCriterion("leadersId =", value, "leadersid");
            return (Criteria) this;
        }

        public Criteria andLeadersidNotEqualTo(Long value) {
            addCriterion("leadersId <>", value, "leadersid");
            return (Criteria) this;
        }

        public Criteria andLeadersidGreaterThan(Long value) {
            addCriterion("leadersId >", value, "leadersid");
            return (Criteria) this;
        }

        public Criteria andLeadersidGreaterThanOrEqualTo(Long value) {
            addCriterion("leadersId >=", value, "leadersid");
            return (Criteria) this;
        }

        public Criteria andLeadersidLessThan(Long value) {
            addCriterion("leadersId <", value, "leadersid");
            return (Criteria) this;
        }

        public Criteria andLeadersidLessThanOrEqualTo(Long value) {
            addCriterion("leadersId <=", value, "leadersid");
            return (Criteria) this;
        }

        public Criteria andLeadersidIn(List<Long> values) {
            addCriterion("leadersId in", values, "leadersid");
            return (Criteria) this;
        }

        public Criteria andLeadersidNotIn(List<Long> values) {
            addCriterion("leadersId not in", values, "leadersid");
            return (Criteria) this;
        }

        public Criteria andLeadersidBetween(Long value1, Long value2) {
            addCriterion("leadersId between", value1, value2, "leadersid");
            return (Criteria) this;
        }

        public Criteria andLeadersidNotBetween(Long value1, Long value2) {
            addCriterion("leadersId not between", value1, value2, "leadersid");
            return (Criteria) this;
        }

        public Criteria andLeadersnameIsNull() {
            addCriterion("leadersName is null");
            return (Criteria) this;
        }

        public Criteria andLeadersnameIsNotNull() {
            addCriterion("leadersName is not null");
            return (Criteria) this;
        }

        public Criteria andLeadersnameEqualTo(String value) {
            addCriterion("leadersName =", value, "leadersname");
            return (Criteria) this;
        }

        public Criteria andLeadersnameNotEqualTo(String value) {
            addCriterion("leadersName <>", value, "leadersname");
            return (Criteria) this;
        }

        public Criteria andLeadersnameGreaterThan(String value) {
            addCriterion("leadersName >", value, "leadersname");
            return (Criteria) this;
        }

        public Criteria andLeadersnameGreaterThanOrEqualTo(String value) {
            addCriterion("leadersName >=", value, "leadersname");
            return (Criteria) this;
        }

        public Criteria andLeadersnameLessThan(String value) {
            addCriterion("leadersName <", value, "leadersname");
            return (Criteria) this;
        }

        public Criteria andLeadersnameLessThanOrEqualTo(String value) {
            addCriterion("leadersName <=", value, "leadersname");
            return (Criteria) this;
        }

        public Criteria andLeadersnameLike(String value) {
            addCriterion("leadersName like", value, "leadersname");
            return (Criteria) this;
        }

        public Criteria andLeadersnameNotLike(String value) {
            addCriterion("leadersName not like", value, "leadersname");
            return (Criteria) this;
        }

        public Criteria andLeadersnameIn(List<String> values) {
            addCriterion("leadersName in", values, "leadersname");
            return (Criteria) this;
        }

        public Criteria andLeadersnameNotIn(List<String> values) {
            addCriterion("leadersName not in", values, "leadersname");
            return (Criteria) this;
        }

        public Criteria andLeadersnameBetween(String value1, String value2) {
            addCriterion("leadersName between", value1, value2, "leadersname");
            return (Criteria) this;
        }

        public Criteria andLeadersnameNotBetween(String value1, String value2) {
            addCriterion("leadersName not between", value1, value2, "leadersname");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNull() {
            addCriterion("birthdate is null");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNotNull() {
            addCriterion("birthdate is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdateEqualTo(String value) {
            addCriterion("birthdate =", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotEqualTo(String value) {
            addCriterion("birthdate <>", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThan(String value) {
            addCriterion("birthdate >", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThanOrEqualTo(String value) {
            addCriterion("birthdate >=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThan(String value) {
            addCriterion("birthdate <", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThanOrEqualTo(String value) {
            addCriterion("birthdate <=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLike(String value) {
            addCriterion("birthdate like", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotLike(String value) {
            addCriterion("birthdate not like", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateIn(List<String> values) {
            addCriterion("birthdate in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotIn(List<String> values) {
            addCriterion("birthdate not in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateBetween(String value1, String value2) {
            addCriterion("birthdate between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotBetween(String value1, String value2) {
            addCriterion("birthdate not between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andNativeplaceIsNull() {
            addCriterion("nativeplace is null");
            return (Criteria) this;
        }

        public Criteria andNativeplaceIsNotNull() {
            addCriterion("nativeplace is not null");
            return (Criteria) this;
        }

        public Criteria andNativeplaceEqualTo(String value) {
            addCriterion("nativeplace =", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotEqualTo(String value) {
            addCriterion("nativeplace <>", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceGreaterThan(String value) {
            addCriterion("nativeplace >", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceGreaterThanOrEqualTo(String value) {
            addCriterion("nativeplace >=", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceLessThan(String value) {
            addCriterion("nativeplace <", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceLessThanOrEqualTo(String value) {
            addCriterion("nativeplace <=", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceLike(String value) {
            addCriterion("nativeplace like", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotLike(String value) {
            addCriterion("nativeplace not like", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceIn(List<String> values) {
            addCriterion("nativeplace in", values, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotIn(List<String> values) {
            addCriterion("nativeplace not in", values, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceBetween(String value1, String value2) {
            addCriterion("nativeplace between", value1, value2, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotBetween(String value1, String value2) {
            addCriterion("nativeplace not between", value1, value2, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andIncumbentIsNull() {
            addCriterion("incumbent is null");
            return (Criteria) this;
        }

        public Criteria andIncumbentIsNotNull() {
            addCriterion("incumbent is not null");
            return (Criteria) this;
        }

        public Criteria andIncumbentEqualTo(String value) {
            addCriterion("incumbent =", value, "incumbent");
            return (Criteria) this;
        }

        public Criteria andIncumbentNotEqualTo(String value) {
            addCriterion("incumbent <>", value, "incumbent");
            return (Criteria) this;
        }

        public Criteria andIncumbentGreaterThan(String value) {
            addCriterion("incumbent >", value, "incumbent");
            return (Criteria) this;
        }

        public Criteria andIncumbentGreaterThanOrEqualTo(String value) {
            addCriterion("incumbent >=", value, "incumbent");
            return (Criteria) this;
        }

        public Criteria andIncumbentLessThan(String value) {
            addCriterion("incumbent <", value, "incumbent");
            return (Criteria) this;
        }

        public Criteria andIncumbentLessThanOrEqualTo(String value) {
            addCriterion("incumbent <=", value, "incumbent");
            return (Criteria) this;
        }

        public Criteria andIncumbentLike(String value) {
            addCriterion("incumbent like", value, "incumbent");
            return (Criteria) this;
        }

        public Criteria andIncumbentNotLike(String value) {
            addCriterion("incumbent not like", value, "incumbent");
            return (Criteria) this;
        }

        public Criteria andIncumbentIn(List<String> values) {
            addCriterion("incumbent in", values, "incumbent");
            return (Criteria) this;
        }

        public Criteria andIncumbentNotIn(List<String> values) {
            addCriterion("incumbent not in", values, "incumbent");
            return (Criteria) this;
        }

        public Criteria andIncumbentBetween(String value1, String value2) {
            addCriterion("incumbent between", value1, value2, "incumbent");
            return (Criteria) this;
        }

        public Criteria andIncumbentNotBetween(String value1, String value2) {
            addCriterion("incumbent not between", value1, value2, "incumbent");
            return (Criteria) this;
        }

        public Criteria andWorkIsNull() {
            addCriterion("work is null");
            return (Criteria) this;
        }

        public Criteria andWorkIsNotNull() {
            addCriterion("work is not null");
            return (Criteria) this;
        }

        public Criteria andWorkEqualTo(String value) {
            addCriterion("work =", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkNotEqualTo(String value) {
            addCriterion("work <>", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkGreaterThan(String value) {
            addCriterion("work >", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkGreaterThanOrEqualTo(String value) {
            addCriterion("work >=", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkLessThan(String value) {
            addCriterion("work <", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkLessThanOrEqualTo(String value) {
            addCriterion("work <=", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkLike(String value) {
            addCriterion("work like", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkNotLike(String value) {
            addCriterion("work not like", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkIn(List<String> values) {
            addCriterion("work in", values, "work");
            return (Criteria) this;
        }

        public Criteria andWorkNotIn(List<String> values) {
            addCriterion("work not in", values, "work");
            return (Criteria) this;
        }

        public Criteria andWorkBetween(String value1, String value2) {
            addCriterion("work between", value1, value2, "work");
            return (Criteria) this;
        }

        public Criteria andWorkNotBetween(String value1, String value2) {
            addCriterion("work not between", value1, value2, "work");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNull() {
            addCriterion("photo is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNotNull() {
            addCriterion("photo is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoEqualTo(String value) {
            addCriterion("photo =", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotEqualTo(String value) {
            addCriterion("photo <>", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThan(String value) {
            addCriterion("photo >", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("photo >=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThan(String value) {
            addCriterion("photo <", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThanOrEqualTo(String value) {
            addCriterion("photo <=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLike(String value) {
            addCriterion("photo like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotLike(String value) {
            addCriterion("photo not like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoIn(List<String> values) {
            addCriterion("photo in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotIn(List<String> values) {
            addCriterion("photo not in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoBetween(String value1, String value2) {
            addCriterion("photo between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotBetween(String value1, String value2) {
            addCriterion("photo not between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotobigIsNull() {
            addCriterion("photobig is null");
            return (Criteria) this;
        }

        public Criteria andPhotobigIsNotNull() {
            addCriterion("photobig is not null");
            return (Criteria) this;
        }

        public Criteria andPhotobigEqualTo(String value) {
            addCriterion("photobig =", value, "photobig");
            return (Criteria) this;
        }

        public Criteria andPhotobigNotEqualTo(String value) {
            addCriterion("photobig <>", value, "photobig");
            return (Criteria) this;
        }

        public Criteria andPhotobigGreaterThan(String value) {
            addCriterion("photobig >", value, "photobig");
            return (Criteria) this;
        }

        public Criteria andPhotobigGreaterThanOrEqualTo(String value) {
            addCriterion("photobig >=", value, "photobig");
            return (Criteria) this;
        }

        public Criteria andPhotobigLessThan(String value) {
            addCriterion("photobig <", value, "photobig");
            return (Criteria) this;
        }

        public Criteria andPhotobigLessThanOrEqualTo(String value) {
            addCriterion("photobig <=", value, "photobig");
            return (Criteria) this;
        }

        public Criteria andPhotobigLike(String value) {
            addCriterion("photobig like", value, "photobig");
            return (Criteria) this;
        }

        public Criteria andPhotobigNotLike(String value) {
            addCriterion("photobig not like", value, "photobig");
            return (Criteria) this;
        }

        public Criteria andPhotobigIn(List<String> values) {
            addCriterion("photobig in", values, "photobig");
            return (Criteria) this;
        }

        public Criteria andPhotobigNotIn(List<String> values) {
            addCriterion("photobig not in", values, "photobig");
            return (Criteria) this;
        }

        public Criteria andPhotobigBetween(String value1, String value2) {
            addCriterion("photobig between", value1, value2, "photobig");
            return (Criteria) this;
        }

        public Criteria andPhotobigNotBetween(String value1, String value2) {
            addCriterion("photobig not between", value1, value2, "photobig");
            return (Criteria) this;
        }

        public Criteria andResumeIsNull() {
            addCriterion("resume is null");
            return (Criteria) this;
        }

        public Criteria andResumeIsNotNull() {
            addCriterion("resume is not null");
            return (Criteria) this;
        }

        public Criteria andResumeEqualTo(String value) {
            addCriterion("resume =", value, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeNotEqualTo(String value) {
            addCriterion("resume <>", value, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeGreaterThan(String value) {
            addCriterion("resume >", value, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeGreaterThanOrEqualTo(String value) {
            addCriterion("resume >=", value, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeLessThan(String value) {
            addCriterion("resume <", value, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeLessThanOrEqualTo(String value) {
            addCriterion("resume <=", value, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeLike(String value) {
            addCriterion("resume like", value, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeNotLike(String value) {
            addCriterion("resume not like", value, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeIn(List<String> values) {
            addCriterion("resume in", values, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeNotIn(List<String> values) {
            addCriterion("resume not in", values, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeBetween(String value1, String value2) {
            addCriterion("resume between", value1, value2, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeNotBetween(String value1, String value2) {
            addCriterion("resume not between", value1, value2, "resume");
            return (Criteria) this;
        }

        public Criteria andResumesIsNull() {
            addCriterion("resumes is null");
            return (Criteria) this;
        }

        public Criteria andResumesIsNotNull() {
            addCriterion("resumes is not null");
            return (Criteria) this;
        }

        public Criteria andResumesEqualTo(String value) {
            addCriterion("resumes =", value, "resumes");
            return (Criteria) this;
        }

        public Criteria andResumesNotEqualTo(String value) {
            addCriterion("resumes <>", value, "resumes");
            return (Criteria) this;
        }

        public Criteria andResumesGreaterThan(String value) {
            addCriterion("resumes >", value, "resumes");
            return (Criteria) this;
        }

        public Criteria andResumesGreaterThanOrEqualTo(String value) {
            addCriterion("resumes >=", value, "resumes");
            return (Criteria) this;
        }

        public Criteria andResumesLessThan(String value) {
            addCriterion("resumes <", value, "resumes");
            return (Criteria) this;
        }

        public Criteria andResumesLessThanOrEqualTo(String value) {
            addCriterion("resumes <=", value, "resumes");
            return (Criteria) this;
        }

        public Criteria andResumesLike(String value) {
            addCriterion("resumes like", value, "resumes");
            return (Criteria) this;
        }

        public Criteria andResumesNotLike(String value) {
            addCriterion("resumes not like", value, "resumes");
            return (Criteria) this;
        }

        public Criteria andResumesIn(List<String> values) {
            addCriterion("resumes in", values, "resumes");
            return (Criteria) this;
        }

        public Criteria andResumesNotIn(List<String> values) {
            addCriterion("resumes not in", values, "resumes");
            return (Criteria) this;
        }

        public Criteria andResumesBetween(String value1, String value2) {
            addCriterion("resumes between", value1, value2, "resumes");
            return (Criteria) this;
        }

        public Criteria andResumesNotBetween(String value1, String value2) {
            addCriterion("resumes not between", value1, value2, "resumes");
            return (Criteria) this;
        }

        public Criteria andOrdernubIsNull() {
            addCriterion("ordernub is null");
            return (Criteria) this;
        }

        public Criteria andOrdernubIsNotNull() {
            addCriterion("ordernub is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernubEqualTo(Integer value) {
            addCriterion("ordernub =", value, "ordernub");
            return (Criteria) this;
        }

        public Criteria andOrdernubNotEqualTo(Integer value) {
            addCriterion("ordernub <>", value, "ordernub");
            return (Criteria) this;
        }

        public Criteria andOrdernubGreaterThan(Integer value) {
            addCriterion("ordernub >", value, "ordernub");
            return (Criteria) this;
        }

        public Criteria andOrdernubGreaterThanOrEqualTo(Integer value) {
            addCriterion("ordernub >=", value, "ordernub");
            return (Criteria) this;
        }

        public Criteria andOrdernubLessThan(Integer value) {
            addCriterion("ordernub <", value, "ordernub");
            return (Criteria) this;
        }

        public Criteria andOrdernubLessThanOrEqualTo(Integer value) {
            addCriterion("ordernub <=", value, "ordernub");
            return (Criteria) this;
        }

        public Criteria andOrdernubIn(List<Integer> values) {
            addCriterion("ordernub in", values, "ordernub");
            return (Criteria) this;
        }

        public Criteria andOrdernubNotIn(List<Integer> values) {
            addCriterion("ordernub not in", values, "ordernub");
            return (Criteria) this;
        }

        public Criteria andOrdernubBetween(Integer value1, Integer value2) {
            addCriterion("ordernub between", value1, value2, "ordernub");
            return (Criteria) this;
        }

        public Criteria andOrdernubNotBetween(Integer value1, Integer value2) {
            addCriterion("ordernub not between", value1, value2, "ordernub");
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

        public Criteria andRemark1IsNull() {
            addCriterion("remark1 is null");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNotNull() {
            addCriterion("remark1 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark1EqualTo(String value) {
            addCriterion("remark1 =", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotEqualTo(String value) {
            addCriterion("remark1 <>", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThan(String value) {
            addCriterion("remark1 >", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThanOrEqualTo(String value) {
            addCriterion("remark1 >=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThan(String value) {
            addCriterion("remark1 <", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThanOrEqualTo(String value) {
            addCriterion("remark1 <=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Like(String value) {
            addCriterion("remark1 like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotLike(String value) {
            addCriterion("remark1 not like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1In(List<String> values) {
            addCriterion("remark1 in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotIn(List<String> values) {
            addCriterion("remark1 not in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Between(String value1, String value2) {
            addCriterion("remark1 between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotBetween(String value1, String value2) {
            addCriterion("remark1 not between", value1, value2, "remark1");
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