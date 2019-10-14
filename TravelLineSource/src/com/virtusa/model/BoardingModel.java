package com.virtusa.model;

import java.sql.Date;
import java.time.LocalDate;

public class BoardingModel {
	
	private String From;
	private String To;
	private Date journeyDate;
	public String getFrom() {
		return From;
	}
	public void setFrom(String from) {
		From = from;
	}
	public String getTo() {
		return To;
	}
	public void setTo(String to) {
		To = to;
	}
	

	
	
	
	public Date getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}
	@Override
	public String toString() {
		return "BoardingModel [From=" + From + ", To=" + To + ", journeyDate=" + journeyDate + "]";
	}
	

}
