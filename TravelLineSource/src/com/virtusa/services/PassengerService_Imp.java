package com.virtusa.services;

import java.sql.SQLException;

import com.virtusa.dao.PassengerDAO;
import com.virtusa.model.BoardingModel;
import com.virtusa.model.BusModel;
import com.virtusa.model.SeatModel;

public class PassengerService_Imp implements PassengerService{
	
	PassengerDAO passengerDAO=new PassengerDAO();
	public boolean showAvalBus(BoardingModel boardingModel) throws ClassNotFoundException, SQLException
	{
		
		
		return passengerDAO.showBuses(boardingModel);
	}
	public boolean selectAvlBus(BusModel busModel)
	{
		
		return passengerDAO.selectBus(busModel);
	}
	public boolean bookSeat(SeatModel seatModel)
	{
		return passengerDAO.bookSeat(seatModel);
		
	}
	
}
