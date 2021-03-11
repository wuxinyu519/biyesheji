package org.spring.springboot.domain;

import java.util.ArrayList;
import java.util.List;

public class LingyangExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public LingyangExample() {
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

		public Criteria andLiulangchongwuIsNull() {
			addCriterion("liulangchongwu is null");
			return (Criteria) this;
		}

		public Criteria andLiulangchongwuIsNotNull() {
			addCriterion("liulangchongwu is not null");
			return (Criteria) this;
		}

		public Criteria andLiulangchongwuEqualTo(String value) {
			addCriterion("liulangchongwu =", value, "liulangchongwu");
			return (Criteria) this;
		}

		public Criteria andLiulangchongwuNotEqualTo(String value) {
			addCriterion("liulangchongwu <>", value, "liulangchongwu");
			return (Criteria) this;
		}

		public Criteria andLiulangchongwuGreaterThan(String value) {
			addCriterion("liulangchongwu >", value, "liulangchongwu");
			return (Criteria) this;
		}

		public Criteria andLiulangchongwuGreaterThanOrEqualTo(String value) {
			addCriterion("liulangchongwu >=", value, "liulangchongwu");
			return (Criteria) this;
		}

		public Criteria andLiulangchongwuLessThan(String value) {
			addCriterion("liulangchongwu <", value, "liulangchongwu");
			return (Criteria) this;
		}

		public Criteria andLiulangchongwuLessThanOrEqualTo(String value) {
			addCriterion("liulangchongwu <=", value, "liulangchongwu");
			return (Criteria) this;
		}

		public Criteria andLiulangchongwuLike(String value) {
			addCriterion("liulangchongwu like", value, "liulangchongwu");
			return (Criteria) this;
		}

		public Criteria andLiulangchongwuNotLike(String value) {
			addCriterion("liulangchongwu not like", value, "liulangchongwu");
			return (Criteria) this;
		}

		public Criteria andLiulangchongwuIn(List<String> values) {
			addCriterion("liulangchongwu in", values, "liulangchongwu");
			return (Criteria) this;
		}

		public Criteria andLiulangchongwuNotIn(List<String> values) {
			addCriterion("liulangchongwu not in", values, "liulangchongwu");
			return (Criteria) this;
		}

		public Criteria andLiulangchongwuBetween(String value1, String value2) {
			addCriterion("liulangchongwu between", value1, value2, "liulangchongwu");
			return (Criteria) this;
		}

		public Criteria andLiulangchongwuNotBetween(String value1, String value2) {
			addCriterion("liulangchongwu not between", value1, value2, "liulangchongwu");
			return (Criteria) this;
		}

		public Criteria andLiulangchongwuidIsNull() {
			addCriterion("liulangchongwuid is null");
			return (Criteria) this;
		}

		public Criteria andLiulangchongwuidIsNotNull() {
			addCriterion("liulangchongwuid is not null");
			return (Criteria) this;
		}

		public Criteria andLiulangchongwuidEqualTo(Integer value) {
			addCriterion("liulangchongwuid =", value, "liulangchongwuid");
			return (Criteria) this;
		}

		public Criteria andLiulangchongwuidNotEqualTo(Integer value) {
			addCriterion("liulangchongwuid <>", value, "liulangchongwuid");
			return (Criteria) this;
		}

		public Criteria andLiulangchongwuidGreaterThan(Integer value) {
			addCriterion("liulangchongwuid >", value, "liulangchongwuid");
			return (Criteria) this;
		}

		public Criteria andLiulangchongwuidGreaterThanOrEqualTo(Integer value) {
			addCriterion("liulangchongwuid >=", value, "liulangchongwuid");
			return (Criteria) this;
		}

		public Criteria andLiulangchongwuidLessThan(Integer value) {
			addCriterion("liulangchongwuid <", value, "liulangchongwuid");
			return (Criteria) this;
		}

		public Criteria andLiulangchongwuidLessThanOrEqualTo(Integer value) {
			addCriterion("liulangchongwuid <=", value, "liulangchongwuid");
			return (Criteria) this;
		}

		public Criteria andLiulangchongwuidIn(List<Integer> values) {
			addCriterion("liulangchongwuid in", values, "liulangchongwuid");
			return (Criteria) this;
		}

		public Criteria andLiulangchongwuidNotIn(List<Integer> values) {
			addCriterion("liulangchongwuid not in", values, "liulangchongwuid");
			return (Criteria) this;
		}

		public Criteria andLiulangchongwuidBetween(Integer value1, Integer value2) {
			addCriterion("liulangchongwuid between", value1, value2, "liulangchongwuid");
			return (Criteria) this;
		}

		public Criteria andLiulangchongwuidNotBetween(Integer value1, Integer value2) {
			addCriterion("liulangchongwuid not between", value1, value2, "liulangchongwuid");
			return (Criteria) this;
		}

		public Criteria andYonghuIsNull() {
			addCriterion("yonghu is null");
			return (Criteria) this;
		}

		public Criteria andYonghuIsNotNull() {
			addCriterion("yonghu is not null");
			return (Criteria) this;
		}

		public Criteria andYonghuEqualTo(String value) {
			addCriterion("yonghu =", value, "yonghu");
			return (Criteria) this;
		}

		public Criteria andYonghuNotEqualTo(String value) {
			addCriterion("yonghu <>", value, "yonghu");
			return (Criteria) this;
		}

		public Criteria andYonghuGreaterThan(String value) {
			addCriterion("yonghu >", value, "yonghu");
			return (Criteria) this;
		}

