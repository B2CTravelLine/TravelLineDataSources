package com.virtusa.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.entities.Admin;
import com.virtusa.entities.BusEntity;
import com.virtusa.model.AddAdminModel;
import com.virtusa.model.AddServicesModel;
import com.virtusa.model.AdminLoginModel;
import com.virtusa.model.FeedBackModel;
import com.virtusa.model.ModifyServiceModel;
import com.virtusa.utilities.ConnectionManager;

public class AdminDAO 
{
	@SuppressWarnings({ "static-access", "unused" })
	public boolean adminVerification(AdminLoginModel adminLoginModel) throws ClassNotFoundException, SQLException
	{
		try 
		{

			ConnectionManager connectionUtility=new ConnectionManager();
			Connection connection=connectionUtility.openConnection();
		
			String query="SELECT * FROM Admin WHERE username='"+adminLoginModel.getUserName() +"' AND Password= '"+adminLoginModel.getPassword()+"'";
			PreparedStatement statement=connection.prepareStatement(query);
		
			ResultSet rs=statement.executeQuery();
			while(rs.next())
			{
				String username=rs.getString("username");
				String password=rs.getString("Password");
				return true;
			}
			rs.close();
			connection.close();
		} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
			} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return false;
}
	
	@SuppressWarnings("static-access")
	public boolean adminStoreVerification(AddAdminModel addadminModel)throws ClassNotFoundException, SQLException 
	{
		try 
		{
			ConnectionManager connectionUtility=new ConnectionManager();
			Connection con=connectionUtility.openConnection();
		
			String querys = "INSERT INTO Admin VALUES ("
			    + " ?, ?, ?, ?, ?)";
		// set all the preparedstatement parameters
		PreparedStatement st = con.prepareStatement(querys);

		st.setString(1, addadminModel.getUserName());
		st.setString(2, addadminModel.getPassword());
		st.setString(3, addadminModel.getEmail());
		st.setInt(4, addadminModel.getAge());
		st.setString(5, addadminModel.getGender());

		// execute the preparedstatement insert
		st.executeUpdate();

		// st.close();
		
		st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

				return true;
		}


	@SuppressWarnings("static-access")
	public boolean addServiceVerification(AddServicesModel addServicesModel) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		
	try {	
		ConnectionManager connectionManager= new ConnectionManager();
		Connection connection = connectionManager.openConnection();
		PreparedStatement statement = connection.prepareStatement("insert into buses values(?,?,?,?,?,?)");
		statement.setInt(1, addServicesModel.getBusNo());
		statement.setString(2,addServicesModel.getBusName());
		statement.setString(3, addServicesModel.getBusType());
		statement.setInt(4, addServicesModel.getNoOfSeats());		
		statement.setInt(5, addServicesModel.getFare());
		statement.setInt(6, addServicesModel.getBoardingId());
		
		statement.executeUpdate();
				statement.close();
				} catch (SQLException e) {
				
				e.printStackTrace();
				}

					return true;
		}





	@SuppressWarnings("static-access")
	public boolean modifyServiceVerification(ModifyServiceModel modifyServiceModel)  throws ClassNotFoundException,SQLException{
		// TODO Auto-generated method stub
		try {	
			ConnectionManager connectionManager= new ConnectionManager();
			Connection connection = connectionManager.openConnection();
			String query="update buses "
					+ "set busno=?,busname=?,bustype=?,noOfSeats=?,fare=?"
					+"where boardingId=?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, modifyServiceModel.getBusNo());
			statement.setString(2,modifyServiceModel.getBusName());
			statement.setString(3, modifyServiceModel.getBusType());
			statement.setInt(4, modifyServiceModel.getNoOfSeats());		
			statement.setDouble(5, modifyServiceModel.getFare());
			statement.setInt(6,modifyServiceModel.getBoardingId());
			
			statement.executeUpdate();
					statement.close();
					} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}

						return true;
					}


	@SuppressWarnings("static-access")
	public boolean viewFeedbackVerification(FeedBackModel feedbackModel) throws ClassNotFoundException, SQLException 
	{
		try {
		ConnectionManager connectionManager= new ConnectionManager();
		Connection connection = connectionManager.openConnection();
		String query= "SELECT * FROM feedback ";

		PreparedStatement statement = connection.prepareStatement(query);
		ResultSet rs=statement.executeQuery();
		System.out.println("name                emailId        comments");
	    
		while(rs.next()) {
			String name = rs.getString("name");
			String emailId=rs.getString("emailId");
			String comments=rs.getString("comments");
	        System.out.println(name+"           "+ emailId+"         "+comments);
		 return true;
	}
		rs.close();
		connection.close();
		}catch (SQLException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
}