package org.spring.springboot.domain;

public class Liulangchongwupinglun {
	private Integer id;

	private String liulangchongwu;

	private Integer liulangchongwuid;

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