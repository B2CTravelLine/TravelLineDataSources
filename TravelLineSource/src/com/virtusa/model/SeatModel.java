package com.virtusa.model;

public class SeatModel{

	private int SeatNo;
	private String SeatType;
	public int getSeatNo() {
		return SeatNo;
	}
	public void setSeatNo(int seatNo) {
		SeatNo = seatNo;
	}
	public String getSeatType() {
		return SeatType;
	}
	public void setSeatType(String seatType) {
		SeatType = seatType;
	}
	@Override
	public String toString() {
		return "SeatModel [SeatNo=" + SeatNo + ", SeatType=" + SeatType + "]";
	}
	
}
