package com.naga.model;

public class StudentDetails {
	int stuId;
	String name;
	String phnNum;
	
	public StudentDetails() {
		super();
	}
	public StudentDetails(int stuId, String name, String phnNum) {
		super();
		this.stuId = stuId;
		this.name = name;
		this.phnNum = phnNum;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhnNum() {
		return phnNum;
	}
	public void setPhnNum(String phnNum) {
		this.phnNum = phnNum;
	}
}
