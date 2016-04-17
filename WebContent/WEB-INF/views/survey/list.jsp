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
<title>맛집 리스트</title>
<link
	href="${pageContext.request.contextPath }/assest/css/bootstrap.min.css"
	rel="stylesheet">

<link href="${pageContext.request.contextPath }/assest/css/survey.css"
	rel="stylesheet">

<!-- IE8 에서 HTML5 요소와 미디어 쿼리를 위한 HTML5 shim 와 Respond.js -->
<!-- WARNING: Respond.js 는 당신이 file:// 을 통해 페이지를 볼 때는 동작하지 않습니다. -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
	<!-- Page Content -->
	<div class="container">

		<div class="row">
			<c:import url="/WEB-INF/views/include/navigation.jsp"></c:import>
		</div>

		<!-- Page Header -->
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">
					강남역 맛집 리스트<small> 맛난거 먹고 싶다..</small>
				</h1>
			</div>
		</div>
		<!-- /.row -->

		<!-- Projects Row -->
		<c:set var="start" value="<div class='row'>"></c:set>
		<c:set var="end" value="</div>"></c:set>
		<c:forEach items="${list }" var="vo" varStatus="status">
			<c:if test="${status.index%3 ==0 }">
				${start }
			</c:if>
			<div class="col-md-4 restaurant">
				<a href="${pageContext.request.contextPath }/survey?a=restaurant&no=${vo.no}"> <img class="img-responsive"
					src="${vo.img }"
					alt="">
				</a>
				<h3>
					<a href="${pageContext.request.contextPath }/survey?a=restaurant&no=${vo.no}">${vo.name }</a>
				</h3>
			</div>
			<c:if test="${(status.index%3 == 2) || (fn:length(list) == status.index + 1) }">
				${end }
			</c:if>
		</c:forEach>
		
		<hr>

		<!-- Pagination -->
		<!-- <div class="row text-center">
			<div class="col-lg-12">
				<ul class="pagination">
					<li><a href="#">&laquo;</a></li>
					<li class="active"><a href="#">1</a></li>
					<li><a href="#">2</a></li>
					<li><a href="#">3</a></li>
					<li><a href="#">4</a></li>
					<li><a href="#">5</a></li>
					<li><a href="#">&raquo;</a></li>
				</ul>
			</div>
		</div> -->
		<!-- /.row -->

	</div>


	<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<!-- 모든 컴파일된 플러그인을 포함합니다 (아래), 원하지 않는다면 필요한 각각의 파일을 포함하세요 -->
	<script
		src="${pageContext.request.contextPath }/assest/js/bootstrap.min.js"></script>
</body>
</html>