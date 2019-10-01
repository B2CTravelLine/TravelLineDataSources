package com.virtusa.model;

import java.util.Date;

public class PaymentModel {

	private String CardHolderName;
	private long CardNo;
	private int CVV;
	@Override
	public String toString() {
		return "PaymentModel [CardHolderName=" + CardHolderName + ", CardNo=" + CardNo + ", CVV=" + CVV
				+ ", ExpiryDate=" + ExpiryDate + ", ToatlFare=" + ToatlFare + "]";
	}
	private Date ExpiryDate;
	private double ToatlFare;
	public String getCardHolderName() {
		return CardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		CardHolderName = cardHolderName;
	}
	public long getCardNo() {
		return CardNo;
	}
	public void setCardNo(long cardNo) {
		CardNo = cardNo;
	}
	public int getCVV() {
		return CVV;
	}
	public void setCVV(int cVV) {
		CVV = cVV;
	}
	public Date getExpiryDate() {
		return ExpiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		ExpiryDate = expiryDate;
	}
	public double getToatlFare() {
		return ToatlFare;
	}
	public void setToatlFare(double toatlFare) {
		ToatlFare = toatlFare;
	}
}
