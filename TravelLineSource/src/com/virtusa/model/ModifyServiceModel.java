package com.virtusa.model;

import java.sql.Time;

public class ModifyServiceModel {

	private String ServiceNo;
	private String Source;
	private String Destination;
	private String BusType;
	private int Distance;
	private Time DepartureTime;
	private Time ArrivalTime;
	private double TotalFare;
	private String Active;
	public String getServiceNo() {
		return ServiceNo;
	}
	public void setServiceNo(String serviceNo) {
		ServiceNo = serviceNo;
	}
	public String getSource() {
		return Source;
	}
	public void setSource(String source) {
		Source = source;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	public String getBusType() {
		return BusType;
	}
	public void setBusType(String busType) {
		BusType = busType;
	}
	public int getDistance() {
		return Distance;
	}
	public void setDistance(int distance) {
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
	public double getTotalFare() {
		return TotalFare;
	}
	public void setTotalFare(double totalFare) {
		TotalFare = totalFare;
	}
	public String getActive() {
		return Active;
	}
	public void setActive(String active) {
		Active = active;
	}
	@Override
	public String toString() {
		return "ModifyServiceModel [ServiceNo=" + ServiceNo + ", Source=" + Source + ", Destination=" + Destination
				+ ", BusType=" + BusType + ", Distance=" + Distance + ", DepartureTime=" + DepartureTime
				+ ", ArrivalTime=" + ArrivalTime + ", TotalFare=" + TotalFare + ", Active=" + Active + "]";
	}
}
