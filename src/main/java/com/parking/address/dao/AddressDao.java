package com.parking.address.dao;

import java.util.List;

import com.parking.common.domain.Address;

public interface AddressDao {
	
	List<Address> selectAddress2(String address2);

}
