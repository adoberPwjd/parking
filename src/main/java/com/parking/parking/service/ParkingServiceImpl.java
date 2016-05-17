package com.parking.parking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parking.common.domain.Parking;
import com.parking.parking.dao.ParkingDao;

@Service
public class ParkingServiceImpl implements ParkingService{
	@Autowired private ParkingDao parkingDao;
	
	@Override
	public List<Parking> parkingList(Parking parking) {
		return parkingDao.parkingList(parking);
	}

}
