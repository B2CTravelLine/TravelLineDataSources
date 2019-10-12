package com.virtusa.entities;

public class BusEntity 
{
	private int busNo;
	private String busName;
	private String busType;
	private int noOfSeats;
	private double fare;
	private int boardingId;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + boardingId;
		result = prime * result + ((busName == null) ? 0 : busName.hashCode());
		result = prime * result + busNo;
		result = prime * result + ((busType == null) ? 0 : busType.hashCode());
		long temp;
		temp = Double.doubleToLongBits(fare);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + noOfSeats;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BusEntity other = (BusEntity) obj;
		if (boardingId != other.boardingId)
			return false;
		if (busName == null) {
			if (other.busName != null)
				return false;
		} else if (!busName.equals(other.busName))
			return false;
		if (busNo != other.busNo)
			return false;
		if (busType == null) {
			if (other.busType != null)
				return false;
		} else if (!busType.equals(other.busType))
			return false;
		if (Double.doubleToLongBits(fare) != Double.doubleToLongBits(other.fare))
			return false;
		if (noOfSeats != other.noOfSeats)
			return false;
		return true;
	}
	
	
	
}
