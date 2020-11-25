package com.demo.kafkaconsumer.model;

public class User {

	private String name;
	private String dept;
	//private Long salary;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String name, String dept) {
		this.name = name;
		this.dept = dept;
		//this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
}

