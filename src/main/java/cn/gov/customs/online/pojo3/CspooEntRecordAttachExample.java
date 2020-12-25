package cn.gov.customs.online.pojo3;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CspooEntRecordAttachExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CspooEntRecordAttachExample() {
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

        public Criteria andAttachNoIsNull() {
            addCriterion("ATTACH_NO is null");
            return (Criteria) this;
        }

        public Criteria andAttachNoIsNotNull() {
            addCriterion("ATTACH_NO is not null");
            return (Criteria) this;
        }

        public Criteria andAttachNoEqualTo(String value) {
            addCriterion("ATTACH_NO =", value, "attachNo");
            return (Criteria) this;
        }

        public Criteria andAttachNoNotEqualTo(String value) {
            addCriterion("ATTACH_NO <>", value, "attachNo");
            return (Criteria) this;
        }

        public Criteria andAttachNoGreaterThan(String value) {
            addCriterion("ATTACH_NO >", value, "attachNo");
            return (Criteria) this;
        }

        public Criteria andAttachNoGreaterThanOrEqualTo(String value) {
            addCriterion("ATTACH_NO >=", value, "attachNo");
            return (Criteria) this;
        }

        public Criteria andAttachNoLessThan(String value) {
            addCriterion("ATTACH_NO <", value, "attachNo");
            return (Criteria) this;
        }

        public Criteria andAttachNoLessThanOrEqualTo(String value) {
            addCriterion("ATTACH_NO <=", value, "attachNo");
            return (Criteria) this;
        }

        public Criteria andAttachNoLike(String value) {
            addCriterion("ATTACH_NO like", value, "attachNo");
            return (Criteria) this;
        }

        public Criteria andAttachNoNotLike(String value) {
            addCriterion("ATTACH_NO not like", value, "attachNo");
            return (Criteria) this;
        }

        public Criteria andAttachNoIn(List<String> values) {
            addCriterion("ATTACH_NO in", values, "attachNo");
            return (Criteria) this;
        }

        public Criteria andAttachNoNotIn(List<String> values) {
            addCriterion("ATTACH_NO not in", values, "attachNo");
            return (Criteria) this;
        }

        public Criteria andAttachNoBetween(String value1, String value2) {
            addCriterion("ATTACH_NO between", value1, value2, "attachNo");
            return (Criteria) this;
        }

        public Criteria andAttachNoNotBetween(String value1, String value2) {
            addCriterion("ATTACH_NO not between", value1, value2, "attachNo");
            return (Criteria) this;
        }

        public Criteria andAplNoIsNull() {
            addCriterion("APL_NO is null");
            return (Criteria) this;
        }

        public Criteria andAplNoIsNotNull() {
            addCriterion("APL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andAplNoEqualTo(String value) {
            addCriterion("APL_NO =", value, "aplNo");
            return (Criteria) this;
        }

        public Criteria andAplNoNotEqualTo(String value) {
            addCriterion("APL_NO <>", value, "aplNo");
            return (Criteria) this;
        }

        public Criteria andAplNoGreaterThan(String value) {
            addCriterion("APL_NO >", value, "aplNo");
            return (Criteria) this;
        }

        public Criteria andAplNoGreaterThanOrEqualTo(String value) {
            addCriterion("APL_NO >=", value, "aplNo");
            return (Criteria) this;
        }

        public Criteria andAplNoLessThan(String value) {
            addCriterion("APL_NO <", value, "aplNo");
            return (Criteria) this;
        }

        public Criteria andAplNoLessThanOrEqualTo(String value) {
            addCriterion("APL_NO <=", value, "aplNo");
            return (Criteria) this;
        }

        public Criteria andAplNoLike(String value) {
            addCriterion("APL_NO like", value, "aplNo");
            return (Criteria) this;
        }

        public Criteria andAplNoNotLike(String value) {
            addCriterion("APL_NO not like", value, "aplNo");
            return (Criteria) this;
        }

        public Criteria andAplNoIn(List<String> values) {
            addCriterion("APL_NO in", values, "aplNo");
            return (Criteria) this;
        }

        public Criteria andAplNoNotIn(List<String> values) {
            addCriterion("APL_NO not in", values, "aplNo");
            return (Criteria) this;
        }

        public Criteria andAplNoBetween(String value1, String value2) {
            addCriterion("APL_NO between", value1, value2, "aplNo");
            return (Criteria) this;
        }

        public Criteria andAplNoNotBetween(String value1, String value2) {
            addCriterion("APL_NO not between", value1, value2, "aplNo");
            return (Criteria) this;
        }

        public Criteria andAttachTypeIsNull() {
            addCriterion("ATTACH_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAttachTypeIsNotNull() {
            addCriterion("ATTACH_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAttachTypeEqualTo(String value) {
            addCriterion("ATTACH_TYPE =", value, "attachType");
            return (Criteria) this;
        }

        public Criteria andAttachTypeNotEqualTo(String value) {
            addCriterion("ATTACH_TYPE <>", value, "attachType");
            return (Criteria) this;
        }

        public Criteria andAttachTypeGreaterThan(String value) {
            addCriterion("ATTACH_TYPE >", value, "attachType");
            return (Criteria) this;
        }

        public Criteria andAttachTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ATTACH_TYPE >=", value, "attachType");
            return (Criteria) this;
        }

        public Criteria andAttachTypeLessThan(String value) {
            addCriterion("ATTACH_TYPE <", value, "attachType");
            return (Criteria) this;
        }

        public Criteria andAttachTypeLessThanOrEqualTo(String value) {
            addCriterion("ATTACH_TYPE <=", value, "attachType");
            return (Criteria) this;
        }

        public Criteria andAttachTypeLike(String value) {
            addCriterion("ATTACH_TYPE like", value, "attachType");
            return (Criteria) this;
        }

        public Criteria andAttachTypeNotLike(String value) {
            addCriterion("ATTACH_TYPE not like", value, "attachType");
            return (Criteria) this;
        }

        public Criteria andAttachTypeIn(List<String> values) {
            addCriterion("ATTACH_TYPE in", values, "attachType");
            return (Criteria) this;
        }

        public Criteria andAttachTypeNotIn(List<String> values) {
            addCriterion("ATTACH_TYPE not in", values, "attachType");
            return (Criteria) this;
        }

        public Criteria andAttachTypeBetween(String value1, String value2) {
            addCriterion("ATTACH_TYPE between", value1, value2, "attachType");
            return (Criteria) this;
        }

        public Criteria andAttachTypeNotBetween(String value1, String value2) {
            addCriterion("ATTACH_TYPE not between", value1, value2, "attachType");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNull() {
            addCriterion("FILE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("FILE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("FILE_NAME =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("FILE_NAME <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("FILE_NAME >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_NAME >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("FILE_NAME <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("FILE_NAME <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("FILE_NAME like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("FILE_NAME not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("FILE_NAME in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("FILE_NAME not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("FILE_NAME between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("FILE_NAME not between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andIndbTimeIsNull() {
            addCriterion("INDB_TIME is null");
            return (Criteria) this;
        }

        public Criteria andIndbTimeIsNotNull() {
            addCriterion("INDB_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andIndbTimeEqualTo(Date value) {
            addCriterionForJDBCDate("INDB_TIME =", value, "indbTime");
            return (Criteria) this;
        }

        public Criteria andIndbTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("INDB_TIME <>", value, "indbTime");
            return (Criteria) this;
        }

        public Criteria andIndbTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("INDB_TIME >", value, "indbTime");
            return (Criteria) this;
        }

        public Criteria andIndbTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("INDB_TIME >=", value, "indbTime");
            return (Criteria) this;
        }

        public Criteria andIndbTimeLessThan(Date value) {
            addCriterionForJDBCDate("INDB_TIME <", value, "indbTime");
            return (Criteria) this;
        }

        public Criteria andIndbTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("INDB_TIME <=", value, "indbTime");
            return (Criteria) this;
        }

        public Criteria andIndbTimeIn(List<Date> values) {
            addCriterionForJDBCDate("INDB_TIME in", values, "indbTime");
            return (Criteria) this;
        }

        public Criteria andIndbTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("INDB_TIME not in", values, "indbTime");
            return (Criteria) this;
        }

        public Criteria andIndbTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("INDB_TIME between", value1, value2, "indbTime");
            return (Criteria) this;
        }

        public Criteria andIndbTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("INDB_TIME not between", value1, value2, "indbTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_TIME not between", value1, value2, "updateTime");
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