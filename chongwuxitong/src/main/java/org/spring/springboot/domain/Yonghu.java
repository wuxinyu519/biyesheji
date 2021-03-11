package org.spring.springboot.domain;

public class Yonghu {
	private Integer id;

	private String mingzi;

	private String username;

	private String password;

	private String xingbie;

	private String jieshao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMingzi() {
		return mingzi;
	}

	public void setMingzi(String mingzi) {
		this.mingzi = mingzi == null ? null : mingzi.trim();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public String getXingbie() {
		return xingbie;
	}

	public void setXingbie(String xingbie) {
		this.xingbie = xingbie == null ? null : xingbie.trim();
	}

	public String getJieshao() {
		return jieshao;
	}

	public void setJieshao(String jieshao) {
		this.jieshao = jieshao == null ? null : jieshao.trim();
	}
}