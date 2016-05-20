package com.parking.address.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parking.address.dao.AddressDao;
import com.parking.common.domain.Address;

@Service
public class AddressServiceImpl implements AddressService{
	@Autowired private AddressDao addressDao;

	@Override
	public List<Address> selectAddress2(String address2) {
		return addressDao.selectAddress2(address2);
	}
}
