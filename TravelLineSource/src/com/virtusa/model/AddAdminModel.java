package com.virtusa.model;

public class AddAdminModel {

	private String AdminName;
	private String password;
	private String ConfirmPassword;
	public String getAdminName() {
		return AdminName;
	}
	public void setAdminName(String adminName) {
		AdminName = adminName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return ConfirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		ConfirmPassword = confirmPassword;
	}
	@Override
	public String toString() {
		return "AddAdminModel [AdminName=" + AdminName + ", password=" + password + ", ConfirmPassword="
				+ ConfirmPassword + "]";
	}
	
}
