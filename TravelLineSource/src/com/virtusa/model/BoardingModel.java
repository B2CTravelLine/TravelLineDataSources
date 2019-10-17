package com.virtusa.model;

import java.sql.Date;
import java.time.LocalDate;

public class BoardingModel {
	
	private String boardingPoint;
	private String droppingPoint;
	private Date journeyDate;
	
	
	

	
	
	
	public Date getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}
	public String getBoardingPoint() {
		return boardingPoint;
	}
	public void setBoardingPoint(String boardingPoint) {
		this.boardingPoint = boardingPoint;
	}
	public String getDroppingPoint() {
		return droppingPoint;
	}
	public void setDroppingPoint(String droppingPoint) {
		this.droppingPoint = droppingPoint;
	}
	@Override
	public String toString() {
		return "BoardingModel [boardingPoint=" + boardingPoint + ", droppingPoint=" + droppingPoint + ", journeyDate="
				+ journeyDate + "]";
	}
	
	

}
