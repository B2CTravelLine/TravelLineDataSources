package com.virtusa.repository;

import java.sql.Date;
import java.util.List;

public class Bus {

	private int BusNo;
	private String BoardingPoint;
	private String DroppingPoint;
	private Date JourneyDate;
	private List<String> time;
	public int getBusNo() {
		return BusNo;
	}
	public void setBusNo(int busNo) {
		BusNo = busNo;
	}
	public String getBoardingPoint() {
		return BoardingPoint;
	}
	public void setBoardingPoint(String boardingPoint) {
		BoardingPoint = boardingPoint;
	}
	public String getDroppingPoint() {
		return DroppingPoint;
	}
	public void setDroppingPoint(String droppingPoint) {
		DroppingPoint = droppingPoint;
	}
	public Date getJourneyDate() {
		return JourneyDate;
	}
	public void setJourneyDate(Date journeyDate) {
		JourneyDate = journeyDate;
	}
	public List<String> getTime() {
		return time;
	}
	public void setTime(List<String> time) {
		this.time = time;
	}
	
}
