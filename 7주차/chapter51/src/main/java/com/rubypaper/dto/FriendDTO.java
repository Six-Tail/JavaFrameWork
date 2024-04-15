package com.rubypaper.dto;

public class FriendDTO {
	private int num;
	private String name;
	private String mobile;
	private String character;
	
	
	public FriendDTO(int num, String name, String mobile, String character) {
		super();
		this.num = num;
		this.name = name;
		this.mobile = mobile;
		this.character = character;
	}
	
	public FriendDTO() {
		super();
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCharacter() {
		return character;
	}
	public void setCharacter(String character) {
		this.character = character;
	}
	@Override
	public String toString() {
		return "FriendDTO [num=" + num + ", name=" + name + ", mobile=" + mobile + ", character=" + character + "]";
	}
}
