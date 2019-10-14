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
import com.virtusa.validation.AddServicesValidation;


public class AddServicesView {
	@SuppressWarnings({ "resource", "unused" })
	public void mainAddServicesView()
	{
		
		Scanner sc = new Scanner(System.in);
		AddServicesValidation addServicesValidation = new AddServicesValidation();
		int busNo;
		boolean validBusNo=false;
		do {
		System.out.println("Enter your bus no");
		busNo = sc.nextInt();
		validBusNo= addServicesValidation.validNumber(busNo);
		
		if(validBusNo==false)
		{
			System.out.println("Enter Valid Number");
		}
		}while(!validBusNo);
		
		
		
		
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
