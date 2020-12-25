package cn.gov.customs.online.pojo3;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CspooAgencyEntInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CspooAgencyEntInfoExample() {
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

        public Criteria andNoIsNull() {
            addCriterion("NO is null");
            return (Criteria) this;
        }

        public Criteria andNoIsNotNull() {
            addCriterion("NO is not null");
            return (Criteria) this;
        }

        public Criteria andNoEqualTo(String value) {
            addCriterion("NO =", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotEqualTo(String value) {
            addCriterion("NO <>", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThan(String value) {
            addCriterion("NO >", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThanOrEqualTo(String value) {
            addCriterion("NO >=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThan(String value) {
            addCriterion("NO <", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThanOrEqualTo(String value) {
            addCriterion("NO <=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLike(String value) {
            addCriterion("NO like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotLike(String value) {
            addCriterion("NO not like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoIn(List<String> values) {
            addCriterion("NO in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotIn(List<String> values) {
            addCriterion("NO not in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoBetween(String value1, String value2) {
            addCriterion("NO between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotBetween(String value1, String value2) {
            addCriterion("NO not between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andAgenentCiqRegNoIsNull() {
            addCriterion("AGENENT_CIQ_REG_NO is null");
            return (Criteria) this;
        }

        public Criteria andAgenentCiqRegNoIsNotNull() {
            addCriterion("AGENENT_CIQ_REG_NO is not null");
            return (Criteria) this;
        }

        public Criteria andAgenentCiqRegNoEqualTo(String value) {
            addCriterion("AGENENT_CIQ_REG_NO =", value, "agenentCiqRegNo");
            return (Criteria) this;
        }

        public Criteria andAgenentCiqRegNoNotEqualTo(String value) {
            addCriterion("AGENENT_CIQ_REG_NO <>", value, "agenentCiqRegNo");
            return (Criteria) this;
        }

        public Criteria andAgenentCiqRegNoGreaterThan(String value) {
            addCriterion("AGENENT_CIQ_REG_NO >", value, "agenentCiqRegNo");
            return (Criteria) this;
        }

        public Criteria andAgenentCiqRegNoGreaterThanOrEqualTo(String value) {
            addCriterion("AGENENT_CIQ_REG_NO >=", value, "agenentCiqRegNo");
            return (Criteria) this;
        }

        public Criteria andAgenentCiqRegNoLessThan(String value) {
            addCriterion("AGENENT_CIQ_REG_NO <", value, "agenentCiqRegNo");
            return (Criteria) this;
        }

        public Criteria andAgenentCiqRegNoLessThanOrEqualTo(String value) {
            addCriterion("AGENENT_CIQ_REG_NO <=", value, "agenentCiqRegNo");
            return (Criteria) this;
        }

        public Criteria andAgenentCiqRegNoLike(String value) {
            addCriterion("AGENENT_CIQ_REG_NO like", value, "agenentCiqRegNo");
            return (Criteria) this;
        }

        public Criteria andAgenentCiqRegNoNotLike(String value) {
            addCriterion("AGENENT_CIQ_REG_NO not like", value, "agenentCiqRegNo");
            return (Criteria) this;
        }

        public Criteria andAgenentCiqRegNoIn(List<String> values) {
            addCriterion("AGENENT_CIQ_REG_NO in", values, "agenentCiqRegNo");
            return (Criteria) this;
        }

        public Criteria andAgenentCiqRegNoNotIn(List<String> values) {
            addCriterion("AGENENT_CIQ_REG_NO not in", values, "agenentCiqRegNo");
            return (Criteria) this;
        }

        public Criteria andAgenentCiqRegNoBetween(String value1, String value2) {
            addCriterion("AGENENT_CIQ_REG_NO between", value1, value2, "agenentCiqRegNo");
            return (Criteria) this;
        }

        public Criteria andAgenentCiqRegNoNotBetween(String value1, String value2) {
            addCriterion("AGENENT_CIQ_REG_NO not between", value1, value2, "agenentCiqRegNo");
            return (Criteria) this;
        }

        public Criteria andAgenentNameCIsNull() {
            addCriterion("AGENENT_NAME_C is null");
            return (Criteria) this;
        }

        public Criteria andAgenentNameCIsNotNull() {
            addCriterion("AGENENT_NAME_C is not null");
            return (Criteria) this;
        }

        public Criteria andAgenentNameCEqualTo(String value) {
            addCriterion("AGENENT_NAME_C =", value, "agenentNameC");
            return (Criteria) this;
        }

        public Criteria andAgenentNameCNotEqualTo(String value) {
            addCriterion("AGENENT_NAME_C <>", value, "agenentNameC");
            return (Criteria) this;
        }

        public Criteria andAgenentNameCGreaterThan(String value) {
            addCriterion("AGENENT_NAME_C >", value, "agenentNameC");
            return (Criteria) this;
        }

        public Criteria andAgenentNameCGreaterThanOrEqualTo(String value) {
            addCriterion("AGENENT_NAME_C >=", value, "agenentNameC");
            return (Criteria) this;
        }

        public Criteria andAgenentNameCLessThan(String value) {
            addCriterion("AGENENT_NAME_C <", value, "agenentNameC");
            return (Criteria) this;
        }

        public Criteria andAgenentNameCLessThanOrEqualTo(String value) {
            addCriterion("AGENENT_NAME_C <=", value, "agenentNameC");
            return (Criteria) this;
        }

        public Criteria andAgenentNameCLike(String value) {
            addCriterion("AGENENT_NAME_C like", value, "agenentNameC");
            return (Criteria) this;
        }

        public Criteria andAgenentNameCNotLike(String value) {
            addCriterion("AGENENT_NAME_C not like", value, "agenentNameC");
            return (Criteria) this;
        }

        public Criteria andAgenentNameCIn(List<String> values) {
            addCriterion("AGENENT_NAME_C in", values, "agenentNameC");
            return (Criteria) this;
        }

        public Criteria andAgenentNameCNotIn(List<String> values) {
            addCriterion("AGENENT_NAME_C not in", values, "agenentNameC");
            return (Criteria) this;
        }

        public Criteria andAgenentNameCBetween(String value1, String value2) {
            addCriterion("AGENENT_NAME_C between", value1, value2, "agenentNameC");
            return (Criteria) this;
        }

        public Criteria andAgenentNameCNotBetween(String value1, String value2) {
            addCriterion("AGENENT_NAME_C not between", value1, value2, "agenentNameC");
            return (Criteria) this;
        }

        public Criteria andAgenentNameEIsNull() {
            addCriterion("AGENENT_NAME_E is null");
            return (Criteria) this;
        }

        public Criteria andAgenentNameEIsNotNull() {
            addCriterion("AGENENT_NAME_E is not null");
            return (Criteria) this;
        }

        public Criteria andAgenentNameEEqualTo(String value) {
            addCriterion("AGENENT_NAME_E =", value, "agenentNameE");
            return (Criteria) this;
        }

        public Criteria andAgenentNameENotEqualTo(String value) {
            addCriterion("AGENENT_NAME_E <>", value, "agenentNameE");
            return (Criteria) this;
        }

        public Criteria andAgenentNameEGreaterThan(String value) {
            addCriterion("AGENENT_NAME_E >", value, "agenentNameE");
            return (Criteria) this;
        }

        public Criteria andAgenentNameEGreaterThanOrEqualTo(String value) {
            addCriterion("AGENENT_NAME_E >=", value, "agenentNameE");
            return (Criteria) this;
        }

        public Criteria andAgenentNameELessThan(String value) {
            addCriterion("AGENENT_NAME_E <", value, "agenentNameE");
            return (Criteria) this;
        }

        public Criteria andAgenentNameELessThanOrEqualTo(String value) {
            addCriterion("AGENENT_NAME_E <=", value, "agenentNameE");
            return (Criteria) this;
        }

        public Criteria andAgenentNameELike(String value) {
            addCriterion("AGENENT_NAME_E like", value, "agenentNameE");
            return (Criteria) this;
        }

        public Criteria andAgenentNameENotLike(String value) {
            addCriterion("AGENENT_NAME_E not like", value, "agenentNameE");
            return (Criteria) this;
        }

        public Criteria andAgenentNameEIn(List<String> values) {
            addCriterion("AGENENT_NAME_E in", values, "agenentNameE");
            return (Criteria) this;
        }

        public Criteria andAgenentNameENotIn(List<String> values) {
            addCriterion("AGENENT_NAME_E not in", values, "agenentNameE");
            return (Criteria) this;
        }

        public Criteria andAgenentNameEBetween(String value1, String value2) {
            addCriterion("AGENENT_NAME_E between", value1, value2, "agenentNameE");
            return (Criteria) this;
        }

        public Criteria andAgenentNameENotBetween(String value1, String value2) {
            addCriterion("AGENENT_NAME_E not between", value1, value2, "agenentNameE");
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

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andUniSocialCreditCodeIsNull() {
            addCriterion("UNI_SOCIAL_CREDIT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andUniSocialCreditCodeIsNotNull() {
            addCriterion("UNI_SOCIAL_CREDIT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andUniSocialCreditCodeEqualTo(String value) {
            addCriterion("UNI_SOCIAL_CREDIT_CODE =", value, "uniSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andUniSocialCreditCodeNotEqualTo(String value) {
            addCriterion("UNI_SOCIAL_CREDIT_CODE <>", value, "uniSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andUniSocialCreditCodeGreaterThan(String value) {
            addCriterion("UNI_SOCIAL_CREDIT_CODE >", value, "uniSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andUniSocialCreditCodeGreaterThanOrEqualTo(String value) {
            addCriterion("UNI_SOCIAL_CREDIT_CODE >=", value, "uniSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andUniSocialCreditCodeLessThan(String value) {
            addCriterion("UNI_SOCIAL_CREDIT_CODE <", value, "uniSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andUniSocialCreditCodeLessThanOrEqualTo(String value) {
            addCriterion("UNI_SOCIAL_CREDIT_CODE <=", value, "uniSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andUniSocialCreditCodeLike(String value) {
            addCriterion("UNI_SOCIAL_CREDIT_CODE like", value, "uniSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andUniSocialCreditCodeNotLike(String value) {
            addCriterion("UNI_SOCIAL_CREDIT_CODE not like", value, "uniSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andUniSocialCreditCodeIn(List<String> values) {
            addCriterion("UNI_SOCIAL_CREDIT_CODE in", values, "uniSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andUniSocialCreditCodeNotIn(List<String> values) {
            addCriterion("UNI_SOCIAL_CREDIT_CODE not in", values, "uniSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andUniSocialCreditCodeBetween(String value1, String value2) {
            addCriterion("UNI_SOCIAL_CREDIT_CODE between", value1, value2, "uniSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andUniSocialCreditCodeNotBetween(String value1, String value2) {
            addCriterion("UNI_SOCIAL_CREDIT_CODE not between", value1, value2, "uniSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andEntMgrNoIsNull() {
            addCriterion("ENT_MGR_NO is null");
            return (Criteria) this;
        }

        public Criteria andEntMgrNoIsNotNull() {
            addCriterion("ENT_MGR_NO is not null");
            return (Criteria) this;
        }

        public Criteria andEntMgrNoEqualTo(String value) {
            addCriterion("ENT_MGR_NO =", value, "entMgrNo");
            return (Criteria) this;
        }

        public Criteria andEntMgrNoNotEqualTo(String value) {
            addCriterion("ENT_MGR_NO <>", value, "entMgrNo");
            return (Criteria) this;
        }

        public Criteria andEntMgrNoGreaterThan(String value) {
            addCriterion("ENT_MGR_NO >", value, "entMgrNo");
            return (Criteria) this;
        }

        public Criteria andEntMgrNoGreaterThanOrEqualTo(String value) {
            addCriterion("ENT_MGR_NO >=", value, "entMgrNo");
            return (Criteria) this;
        }

        public Criteria andEntMgrNoLessThan(String value) {
            addCriterion("ENT_MGR_NO <", value, "entMgrNo");
            return (Criteria) this;
        }

        public Criteria andEntMgrNoLessThanOrEqualTo(String value) {
            addCriterion("ENT_MGR_NO <=", value, "entMgrNo");
            return (Criteria) this;
        }

        public Criteria andEntMgrNoLike(String value) {
            addCriterion("ENT_MGR_NO like", value, "entMgrNo");
            return (Criteria) this;
        }

        public Criteria andEntMgrNoNotLike(String value) {
            addCriterion("ENT_MGR_NO not like", value, "entMgrNo");
            return (Criteria) this;
        }

        public Criteria andEntMgrNoIn(List<String> values) {
            addCriterion("ENT_MGR_NO in", values, "entMgrNo");
            return (Criteria) this;
        }

        public Criteria andEntMgrNoNotIn(List<String> values) {
            addCriterion("ENT_MGR_NO not in", values, "entMgrNo");
            return (Criteria) this;
        }

        public Criteria andEntMgrNoBetween(String value1, String value2) {
            addCriterion("ENT_MGR_NO between", value1, value2, "entMgrNo");
            return (Criteria) this;
        }

        public Criteria andEntMgrNoNotBetween(String value1, String value2) {
            addCriterion("ENT_MGR_NO not between", value1, value2, "entMgrNo");
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