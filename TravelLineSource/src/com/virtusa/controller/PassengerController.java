package com.virtusa.controller;

import java.sql.Date;
import java.time.LocalDate;

import com.virtusa.model.AddAdminModel;
import com.virtusa.model.BoardingModel;
import com.virtusa.model.BusModel;
import com.virtusa.model.PassengerDetailsModel;
import com.virtusa.model.SeatModel;
import com.virtusa.services.AdminService_Imp;
import com.virtusa.services.PassengerService_Imp;
import com.virtusa.view.AddAdminView;
import com.virtusa.view.AdminOptionsView;
import com.virtusa.view.BusView;
import com.virtusa.view.ErrorView;
import com.virtusa.view.PassengerDetailsView;
import com.virtusa.view.PaymentView;
import com.virtusa.view.SeatView;

public class PassengerController {
	 
	public void showBuses(String boardingPoint,String droppingPoint,Date journeyDate)
	{
		BoardingModel boardingModel=new BoardingModel();
		boardingModel.setFrom(boardingPoint);
		boardingModel.setTo(droppingPoint);
		boardingModel.setJourneyDate(journeyDate);
		PassengerService_Imp passengerservice=new PassengerService_Imp();
		try
		{
			boolean passengerValue=passengerservice.showAvalBus(boardingModel);
			if(passengerValue)
			{
				System.out.println("*********");
				BusView busView=new BusView();
				busView.mainBusView();
			}
			else
			{
				System.out.println("Buses not availables");
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
	}
	public void selectBus(int busNo,int noofseats)
	{
		BusModel busModel=new BusModel();
		//busModel.setBusType(busType);
		//busModel.setDepatureTime(depatureTime);
		//busModel.setArrivalTime(arrivalTime);
		busModel.setTotalSeats(noofseats);
		PassengerService_Imp passengerservice=new PassengerService_Imp();
		try
		{
			boolean busValue=passengerservice.selectAvlBus(busModel);
			if(busValue)
			{
				System.out.println("seats are available");
				PassengerDetailsView passengerDetailsView=new PassengerDetailsView();
				passengerDetailsView.mainPassengerDetailsView();
			}
			else
			{
				System.out.println("seats are not available");
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception ");
		}
	}
	/*public void selectSeat(int noofSeats,String seatType)
	{
		SeatModel seatModel=new SeatModel();
		seatModel.setSeatNo(noofSeats);
		seatModel.setSeatType(seatType);
		PassengerService_Imp passengerService=new PassengerService_Imp();
		try {
			boolean seatVal=passengerService.bookSeat(seatModel);
			if(seatVal)
			{
				
				PassengerDetailsView passengerDetailsView=new PassengerDetailsView();
				passengerDetailsView.mainPassengerDetailsView();
			}
			else
			{
				System.out.println("seats not availables");
				BusView busView=new BusView();
				busView.mainBusView();
			}
		}catch(Exception e)
		{
			System.out.println("Seats not availables");
		}
	}
	*/
	public void storePassengerDetails(String name,int age,String gender)
	{
		PassengerDetailsModel passengerDetailsModel=new PassengerDetailsModel();
		passengerDetailsModel.setName(name);
		passengerDetailsModel.setAge(age);
		passengerDetailsModel.setGender(gender);
		PassengerService_Imp passengerService=new PassengerService_Imp();
		try {
			boolean storePsg=passengerService.storePassengerDetails(passengerDetailsModel);
			if(storePsg)
			{
				PaymentView paymentView=new PaymentView();
				paymentView.mainPaymentView();
			}
			else
				System.out.println("Passenger details are not added");
				PassengerDetailsView passengerDetailsView=new PassengerDetailsView();
				passengerDetailsView.mainPassengerDetailsView();
				
		}catch(Exception e)
		{
			System.out.println("Exception");
		}
		
	}
	
}
