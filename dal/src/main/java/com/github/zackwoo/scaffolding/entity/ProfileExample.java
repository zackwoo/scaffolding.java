package com.github.zackwoo.scaffolding.entity;

import java.util.ArrayList;
import java.util.List;

public class ProfileExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PROFILE
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PROFILE
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PROFILE
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROFILE
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public ProfileExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROFILE
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROFILE
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROFILE
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROFILE
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROFILE
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROFILE
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROFILE
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROFILE
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROFILE
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROFILE
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PROFILE
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
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

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("USERID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("USERID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("USERID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andLangprefIsNull() {
            addCriterion("LANGPREF is null");
            return (Criteria) this;
        }

        public Criteria andLangprefIsNotNull() {
            addCriterion("LANGPREF is not null");
            return (Criteria) this;
        }

        public Criteria andLangprefEqualTo(String value) {
            addCriterion("LANGPREF =", value, "langpref");
            return (Criteria) this;
        }

        public Criteria andLangprefNotEqualTo(String value) {
            addCriterion("LANGPREF <>", value, "langpref");
            return (Criteria) this;
        }

        public Criteria andLangprefGreaterThan(String value) {
            addCriterion("LANGPREF >", value, "langpref");
            return (Criteria) this;
        }

        public Criteria andLangprefGreaterThanOrEqualTo(String value) {
            addCriterion("LANGPREF >=", value, "langpref");
            return (Criteria) this;
        }

        public Criteria andLangprefLessThan(String value) {
            addCriterion("LANGPREF <", value, "langpref");
            return (Criteria) this;
        }

        public Criteria andLangprefLessThanOrEqualTo(String value) {
            addCriterion("LANGPREF <=", value, "langpref");
            return (Criteria) this;
        }

        public Criteria andLangprefLike(String value) {
            addCriterion("LANGPREF like", value, "langpref");
            return (Criteria) this;
        }

        public Criteria andLangprefNotLike(String value) {
            addCriterion("LANGPREF not like", value, "langpref");
            return (Criteria) this;
        }

        public Criteria andLangprefIn(List<String> values) {
            addCriterion("LANGPREF in", values, "langpref");
            return (Criteria) this;
        }

        public Criteria andLangprefNotIn(List<String> values) {
            addCriterion("LANGPREF not in", values, "langpref");
            return (Criteria) this;
        }

        public Criteria andLangprefBetween(String value1, String value2) {
            addCriterion("LANGPREF between", value1, value2, "langpref");
            return (Criteria) this;
        }

        public Criteria andLangprefNotBetween(String value1, String value2) {
            addCriterion("LANGPREF not between", value1, value2, "langpref");
            return (Criteria) this;
        }

        public Criteria andFavcategoryIsNull() {
            addCriterion("FAVCATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andFavcategoryIsNotNull() {
            addCriterion("FAVCATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andFavcategoryEqualTo(String value) {
            addCriterion("FAVCATEGORY =", value, "favcategory");
            return (Criteria) this;
        }

        public Criteria andFavcategoryNotEqualTo(String value) {
            addCriterion("FAVCATEGORY <>", value, "favcategory");
            return (Criteria) this;
        }

        public Criteria andFavcategoryGreaterThan(String value) {
            addCriterion("FAVCATEGORY >", value, "favcategory");
            return (Criteria) this;
        }

        public Criteria andFavcategoryGreaterThanOrEqualTo(String value) {
            addCriterion("FAVCATEGORY >=", value, "favcategory");
            return (Criteria) this;
        }

        public Criteria andFavcategoryLessThan(String value) {
            addCriterion("FAVCATEGORY <", value, "favcategory");
            return (Criteria) this;
        }

        public Criteria andFavcategoryLessThanOrEqualTo(String value) {
            addCriterion("FAVCATEGORY <=", value, "favcategory");
            return (Criteria) this;
        }

        public Criteria andFavcategoryLike(String value) {
            addCriterion("FAVCATEGORY like", value, "favcategory");
            return (Criteria) this;
        }

        public Criteria andFavcategoryNotLike(String value) {
            addCriterion("FAVCATEGORY not like", value, "favcategory");
            return (Criteria) this;
        }

        public Criteria andFavcategoryIn(List<String> values) {
            addCriterion("FAVCATEGORY in", values, "favcategory");
            return (Criteria) this;
        }

        public Criteria andFavcategoryNotIn(List<String> values) {
            addCriterion("FAVCATEGORY not in", values, "favcategory");
            return (Criteria) this;
        }

        public Criteria andFavcategoryBetween(String value1, String value2) {
            addCriterion("FAVCATEGORY between", value1, value2, "favcategory");
            return (Criteria) this;
        }

        public Criteria andFavcategoryNotBetween(String value1, String value2) {
            addCriterion("FAVCATEGORY not between", value1, value2, "favcategory");
            return (Criteria) this;
        }

        public Criteria andMylistoptIsNull() {
            addCriterion("MYLISTOPT is null");
            return (Criteria) this;
        }

        public Criteria andMylistoptIsNotNull() {
            addCriterion("MYLISTOPT is not null");
            return (Criteria) this;
        }

        public Criteria andMylistoptEqualTo(Integer value) {
            addCriterion("MYLISTOPT =", value, "mylistopt");
            return (Criteria) this;
        }

        public Criteria andMylistoptNotEqualTo(Integer value) {
            addCriterion("MYLISTOPT <>", value, "mylistopt");
            return (Criteria) this;
        }

        public Criteria andMylistoptGreaterThan(Integer value) {
            addCriterion("MYLISTOPT >", value, "mylistopt");
            return (Criteria) this;
        }

        public Criteria andMylistoptGreaterThanOrEqualTo(Integer value) {
            addCriterion("MYLISTOPT >=", value, "mylistopt");
            return (Criteria) this;
        }

        public Criteria andMylistoptLessThan(Integer value) {
            addCriterion("MYLISTOPT <", value, "mylistopt");
            return (Criteria) this;
        }

        public Criteria andMylistoptLessThanOrEqualTo(Integer value) {
            addCriterion("MYLISTOPT <=", value, "mylistopt");
            return (Criteria) this;
        }

        public Criteria andMylistoptIn(List<Integer> values) {
            addCriterion("MYLISTOPT in", values, "mylistopt");
            return (Criteria) this;
        }

        public Criteria andMylistoptNotIn(List<Integer> values) {
            addCriterion("MYLISTOPT not in", values, "mylistopt");
            return (Criteria) this;
        }

        public Criteria andMylistoptBetween(Integer value1, Integer value2) {
            addCriterion("MYLISTOPT between", value1, value2, "mylistopt");
            return (Criteria) this;
        }

        public Criteria andMylistoptNotBetween(Integer value1, Integer value2) {
            addCriterion("MYLISTOPT not between", value1, value2, "mylistopt");
            return (Criteria) this;
        }

        public Criteria andBanneroptIsNull() {
            addCriterion("BANNEROPT is null");
            return (Criteria) this;
        }

        public Criteria andBanneroptIsNotNull() {
            addCriterion("BANNEROPT is not null");
            return (Criteria) this;
        }

        public Criteria andBanneroptEqualTo(Integer value) {
            addCriterion("BANNEROPT =", value, "banneropt");
            return (Criteria) this;
        }

        public Criteria andBanneroptNotEqualTo(Integer value) {
            addCriterion("BANNEROPT <>", value, "banneropt");
            return (Criteria) this;
        }

        public Criteria andBanneroptGreaterThan(Integer value) {
            addCriterion("BANNEROPT >", value, "banneropt");
            return (Criteria) this;
        }

        public Criteria andBanneroptGreaterThanOrEqualTo(Integer value) {
            addCriterion("BANNEROPT >=", value, "banneropt");
            return (Criteria) this;
        }

        public Criteria andBanneroptLessThan(Integer value) {
            addCriterion("BANNEROPT <", value, "banneropt");
            return (Criteria) this;
        }

        public Criteria andBanneroptLessThanOrEqualTo(Integer value) {
            addCriterion("BANNEROPT <=", value, "banneropt");
            return (Criteria) this;
        }

        public Criteria andBanneroptIn(List<Integer> values) {
            addCriterion("BANNEROPT in", values, "banneropt");
            return (Criteria) this;
        }

        public Criteria andBanneroptNotIn(List<Integer> values) {
            addCriterion("BANNEROPT not in", values, "banneropt");
            return (Criteria) this;
        }

        public Criteria andBanneroptBetween(Integer value1, Integer value2) {
            addCriterion("BANNEROPT between", value1, value2, "banneropt");
            return (Criteria) this;
        }

        public Criteria andBanneroptNotBetween(Integer value1, Integer value2) {
            addCriterion("BANNEROPT not between", value1, value2, "banneropt");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PROFILE
     *
     * @mbg.generated do_not_delete_during_merge Mon Apr 10 18:49:55 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PROFILE
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
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