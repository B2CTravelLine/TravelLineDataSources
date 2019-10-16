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
		int busNo = sc.nextInt();
		System.out.println("Enter BusName");
		String busName=sc.next();
		System.out.println("Enter BusType");
		String busType = sc.next();
		System.out.println("Enter NoOfSeats");
		int noOfSeats = sc.nextInt();
		System.out.println("Enter Fare");
		double fare = sc.nextDouble();
		System.out.println("Enter Boarding Id");
		int boardingId = sc.nextInt();
		
		AdminController adminController = new AdminController();
		adminController.modifyService(busNo,busName,busType,noOfSeats,fare,boardingId);
	}

}
