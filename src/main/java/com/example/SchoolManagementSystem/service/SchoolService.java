package com.example.SchoolManagementSystem.service;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.stereotype.Service;

import com.example.SchoolManagementSystem.model.School;
import com.example.SchoolManagementSystem.model.Student;
import com.example.SchoolManagementSystem.model.Teacher;

@Service
public class SchoolService implements SchoolServiceI {

	Scanner sc=new Scanner(System.in);

	@Override
	public Teacher saveteacher() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void savestudent() {
		
		School sch=new School();
		
		double totalearn;
		
		ArrayList<Student> stu_list=new ArrayList<>();
		
		System.out.println("Enter a How Many Student Details You Want to save");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++ ) {
			
		Student s=new Student();
		
		System.out.println("Enter Student id : ");
		int id = sc.nextInt();
		s.setSid(id);
		System.out.println("Enter Student Name : ");
		String name = sc.next();
		s.setSname(name);
		System.out.println("Enter Address Name : ");
		String add = sc.next();
		s.setSadd(add);
		System.out.println("Enter a School Fees : ");
		double fess = sc.nextDouble();
		s.setSfees(fess);
		
		stu_list.add(s);
		
		totalearn=s.getSfees()+sch.getTotalmoneyearn();
		
		sch.setTotalmoneyearn(totalearn);
		
		}
		
	}

}
