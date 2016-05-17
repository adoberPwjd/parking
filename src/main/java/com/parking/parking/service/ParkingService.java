package com.parking.parking.service;

import java.util.List;

import com.parking.common.domain.Parking;

public interface ParkingService {
	
	// 전체 주차목록 출력
	List<Parking> parkingList(Parking parking);

}
