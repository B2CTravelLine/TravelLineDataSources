package com.virtusa.view;

import java.sql.Time;
import java.util.Scanner;
/**
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
	@SuppressWarnings("resource")
	public void mainAddServicesView()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your bus no");
		int busNo = sc.nextInt();
		
		System.out.println("Enter bus name");
		String busName = sc.next();
		
		System.out.println("enter bus type");
		String busType = sc.next();
		
		System.out.println("Enter no of seats");
		int noOfSeats = sc.nextInt();
		
		System.out.println("Enter fare");
		int fare = sc.nextInt();
		
		
		System.out.println("enter boarding id ");
		int boardingId = sc.nextInt();
		
		AdminController adminController = new AdminController();
		adminController.addService(busNo,busName,busType,noOfSeats,fare,boardingId);
		
	
	}

}
