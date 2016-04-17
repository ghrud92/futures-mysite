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
<title>즐거운 점심</title>
<link
	href="${pageContext.request.contextPath }/assest/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath }/assest/css/main.css"
	media="all" type="text/css" rel="stylesheet">
<!-- IE8 에서 HTML5 요소와 미디어 쿼리를 위한 HTML5 shim 와 Respond.js -->
<!-- WARNING: Respond.js 는 당신이 file:// 을 통해 페이지를 볼 때는 동작하지 않습니다. -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
	<div id="container">
		<c:import url="/WEB-INF/views/include/navigation.jsp"></c:import>
		<div class="row">
		<div class="col-xs-12">
		<ul id="scroller" class="img-responsibe">
			<li><img src="https://drive.google.com/thumbnail?id=0B_yJXWt77MRySy11SjM3VS1odlE&authuser=0&v=1459213143546&sz=w1634-h1238" alt="" /></li>
			<li class="small"><img src="https://drive.google.com/thumbnail?id=0B_yJXWt77MRyVS1oSjNhMHhPNWs&authuser=0&v=1458259931030&sz=w1634-h1238" alt="" /></li>
			<li class="squere"><img src="https://drive.google.com/thumbnail?id=0B_yJXWt77MRyOFJPX3ZsQnBMUXc&authuser=0&v=1458605165842&sz=w1634-h1238" alt="" /></li>
			<li class="verysmall"><img alt="" src="https://drive.google.com/thumbnail?id=0B_yJXWt77MRySVZqZ2hONzBLSHM&authuser=0&v=1458259940512&sz=w1634-h1238"></li>
			<li class="small"><img alt="" src="https://drive.google.com/thumbnail?id=0B_yJXWt77MRyQWxEanpWQld0NVE&authuser=0&v=1458259943869&sz=w1634-h1238"></li>
			<li class="squere"><img alt="" src="https://drive.google.com/thumbnail?id=0BxRvw_gSaJQlWlBFbmF3OEdwVEU&authuser=0&v=1457431591450&sz=w1634-h1238"></li>
		</ul>
		</div>
		</div>
		<div class="row">
			<div class="col-md-12 text-center">
				<h1>
					<small><del>퓨처스 지옥 번개</del></small>
				</h1>
			</div>
		</div>
	</div>

	<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<!-- 모든 컴파일된 플러그인을 포함합니다 (아래), 원하지 않는다면 필요한 각각의 파일을 포함하세요 -->
	<script
		src="${pageContext.request.contextPath }/assest/js/jquery.simplyscroll.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/assest/js/bootstrap.min.js"></script>
	<script type="text/javascript">
		$(function() {
			$("#scroller").simplyScroll();
		});
	</script>
</body>
</html>