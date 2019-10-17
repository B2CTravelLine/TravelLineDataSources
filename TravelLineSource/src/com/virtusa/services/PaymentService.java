package com.virtusa.services;

import java.sql.SQLException;

import com.virtusa.dao.PaymentDAO;
import com.virtusa.model.FeedBackModel;
import com.virtusa.model.PaymentModel;

public class PaymentService {

		PaymentDAO paymentDao=new PaymentDAO();
		
		public boolean storePayment(PaymentModel paymentModel) throws ClassNotFoundException, SQLException {
			return paymentDao.storePaymentDetails(paymentModel);
			
		}
		public boolean storeFeedBack(FeedBackModel feedbackModel) throws ClassNotFoundException, SQLException
		{
			return paymentDao.storeFeedBack(feedbackModel);
			
		}
	
}
