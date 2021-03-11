package org.spring.springboot.domain;

public class Xitongshuoming {
	private Integer id;

	private String biaoti;

	private String mokuai;

	private String neirong;

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

	public String getMokuai() {
		return mokuai;
	}

	public void setMokuai(String mokuai) {
		this.mokuai = mokuai == null ? null : mokuai.trim();
	}

	public String getNeirong() {
		return neirong;
	}

	public void setNeirong(String neirong) {
		this.neirong = neirong == null ? null : neirong.trim();
	}
}