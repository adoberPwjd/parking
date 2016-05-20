package com.parking.address.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.parking.address.dao.mapper.AddressMapper;
import com.parking.common.domain.Address;

@Repository
public class AddressDaoImpl implements AddressDao{
	@Autowired private AddressMapper addressMapper;

	@Override
	public List<Address> selectAddress2(String address2) {
		return addressMapper.selectAddress2(address2);
	}

	@Override
	public List<Address> selectAddress3(String address3) {
		// TODO Auto-generated method stub
		return addressMapper.selectAddress3(address3);
	}

	@Override
	public List<Address> selectAddress16(String address2, String address3,
			String address4) {
		// TODO Auto-generated method stub
		return addressMapper.selectAddress16(address2, address3, address4);
	}

}
