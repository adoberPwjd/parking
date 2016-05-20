<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h3>Index</h3>
<c:choose>
	<c:when test="${sessionScope.sid==null }">
		<input type="button" onclick="location.href='/parking/login/login'"	value="로그인">
	</c:when>
	<c:otherwise>
		${sid }님 환영합니다.<br>
		<input type="button" onclick="location.href='/parking/textToDB/textToDB?selectedFileName=build_gyunggi.txt'" value="textToDB(경기)"><br>
		<input type="button" onclick="location.href='/parking/parking/parking'" value="주차장"><br>
		<input type="button" onclick="location.href='/parking/login/logout'" value="로그아웃"><br>
	</c:otherwise>
</c:choose>