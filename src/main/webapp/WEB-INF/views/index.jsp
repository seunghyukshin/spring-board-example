<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<c:set var="root" value="${pageContext.request.contextPath}" />
<html>
<head>
<title>MyBoard</title>
</head>
<body>
	<div align="center">
		<a href="${root}/hello.do?name=Spring"> Main </a> <br>
	</div>
</body>
</html>
