package org.spring.springboot.domain;

public class Dongtaipinglun {
	private Integer id;

	private String dongtai;

	private Integer dongtaiid;

	private String neirong;

	private String pinglunrenmingzi;

	private Integer pinglunrenid;

	private String pinglunshijian;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDongtai() {
		return dongtai;
	}

	public void setDongtai(String dongtai) {
		this.dongtai = dongtai == null ? null : dongtai.trim();
	}

	public Integer getDongtaiid() {
		return dongtaiid;
	}

	public void setDongtaiid(Integer dongtaiid) {
		this.dongtaiid = dongtaiid;
	}

	public String getNeirong() {
		return neirong;
	}

	public void setNeirong(String neirong) {
		this.neirong = neirong == null ? null : neirong.trim();
	}

	public String getPinglunrenmingzi() {
		return pinglunrenmingzi;
	}

	public void setPinglunrenmingzi(String pinglunrenmingzi) {
		this.pinglunrenmingzi = pinglunrenmingzi == null ? null : pinglunrenmingzi.trim();
	}

	public Integer getPinglunrenid() {
		return pinglunrenid;
	}

	public void setPinglunrenid(Integer pinglunrenid) {
		this.pinglunrenid = pinglunrenid;
	}

	public String getPinglunshijian() {
		return pinglunshijian;
	}

	public void setPinglunshijian(String pinglunshijian) {
		this.pinglunshijian = pinglunshijian == null ? null : pinglunshijian.trim();
	}
}