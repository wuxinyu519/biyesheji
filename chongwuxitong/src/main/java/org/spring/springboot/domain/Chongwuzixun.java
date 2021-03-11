package org.spring.springboot.domain;

public class Chongwuzixun {
	private Integer id;

	private String biaoti;

	private String fabushijian;

	private String neirong;

	private String fengmian;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBiaoti() {
		return biaoti;
	}

	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti == null ? null : biaoti.trim();
	}

	public String getFabushijian() {
		return fabushijian;
	}

	public void setFabushijian(String fabushijian) {
		this.fabushijian = fabushijian == null ? null : fabushijian.trim();
	}

	public String getNeirong() {
		return neirong;
	}

	public void setNeirong(String neirong) {
		this.neirong = neirong == null ? null : neirong.trim();
	}

	public String getFengmian() {
		return fengmian;
	}

	public void setFengmian(String fengmian) {
		this.fengmian = fengmian == null ? null : fengmian.trim();
	}
}