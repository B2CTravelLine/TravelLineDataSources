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
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Bus No");
		int busNo = scanner.nextInt();
		System.out.println("Enter your Bus Name");
		String busName = scanner.next();
		System.out.println("enter bus type");
		String busType = scanner.next();
		System.out.println("Enter No of Seats");
		int noOfSeats = scanner.nextInt();
		System.out.println("Enter fare amount");
		double fare = scanner.nextDouble();
		System.out.println("Enter Boarding Id");
		int boardingId = scanner.nextInt();
		
		AdminController adminController = new AdminController();
		adminController.addService(busNo,busName, busType, noOfSeats, fare, boardingId);
	}

}
