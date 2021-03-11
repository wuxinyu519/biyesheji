package org.spring.springboot.domain;

import java.util.ArrayList;
import java.util.List;

public class YonghuExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public YonghuExample() {
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

		public Criteria andMingziIsNull() {
			addCriterion("mingzi is null");
			return (Criteria) this;
		}

		public Criteria andMingziIsNotNull() {
			addCriterion("mingzi is not null");
			return (Criteria) this;
		}

		public Criteria andMingziEqualTo(String value) {
			addCriterion("mingzi =", value, "mingzi");
			return (Criteria) this;
		}

		public Criteria andMingziNotEqualTo(String value) {
			addCriterion("mingzi <>", value, "mingzi");
			return (Criteria) this;
		}

		public Criteria andMingziGreaterThan(String value) {
			addCriterion("mingzi >", value, "mingzi");
			return (Criteria) this;
		}

		public Criteria andMingziGreaterThanOrEqualTo(String value) {
			addCriterion("mingzi >=", value, "mingzi");
			return (Criteria) this;
		}

		public Criteria andMingziLessThan(String value) {
			addCriterion("mingzi <", value, "mingzi");
			return (Criteria) this;
		}

		public Criteria andMingziLessThanOrEqualTo(String value) {
			addCriterion("mingzi <=", value, "mingzi");
			return (Criteria) this;
		}

		public Criteria andMingziLike(String value) {
			addCriterion("mingzi like", value, "mingzi");
			return (Criteria) this;
		}

		public Criteria andMingziNotLike(String value) {
			addCriterion("mingzi not like", value, "mingzi");
			return (Criteria) this;
		}

		public Criteria andMingziIn(List<String> values) {
			addCriterion("mingzi in", values, "mingzi");
			return (Criteria) this;
		}

		public Criteria andMingziNotIn(List<String> values) {
			addCriterion("mingzi not in", values, "mingzi");
			return (Criteria) this;
		}

		public Criteria andMingziBetween(String value1, String value2) {
			addCriterion("mingzi between", value1, value2, "mingzi");
			return (Criteria) this;
		}

		public Criteria andMingziNotBetween(String value1, String value2) {
			addCriterion("mingzi not between", value1, value2, "mingzi");
			return (Criteria) this;
		}

		public Criteria andUsernameIsNull() {
			addCriterion("username is null");
			return (Criteria) this;
		}

		public Criteria andUsernameIsNotNull() {
			addCriterion("username is not null");
			return (Criteria) this;
		}

