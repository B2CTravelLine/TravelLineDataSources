package com.virtusa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.virtusa.model.BoardingModel;
import com.virtusa.model.Buses;
import com.virtusa.model.SeatModel;
import com.virtusa.repository.BusRepository;
import com.virtusa.utilities.ConnectionManager;

public class PassengerDAO {


	public boolean showBuses(BoardingModel boardingModel) throws ClassNotFoundException, SQLException 
	{
		ConnectionManager connectionUtility=new ConnectionManager();
		Connection con=connectionUtility.openConnection();
		PreparedStatement statement=con.prepareStatement("select * from boarding inner join   where username=? and password=?");
		statement.setString(1,boardingModel.getFrom());
		statement.setString(2, boardingModel.getTo());
		statement.setDate(3, boardingModel.getJourneyDate());
		
		if(statement.getResultSet().equals(null)) {
			statement.close();
			con.close();
			
			return false;
		}
		statement.close();
		con.close();
		return true;
		
	      
	}
	
	/*public boolean showBuses(BoardingModel boardingModel) 
	{
		if(boardingModel.getFrom().equals(BusRepository.getBusRepository().get(0).getBoardingPoint()) && boardingModel.getTo().equals(BusRepository.getBusRepository().get(0).getDroppingPoint())&&boardingModel.getJourneyDate().equals(BusRepository.getBusRepository().get(0).getJourneyDate()))
			
		{
			return true;
		}
		return false;
		
	}*/
	public boolean selectBus(Buses busModel) throws ClassNotFoundException, SQLException
	{
		ConnectionManager connectionUtility=new ConnectionManager();
		Connection con=connectionUtility.openConnection();
		
		//if(busModel.getDepatureTime().equals("")&&busModel.getArrivalTime().equals("")&&busModel.getBusType().equals(""))
			//return true;
		return false;
		
	}
	public boolean bookSeat(SeatModel seatModel)
	{
		if(seatModel.getSeatNo()==1&&seatModel.getSeatType().equals(""))
			return true;
		return false;
		
	}
}
