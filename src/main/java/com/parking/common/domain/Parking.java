package com.parking.common.domain;

public class Parking {
	private int parkingNo;
	private String userId;
	private String address16;
	private int parkingMax;
	private int parkingCurrent;
	
	public int getParkingNo() {
		return parkingNo;
	}
	public void setParkingNo(int parkingNo) {
		this.parkingNo = parkingNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAddress16() {
		return address16;
	}
	public void setAddress16(String address16) {
		this.address16 = address16;
	}
	public int getParkingMax() {
		return parkingMax;
	}
	public void setParkingMax(int parkingMax) {
		this.parkingMax = parkingMax;
	}
	public int getParkingCurrent() {
		return parkingCurrent;
	}
	public void setParkingCurrent(int parkingCurrent) {
		this.parkingCurrent = parkingCurrent;
	}
	
}
