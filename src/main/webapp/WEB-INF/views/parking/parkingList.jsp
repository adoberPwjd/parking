<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="http://code.jquery.com/jquery-2.1.4.min.js"></script>
<h3>주차장</h3>    
  
<style>
div {
	border: 2px solid black;
	width: 50px;
	height: 15px;
	color: white;
	text-align: center;
	background-color: green;
}
</style>
<table>

	<tr>
		<td><div>1</div></td>
		<td><div>2</div></td>
		<td><div>3</div></td>
		<td><div>4</div></td>
	</tr>
	<tr>
		<td><div>5</div></td>
		<td><div>6</div></td>
		<td><div>7</div></td>
		<td><div>8</div></td>
	</tr>
	<tr>
		<td><div>9</div></td>
		<td><div>10</div></td>
		<td><div>11</div></td>
		<td><div>12</div></td>
	</tr>

	<tr>
		<td><div style='border: 2px solid orange; background: red;'>13</div></td>
	</tr>

</table>
 
<h3>다른주차장 알아보기</h3>
<p id="address"></p>  
<p id='selectAddress16'></p>







<script>

var address2 = "${address2}";
var address3 = "${address3}";
var address4 = "${address4}";
$("#address").append("검색 : "+address2+" "+address3+" "+address4);

<%--쿼리스트링방법 var address3 = "<%=request.getParameter("address3") %>"; --%>

	
	
function selectAddress16(){
	$.ajax({
		url:"/parking/address/selectAddress16",
		method:"GET",
		data:{
			address2: address2,
			address3: address3,
			address4: address4
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
	$(document).ready(function() {
		selectAddress16();
	})
	
	function selectBtn(){
	location.href="/parking/parking/parkingList?address2="+address2+"&address3="+address3+"&address4="+address4+""
}
	
</script>





