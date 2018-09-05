package com.books.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrderlistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderlistExample() {
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

        public Criteria andOidIsNull() {
            addCriterion("OID is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("OID is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Integer value) {
            addCriterion("OID =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Integer value) {
            addCriterion("OID <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Integer value) {
            addCriterion("OID >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("OID >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Integer value) {
            addCriterion("OID <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("OID <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Integer> values) {
            addCriterion("OID in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Integer> values) {
            addCriterion("OID not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("OID between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("OID not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("CID is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("CID is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("CID =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("CID <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("CID >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CID >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("CID <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("CID <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("CID in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("CID not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("CID between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("CID not between", value1, value2, "cid");
            return (Criteria) this;
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

        public Criteria andOdateIsNull() {
            addCriterion("ODate is null");
            return (Criteria) this;
        }

        public Criteria andOdateIsNotNull() {
            addCriterion("ODate is not null");
            return (Criteria) this;
        }

        public Criteria andOdateEqualTo(Date value) {
            addCriterionForJDBCDate("ODate =", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ODate <>", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateGreaterThan(Date value) {
            addCriterionForJDBCDate("ODate >", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ODate >=", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateLessThan(Date value) {
            addCriterionForJDBCDate("ODate <", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ODate <=", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateIn(List<Date> values) {
            addCriterionForJDBCDate("ODate in", values, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ODate not in", values, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ODate between", value1, value2, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ODate not between", value1, value2, "odate");
            return (Criteria) this;
        }

        public Criteria andCnameIsNull() {
            addCriterion("CName is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("CName is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("CName =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("CName <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("CName >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("CName >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("CName <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("CName <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("CName like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("CName not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("CName in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("CName not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("CName between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("CName not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andSumIsNull() {
            addCriterion("Sum is null");
            return (Criteria) this;
        }

        public Criteria andSumIsNotNull() {
            addCriterion("Sum is not null");
            return (Criteria) this;
        }

        public Criteria andSumEqualTo(Float value) {
            addCriterion("Sum =", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotEqualTo(Float value) {
            addCriterion("Sum <>", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumGreaterThan(Float value) {
            addCriterion("Sum >", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumGreaterThanOrEqualTo(Float value) {
            addCriterion("Sum >=", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumLessThan(Float value) {
            addCriterion("Sum <", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumLessThanOrEqualTo(Float value) {
            addCriterion("Sum <=", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumIn(List<Float> values) {
            addCriterion("Sum in", values, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotIn(List<Float> values) {
            addCriterion("Sum not in", values, "sum");
            return (Criteria) this;
        }

        public Criteria andSumBetween(Float value1, Float value2) {
            addCriterion("Sum between", value1, value2, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotBetween(Float value1, Float value2) {
            addCriterion("Sum not between", value1, value2, "sum");
            return (Criteria) this;
        }

        public Criteria andCtypeIsNull() {
            addCriterion("CType is null");
            return (Criteria) this;
        }

        public Criteria andCtypeIsNotNull() {
            addCriterion("CType is not null");
            return (Criteria) this;
        }

        public Criteria andCtypeEqualTo(String value) {
            addCriterion("CType =", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotEqualTo(String value) {
            addCriterion("CType <>", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeGreaterThan(String value) {
            addCriterion("CType >", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeGreaterThanOrEqualTo(String value) {
            addCriterion("CType >=", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLessThan(String value) {
            addCriterion("CType <", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLessThanOrEqualTo(String value) {
            addCriterion("CType <=", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLike(String value) {
            addCriterion("CType like", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotLike(String value) {
            addCriterion("CType not like", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeIn(List<String> values) {
            addCriterion("CType in", values, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotIn(List<String> values) {
            addCriterion("CType not in", values, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeBetween(String value1, String value2) {
            addCriterion("CType between", value1, value2, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotBetween(String value1, String value2) {
            addCriterion("CType not between", value1, value2, "ctype");
            return (Criteria) this;
        }

        public Criteria andCnumberIsNull() {
            addCriterion("CNumber is null");
            return (Criteria) this;
        }

        public Criteria andCnumberIsNotNull() {
            addCriterion("CNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCnumberEqualTo(String value) {
            addCriterion("CNumber =", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberNotEqualTo(String value) {
            addCriterion("CNumber <>", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberGreaterThan(String value) {
            addCriterion("CNumber >", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberGreaterThanOrEqualTo(String value) {
            addCriterion("CNumber >=", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberLessThan(String value) {
            addCriterion("CNumber <", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberLessThanOrEqualTo(String value) {
            addCriterion("CNumber <=", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberLike(String value) {
            addCriterion("CNumber like", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberNotLike(String value) {
            addCriterion("CNumber not like", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberIn(List<String> values) {
            addCriterion("CNumber in", values, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberNotIn(List<String> values) {
            addCriterion("CNumber not in", values, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberBetween(String value1, String value2) {
            addCriterion("CNumber between", value1, value2, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberNotBetween(String value1, String value2) {
            addCriterion("CNumber not between", value1, value2, "cnumber");
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

        public Criteria andOstatusIsNull() {
            addCriterion("OStatus is null");
            return (Criteria) this;
        }

        public Criteria andOstatusIsNotNull() {
            addCriterion("OStatus is not null");
            return (Criteria) this;
        }

        public Criteria andOstatusEqualTo(String value) {
            addCriterion("OStatus =", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusNotEqualTo(String value) {
            addCriterion("OStatus <>", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusGreaterThan(String value) {
            addCriterion("OStatus >", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusGreaterThanOrEqualTo(String value) {
            addCriterion("OStatus >=", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusLessThan(String value) {
            addCriterion("OStatus <", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusLessThanOrEqualTo(String value) {
            addCriterion("OStatus <=", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusLike(String value) {
            addCriterion("OStatus like", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusNotLike(String value) {
            addCriterion("OStatus not like", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusIn(List<String> values) {
            addCriterion("OStatus in", values, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusNotIn(List<String> values) {
            addCriterion("OStatus not in", values, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusBetween(String value1, String value2) {
            addCriterion("OStatus between", value1, value2, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusNotBetween(String value1, String value2) {
            addCriterion("OStatus not between", value1, value2, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOperiodIsNull() {
            addCriterion("OPeriod is null");
            return (Criteria) this;
        }

        public Criteria andOperiodIsNotNull() {
            addCriterion("OPeriod is not null");
            return (Criteria) this;
        }

        public Criteria andOperiodEqualTo(Date value) {
            addCriterionForJDBCDate("OPeriod =", value, "operiod");
            return (Criteria) this;
        }

        public Criteria andOperiodNotEqualTo(Date value) {
            addCriterionForJDBCDate("OPeriod <>", value, "operiod");
            return (Criteria) this;
        }

        public Criteria andOperiodGreaterThan(Date value) {
            addCriterionForJDBCDate("OPeriod >", value, "operiod");
            return (Criteria) this;
        }

        public Criteria andOperiodGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OPeriod >=", value, "operiod");
            return (Criteria) this;
        }

        public Criteria andOperiodLessThan(Date value) {
            addCriterionForJDBCDate("OPeriod <", value, "operiod");
            return (Criteria) this;
        }

        public Criteria andOperiodLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OPeriod <=", value, "operiod");
            return (Criteria) this;
        }

        public Criteria andOperiodIn(List<Date> values) {
            addCriterionForJDBCDate("OPeriod in", values, "operiod");
            return (Criteria) this;
        }

        public Criteria andOperiodNotIn(List<Date> values) {
            addCriterionForJDBCDate("OPeriod not in", values, "operiod");
            return (Criteria) this;
        }

        public Criteria andOperiodBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OPeriod between", value1, value2, "operiod");
            return (Criteria) this;
        }

        public Criteria andOperiodNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OPeriod not between", value1, value2, "operiod");
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