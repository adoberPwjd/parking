package com.parking.textToDB.controller;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.parking.common.domain.Address;
import com.parking.textToDB.service.TextToDBService;

@Controller
@RequestMapping("/textToDB")
public class TextToDBController {
	@Autowired private TextToDBService textToDBService;
	
	@RequestMapping("/textToDB")
	@ResponseBody
	public int textToDBInsert(Address address, String selectedFileName){
		int result = 0;

		String file = "D:\\parking/도로명주소/2_도로명주소DB자료/201604전체주소(전체분)/"+selectedFileName;
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(
					new InputStreamReader(new FileInputStream(file),"euc-kr")
					);
			String data ="";
			while ((data=br.readLine()) != null ){			
				String source = data;
				String[] txtArr = source.split("\\|") ;
					address.setAddress1(txtArr[0]);
					address.setAddress2(txtArr[1]);
					address.setAddress3(txtArr[2]);
					address.setAddress4(txtArr[3]);
					address.setAddress5(txtArr[4]);
					address.setAddress6(txtArr[5]);
					address.setAddress7(Integer.parseInt(txtArr[6]));
					address.setAddress8(Integer.parseInt(txtArr[7]));
					address.setAddress9(txtArr[8]);
					address.setAddress10(txtArr[9]);
					address.setAddress11(txtArr[10]);
					address.setAddress12(Integer.parseInt(txtArr[11]));
					address.setAddress13(Integer.parseInt(txtArr[12]));
					address.setAddress14(txtArr[13]);
					address.setAddress15(txtArr[14]);
					address.setAddress16(txtArr[15]);
					address.setAddress17(txtArr[16]);
					address.setAddress18(txtArr[17]);
					address.setAddress19(txtArr[18]);
					address.setAddress20(txtArr[19]);
					address.setAddress21(txtArr[20]);
					address.setAddress22(txtArr[21]);
					address.setAddress23(txtArr[22]);
					address.setAddress24(txtArr[23]);
					address.setAddress25(txtArr[24]);
					address.setAddress26(txtArr[25]);
					address.setAddress27(txtArr[26]);
					address.setAddress28(txtArr[27]);
					address.setAddress29(txtArr[28]);
					result = textToDBService.textToDBInsert(address);
			}
			br.close();
			fr.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	
		
		return result;
		
	}
	

}
