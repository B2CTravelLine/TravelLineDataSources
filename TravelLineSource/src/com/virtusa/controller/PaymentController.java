package com.virtusa.controller;

import java.sql.SQLException;

import com.virtusa.model.FeedBackModel;
import com.virtusa.model.PaymentModel;
import com.virtusa.services.PaymentService;
import com.virtusa.view.FeedBackView;

public class PaymentController 
{
	public void payment(String cardHolderName, int creditCardNumber, int cVV) 
	{
		// TODO Auto-generated method stub
		PaymentModel paymentmodel=new PaymentModel();
		paymentmodel.setCardHolderName(cardHolderName);
		paymentmodel.setCreditCardNumber(creditCardNumber);
		paymentmodel.setCVV(cVV);
		//paymentmodel.setToatlFareAmount(totalFareAmount);
		PaymentService paymentService=new PaymentService();
		
		try {
			
			boolean payval=paymentService.storePayment(paymentmodel);
			if(payval) {
				System.out.println("payment successfull");
				FeedBackView feedbackView=new FeedBackView();
				feedbackView.mainFeedbackServiceView();
				
			}
			else
			{
				System.out.println("payment not successfull");
			}
		}catch(Exception e)
		{
			System.out.println("Exception");
		}
	}
	public void feedback(String name,String emailId,String comments) throws ClassNotFoundException, SQLException 
	{
		FeedBackModel feedbackModel=new FeedBackModel();
		feedbackModel.setName(name);
		feedbackModel.setEmailId(emailId);
		feedbackModel.setComments(comments);
		PaymentService paymentService=new PaymentService();
		boolean feedval=paymentService.storeFeedBack(feedbackModel);
		if(feedval)
		{
			System.out.println("Feedback submitted");
			
		}
		else
		{
			System.out.println("FeedBack not submitted");
		}
		
	}
}

