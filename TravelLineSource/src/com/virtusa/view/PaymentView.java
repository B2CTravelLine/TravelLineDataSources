package com.virtusa.view;

import java.sql.Date;
import java.util.Scanner;

import com.virtusa.controller.PassengerController;
import com.virtusa.controller.PaymentController;

public class PaymentView {

public void mainPaymentView()
{
Scanner sc=new Scanner(System.in);
System.out.println("=======Payment Form======");
    System.out.println("enter Card Holder Name");
    String cardHolderName=sc.next();
    System.out.println("enter Credit Card Number");
    int creditCardNumber=sc.nextInt();
    System.out.println("enter CVV");
    int CVV=sc.nextInt();
    System.out.println("enter Total Fare Amount");
    int totalFareAmount=sc.nextInt();
    
    PaymentController paymentController=new PaymentController();
	paymentController.payment(cardHolderName,creditCardNumber,CVV,totalFareAmount);
    
    
}
}
