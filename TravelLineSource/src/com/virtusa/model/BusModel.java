package com.virtusa.model;

import java.sql.Time;

public class BusModel {
	
	private String ServiceNo;
	private String BusType;
	private String DepatureTime;
	private String ArrivalTime;
	private double Fare;
	public String getServiceNo() {
		return ServiceNo;
	}
	public void setServiceNo(String serviceNo) {
		ServiceNo = serviceNo;
	}
	
	public double getFare() {
		return Fare;
	}
	public void setFare(double fare) {
		Fare = fare;
	}
	public String getBusType() {
		return BusType;
	}
	public void setBusType(String busType) {
		BusType = busType;
	}
	public String getDepatureTime() {
		return DepatureTime;
	}
	public void setDepatureTime(String depatureTime) {
		DepatureTime = depatureTime;
	}
	public String getArrivalTime() {
		return ArrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		ArrivalTime = arrivalTime;
	}
	@Override
	public String toString() {
		return "BusModel [ServiceNo=" + ServiceNo + ", BusType=" + BusType + ", DepatureTime=" + DepatureTime
				+ ", ArrivalTime=" + ArrivalTime + ", Fare=" + Fare + "]";
	}
	
	

}
