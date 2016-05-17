package com.parking.login.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.parking.common.domain.User;
import com.parking.login.dao.mapper.LoginMapper;

@Repository
public class LoginDaoImpl implements LoginDao{
	@Autowired private LoginMapper loginMapper;

	@Override
	public User getUser(User user) {

		return loginMapper.getUser(user);
	}
	

}
