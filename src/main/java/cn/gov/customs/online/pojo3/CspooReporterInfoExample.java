package cn.gov.customs.online.pojo3;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CspooReporterInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CspooReporterInfoExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIdnoIsNull() {
            addCriterion("IDNO is null");
            return (Criteria) this;
        }

        public Criteria andIdnoIsNotNull() {
            addCriterion("IDNO is not null");
            return (Criteria) this;
        }

        public Criteria andIdnoEqualTo(String value) {
            addCriterion("IDNO =", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotEqualTo(String value) {
            addCriterion("IDNO <>", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoGreaterThan(String value) {
            addCriterion("IDNO >", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoGreaterThanOrEqualTo(String value) {
            addCriterion("IDNO >=", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoLessThan(String value) {
            addCriterion("IDNO <", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoLessThanOrEqualTo(String value) {
            addCriterion("IDNO <=", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoLike(String value) {
            addCriterion("IDNO like", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotLike(String value) {
            addCriterion("IDNO not like", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoIn(List<String> values) {
            addCriterion("IDNO in", values, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotIn(List<String> values) {
            addCriterion("IDNO not in", values, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoBetween(String value1, String value2) {
            addCriterion("IDNO between", value1, value2, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotBetween(String value1, String value2) {
            addCriterion("IDNO not between", value1, value2, "idno");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("TEL is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("TEL is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("TEL =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("TEL <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("TEL >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("TEL >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("TEL <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("TEL <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("TEL like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("TEL not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("TEL in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("TEL not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("TEL between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("TEL not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andPowerOfAttorneyIsNull() {
            addCriterion("POWER_OF_ATTORNEY is null");
            return (Criteria) this;
        }

        public Criteria andPowerOfAttorneyIsNotNull() {
            addCriterion("POWER_OF_ATTORNEY is not null");
            return (Criteria) this;
        }

        public Criteria andPowerOfAttorneyEqualTo(String value) {
            addCriterion("POWER_OF_ATTORNEY =", value, "powerOfAttorney");
            return (Criteria) this;
        }

        public Criteria andPowerOfAttorneyNotEqualTo(String value) {
            addCriterion("POWER_OF_ATTORNEY <>", value, "powerOfAttorney");
            return (Criteria) this;
        }

        public Criteria andPowerOfAttorneyGreaterThan(String value) {
            addCriterion("POWER_OF_ATTORNEY >", value, "powerOfAttorney");
            return (Criteria) this;
        }

        public Criteria andPowerOfAttorneyGreaterThanOrEqualTo(String value) {
            addCriterion("POWER_OF_ATTORNEY >=", value, "powerOfAttorney");
            return (Criteria) this;
        }

        public Criteria andPowerOfAttorneyLessThan(String value) {
            addCriterion("POWER_OF_ATTORNEY <", value, "powerOfAttorney");
            return (Criteria) this;
        }

        public Criteria andPowerOfAttorneyLessThanOrEqualTo(String value) {
            addCriterion("POWER_OF_ATTORNEY <=", value, "powerOfAttorney");
            return (Criteria) this;
        }

        public Criteria andPowerOfAttorneyLike(String value) {
            addCriterion("POWER_OF_ATTORNEY like", value, "powerOfAttorney");
            return (Criteria) this;
        }

        public Criteria andPowerOfAttorneyNotLike(String value) {
            addCriterion("POWER_OF_ATTORNEY not like", value, "powerOfAttorney");
            return (Criteria) this;
        }

        public Criteria andPowerOfAttorneyIn(List<String> values) {
            addCriterion("POWER_OF_ATTORNEY in", values, "powerOfAttorney");
            return (Criteria) this;
        }

        public Criteria andPowerOfAttorneyNotIn(List<String> values) {
            addCriterion("POWER_OF_ATTORNEY not in", values, "powerOfAttorney");
            return (Criteria) this;
        }

        public Criteria andPowerOfAttorneyBetween(String value1, String value2) {
            addCriterion("POWER_OF_ATTORNEY between", value1, value2, "powerOfAttorney");
            return (Criteria) this;
        }

        public Criteria andPowerOfAttorneyNotBetween(String value1, String value2) {
            addCriterion("POWER_OF_ATTORNEY not between", value1, value2, "powerOfAttorney");
            return (Criteria) this;
        }

        public Criteria andIdimgIsNull() {
            addCriterion("IDIMG is null");
            return (Criteria) this;
        }

        public Criteria andIdimgIsNotNull() {
            addCriterion("IDIMG is not null");
            return (Criteria) this;
        }

        public Criteria andIdimgEqualTo(String value) {
            addCriterion("IDIMG =", value, "idimg");
            return (Criteria) this;
        }

        public Criteria andIdimgNotEqualTo(String value) {
            addCriterion("IDIMG <>", value, "idimg");
            return (Criteria) this;
        }

        public Criteria andIdimgGreaterThan(String value) {
            addCriterion("IDIMG >", value, "idimg");
            return (Criteria) this;
        }

        public Criteria andIdimgGreaterThanOrEqualTo(String value) {
            addCriterion("IDIMG >=", value, "idimg");
            return (Criteria) this;
        }

        public Criteria andIdimgLessThan(String value) {
            addCriterion("IDIMG <", value, "idimg");
            return (Criteria) this;
        }

        public Criteria andIdimgLessThanOrEqualTo(String value) {
            addCriterion("IDIMG <=", value, "idimg");
            return (Criteria) this;
        }

        public Criteria andIdimgLike(String value) {
            addCriterion("IDIMG like", value, "idimg");
            return (Criteria) this;
        }

        public Criteria andIdimgNotLike(String value) {
            addCriterion("IDIMG not like", value, "idimg");
            return (Criteria) this;
        }

        public Criteria andIdimgIn(List<String> values) {
            addCriterion("IDIMG in", values, "idimg");
            return (Criteria) this;
        }

        public Criteria andIdimgNotIn(List<String> values) {
            addCriterion("IDIMG not in", values, "idimg");
            return (Criteria) this;
        }

        public Criteria andIdimgBetween(String value1, String value2) {
            addCriterion("IDIMG between", value1, value2, "idimg");
            return (Criteria) this;
        }

        public Criteria andIdimgNotBetween(String value1, String value2) {
            addCriterion("IDIMG not between", value1, value2, "idimg");
            return (Criteria) this;
        }

        public Criteria andElecSignHandwritingIsNull() {
            addCriterion("ELEC_SIGN_HANDWRITING is null");
            return (Criteria) this;
        }

        public Criteria andElecSignHandwritingIsNotNull() {
            addCriterion("ELEC_SIGN_HANDWRITING is not null");
            return (Criteria) this;
        }

        public Criteria andElecSignHandwritingEqualTo(String value) {
            addCriterion("ELEC_SIGN_HANDWRITING =", value, "elecSignHandwriting");
            return (Criteria) this;
        }

        public Criteria andElecSignHandwritingNotEqualTo(String value) {
            addCriterion("ELEC_SIGN_HANDWRITING <>", value, "elecSignHandwriting");
            return (Criteria) this;
        }

        public Criteria andElecSignHandwritingGreaterThan(String value) {
            addCriterion("ELEC_SIGN_HANDWRITING >", value, "elecSignHandwriting");
            return (Criteria) this;
        }

        public Criteria andElecSignHandwritingGreaterThanOrEqualTo(String value) {
            addCriterion("ELEC_SIGN_HANDWRITING >=", value, "elecSignHandwriting");
            return (Criteria) this;
        }

        public Criteria andElecSignHandwritingLessThan(String value) {
            addCriterion("ELEC_SIGN_HANDWRITING <", value, "elecSignHandwriting");
            return (Criteria) this;
        }

        public Criteria andElecSignHandwritingLessThanOrEqualTo(String value) {
            addCriterion("ELEC_SIGN_HANDWRITING <=", value, "elecSignHandwriting");
            return (Criteria) this;
        }

        public Criteria andElecSignHandwritingLike(String value) {
            addCriterion("ELEC_SIGN_HANDWRITING like", value, "elecSignHandwriting");
            return (Criteria) this;
        }

        public Criteria andElecSignHandwritingNotLike(String value) {
            addCriterion("ELEC_SIGN_HANDWRITING not like", value, "elecSignHandwriting");
            return (Criteria) this;
        }

        public Criteria andElecSignHandwritingIn(List<String> values) {
            addCriterion("ELEC_SIGN_HANDWRITING in", values, "elecSignHandwriting");
            return (Criteria) this;
        }

        public Criteria andElecSignHandwritingNotIn(List<String> values) {
            addCriterion("ELEC_SIGN_HANDWRITING not in", values, "elecSignHandwriting");
            return (Criteria) this;
        }

        public Criteria andElecSignHandwritingBetween(String value1, String value2) {
            addCriterion("ELEC_SIGN_HANDWRITING between", value1, value2, "elecSignHandwriting");
            return (Criteria) this;
        }

        public Criteria andElecSignHandwritingNotBetween(String value1, String value2) {
            addCriterion("ELEC_SIGN_HANDWRITING not between", value1, value2, "elecSignHandwriting");
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