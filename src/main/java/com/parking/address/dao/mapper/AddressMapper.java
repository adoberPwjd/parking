package com.parking.address.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.parking.common.domain.Address;

public interface AddressMapper {
	
	List<Address> selectAddress2(@Param("address2")String address2);
	List<Address> selectAddress3(@Param("address3")String address3);
	List<Address> selectAddress16(@Param("address2")String address2,@Param("address3")String address3, @Param("address4")String address4 );

}
