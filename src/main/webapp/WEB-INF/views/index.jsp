<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<c:set var="root" value="${pageContext.request.contextPath}" />
<html>
<head>
<title>MyBoard</title>
</head>
<body>
	<div align="center">
		<c:if test="${userinfo == null}">
			<h3>${msg}</h3>
			<%@ include file="/WEB-INF/views/user/login.jsp"%>
		</c:if>
		<c:if test="${userinfo != null}">
			<div>
				<strong>${userinfo.username}</strong>님 환영합니다.
			</div>
		</c:if>
	</div>
</body>
</html>
