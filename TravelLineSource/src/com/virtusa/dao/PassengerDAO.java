package com.virtusa.dao;

import com.virtusa.model.BoardingModel;
import com.virtusa.model.BusModel;
import com.virtusa.model.SeatModel;
import com.virtusa.repository.BusRepository;

public class PassengerDAO {

	public boolean showBuses(BoardingModel boardingModel) 
	{
		if(boardingModel.getFrom().equals(BusRepository.getBusRepository().get(0).getBoardingPoint()) && boardingModel.getTo().equals(BusRepository.getBusRepository().get(0).getDroppingPoint())&&boardingModel.getJourneyDate().equals(BusRepository.getBusRepository().get(0).getJourneyDate()))
			
		{
			return true;
		}
		return false;
		
	}
	public boolean selectBus(BusModel busModel)
	{
		if(busModel.getDepatureTime().equals("")&&busModel.getArrivalTime().equals("")&&busModel.getBusType().equals(""))
			return true;
		return false;
		
	}
	public boolean bookSeat(SeatModel seatModel)
	{
		if(seatModel.getSeatNo()==1&&seatModel.getSeatType().equals(""))
			return true;
		return false;
		
	}
}
