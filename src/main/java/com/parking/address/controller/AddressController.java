package com.parking.address.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.parking.address.service.AddressService;
import com.parking.common.domain.Address;

@Controller
@RequestMapping("/address")
public class AddressController {
	@Autowired private AddressService addressService;
	
	@RequestMapping("/selectAddress2")
	@ResponseBody
	public List<Address> selelctAddress2(String address2){
		System.out.println(address2);
		return addressService.selectAddress2(address2);
		
	}
	
	
	@RequestMapping("/selectAddress3")
	@ResponseBody
	public List<Address> selelctAddress3(String address3){
		System.out.println(address3);
		return addressService.selectAddress3(address3);
		
	}
	
	@RequestMapping("/selectAddress16")
	@ResponseBody
	public List<Address> selectAddress16(String address2, String address3, String address4){
		System.out.println(address2);
		System.out.println(address3);
		System.out.println(address4);
		return addressService.selectAddress16(address2, address3, address4);
		
	}
	
}
