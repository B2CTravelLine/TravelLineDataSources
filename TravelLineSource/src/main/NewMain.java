package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.model.BoardingModel;
import com.virtusa.model.BusModel;
import com.virtusa.utilities.ConnectionManager;

public class NewMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		/*// TODO Auto-generated method stub
		BoardingModel boardingModel=new BoardingModel();
		ConnectionManager connectionUtility=new ConnectionManager();
		Connection con=connectionUtility.openConnection();
		// String str="2019-11-10";  
		  //  Date date=Date.valueOf(str);
		PreparedStatement statement1=con.prepareStatement("select b.* from boarding b where b.BROADING_POINT=? and b.DROPPING_POINT=? and b.JOURNEY_DATE=?");
		statement1.setString(1,boardingModel.getFrom());
		statement1.setString(2,boardingModel.getTo());
		statement1.setDate(3, boardingModel.getJourneyDate());
		ResultSet rs1=statement1.executeQuery();
		int bid=0;
		while(rs1.next()) {
			bid=rs1.getInt(1);}
		
		if(bid==0) {
			System.out.println("buses not available");
		}
		
		PreparedStatement statement=con.prepareStatement("select b.* from bus b join boarding bo on b. BOARDING_ID=bo.BOARDING_ID where b.BOARDING_ID=?");
		statement.setInt(1, bid);
		ResultSet rs=statement.executeQuery();
		List<BusModel> list=new ArrayList<BusModel>();
		BusModel bus=new BusModel();
		while(rs.next()) {
			bus.setBusNo(rs.getInt(1));
			bus.setBusName(rs.getString(2));
			bus.setBusType(rs.getString(3));
			bus.setTotalSeats(rs.getInt(4));
			bus.setFare(rs.getInt(5));
			
			list.add(bus);
			bus=new BusModel();
			
		}
		for(BusModel i : list) {
			System.out.println(i);
		}*/
	}

}