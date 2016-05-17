package com.parking.textToDB.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parking.common.domain.Address;
import com.parking.textToDB.dao.TextToDBDao;

@Service
public class TextToDBServiceImpl implements TextToDBService{
	@Autowired private TextToDBDao textToDao;
	
	@Override
	public int textToDBInsert(Address address) {
		return textToDao.textToDBInsert(address);
	}

}
