package com.virtusa.model;

public class ModifyServiceModel 
{
	private int busNo;
	private String busName;
	private String busType;
	private int noOfSeats;
	private double fare;
	private int boardingId;
	/**
	 * @return the busNo
	 */
	public int getBusNo() {
		return busNo;
	}
	/**
	 * @param busNo the busNo to set
	 */
	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}
	/**
	 * @return the busName
	 */
	public String getBusName() {
		return busName;
	}
	/**
	 * @param busName the busName to set
	 */
	public void setBusName(String busName) {
		this.busName = busName;
	}
	/**
	 * @return the busType
	 */
	public String getBusType() {
		return busType;
	}
	/**
	 * @param busType the busType to set
	 */
	public void setBusType(String busType) {
		this.busType = busType;
	}
	/**
	 * @return the noOfSeats
	 */
	public int getNoOfSeats() {
		return noOfSeats;
	}
	/**
	 * @param noOfSeats the noOfSeats to set
	 */
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	/**
	 * @return the fare
	 */
	public double getFare() {
		return fare;
	}
	/**
	 * @param fare the fare to set
	 */
	public void setFare(double fare) {
		this.fare = fare;
	}
	/**
	 * @return the boardingId
	 */
	public int getBoardingId() {
		return boardingId;
	}
	/**
	 * @param boardingId the boardingId to set
	 */
	public void setBoardingId(int boardingId) {
		this.boardingId = boardingId;
	}
	@Override
	public String toString() {
		return "ModifyServiceModel [busNo=" + busNo + ", busName=" + busName + ", busType=" + busType + ", noOfSeats="
				+ noOfSeats + ", fare=" + fare + ", boardingId=" + boardingId + "]";
	}
}
