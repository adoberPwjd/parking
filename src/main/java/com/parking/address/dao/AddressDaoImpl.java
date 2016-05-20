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

}
