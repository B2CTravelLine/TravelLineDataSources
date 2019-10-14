package com.virtusa.view;

import java.util.Scanner;

import com.virtusa.controller.PassengerController;
import com.virtusa.model.BusModel;

public class PassengerDetailsView {

	public void mainPassengerDetailsView()
	{
		BusModel busModel=new BusModel();
		Scanner sc=new Scanner(System.in);
	
		System.out.println("=======Enter Passenger Details======");
		for(int i=0;i<busModel.getTotalSeats();i++)
		{
		
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
}