		public Criteria andYonghuGreaterThanOrEqualTo(String value) {
			addCriterion("yonghu >=", value, "yonghu");
			return (Criteria) this;
		}

		public Criteria andYonghuLessThan(String value) {
			addCriterion("yonghu <", value, "yonghu");
			return (Criteria) this;
		}

		public Criteria andYonghuLessThanOrEqualTo(String value) {
			addCriterion("yonghu <=", value, "yonghu");
			return (Criteria) this;
		}

		public Criteria andYonghuLike(String value) {
			addCriterion("yonghu like", value, "yonghu");
			return (Criteria) this;
		}

		public Criteria andYonghuNotLike(String value) {
			addCriterion("yonghu not like", value, "yonghu");
			return (Criteria) this;
		}

		public Criteria andYonghuIn(List<String> values) {
			addCriterion("yonghu in", values, "yonghu");
			return (Criteria) this;
		}

		public Criteria andYonghuNotIn(List<String> values) {
			addCriterion("yonghu not in", values, "yonghu");
			return (Criteria) this;
		}

		public Criteria andYonghuBetween(String value1, String value2) {
			addCriterion("yonghu between", value1, value2, "yonghu");
			return (Criteria) this;
		}

		public Criteria andYonghuNotBetween(String value1, String value2) {
			addCriterion("yonghu not between", value1, value2, "yonghu");
			return (Criteria) this;
		}

		public Criteria andYonghuidIsNull() {
			addCriterion("yonghuid is null");
			return (Criteria) this;
		}

		public Criteria andYonghuidIsNotNull() {
			addCriterion("yonghuid is not null");
			return (Criteria) this;
		}

		public Criteria andYonghuidEqualTo(Integer value) {
			addCriterion("yonghuid =", value, "yonghuid");
			return (Criteria) this;
		}

		public Criteria andYonghuidNotEqualTo(Integer value) {
			addCriterion("yonghuid <>", value, "yonghuid");
			return (Criteria) this;
		}

		public Criteria andYonghuidGreaterThan(Integer value) {
			addCriterion("yonghuid >", value, "yonghuid");
			return (Criteria) this;
		}

		public Criteria andYonghuidGreaterThanOrEqualTo(Integer value) {
			addCriterion("yonghuid >=", value, "yonghuid");
			return (Criteria) this;
		}

		public Criteria andYonghuidLessThan(Integer value) {
			addCriterion("yonghuid <", value, "yonghuid");
			return (Criteria) this;
		}

		public Criteria andYonghuidLessThanOrEqualTo(Integer value) {
			addCriterion("yonghuid <=", value, "yonghuid");
			return (Criteria) this;
		}

		public Criteria andYonghuidIn(List<Integer> values) {
			addCriterion("yonghuid in", values, "yonghuid");
			return (Criteria) this;
		}

		public Criteria andYonghuidNotIn(List<Integer> values) {
			addCriterion("yonghuid not in", values, "yonghuid");
			return (Criteria) this;
		}

		public Criteria andYonghuidBetween(Integer value1, Integer value2) {
			addCriterion("yonghuid between", value1, value2, "yonghuid");
			return (Criteria) this;
		}

		public Criteria andYonghuidNotBetween(Integer value1, Integer value2) {
			addCriterion("yonghuid not between", value1, value2, "yonghuid");
			return (Criteria) this;
		}

		public Criteria andLyriqiIsNull() {
			addCriterion("lyriqi is null");
			return (Criteria) this;
		}

		public Criteria andLyriqiIsNotNull() {
			addCriterion("lyriqi is not null");
			return (Criteria) this;
		}

		public Criteria andLyriqiEqualTo(String value) {
			addCriterion("lyriqi =", value, "lyriqi");
			return (Criteria) this;
		}

		public Criteria andLyriqiNotEqualTo(String value) {
			addCriterion("lyriqi <>", value, "lyriqi");
			return (Criteria) this;
		}

		public Criteria andLyriqiGreaterThan(String value) {
			addCriterion("lyriqi >", value, "lyriqi");
			return (Criteria) this;
		}

		public Criteria andLyriqiGreaterThanOrEqualTo(String value) {
			addCriterion("lyriqi >=", value, "lyriqi");
			return (Criteria) this;
		}

		public Criteria andLyriqiLessThan(String value) {
			addCriterion("lyriqi <", value, "lyriqi");
			return (Criteria) this;
		}

		public Criteria andLyriqiLessThanOrEqualTo(String value) {
			addCriterion("lyriqi <=", value, "lyriqi");
			return (Criteria) this;
		}

		public Criteria andLyriqiLike(String value) {
			addCriterion("lyriqi like", value, "lyriqi");
			return (Criteria) this;
		}

		public Criteria andLyriqiNotLike(String value) {
			addCriterion("lyriqi not like", value, "lyriqi");
			return (Criteria) this;
		}

		public Criteria andLyriqiIn(List<String> values) {
			addCriterion("lyriqi in", values, "lyriqi");
			return (Criteria) this;
		}

		public Criteria andLyriqiNotIn(List<String> values) {
			addCriterion("lyriqi not in", values, "lyriqi");
			return (Criteria) this;
		}

		public Criteria andLyriqiBetween(String value1, String value2) {
			addCriterion("lyriqi between", value1, value2, "lyriqi");
			return (Criteria) this;
		}

		public Criteria andLyriqiNotBetween(String value1, String value2) {
			addCriterion("lyriqi not between", value1, value2, "lyriqi");
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