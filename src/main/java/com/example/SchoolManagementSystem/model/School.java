package com.example.SchoolManagementSystem.model;

import java.util.List;

public class School {
	
	private int id;
	
	private String name;
	
	private String Add;
  
	private int sc_id;

	private double totalmoneyspend;

	private double totalmoneyearn;

	private double totalbalance;

	private List<Student> student;

	private List<School> school;

	public int getSc_id() {
		return sc_id;
	}

	public void setSc_id(int sc_id) {
		this.sc_id = sc_id;
	}

	public double getTotalmoneyspend() {
		return totalmoneyspend;
	}

	public void setTotalmoneyspend(double totalmoneyspend) {
		this.totalmoneyspend = totalmoneyspend;
	}

	public double getTotalmoneyearn() {
		return totalmoneyearn;
	}

	public void setTotalmoneyearn(double totalmoneyearn) {
		this.totalmoneyearn = totalmoneyearn;
	}

	public double getTotalbalance() {
		return totalbalance;
	}

	public void setTotalbalance(double totalbalance) {
		this.totalbalance = totalbalance;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public List<School> getSchool() {
		return school;
	}

	public void setSchool(List<School> school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "School [sc_id=" + sc_id + ", totalmoneyspend=" + totalmoneyspend + ", totalmoneyearn=" + totalmoneyearn
				+ ", totalbalance=" + totalbalance + ", student=" + student + ", school=" + school + "]";
	}

	public String getAdd() {
		return Add;
	}

	public void setAdd(String add) {
		Add = add;
	}
	
	

}
