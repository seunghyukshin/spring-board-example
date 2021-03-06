<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<c:set var="root" value="${pageContext.request.contextPath}" />
<html>
<head>
<title>MyBoard</title>
</head>
<body>

	<c:if test="${cookie.ssafy_id.value ne null}">
		<c:set var="saveid" value="${cookie.ssafy_id.value}" />
		<c:set var="idck" value=" checked=\"checked\"" />
	</c:if>
	<script type="text/javascript">
		function login() {
			if (document.getElementById("userid").value == "") {
				alert("아이디 입력!!!");
				return;
			} else if (document.getElementById("userpwd").value == "") {
				alert("비밀번호 입력!!!");
				return;
			} else {
				document.getElementById("loginform").action = "${root}/user/login";
				document.getElementById("loginform").submit();
			}
		}

	</script>

	<div class="container" align="center">
		<h3>로그인</h3>
		<div class="col-lg-6" align="center">
			<form id="loginform" method="post" action="">
				<div class="form-group" align="left">
					<label for="">아이디</label> <input type="text" class="form-control"
						id="userid" name="userid" placeholder="" value="${saveid}">
				</div>
				<div class="form-group" align="left">
					<label for="">비밀번호</label> <input type="password"
						class="form-control" id="userpwd" name="userpwd" placeholder=""
						onkeydown="javascript:if(event.keyCode == 13) {login();}">
				</div>
				<div class="form-group form-check" align="right">
					<label class="form-check-label"> <input
						class="form-check-input" type="checkbox" id="idsave" name="idsave"
						value="saveok" ${idck}> 아이디저장
					</label>
				</div>
				<div class="form-group" align="center">
					<button type="button" class="btn btn-warning"
						onclick="javascript:login();">로그인</button>
					<button type="button" class="btn btn-primary"
						onclick="javascript:moveJoin();">회원가입</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>
