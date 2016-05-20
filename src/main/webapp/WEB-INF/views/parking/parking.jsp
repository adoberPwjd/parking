<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script src="http://code.jquery.com/jquery-2.1.4.min.js"></script>
<h3>주차장</h3>

<select id="selecter" name="selecter" onchange="selectAddress2()">
	<option value="">선택</option>
	<option value="경기도">경기도</option>
	<option value="서울시">서울시</option>
</select>

<div id=selectAddress3></div>

<script>
function selectAddress2(){
	$.ajax({
		url:"/parking/parking/selectAddress2",
		method:"GET",
		data: {
			address2: $("#selecter :selected").val()
		},
		success: function(result){
			$("#selectAddress3").html("<select id='selecter2' name='selecter2' onchange='selectAddress3()'>");

			for(var i=0; i<result.length; i++){
				$("#selecter2").append("<option value=''>"+result[i].address3+"</option>");
				
			}
			$("#selecter2").append("</select>");
		}
	});
};

</script>



