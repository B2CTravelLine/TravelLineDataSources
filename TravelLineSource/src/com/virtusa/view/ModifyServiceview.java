package com.virtusa.view;


import java.util.Scanner;

import com.virtusa.controller.AdminController;


public class ModifyServiceview {
	@SuppressWarnings({ "resource" })
	public void mainModifyServiceView()
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("****======= Modify Services ======****");
		System.out.println("Enter BusNo");
		String busNo = sc.next();
		System.out.println("Enter To");
		String to=sc.next();
		System.out.println("Enter From");
		String from = sc.next();
		System.out.println("Enter BusType");
		String busType = sc.next();
		System.out.println("Enter TravelDistance");
		int distance = sc.nextInt();
		
		AdminController adminController = new AdminController();
		adminController.modifyService(busNo, to, from, busType,distance);
	}

}
