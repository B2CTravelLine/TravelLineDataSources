package com.virtusa.model;

import java.sql.Date;
import java.time.LocalDate;

public class BoardingModel {
	
	private String From;
	private String To;
	private LocalDate journeyDate;
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
	

	
	public LocalDate getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(LocalDate journeyDate) {
		this.journeyDate = journeyDate;
	}
	@Override
	public String toString() {
		return "BoardingModel [From=" + From + ", To=" + To + ", journeyDate=" + journeyDate + "]";
	}
	

}
