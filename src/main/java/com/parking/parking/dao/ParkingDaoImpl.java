package com.parking.parking.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.parking.common.domain.Parking;
import com.parking.parking.dao.mapper.ParkingMapper;

@Repository
public class ParkingDaoImpl implements ParkingDao{
	@Autowired private ParkingMapper parkingMapper;

	@Override
	public List<Parking> parkingList(Parking parking) {
		return parkingMapper.parkingList(parking);
	}

}
