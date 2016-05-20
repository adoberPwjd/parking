package com.parking.address.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.parking.common.domain.Address;

public interface AddressMapper {
	
	List<Address> selectAddress2(@Param("address2")String address2);

}
