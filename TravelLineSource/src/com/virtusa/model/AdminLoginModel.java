package com.virtusa.model;

public class AdminLoginModel {

	private  String AdminName;
	private String AdminPassword;
	private String Email;
	private int Age;
	private String Gender;
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getAdminName() {
		return AdminName;
	}
	public void setAdminName(String adminName) {
		AdminName = adminName;
	}
	public String getAdminPassword() {
		return AdminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		AdminPassword = adminPassword;
	}
	@Override
	public String toString() {
		return "AdminLoginModel [AdminName=" + AdminName + ", AdminPassword=" + AdminPassword + ", Email=" + Email
				+ ", Age=" + Age + ", Gender=" + Gender + "]";
	}
	
	
}
