package com.parking.textToDB.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.parking.common.domain.Address;
import com.parking.textToDB.dao.mapper.TextToDBMapper;

@Repository
public class TextToDBDaoImpl implements TextToDBDao{
	@Autowired private TextToDBMapper textToDBMapper;
	
	@Override
	public int textToDBInsert(Address address) {
		return textToDBMapper.textToDBInsert(address);
	}

}
