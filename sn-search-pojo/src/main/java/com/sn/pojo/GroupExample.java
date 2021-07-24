package com.sn.pojo;

import java.util.ArrayList;
import java.util.List;

public class GroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GroupExample() {
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

        public Criteria andUuidIsNull() {
            addCriterion("uuid_ is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid_ is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("uuid_ =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("uuid_ <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("uuid_ >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("uuid_ >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("uuid_ <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("uuid_ <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("uuid_ like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("uuid_ not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("uuid_ in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("uuid_ not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("uuid_ between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("uuid_ not between", value1, value2, "uuid");
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

        public Criteria andCreatoruseridIsNull() {
            addCriterion("creatorUserId is null");
            return (Criteria) this;
        }

        public Criteria andCreatoruseridIsNotNull() {
            addCriterion("creatorUserId is not null");
            return (Criteria) this;
        }

        public Criteria andCreatoruseridEqualTo(Long value) {
            addCriterion("creatorUserId =", value, "creatoruserid");
            return (Criteria) this;
        }

        public Criteria andCreatoruseridNotEqualTo(Long value) {
            addCriterion("creatorUserId <>", value, "creatoruserid");
            return (Criteria) this;
        }

        public Criteria andCreatoruseridGreaterThan(Long value) {
            addCriterion("creatorUserId >", value, "creatoruserid");
            return (Criteria) this;
        }

        public Criteria andCreatoruseridGreaterThanOrEqualTo(Long value) {
            addCriterion("creatorUserId >=", value, "creatoruserid");
            return (Criteria) this;
        }

        public Criteria andCreatoruseridLessThan(Long value) {
            addCriterion("creatorUserId <", value, "creatoruserid");
            return (Criteria) this;
        }

        public Criteria andCreatoruseridLessThanOrEqualTo(Long value) {
            addCriterion("creatorUserId <=", value, "creatoruserid");
            return (Criteria) this;
        }

        public Criteria andCreatoruseridIn(List<Long> values) {
            addCriterion("creatorUserId in", values, "creatoruserid");
            return (Criteria) this;
        }

        public Criteria andCreatoruseridNotIn(List<Long> values) {
            addCriterion("creatorUserId not in", values, "creatoruserid");
            return (Criteria) this;
        }

        public Criteria andCreatoruseridBetween(Long value1, Long value2) {
            addCriterion("creatorUserId between", value1, value2, "creatoruserid");
            return (Criteria) this;
        }

        public Criteria andCreatoruseridNotBetween(Long value1, Long value2) {
            addCriterion("creatorUserId not between", value1, value2, "creatoruserid");
            return (Criteria) this;
        }

        public Criteria andClassnameidIsNull() {
            addCriterion("classNameId is null");
            return (Criteria) this;
        }

        public Criteria andClassnameidIsNotNull() {
            addCriterion("classNameId is not null");
            return (Criteria) this;
        }

        public Criteria andClassnameidEqualTo(Long value) {
            addCriterion("classNameId =", value, "classnameid");
            return (Criteria) this;
        }

        public Criteria andClassnameidNotEqualTo(Long value) {
            addCriterion("classNameId <>", value, "classnameid");
            return (Criteria) this;
        }

        public Criteria andClassnameidGreaterThan(Long value) {
            addCriterion("classNameId >", value, "classnameid");
            return (Criteria) this;
        }

        public Criteria andClassnameidGreaterThanOrEqualTo(Long value) {
            addCriterion("classNameId >=", value, "classnameid");
            return (Criteria) this;
        }

        public Criteria andClassnameidLessThan(Long value) {
            addCriterion("classNameId <", value, "classnameid");
            return (Criteria) this;
        }

        public Criteria andClassnameidLessThanOrEqualTo(Long value) {
            addCriterion("classNameId <=", value, "classnameid");
            return (Criteria) this;
        }

        public Criteria andClassnameidIn(List<Long> values) {
            addCriterion("classNameId in", values, "classnameid");
            return (Criteria) this;
        }

        public Criteria andClassnameidNotIn(List<Long> values) {
            addCriterion("classNameId not in", values, "classnameid");
            return (Criteria) this;
        }

        public Criteria andClassnameidBetween(Long value1, Long value2) {
            addCriterion("classNameId between", value1, value2, "classnameid");
            return (Criteria) this;
        }

        public Criteria andClassnameidNotBetween(Long value1, Long value2) {
            addCriterion("classNameId not between", value1, value2, "classnameid");
            return (Criteria) this;
        }

        public Criteria andClasspkIsNull() {
            addCriterion("classPK is null");
            return (Criteria) this;
        }

        public Criteria andClasspkIsNotNull() {
            addCriterion("classPK is not null");
            return (Criteria) this;
        }

        public Criteria andClasspkEqualTo(Long value) {
            addCriterion("classPK =", value, "classpk");
            return (Criteria) this;
        }

        public Criteria andClasspkNotEqualTo(Long value) {
            addCriterion("classPK <>", value, "classpk");
            return (Criteria) this;
        }

        public Criteria andClasspkGreaterThan(Long value) {
            addCriterion("classPK >", value, "classpk");
            return (Criteria) this;
        }

        public Criteria andClasspkGreaterThanOrEqualTo(Long value) {
            addCriterion("classPK >=", value, "classpk");
            return (Criteria) this;
        }

        public Criteria andClasspkLessThan(Long value) {
            addCriterion("classPK <", value, "classpk");
            return (Criteria) this;
        }

        public Criteria andClasspkLessThanOrEqualTo(Long value) {
            addCriterion("classPK <=", value, "classpk");
            return (Criteria) this;
        }

        public Criteria andClasspkIn(List<Long> values) {
            addCriterion("classPK in", values, "classpk");
            return (Criteria) this;
        }

        public Criteria andClasspkNotIn(List<Long> values) {
            addCriterion("classPK not in", values, "classpk");
            return (Criteria) this;
        }

        public Criteria andClasspkBetween(Long value1, Long value2) {
            addCriterion("classPK between", value1, value2, "classpk");
            return (Criteria) this;
        }

        public Criteria andClasspkNotBetween(Long value1, Long value2) {
            addCriterion("classPK not between", value1, value2, "classpk");
            return (Criteria) this;
        }

        public Criteria andParentgroupidIsNull() {
            addCriterion("parentGroupId is null");
            return (Criteria) this;
        }

        public Criteria andParentgroupidIsNotNull() {
            addCriterion("parentGroupId is not null");
            return (Criteria) this;
        }

        public Criteria andParentgroupidEqualTo(Long value) {
            addCriterion("parentGroupId =", value, "parentgroupid");
            return (Criteria) this;
        }

        public Criteria andParentgroupidNotEqualTo(Long value) {
            addCriterion("parentGroupId <>", value, "parentgroupid");
            return (Criteria) this;
        }

        public Criteria andParentgroupidGreaterThan(Long value) {
            addCriterion("parentGroupId >", value, "parentgroupid");
            return (Criteria) this;
        }

        public Criteria andParentgroupidGreaterThanOrEqualTo(Long value) {
            addCriterion("parentGroupId >=", value, "parentgroupid");
            return (Criteria) this;
        }

        public Criteria andParentgroupidLessThan(Long value) {
            addCriterion("parentGroupId <", value, "parentgroupid");
            return (Criteria) this;
        }

        public Criteria andParentgroupidLessThanOrEqualTo(Long value) {
            addCriterion("parentGroupId <=", value, "parentgroupid");
            return (Criteria) this;
        }

        public Criteria andParentgroupidIn(List<Long> values) {
            addCriterion("parentGroupId in", values, "parentgroupid");
            return (Criteria) this;
        }

        public Criteria andParentgroupidNotIn(List<Long> values) {
            addCriterion("parentGroupId not in", values, "parentgroupid");
            return (Criteria) this;
        }

        public Criteria andParentgroupidBetween(Long value1, Long value2) {
            addCriterion("parentGroupId between", value1, value2, "parentgroupid");
            return (Criteria) this;
        }

        public Criteria andParentgroupidNotBetween(Long value1, Long value2) {
            addCriterion("parentGroupId not between", value1, value2, "parentgroupid");
            return (Criteria) this;
        }

        public Criteria andLivegroupidIsNull() {
            addCriterion("liveGroupId is null");
            return (Criteria) this;
        }

        public Criteria andLivegroupidIsNotNull() {
            addCriterion("liveGroupId is not null");
            return (Criteria) this;
        }

        public Criteria andLivegroupidEqualTo(Long value) {
            addCriterion("liveGroupId =", value, "livegroupid");
            return (Criteria) this;
        }

        public Criteria andLivegroupidNotEqualTo(Long value) {
            addCriterion("liveGroupId <>", value, "livegroupid");
            return (Criteria) this;
        }

        public Criteria andLivegroupidGreaterThan(Long value) {
            addCriterion("liveGroupId >", value, "livegroupid");
            return (Criteria) this;
        }

        public Criteria andLivegroupidGreaterThanOrEqualTo(Long value) {
            addCriterion("liveGroupId >=", value, "livegroupid");
            return (Criteria) this;
        }

        public Criteria andLivegroupidLessThan(Long value) {
            addCriterion("liveGroupId <", value, "livegroupid");
            return (Criteria) this;
        }

        public Criteria andLivegroupidLessThanOrEqualTo(Long value) {
            addCriterion("liveGroupId <=", value, "livegroupid");
            return (Criteria) this;
        }

        public Criteria andLivegroupidIn(List<Long> values) {
            addCriterion("liveGroupId in", values, "livegroupid");
            return (Criteria) this;
        }

        public Criteria andLivegroupidNotIn(List<Long> values) {
            addCriterion("liveGroupId not in", values, "livegroupid");
            return (Criteria) this;
        }

        public Criteria andLivegroupidBetween(Long value1, Long value2) {
            addCriterion("liveGroupId between", value1, value2, "livegroupid");
            return (Criteria) this;
        }

        public Criteria andLivegroupidNotBetween(Long value1, Long value2) {
            addCriterion("liveGroupId not between", value1, value2, "livegroupid");
            return (Criteria) this;
        }

        public Criteria andTreepathIsNull() {
            addCriterion("treePath is null");
            return (Criteria) this;
        }

        public Criteria andTreepathIsNotNull() {
            addCriterion("treePath is not null");
            return (Criteria) this;
        }

        public Criteria andTreepathEqualTo(String value) {
            addCriterion("treePath =", value, "treepath");
            return (Criteria) this;
        }

        public Criteria andTreepathNotEqualTo(String value) {
            addCriterion("treePath <>", value, "treepath");
            return (Criteria) this;
        }

        public Criteria andTreepathGreaterThan(String value) {
            addCriterion("treePath >", value, "treepath");
            return (Criteria) this;
        }

        public Criteria andTreepathGreaterThanOrEqualTo(String value) {
            addCriterion("treePath >=", value, "treepath");
            return (Criteria) this;
        }

        public Criteria andTreepathLessThan(String value) {
            addCriterion("treePath <", value, "treepath");
            return (Criteria) this;
        }

        public Criteria andTreepathLessThanOrEqualTo(String value) {
            addCriterion("treePath <=", value, "treepath");
            return (Criteria) this;
        }

        public Criteria andTreepathLike(String value) {
            addCriterion("treePath like", value, "treepath");
            return (Criteria) this;
        }

        public Criteria andTreepathNotLike(String value) {
            addCriterion("treePath not like", value, "treepath");
            return (Criteria) this;
        }

        public Criteria andTreepathIn(List<String> values) {
            addCriterion("treePath in", values, "treepath");
            return (Criteria) this;
        }

        public Criteria andTreepathNotIn(List<String> values) {
            addCriterion("treePath not in", values, "treepath");
            return (Criteria) this;
        }

        public Criteria andTreepathBetween(String value1, String value2) {
            addCriterion("treePath between", value1, value2, "treepath");
            return (Criteria) this;
        }

        public Criteria andTreepathNotBetween(String value1, String value2) {
            addCriterion("treePath not between", value1, value2, "treepath");
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

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type_ is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type_ is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type_ =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type_ <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type_ >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_ >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type_ <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type_ <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type_ in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type_ not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type_ between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type_ not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypesettingsIsNull() {
            addCriterion("typeSettings is null");
            return (Criteria) this;
        }

        public Criteria andTypesettingsIsNotNull() {
            addCriterion("typeSettings is not null");
            return (Criteria) this;
        }

        public Criteria andTypesettingsEqualTo(String value) {
            addCriterion("typeSettings =", value, "typesettings");
            return (Criteria) this;
        }

        public Criteria andTypesettingsNotEqualTo(String value) {
            addCriterion("typeSettings <>", value, "typesettings");
            return (Criteria) this;
        }

        public Criteria andTypesettingsGreaterThan(String value) {
            addCriterion("typeSettings >", value, "typesettings");
            return (Criteria) this;
        }

        public Criteria andTypesettingsGreaterThanOrEqualTo(String value) {
            addCriterion("typeSettings >=", value, "typesettings");
            return (Criteria) this;
        }

        public Criteria andTypesettingsLessThan(String value) {
            addCriterion("typeSettings <", value, "typesettings");
            return (Criteria) this;
        }

        public Criteria andTypesettingsLessThanOrEqualTo(String value) {
            addCriterion("typeSettings <=", value, "typesettings");
            return (Criteria) this;
        }

        public Criteria andTypesettingsLike(String value) {
            addCriterion("typeSettings like", value, "typesettings");
            return (Criteria) this;
        }

        public Criteria andTypesettingsNotLike(String value) {
            addCriterion("typeSettings not like", value, "typesettings");
            return (Criteria) this;
        }

        public Criteria andTypesettingsIn(List<String> values) {
            addCriterion("typeSettings in", values, "typesettings");
            return (Criteria) this;
        }

        public Criteria andTypesettingsNotIn(List<String> values) {
            addCriterion("typeSettings not in", values, "typesettings");
            return (Criteria) this;
        }

        public Criteria andTypesettingsBetween(String value1, String value2) {
            addCriterion("typeSettings between", value1, value2, "typesettings");
            return (Criteria) this;
        }

        public Criteria andTypesettingsNotBetween(String value1, String value2) {
            addCriterion("typeSettings not between", value1, value2, "typesettings");
            return (Criteria) this;
        }

        public Criteria andManualmembershipIsNull() {
            addCriterion("manualMembership is null");
            return (Criteria) this;
        }

        public Criteria andManualmembershipIsNotNull() {
            addCriterion("manualMembership is not null");
            return (Criteria) this;
        }

        public Criteria andManualmembershipEqualTo(Byte value) {
            addCriterion("manualMembership =", value, "manualmembership");
            return (Criteria) this;
        }

        public Criteria andManualmembershipNotEqualTo(Byte value) {
            addCriterion("manualMembership <>", value, "manualmembership");
            return (Criteria) this;
        }

        public Criteria andManualmembershipGreaterThan(Byte value) {
            addCriterion("manualMembership >", value, "manualmembership");
            return (Criteria) this;
        }

        public Criteria andManualmembershipGreaterThanOrEqualTo(Byte value) {
            addCriterion("manualMembership >=", value, "manualmembership");
            return (Criteria) this;
        }

        public Criteria andManualmembershipLessThan(Byte value) {
            addCriterion("manualMembership <", value, "manualmembership");
            return (Criteria) this;
        }

        public Criteria andManualmembershipLessThanOrEqualTo(Byte value) {
            addCriterion("manualMembership <=", value, "manualmembership");
            return (Criteria) this;
        }

        public Criteria andManualmembershipIn(List<Byte> values) {
            addCriterion("manualMembership in", values, "manualmembership");
            return (Criteria) this;
        }

        public Criteria andManualmembershipNotIn(List<Byte> values) {
            addCriterion("manualMembership not in", values, "manualmembership");
            return (Criteria) this;
        }

        public Criteria andManualmembershipBetween(Byte value1, Byte value2) {
            addCriterion("manualMembership between", value1, value2, "manualmembership");
            return (Criteria) this;
        }

        public Criteria andManualmembershipNotBetween(Byte value1, Byte value2) {
            addCriterion("manualMembership not between", value1, value2, "manualmembership");
            return (Criteria) this;
        }

        public Criteria andMembershiprestrictionIsNull() {
            addCriterion("membershipRestriction is null");
            return (Criteria) this;
        }

        public Criteria andMembershiprestrictionIsNotNull() {
            addCriterion("membershipRestriction is not null");
            return (Criteria) this;
        }

        public Criteria andMembershiprestrictionEqualTo(Integer value) {
            addCriterion("membershipRestriction =", value, "membershiprestriction");
            return (Criteria) this;
        }

        public Criteria andMembershiprestrictionNotEqualTo(Integer value) {
            addCriterion("membershipRestriction <>", value, "membershiprestriction");
            return (Criteria) this;
        }

        public Criteria andMembershiprestrictionGreaterThan(Integer value) {
            addCriterion("membershipRestriction >", value, "membershiprestriction");
            return (Criteria) this;
        }

        public Criteria andMembershiprestrictionGreaterThanOrEqualTo(Integer value) {
            addCriterion("membershipRestriction >=", value, "membershiprestriction");
            return (Criteria) this;
        }

        public Criteria andMembershiprestrictionLessThan(Integer value) {
            addCriterion("membershipRestriction <", value, "membershiprestriction");
            return (Criteria) this;
        }

        public Criteria andMembershiprestrictionLessThanOrEqualTo(Integer value) {
            addCriterion("membershipRestriction <=", value, "membershiprestriction");
            return (Criteria) this;
        }

        public Criteria andMembershiprestrictionIn(List<Integer> values) {
            addCriterion("membershipRestriction in", values, "membershiprestriction");
            return (Criteria) this;
        }

        public Criteria andMembershiprestrictionNotIn(List<Integer> values) {
            addCriterion("membershipRestriction not in", values, "membershiprestriction");
            return (Criteria) this;
        }

        public Criteria andMembershiprestrictionBetween(Integer value1, Integer value2) {
            addCriterion("membershipRestriction between", value1, value2, "membershiprestriction");
            return (Criteria) this;
        }

        public Criteria andMembershiprestrictionNotBetween(Integer value1, Integer value2) {
            addCriterion("membershipRestriction not between", value1, value2, "membershiprestriction");
            return (Criteria) this;
        }

        public Criteria andFriendlyurlIsNull() {
            addCriterion("friendlyURL is null");
            return (Criteria) this;
        }

        public Criteria andFriendlyurlIsNotNull() {
            addCriterion("friendlyURL is not null");
            return (Criteria) this;
        }

        public Criteria andFriendlyurlEqualTo(String value) {
            addCriterion("friendlyURL =", value, "friendlyurl");
            return (Criteria) this;
        }

        public Criteria andFriendlyurlNotEqualTo(String value) {
            addCriterion("friendlyURL <>", value, "friendlyurl");
            return (Criteria) this;
        }

        public Criteria andFriendlyurlGreaterThan(String value) {
            addCriterion("friendlyURL >", value, "friendlyurl");
            return (Criteria) this;
        }

        public Criteria andFriendlyurlGreaterThanOrEqualTo(String value) {
            addCriterion("friendlyURL >=", value, "friendlyurl");
            return (Criteria) this;
        }

        public Criteria andFriendlyurlLessThan(String value) {
            addCriterion("friendlyURL <", value, "friendlyurl");
            return (Criteria) this;
        }

        public Criteria andFriendlyurlLessThanOrEqualTo(String value) {
            addCriterion("friendlyURL <=", value, "friendlyurl");
            return (Criteria) this;
        }

        public Criteria andFriendlyurlLike(String value) {
            addCriterion("friendlyURL like", value, "friendlyurl");
            return (Criteria) this;
        }

        public Criteria andFriendlyurlNotLike(String value) {
            addCriterion("friendlyURL not like", value, "friendlyurl");
            return (Criteria) this;
        }

        public Criteria andFriendlyurlIn(List<String> values) {
            addCriterion("friendlyURL in", values, "friendlyurl");
            return (Criteria) this;
        }

        public Criteria andFriendlyurlNotIn(List<String> values) {
            addCriterion("friendlyURL not in", values, "friendlyurl");
            return (Criteria) this;
        }

        public Criteria andFriendlyurlBetween(String value1, String value2) {
            addCriterion("friendlyURL between", value1, value2, "friendlyurl");
            return (Criteria) this;
        }

        public Criteria andFriendlyurlNotBetween(String value1, String value2) {
            addCriterion("friendlyURL not between", value1, value2, "friendlyurl");
            return (Criteria) this;
        }

        public Criteria andSiteIsNull() {
            addCriterion("site is null");
            return (Criteria) this;
        }

        public Criteria andSiteIsNotNull() {
            addCriterion("site is not null");
            return (Criteria) this;
        }

        public Criteria andSiteEqualTo(Byte value) {
            addCriterion("site =", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotEqualTo(Byte value) {
            addCriterion("site <>", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThan(Byte value) {
            addCriterion("site >", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThanOrEqualTo(Byte value) {
            addCriterion("site >=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThan(Byte value) {
            addCriterion("site <", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThanOrEqualTo(Byte value) {
            addCriterion("site <=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteIn(List<Byte> values) {
            addCriterion("site in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotIn(List<Byte> values) {
            addCriterion("site not in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteBetween(Byte value1, Byte value2) {
            addCriterion("site between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotBetween(Byte value1, Byte value2) {
            addCriterion("site not between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andRemotestaginggroupcountIsNull() {
            addCriterion("remoteStagingGroupCount is null");
            return (Criteria) this;
        }

        public Criteria andRemotestaginggroupcountIsNotNull() {
            addCriterion("remoteStagingGroupCount is not null");
            return (Criteria) this;
        }

        public Criteria andRemotestaginggroupcountEqualTo(Integer value) {
            addCriterion("remoteStagingGroupCount =", value, "remotestaginggroupcount");
            return (Criteria) this;
        }

        public Criteria andRemotestaginggroupcountNotEqualTo(Integer value) {
            addCriterion("remoteStagingGroupCount <>", value, "remotestaginggroupcount");
            return (Criteria) this;
        }

        public Criteria andRemotestaginggroupcountGreaterThan(Integer value) {
            addCriterion("remoteStagingGroupCount >", value, "remotestaginggroupcount");
            return (Criteria) this;
        }

        public Criteria andRemotestaginggroupcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("remoteStagingGroupCount >=", value, "remotestaginggroupcount");
            return (Criteria) this;
        }

        public Criteria andRemotestaginggroupcountLessThan(Integer value) {
            addCriterion("remoteStagingGroupCount <", value, "remotestaginggroupcount");
            return (Criteria) this;
        }

        public Criteria andRemotestaginggroupcountLessThanOrEqualTo(Integer value) {
            addCriterion("remoteStagingGroupCount <=", value, "remotestaginggroupcount");
            return (Criteria) this;
        }

        public Criteria andRemotestaginggroupcountIn(List<Integer> values) {
            addCriterion("remoteStagingGroupCount in", values, "remotestaginggroupcount");
            return (Criteria) this;
        }

        public Criteria andRemotestaginggroupcountNotIn(List<Integer> values) {
            addCriterion("remoteStagingGroupCount not in", values, "remotestaginggroupcount");
            return (Criteria) this;
        }

        public Criteria andRemotestaginggroupcountBetween(Integer value1, Integer value2) {
            addCriterion("remoteStagingGroupCount between", value1, value2, "remotestaginggroupcount");
            return (Criteria) this;
        }

        public Criteria andRemotestaginggroupcountNotBetween(Integer value1, Integer value2) {
            addCriterion("remoteStagingGroupCount not between", value1, value2, "remotestaginggroupcount");
            return (Criteria) this;
        }

        public Criteria andActiveIsNull() {
            addCriterion("active_ is null");
            return (Criteria) this;
        }

        public Criteria andActiveIsNotNull() {
            addCriterion("active_ is not null");
            return (Criteria) this;
        }

        public Criteria andActiveEqualTo(Byte value) {
            addCriterion("active_ =", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotEqualTo(Byte value) {
            addCriterion("active_ <>", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThan(Byte value) {
            addCriterion("active_ >", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThanOrEqualTo(Byte value) {
            addCriterion("active_ >=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThan(Byte value) {
            addCriterion("active_ <", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThanOrEqualTo(Byte value) {
            addCriterion("active_ <=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveIn(List<Byte> values) {
            addCriterion("active_ in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotIn(List<Byte> values) {
            addCriterion("active_ not in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveBetween(Byte value1, Byte value2) {
            addCriterion("active_ between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotBetween(Byte value1, Byte value2) {
            addCriterion("active_ not between", value1, value2, "active");
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