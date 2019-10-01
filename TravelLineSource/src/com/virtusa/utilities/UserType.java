package com.virtusa.utilities;

public enum UserType {

PASSENGER("PASSENGER"),ADMIN("ADMIN");
	
	private String val;
	private UserType(String val) {
		this.val=val;
	}
	
	public String getVal() {
		return val;
		
	}
}
