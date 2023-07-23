package com.example.SchoolManagementSystem.model;

public class Student {
	
	private int sid;
	
	private String sname;
	
	private String sadd;
	
	private double sfees;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSadd() {
		return sadd;
	}

	public void setSadd(String sadd) {
		this.sadd = sadd;
	}

	public double getSfees() {
		return sfees;
	}

	public void setSfees(double sfees) {
		this.sfees = sfees;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sadd=" + sadd + ", sfees=" + sfees + "]";
	}
	
	

}
