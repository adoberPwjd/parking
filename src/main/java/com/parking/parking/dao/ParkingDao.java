package com.parking.parking.dao;

import java.util.List;

import com.parking.common.domain.Parking;

public interface ParkingDao {
	
	// 전체 주차목록 출력
	List<Parking> parkingList(Parking parking);

}
