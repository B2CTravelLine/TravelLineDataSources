package com.virtusa.view;

import java.util.Scanner;

import com.virtusa.controller.AdminController;

public class FeedBackView 
{
	public void mainFeedbackServiceView()
	{
	/**
	 * private String Name;
	private String EmailId;
	private String Comment;
	
	 */
		System.out.println("______**************FeedBack View**************______");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your Name");
	String name = sc.next();
	System.out.println("Enter your EmailId");
	String emailId = sc.next();
	System.out.println("Enter your Comments");
	String comment = sc.next();
	
	AdminController adminController = new AdminController();
	adminController.addFeedbackService(name, emailId, comment);
	
	}
}
