package com.virtusa.services;

import java.sql.SQLException;
import java.util.Comparator;

import com.virtusa.dao.AdminDAO;
import com.virtusa.entities.Admin;
import com.virtusa.model.AddAdminModel;
import com.virtusa.model.AddServicesModel;
import com.virtusa.model.AdminLoginModel;
import com.virtusa.model.FeedBackModel;
import com.virtusa.model.ModifyServiceModel;
import com.virtusa.repository.AdminRepository;


public class AdminService_Imp implements AdminService,Comparator<Admin> {
	 
	AdminDAO adminDAO=new AdminDAO();
	public boolean Verification(AdminLoginModel adminLoginModel) throws ClassNotFoundException, SQLException
	{
		return adminDAO.adminVerification(adminLoginModel);
	}

	/*@Override
	public int compare(Admin o1, Admin o2) {
		// TODO Auto-generated method stub
		return 0;
	}*/

	public boolean adminStoreVerification(AddAdminModel addadminModel) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
	
		return  adminDAO.adminStoreVerification(addadminModel);
	}

	
public boolean addServiceVerification(AddServicesModel addServicesModel) throws ClassNotFoundException, SQLException
	{
		return adminDAO.addServiceVerification(addServicesModel);
		
	}




public boolean modifyServiceVerification(ModifyServiceModel modifyServiceModel)throws ClassNotFoundException, SQLException {
	// TODO Auto-generated method stub
	return adminDAO.modifyServiceVerification(modifyServiceModel);
	
}



@Override
public boolean viewFeedbackVerification(FeedBackModel feedbackModel) throws ClassNotFoundException, SQLException {
	// TODO Auto-generated method stub
	return adminDAO.viewFeedbackVerification(feedbackModel);
}

@Override
public int compare(Admin o1, Admin o2) {
	// TODO Auto-generated method stub
	return 0;
}
	
}
