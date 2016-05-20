package com.parking.parking.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.parking.common.domain.Parking;
import com.parking.parking.service.ParkingService;


@Controller
@RequestMapping("/parking")
public class ParkingController {
	@Autowired private ParkingService parkingService;

	//주차장 페이지로 이동
	@RequestMapping("/parking")
	public String ParkingMove(){
		return "parking/parking";
	}
	

	//주차장 전체 주차목록 출력
	@RequestMapping("/parkingList")
	@ResponseBody
	public List<Parking> parkingList(Parking parking, HttpSession session){
		parking.setUserId((String)session.getAttribute("sid"));
		return parkingService.parkingList(parking);	
	}
	
	
}
