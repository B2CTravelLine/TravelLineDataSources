package com.virtusa.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.sql.Date;
import java.util.Scanner;

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
		DateTimeFormatter dateTimeFormatter=new DateTimeFormatter.ofPattern("d/mm/yyyy");
		String journeyDate=sc.next();
		
		LocalDate date=new LocalDate.parse(date,dateTimeFormatter);
		PassengerController passengerController=new PassengerController();
		passengerController.showBuses(boardingPoint,droppingPoint,date);
	}
}
