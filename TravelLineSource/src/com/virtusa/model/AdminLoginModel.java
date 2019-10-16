package com.virtusa.model;

public class AdminLoginModel {

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
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
	private  String userName;
	private String Password;
	private String Email;
	private int Age;
	private String Gender;
	@Override
	public String toString() {
		return "AdminLoginModel [userName=" + userName + ", Password=" + Password + ", Email=" + Email + ", Age=" + Age
				+ ", Gender=" + Gender + "]";
	}
	public AdminLoginModel(String userName,String Password) {
		this.userName=userName;
		this.Password=Password;
		
	}
	
	
}
