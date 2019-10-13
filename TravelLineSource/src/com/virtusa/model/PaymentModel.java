package com.virtusa.model;

public class PaymentModel {

	private String CardHolderName;
	private long CreditCardNumber;
	private int CVV;
	@Override
	public String toString() {
		return "PaymentModel [CardHolderName=" + CardHolderName + ", CreditCardNumber=" + CardHolderName + ", CVV=" + CVV+",ToatlFareAmount=" + ToatlFareAmount + "]";
	}
	
	private double ToatlFareAmount;
	public String getCardHolderName() {
		return CardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		CardHolderName = cardHolderName;
	}
	public long getCardNo() {
		return CreditCardNumber;
	}
	public void setCardNo(long cardNo) {
		CreditCardNumber = cardNo;
	}
	public int getCVV() {
		return CVV;
	}
	public void setCVV(int cVV) {
		CVV = cVV;
	}
	
	public double getToatlFareAmount() {
		return ToatlFareAmount;
	}
	public void setToatlFareAmount(double ToatlFareAmount) {
		ToatlFareAmount = ToatlFareAmount;
	}
	public void setCreditCardNumber(int creditCardNumber) {
		// TODO Auto-generated method stub
		
	}
}
   