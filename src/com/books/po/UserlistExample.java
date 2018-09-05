package com.books.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserlistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserlistExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("UID is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("UID is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("UID =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("UID <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("UID >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("UID >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("UID <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("UID <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("UID in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("UID not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("UID between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("UID not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUnameIsNull() {
            addCriterion("UName is null");
            return (Criteria) this;
        }

        public Criteria andUnameIsNotNull() {
            addCriterion("UName is not null");
            return (Criteria) this;
        }

        public Criteria andUnameEqualTo(String value) {
            addCriterion("UName =", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotEqualTo(String value) {
            addCriterion("UName <>", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThan(String value) {
            addCriterion("UName >", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThanOrEqualTo(String value) {
            addCriterion("UName >=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThan(String value) {
            addCriterion("UName <", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThanOrEqualTo(String value) {
            addCriterion("UName <=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLike(String value) {
            addCriterion("UName like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotLike(String value) {
            addCriterion("UName not like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameIn(List<String> values) {
            addCriterion("UName in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotIn(List<String> values) {
            addCriterion("UName not in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameBetween(String value1, String value2) {
            addCriterion("UName between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotBetween(String value1, String value2) {
            addCriterion("UName not between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUpwdIsNull() {
            addCriterion("UPwd is null");
            return (Criteria) this;
        }

        public Criteria andUpwdIsNotNull() {
            addCriterion("UPwd is not null");
            return (Criteria) this;
        }

        public Criteria andUpwdEqualTo(String value) {
            addCriterion("UPwd =", value, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdNotEqualTo(String value) {
            addCriterion("UPwd <>", value, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdGreaterThan(String value) {
            addCriterion("UPwd >", value, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdGreaterThanOrEqualTo(String value) {
            addCriterion("UPwd >=", value, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdLessThan(String value) {
            addCriterion("UPwd <", value, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdLessThanOrEqualTo(String value) {
            addCriterion("UPwd <=", value, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdLike(String value) {
            addCriterion("UPwd like", value, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdNotLike(String value) {
            addCriterion("UPwd not like", value, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdIn(List<String> values) {
            addCriterion("UPwd in", values, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdNotIn(List<String> values) {
            addCriterion("UPwd not in", values, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdBetween(String value1, String value2) {
            addCriterion("UPwd between", value1, value2, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdNotBetween(String value1, String value2) {
            addCriterion("UPwd not between", value1, value2, "upwd");
            return (Criteria) this;
        }

        public Criteria andUaddressIsNull() {
            addCriterion("Uaddress is null");
            return (Criteria) this;
        }

        public Criteria andUaddressIsNotNull() {
            addCriterion("Uaddress is not null");
            return (Criteria) this;
        }

        public Criteria andUaddressEqualTo(String value) {
            addCriterion("Uaddress =", value, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressNotEqualTo(String value) {
            addCriterion("Uaddress <>", value, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressGreaterThan(String value) {
            addCriterion("Uaddress >", value, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressGreaterThanOrEqualTo(String value) {
            addCriterion("Uaddress >=", value, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressLessThan(String value) {
            addCriterion("Uaddress <", value, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressLessThanOrEqualTo(String value) {
            addCriterion("Uaddress <=", value, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressLike(String value) {
            addCriterion("Uaddress like", value, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressNotLike(String value) {
            addCriterion("Uaddress not like", value, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressIn(List<String> values) {
            addCriterion("Uaddress in", values, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressNotIn(List<String> values) {
            addCriterion("Uaddress not in", values, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressBetween(String value1, String value2) {
            addCriterion("Uaddress between", value1, value2, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressNotBetween(String value1, String value2) {
            addCriterion("Uaddress not between", value1, value2, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUzipIsNull() {
            addCriterion("UZIP is null");
            return (Criteria) this;
        }

        public Criteria andUzipIsNotNull() {
            addCriterion("UZIP is not null");
            return (Criteria) this;
        }

        public Criteria andUzipEqualTo(String value) {
            addCriterion("UZIP =", value, "uzip");
            return (Criteria) this;
        }

        public Criteria andUzipNotEqualTo(String value) {
            addCriterion("UZIP <>", value, "uzip");
            return (Criteria) this;
        }

        public Criteria andUzipGreaterThan(String value) {
            addCriterion("UZIP >", value, "uzip");
            return (Criteria) this;
        }

        public Criteria andUzipGreaterThanOrEqualTo(String value) {
            addCriterion("UZIP >=", value, "uzip");
            return (Criteria) this;
        }

        public Criteria andUzipLessThan(String value) {
            addCriterion("UZIP <", value, "uzip");
            return (Criteria) this;
        }

        public Criteria andUzipLessThanOrEqualTo(String value) {
            addCriterion("UZIP <=", value, "uzip");
            return (Criteria) this;
        }

        public Criteria andUzipLike(String value) {
            addCriterion("UZIP like", value, "uzip");
            return (Criteria) this;
        }

        public Criteria andUzipNotLike(String value) {
            addCriterion("UZIP not like", value, "uzip");
            return (Criteria) this;
        }

        public Criteria andUzipIn(List<String> values) {
            addCriterion("UZIP in", values, "uzip");
            return (Criteria) this;
        }

        public Criteria andUzipNotIn(List<String> values) {
            addCriterion("UZIP not in", values, "uzip");
            return (Criteria) this;
        }

        public Criteria andUzipBetween(String value1, String value2) {
            addCriterion("UZIP between", value1, value2, "uzip");
            return (Criteria) this;
        }

        public Criteria andUzipNotBetween(String value1, String value2) {
            addCriterion("UZIP not between", value1, value2, "uzip");
            return (Criteria) this;
        }

        public Criteria andUphoneIsNull() {
            addCriterion("UPhone is null");
            return (Criteria) this;
        }

        public Criteria andUphoneIsNotNull() {
            addCriterion("UPhone is not null");
            return (Criteria) this;
        }

        public Criteria andUphoneEqualTo(String value) {
            addCriterion("UPhone =", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotEqualTo(String value) {
            addCriterion("UPhone <>", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneGreaterThan(String value) {
            addCriterion("UPhone >", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneGreaterThanOrEqualTo(String value) {
            addCriterion("UPhone >=", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneLessThan(String value) {
            addCriterion("UPhone <", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneLessThanOrEqualTo(String value) {
            addCriterion("UPhone <=", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneLike(String value) {
            addCriterion("UPhone like", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotLike(String value) {
            addCriterion("UPhone not like", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneIn(List<String> values) {
            addCriterion("UPhone in", values, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotIn(List<String> values) {
            addCriterion("UPhone not in", values, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneBetween(String value1, String value2) {
            addCriterion("UPhone between", value1, value2, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotBetween(String value1, String value2) {
            addCriterion("UPhone not between", value1, value2, "uphone");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("Gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("Gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("Gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("Gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("Gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("Gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("Gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("Gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("Gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("Gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("Gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("Gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("Gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("Gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("Birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("Birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("Birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("Birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("Birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("Birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("Birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("Birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andIdentificationIsNull() {
            addCriterion("Identification is null");
            return (Criteria) this;
        }

        public Criteria andIdentificationIsNotNull() {
            addCriterion("Identification is not null");
            return (Criteria) this;
        }

        public Criteria andIdentificationEqualTo(Integer value) {
            addCriterion("Identification =", value, "identification");
            return (Criteria) this;
        }

        public Criteria andIdentificationNotEqualTo(Integer value) {
            addCriterion("Identification <>", value, "identification");
            return (Criteria) this;
        }

        public Criteria andIdentificationGreaterThan(Integer value) {
            addCriterion("Identification >", value, "identification");
            return (Criteria) this;
        }

        public Criteria andIdentificationGreaterThanOrEqualTo(Integer value) {
            addCriterion("Identification >=", value, "identification");
            return (Criteria) this;
        }

        public Criteria andIdentificationLessThan(Integer value) {
            addCriterion("Identification <", value, "identification");
            return (Criteria) this;
        }

        public Criteria andIdentificationLessThanOrEqualTo(Integer value) {
            addCriterion("Identification <=", value, "identification");
            return (Criteria) this;
        }

        public Criteria andIdentificationIn(List<Integer> values) {
            addCriterion("Identification in", values, "identification");
            return (Criteria) this;
        }

        public Criteria andIdentificationNotIn(List<Integer> values) {
            addCriterion("Identification not in", values, "identification");
            return (Criteria) this;
        }

        public Criteria andIdentificationBetween(Integer value1, Integer value2) {
            addCriterion("Identification between", value1, value2, "identification");
            return (Criteria) this;
        }

        public Criteria andIdentificationNotBetween(Integer value1, Integer value2) {
            addCriterion("Identification not between", value1, value2, "identification");
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