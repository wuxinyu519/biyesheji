package org.spring.springboot.domain;

public class Dongtai {
	private Integer id;

	private String biaoti;

	private String fabushijian;

	private String neirong;

	private String yonghu;

	private Integer yonghuid;

	private String pic;

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

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic == null ? null : pic.trim();
	}
}