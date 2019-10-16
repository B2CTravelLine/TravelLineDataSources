package com.virtusa.controller;

import com.virtusa.model.PaymentModel;
import com.virtusa.services.PaymentService;

public class PaymentController 
{
	public void payment(String cardHolderName, int creditCardNumber, int cVV, int totalFareAmount) 
	{
		// TODO Auto-generated method stub
		PaymentModel paymentmodel=new PaymentModel();
		paymentmodel.setCardHolderName(cardHolderName);
		paymentmodel.setCreditCardNumber(creditCardNumber);
		paymentmodel.setToatlFareAmount(totalFareAmount);
		PaymentService paymentService=new PaymentService();
		
		try {
			
			boolean payval=paymentService.storePayment(paymentmodel);
			if(payval) {
				System.out.println("payment successfull");
				
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
}

