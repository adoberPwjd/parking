<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="http://code.jquery.com/jquery-2.1.4.min.js"></script>
<h3>주차장</h3>    
    
    
    
<table id='parkingTable'></table>


<script>
	function parkingList() {
		$.ajax({
			url : "/parking/parking/parkingList",
			method : "GET",
			success : function(result) {

				for (var i = 0; i < result.length; i++) {
					$("#parkingTable").append(
							"<tr>" + "<td>" + result[i].parkingNo + "</td>"
									+ "<td>" + result[i].userId + "</td>"
									+ "<td>" + result[i].address16 + "</td>"
									+ "<tr>"

					);
				}

			}
		})
	}
	$(document).ready(function() {
		parkingList();
	})
</script>
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
