package com.virtusa.model;

public class ModifyServiceModel 
{
	private String busNo;
	private String to;
	private String from;
	private String busType;
	private double distance;
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	@Override
	public String toString() {
		return "ModifyServiceModel [busNo=" + busNo + ", to=" + to + ", from=" + from + ", busType="
				+ busType + ", distance=" + distance + "]";
	}
}
