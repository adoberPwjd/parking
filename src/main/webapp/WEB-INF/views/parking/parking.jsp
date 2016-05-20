<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script src="http://code.jquery.com/jquery-2.1.4.min.js"></script>
<h3>주차장 검색</h3>

시도선택<select id="selecter" name="selecter" onchange="selectAddress2()">
	<option value="">선택</option>
	<option value="경기도">경기도</option>
	<option value="서울시">서울시</option>
</select>
<div id="selectAddress3"></div>
<div id="selectAddress4"></div>
<div id="selectAddress16"></div>
<div id="selectBtn"></div>

<script>
function selectAddress2(){
	$.ajax({
		url:"/parking/address/selectAddress2",
		method:"GET",
		data: {
			address2: $("#selecter :selected").val()
		},
		success: function(result){
			$("#selectAddress3").html("시군구선택<select id='selecter2' name='selecter2' onchange='selectAddress3()'>");
			$("#selecter2").append("<option value=''>선택</option>");
			for(var i=0; i<result.length; i++){
				$("#selecter2").append("<option value='"+result[i].address3+"'>"+result[i].address3+"</option>");
				
			}
			$("#selecter2").append("</select>");
		}
	});
};


function selectAddress3(){
	$.ajax({
		url:"/parking/address/selectAddress3",
		method:"GET",
		data: {
			address3: $("#selecter2 :selected").val()
		},
		success: function(result){
			$("#selectAddress4").html("읍면동선택<select id='selecter3' name='selecter3' onchange='selectAddress16()'>");
			$("#selecter3").append("<option value=''>선택</option>");
			for(var i=0; i<result.length; i++){
				$("#selecter3").append("<option value='"+result[i].address4+"'>"+result[i].address4+"</option>");
				
			}
			$("#selecter3").append("</select>");
			$("#selectBtn").append("<input type='button' onclick='selectBtn()' value='주차장검색'>");
		}
	});
};

function selectAddress16(){
	$.ajax({
		url:"/parking/address/selectAddress16",
		method:"GET",
		data:{
			address2: $("#selecter :selected").val(),
			address3: $("#selecter2 :selected").val(),
			address4: $("#selecter3 :selected").val()
		},
		success: function(result){
			$("#selectAddress16").html("<table id='selectAddress16Table'></table>");
			$("#selectAddress16Table").append("<tr><th>번호</th><th>주차장위치</th><th>잔여/전체공간</th><th>제보자</th></tr>");

			for(var i=0; i<result.length; i++){
				$("#selectAddress16Table").append(					
						"<tr>"
						+"<td>"+(i+1)+"</td>"
						+"<td><a href='#' onclick='selectBtn()'>"+result[i].address16+"</a></td>"
						+"<td>"+result[i].parkingCurrent +"/"+ result[i].parkingMax+"</td>"
						+"<td>"+result[i].userId+"</td>"
						+"</tr>"
						
				);
			}

		}
	})
}



function selectBtn(){
	location.href="/parking/parking/parkingList?address2="+$("#selecter :selected").val()+"&address3="+$("#selecter2 :selected").val()+"&address4="+$("#selecter3 :selected").val()+""
}





</script>



