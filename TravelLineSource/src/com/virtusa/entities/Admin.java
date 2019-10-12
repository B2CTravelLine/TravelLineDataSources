package com.virtusa.entities;

import java.util.Date;

public class Admin {
	private  String AdminName;
	private String AdminPassword;
	private String Email;
	private int Age;
	private String Gender;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((AdminName == null) ? 0 : AdminName.hashCode());
		result = prime * result + ((AdminPassword == null) ? 0 : AdminPassword.hashCode());
		result = prime * result + Age;
		result = prime * result + ((Email == null) ? 0 : Email.hashCode());
		result = prime * result + ((Gender == null) ? 0 : Gender.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admin other = (Admin) obj;
		if (AdminName == null) {
			if (other.AdminName != null)
				return false;
		} else if (!AdminName.equals(other.AdminName))
			return false;
		if (AdminPassword == null) {
			if (other.AdminPassword != null)
				return false;
		} else if (!AdminPassword.equals(other.AdminPassword))
			return false;
		if (Age != other.Age)
			return false;
		if (Email == null) {
			if (other.Email != null)
				return false;
		} else if (!Email.equals(other.Email))
			return false;
		if (Gender == null) {
			if (other.Gender != null)
				return false;
		} else if (!Gender.equals(other.Gender))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Admin [AdminName=" + AdminName + ", AdminPassword=" + AdminPassword + ", Email=" + Email + ", Age="
				+ Age + ", Gender=" + Gender + "]";
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
