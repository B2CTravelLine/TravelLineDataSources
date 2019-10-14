package com.virtusa.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.model.BoardingModel;
import com.virtusa.model.Buses;
import com.virtusa.model.SeatModel;
import com.virtusa.repository.BusRepository;
import com.virtusa.utilities.ConnectionManager;

public class PassengerDAO {


	public boolean showBuses(BoardingModel boardingModel) throws ClassNotFoundException, SQLException 
	{
	/*	ConnectionManager connectionUtility=new ConnectionManager();
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
	*/	
		ConnectionManager connectionUtility=new ConnectionManager();
		Connection con=connectionUtility.openConnection();
		 String str="2019-11-10";  
		    Date date=Date.valueOf(str);
		PreparedStatement statement1=con.prepareStatement("select b.* from boarding b where b.BROADING_POINT=? and b.DROPPING_POINT=? and b.JOURNEY_DATE=?");
		statement1.setString(1,boardingModel.getFrom());
		statement1.setString(2,boardingModel.getTo());
		statement1.setDate(3, boardingModel.getJourneyDate());
		ResultSet rs1=statement1.executeQuery();
		int bid=0;
		while(rs1.next()) {
			bid=rs1.getInt(1);}
		
		
		PreparedStatement statement=con.prepareStatement("select b.* from bus b join boarding bo on b. BOARDING_ID=bo.BOARDING_ID where b.BOARDING_ID=?");
		statement.setInt(1, bid);
		ResultSet rs=statement.executeQuery();
		List<Buses> list=new ArrayList<Buses>();
		Buses bus=new Buses();
		while(rs.next()) {
			bus.setBusNo(rs.getInt(1));
			bus.setBusName(rs.getString(2));
			bus.setBusType(rs.getString(3));
			bus.setTotalSeats(rs.getInt(4));
			bus.setFare(rs.getInt(5));
			
			list.add(bus);
			bus=new Buses();
			
		}
		for(Buses i : list) {
			System.out.println(i);
		}
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
