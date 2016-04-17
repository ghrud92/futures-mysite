<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/assest/css/user.css" />
<title>Insert title here</title>
<link href="assest/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<c:import url="/WEB-INF/views/include/navigation.jsp"></c:import>
		<div class="row">
			<div class="col-sm-6 col-md-4 col-md-offset-4">
				<div class="account-wall">
					<c:if test="${param.result == 'f' }">
						<p class="text-center">이메일과 비밀번호를 확인하여 주십시요.</p>
					</c:if>
					<form class="form-signin" method="post" action="${pageContext.request.contextPath }/user">
						<input type="hidden" name="a" value="login">
						<input type="text" name="email" class="form-control" placeholder="Email" required autofocus>
						<input type="password" name="password" class="form-control" placeholder="Password" required>
						<button class="btn btn-lg btn-primary btn-block" id="mybtn" type="submit">로그인</button>
						<label class="checkbox pull-left"> <input type="checkbox" value="remember-me"> Remember me
						</label><span class="clearfix"></span>
					</form>
				</div>
			</div>
		</div>
	</div>

	<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<!-- 모든 컴파일된 플러그인을 포함합니다 (아래), 원하지 않는다면 필요한 각각의 파일을 포함하세요 -->
	<script src="assest/js/bootstrap.min.js"></script>
</body>
</html>