		public Criteria andUsernameEqualTo(String value) {
			addCriterion("username =", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotEqualTo(String value) {
			addCriterion("username <>", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameGreaterThan(String value) {
			addCriterion("username >", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameGreaterThanOrEqualTo(String value) {
			addCriterion("username >=", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLessThan(String value) {
			addCriterion("username <", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLessThanOrEqualTo(String value) {
			addCriterion("username <=", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLike(String value) {
			addCriterion("username like", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotLike(String value) {
			addCriterion("username not like", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameIn(List<String> values) {
			addCriterion("username in", values, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotIn(List<String> values) {
			addCriterion("username not in", values, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameBetween(String value1, String value2) {
			addCriterion("username between", value1, value2, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotBetween(String value1, String value2) {
			addCriterion("username not between", value1, value2, "username");
			return (Criteria) this;
		}

		public Criteria andPasswordIsNull() {
			addCriterion("password is null");
			return (Criteria) this;
		}

		public Criteria andPasswordIsNotNull() {
			addCriterion("password is not null");
			return (Criteria) this;
		}

		public Criteria andPasswordEqualTo(String value) {
			addCriterion("password =", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotEqualTo(String value) {
			addCriterion("password <>", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordGreaterThan(String value) {
			addCriterion("password >", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordGreaterThanOrEqualTo(String value) {
			addCriterion("password >=", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLessThan(String value) {
			addCriterion("password <", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLessThanOrEqualTo(String value) {
			addCriterion("password <=", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLike(String value) {
			addCriterion("password like", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotLike(String value) {
			addCriterion("password not like", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordIn(List<String> values) {
			addCriterion("password in", values, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotIn(List<String> values) {
			addCriterion("password not in", values, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordBetween(String value1, String value2) {
			addCriterion("password between", value1, value2, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotBetween(String value1, String value2) {
			addCriterion("password not between", value1, value2, "password");
			return (Criteria) this;
		}

		public Criteria andXingbieIsNull() {
			addCriterion("xingbie is null");
			return (Criteria) this;
		}

		public Criteria andXingbieIsNotNull() {
			addCriterion("xingbie is not null");
			return (Criteria) this;
		}

		public Criteria andXingbieEqualTo(String value) {
			addCriterion("xingbie =", value, "xingbie");
			return (Criteria) this;
		}

		public Criteria andXingbieNotEqualTo(String value) {
			addCriterion("xingbie <>", value, "xingbie");
			return (Criteria) this;
		}

		public Criteria andXingbieGreaterThan(String value) {
			addCriterion("xingbie >", value, "xingbie");
			return (Criteria) this;
		}

		public Criteria andXingbieGreaterThanOrEqualTo(String value) {
			addCriterion("xingbie >=", value, "xingbie");
			return (Criteria) this;
		}

		public Criteria andXingbieLessThan(String value) {
			addCriterion("xingbie <", value, "xingbie");
			return (Criteria) this;
		}

		public Criteria andXingbieLessThanOrEqualTo(String value) {
			addCriterion("xingbie <=", value, "xingbie");
			return (Criteria) this;
		}

		public Criteria andXingbieLike(String value) {
			addCriterion("xingbie like", value, "xingbie");
			return (Criteria) this;
		}

		public Criteria andXingbieNotLike(String value) {
			addCriterion("xingbie not like", value, "xingbie");
			return (Criteria) this;
		}

		public Criteria andXingbieIn(List<String> values) {
			addCriterion("xingbie in", values, "xingbie");
			return (Criteria) this;
		}

		public Criteria andXingbieNotIn(List<String> values) {
			addCriterion("xingbie not in", values, "xingbie");
			return (Criteria) this;
		}

		public Criteria andXingbieBetween(String value1, String value2) {
			addCriterion("xingbie between", value1, value2, "xingbie");
			return (Criteria) this;
		}

		public Criteria andXingbieNotBetween(String value1, String value2) {
			addCriterion("xingbie not between", value1, value2, "xingbie");
			return (Criteria) this;
		}

		public Criteria andJieshaoIsNull() {
			addCriterion("jieshao is null");
			return (Criteria) this;
		}

		public Criteria andJieshaoIsNotNull() {
			addCriterion("jieshao is not null");
			return (Criteria) this;
		}

		public Criteria andJieshaoEqualTo(String value) {
			addCriterion("jieshao =", value, "jieshao");
			return (Criteria) this;
		}

		public Criteria andJieshaoNotEqualTo(String value) {
			addCriterion("jieshao <>", value, "jieshao");
			return (Criteria) this;
		}

		public Criteria andJieshaoGreaterThan(String value) {
			addCriterion("jieshao >", value, "jieshao");
			return (Criteria) this;
		}

		public Criteria andJieshaoGreaterThanOrEqualTo(String value) {
			addCriterion("jieshao >=", value, "jieshao");
			return (Criteria) this;
		}

		public Criteria andJieshaoLessThan(String value) {
			addCriterion("jieshao <", value, "jieshao");
			return (Criteria) this;
		}

		public Criteria andJieshaoLessThanOrEqualTo(String value) {
			addCriterion("jieshao <=", value, "jieshao");
			return (Criteria) this;
		}

		public Criteria andJieshaoLike(String value) {
			addCriterion("jieshao like", value, "jieshao");
			return (Criteria) this;
		}

		public Criteria andJieshaoNotLike(String value) {
			addCriterion("jieshao not like", value, "jieshao");
			return (Criteria) this;
		}

		public Criteria andJieshaoIn(List<String> values) {
			addCriterion("jieshao in", values, "jieshao");
			return (Criteria) this;
		}

		public Criteria andJieshaoNotIn(List<String> values) {
			addCriterion("jieshao not in", values, "jieshao");
			return (Criteria) this;
		}

		public Criteria andJieshaoBetween(String value1, String value2) {
			addCriterion("jieshao between", value1, value2, "jieshao");
			return (Criteria) this;
		}

		public Criteria andJieshaoNotBetween(String value1, String value2) {
			addCriterion("jieshao not between", value1, value2, "jieshao");
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