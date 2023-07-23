package com.example.SchoolManagementSystem.model;

public class Teacher {

	private int id;

	private String tname;

	private double tsalary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public double getTsalary() {
		return tsalary;
	}

	public void setTsalary(double tsalary) {
		this.tsalary = tsalary;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", tname=" + tname + ", tsalary=" + tsalary + "]";
	}

}
