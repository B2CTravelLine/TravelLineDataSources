package com.virtusa.ui;


import java.text.ParseException;
import java.util.Scanner;

import com.virtusa.view.AdminLoginView;
import com.virtusa.view.BoardingView;


public class UI {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		System.out.println("Enter 1 if you are an Admin");
		System.out.println("Enter 2 if you are a Passenger");
		System.out.println("Enter your option:");
		
		Scanner in = new Scanner(System.in); 
		  
		int option=in.nextInt();
		
		
		switch(option)
		{
			case 1: AdminLoginView adminLoginView=new AdminLoginView(); 
					adminLoginView.mainAdminView();
					break;
			case 2:BoardingView boardingView=new BoardingView();
					boardingView.mainBoardingView();
					break;
			default:System.out.println(" please Enter valid number");
		}

	}

}
