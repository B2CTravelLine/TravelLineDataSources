package com.virtusa.model;

import java.sql.Time;

public class AddServicesModel {
	private String From;
	private String To;
	private String Type;
	private double Fare;
	private float Distance;
	private  Time DepartureTime;
	private Time ArrivalTime;
	private String ServiceNo;
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
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public double getFare() {
		return Fare;
	}
	public void setFare(double fare) {
		Fare = fare;
	}
	public float getDistance() {
		return Distance;
	}
	public void setDistance(float distance) {
		Distance = distance;
	}
	public Time getDepartureTime() {
		return DepartureTime;
	}
	public void setDepartureTime(Time departureTime) {
		DepartureTime = departureTime;
	}
	public Time getArrivalTime() {
		return ArrivalTime;
	}
	public void setArrivalTime(Time arrivalTime) {
		ArrivalTime = arrivalTime;
	}
	public String getServiceNo() {
		return ServiceNo;
	}
	@Override
	public String toString() {
		return "AddServicesModel [From=" + From + ", To=" + To + ", Type=" + Type + ", Fare=" + Fare + ", Distance="
				+ Distance + ", DepartureTime=" + DepartureTime + ", ArrivalTime=" + ArrivalTime + ", ServiceNo="
				+ ServiceNo + "]";
	}
	public void setServiceNo(String serviceNo) {
		ServiceNo = serviceNo;
	}
}
