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
	
}
