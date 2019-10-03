package com.virtusa.view;

import java.sql.Time;
import java.util.Scanner;

import com.virtusa.controller.AdminController;

/*
 * private String ServiceNo;
	private String Source;
	private String Destination;
	private String BusType;
	private int Distance;
	private Time DepartureTime;
	private Time ArrivalTime;
	private double TotalFare;
	private String Active;

 */
public class ModifyServiceview {
	@SuppressWarnings("unused")
	public void mainModifyServiceview()
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("****======= Modify Services ======****");
		System.out.println("Enter ServiceNo");
		String serviceNo = sc.next();
		System.out.println("Enter Source");
		String source=sc.next();
		System.out.println("Enter Destination");
		String destination = sc.next();
		System.out.println("Enter BusType");
		String busType = sc.next();
		System.out.println("Enter TravelDistance");
		int distance = sc.nextInt();
		System.out.println("enter DepatureTime");
		String departureTime=sc.next();
		System.out.println("enter ArrivalTime");
		String arrivalTime=sc.next();
		System.out.println("enter FareAmount");
		double totalFare = sc.nextDouble();
		System.out.println("Enter Active");
		String active = sc.next();

		AdminController adminController = new AdminController();
		adminController.modifyService(serviceNo, source, destination, busType,distance, departureTime, arrivalTime, totalFare, active);
	}

}
