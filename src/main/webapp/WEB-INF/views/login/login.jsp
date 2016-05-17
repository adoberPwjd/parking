<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<h3>Login</h3>
<form method="post">
아이디<input type="text" name="userId">
비밀번호<input type="password" name="userPw">
<input type="submit" value="로그인">
</form>
<c:choose>
	<c:when test="${msg==null }">
	</c:when>
	<c:otherwise>
		<script>
		alert("${msg }");
		</script>
	</c:otherwise>
</c:choose>