package com.virtusa.repository;

import java.util.ArrayList;
import java.util.List;

import com.virtusa.entities.Admin;




public class AdminRepository {

	private static List<Admin> adminRepository=
			new ArrayList<Admin>();
	static{
		Admin admin=new Admin();
		admin.setUserName("bindu");
		admin.setPassword("bindu");
		admin.setEmailId("bindu@.com");
		admin.setGender("female");
		admin.setAge(20);
		
		//admin.setUserType(UserTypes.ADMIN);
		adminRepository.add(admin);
	}
	public static List<Admin> getAdminRepository() {
		return adminRepository;
	}
	public static void setAdminRepository(List<Admin> adminRepository) {
		AdminRepository.adminRepository = adminRepository;
	}
	public static boolean add(Admin admin) {
		// TODO Auto-generated method stub
		
		return adminRepository.add(admin);
		
	}		
	
	
}
