package com.parking.textToDB.service;

import com.parking.common.domain.Address;

public interface TextToDBService {
	
	//DB관련 텍스트를 DB에 추가
	int textToDBInsert(Address address);
}
