package com.virtusa.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.model.BoardingModel;
import com.virtusa.model.BusModel;
import com.virtusa.model.PassengerDetailsModel;
import com.virtusa.model.SeatModel;
import com.virtusa.utilities.ConnectionManager;

public class PassengerDAO {


	@SuppressWarnings("static-access")
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
		ConnectionManager connectionUtility = new ConnectionManager();
		Connection con = connectionUtility.openConnection();
		// String str="2019-11-10";  
		  //  Date date=Date.valueOf(str);
		//System.out.println(boardingModel.getBoardingPoint());
		//System.out.println(boardingModel.getDroppingPoint());
		//System.out.println( boardingModel.getJourneyDate());
		PreparedStatement statement1 = con.prepareStatement("select b.* from boarding b where b.BROADING_POINT=? and b.DROPPING_POINT=? and b.JOURNEY_DATE=?");
		statement1.setString(1,boardingModel.getBoardingPoint());
		statement1.setString(2,boardingModel.getDroppingPoint());
		statement1.setDate(3, boardingModel.getJourneyDate());
		ResultSet rs1 = statement1.executeQuery();
		int bid = 0;
		while (rs1.next()) {
			bid = rs1.getInt(1);}
		
		
		
		PreparedStatement statement = con.prepareStatement("select b.* from bus b join boarding bo on b. BOARDING_ID=bo.BOARDING_ID where b.BOARDING_ID=?");
		statement.setInt(1, bid);
		ResultSet rs = statement.executeQuery();
		List<BusModel> list = new ArrayList<BusModel>();
		BusModel bus = new BusModel();
		while(rs.next()) {
			bus.setBusNo(rs.getInt(1));
			bus.setBusName(rs.getString(2));
			bus.setBusType(rs.getString(3));
			bus.setTotalSeats(rs.getInt(4));
			bus.setFare(rs.getInt(5));
			
			list.add(bus);
			bus = new BusModel();
			
		}
		for(BusModel i : list) {
			System.out.println(i);
		}
		return true;   
	}
	
	
	public boolean selectBus(BusModel busModel) throws ClassNotFoundException, SQLException
	{
		ConnectionManager connectionUtility = new ConnectionManager();
		Connection con = connectionUtility.openConnection();
		int seats = 40;
		PreparedStatement statement = con.prepareStatement("select noofseats from bus  where bus_number=?");
		statement.setInt(1,busModel.getBusNo());
		
		

		
		
		ResultSet rs1 = statement.executeQuery();
		
		
       while (rs1.next()) {
          seats = rs1.getInt(1);
           System.out.println(seats);
       }
			
		if (seats >= busModel.getTotalSeats())
		{
			return true;
		}
		else
		{
			return false;
		 }
      
	
		/*if((statement.getResultSet()).equals(null)) {
			
			return false;
		}int seats=0;
		System.out.println("hellooo ");

		
		//statement.setInt(2,busModel.getTotalSeats());
		ResultSet rs1=statement.executeQuery();
		
         while(rs1.next()) {
             seats=rs1.getInt(1);
             System.out.println(seats);
         }
		
			
		if(seats>=200)
		{
			System.out.println(" true");
		}
		else
			System.out.println("false");
		
		return true;
		*/
		
	
	}
	public boolean bookSeat(SeatModel seatModel)
	{
		if (seatModel.getSeatNo() == 1 && seatModel.getSeatType().equals(""))
			return true;
		return false;
		
	}
	
	public boolean addPassengers(PassengerDetailsModel passengerDetailsModel) throws ClassNotFoundException, SQLException {
		
		BusModel busModel = new BusModel();
		try {
		ConnectionManager connectionUtility = new ConnectionManager();
		Connection con = connectionUtility.openConnection();
		
		PreparedStatement statement1 = con.prepareStatement("INSERT INTO passenger VALUES ( ?, ?, ?)");
		statement1.setString(1, passengerDetailsModel.getName());
		
		statement1.setInt(2, passengerDetailsModel.getAge());
		statement1.setString(3, passengerDetailsModel.getGender());

		// execute the preparedstatement insert
		statement1.executeUpdate();


		
		statement1.close();
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		return true;
		

		
		
	}


	 
}
