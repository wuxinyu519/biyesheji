package org.spring.springboot.domain;

import java.util.ArrayList;
import java.util.List;

public class LiulangchongwuExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public LiulangchongwuExample() {
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

		public Criteria andTupianIsNull() {
			addCriterion("tupian is null");
			return (Criteria) this;
		}

		public Criteria andTupianIsNotNull() {
			addCriterion("tupian is not null");
			return (Criteria) this;
		}

		public Criteria andTupianEqualTo(String value) {
			addCriterion("tupian =", value, "tupian");
			return (Criteria) this;
		}

		public Criteria andTupianNotEqualTo(String value) {
			addCriterion("tupian <>", value, "tupian");
			return (Criteria) this;
		}

		public Criteria andTupianGreaterThan(String value) {
			addCriterion("tupian >", value, "tupian");
			return (Criteria) this;
		}

		public Criteria andTupianGreaterThanOrEqualTo(String value) {
			addCriterion("tupian >=", value, "tupian");
			return (Criteria) this;
		}

		public Criteria andTupianLessThan(String value) {
			addCriterion("tupian <", value, "tupian");
			return (Criteria) this;
		}

		public Criteria andTupianLessThanOrEqualTo(String value) {
			addCriterion("tupian <=", value, "tupian");
			return (Criteria) this;
		}

		public Criteria andTupianLike(String value) {
			addCriterion("tupian like", value, "tupian");
			return (Criteria) this;
		}

		public Criteria andTupianNotLike(String value) {
			addCriterion("tupian not like", value, "tupian");
			return (Criteria) this;
		}

		public Criteria andTupianIn(List<String> values) {
			addCriterion("tupian in", values, "tupian");
			return (Criteria) this;
		}

		public Criteria andTupianNotIn(List<String> values) {
			addCriterion("tupian not in", values, "tupian");
			return (Criteria) this;
		}

		public Criteria andTupianBetween(String value1, String value2) {
			addCriterion("tupian between", value1, value2, "tupian");
			return (Criteria) this;
		}

