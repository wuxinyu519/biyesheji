package org.spring.springboot.domain;

import java.util.ArrayList;
import java.util.List;

public class XitongshuomingExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public XitongshuomingExample() {
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

		public Criteria andBiaotiIsNull() {
			addCriterion("biaoti is null");
			return (Criteria) this;
		}

		public Criteria andBiaotiIsNotNull() {
			addCriterion("biaoti is not null");
			return (Criteria) this;
		}

		public Criteria andBiaotiEqualTo(String value) {
			addCriterion("biaoti =", value, "biaoti");
			return (Criteria) this;
		}

		public Criteria andBiaotiNotEqualTo(String value) {
			addCriterion("biaoti <>", value, "biaoti");
			return (Criteria) this;
		}

		public Criteria andBiaotiGreaterThan(String value) {
			addCriterion("biaoti >", value, "biaoti");
			return (Criteria) this;
		}

		public Criteria andBiaotiGreaterThanOrEqualTo(String value) {
			addCriterion("biaoti >=", value, "biaoti");
			return (Criteria) this;
		}

		public Criteria andBiaotiLessThan(String value) {
			addCriterion("biaoti <", value, "biaoti");
			return (Criteria) this;
		}

		public Criteria andBiaotiLessThanOrEqualTo(String value) {
			addCriterion("biaoti <=", value, "biaoti");
			return (Criteria) this;
		}

		public Criteria andBiaotiLike(String value) {
			addCriterion("biaoti like", value, "biaoti");
			return (Criteria) this;
		}

		public Criteria andBiaotiNotLike(String value) {
			addCriterion("biaoti not like", value, "biaoti");
			return (Criteria) this;
		}

		public Criteria andBiaotiIn(List<String> values) {
			addCriterion("biaoti in", values, "biaoti");
			return (Criteria) this;
		}

		public Criteria andBiaotiNotIn(List<String> values) {
			addCriterion("biaoti not in", values, "biaoti");
			return (Criteria) this;
		}

		public Criteria andBiaotiBetween(String value1, String value2) {
			addCriterion("biaoti between", value1, value2, "biaoti");
			return (Criteria) this;
		}

		public Criteria andBiaotiNotBetween(String value1, String value2) {
			addCriterion("biaoti not between", value1, value2, "biaoti");
			return (Criteria) this;
		}

		public Criteria andMokuaiIsNull() {
			addCriterion("mokuai is null");
			return (Criteria) this;
		}

		public Criteria andMokuaiIsNotNull() {
			addCriterion("mokuai is not null");
			return (Criteria) this;
		}

		public Criteria andMokuaiEqualTo(String value) {
			addCriterion("mokuai =", value, "mokuai");
			return (Criteria) this;
		}

		public Criteria andMokuaiNotEqualTo(String value) {
			addCriterion("mokuai <>", value, "mokuai");
			return (Criteria) this;
		}

		public Criteria andMokuaiGreaterThan(String value) {
			addCriterion("mokuai >", value, "mokuai");
			return (Criteria) this;
		}

		public Criteria andMokuaiGreaterThanOrEqualTo(String value) {
			addCriterion("mokuai >=", value, "mokuai");
			return (Criteria) this;
		}

		public Criteria andMokuaiLessThan(String value) {
			addCriterion("mokuai <", value, "mokuai");
			return (Criteria) this;
		}

		public Criteria andMokuaiLessThanOrEqualTo(String value) {
			addCriterion("mokuai <=", value, "mokuai");
			return (Criteria) this;
		}

		public Criteria andMokuaiLike(String value) {
			addCriterion("mokuai like", value, "mokuai");
			return (Criteria) this;
		}

		public Criteria andMokuaiNotLike(String value) {
			addCriterion("mokuai not like", value, "mokuai");
			return (Criteria) this;
		}

		public Criteria andMokuaiIn(List<String> values) {
			addCriterion("mokuai in", values, "mokuai");
			return (Criteria) this;
		}

		public Criteria andMokuaiNotIn(List<String> values) {
			addCriterion("mokuai not in", values, "mokuai");
			return (Criteria) this;
		}

		public Criteria andMokuaiBetween(String value1, String value2) {
			addCriterion("mokuai between", value1, value2, "mokuai");
			return (Criteria) this;
		}

		public Criteria andMokuaiNotBetween(String value1, String value2) {
			addCriterion("mokuai not between", value1, value2, "mokuai");
			return (Criteria) this;
		}

		public Criteria andNeirongIsNull() {
			addCriterion("neirong is null");
			return (Criteria) this;
		}

		public Criteria andNeirongIsNotNull() {
			addCriterion("neirong is not null");
			return (Criteria) this;
		}

		public Criteria andNeirongEqualTo(String value) {
			addCriterion("neirong =", value, "neirong");
			return (Criteria) this;
		}

		public Criteria andNeirongNotEqualTo(String value) {
			addCriterion("neirong <>", value, "neirong");
			return (Criteria) this;
		}

		public Criteria andNeirongGreaterThan(String value) {
			addCriterion("neirong >", value, "neirong");
			return (Criteria) this;
		}

		public Criteria andNeirongGreaterThanOrEqualTo(String value) {
			addCriterion("neirong >=", value, "neirong");
			return (Criteria) this;
		}

		public Criteria andNeirongLessThan(String value) {
			addCriterion("neirong <", value, "neirong");
			return (Criteria) this;
		}

		public Criteria andNeirongLessThanOrEqualTo(String value) {
			addCriterion("neirong <=", value, "neirong");
			return (Criteria) this;
		}

		public Criteria andNeirongLike(String value) {
			addCriterion("neirong like", value, "neirong");
			return (Criteria) this;
		}

		public Criteria andNeirongNotLike(String value) {
			addCriterion("neirong not like", value, "neirong");
			return (Criteria) this;
		}

		public Criteria andNeirongIn(List<String> values) {
			addCriterion("neirong in", values, "neirong");
			return (Criteria) this;
		}

		public Criteria andNeirongNotIn(List<String> values) {
			addCriterion("neirong not in", values, "neirong");
			return (Criteria) this;
		}

		public Criteria andNeirongBetween(String value1, String value2) {
			addCriterion("neirong between", value1, value2, "neirong");
			return (Criteria) this;
		}

		public Criteria andNeirongNotBetween(String value1, String value2) {
			addCriterion("neirong not between", value1, value2, "neirong");
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