/*package com.virtusa.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.virtusa.controller.PassengerController;

public class BoardingView {

	public void mainBoardingView() throws ParseException
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("=======Boarding View======");
		System.out.println("enter BoardingPoint ");
		String boardingPoint=sc.next();
		System.out.println("enter Dropping Point");
		String droppingPoint=sc.next();
		System.out.println("enter Journey date");
		//Date journeyDate=(Date) new SimpleDateFormat("dd/mm/yyyy").parse(sc.next());
		//LocalDate journeyDate=new LocalDate("yyyy/mm/dd");
		//DateTimeFormatter dateTimeFormatter=new DateTimeFormatter.ofPattern("dd/mm/yyyy");
		//String journeyDate=sc.next();
	
		 //System.out.print("Hire Date(DD/MM/YYYY):");
			String journeyDate=sc.next();
			
			StringTokenizer tokens=new StringTokenizer(journeyDate,"/");
			
			List<String> tokensList=new ArrayList<>();
			while(tokens.hasMoreTokens()) {
				tokensList.add(tokens.nextToken());
			}
			
			int dayOfMonth=Integer.parseInt(tokensList.get(0));
			int month=Integer.parseInt(tokensList.get(1));
			int year=Integer.parseInt(tokensList.get(2));
			
			LocalDate hireDate=LocalDate.of(year, month-1, dayOfMonth);
		 
		//LocalDate date=new LocalDate.parse(date,dateTimeFormatter);
		PassengerController passengerController=new PassengerController();
		passengerController.showBuses(boardingPoint,droppingPoint,journeyDate);
	}
}*/
package com.virtusa.view;

import java.text.ParseException;

import java.time.LocalDate;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.virtusa.controller.PassengerController;
import com.virtusa.validation.AddServicesValidation;

public class BoardingView {

	public void mainBoardingView() throws ParseException
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("=======Boarding View======");
		
		String boardingPoint;
		/*String busName;
		boolean validBusName = false;
		do {
		System.out.println("Enter bus name");
		busName = sc.next();
		validBusName = addServicesValidation.validString(busName);
		if(validBusName==false){
		System.out.println("Enter valid Name or Type");
		}}while(!validBusName);
		
		*/
		AddServicesValidation addServicesValidation=new AddServicesValidation();
		boolean validboardingPoint = false;
		do {
			System.out.println("enter BoardingPoint ");
			boardingPoint = sc.next();
			validboardingPoint = addServicesValidation.validString(boardingPoint);
			if(validboardingPoint==false){
			System.out.println("Enter valid BoardingPoint or Type");
			}
			}while(!validboardingPoint);
			
			
			
		
		System.out.println("enter Dropping Point");
		String droppingPoint = sc.next();
		System.out.println("enter Journey date(yyyy-mm--dd)");
		//Date journeyDate=(Date) new SimpleDateFormat("dd-mm-yyyy").parse(sc.next());
		//LocalDate journeyDate=new LocalDate("yyyy-mm-dd");
		//DateTimeFormatter dateTimeFormatter=new DateTimeFormatter.ofPattern("dd-mm-yyyy");
		//String journeyDate=sc.next();
	/*
	 * 
	 */
		 //System.out.print("Hire Date(DD/MM/YYYY):");
			String journeyDate = sc.next();
			
			StringTokenizer tokens = new StringTokenizer(journeyDate,"-");
			
			List<String> tokensList = new ArrayList<>();
			while (tokens.hasMoreTokens()) {
				tokensList.add(tokens.nextToken());
			}
			
			int dayOfMonth = Integer.parseInt(tokensList.get(2));
			int month = Integer.parseInt(tokensList.get(1));
			int year = Integer.parseInt(tokensList.get(0));
			
			Date travelDate=Date.valueOf(LocalDate.of(year, month, dayOfMonth));
		 
		//LocalDate travelDate=LocalDate.of(year, month, dayOfMonth);
		PassengerController passengerController = new PassengerController();
		passengerController.showBuses(boardingPoint,droppingPoint,travelDate);
	}
}


