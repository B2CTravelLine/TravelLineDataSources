package com.virtusa.view;

import java.sql.SQLException;

import com.virtusa.controller.AdminController;

public class ViewFeedbackView {
	
		public void mainViewFeedback() throws ClassNotFoundException, SQLException
		{
			String name=null;
			 String emailId=null;
		 String comments=null;
			AdminController adminController = new AdminController();
			adminController.viewFeedbackService(name, emailId, comments);
				
		}
}