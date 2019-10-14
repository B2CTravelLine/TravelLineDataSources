package com.virtusa.view;

import java.util.Scanner;

import com.virtusa.controller.AdminController;
import com.virtusa.model.AdminLoginModel;

public class AddAdminView {

		public void mainAddAdminView()
		{
			Scanner sc=new Scanner(System.in);

			System.out.println("======= Add Admin View======");
			
			
			System.out.println("enter username");
			String  userName=sc.next();
			
			System.out.println("enter password");
			String  Password=sc.next();
			
			
			System.out.println("enter Email");
			String  email=sc.next();
			
			System.out.println("enter age");
			int age=sc.nextInt();
			
			System.out.println("enter Gender");
			String gender=sc.next();
			
		
		
		AdminController adminController=new AdminController();
		adminController.registerAdmin(userName, Password, email, age,gender);	
		

	}
	}
