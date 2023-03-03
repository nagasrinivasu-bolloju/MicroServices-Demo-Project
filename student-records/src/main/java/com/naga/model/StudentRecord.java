package com.naga.model;

public class StudentRecord {
	int stuId;
	String name;
	String phn;
	double avgMarks;
	public StudentRecord() {
		super();
	}
	public StudentRecord(int stuId, String name, String phn,double avgMarks) {
		super();
		this.stuId = stuId;
		this.name = name;
		this.phn = phn;
		this.avgMarks = avgMarks;
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
	public String getPhn() {
		return phn;
	}
	public void setPhn(String phn) {
		this.phn = phn;
	}
	public double getAvgMarks() {
		return avgMarks;
	}
	public void setAvgMarks(int totalMarks) {
		this.avgMarks = totalMarks;
	}
}
