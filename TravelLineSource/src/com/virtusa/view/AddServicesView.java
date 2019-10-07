package com.virtusa.view;

import java.sql.Time;
import java.util.Scanner;
/*
 * private String From;
	private String To;
	private String Type;
	private double Fare;
	private float Distance;
	private  Time DepartureTime;
	private Time ArrivalTime;
	private String ServiceNo;
	
	LocalDate currentDate = LocalDate.now();
LocalTime userInputTime = null;

Scanner sc = new Scanner(System.in);
String dateTimeLine = sc.nextLine();
sc.close();

DateTimeFormatter dt = DateTimeFormatter.ofPattern("HH:mm");
userInputTime = LocalTime.parse(dateTimeLine,dtf);

System.err.println(LocalDateTime.of(currentDate, userInputTime));
}
 */

import com.virtusa.controller.AdminController;


public class AddServicesView {
	public void mainAddServicesView()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your boarding point");
		String from = sc.next();
		System.out.println("Enter destination point");
		String to = sc.next();
		System.out.println("enter bus type");
		String type = sc.next();
		System.out.println("Enter fare amount");
		double fare = sc.nextDouble();
		System.out.println("Enter travel distance");
		float distance = sc.nextFloat();
		System.out.println("enter departure time");
		Time departureTime = sc.localTime(HH:mm);
		System.out.println("Enter Arrival time");
		Time arrivalTime = sc.localTime(HH:mm);
		System.out.println("enter Service No ");
		String serviceNo = sc.next();
		
		AdminController adminController = new AdminController();
		adminController.addService(from, to, type, fare, distance, departureTime, arrivalTime, serviceNo);
		
	
	}

}
