package com.virtusa.view;
import java.sql.SQLException;
import java.util.Scanner;
import com.virtusa.controller.AdminController;
import com.virtusa.controller.PaymentController;
public class FeedBackView 
{
	@SuppressWarnings({ "unused", "resource" })
	public void mainFeedbackServiceView() throws ClassNotFoundException, SQLException{
	/**
	 * private String Name;
	private String EmailId;
	private String Comment;
	 */
	System.out.println("_PLZ give the feedback__");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your Name");
	String name = sc.next();
	System.out.println("Enter your EmailId");
	String emailId = sc.next();
	System.out.println("Enter your Comments");
	String comments = sc.next();
	PaymentController paymentController=new PaymentController();
	paymentController.feedback(name,emailId,comments);
	
	
	
	
	}}
