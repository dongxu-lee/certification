package cn.gov.customs.online.pojo3;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CspooEntRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CspooEntRecordExample() {
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

        public Criteria andRegStateIsNull() {
            addCriterion("REG_STATE is null");
            return (Criteria) this;
        }

        public Criteria andRegStateIsNotNull() {
            addCriterion("REG_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andRegStateEqualTo(String value) {
            addCriterion("REG_STATE =", value, "regState");
            return (Criteria) this;
        }

        public Criteria andRegStateNotEqualTo(String value) {
            addCriterion("REG_STATE <>", value, "regState");
            return (Criteria) this;
        }

        public Criteria andRegStateGreaterThan(String value) {
            addCriterion("REG_STATE >", value, "regState");
            return (Criteria) this;
        }

        public Criteria andRegStateGreaterThanOrEqualTo(String value) {
            addCriterion("REG_STATE >=", value, "regState");
            return (Criteria) this;
        }

        public Criteria andRegStateLessThan(String value) {
            addCriterion("REG_STATE <", value, "regState");
            return (Criteria) this;
        }

        public Criteria andRegStateLessThanOrEqualTo(String value) {
            addCriterion("REG_STATE <=", value, "regState");
            return (Criteria) this;
        }

        public Criteria andRegStateLike(String value) {
            addCriterion("REG_STATE like", value, "regState");
            return (Criteria) this;
        }

        public Criteria andRegStateNotLike(String value) {
            addCriterion("REG_STATE not like", value, "regState");
            return (Criteria) this;
        }

        public Criteria andRegStateIn(List<String> values) {
            addCriterion("REG_STATE in", values, "regState");
            return (Criteria) this;
        }

        public Criteria andRegStateNotIn(List<String> values) {
            addCriterion("REG_STATE not in", values, "regState");
            return (Criteria) this;
        }

        public Criteria andRegStateBetween(String value1, String value2) {
            addCriterion("REG_STATE between", value1, value2, "regState");
            return (Criteria) this;
        }

        public Criteria andRegStateNotBetween(String value1, String value2) {
            addCriterion("REG_STATE not between", value1, value2, "regState");
            return (Criteria) this;
        }

        public Criteria andCiqRegNoIsNull() {
            addCriterion("CIQ_REG_NO is null");
            return (Criteria) this;
        }

        public Criteria andCiqRegNoIsNotNull() {
            addCriterion("CIQ_REG_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCiqRegNoEqualTo(String value) {
            addCriterion("CIQ_REG_NO =", value, "ciqRegNo");
            return (Criteria) this;
        }

        public Criteria andCiqRegNoNotEqualTo(String value) {
            addCriterion("CIQ_REG_NO <>", value, "ciqRegNo");
            return (Criteria) this;
        }

        public Criteria andCiqRegNoGreaterThan(String value) {
            addCriterion("CIQ_REG_NO >", value, "ciqRegNo");
            return (Criteria) this;
        }

        public Criteria andCiqRegNoGreaterThanOrEqualTo(String value) {
            addCriterion("CIQ_REG_NO >=", value, "ciqRegNo");
            return (Criteria) this;
        }

        public Criteria andCiqRegNoLessThan(String value) {
            addCriterion("CIQ_REG_NO <", value, "ciqRegNo");
            return (Criteria) this;
        }

        public Criteria andCiqRegNoLessThanOrEqualTo(String value) {
            addCriterion("CIQ_REG_NO <=", value, "ciqRegNo");
            return (Criteria) this;
        }

        public Criteria andCiqRegNoLike(String value) {
            addCriterion("CIQ_REG_NO like", value, "ciqRegNo");
            return (Criteria) this;
        }

        public Criteria andCiqRegNoNotLike(String value) {
            addCriterion("CIQ_REG_NO not like", value, "ciqRegNo");
            return (Criteria) this;
        }

        public Criteria andCiqRegNoIn(List<String> values) {
            addCriterion("CIQ_REG_NO in", values, "ciqRegNo");
            return (Criteria) this;
        }

        public Criteria andCiqRegNoNotIn(List<String> values) {
            addCriterion("CIQ_REG_NO not in", values, "ciqRegNo");
            return (Criteria) this;
        }

        public Criteria andCiqRegNoBetween(String value1, String value2) {
            addCriterion("CIQ_REG_NO between", value1, value2, "ciqRegNo");
            return (Criteria) this;
        }

        public Criteria andCiqRegNoNotBetween(String value1, String value2) {
            addCriterion("CIQ_REG_NO not between", value1, value2, "ciqRegNo");
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

        public Criteria andAplTypeIsNull() {
            addCriterion("APL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAplTypeIsNotNull() {
            addCriterion("APL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAplTypeEqualTo(String value) {
            addCriterion("APL_TYPE =", value, "aplType");
            return (Criteria) this;
        }

        public Criteria andAplTypeNotEqualTo(String value) {
            addCriterion("APL_TYPE <>", value, "aplType");
            return (Criteria) this;
        }

        public Criteria andAplTypeGreaterThan(String value) {
            addCriterion("APL_TYPE >", value, "aplType");
            return (Criteria) this;
        }

        public Criteria andAplTypeGreaterThanOrEqualTo(String value) {
            addCriterion("APL_TYPE >=", value, "aplType");
            return (Criteria) this;
        }

        public Criteria andAplTypeLessThan(String value) {
            addCriterion("APL_TYPE <", value, "aplType");
            return (Criteria) this;
        }

        public Criteria andAplTypeLessThanOrEqualTo(String value) {
            addCriterion("APL_TYPE <=", value, "aplType");
            return (Criteria) this;
        }

        public Criteria andAplTypeLike(String value) {
            addCriterion("APL_TYPE like", value, "aplType");
            return (Criteria) this;
        }

        public Criteria andAplTypeNotLike(String value) {
            addCriterion("APL_TYPE not like", value, "aplType");
            return (Criteria) this;
        }

        public Criteria andAplTypeIn(List<String> values) {
            addCriterion("APL_TYPE in", values, "aplType");
            return (Criteria) this;
        }

        public Criteria andAplTypeNotIn(List<String> values) {
            addCriterion("APL_TYPE not in", values, "aplType");
            return (Criteria) this;
        }

        public Criteria andAplTypeBetween(String value1, String value2) {
            addCriterion("APL_TYPE between", value1, value2, "aplType");
            return (Criteria) this;
        }

        public Criteria andAplTypeNotBetween(String value1, String value2) {
            addCriterion("APL_TYPE not between", value1, value2, "aplType");
            return (Criteria) this;
        }

        public Criteria andNameCIsNull() {
            addCriterion("NAME_C is null");
            return (Criteria) this;
        }

        public Criteria andNameCIsNotNull() {
            addCriterion("NAME_C is not null");
            return (Criteria) this;
        }

        public Criteria andNameCEqualTo(String value) {
            addCriterion("NAME_C =", value, "nameC");
            return (Criteria) this;
        }

        public Criteria andNameCNotEqualTo(String value) {
            addCriterion("NAME_C <>", value, "nameC");
            return (Criteria) this;
        }

        public Criteria andNameCGreaterThan(String value) {
            addCriterion("NAME_C >", value, "nameC");
            return (Criteria) this;
        }

        public Criteria andNameCGreaterThanOrEqualTo(String value) {
            addCriterion("NAME_C >=", value, "nameC");
            return (Criteria) this;
        }

        public Criteria andNameCLessThan(String value) {
            addCriterion("NAME_C <", value, "nameC");
            return (Criteria) this;
        }

        public Criteria andNameCLessThanOrEqualTo(String value) {
            addCriterion("NAME_C <=", value, "nameC");
            return (Criteria) this;
        }

        public Criteria andNameCLike(String value) {
            addCriterion("NAME_C like", value, "nameC");
            return (Criteria) this;
        }

        public Criteria andNameCNotLike(String value) {
            addCriterion("NAME_C not like", value, "nameC");
            return (Criteria) this;
        }

        public Criteria andNameCIn(List<String> values) {
            addCriterion("NAME_C in", values, "nameC");
            return (Criteria) this;
        }

        public Criteria andNameCNotIn(List<String> values) {
            addCriterion("NAME_C not in", values, "nameC");
            return (Criteria) this;
        }

        public Criteria andNameCBetween(String value1, String value2) {
            addCriterion("NAME_C between", value1, value2, "nameC");
            return (Criteria) this;
        }

        public Criteria andNameCNotBetween(String value1, String value2) {
            addCriterion("NAME_C not between", value1, value2, "nameC");
            return (Criteria) this;
        }

        public Criteria andNameEIsNull() {
            addCriterion("NAME_E is null");
            return (Criteria) this;
        }

        public Criteria andNameEIsNotNull() {
            addCriterion("NAME_E is not null");
            return (Criteria) this;
        }

        public Criteria andNameEEqualTo(String value) {
            addCriterion("NAME_E =", value, "nameE");
            return (Criteria) this;
        }

        public Criteria andNameENotEqualTo(String value) {
            addCriterion("NAME_E <>", value, "nameE");
            return (Criteria) this;
        }

        public Criteria andNameEGreaterThan(String value) {
            addCriterion("NAME_E >", value, "nameE");
            return (Criteria) this;
        }

        public Criteria andNameEGreaterThanOrEqualTo(String value) {
            addCriterion("NAME_E >=", value, "nameE");
            return (Criteria) this;
        }

        public Criteria andNameELessThan(String value) {
            addCriterion("NAME_E <", value, "nameE");
            return (Criteria) this;
        }

        public Criteria andNameELessThanOrEqualTo(String value) {
            addCriterion("NAME_E <=", value, "nameE");
            return (Criteria) this;
        }

        public Criteria andNameELike(String value) {
            addCriterion("NAME_E like", value, "nameE");
            return (Criteria) this;
        }

        public Criteria andNameENotLike(String value) {
            addCriterion("NAME_E not like", value, "nameE");
            return (Criteria) this;
        }

        public Criteria andNameEIn(List<String> values) {
            addCriterion("NAME_E in", values, "nameE");
            return (Criteria) this;
        }

        public Criteria andNameENotIn(List<String> values) {
            addCriterion("NAME_E not in", values, "nameE");
            return (Criteria) this;
        }

        public Criteria andNameEBetween(String value1, String value2) {
            addCriterion("NAME_E between", value1, value2, "nameE");
            return (Criteria) this;
        }

        public Criteria andNameENotBetween(String value1, String value2) {
            addCriterion("NAME_E not between", value1, value2, "nameE");
            return (Criteria) this;
        }

        public Criteria andResCIsNull() {
            addCriterion("RES_C is null");
            return (Criteria) this;
        }

        public Criteria andResCIsNotNull() {
            addCriterion("RES_C is not null");
            return (Criteria) this;
        }

        public Criteria andResCEqualTo(String value) {
            addCriterion("RES_C =", value, "resC");
            return (Criteria) this;
        }

        public Criteria andResCNotEqualTo(String value) {
            addCriterion("RES_C <>", value, "resC");
            return (Criteria) this;
        }

        public Criteria andResCGreaterThan(String value) {
            addCriterion("RES_C >", value, "resC");
            return (Criteria) this;
        }

        public Criteria andResCGreaterThanOrEqualTo(String value) {
            addCriterion("RES_C >=", value, "resC");
            return (Criteria) this;
        }

        public Criteria andResCLessThan(String value) {
            addCriterion("RES_C <", value, "resC");
            return (Criteria) this;
        }

        public Criteria andResCLessThanOrEqualTo(String value) {
            addCriterion("RES_C <=", value, "resC");
            return (Criteria) this;
        }

        public Criteria andResCLike(String value) {
            addCriterion("RES_C like", value, "resC");
            return (Criteria) this;
        }

        public Criteria andResCNotLike(String value) {
            addCriterion("RES_C not like", value, "resC");
            return (Criteria) this;
        }

        public Criteria andResCIn(List<String> values) {
            addCriterion("RES_C in", values, "resC");
            return (Criteria) this;
        }

        public Criteria andResCNotIn(List<String> values) {
            addCriterion("RES_C not in", values, "resC");
            return (Criteria) this;
        }

        public Criteria andResCBetween(String value1, String value2) {
            addCriterion("RES_C between", value1, value2, "resC");
            return (Criteria) this;
        }

        public Criteria andResCNotBetween(String value1, String value2) {
            addCriterion("RES_C not between", value1, value2, "resC");
            return (Criteria) this;
        }

        public Criteria andResEIsNull() {
            addCriterion("RES_E is null");
            return (Criteria) this;
        }

        public Criteria andResEIsNotNull() {
            addCriterion("RES_E is not null");
            return (Criteria) this;
        }

        public Criteria andResEEqualTo(String value) {
            addCriterion("RES_E =", value, "resE");
            return (Criteria) this;
        }

        public Criteria andResENotEqualTo(String value) {
            addCriterion("RES_E <>", value, "resE");
            return (Criteria) this;
        }

        public Criteria andResEGreaterThan(String value) {
            addCriterion("RES_E >", value, "resE");
            return (Criteria) this;
        }

        public Criteria andResEGreaterThanOrEqualTo(String value) {
            addCriterion("RES_E >=", value, "resE");
            return (Criteria) this;
        }

        public Criteria andResELessThan(String value) {
            addCriterion("RES_E <", value, "resE");
            return (Criteria) this;
        }

        public Criteria andResELessThanOrEqualTo(String value) {
            addCriterion("RES_E <=", value, "resE");
            return (Criteria) this;
        }

        public Criteria andResELike(String value) {
            addCriterion("RES_E like", value, "resE");
            return (Criteria) this;
        }

        public Criteria andResENotLike(String value) {
            addCriterion("RES_E not like", value, "resE");
            return (Criteria) this;
        }

        public Criteria andResEIn(List<String> values) {
            addCriterion("RES_E in", values, "resE");
            return (Criteria) this;
        }

        public Criteria andResENotIn(List<String> values) {
            addCriterion("RES_E not in", values, "resE");
            return (Criteria) this;
        }

        public Criteria andResEBetween(String value1, String value2) {
            addCriterion("RES_E between", value1, value2, "resE");
            return (Criteria) this;
        }

        public Criteria andResENotBetween(String value1, String value2) {
            addCriterion("RES_E not between", value1, value2, "resE");
            return (Criteria) this;
        }

        public Criteria andNatureIsNull() {
            addCriterion("NATURE is null");
            return (Criteria) this;
        }

        public Criteria andNatureIsNotNull() {
            addCriterion("NATURE is not null");
            return (Criteria) this;
        }

        public Criteria andNatureEqualTo(String value) {
            addCriterion("NATURE =", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotEqualTo(String value) {
            addCriterion("NATURE <>", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThan(String value) {
            addCriterion("NATURE >", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThanOrEqualTo(String value) {
            addCriterion("NATURE >=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThan(String value) {
            addCriterion("NATURE <", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThanOrEqualTo(String value) {
            addCriterion("NATURE <=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLike(String value) {
            addCriterion("NATURE like", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotLike(String value) {
            addCriterion("NATURE not like", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureIn(List<String> values) {
            addCriterion("NATURE in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotIn(List<String> values) {
            addCriterion("NATURE not in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureBetween(String value1, String value2) {
            addCriterion("NATURE between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotBetween(String value1, String value2) {
            addCriterion("NATURE not between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andProEntIsNull() {
            addCriterion("PRO_ENT is null");
            return (Criteria) this;
        }

        public Criteria andProEntIsNotNull() {
            addCriterion("PRO_ENT is not null");
            return (Criteria) this;
        }

        public Criteria andProEntEqualTo(String value) {
            addCriterion("PRO_ENT =", value, "proEnt");
            return (Criteria) this;
        }

        public Criteria andProEntNotEqualTo(String value) {
            addCriterion("PRO_ENT <>", value, "proEnt");
            return (Criteria) this;
        }

        public Criteria andProEntGreaterThan(String value) {
            addCriterion("PRO_ENT >", value, "proEnt");
            return (Criteria) this;
        }

        public Criteria andProEntGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_ENT >=", value, "proEnt");
            return (Criteria) this;
        }

        public Criteria andProEntLessThan(String value) {
            addCriterion("PRO_ENT <", value, "proEnt");
            return (Criteria) this;
        }

        public Criteria andProEntLessThanOrEqualTo(String value) {
            addCriterion("PRO_ENT <=", value, "proEnt");
            return (Criteria) this;
        }

        public Criteria andProEntLike(String value) {
            addCriterion("PRO_ENT like", value, "proEnt");
            return (Criteria) this;
        }

        public Criteria andProEntNotLike(String value) {
            addCriterion("PRO_ENT not like", value, "proEnt");
            return (Criteria) this;
        }

        public Criteria andProEntIn(List<String> values) {
            addCriterion("PRO_ENT in", values, "proEnt");
            return (Criteria) this;
        }

        public Criteria andProEntNotIn(List<String> values) {
            addCriterion("PRO_ENT not in", values, "proEnt");
            return (Criteria) this;
        }

        public Criteria andProEntBetween(String value1, String value2) {
            addCriterion("PRO_ENT between", value1, value2, "proEnt");
            return (Criteria) this;
        }

        public Criteria andProEntNotBetween(String value1, String value2) {
            addCriterion("PRO_ENT not between", value1, value2, "proEnt");
            return (Criteria) this;
        }

        public Criteria andBusiRegPlaIsNull() {
            addCriterion("BUSI_REG_PLA is null");
            return (Criteria) this;
        }

        public Criteria andBusiRegPlaIsNotNull() {
            addCriterion("BUSI_REG_PLA is not null");
            return (Criteria) this;
        }

        public Criteria andBusiRegPlaEqualTo(String value) {
            addCriterion("BUSI_REG_PLA =", value, "busiRegPla");
            return (Criteria) this;
        }

        public Criteria andBusiRegPlaNotEqualTo(String value) {
            addCriterion("BUSI_REG_PLA <>", value, "busiRegPla");
            return (Criteria) this;
        }

        public Criteria andBusiRegPlaGreaterThan(String value) {
            addCriterion("BUSI_REG_PLA >", value, "busiRegPla");
            return (Criteria) this;
        }

        public Criteria andBusiRegPlaGreaterThanOrEqualTo(String value) {
            addCriterion("BUSI_REG_PLA >=", value, "busiRegPla");
            return (Criteria) this;
        }

        public Criteria andBusiRegPlaLessThan(String value) {
            addCriterion("BUSI_REG_PLA <", value, "busiRegPla");
            return (Criteria) this;
        }

        public Criteria andBusiRegPlaLessThanOrEqualTo(String value) {
            addCriterion("BUSI_REG_PLA <=", value, "busiRegPla");
            return (Criteria) this;
        }

        public Criteria andBusiRegPlaLike(String value) {
            addCriterion("BUSI_REG_PLA like", value, "busiRegPla");
            return (Criteria) this;
        }

        public Criteria andBusiRegPlaNotLike(String value) {
            addCriterion("BUSI_REG_PLA not like", value, "busiRegPla");
            return (Criteria) this;
        }

        public Criteria andBusiRegPlaIn(List<String> values) {
            addCriterion("BUSI_REG_PLA in", values, "busiRegPla");
            return (Criteria) this;
        }

        public Criteria andBusiRegPlaNotIn(List<String> values) {
            addCriterion("BUSI_REG_PLA not in", values, "busiRegPla");
            return (Criteria) this;
        }

        public Criteria andBusiRegPlaBetween(String value1, String value2) {
            addCriterion("BUSI_REG_PLA between", value1, value2, "busiRegPla");
            return (Criteria) this;
        }

        public Criteria andBusiRegPlaNotBetween(String value1, String value2) {
            addCriterion("BUSI_REG_PLA not between", value1, value2, "busiRegPla");
            return (Criteria) this;
        }

        public Criteria andSearchOrgCodeIsNull() {
            addCriterion("SEARCH_ORG_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSearchOrgCodeIsNotNull() {
            addCriterion("SEARCH_ORG_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSearchOrgCodeEqualTo(String value) {
            addCriterion("SEARCH_ORG_CODE =", value, "searchOrgCode");
            return (Criteria) this;
        }

        public Criteria andSearchOrgCodeNotEqualTo(String value) {
            addCriterion("SEARCH_ORG_CODE <>", value, "searchOrgCode");
            return (Criteria) this;
        }

        public Criteria andSearchOrgCodeGreaterThan(String value) {
            addCriterion("SEARCH_ORG_CODE >", value, "searchOrgCode");
            return (Criteria) this;
        }

        public Criteria andSearchOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SEARCH_ORG_CODE >=", value, "searchOrgCode");
            return (Criteria) this;
        }

        public Criteria andSearchOrgCodeLessThan(String value) {
            addCriterion("SEARCH_ORG_CODE <", value, "searchOrgCode");
            return (Criteria) this;
        }

        public Criteria andSearchOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("SEARCH_ORG_CODE <=", value, "searchOrgCode");
            return (Criteria) this;
        }

        public Criteria andSearchOrgCodeLike(String value) {
            addCriterion("SEARCH_ORG_CODE like", value, "searchOrgCode");
            return (Criteria) this;
        }

        public Criteria andSearchOrgCodeNotLike(String value) {
            addCriterion("SEARCH_ORG_CODE not like", value, "searchOrgCode");
            return (Criteria) this;
        }

        public Criteria andSearchOrgCodeIn(List<String> values) {
            addCriterion("SEARCH_ORG_CODE in", values, "searchOrgCode");
            return (Criteria) this;
        }

        public Criteria andSearchOrgCodeNotIn(List<String> values) {
            addCriterion("SEARCH_ORG_CODE not in", values, "searchOrgCode");
            return (Criteria) this;
        }

        public Criteria andSearchOrgCodeBetween(String value1, String value2) {
            addCriterion("SEARCH_ORG_CODE between", value1, value2, "searchOrgCode");
            return (Criteria) this;
        }

        public Criteria andSearchOrgCodeNotBetween(String value1, String value2) {
            addCriterion("SEARCH_ORG_CODE not between", value1, value2, "searchOrgCode");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andLegRepIsNull() {
            addCriterion("LEG_REP is null");
            return (Criteria) this;
        }

        public Criteria andLegRepIsNotNull() {
            addCriterion("LEG_REP is not null");
            return (Criteria) this;
        }

        public Criteria andLegRepEqualTo(String value) {
            addCriterion("LEG_REP =", value, "legRep");
            return (Criteria) this;
        }

        public Criteria andLegRepNotEqualTo(String value) {
            addCriterion("LEG_REP <>", value, "legRep");
            return (Criteria) this;
        }

        public Criteria andLegRepGreaterThan(String value) {
            addCriterion("LEG_REP >", value, "legRep");
            return (Criteria) this;
        }

        public Criteria andLegRepGreaterThanOrEqualTo(String value) {
            addCriterion("LEG_REP >=", value, "legRep");
            return (Criteria) this;
        }

        public Criteria andLegRepLessThan(String value) {
            addCriterion("LEG_REP <", value, "legRep");
            return (Criteria) this;
        }

        public Criteria andLegRepLessThanOrEqualTo(String value) {
            addCriterion("LEG_REP <=", value, "legRep");
            return (Criteria) this;
        }

        public Criteria andLegRepLike(String value) {
            addCriterion("LEG_REP like", value, "legRep");
            return (Criteria) this;
        }

        public Criteria andLegRepNotLike(String value) {
            addCriterion("LEG_REP not like", value, "legRep");
            return (Criteria) this;
        }

        public Criteria andLegRepIn(List<String> values) {
            addCriterion("LEG_REP in", values, "legRep");
            return (Criteria) this;
        }

        public Criteria andLegRepNotIn(List<String> values) {
            addCriterion("LEG_REP not in", values, "legRep");
            return (Criteria) this;
        }

        public Criteria andLegRepBetween(String value1, String value2) {
            addCriterion("LEG_REP between", value1, value2, "legRep");
            return (Criteria) this;
        }

        public Criteria andLegRepNotBetween(String value1, String value2) {
            addCriterion("LEG_REP not between", value1, value2, "legRep");
            return (Criteria) this;
        }

        public Criteria andLegRepIdpassNoIsNull() {
            addCriterion("LEG_REP_IDPASS_NO is null");
            return (Criteria) this;
        }

        public Criteria andLegRepIdpassNoIsNotNull() {
            addCriterion("LEG_REP_IDPASS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andLegRepIdpassNoEqualTo(String value) {
            addCriterion("LEG_REP_IDPASS_NO =", value, "legRepIdpassNo");
            return (Criteria) this;
        }

        public Criteria andLegRepIdpassNoNotEqualTo(String value) {
            addCriterion("LEG_REP_IDPASS_NO <>", value, "legRepIdpassNo");
            return (Criteria) this;
        }

        public Criteria andLegRepIdpassNoGreaterThan(String value) {
            addCriterion("LEG_REP_IDPASS_NO >", value, "legRepIdpassNo");
            return (Criteria) this;
        }

        public Criteria andLegRepIdpassNoGreaterThanOrEqualTo(String value) {
            addCriterion("LEG_REP_IDPASS_NO >=", value, "legRepIdpassNo");
            return (Criteria) this;
        }

        public Criteria andLegRepIdpassNoLessThan(String value) {
            addCriterion("LEG_REP_IDPASS_NO <", value, "legRepIdpassNo");
            return (Criteria) this;
        }

        public Criteria andLegRepIdpassNoLessThanOrEqualTo(String value) {
            addCriterion("LEG_REP_IDPASS_NO <=", value, "legRepIdpassNo");
            return (Criteria) this;
        }

        public Criteria andLegRepIdpassNoLike(String value) {
            addCriterion("LEG_REP_IDPASS_NO like", value, "legRepIdpassNo");
            return (Criteria) this;
        }

        public Criteria andLegRepIdpassNoNotLike(String value) {
            addCriterion("LEG_REP_IDPASS_NO not like", value, "legRepIdpassNo");
            return (Criteria) this;
        }

        public Criteria andLegRepIdpassNoIn(List<String> values) {
            addCriterion("LEG_REP_IDPASS_NO in", values, "legRepIdpassNo");
            return (Criteria) this;
        }

        public Criteria andLegRepIdpassNoNotIn(List<String> values) {
            addCriterion("LEG_REP_IDPASS_NO not in", values, "legRepIdpassNo");
            return (Criteria) this;
        }

        public Criteria andLegRepIdpassNoBetween(String value1, String value2) {
            addCriterion("LEG_REP_IDPASS_NO between", value1, value2, "legRepIdpassNo");
            return (Criteria) this;
        }

        public Criteria andLegRepIdpassNoNotBetween(String value1, String value2) {
            addCriterion("LEG_REP_IDPASS_NO not between", value1, value2, "legRepIdpassNo");
            return (Criteria) this;
        }

        public Criteria andLegRepTelIsNull() {
            addCriterion("LEG_REP_TEL is null");
            return (Criteria) this;
        }

        public Criteria andLegRepTelIsNotNull() {
            addCriterion("LEG_REP_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andLegRepTelEqualTo(String value) {
            addCriterion("LEG_REP_TEL =", value, "legRepTel");
            return (Criteria) this;
        }

        public Criteria andLegRepTelNotEqualTo(String value) {
            addCriterion("LEG_REP_TEL <>", value, "legRepTel");
            return (Criteria) this;
        }

        public Criteria andLegRepTelGreaterThan(String value) {
            addCriterion("LEG_REP_TEL >", value, "legRepTel");
            return (Criteria) this;
        }

        public Criteria andLegRepTelGreaterThanOrEqualTo(String value) {
            addCriterion("LEG_REP_TEL >=", value, "legRepTel");
            return (Criteria) this;
        }

        public Criteria andLegRepTelLessThan(String value) {
            addCriterion("LEG_REP_TEL <", value, "legRepTel");
            return (Criteria) this;
        }

        public Criteria andLegRepTelLessThanOrEqualTo(String value) {
            addCriterion("LEG_REP_TEL <=", value, "legRepTel");
            return (Criteria) this;
        }

        public Criteria andLegRepTelLike(String value) {
            addCriterion("LEG_REP_TEL like", value, "legRepTel");
            return (Criteria) this;
        }

        public Criteria andLegRepTelNotLike(String value) {
            addCriterion("LEG_REP_TEL not like", value, "legRepTel");
            return (Criteria) this;
        }

        public Criteria andLegRepTelIn(List<String> values) {
            addCriterion("LEG_REP_TEL in", values, "legRepTel");
            return (Criteria) this;
        }

        public Criteria andLegRepTelNotIn(List<String> values) {
            addCriterion("LEG_REP_TEL not in", values, "legRepTel");
            return (Criteria) this;
        }

        public Criteria andLegRepTelBetween(String value1, String value2) {
            addCriterion("LEG_REP_TEL between", value1, value2, "legRepTel");
            return (Criteria) this;
        }

        public Criteria andLegRepTelNotBetween(String value1, String value2) {
            addCriterion("LEG_REP_TEL not between", value1, value2, "legRepTel");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("CONTACT is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("CONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("CONTACT =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("CONTACT <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("CONTACT >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("CONTACT <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("CONTACT <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("CONTACT like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("CONTACT not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("CONTACT in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("CONTACT not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("CONTACT between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("CONTACT not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactTelIsNull() {
            addCriterion("CONTACT_TEL is null");
            return (Criteria) this;
        }

        public Criteria andContactTelIsNotNull() {
            addCriterion("CONTACT_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andContactTelEqualTo(String value) {
            addCriterion("CONTACT_TEL =", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotEqualTo(String value) {
            addCriterion("CONTACT_TEL <>", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelGreaterThan(String value) {
            addCriterion("CONTACT_TEL >", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_TEL >=", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelLessThan(String value) {
            addCriterion("CONTACT_TEL <", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_TEL <=", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelLike(String value) {
            addCriterion("CONTACT_TEL like", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotLike(String value) {
            addCriterion("CONTACT_TEL not like", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelIn(List<String> values) {
            addCriterion("CONTACT_TEL in", values, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotIn(List<String> values) {
            addCriterion("CONTACT_TEL not in", values, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelBetween(String value1, String value2) {
            addCriterion("CONTACT_TEL between", value1, value2, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotBetween(String value1, String value2) {
            addCriterion("CONTACT_TEL not between", value1, value2, "contactTel");
            return (Criteria) this;
        }

        public Criteria andManageTypeIsNull() {
            addCriterion("MANAGE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andManageTypeIsNotNull() {
            addCriterion("MANAGE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andManageTypeEqualTo(String value) {
            addCriterion("MANAGE_TYPE =", value, "manageType");
            return (Criteria) this;
        }

        public Criteria andManageTypeNotEqualTo(String value) {
            addCriterion("MANAGE_TYPE <>", value, "manageType");
            return (Criteria) this;
        }

        public Criteria andManageTypeGreaterThan(String value) {
            addCriterion("MANAGE_TYPE >", value, "manageType");
            return (Criteria) this;
        }

        public Criteria andManageTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MANAGE_TYPE >=", value, "manageType");
            return (Criteria) this;
        }

        public Criteria andManageTypeLessThan(String value) {
            addCriterion("MANAGE_TYPE <", value, "manageType");
            return (Criteria) this;
        }

        public Criteria andManageTypeLessThanOrEqualTo(String value) {
            addCriterion("MANAGE_TYPE <=", value, "manageType");
            return (Criteria) this;
        }

        public Criteria andManageTypeLike(String value) {
            addCriterion("MANAGE_TYPE like", value, "manageType");
            return (Criteria) this;
        }

        public Criteria andManageTypeNotLike(String value) {
            addCriterion("MANAGE_TYPE not like", value, "manageType");
            return (Criteria) this;
        }

        public Criteria andManageTypeIn(List<String> values) {
            addCriterion("MANAGE_TYPE in", values, "manageType");
            return (Criteria) this;
        }

        public Criteria andManageTypeNotIn(List<String> values) {
            addCriterion("MANAGE_TYPE not in", values, "manageType");
            return (Criteria) this;
        }

        public Criteria andManageTypeBetween(String value1, String value2) {
            addCriterion("MANAGE_TYPE between", value1, value2, "manageType");
            return (Criteria) this;
        }

        public Criteria andManageTypeNotBetween(String value1, String value2) {
            addCriterion("MANAGE_TYPE not between", value1, value2, "manageType");
            return (Criteria) this;
        }

        public Criteria andAplModeIsNull() {
            addCriterion("APL_MODE is null");
            return (Criteria) this;
        }

        public Criteria andAplModeIsNotNull() {
            addCriterion("APL_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andAplModeEqualTo(String value) {
            addCriterion("APL_MODE =", value, "aplMode");
            return (Criteria) this;
        }

        public Criteria andAplModeNotEqualTo(String value) {
            addCriterion("APL_MODE <>", value, "aplMode");
            return (Criteria) this;
        }

        public Criteria andAplModeGreaterThan(String value) {
            addCriterion("APL_MODE >", value, "aplMode");
            return (Criteria) this;
        }

        public Criteria andAplModeGreaterThanOrEqualTo(String value) {
            addCriterion("APL_MODE >=", value, "aplMode");
            return (Criteria) this;
        }

        public Criteria andAplModeLessThan(String value) {
            addCriterion("APL_MODE <", value, "aplMode");
            return (Criteria) this;
        }

        public Criteria andAplModeLessThanOrEqualTo(String value) {
            addCriterion("APL_MODE <=", value, "aplMode");
            return (Criteria) this;
        }

        public Criteria andAplModeLike(String value) {
            addCriterion("APL_MODE like", value, "aplMode");
            return (Criteria) this;
        }

        public Criteria andAplModeNotLike(String value) {
            addCriterion("APL_MODE not like", value, "aplMode");
            return (Criteria) this;
        }

        public Criteria andAplModeIn(List<String> values) {
            addCriterion("APL_MODE in", values, "aplMode");
            return (Criteria) this;
        }

        public Criteria andAplModeNotIn(List<String> values) {
            addCriterion("APL_MODE not in", values, "aplMode");
            return (Criteria) this;
        }

        public Criteria andAplModeBetween(String value1, String value2) {
            addCriterion("APL_MODE between", value1, value2, "aplMode");
            return (Criteria) this;
        }

        public Criteria andAplModeNotBetween(String value1, String value2) {
            addCriterion("APL_MODE not between", value1, value2, "aplMode");
            return (Criteria) this;
        }

        public Criteria andRegAplDateIsNull() {
            addCriterion("REG_APL_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRegAplDateIsNotNull() {
            addCriterion("REG_APL_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRegAplDateEqualTo(Date value) {
            addCriterionForJDBCDate("REG_APL_DATE =", value, "regAplDate");
            return (Criteria) this;
        }

        public Criteria andRegAplDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("REG_APL_DATE <>", value, "regAplDate");
            return (Criteria) this;
        }

        public Criteria andRegAplDateGreaterThan(Date value) {
            addCriterionForJDBCDate("REG_APL_DATE >", value, "regAplDate");
            return (Criteria) this;
        }

        public Criteria andRegAplDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REG_APL_DATE >=", value, "regAplDate");
            return (Criteria) this;
        }

        public Criteria andRegAplDateLessThan(Date value) {
            addCriterionForJDBCDate("REG_APL_DATE <", value, "regAplDate");
            return (Criteria) this;
        }

        public Criteria andRegAplDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REG_APL_DATE <=", value, "regAplDate");
            return (Criteria) this;
        }

        public Criteria andRegAplDateIn(List<Date> values) {
            addCriterionForJDBCDate("REG_APL_DATE in", values, "regAplDate");
            return (Criteria) this;
        }

        public Criteria andRegAplDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("REG_APL_DATE not in", values, "regAplDate");
            return (Criteria) this;
        }

        public Criteria andRegAplDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REG_APL_DATE between", value1, value2, "regAplDate");
            return (Criteria) this;
        }

        public Criteria andRegAplDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REG_APL_DATE not between", value1, value2, "regAplDate");
            return (Criteria) this;
        }

        public Criteria andVisaAgencyIsNull() {
            addCriterion("VISA_AGENCY is null");
            return (Criteria) this;
        }

        public Criteria andVisaAgencyIsNotNull() {
            addCriterion("VISA_AGENCY is not null");
            return (Criteria) this;
        }

        public Criteria andVisaAgencyEqualTo(String value) {
            addCriterion("VISA_AGENCY =", value, "visaAgency");
            return (Criteria) this;
        }

        public Criteria andVisaAgencyNotEqualTo(String value) {
            addCriterion("VISA_AGENCY <>", value, "visaAgency");
            return (Criteria) this;
        }

        public Criteria andVisaAgencyGreaterThan(String value) {
            addCriterion("VISA_AGENCY >", value, "visaAgency");
            return (Criteria) this;
        }

        public Criteria andVisaAgencyGreaterThanOrEqualTo(String value) {
            addCriterion("VISA_AGENCY >=", value, "visaAgency");
            return (Criteria) this;
        }

        public Criteria andVisaAgencyLessThan(String value) {
            addCriterion("VISA_AGENCY <", value, "visaAgency");
            return (Criteria) this;
        }

        public Criteria andVisaAgencyLessThanOrEqualTo(String value) {
            addCriterion("VISA_AGENCY <=", value, "visaAgency");
            return (Criteria) this;
        }

        public Criteria andVisaAgencyLike(String value) {
            addCriterion("VISA_AGENCY like", value, "visaAgency");
            return (Criteria) this;
        }

        public Criteria andVisaAgencyNotLike(String value) {
            addCriterion("VISA_AGENCY not like", value, "visaAgency");
            return (Criteria) this;
        }

        public Criteria andVisaAgencyIn(List<String> values) {
            addCriterion("VISA_AGENCY in", values, "visaAgency");
            return (Criteria) this;
        }

        public Criteria andVisaAgencyNotIn(List<String> values) {
            addCriterion("VISA_AGENCY not in", values, "visaAgency");
            return (Criteria) this;
        }

        public Criteria andVisaAgencyBetween(String value1, String value2) {
            addCriterion("VISA_AGENCY between", value1, value2, "visaAgency");
            return (Criteria) this;
        }

        public Criteria andVisaAgencyNotBetween(String value1, String value2) {
            addCriterion("VISA_AGENCY not between", value1, value2, "visaAgency");
            return (Criteria) this;
        }

        public Criteria andObtainAgencyIsNull() {
            addCriterion("OBTAIN_AGENCY is null");
            return (Criteria) this;
        }

        public Criteria andObtainAgencyIsNotNull() {
            addCriterion("OBTAIN_AGENCY is not null");
            return (Criteria) this;
        }

        public Criteria andObtainAgencyEqualTo(String value) {
            addCriterion("OBTAIN_AGENCY =", value, "obtainAgency");
            return (Criteria) this;
        }

        public Criteria andObtainAgencyNotEqualTo(String value) {
            addCriterion("OBTAIN_AGENCY <>", value, "obtainAgency");
            return (Criteria) this;
        }

        public Criteria andObtainAgencyGreaterThan(String value) {
            addCriterion("OBTAIN_AGENCY >", value, "obtainAgency");
            return (Criteria) this;
        }

        public Criteria andObtainAgencyGreaterThanOrEqualTo(String value) {
            addCriterion("OBTAIN_AGENCY >=", value, "obtainAgency");
            return (Criteria) this;
        }

        public Criteria andObtainAgencyLessThan(String value) {
            addCriterion("OBTAIN_AGENCY <", value, "obtainAgency");
            return (Criteria) this;
        }

        public Criteria andObtainAgencyLessThanOrEqualTo(String value) {
            addCriterion("OBTAIN_AGENCY <=", value, "obtainAgency");
            return (Criteria) this;
        }

        public Criteria andObtainAgencyLike(String value) {
            addCriterion("OBTAIN_AGENCY like", value, "obtainAgency");
            return (Criteria) this;
        }

        public Criteria andObtainAgencyNotLike(String value) {
            addCriterion("OBTAIN_AGENCY not like", value, "obtainAgency");
            return (Criteria) this;
        }

        public Criteria andObtainAgencyIn(List<String> values) {
            addCriterion("OBTAIN_AGENCY in", values, "obtainAgency");
            return (Criteria) this;
        }

        public Criteria andObtainAgencyNotIn(List<String> values) {
            addCriterion("OBTAIN_AGENCY not in", values, "obtainAgency");
            return (Criteria) this;
        }

        public Criteria andObtainAgencyBetween(String value1, String value2) {
            addCriterion("OBTAIN_AGENCY between", value1, value2, "obtainAgency");
            return (Criteria) this;
        }

        public Criteria andObtainAgencyNotBetween(String value1, String value2) {
            addCriterion("OBTAIN_AGENCY not between", value1, value2, "obtainAgency");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("NOTE is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("NOTE =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("NOTE <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("NOTE >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("NOTE >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("NOTE <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("NOTE <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("NOTE like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("NOTE not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("NOTE in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("NOTE not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("NOTE between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("NOTE not between", value1, value2, "note");
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