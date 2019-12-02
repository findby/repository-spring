package com.sys.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserInfoPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoPOExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andTestUserUidIsNull() {
            addCriterion("test_user_uid is null");
            return (Criteria) this;
        }

        public Criteria andTestUserUidIsNotNull() {
            addCriterion("test_user_uid is not null");
            return (Criteria) this;
        }

        public Criteria andTestUserUidEqualTo(Integer value) {
            addCriterion("test_user_uid =", value, "testUserUid");
            return (Criteria) this;
        }

        public Criteria andTestUserUidNotEqualTo(Integer value) {
            addCriterion("test_user_uid <>", value, "testUserUid");
            return (Criteria) this;
        }

        public Criteria andTestUserUidGreaterThan(Integer value) {
            addCriterion("test_user_uid >", value, "testUserUid");
            return (Criteria) this;
        }

        public Criteria andTestUserUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_user_uid >=", value, "testUserUid");
            return (Criteria) this;
        }

        public Criteria andTestUserUidLessThan(Integer value) {
            addCriterion("test_user_uid <", value, "testUserUid");
            return (Criteria) this;
        }

        public Criteria andTestUserUidLessThanOrEqualTo(Integer value) {
            addCriterion("test_user_uid <=", value, "testUserUid");
            return (Criteria) this;
        }

        public Criteria andTestUserUidIn(List<Integer> values) {
            addCriterion("test_user_uid in", values, "testUserUid");
            return (Criteria) this;
        }

        public Criteria andTestUserUidNotIn(List<Integer> values) {
            addCriterion("test_user_uid not in", values, "testUserUid");
            return (Criteria) this;
        }

        public Criteria andTestUserUidBetween(Integer value1, Integer value2) {
            addCriterion("test_user_uid between", value1, value2, "testUserUid");
            return (Criteria) this;
        }

        public Criteria andTestUserUidNotBetween(Integer value1, Integer value2) {
            addCriterion("test_user_uid not between", value1, value2, "testUserUid");
            return (Criteria) this;
        }

        public Criteria andTestUserUnameIsNull() {
            addCriterion("test_user_uname is null");
            return (Criteria) this;
        }

        public Criteria andTestUserUnameIsNotNull() {
            addCriterion("test_user_uname is not null");
            return (Criteria) this;
        }

        public Criteria andTestUserUnameEqualTo(String value) {
            addCriterion("test_user_uname =", value, "testUserUname");
            return (Criteria) this;
        }

        public Criteria andTestUserUnameNotEqualTo(String value) {
            addCriterion("test_user_uname <>", value, "testUserUname");
            return (Criteria) this;
        }

        public Criteria andTestUserUnameGreaterThan(String value) {
            addCriterion("test_user_uname >", value, "testUserUname");
            return (Criteria) this;
        }

        public Criteria andTestUserUnameGreaterThanOrEqualTo(String value) {
            addCriterion("test_user_uname >=", value, "testUserUname");
            return (Criteria) this;
        }

        public Criteria andTestUserUnameLessThan(String value) {
            addCriterion("test_user_uname <", value, "testUserUname");
            return (Criteria) this;
        }

        public Criteria andTestUserUnameLessThanOrEqualTo(String value) {
            addCriterion("test_user_uname <=", value, "testUserUname");
            return (Criteria) this;
        }

        public Criteria andTestUserUnameLike(String value) {
            addCriterion("test_user_uname like", value, "testUserUname");
            return (Criteria) this;
        }

        public Criteria andTestUserUnameNotLike(String value) {
            addCriterion("test_user_uname not like", value, "testUserUname");
            return (Criteria) this;
        }

        public Criteria andTestUserUnameIn(List<String> values) {
            addCriterion("test_user_uname in", values, "testUserUname");
            return (Criteria) this;
        }

        public Criteria andTestUserUnameNotIn(List<String> values) {
            addCriterion("test_user_uname not in", values, "testUserUname");
            return (Criteria) this;
        }

        public Criteria andTestUserUnameBetween(String value1, String value2) {
            addCriterion("test_user_uname between", value1, value2, "testUserUname");
            return (Criteria) this;
        }

        public Criteria andTestUserUnameNotBetween(String value1, String value2) {
            addCriterion("test_user_uname not between", value1, value2, "testUserUname");
            return (Criteria) this;
        }

        public Criteria andTestUserPwdIsNull() {
            addCriterion("test_user_pwd is null");
            return (Criteria) this;
        }

        public Criteria andTestUserPwdIsNotNull() {
            addCriterion("test_user_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andTestUserPwdEqualTo(String value) {
            addCriterion("test_user_pwd =", value, "testUserPwd");
            return (Criteria) this;
        }

        public Criteria andTestUserPwdNotEqualTo(String value) {
            addCriterion("test_user_pwd <>", value, "testUserPwd");
            return (Criteria) this;
        }

        public Criteria andTestUserPwdGreaterThan(String value) {
            addCriterion("test_user_pwd >", value, "testUserPwd");
            return (Criteria) this;
        }

        public Criteria andTestUserPwdGreaterThanOrEqualTo(String value) {
            addCriterion("test_user_pwd >=", value, "testUserPwd");
            return (Criteria) this;
        }

        public Criteria andTestUserPwdLessThan(String value) {
            addCriterion("test_user_pwd <", value, "testUserPwd");
            return (Criteria) this;
        }

        public Criteria andTestUserPwdLessThanOrEqualTo(String value) {
            addCriterion("test_user_pwd <=", value, "testUserPwd");
            return (Criteria) this;
        }

        public Criteria andTestUserPwdLike(String value) {
            addCriterion("test_user_pwd like", value, "testUserPwd");
            return (Criteria) this;
        }

        public Criteria andTestUserPwdNotLike(String value) {
            addCriterion("test_user_pwd not like", value, "testUserPwd");
            return (Criteria) this;
        }

        public Criteria andTestUserPwdIn(List<String> values) {
            addCriterion("test_user_pwd in", values, "testUserPwd");
            return (Criteria) this;
        }

        public Criteria andTestUserPwdNotIn(List<String> values) {
            addCriterion("test_user_pwd not in", values, "testUserPwd");
            return (Criteria) this;
        }

        public Criteria andTestUserPwdBetween(String value1, String value2) {
            addCriterion("test_user_pwd between", value1, value2, "testUserPwd");
            return (Criteria) this;
        }

        public Criteria andTestUserPwdNotBetween(String value1, String value2) {
            addCriterion("test_user_pwd not between", value1, value2, "testUserPwd");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("LAST_LOGIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("LAST_LOGIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_LOGIN_TIME =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_LOGIN_TIME <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("LAST_LOGIN_TIME >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_LOGIN_TIME >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Date value) {
            addCriterionForJDBCDate("LAST_LOGIN_TIME <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_LOGIN_TIME <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Date> values) {
            addCriterionForJDBCDate("LAST_LOGIN_TIME in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("LAST_LOGIN_TIME not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LAST_LOGIN_TIME between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LAST_LOGIN_TIME not between", value1, value2, "lastLoginTime");
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