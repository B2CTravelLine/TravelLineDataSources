package com.virtusa.controller;

import java.sql.Time;

import org.omg.CORBA.UserException;

import com.virtusa.helper.Factory_Admin;
import com.virtusa.model.AddAdminModel;
import com.virtusa.model.AdminLoginModel;
import com.virtusa.model.ModifyServiceModel;
import com.virtusa.services.AdminService_Imp;
import com.virtusa.view.AddAdminView;
import com.virtusa.view.AdminLoginView;
import com.virtusa.view.AdminOptionsView;
import com.virtusa.view.ErrorView;

public class AdminController {
	
	
	public void Verification(String userName,String password) {
		
		
		AdminLoginModel adminLoginModel=new AdminLoginModel();
		adminLoginModel.setAdminName(userName);
		adminLoginModel.setAdminPassword(password);
		AdminService_Imp userService=new AdminService_Imp(); 
		try {
	boolean userVal=userService.adminVerification(adminLoginModel);	
		
		if(userVal) {
			System.out.println("Admin Login Successfull");
			AdminOptionsView adminView=new AdminOptionsView();
			adminView.mainAdminOptionsView();
		}else {
			ErrorView errorView=new ErrorView();
			errorView.authenticationError();
		}
		
		}catch(Exception e) {
			System.out.println("User Authentication failed.");
			AdminLoginView adminLoginView=new AdminLoginView(); 
			adminLoginView.mainAdminView();
		
		}
	}

	
	
	public void registerAdmin(String AdminName,String AdminPassword,String Gender,String Email,int age)
	{
		AdminLoginModel adminLoginModel=new AdminLoginModel();
		adminLoginModel.setAdminName(AdminName);
		adminLoginModel.setAdminPassword(AdminPassword);
		adminLoginModel.setEmail(Email);
		adminLoginModel.setAge(age);
		adminLoginModel.setGender(Gender);
		AdminService_Imp userService=new AdminService_Imp(); 
		try {
	boolean userVal=userService.adminStoreVerification(adminLoginModel);	
		
		if(userVal) {
			System.out.println("Admin added Successfull");
			
			AdminOptionsView adminView=new AdminOptionsView();
			adminView.mainAdminOptionsView();
		}else {
			ErrorView errorView=new ErrorView();
			errorView.authenticationError();
		}
		
		}catch(Exception e) {
			System.out.println("new admin is not added");
			AddAdminView addAdmin=new AddAdminView();
			addAdmin.mainAddAdminView();
		}
	}
	
	public void modifyService(String serviceNo, String source, String destination, String busType, int distance,
			Time departureTime, Time arrivalTime, double totalFare, String active) {
		ModifyServiceModel modifyServiceModel = new ModifyServiceModel();
		modifyServiceModel.setServiceNo(serviceNo);
		modifyServiceModel.setSource(source);
		modifyServiceModel.setDestination(destination);
		modifyServiceModel.setBusType(busType);
		modifyServiceModel.setDistance(distance);
		modifyServiceModel.setDepartureTime(departureTime);
		modifyServiceModel.setArrivalTime(arrivalTime);
		modifyServiceModel.setTotalFare(totalFare);
		modifyServiceModel.setActive(active);
		
	}
	
		
		
	}

