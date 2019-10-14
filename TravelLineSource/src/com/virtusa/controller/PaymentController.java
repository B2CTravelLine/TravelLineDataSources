package com.virtusa.controller;

import com.virtusa.model.PaymentModel;

public class PaymentController 
{
	public void payment(String cardHolderName, int creditCardNumber, int cVV, int totalFareAmount) 
	{
		// TODO Auto-generated method stub
		PaymentModel paymentmodel=new PaymentModel();
		paymentmodel.setCardHolderName(cardHolderName);
		paymentmodel.setCreditCardNumber(creditCardNumber);
		paymentmodel.setToatlFareAmount(totalFareAmount);
	}
}

