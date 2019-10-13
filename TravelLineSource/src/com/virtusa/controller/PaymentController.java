package com.virtusa.controller;

import java.sql.Date;

import com.virtusa.model.PaymentModel;

public class PaymentController {

public void payment(String cardHolderName,int creditCardNumber,
int CVV, Date expiryDate,int totalFareAmount) {

PaymentModel paymentmodel=new PaymentModel();
paymentmodel.setCardHolderName(cardHolderName);
paymentmodel.setCreditCardNumber(creditCardNumber);
paymentmodel.setToatlFareAmount(totalFareAmount);


}}

