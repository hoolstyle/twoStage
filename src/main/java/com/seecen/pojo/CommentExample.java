package com.seecen.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andCmidIsNull() {
            addCriterion("CMID is null");
            return (Criteria) this;
        }

        public Criteria andCmidIsNotNull() {
            addCriterion("CMID is not null");
            return (Criteria) this;
        }

        public Criteria andCmidEqualTo(Integer value) {
            addCriterion("CMID =", value, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidNotEqualTo(Integer value) {
            addCriterion("CMID <>", value, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidGreaterThan(Integer value) {
            addCriterion("CMID >", value, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CMID >=", value, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidLessThan(Integer value) {
            addCriterion("CMID <", value, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidLessThanOrEqualTo(Integer value) {
            addCriterion("CMID <=", value, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidIn(List<Integer> values) {
            addCriterion("CMID in", values, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidNotIn(List<Integer> values) {
            addCriterion("CMID not in", values, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidBetween(Integer value1, Integer value2) {
            addCriterion("CMID between", value1, value2, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidNotBetween(Integer value1, Integer value2) {
            addCriterion("CMID not between", value1, value2, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmcontentIsNull() {
            addCriterion("CMCONTENT is null");
            return (Criteria) this;
        }

        public Criteria andCmcontentIsNotNull() {
            addCriterion("CMCONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andCmcontentEqualTo(String value) {
            addCriterion("CMCONTENT =", value, "cmcontent");
            return (Criteria) this;
        }

        public Criteria andCmcontentNotEqualTo(String value) {
            addCriterion("CMCONTENT <>", value, "cmcontent");
            return (Criteria) this;
        }

        public Criteria andCmcontentGreaterThan(String value) {
            addCriterion("CMCONTENT >", value, "cmcontent");
            return (Criteria) this;
        }

        public Criteria andCmcontentGreaterThanOrEqualTo(String value) {
            addCriterion("CMCONTENT >=", value, "cmcontent");
            return (Criteria) this;
        }

        public Criteria andCmcontentLessThan(String value) {
            addCriterion("CMCONTENT <", value, "cmcontent");
            return (Criteria) this;
        }

        public Criteria andCmcontentLessThanOrEqualTo(String value) {
            addCriterion("CMCONTENT <=", value, "cmcontent");
            return (Criteria) this;
        }

        public Criteria andCmcontentLike(String value) {
            addCriterion("CMCONTENT like", value, "cmcontent");
            return (Criteria) this;
        }

        public Criteria andCmcontentNotLike(String value) {
            addCriterion("CMCONTENT not like", value, "cmcontent");
            return (Criteria) this;
        }

        public Criteria andCmcontentIn(List<String> values) {
            addCriterion("CMCONTENT in", values, "cmcontent");
            return (Criteria) this;
        }

        public Criteria andCmcontentNotIn(List<String> values) {
            addCriterion("CMCONTENT not in", values, "cmcontent");
            return (Criteria) this;
        }

        public Criteria andCmcontentBetween(String value1, String value2) {
            addCriterion("CMCONTENT between", value1, value2, "cmcontent");
            return (Criteria) this;
        }

        public Criteria andCmcontentNotBetween(String value1, String value2) {
            addCriterion("CMCONTENT not between", value1, value2, "cmcontent");
            return (Criteria) this;
        }

        public Criteria andCmtimeIsNull() {
            addCriterion("CMTIME is null");
            return (Criteria) this;
        }

        public Criteria andCmtimeIsNotNull() {
            addCriterion("CMTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCmtimeEqualTo(Date value) {
            addCriterion("CMTIME =", value, "cmtime");
            return (Criteria) this;
        }

        public Criteria andCmtimeNotEqualTo(Date value) {
            addCriterion("CMTIME <>", value, "cmtime");
            return (Criteria) this;
        }

        public Criteria andCmtimeGreaterThan(Date value) {
            addCriterion("CMTIME >", value, "cmtime");
            return (Criteria) this;
        }

        public Criteria andCmtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CMTIME >=", value, "cmtime");
            return (Criteria) this;
        }

        public Criteria andCmtimeLessThan(Date value) {
            addCriterion("CMTIME <", value, "cmtime");
            return (Criteria) this;
        }

        public Criteria andCmtimeLessThanOrEqualTo(Date value) {
            addCriterion("CMTIME <=", value, "cmtime");
            return (Criteria) this;
        }

        public Criteria andCmtimeIn(List<Date> values) {
            addCriterion("CMTIME in", values, "cmtime");
            return (Criteria) this;
        }

        public Criteria andCmtimeNotIn(List<Date> values) {
            addCriterion("CMTIME not in", values, "cmtime");
            return (Criteria) this;
        }

        public Criteria andCmtimeBetween(Date value1, Date value2) {
            addCriterion("CMTIME between", value1, value2, "cmtime");
            return (Criteria) this;
        }

        public Criteria andCmtimeNotBetween(Date value1, Date value2) {
            addCriterion("CMTIME not between", value1, value2, "cmtime");
            return (Criteria) this;
        }

        public Criteria andPostsidIsNull() {
            addCriterion("POSTSID is null");
            return (Criteria) this;
        }

        public Criteria andPostsidIsNotNull() {
            addCriterion("POSTSID is not null");
            return (Criteria) this;
        }

        public Criteria andPostsidEqualTo(Integer value) {
            addCriterion("POSTSID =", value, "postsid");
            return (Criteria) this;
        }

        public Criteria andPostsidNotEqualTo(Integer value) {
            addCriterion("POSTSID <>", value, "postsid");
            return (Criteria) this;
        }

        public Criteria andPostsidGreaterThan(Integer value) {
            addCriterion("POSTSID >", value, "postsid");
            return (Criteria) this;
        }

        public Criteria andPostsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("POSTSID >=", value, "postsid");
            return (Criteria) this;
        }

        public Criteria andPostsidLessThan(Integer value) {
            addCriterion("POSTSID <", value, "postsid");
            return (Criteria) this;
        }

        public Criteria andPostsidLessThanOrEqualTo(Integer value) {
            addCriterion("POSTSID <=", value, "postsid");
            return (Criteria) this;
        }

        public Criteria andPostsidIn(List<Integer> values) {
            addCriterion("POSTSID in", values, "postsid");
            return (Criteria) this;
        }

        public Criteria andPostsidNotIn(List<Integer> values) {
            addCriterion("POSTSID not in", values, "postsid");
            return (Criteria) this;
        }

        public Criteria andPostsidBetween(Integer value1, Integer value2) {
            addCriterion("POSTSID between", value1, value2, "postsid");
            return (Criteria) this;
        }

        public Criteria andPostsidNotBetween(Integer value1, Integer value2) {
            addCriterion("POSTSID not between", value1, value2, "postsid");
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