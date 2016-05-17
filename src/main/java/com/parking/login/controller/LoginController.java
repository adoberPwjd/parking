package com.parking.login.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.parking.common.domain.User;
import com.parking.login.service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {
	@Autowired private LoginService loginService;
	
	//로그인 페이지로 이동
	@RequestMapping("/login")
	public String loginMove(){
		return "login/login";
	}
	
	//로그인체크
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String getUser(User user,String userId, String userPw, HttpSession session, Model model){
		user.setUserId(userId);
		user.setUserPw(userPw);
		user = loginService.getUser(user);
		
		if(user == null){
			model.addAttribute("msg", "잘못 입력하셨습니다.");
			return "login/login";
		}
		
		session.setAttribute("sid", user.getUserId());
		model.addAttribute("user", user);
		return "index";
		
	}
	
	//로그아웃
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String logout(HttpSession session){
		session.invalidate();
		return "index";
	}

}
