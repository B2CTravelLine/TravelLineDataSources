package com.virtusa.view;

import com.virtusa.controller.AdminController;

public class ViewFeedbackView {
	
		public void mainViewFeedback()
		{
			String name=null;
			 String emailId=null;
		 String comments=null;
			AdminController adminController = new AdminController();
			adminController.viewFeedbackService(name, emailId, comments);
				
		}
}