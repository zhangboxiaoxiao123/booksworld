package com.books.po;

import java.util.ArrayList;
import java.util.List;

public class CommoditylistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommoditylistExample() {
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

        public Criteria andCpriceIsNull() {
            addCriterion("CPrice is null");
            return (Criteria) this;
        }

        public Criteria andCpriceIsNotNull() {
            addCriterion("CPrice is not null");
            return (Criteria) this;
        }

        public Criteria andCpriceEqualTo(Float value) {
            addCriterion("CPrice =", value, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceNotEqualTo(Float value) {
            addCriterion("CPrice <>", value, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceGreaterThan(Float value) {
            addCriterion("CPrice >", value, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("CPrice >=", value, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceLessThan(Float value) {
            addCriterion("CPrice <", value, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceLessThanOrEqualTo(Float value) {
            addCriterion("CPrice <=", value, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceIn(List<Float> values) {
            addCriterion("CPrice in", values, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceNotIn(List<Float> values) {
            addCriterion("CPrice not in", values, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceBetween(Float value1, Float value2) {
            addCriterion("CPrice between", value1, value2, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceNotBetween(Float value1, Float value2) {
            addCriterion("CPrice not between", value1, value2, "cprice");
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

        public Criteria andCnumberEqualTo(Integer value) {
            addCriterion("CNumber =", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberNotEqualTo(Integer value) {
            addCriterion("CNumber <>", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberGreaterThan(Integer value) {
            addCriterion("CNumber >", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("CNumber >=", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberLessThan(Integer value) {
            addCriterion("CNumber <", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberLessThanOrEqualTo(Integer value) {
            addCriterion("CNumber <=", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberIn(List<Integer> values) {
            addCriterion("CNumber in", values, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberNotIn(List<Integer> values) {
            addCriterion("CNumber not in", values, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberBetween(Integer value1, Integer value2) {
            addCriterion("CNumber between", value1, value2, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("CNumber not between", value1, value2, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("Comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("Comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("Comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("Comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("Comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("Comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("Comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("Comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("Comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("Comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("Comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("Comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("Comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("Comment not between", value1, value2, "comment");
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