package com.virtusa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.entities.Admin;
import com.virtusa.model.AdminLoginModel;
import com.virtusa.repository.AdminRepository;
import com.virtusa.utilities.ConnectionManager;

public class AdminDAO {
	
	

	public boolean adminStoreVerification(Admin admin) {
		// TODO Auto-generated method stub
		return AdminRepository.add(admin);
	}
	public boolean adminVerification(AdminLoginModel adminLoginModel) throws ClassNotFoundException, SQLException
	{
		ConnectionManager connectionUtility=new ConnectionManager();
		Connection con=connectionUtility.openConnection();
		PreparedStatement statement=con.prepareStatement("select * from Admin where admin_name=? and password=?");
		statement.setString(1,adminLoginModel.getAdminName());
		statement.setString(2, adminLoginModel.getAdminPassword());
		
		if(statement.getResultSet().equals(null)) {
			statement.close();
			con.close();
			 connectionUtility.closeConnection();
			return false;
			
			
			
		}
		else
			{
			statement.close();
			
			con.close();
			return true;
		}
		
	}
	public List<Admin> getAllAdmins() throws ClassNotFoundException, SQLException {
		Connection connection=ConnectionManager.openConnection();
		Statement statement=connection.createStatement();
		ResultSet resultSet= statement.executeQuery("select * from Employees");
		List<Admin> adminList=new ArrayList();

		while(resultSet.next()) {
		Admin admins=new Admin();
		admins.setAdminName(resultSet.getString("adminName"));
		admins.setAdminPassword(resultSet.getString("adminPassword"));
		admins.setEmail(resultSet.getString("email"));
		admins.setAge(resultSet.getInt("age"));
		admins.setGender(resultSet.getString("gender"));
		}
		ConnectionManager.closeConnection();
		return adminList;
	}	
	public boolean storeAdminDetails(Admin admins)throws ClassNotFoundException, SQLException {
		return false;
		}	
	
}
