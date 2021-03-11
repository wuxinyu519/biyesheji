package org.spring.springboot.domain;

public class Lingyang {
	private Integer id;

	private String liulangchongwu;

	private Integer liulangchongwuid;

	private String yonghu;

	private Integer yonghuid;

	private String lyriqi;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLiulangchongwu() {
		return liulangchongwu;
	}

	public void setLiulangchongwu(String liulangchongwu) {
		this.liulangchongwu = liulangchongwu == null ? null : liulangchongwu.trim();
	}

	public Integer getLiulangchongwuid() {
		return liulangchongwuid;
	}

	public void setLiulangchongwuid(Integer liulangchongwuid) {
		this.liulangchongwuid = liulangchongwuid;
	}

	public String getYonghu() {
		return yonghu;
	}

	public void setYonghu(String yonghu) {
		this.yonghu = yonghu == null ? null : yonghu.trim();
	}

	public Integer getYonghuid() {
		return yonghuid;
	}

	public void setYonghuid(Integer yonghuid) {
		this.yonghuid = yonghuid;
	}

	public String getLyriqi() {
		return lyriqi;
	}

	public void setLyriqi(String lyriqi) {
		this.lyriqi = lyriqi == null ? null : lyriqi.trim();
	}
}