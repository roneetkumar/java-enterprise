package com.college.model;

import java.util.Date;

public class Course {
	
	private String name;
	private String id;
	private Date date;
	public Course(String name, String id) {
		super();
		this.name = name;
		this.id = id;
		//this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	

}
