package com.virtusa.services;


import java.sql.SQLException;
import java.util.Comparator;

import com.virtusa.dao.AdminDAO;
import com.virtusa.entities.Admin;
import com.virtusa.model.AddServicesModel;
import com.virtusa.model.AdminLoginModel;
import com.virtusa.repository.AdminRepository;

public class AdminService_Imp implements AdminService,Comparator<Admin> {
	 
	AdminRepository admin1=new AdminRepository();
	AdminDAO adminDAO=new AdminDAO();
	public boolean adminVerification(AdminLoginModel adminLoginModel) throws ClassNotFoundException, SQLException
	{
		return adminDAO.adminVerification(adminLoginModel);
	}

	@Override
	public int compare(Admin o1, Admin o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean adminStoreVerification(AdminLoginModel adminLoginModel) {
		// TODO Auto-generated method stub
		Admin admin=new Admin();
		admin.setAdminName(adminLoginModel.getAdminName());
		admin.setAdminPassword(adminLoginModel.getAdminPassword());
		admin.setAge(adminLoginModel.getAge());
		admin.setGender(adminLoginModel.getGender());
		admin.setEmail(adminLoginModel.getEmail());
		
		return  adminDAO.adminStoreVerification(admin);
	}
	
	public boolean addServiceVerification(AddServicesModel addServicesModel) throws ClassNotFoundException, SQLException
	{
		return adminDAO.addServiceVerification(addServicesModel);
		
	}

	
}
