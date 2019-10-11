                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  package com.virtusa.controller;

import java.sql.Time;

import org.omg.CORBA.UserException;

import com.virtusa.helper.Factory_Admin;
import com.virtusa.model.AddAdminModel;
import com.virtusa.model.AddServicesModel;
import com.virtusa.model.AdminLoginModel;
import com.virtusa.model.ModifyServiceModel;
import com.virtusa.services.AdminService_Imp;
import com.virtusa.view.AddAdminView;
import com.virtusa.view.AddServicesView;
import com.virtusa.view.AdminLoginView;
import com.virtusa.view.AdminOptionsView;
import com.virtusa.view.ErrorView;
import com.virtusa.view.ModifyServiceview;

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
	
	public void addService(String from, String to, String type, double fare,
				float distance, Time departureTime, Time arrivalTime, String serviceNo)
	{
		AddServicesModel addServicesModel = new AddServicesModel();
		addServicesModel.setFrom(from);
		addServicesModel.setTo(to);
		addServicesModel.setType(type);
		addServicesModel.setFare(fare);
		addServicesModel.setDistance(distance);
		addServicesModel.setDepartureTime(departureTime);
		addServicesModel.setArrivalTime(arrivalTime);
		addServicesModel.setServiceNo(serviceNo);
		
		AdminService_Imp userService=new AdminService_Imp(); 
		try 
		{
			boolean values =  userService.addServiceVerification(addServicesModel);
			if(values)
			{
				System.out.println("Entered Services are Added Successfully");
				AdminOptionsView adminOptionsView=new AdminOptionsView();
				adminOptionsView.mainAdminOptionsView();
			}
			else
			{
				ErrorView errorView=new ErrorView();
				errorView.addServicesError();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Sevices are not added");
			AddServicesView addServicesView=new AddServicesView();
			addServicesView.mainAddServicesView();
	
		}
	
	}
	
	public void modifyService(String busNo, String to, String from, String busType, int distance) 
	{
		ModifyServiceModel modifyServiceModel = new ModifyServiceModel();
		modifyServiceModel.setBusNo(busNo);
		modifyServiceModel.setTo(to);
		modifyServiceModel.setFrom(from);
		modifyServiceModel.setBusType(busType);
		modifyServiceModel.setDistance(distance);
		AdminService_Imp userService=new AdminService_Imp(); 
		try
		{
			boolean value = userService.modifyServiceVerification();
			if(value)
			{
				System.out.println("Requested Services are Updated");
				AdminOptionsView adminOptionsView=new AdminOptionsView();
				adminOptionsView.mainAdminOptionsView();
			}
		}
		catch(Exception e)
		{
			System.out.println("Requested Sevices are not Updated");
			ModifyServiceview modifyServicesView=new ModifyServiceview();
			modifyServicesView.mainModifyServiceView();
		}
	}
	
		
		
	}

