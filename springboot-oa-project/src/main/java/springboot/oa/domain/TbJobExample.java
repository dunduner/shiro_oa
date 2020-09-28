package springboot.oa.domain;

import java.util.ArrayList;
import java.util.List;

public class TbJobExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbJobExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andRemanrkIsNull() {
            addCriterion("remanrk is null");
            return (Criteria) this;
        }

        public Criteria andRemanrkIsNotNull() {
            addCriterion("remanrk is not null");
            return (Criteria) this;
        }

        public Criteria andRemanrkEqualTo(String value) {
            addCriterion("remanrk =", value, "remanrk");
            return (Criteria) this;
        }

        public Criteria andRemanrkNotEqualTo(String value) {
            addCriterion("remanrk <>", value, "remanrk");
            return (Criteria) this;
        }

        public Criteria andRemanrkGreaterThan(String value) {
            addCriterion("remanrk >", value, "remanrk");
            return (Criteria) this;
        }

        public Criteria andRemanrkGreaterThanOrEqualTo(String value) {
            addCriterion("remanrk >=", value, "remanrk");
            return (Criteria) this;
        }

        public Criteria andRemanrkLessThan(String value) {
            addCriterion("remanrk <", value, "remanrk");
            return (Criteria) this;
        }

        public Criteria andRemanrkLessThanOrEqualTo(String value) {
            addCriterion("remanrk <=", value, "remanrk");
            return (Criteria) this;
        }

        public Criteria andRemanrkLike(String value) {
            addCriterion("remanrk like", value, "remanrk");
            return (Criteria) this;
        }

        public Criteria andRemanrkNotLike(String value) {
            addCriterion("remanrk not like", value, "remanrk");
            return (Criteria) this;
        }

        public Criteria andRemanrkIn(List<String> values) {
            addCriterion("remanrk in", values, "remanrk");
            return (Criteria) this;
        }

        public Criteria andRemanrkNotIn(List<String> values) {
            addCriterion("remanrk not in", values, "remanrk");
            return (Criteria) this;
        }

        public Criteria andRemanrkBetween(String value1, String value2) {
            addCriterion("remanrk between", value1, value2, "remanrk");
            return (Criteria) this;
        }

        public Criteria andRemanrkNotBetween(String value1, String value2) {
            addCriterion("remanrk not between", value1, value2, "remanrk");
            return (Criteria) this;
        }


        public Criteria andQzlqrxmIsNull() {
            addCriterion("qzlqrxm is null");
            return (Criteria) this;
        }
        public Criteria andQzlqrxmIsNotNull() {
            addCriterion("qzlqrxm is not null");
            return (Criteria) this;
        }

        public Criteria andQzlqrxmEqualTo(String value) {
            addCriterion("qzlqrxm =", value, "qzlqrxm");
            return (Criteria) this;
        }

        public Criteria andQzlqrxmNotEqualTo(String value) {
            addCriterion("qzlqrxm <>", value, "qzlqrxm");
            return (Criteria) this;
        }

        public Criteria andQzlqrxmGreaterThan(String value) {
            addCriterion("qzlqrxm >", value, "qzlqrxm");
            return (Criteria) this;
        }

        public Criteria andQzlqrxmGreaterThanOrEqualTo(String value) {
            addCriterion("qzlqrxm >=", value, "qzlqrxm");
            return (Criteria) this;
        }

        public Criteria andQzlqrxmLessThan(String value) {
            addCriterion("qzlqrxm <", value, "qzlqrxm");
            return (Criteria) this;
        }

        public Criteria andQzlqrxmLessThanOrEqualTo(String value) {
            addCriterion("qzlqrxm <=", value, "qzlqrxm");
            return (Criteria) this;
        }

        public Criteria andQzlqrxmLike(String value) {
            addCriterion("qzlqrxm like", value, "qzlqrxm");
            return (Criteria) this;
        }

        public Criteria andQzlqrxmNotLike(String value) {
            addCriterion("qzlqrxm not like", value, "qzlqrxm");
            return (Criteria) this;
        }

        public Criteria andQzlqrxmIn(List<String> values) {
            addCriterion("qzlqrxm in", values, "qzlqrxm");
            return (Criteria) this;
        }

        public Criteria andQzlqrxmNotIn(List<String> values) {
            addCriterion("qzlqrxm not in", values, "qzlqrxm");
            return (Criteria) this;
        }

        public Criteria andQzlqrxmBetween(String value1, String value2) {
            addCriterion("qzlqrxm between", value1, value2, "qzlqrxm");
            return (Criteria) this;
        }

        public Criteria andQzlqrxmNotBetween(String value1, String value2) {
            addCriterion("qzlqrxm not between", value1, value2, "qzlqrxm");
            return (Criteria) this;
        }


        public Criteria andQzlqrzjhmIsNull() {
            addCriterion("qzlqrzjhm is null");
            return (Criteria) this;
        }
        public Criteria andQzlqrzjhmIsNotNull() {
            addCriterion("qzlqrzjhm is not null");
            return (Criteria) this;
        }

        public Criteria andQzlqrzjhmEqualTo(String value) {
            addCriterion("qzlqrzjhm =", value, "qzlqrzjhm");
            return (Criteria) this;
        }

        public Criteria andQzlqrzjhmNotEqualTo(String value) {
            addCriterion("qzlqrzjhm <>", value, "qzlqrzjhm");
            return (Criteria) this;
        }

        public Criteria andQzlqrzjhmGreaterThan(String value) {
            addCriterion("qzlqrzjhm >", value, "qzlqrzjhm");
            return (Criteria) this;
        }

        public Criteria andQzlqrzjhmGreaterThanOrEqualTo(String value) {
            addCriterion("qzlqrzjhm >=", value, "qzlqrzjhm");
            return (Criteria) this;
        }

        public Criteria andQzlqrzjhmLessThan(String value) {
            addCriterion("qzlqrzjhm <", value, "qzlqrzjhm");
            return (Criteria) this;
        }

        public Criteria andQzlqrzjhmLessThanOrEqualTo(String value) {
            addCriterion("qzlqrzjhm <=", value, "qzlqrzjhm");
            return (Criteria) this;
        }

        public Criteria andQzlqrzjhmLike(String value) {
            addCriterion("qzlqrzjhm like", value, "qzlqrzjhm");
            return (Criteria) this;
        }

        public Criteria andQzlqrzjhmNotLike(String value) {
            addCriterion("qzlqrzjhm not like", value, "qzlqrzjhm");
            return (Criteria) this;
        }

        public Criteria andQzlqrzjhmIn(List<String> values) {
            addCriterion("qzlqrzjhm in", values, "qzlqrzjhm");
            return (Criteria) this;
        }

        public Criteria andQzlqrzjhmNotIn(List<String> values) {
            addCriterion("qzlqrzjhm not in", values, "qzlqrzjhm");
            return (Criteria) this;
        }

        public Criteria andQzlqrzjhmBetween(String value1, String value2) {
            addCriterion("qzlqrzjhm between", value1, value2, "qzlqrzjhm");
            return (Criteria) this;
        }

        public Criteria andQzlqrzjhmNotBetween(String value1, String value2) {
            addCriterion("qzlqrzjhm not between", value1, value2, "qzlqrzjhm");
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