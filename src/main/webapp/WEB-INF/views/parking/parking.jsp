<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="http://code.jquery.com/jquery-2.1.4.min.js"></script>    
<h3>주차장</h3>
<table id='parkingTable' ></table>


<script>
function parkingList(){
	$.ajax({
		url:"/parking/parking/parkingList",
		method: "GET",
		success: function(result){

			
			for(var i=0; i<result.length; i++){
				$("#parkingTable").append(
						"<tr>"
						+"<td>"+result[i].parkingNo+"</td>"
						+"<td>"+result[i].userId+"</td>"
						+"<td>"+result[i].address16+"</td>"
						+"<tr>"
				
				);
			}
			
		}
	})
}
$(document).ready(function(){
	parkingList();
})

</script>  