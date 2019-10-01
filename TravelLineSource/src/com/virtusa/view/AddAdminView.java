package com.virtusa.view;

import java.util.Scanner;

import com.virtusa.controller.AdminController;
import com.virtusa.model.AdminLoginModel;

public class AddAdminView {
	
	public void mainAddAdminView()
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("======= Add Admin View======");
		
		
		System.out.println("enter adminname");
		String adminName=sc.next();
		System.out.println("enter adminpassword");
		String adminPassword=sc.next();
		System.out.println("enter age");
		int age=sc.nextInt();
		System.out.println("enter Email");
		String Email=sc.next();
		System.out.println("enter Gender");
		String Gender=sc.next();
		
	
	
	AdminController adminController=new AdminController();
	adminController.registerAdmin(adminName, adminPassword, Gender, Email, age);	
	}

}
