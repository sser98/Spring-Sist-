<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%-- ======= #28. tile2 중 header 페이지 만들기  ======= --%>
<%
	String ctxPath = request.getContextPath();
%>

<div align="center">
	<ul class="nav nav-tabs mynav">
		<li class="dropdown"><a class="dropdown-toggle"
			data-toggle="dropdown" href="#">Home <span class="caret"></span></a>
			<ul class="dropdown-menu">
				<li><a href="<%=ctxPath%>/index.action">Home</a></li>
				<li><a href="#">Submenu 1-2</a></li>
				<li><a href="#">Submenu 1-3</a></li>
			</ul>
		</li>
			
		<li class="dropdown"><a class="dropdown-toggle"
			data-toggle="dropdown" href="#">인사관리 <span class="caret"></span></a>
			<ul class="dropdown-menu">
				<li><a href="<%=ctxPath%>/emp/empList.action">직원목록</a></li>
				<li><a href="<%=ctxPath%>/emp/chart.action">통계차트</a></li>
			</ul>
		</li>	
			
		<li class="dropdown"><a class="dropdown-toggle"
			data-toggle="dropdown" href="#">주문 <span class="caret"></span></a>
			<ul class="dropdown-menu">
				<li><a href="#">주문하기</a></li>
				<li><a href="#">Submenu 1-2</a></li>
				<li><a href="#">Submenu 1-3</a></li>
			</ul>
		</li>
		<li><a href="#">Menu two</a></li>
		<li><a href="#">Menu three</a></li>
	
	<!-- === #49. 로그인이 성공되어지면 로그인되어진 사용자의 이메일 주소를 출력하기 === -->
	<c:if test="${sessionScope.loginuser != null}">
		<div style="float: right; margin-top: 0.5%; border: solid 0px red;">
		  <span style="color: navy; font-weight: bold; font-size: 10pt;">${sessionScope.loginuser.email}</span> 님 로그인중.. 
		</div>
	</c:if>
	
	</ul>
</div>
	
	