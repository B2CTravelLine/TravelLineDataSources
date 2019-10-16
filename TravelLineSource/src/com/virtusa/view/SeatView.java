package com.virtusa.view;

import java.util.Scanner;

import com.virtusa.controller.PassengerController;

public class SeatView {
	public void mainSeatView()
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("seats are reserved ");
		int noofSeats = sc.nextInt();
		int seatsLimit = 6;
		if (noofSeats > seatsLimit)
		{
			System.out.println("seats cannot be reserved");
			SeatView seatView = new SeatView();
			seatView.mainSeatView();
		}
		System.out.println("enter seat type");
		String seatType = sc.next();
		PassengerController passengerController = new PassengerController();
		//passengerController.selectSeat(noofSeats,seatType);
	}
}
