package com.virtusa.model;

public class PassengerDetailsModel {

	private String Name;
	private int age;
	private int emailid;
	private String Gender;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "PassengerDetailsModel [Name=" + Name + ", age=" + age + ", emailid=" + emailid + ", Gender=" + Gender
				+ "]";
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getEmailid() {
		return emailid;
	}
	public void setEmailid(int emailid) {
		this.emailid = emailid;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	
	
}
