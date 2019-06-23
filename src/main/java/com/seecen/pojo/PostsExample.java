package com.seecen.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostsExample() {
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

        public Criteria andPoststitleIsNull() {
            addCriterion("POSTSTITLE is null");
            return (Criteria) this;
        }

        public Criteria andPoststitleIsNotNull() {
            addCriterion("POSTSTITLE is not null");
            return (Criteria) this;
        }

        public Criteria andPoststitleEqualTo(String value) {
            addCriterion("POSTSTITLE =", value, "poststitle");
            return (Criteria) this;
        }

        public Criteria andPoststitleNotEqualTo(String value) {
            addCriterion("POSTSTITLE <>", value, "poststitle");
            return (Criteria) this;
        }

        public Criteria andPoststitleGreaterThan(String value) {
            addCriterion("POSTSTITLE >", value, "poststitle");
            return (Criteria) this;
        }

        public Criteria andPoststitleGreaterThanOrEqualTo(String value) {
            addCriterion("POSTSTITLE >=", value, "poststitle");
            return (Criteria) this;
        }

        public Criteria andPoststitleLessThan(String value) {
            addCriterion("POSTSTITLE <", value, "poststitle");
            return (Criteria) this;
        }

        public Criteria andPoststitleLessThanOrEqualTo(String value) {
            addCriterion("POSTSTITLE <=", value, "poststitle");
            return (Criteria) this;
        }

        public Criteria andPoststitleLike(String value) {
            addCriterion("POSTSTITLE like", value, "poststitle");
            return (Criteria) this;
        }

        public Criteria andPoststitleNotLike(String value) {
            addCriterion("POSTSTITLE not like", value, "poststitle");
            return (Criteria) this;
        }

        public Criteria andPoststitleIn(List<String> values) {
            addCriterion("POSTSTITLE in", values, "poststitle");
            return (Criteria) this;
        }

        public Criteria andPoststitleNotIn(List<String> values) {
            addCriterion("POSTSTITLE not in", values, "poststitle");
            return (Criteria) this;
        }

        public Criteria andPoststitleBetween(String value1, String value2) {
            addCriterion("POSTSTITLE between", value1, value2, "poststitle");
            return (Criteria) this;
        }

        public Criteria andPoststitleNotBetween(String value1, String value2) {
            addCriterion("POSTSTITLE not between", value1, value2, "poststitle");
            return (Criteria) this;
        }

        public Criteria andPostscontentIsNull() {
            addCriterion("POSTSCONTENT is null");
            return (Criteria) this;
        }

        public Criteria andPostscontentIsNotNull() {
            addCriterion("POSTSCONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andPostscontentEqualTo(String value) {
            addCriterion("POSTSCONTENT =", value, "postscontent");
            return (Criteria) this;
        }

        public Criteria andPostscontentNotEqualTo(String value) {
            addCriterion("POSTSCONTENT <>", value, "postscontent");
            return (Criteria) this;
        }

        public Criteria andPostscontentGreaterThan(String value) {
            addCriterion("POSTSCONTENT >", value, "postscontent");
            return (Criteria) this;
        }

        public Criteria andPostscontentGreaterThanOrEqualTo(String value) {
            addCriterion("POSTSCONTENT >=", value, "postscontent");
            return (Criteria) this;
        }

        public Criteria andPostscontentLessThan(String value) {
            addCriterion("POSTSCONTENT <", value, "postscontent");
            return (Criteria) this;
        }

        public Criteria andPostscontentLessThanOrEqualTo(String value) {
            addCriterion("POSTSCONTENT <=", value, "postscontent");
            return (Criteria) this;
        }

        public Criteria andPostscontentLike(String value) {
            addCriterion("POSTSCONTENT like", value, "postscontent");
            return (Criteria) this;
        }

        public Criteria andPostscontentNotLike(String value) {
            addCriterion("POSTSCONTENT not like", value, "postscontent");
            return (Criteria) this;
        }

        public Criteria andPostscontentIn(List<String> values) {
            addCriterion("POSTSCONTENT in", values, "postscontent");
            return (Criteria) this;
        }

        public Criteria andPostscontentNotIn(List<String> values) {
            addCriterion("POSTSCONTENT not in", values, "postscontent");
            return (Criteria) this;
        }

        public Criteria andPostscontentBetween(String value1, String value2) {
            addCriterion("POSTSCONTENT between", value1, value2, "postscontent");
            return (Criteria) this;
        }

        public Criteria andPostscontentNotBetween(String value1, String value2) {
            addCriterion("POSTSCONTENT not between", value1, value2, "postscontent");
            return (Criteria) this;
        }

        public Criteria andReleasetimeIsNull() {
            addCriterion("RELEASETIME is null");
            return (Criteria) this;
        }

        public Criteria andReleasetimeIsNotNull() {
            addCriterion("RELEASETIME is not null");
            return (Criteria) this;
        }

        public Criteria andReleasetimeEqualTo(Date value) {
            addCriterion("RELEASETIME =", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeNotEqualTo(Date value) {
            addCriterion("RELEASETIME <>", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeGreaterThan(Date value) {
            addCriterion("RELEASETIME >", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RELEASETIME >=", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeLessThan(Date value) {
            addCriterion("RELEASETIME <", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeLessThanOrEqualTo(Date value) {
            addCriterion("RELEASETIME <=", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeIn(List<Date> values) {
            addCriterion("RELEASETIME in", values, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeNotIn(List<Date> values) {
            addCriterion("RELEASETIME not in", values, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeBetween(Date value1, Date value2) {
            addCriterion("RELEASETIME between", value1, value2, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeNotBetween(Date value1, Date value2) {
            addCriterion("RELEASETIME not between", value1, value2, "releasetime");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("PICTURE is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("PICTURE is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("PICTURE =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("PICTURE <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("PICTURE >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("PICTURE >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("PICTURE <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("PICTURE <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("PICTURE like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("PICTURE not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("PICTURE in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("PICTURE not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("PICTURE between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("PICTURE not between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andLikenumintIsNull() {
            addCriterion("LIKENUMINT is null");
            return (Criteria) this;
        }

        public Criteria andLikenumintIsNotNull() {
            addCriterion("LIKENUMINT is not null");
            return (Criteria) this;
        }

        public Criteria andLikenumintEqualTo(Long value) {
            addCriterion("LIKENUMINT =", value, "likenumint");
            return (Criteria) this;
        }

        public Criteria andLikenumintNotEqualTo(Long value) {
            addCriterion("LIKENUMINT <>", value, "likenumint");
            return (Criteria) this;
        }

        public Criteria andLikenumintGreaterThan(Long value) {
            addCriterion("LIKENUMINT >", value, "likenumint");
            return (Criteria) this;
        }

        public Criteria andLikenumintGreaterThanOrEqualTo(Long value) {
            addCriterion("LIKENUMINT >=", value, "likenumint");
            return (Criteria) this;
        }

        public Criteria andLikenumintLessThan(Long value) {
            addCriterion("LIKENUMINT <", value, "likenumint");
            return (Criteria) this;
        }

        public Criteria andLikenumintLessThanOrEqualTo(Long value) {
            addCriterion("LIKENUMINT <=", value, "likenumint");
            return (Criteria) this;
        }

        public Criteria andLikenumintIn(List<Long> values) {
            addCriterion("LIKENUMINT in", values, "likenumint");
            return (Criteria) this;
        }

        public Criteria andLikenumintNotIn(List<Long> values) {
            addCriterion("LIKENUMINT not in", values, "likenumint");
            return (Criteria) this;
        }

        public Criteria andLikenumintBetween(Long value1, Long value2) {
            addCriterion("LIKENUMINT between", value1, value2, "likenumint");
            return (Criteria) this;
        }

        public Criteria andLikenumintNotBetween(Long value1, Long value2) {
            addCriterion("LIKENUMINT not between", value1, value2, "likenumint");
            return (Criteria) this;
        }

        public Criteria andPostsheatIsNull() {
            addCriterion("POSTSHEAT is null");
            return (Criteria) this;
        }

        public Criteria andPostsheatIsNotNull() {
            addCriterion("POSTSHEAT is not null");
            return (Criteria) this;
        }

        public Criteria andPostsheatEqualTo(Long value) {
            addCriterion("POSTSHEAT =", value, "postsheat");
            return (Criteria) this;
        }

        public Criteria andPostsheatNotEqualTo(Long value) {
            addCriterion("POSTSHEAT <>", value, "postsheat");
            return (Criteria) this;
        }

        public Criteria andPostsheatGreaterThan(Long value) {
            addCriterion("POSTSHEAT >", value, "postsheat");
            return (Criteria) this;
        }

        public Criteria andPostsheatGreaterThanOrEqualTo(Long value) {
            addCriterion("POSTSHEAT >=", value, "postsheat");
            return (Criteria) this;
        }

        public Criteria andPostsheatLessThan(Long value) {
            addCriterion("POSTSHEAT <", value, "postsheat");
            return (Criteria) this;
        }

        public Criteria andPostsheatLessThanOrEqualTo(Long value) {
            addCriterion("POSTSHEAT <=", value, "postsheat");
            return (Criteria) this;
        }

        public Criteria andPostsheatIn(List<Long> values) {
            addCriterion("POSTSHEAT in", values, "postsheat");
            return (Criteria) this;
        }

        public Criteria andPostsheatNotIn(List<Long> values) {
            addCriterion("POSTSHEAT not in", values, "postsheat");
            return (Criteria) this;
        }

        public Criteria andPostsheatBetween(Long value1, Long value2) {
            addCriterion("POSTSHEAT between", value1, value2, "postsheat");
            return (Criteria) this;
        }

        public Criteria andPostsheatNotBetween(Long value1, Long value2) {
            addCriterion("POSTSHEAT not between", value1, value2, "postsheat");
            return (Criteria) this;
        }

        public Criteria andCommentidIsNull() {
            addCriterion("COMMENTID is null");
            return (Criteria) this;
        }

        public Criteria andCommentidIsNotNull() {
            addCriterion("COMMENTID is not null");
            return (Criteria) this;
        }

        public Criteria andCommentidEqualTo(Long value) {
            addCriterion("COMMENTID =", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotEqualTo(Long value) {
            addCriterion("COMMENTID <>", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidGreaterThan(Long value) {
            addCriterion("COMMENTID >", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidGreaterThanOrEqualTo(Long value) {
            addCriterion("COMMENTID >=", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidLessThan(Long value) {
            addCriterion("COMMENTID <", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidLessThanOrEqualTo(Long value) {
            addCriterion("COMMENTID <=", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidIn(List<Long> values) {
            addCriterion("COMMENTID in", values, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotIn(List<Long> values) {
            addCriterion("COMMENTID not in", values, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidBetween(Long value1, Long value2) {
            addCriterion("COMMENTID between", value1, value2, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotBetween(Long value1, Long value2) {
            addCriterion("COMMENTID not between", value1, value2, "commentid");
            return (Criteria) this;
        }

        public Criteria andPoststypeIsNull() {
            addCriterion("POSTSTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPoststypeIsNotNull() {
            addCriterion("POSTSTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPoststypeEqualTo(Integer value) {
            addCriterion("POSTSTYPE =", value, "poststype");
            return (Criteria) this;
        }

        public Criteria andPoststypeNotEqualTo(Integer value) {
            addCriterion("POSTSTYPE <>", value, "poststype");
            return (Criteria) this;
        }

        public Criteria andPoststypeGreaterThan(Integer value) {
            addCriterion("POSTSTYPE >", value, "poststype");
            return (Criteria) this;
        }

        public Criteria andPoststypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("POSTSTYPE >=", value, "poststype");
            return (Criteria) this;
        }

        public Criteria andPoststypeLessThan(Integer value) {
            addCriterion("POSTSTYPE <", value, "poststype");
            return (Criteria) this;
        }

        public Criteria andPoststypeLessThanOrEqualTo(Integer value) {
            addCriterion("POSTSTYPE <=", value, "poststype");
            return (Criteria) this;
        }

        public Criteria andPoststypeIn(List<Integer> values) {
            addCriterion("POSTSTYPE in", values, "poststype");
            return (Criteria) this;
        }

        public Criteria andPoststypeNotIn(List<Integer> values) {
            addCriterion("POSTSTYPE not in", values, "poststype");
            return (Criteria) this;
        }

        public Criteria andPoststypeBetween(Integer value1, Integer value2) {
            addCriterion("POSTSTYPE between", value1, value2, "poststype");
            return (Criteria) this;
        }

        public Criteria andPoststypeNotBetween(Integer value1, Integer value2) {
            addCriterion("POSTSTYPE not between", value1, value2, "poststype");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("USERID not between", value1, value2, "userid");
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