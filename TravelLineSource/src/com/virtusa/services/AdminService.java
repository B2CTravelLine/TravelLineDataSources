package com.virtusa.services;

import java.sql.SQLException;

import com.virtusa.model.FeedBackModel;

public interface AdminService {

	boolean viewFeedbackVerification(FeedBackModel feedbackModel) throws ClassNotFoundException, SQLException;

}
