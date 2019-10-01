package com.virtusa.view;

import java.util.Scanner;

import com.virtusa.controller.PassengerController;

public class PassengerDetailsView {

	public void mainPassengerDetailsView()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("=======Enter Passenger Details======");
		System.out.println("enter  Name");
		String name=sc.next();
		System.out.println("enter Age");
		int age=sc.nextInt();
		System.out.println("enter Gender");
		String gender=sc.next();
		PassengerController passengerController=new  PassengerController();
		passengerController.storePassengerDetails(name,age,gender);
	}
}
