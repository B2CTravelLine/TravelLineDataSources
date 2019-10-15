package com.virtusa.services;

import java.sql.SQLException;

import com.virtusa.model.AddAdminModel;
import com.virtusa.model.AddServicesModel;
import com.virtusa.model.AdminLoginModel;
import com.virtusa.model.FeedBackModel;
import com.virtusa.model.ModifyServiceModel;

public interface AdminService {

	public boolean Verification(AdminLoginModel adminLoginModel) throws ClassNotFoundException, SQLException;
	public boolean adminStoreVerification(AddAdminModel addadminModel) throws ClassNotFoundException,SQLException;
	public boolean addServiceVerification(AddServicesModel addServicesModel) throws ClassNotFoundException, SQLException;
	public boolean modifyServiceVerification(ModifyServiceModel modifyServiceModel)throws ClassNotFoundException, SQLException;
	boolean viewFeedbackVerification(FeedBackModel feedbackModel) throws ClassNotFoundException, SQLException;

}
