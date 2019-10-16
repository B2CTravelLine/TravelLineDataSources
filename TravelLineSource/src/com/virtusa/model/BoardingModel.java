package com.virtusa.model;

import java.sql.Date;
import java.time.LocalDate;

public class BoardingModel {
	
	private String from;
	private String to;
	private Date journeyDate;
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		to = to;
	}
	

	
	
	
	public Date getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}
	@Override
	public String toString() {
		return "BoardingModel [From=" + from + ", To=" + to + ", journeyDate=" + journeyDate + "]";
	}
	

}
