package com.virtusa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
		PreparedStatement statement=con.prepareStatement("select * from admin where username=? and password=?");
		statement.setString(1,adminLoginModel.getAdminName());
		statement.setString(2, adminLoginModel.getAdminPassword());
		
		if(statement.getResultSet().equals(null)) {
			statement.close();
			con.close();
			
			return false;
		}
		statement.close();
		con.close();
		return true;
		
	}
}