		public Criteria andTupianNotBetween(String value1, String value2) {
			addCriterion("tupian not between", value1, value2, "tupian");
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

		public Criteria andZhuyiIsNull() {
			addCriterion("zhuyi is null");
			return (Criteria) this;
		}

		public Criteria andZhuyiIsNotNull() {
			addCriterion("zhuyi is not null");
			return (Criteria) this;
		}

		public Criteria andZhuyiEqualTo(String value) {
			addCriterion("zhuyi =", value, "zhuyi");
			return (Criteria) this;
		}

		public Criteria andZhuyiNotEqualTo(String value) {
			addCriterion("zhuyi <>", value, "zhuyi");
			return (Criteria) this;
		}

		public Criteria andZhuyiGreaterThan(String value) {
			addCriterion("zhuyi >", value, "zhuyi");
			return (Criteria) this;
		}

		public Criteria andZhuyiGreaterThanOrEqualTo(String value) {
			addCriterion("zhuyi >=", value, "zhuyi");
			return (Criteria) this;
		}

		public Criteria andZhuyiLessThan(String value) {
			addCriterion("zhuyi <", value, "zhuyi");
			return (Criteria) this;
		}

		public Criteria andZhuyiLessThanOrEqualTo(String value) {
			addCriterion("zhuyi <=", value, "zhuyi");
			return (Criteria) this;
		}

		public Criteria andZhuyiLike(String value) {
			addCriterion("zhuyi like", value, "zhuyi");
			return (Criteria) this;
		}

		public Criteria andZhuyiNotLike(String value) {
			addCriterion("zhuyi not like", value, "zhuyi");
			return (Criteria) this;
		}

		public Criteria andZhuyiIn(List<String> values) {
			addCriterion("zhuyi in", values, "zhuyi");
			return (Criteria) this;
		}

		public Criteria andZhuyiNotIn(List<String> values) {
			addCriterion("zhuyi not in", values, "zhuyi");
			return (Criteria) this;
		}

		public Criteria andZhuyiBetween(String value1, String value2) {
			addCriterion("zhuyi between", value1, value2, "zhuyi");
			return (Criteria) this;
		}

		public Criteria andZhuyiNotBetween(String value1, String value2) {
			addCriterion("zhuyi not between", value1, value2, "zhuyi");
			return (Criteria) this;
		}

		public Criteria andLeibieIsNull() {
			addCriterion("leibie is null");
			return (Criteria) this;
		}

		public Criteria andLeibieIsNotNull() {
			addCriterion("leibie is not null");
			return (Criteria) this;
		}

		public Criteria andLeibieEqualTo(String value) {
			addCriterion("leibie =", value, "leibie");
			return (Criteria) this;
		}

		public Criteria andLeibieNotEqualTo(String value) {
			addCriterion("leibie <>", value, "leibie");
			return (Criteria) this;
		}

		public Criteria andLeibieGreaterThan(String value) {
			addCriterion("leibie >", value, "leibie");
			return (Criteria) this;
		}

		public Criteria andLeibieGreaterThanOrEqualTo(String value) {
			addCriterion("leibie >=", value, "leibie");
			return (Criteria) this;
		}

		public Criteria andLeibieLessThan(String value) {
			addCriterion("leibie <", value, "leibie");
			return (Criteria) this;
		}

		public Criteria andLeibieLessThanOrEqualTo(String value) {
			addCriterion("leibie <=", value, "leibie");
			return (Criteria) this;
		}

		public Criteria andLeibieLike(String value) {
			addCriterion("leibie like", value, "leibie");
			return (Criteria) this;
		}

		public Criteria andLeibieNotLike(String value) {
			addCriterion("leibie not like", value, "leibie");
			return (Criteria) this;
		}

		public Criteria andLeibieIn(List<String> values) {
			addCriterion("leibie in", values, "leibie");
			return (Criteria) this;
		}

		public Criteria andLeibieNotIn(List<String> values) {
			addCriterion("leibie not in", values, "leibie");
			return (Criteria) this;
		}

		public Criteria andLeibieBetween(String value1, String value2) {
			addCriterion("leibie between", value1, value2, "leibie");
			return (Criteria) this;
		}

		public Criteria andLeibieNotBetween(String value1, String value2) {
			addCriterion("leibie not between", value1, value2, "leibie");
			return (Criteria) this;
		}

		public Criteria andLeibieidIsNull() {
			addCriterion("leibieid is null");
			return (Criteria) this;
		}

		public Criteria andLeibieidIsNotNull() {
			addCriterion("leibieid is not null");
			return (Criteria) this;
		}

		public Criteria andLeibieidEqualTo(Integer value) {
			addCriterion("leibieid =", value, "leibieid");
			return (Criteria) this;
		}

		public Criteria andLeibieidNotEqualTo(Integer value) {
			addCriterion("leibieid <>", value, "leibieid");
			return (Criteria) this;
		}

		public Criteria andLeibieidGreaterThan(Integer value) {
			addCriterion("leibieid >", value, "leibieid");
			return (Criteria) this;
		}

		public Criteria andLeibieidGreaterThanOrEqualTo(Integer value) {
			addCriterion("leibieid >=", value, "leibieid");
			return (Criteria) this;
		}

		public Criteria andLeibieidLessThan(Integer value) {
			addCriterion("leibieid <", value, "leibieid");
			return (Criteria) this;
		}

		public Criteria andLeibieidLessThanOrEqualTo(Integer value) {
			addCriterion("leibieid <=", value, "leibieid");
			return (Criteria) this;
		}

		public Criteria andLeibieidIn(List<Integer> values) {
			addCriterion("leibieid in", values, "leibieid");
			return (Criteria) this;
		}

		public Criteria andLeibieidNotIn(List<Integer> values) {
			addCriterion("leibieid not in", values, "leibieid");
			return (Criteria) this;
		}

		public Criteria andLeibieidBetween(Integer value1, Integer value2) {
			addCriterion("leibieid between", value1, value2, "leibieid");
			return (Criteria) this;
		}

		public Criteria andLeibieidNotBetween(Integer value1, Integer value2) {
			addCriterion("leibieid not between", value1, value2, "leibieid");
			return (Criteria) this;
		}

		public Criteria andStateIsNull() {
			addCriterion("state is null");
			return (Criteria) this;
		}

		public Criteria andStateIsNotNull() {
			addCriterion("state is not null");
			return (Criteria) this;
		}

		public Criteria andStateEqualTo(String value) {
			addCriterion("state =", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotEqualTo(String value) {
			addCriterion("state <>", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateGreaterThan(String value) {
			addCriterion("state >", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateGreaterThanOrEqualTo(String value) {
			addCriterion("state >=", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateLessThan(String value) {
			addCriterion("state <", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateLessThanOrEqualTo(String value) {
			addCriterion("state <=", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateLike(String value) {
			addCriterion("state like", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotLike(String value) {
			addCriterion("state not like", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateIn(List<String> values) {
			addCriterion("state in", values, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotIn(List<String> values) {
			addCriterion("state not in", values, "state");
			return (Criteria) this;
		}

		public Criteria andStateBetween(String value1, String value2) {
			addCriterion("state between", value1, value2, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotBetween(String value1, String value2) {
			addCriterion("state not between", value1, value2, "state");
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