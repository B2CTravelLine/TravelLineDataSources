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
		if(noofseats>2)
		{
			System.out.println("you cannot select more than 2 seats");
			BusView b=new BusView();
			b.mainBusView();
		}
		
		PassengerController passengerController=new PassengerController();
		passengerController.selectBus(busNo,noofseats);
		
	}

}
