package org.spring.springboot.domain;

public class Leibie {
	private Integer id;

	private String mingcheng;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMingcheng() {
		return mingcheng;
	}

	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng == null ? null : mingcheng.trim();
	}
}