package com.parking.parking.dao.mapper;

import java.util.List;

import com.parking.common.domain.Parking;

public interface ParkingMapper {
	
	// 전체 주차목록 출력
	List<Parking> parkingList(Parking parking);

}
