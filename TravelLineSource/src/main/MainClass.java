package main;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.model.PaymentModel;
import com.virtusa.utilities.ConnectionManager;

public class MainClass {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("hai");
	/*
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
		List<Bus> list=new ArrayList<Buses>();
		Bus bus=new Bus();
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
		
		/*
		
		ConnectionManager connectionUtility=new ConnectionManager();
		Connection con=connectionUtility.openConnection();
	
		PreparedStatement statement=con.prepareStatement("select noofseats from bus  where bus_number=?");
		statement.setInt(1,1001);
		int seats=0;
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
			*/
		try {
		PaymentModel paymentModel=new PaymentModel();
		ConnectionManager connectionUtility=new ConnectionManager();
		Connection con=connectionUtility.openConnection();
		PreparedStatement statement1=con.prepareStatement("INSERT INTO payment VALUES ( ?, ?, ?)");
		statement1.setString(1,"bindu");
		statement1.setLong(2,123456789);
		statement1.setInt(3,234);
		statement1.executeUpdate();
		
		statement1.close();
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
