package com.naga.model;

public class StudentMarks {
	String stuName;
	int maths,science,english;
	public StudentMarks() {
		super();
	}
	public StudentMarks(String stuName, int maths, int science, int english) {
		super();
		this.stuName = stuName;
		this.maths = maths;
		this.science = science;
		this.english = english;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
}
