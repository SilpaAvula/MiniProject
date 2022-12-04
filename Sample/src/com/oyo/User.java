package com.oyo;

public class User {
	String name;
	int age;
	String gender;
	long id;
	long phNo;
	String mailId;
	
	
	
	public User(String name, int age, String gender, long id, long phNo, String mailId) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.id = id;
		this.phNo = phNo;
		this.mailId = mailId;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", gender=" + gender + ", id=" + id + ", phNo=" + phNo
				+ ", mailId=" + mailId + "]";
	}
	
	

}
