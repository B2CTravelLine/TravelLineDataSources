package com.virtusa.view;

import java.sql.Time;
import java.util.Scanner;

import com.virtusa.controller.PassengerController;

public class BusView {
	public void mainBusView()
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter bus no");
		int busNo = sc.nextInt();
		System.out.println("enter noof seats to book");
		int noofseats=sc.nextInt();
		
		
		PassengerController passengerController=new PassengerController();
		passengerController.selectBus(busNo,noofseats);
		
	}

}
