package com.virtusa.entities;

import java.util.Date;

public class Admin {
	private  String AdminName;
	private String AdminPassword;
	@Override
	public String toString() {
		return "Admin [AdminName=" + AdminName + ", AdminPassword=" + AdminPassword + ", Email=" + Email + ", Age="
				+ Age + ", Gender=" + Gender + "]";
	}
	private String Email;
	private int Age;
	private String Gender;
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
	

	
	
	
	
}
