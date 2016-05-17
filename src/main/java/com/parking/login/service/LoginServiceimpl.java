package com.parking.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parking.common.domain.User;
import com.parking.login.dao.LoginDao;

@Service
public class LoginServiceimpl implements LoginService{
	@Autowired private LoginDao loginDao;

	@Override
	public User getUser(User user) {

		return loginDao.getUser(user);
	}
}
