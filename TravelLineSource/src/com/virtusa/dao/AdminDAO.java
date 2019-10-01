package com.virtusa.dao;

import com.virtusa.entities.Admin;
import com.virtusa.model.AdminLoginModel;
import com.virtusa.repository.AdminRepository;

public class AdminDAO {
	
	public boolean adminVerification(AdminLoginModel adminLoginModel)
	{
	if(adminLoginModel.getAdminName().equals(AdminRepository.getAdminRepository().get(0).getAdminName()) && adminLoginModel.getAdminPassword().equals(AdminRepository.getAdminRepository().get(0).getAdminPassword())) {
		return true;
	}
	return false;
	}

	public boolean adminStoreVerification(Admin admin) {
		// TODO Auto-generated method stub
		return AdminRepository.add(admin);
	}
}
