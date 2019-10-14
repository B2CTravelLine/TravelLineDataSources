package com.virtusa.model;

public class FeedBackModel {
	private String Name;
	private String EmailId;
	private String Comments;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getComments() {
		return Comments;
	}
	public void setComments(String comments) {
		Comments = comments;
	}
	@Override
	public String toString() {
		return "FeedBackModel [Name=" + Name + ", EmailId=" + EmailId + ", Comments=" + Comments + "]";
	}
	
	
}
