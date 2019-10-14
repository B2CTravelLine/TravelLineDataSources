package main;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.model.Buses;
import com.virtusa.utilities.ConnectionManager;

public class MainClass {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("hai");
		
		ConnectionManager connectionUtility=new ConnectionManager();
		Connection con=connectionUtility.openConnection();
		 String str="2019-11-10";  
		    Date date=Date.valueOf(str);
		PreparedStatement statement1=con.prepareStatement("select b.* from boarding b where b.BROADING_POINT=? and b.DROPPING_POINT=? and b.JOURNEY_DATE=?");
		statement1.setString(1,"Guntur");
		statement1.setString(2, "Hyderabad");
		statement1.setDate(3,date);
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
	}

}
