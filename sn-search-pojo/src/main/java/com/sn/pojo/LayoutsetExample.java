package com.sn.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LayoutsetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LayoutsetExample() {
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

        public Criteria andCreatedateIsNull() {
            addCriterion("createDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("createDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("createDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("createDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("createDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("createDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("createDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("createDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("createDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("createDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("createDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andModifieddateIsNull() {
            addCriterion("modifiedDate is null");
            return (Criteria) this;
        }

        public Criteria andModifieddateIsNotNull() {
            addCriterion("modifiedDate is not null");
            return (Criteria) this;
        }

        public Criteria andModifieddateEqualTo(Date value) {
            addCriterion("modifiedDate =", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateNotEqualTo(Date value) {
            addCriterion("modifiedDate <>", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateGreaterThan(Date value) {
            addCriterion("modifiedDate >", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateGreaterThanOrEqualTo(Date value) {
            addCriterion("modifiedDate >=", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateLessThan(Date value) {
            addCriterion("modifiedDate <", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateLessThanOrEqualTo(Date value) {
            addCriterion("modifiedDate <=", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateIn(List<Date> values) {
            addCriterion("modifiedDate in", values, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateNotIn(List<Date> values) {
            addCriterion("modifiedDate not in", values, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateBetween(Date value1, Date value2) {
            addCriterion("modifiedDate between", value1, value2, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateNotBetween(Date value1, Date value2) {
            addCriterion("modifiedDate not between", value1, value2, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andPrivatelayoutIsNull() {
            addCriterion("privateLayout is null");
            return (Criteria) this;
        }

        public Criteria andPrivatelayoutIsNotNull() {
            addCriterion("privateLayout is not null");
            return (Criteria) this;
        }

        public Criteria andPrivatelayoutEqualTo(Byte value) {
            addCriterion("privateLayout =", value, "privatelayout");
            return (Criteria) this;
        }

        public Criteria andPrivatelayoutNotEqualTo(Byte value) {
            addCriterion("privateLayout <>", value, "privatelayout");
            return (Criteria) this;
        }

        public Criteria andPrivatelayoutGreaterThan(Byte value) {
            addCriterion("privateLayout >", value, "privatelayout");
            return (Criteria) this;
        }

        public Criteria andPrivatelayoutGreaterThanOrEqualTo(Byte value) {
            addCriterion("privateLayout >=", value, "privatelayout");
            return (Criteria) this;
        }

        public Criteria andPrivatelayoutLessThan(Byte value) {
            addCriterion("privateLayout <", value, "privatelayout");
            return (Criteria) this;
        }

        public Criteria andPrivatelayoutLessThanOrEqualTo(Byte value) {
            addCriterion("privateLayout <=", value, "privatelayout");
            return (Criteria) this;
        }

        public Criteria andPrivatelayoutIn(List<Byte> values) {
            addCriterion("privateLayout in", values, "privatelayout");
            return (Criteria) this;
        }

        public Criteria andPrivatelayoutNotIn(List<Byte> values) {
            addCriterion("privateLayout not in", values, "privatelayout");
            return (Criteria) this;
        }

        public Criteria andPrivatelayoutBetween(Byte value1, Byte value2) {
            addCriterion("privateLayout between", value1, value2, "privatelayout");
            return (Criteria) this;
        }

        public Criteria andPrivatelayoutNotBetween(Byte value1, Byte value2) {
            addCriterion("privateLayout not between", value1, value2, "privatelayout");
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion("logo is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("logo is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(Byte value) {
            addCriterion("logo =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(Byte value) {
            addCriterion("logo <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(Byte value) {
            addCriterion("logo >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(Byte value) {
            addCriterion("logo >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(Byte value) {
            addCriterion("logo <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(Byte value) {
            addCriterion("logo <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<Byte> values) {
            addCriterion("logo in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<Byte> values) {
            addCriterion("logo not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(Byte value1, Byte value2) {
            addCriterion("logo between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(Byte value1, Byte value2) {
            addCriterion("logo not between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoidIsNull() {
            addCriterion("logoId is null");
            return (Criteria) this;
        }

        public Criteria andLogoidIsNotNull() {
            addCriterion("logoId is not null");
            return (Criteria) this;
        }

        public Criteria andLogoidEqualTo(Long value) {
            addCriterion("logoId =", value, "logoid");
            return (Criteria) this;
        }

        public Criteria andLogoidNotEqualTo(Long value) {
            addCriterion("logoId <>", value, "logoid");
            return (Criteria) this;
        }

        public Criteria andLogoidGreaterThan(Long value) {
            addCriterion("logoId >", value, "logoid");
            return (Criteria) this;
        }

        public Criteria andLogoidGreaterThanOrEqualTo(Long value) {
            addCriterion("logoId >=", value, "logoid");
            return (Criteria) this;
        }

        public Criteria andLogoidLessThan(Long value) {
            addCriterion("logoId <", value, "logoid");
            return (Criteria) this;
        }

        public Criteria andLogoidLessThanOrEqualTo(Long value) {
            addCriterion("logoId <=", value, "logoid");
            return (Criteria) this;
        }

        public Criteria andLogoidIn(List<Long> values) {
            addCriterion("logoId in", values, "logoid");
            return (Criteria) this;
        }

        public Criteria andLogoidNotIn(List<Long> values) {
            addCriterion("logoId not in", values, "logoid");
            return (Criteria) this;
        }

        public Criteria andLogoidBetween(Long value1, Long value2) {
            addCriterion("logoId between", value1, value2, "logoid");
            return (Criteria) this;
        }

        public Criteria andLogoidNotBetween(Long value1, Long value2) {
            addCriterion("logoId not between", value1, value2, "logoid");
            return (Criteria) this;
        }

        public Criteria andThemeidIsNull() {
            addCriterion("themeId is null");
            return (Criteria) this;
        }

        public Criteria andThemeidIsNotNull() {
            addCriterion("themeId is not null");
            return (Criteria) this;
        }

        public Criteria andThemeidEqualTo(String value) {
            addCriterion("themeId =", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidNotEqualTo(String value) {
            addCriterion("themeId <>", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidGreaterThan(String value) {
            addCriterion("themeId >", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidGreaterThanOrEqualTo(String value) {
            addCriterion("themeId >=", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidLessThan(String value) {
            addCriterion("themeId <", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidLessThanOrEqualTo(String value) {
            addCriterion("themeId <=", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidLike(String value) {
            addCriterion("themeId like", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidNotLike(String value) {
            addCriterion("themeId not like", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidIn(List<String> values) {
            addCriterion("themeId in", values, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidNotIn(List<String> values) {
            addCriterion("themeId not in", values, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidBetween(String value1, String value2) {
            addCriterion("themeId between", value1, value2, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidNotBetween(String value1, String value2) {
            addCriterion("themeId not between", value1, value2, "themeid");
            return (Criteria) this;
        }

        public Criteria andColorschemeidIsNull() {
            addCriterion("colorSchemeId is null");
            return (Criteria) this;
        }

        public Criteria andColorschemeidIsNotNull() {
            addCriterion("colorSchemeId is not null");
            return (Criteria) this;
        }

        public Criteria andColorschemeidEqualTo(String value) {
            addCriterion("colorSchemeId =", value, "colorschemeid");
            return (Criteria) this;
        }

        public Criteria andColorschemeidNotEqualTo(String value) {
            addCriterion("colorSchemeId <>", value, "colorschemeid");
            return (Criteria) this;
        }

        public Criteria andColorschemeidGreaterThan(String value) {
            addCriterion("colorSchemeId >", value, "colorschemeid");
            return (Criteria) this;
        }

        public Criteria andColorschemeidGreaterThanOrEqualTo(String value) {
            addCriterion("colorSchemeId >=", value, "colorschemeid");
            return (Criteria) this;
        }

        public Criteria andColorschemeidLessThan(String value) {
            addCriterion("colorSchemeId <", value, "colorschemeid");
            return (Criteria) this;
        }

        public Criteria andColorschemeidLessThanOrEqualTo(String value) {
            addCriterion("colorSchemeId <=", value, "colorschemeid");
            return (Criteria) this;
        }

        public Criteria andColorschemeidLike(String value) {
            addCriterion("colorSchemeId like", value, "colorschemeid");
            return (Criteria) this;
        }

        public Criteria andColorschemeidNotLike(String value) {
            addCriterion("colorSchemeId not like", value, "colorschemeid");
            return (Criteria) this;
        }

        public Criteria andColorschemeidIn(List<String> values) {
            addCriterion("colorSchemeId in", values, "colorschemeid");
            return (Criteria) this;
        }

        public Criteria andColorschemeidNotIn(List<String> values) {
            addCriterion("colorSchemeId not in", values, "colorschemeid");
            return (Criteria) this;
        }

        public Criteria andColorschemeidBetween(String value1, String value2) {
            addCriterion("colorSchemeId between", value1, value2, "colorschemeid");
            return (Criteria) this;
        }

        public Criteria andColorschemeidNotBetween(String value1, String value2) {
            addCriterion("colorSchemeId not between", value1, value2, "colorschemeid");
            return (Criteria) this;
        }

        public Criteria andWapthemeidIsNull() {
            addCriterion("wapThemeId is null");
            return (Criteria) this;
        }

        public Criteria andWapthemeidIsNotNull() {
            addCriterion("wapThemeId is not null");
            return (Criteria) this;
        }

        public Criteria andWapthemeidEqualTo(String value) {
            addCriterion("wapThemeId =", value, "wapthemeid");
            return (Criteria) this;
        }

        public Criteria andWapthemeidNotEqualTo(String value) {
            addCriterion("wapThemeId <>", value, "wapthemeid");
            return (Criteria) this;
        }

        public Criteria andWapthemeidGreaterThan(String value) {
            addCriterion("wapThemeId >", value, "wapthemeid");
            return (Criteria) this;
        }

        public Criteria andWapthemeidGreaterThanOrEqualTo(String value) {
            addCriterion("wapThemeId >=", value, "wapthemeid");
            return (Criteria) this;
        }

        public Criteria andWapthemeidLessThan(String value) {
            addCriterion("wapThemeId <", value, "wapthemeid");
            return (Criteria) this;
        }

        public Criteria andWapthemeidLessThanOrEqualTo(String value) {
            addCriterion("wapThemeId <=", value, "wapthemeid");
            return (Criteria) this;
        }

        public Criteria andWapthemeidLike(String value) {
            addCriterion("wapThemeId like", value, "wapthemeid");
            return (Criteria) this;
        }

        public Criteria andWapthemeidNotLike(String value) {
            addCriterion("wapThemeId not like", value, "wapthemeid");
            return (Criteria) this;
        }

        public Criteria andWapthemeidIn(List<String> values) {
            addCriterion("wapThemeId in", values, "wapthemeid");
            return (Criteria) this;
        }

        public Criteria andWapthemeidNotIn(List<String> values) {
            addCriterion("wapThemeId not in", values, "wapthemeid");
            return (Criteria) this;
        }

        public Criteria andWapthemeidBetween(String value1, String value2) {
            addCriterion("wapThemeId between", value1, value2, "wapthemeid");
            return (Criteria) this;
        }

        public Criteria andWapthemeidNotBetween(String value1, String value2) {
            addCriterion("wapThemeId not between", value1, value2, "wapthemeid");
            return (Criteria) this;
        }

        public Criteria andWapcolorschemeidIsNull() {
            addCriterion("wapColorSchemeId is null");
            return (Criteria) this;
        }

        public Criteria andWapcolorschemeidIsNotNull() {
            addCriterion("wapColorSchemeId is not null");
            return (Criteria) this;
        }

        public Criteria andWapcolorschemeidEqualTo(String value) {
            addCriterion("wapColorSchemeId =", value, "wapcolorschemeid");
            return (Criteria) this;
        }

        public Criteria andWapcolorschemeidNotEqualTo(String value) {
            addCriterion("wapColorSchemeId <>", value, "wapcolorschemeid");
            return (Criteria) this;
        }

        public Criteria andWapcolorschemeidGreaterThan(String value) {
            addCriterion("wapColorSchemeId >", value, "wapcolorschemeid");
            return (Criteria) this;
        }

        public Criteria andWapcolorschemeidGreaterThanOrEqualTo(String value) {
            addCriterion("wapColorSchemeId >=", value, "wapcolorschemeid");
            return (Criteria) this;
        }

        public Criteria andWapcolorschemeidLessThan(String value) {
            addCriterion("wapColorSchemeId <", value, "wapcolorschemeid");
            return (Criteria) this;
        }

        public Criteria andWapcolorschemeidLessThanOrEqualTo(String value) {
            addCriterion("wapColorSchemeId <=", value, "wapcolorschemeid");
            return (Criteria) this;
        }

        public Criteria andWapcolorschemeidLike(String value) {
            addCriterion("wapColorSchemeId like", value, "wapcolorschemeid");
            return (Criteria) this;
        }

        public Criteria andWapcolorschemeidNotLike(String value) {
            addCriterion("wapColorSchemeId not like", value, "wapcolorschemeid");
            return (Criteria) this;
        }

        public Criteria andWapcolorschemeidIn(List<String> values) {
            addCriterion("wapColorSchemeId in", values, "wapcolorschemeid");
            return (Criteria) this;
        }

        public Criteria andWapcolorschemeidNotIn(List<String> values) {
            addCriterion("wapColorSchemeId not in", values, "wapcolorschemeid");
            return (Criteria) this;
        }

        public Criteria andWapcolorschemeidBetween(String value1, String value2) {
            addCriterion("wapColorSchemeId between", value1, value2, "wapcolorschemeid");
            return (Criteria) this;
        }

        public Criteria andWapcolorschemeidNotBetween(String value1, String value2) {
            addCriterion("wapColorSchemeId not between", value1, value2, "wapcolorschemeid");
            return (Criteria) this;
        }

        public Criteria andCssIsNull() {
            addCriterion("css is null");
            return (Criteria) this;
        }

        public Criteria andCssIsNotNull() {
            addCriterion("css is not null");
            return (Criteria) this;
        }

        public Criteria andCssEqualTo(String value) {
            addCriterion("css =", value, "css");
            return (Criteria) this;
        }

        public Criteria andCssNotEqualTo(String value) {
            addCriterion("css <>", value, "css");
            return (Criteria) this;
        }

        public Criteria andCssGreaterThan(String value) {
            addCriterion("css >", value, "css");
            return (Criteria) this;
        }

        public Criteria andCssGreaterThanOrEqualTo(String value) {
            addCriterion("css >=", value, "css");
            return (Criteria) this;
        }

        public Criteria andCssLessThan(String value) {
            addCriterion("css <", value, "css");
            return (Criteria) this;
        }

        public Criteria andCssLessThanOrEqualTo(String value) {
            addCriterion("css <=", value, "css");
            return (Criteria) this;
        }

        public Criteria andCssLike(String value) {
            addCriterion("css like", value, "css");
            return (Criteria) this;
        }

        public Criteria andCssNotLike(String value) {
            addCriterion("css not like", value, "css");
            return (Criteria) this;
        }

        public Criteria andCssIn(List<String> values) {
            addCriterion("css in", values, "css");
            return (Criteria) this;
        }

        public Criteria andCssNotIn(List<String> values) {
            addCriterion("css not in", values, "css");
            return (Criteria) this;
        }

        public Criteria andCssBetween(String value1, String value2) {
            addCriterion("css between", value1, value2, "css");
            return (Criteria) this;
        }

        public Criteria andCssNotBetween(String value1, String value2) {
            addCriterion("css not between", value1, value2, "css");
            return (Criteria) this;
        }

        public Criteria andPagecountIsNull() {
            addCriterion("pageCount is null");
            return (Criteria) this;
        }

        public Criteria andPagecountIsNotNull() {
            addCriterion("pageCount is not null");
            return (Criteria) this;
        }

        public Criteria andPagecountEqualTo(Integer value) {
            addCriterion("pageCount =", value, "pagecount");
            return (Criteria) this;
        }

        public Criteria andPagecountNotEqualTo(Integer value) {
            addCriterion("pageCount <>", value, "pagecount");
            return (Criteria) this;
        }

        public Criteria andPagecountGreaterThan(Integer value) {
            addCriterion("pageCount >", value, "pagecount");
            return (Criteria) this;
        }

        public Criteria andPagecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("pageCount >=", value, "pagecount");
            return (Criteria) this;
        }

        public Criteria andPagecountLessThan(Integer value) {
            addCriterion("pageCount <", value, "pagecount");
            return (Criteria) this;
        }

        public Criteria andPagecountLessThanOrEqualTo(Integer value) {
            addCriterion("pageCount <=", value, "pagecount");
            return (Criteria) this;
        }

        public Criteria andPagecountIn(List<Integer> values) {
            addCriterion("pageCount in", values, "pagecount");
            return (Criteria) this;
        }

        public Criteria andPagecountNotIn(List<Integer> values) {
            addCriterion("pageCount not in", values, "pagecount");
            return (Criteria) this;
        }

        public Criteria andPagecountBetween(Integer value1, Integer value2) {
            addCriterion("pageCount between", value1, value2, "pagecount");
            return (Criteria) this;
        }

        public Criteria andPagecountNotBetween(Integer value1, Integer value2) {
            addCriterion("pageCount not between", value1, value2, "pagecount");
            return (Criteria) this;
        }

        public Criteria andLayoutsetprototypeuuidIsNull() {
            addCriterion("layoutSetPrototypeUuid is null");
            return (Criteria) this;
        }

        public Criteria andLayoutsetprototypeuuidIsNotNull() {
            addCriterion("layoutSetPrototypeUuid is not null");
            return (Criteria) this;
        }

        public Criteria andLayoutsetprototypeuuidEqualTo(String value) {
            addCriterion("layoutSetPrototypeUuid =", value, "layoutsetprototypeuuid");
            return (Criteria) this;
        }

        public Criteria andLayoutsetprototypeuuidNotEqualTo(String value) {
            addCriterion("layoutSetPrototypeUuid <>", value, "layoutsetprototypeuuid");
            return (Criteria) this;
        }

        public Criteria andLayoutsetprototypeuuidGreaterThan(String value) {
            addCriterion("layoutSetPrototypeUuid >", value, "layoutsetprototypeuuid");
            return (Criteria) this;
        }

        public Criteria andLayoutsetprototypeuuidGreaterThanOrEqualTo(String value) {
            addCriterion("layoutSetPrototypeUuid >=", value, "layoutsetprototypeuuid");
            return (Criteria) this;
        }

        public Criteria andLayoutsetprototypeuuidLessThan(String value) {
            addCriterion("layoutSetPrototypeUuid <", value, "layoutsetprototypeuuid");
            return (Criteria) this;
        }

        public Criteria andLayoutsetprototypeuuidLessThanOrEqualTo(String value) {
            addCriterion("layoutSetPrototypeUuid <=", value, "layoutsetprototypeuuid");
            return (Criteria) this;
        }

        public Criteria andLayoutsetprototypeuuidLike(String value) {
            addCriterion("layoutSetPrototypeUuid like", value, "layoutsetprototypeuuid");
            return (Criteria) this;
        }

        public Criteria andLayoutsetprototypeuuidNotLike(String value) {
            addCriterion("layoutSetPrototypeUuid not like", value, "layoutsetprototypeuuid");
            return (Criteria) this;
        }

        public Criteria andLayoutsetprototypeuuidIn(List<String> values) {
            addCriterion("layoutSetPrototypeUuid in", values, "layoutsetprototypeuuid");
            return (Criteria) this;
        }

        public Criteria andLayoutsetprototypeuuidNotIn(List<String> values) {
            addCriterion("layoutSetPrototypeUuid not in", values, "layoutsetprototypeuuid");
            return (Criteria) this;
        }

        public Criteria andLayoutsetprototypeuuidBetween(String value1, String value2) {
            addCriterion("layoutSetPrototypeUuid between", value1, value2, "layoutsetprototypeuuid");
            return (Criteria) this;
        }

        public Criteria andLayoutsetprototypeuuidNotBetween(String value1, String value2) {
            addCriterion("layoutSetPrototypeUuid not between", value1, value2, "layoutsetprototypeuuid");
            return (Criteria) this;
        }

        public Criteria andLayoutsetprototypelinkenabledIsNull() {
            addCriterion("layoutSetPrototypeLinkEnabled is null");
            return (Criteria) this;
        }

        public Criteria andLayoutsetprototypelinkenabledIsNotNull() {
            addCriterion("layoutSetPrototypeLinkEnabled is not null");
            return (Criteria) this;
        }

        public Criteria andLayoutsetprototypelinkenabledEqualTo(Byte value) {
            addCriterion("layoutSetPrototypeLinkEnabled =", value, "layoutsetprototypelinkenabled");
            return (Criteria) this;
        }

        public Criteria andLayoutsetprototypelinkenabledNotEqualTo(Byte value) {
            addCriterion("layoutSetPrototypeLinkEnabled <>", value, "layoutsetprototypelinkenabled");
            return (Criteria) this;
        }

        public Criteria andLayoutsetprototypelinkenabledGreaterThan(Byte value) {
            addCriterion("layoutSetPrototypeLinkEnabled >", value, "layoutsetprototypelinkenabled");
            return (Criteria) this;
        }

        public Criteria andLayoutsetprototypelinkenabledGreaterThanOrEqualTo(Byte value) {
            addCriterion("layoutSetPrototypeLinkEnabled >=", value, "layoutsetprototypelinkenabled");
            return (Criteria) this;
        }

        public Criteria andLayoutsetprototypelinkenabledLessThan(Byte value) {
            addCriterion("layoutSetPrototypeLinkEnabled <", value, "layoutsetprototypelinkenabled");
            return (Criteria) this;
        }

        public Criteria andLayoutsetprototypelinkenabledLessThanOrEqualTo(Byte value) {
            addCriterion("layoutSetPrototypeLinkEnabled <=", value, "layoutsetprototypelinkenabled");
            return (Criteria) this;
        }

        public Criteria andLayoutsetprototypelinkenabledIn(List<Byte> values) {
            addCriterion("layoutSetPrototypeLinkEnabled in", values, "layoutsetprototypelinkenabled");
            return (Criteria) this;
        }

        public Criteria andLayoutsetprototypelinkenabledNotIn(List<Byte> values) {
            addCriterion("layoutSetPrototypeLinkEnabled not in", values, "layoutsetprototypelinkenabled");
            return (Criteria) this;
        }

        public Criteria andLayoutsetprototypelinkenabledBetween(Byte value1, Byte value2) {
            addCriterion("layoutSetPrototypeLinkEnabled between", value1, value2, "layoutsetprototypelinkenabled");
            return (Criteria) this;
        }

        public Criteria andLayoutsetprototypelinkenabledNotBetween(Byte value1, Byte value2) {
            addCriterion("layoutSetPrototypeLinkEnabled not between", value1, value2, "layoutsetprototypelinkenabled");
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