package com.ltf.model;

public class Student {
	private String no;
	private String name;
	private String age;
	private String sex;
	private String snative;
	
	public Student(String no, String name, String sex, String age, String snative) {
		super();
		this.no = no;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.snative = snative;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSnative() {
		return snative;
	}
	public void setSnative(String snative) {
		this.snative = snative;
	}
	
	
}
