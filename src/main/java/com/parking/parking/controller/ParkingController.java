package com.parking.parking.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.parking.common.domain.Parking;
import com.parking.parking.service.ParkingService;


@Controller
@RequestMapping("/parking")
public class ParkingController {
	@Autowired private ParkingService parkingService;

	//주차장 페이지로 이동
	@RequestMapping("/parking")
	public String Parking(){
		return "parking/parking";
	}
	
	@RequestMapping("/parkingList")
	public String ParkingList(HttpServletRequest request, String address2, String address3, String address4, Model model){
		address2 = request.getParameter("address2");
		address3 = request.getParameter("address3");
		address4 = request.getParameter("address4");
		model.addAttribute("address2",address2);
		model.addAttribute("address3",address3);
		model.addAttribute("address4",address4);
		
		return "parking/parkingList";
	}

	//주차장 전체 주차목록 출력
	@RequestMapping(value="/parkingList", method=RequestMethod.POST)
	@ResponseBody
	public List<Parking> parkingList(Parking parking, HttpSession session){
		parking.setUserId((String)session.getAttribute("sid"));
		return parkingService.parkingList(parking);	
	}
	
	
}
