package com.virtusa.view;

import java.util.Scanner;
import com.virtusa.controller.AdminController;
import com.virtusa.validation.AddServicesValidation;
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
public class AddServicesView
{
	@SuppressWarnings({ "resource" })
	public void mainAddServicesView()
	{
		Scanner sc = new Scanner(System.in);
		AddServicesValidation addServicesValidation = new AddServicesValidation();
		//**************************************//
		int busNo=0;
		String validBusNoString="";
		boolean validBusNumber=false;
		do{
		try	{
		System.out.println("Enter Bus Number");
		validBusNoString=sc.next();
		validBusNumber=addServicesValidation.validNumber(validBusNoString);
		//System.out.println(validBusNumber);
		busNo=Integer.parseInt(validBusNoString);
		}catch(Exception e)
		{
		//System.out.println("enter valid number");
		} }while(validBusNumber);
		//************************************//
		String busName;
		boolean validBusName = false;
		do {
		System.out.println("Enter bus name");
		busName = sc.next();
		validBusName = addServicesValidation.validString(busName);
		if(validBusName==false){
		System.out.println("Enter valid Name or Type");
		}}while(!validBusName);
		//***********************************************//
		String busType;
		boolean validBusType = false;
		do {
		System.out.println("enter bus type");
		busType = sc.next();
		validBusType = addServicesValidation.validString(busName);
		if(validBusType==false){
		System.out.println("Enter valid BusType");
		}}while(!validBusType);
		//***********************************//
		int noOfSeats=0;
		boolean validNoOfSeats = false;
		do {
		try {
		System.out.println("Enter no of seats");
		String validnoOfSeats = sc.next();
		validNoOfSeats = addServicesValidation.validNumber(validnoOfSeats);
		//System.out.println(validBusNumber);
		noOfSeats=Integer.parseInt(validnoOfSeats);
		}
		catch(Exception e) {
		// System.out.println("Enter valid Number");
		}}while(validNoOfSeats);
		//***************************************//
		int fare=0;
		boolean validFare=false;
		do{
		try {
		System.out.println("Enter Fare Amount");
		String validFareNumber = sc.next();
		validFare= addServicesValidation.validNumber(validFareNumber);
		//System.out.println(validBusNumber);
		fare=Integer.parseInt(validFareNumber);
		}catch(Exception e){
		// System.out.println("Enter valid Number");
		}}while(validFare);
		//*****************************************//
		int boardingId=0;
		boolean validBoardingId = false;
		do {
		try {
		System.out.println("enter boarding id ");
		String boardingIdNumber = sc.next();
		validBoardingId = addServicesValidation.validNumber(boardingIdNumber);
		// System.out.println(validBoardingId);
		boardingId=Integer.parseInt(boardingIdNumber);
		}catch(Exception e){
		// System.out.println("Enter boarding id");
		}}while(validBoardingId);
		AdminController adminController = new AdminController();
		adminController.addService(busNo,busName,busType,noOfSeats,fare,boardingId);
	}
}
