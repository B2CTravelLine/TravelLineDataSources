package com.virtusa.controller;

//import java.sql.Time;
import com.virtusa.model.AddAdminModel;
import com.virtusa.model.AddServicesModel;
import com.virtusa.model.AdminLoginModel;
import com.virtusa.model.FeedBackModel;
import com.virtusa.model.ModifyServiceModel;
import com.virtusa.services.AdminService_Imp;
import com.virtusa.view.AddAdminView;
//import com.virtusa.view.AddAdminView;
import com.virtusa.view.AddServicesView;
import com.virtusa.view.AdminLoginView;
import com.virtusa.view.AdminOptionsView;
import com.virtusa.view.ErrorView;
import com.virtusa.view.FeedBackView;
import com.virtusa.view.ModifyServiceview;

public class AdminController{
public void verification(String userName,String password) {
		AdminLoginModel adminLoginModel=new AdminLoginModel(userName,password);
		boolean verf ;
		AdminService_Imp userService=new AdminService_Imp(); 
		try {
			verf=userService.Verification(adminLoginModel);	
			System.out.println(verf);
	//System.out.println(adminLoginModel.getUserName());
	//System.out.println(adminLoginModel.getPassword());
		if(verf==true) {
			System.out.println("Admin Login Successfull");
			AdminOptionsView adminView=new AdminOptionsView();
			adminView.mainAdminOptionsView();
		}else {
			ErrorView errorView=new ErrorView();
			errorView.authenticationError();
			AdminLoginView adminLoginView=new AdminLoginView(); 
			adminLoginView.mainAdminView();
		}}
		catch (Exception e) {
			System.out.println("User Authentication failed.");
		}}
	public void registerAdmin(String userName,String Password,String email,int age ,String gender){
		AddAdminModel  addadminModel=new AddAdminModel();
		addadminModel.setUserName(userName);
		addadminModel.setPassword(Password);
		addadminModel.setEmail(email);
		addadminModel.setAge(age);
		addadminModel.setGender(gender);
		boolean verf1;
		AdminService_Imp adminService=new AdminService_Imp(); 
		try {
			verf1=adminService.adminStoreVerification(addadminModel);	
	// AddAdminView adminView=new AddAdminView();
			System.out.println(verf1);
			System.out.println(addadminModel.getUserName());
			System.out.println(addadminModel.getPassword());
		if(verf1==true) {
			System.out.println("Admin added Successfull");
			
			AdminOptionsView adminOptionView=new AdminOptionsView();
			adminOptionView.mainAdminOptionsView();
		}else {
			ErrorView errorView=new ErrorView();
			errorView.authenticationError();
		}
		}catch(Exception e) {
			System.out.println("new admin is not added");
			AddAdminView addAdminView=new AddAdminView();
			addAdminView.mainAddAdminView();
		}
	}
	public void addService(int busNo,String busName,String busType,int noOfSeats,int fare,int boardingId) {
		AddServicesModel addServicesModel = new AddServicesModel();
		addServicesModel.setBusNo(busNo);
		addServicesModel.setBusName(busName);
		addServicesModel.setBusType(busType);
		addServicesModel.setNoOfSeats(noOfSeats);
		addServicesModel.setFare(fare);
		addServicesModel.setBoardingId(boardingId);
		boolean verf2;
		AdminService_Imp adminService=new AdminService_Imp(); 
		try {
			verf2 =  adminService.addServiceVerification(addServicesModel);
			if(verf2==true) {
				System.out.println("Entered Services are Added Successfully");
				AdminOptionsView adminOptionsView=new AdminOptionsView();
				adminOptionsView.mainAdminOptionsView();
			}else {
				ErrorView errorView=new ErrorView();
				errorView.addServicesError();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Sevices are not added");
			AddServicesView addServicesView=new AddServicesView();
			addServicesView.mainAddServicesView();
		}}
	public void modifyService(int busNo,String busName,String busType,int noOfSeats,double fare,int boardingId) {
		ModifyServiceModel modifyServiceModel = new ModifyServiceModel();
		modifyServiceModel.setBusNo(busNo);
		modifyServiceModel.setBusName(busName);
		modifyServiceModel.setBusType(busType);
		modifyServiceModel.setNoOfSeats(noOfSeats);
		modifyServiceModel.setFare(fare);
		modifyServiceModel.setBoardingId(boardingId);	
		boolean verf3;
		AdminService_Imp modifyService=new AdminService_Imp(); 
		try{
			verf3 = modifyService.modifyServiceVerification(modifyServiceModel);
			if(verf3==true){
				System.out.println("Requested Services are Updated");
				AdminOptionsView adminOptionsView=new AdminOptionsView();
				adminOptionsView.mainAdminOptionsView();
			}
		}
		catch(Exception e){
			System.out.println("Requested Sevices are not Updated");
			ModifyServiceview modifyServicesView=new ModifyServiceview();
			modifyServicesView.mainModifyServiceView();
		}
	}
	public void viewFeedbackService(String name, String emailId, String comments) {
		FeedBackModel feedbackModel = new FeedBackModel();
		feedbackModel.setName(name);
		feedbackModel.setEmailId(emailId);
		feedbackModel.setComments(comments);
		boolean verf4;
		AdminService_Imp feedbackService=new AdminService_Imp(); 
		try {
			verf4 =  feedbackService.viewFeedbackVerification(feedbackModel);
			if(verf4==true){
				System.out.println("feedback viewed successfully");
				AdminOptionsView adminOptionsView=new AdminOptionsView();
				adminOptionsView.mainAdminOptionsView();
			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Sorry, we are unable to view feedback");
			FeedBackView feedbackView=new  FeedBackView();
			feedbackView.mainFeedbackServiceView();
		}}
}
