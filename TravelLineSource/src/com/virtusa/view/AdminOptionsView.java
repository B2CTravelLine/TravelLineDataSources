package com.virtusa.view;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

public class AdminOptionsView {

	public void mainAdminOptionsView() throws ParseException, ClassNotFoundException, SQLException
	{
		
		System.out.println("Select the option\n");
		System.out.println("1.Add Admin");
		System.out.println("2.Add Services");
		System.out.println("3.Modify Services");
		System.out.println("4.View Feedback");
		System.out.println("5.Book the ticket");
		Scanner in = new Scanner(System.in); 
		int option=in.nextInt();
		
		switch(option)
		{
			case 1:AddAdminView addAdminView=new AddAdminView();
			       addAdminView.mainAddAdminView();
					break;
			case 2:	AddServicesView addServicesView=new AddServicesView();
					addServicesView.mainAddServicesView();
					
					break;
			case 3:ModifyServiceview modifyServiceview=new  ModifyServiceview();
					modifyServiceview.mainModifyServiceView();
					break;
			case 4:ViewFeedbackView viewFeedback=new ViewFeedbackView();
					viewFeedback.mainViewFeedback();
					break;
			case 5:BoardingView boardingView=new BoardingView();
					boardingView.mainBoardingView();
			
		}
		
	}
}
