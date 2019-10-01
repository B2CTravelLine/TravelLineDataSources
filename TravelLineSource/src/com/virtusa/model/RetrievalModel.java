package com.virtusa.model;

import java.util.Date;

public class RetrievalModel {

	
	private int PNRNo;
	private String PassengerName;
	private Date DateOfJourney;
	private String IDProof;
	public int getPNRNo() {
		return PNRNo;
	}
	public void setPNRNo(int pNRNo) {
		PNRNo = pNRNo;
	}
	public String getPassengerName() {
		return PassengerName;
	}
	public void setPassengerName(String passengerName) {
		PassengerName = passengerName;
	}
	public Date getDateOfJourney() {
		return DateOfJourney;
	}
	public void setDateOfJourney(Date dateOfJourney) {
		DateOfJourney = dateOfJourney;
	}
	public String getIDProof() {
		return IDProof;
	}
	public void setIDProof(String iDProof) {
		IDProof = iDProof;
	}
	@Override
	public String toString() {
		return "RetrievalModel [PNRNo=" + PNRNo + ", PassengerName=" + PassengerName + ", DateOfJourney="
				+ DateOfJourney + ", IDProof=" + IDProof + "]";
	}
	
}
