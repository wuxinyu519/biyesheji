package org.spring.springboot.domain;

public class Liulangchongwu {
	private Integer id;

	private String mingzi;

	private String tupian;

	private String jieshao;

	private String zhuyi;

	private String leibie;

	private Integer leibieid;

	private String state;

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

	public String getTupian() {
		return tupian;
	}

	public void setTupian(String tupian) {
		this.tupian = tupian == null ? null : tupian.trim();
	}

	public String getJieshao() {
		return jieshao;
	}

	public void setJieshao(String jieshao) {
		this.jieshao = jieshao == null ? null : jieshao.trim();
	}

	public String getZhuyi() {
		return zhuyi;
	}

	public void setZhuyi(String zhuyi) {
		this.zhuyi = zhuyi == null ? null : zhuyi.trim();
	}

	public String getLeibie() {
		return leibie;
	}

	public void setLeibie(String leibie) {
		this.leibie = leibie == null ? null : leibie.trim();
	}

	public Integer getLeibieid() {
		return leibieid;
	}

	public void setLeibieid(Integer leibieid) {
		this.leibieid = leibieid;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state == null ? null : state.trim();
	}
}