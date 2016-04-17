package com.estsoft.futures.vo;

public class RestaurantVo {
	private int no;
	private String name;
	private String img;
	@Override
	public String toString() {
		return "RestaurantVo [no=" + no + ", name=" + name + ", img=" + img + "]";
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
}
