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


public class AddServicesView
{
	@SuppressWarnings({ "resource", "unused" })
	public void mainAddServicesView()
	{
		
		Scanner sc = new Scanner(System.in);
		AddServicesValidation addServicesValidation = new AddServicesValidation();
		
		//**************************************//
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
		
		//************************************//
		String busName;
		boolean validBusName = false;
		do {
		System.out.println("Enter bus name");
		busName = sc.next();
		validBusName = addServicesValidation.validString(busName);
		
		if(validBusName==false)
		{
			System.out.println("Enter valid name");
		}
		}while(!validBusName);
	
		//***********************************************//
		String busType;
		boolean validBusType = false;
		do {
		System.out.println("enter bus type");
		busType = sc.next();
		validBusType = addServicesValidation.validString(busName); 
		if(validBusType==false)
		{
			System.out.println("Enter valid BusType");
		}}while(!validBusType);
		
		//***********************************//
		int noOfSeats;
		boolean validNoOfSeats = false;
		do {
			System.out.println("Enter no of seats");
			noOfSeats = sc.nextInt();
			validNoOfSeats = addServicesValidation.validNumber(busNo); 	
		
		if(validNoOfSeats==false)	
		{
			System.out.println("Enter valid No of Seats");
		}}while(!validNoOfSeats);
		
		//***************************************//
		int fare;
		boolean validFare=false;
		do
		{

			System.out.println("Enter Fare Amount");
			fare = sc.nextInt();
			validFare= addServicesValidation.validNumber(busNo);
		
			if(validFare)
			{
				System.out.println("Enter valid Fare");
			}
		}while(!validFare);
		
		//*****************************************//
		int boardingId;
		boolean validBoardingId = false;
		do {
		System.out.println("enter boarding id ");
		boardingId = sc.nextInt();
		validBoardingId = addServicesValidation.validNumber(busNo); 	
		
		if(validBoardingId)
		{
			System.out.println("Enter valid Id");
		}
		}while(!validBoardingId);
		AdminController adminController = new AdminController();
		adminController.addService(busNo,busName,busType,noOfSeats,fare,boardingId);
		
	
	}

}
