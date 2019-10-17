package com.virtusa.view;

import java.util.Scanner;
import java.util.logging.Logger;

import com.virtusa.controller.AdminController;
import com.virtusa.model.AdminLoginModel;

@SuppressWarnings("unused")
public class AddAdminView {
		static Logger log;
		@SuppressWarnings("resource")
		public void mainAddAdminView()
		{
			log=Logger.getLogger(AddAdminView.class.getName());
			log.info("This is AddServicesView");
			Scanner sc=new Scanner(System.in);
			System.out.println("======= Add Admin View======");
			log.info("yoyo");
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
