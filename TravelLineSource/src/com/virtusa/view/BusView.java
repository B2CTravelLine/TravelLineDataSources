package com.virtusa.view;

import java.sql.Time;
import java.util.Scanner;

import com.virtusa.controller.PassengerController;

public class BusView {
	public void mainBusView()
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("=======Bus View======");
		//System.out.println("enter service no");
		//int serviceNo = sc.nextInt();
		System.out.println("enter BusType");
		String busType=sc.next();
		System.out.println("enter DepatureTime");
		String depatureTime=sc.next();
		System.out.println("enter ArrivalTime");
		String arrivalTime=sc.next();
		//System.out.println("enter FareAmount");
		//double fareAmount = sc.nextDouble();
		
		PassengerController passengerController=new PassengerController();
		passengerController.selectBus(busType,depatureTime,arrivalTime);
		
	}

}
