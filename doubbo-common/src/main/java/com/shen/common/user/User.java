package com.shen.common.user;

import java.io.Serializable;

public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;
	
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	
}
