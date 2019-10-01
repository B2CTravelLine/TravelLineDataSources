package com.virtusa.model;

public class FeedBackModel {
	private String Name;
	private String EmailId;
	private String Comment;
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
	public String getComment() {
		return Comment;
	}
	public void setComment(String comment) {
		Comment = comment;
	}
	@Override
	public String toString() {
		return "FeedBackModel [Name=" + Name + ", EmailId=" + EmailId + ", Comment=" + Comment + "]";
	}
	
}
