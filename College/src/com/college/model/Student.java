package com.college.model;

import java.util.ArrayList;

public class Student {
	private String name;
	private String age;
	private String email;
	private ArrayList<Course> courses = new ArrayList<>();
	
	
	public Student(String name, String age, String email, Course course) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.courses.add(course);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getEmail() {
		return email;
	}
	
	public ArrayList<Course> getCourses(){
		return this.courses;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
