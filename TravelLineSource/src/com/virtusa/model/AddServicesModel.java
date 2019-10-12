package com.virtusa.model;

public class AddServicesModel 
{
	private int busNo;
	private String busName;
	private String busType;
	private int noOfSeats;
	private double fare;
	private int boardingId;
	
	public AddServicesModel(){}

	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public int getBoardingId() {
		return boardingId;
	}

	public void setBoardingId(int boardingId) {
		this.boardingId = boardingId;
	}

	@Override
	public String toString() {
		return "AddServicesModel [busNo=" + busNo + ", busname=" + busname + ", busType=" + busType + ", noOfSeats="
				+ noOfSeats + ", fare=" + fare + ", boardingId=" + boardingId + "]";
	}
}
