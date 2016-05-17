package com.parking.textToDB.dao.mapper;

import com.parking.common.domain.Address;

public interface TextToDBMapper {
	
	//DB관련 텍스트를 DB에 추가
	int textToDBInsert(Address address);
}
