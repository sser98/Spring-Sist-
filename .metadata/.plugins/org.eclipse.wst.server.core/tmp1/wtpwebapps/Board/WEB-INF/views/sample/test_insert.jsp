<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/board/test/test_insert.action 페이지</title>
</head>
<body>
  <h2>/board/test/test_insert.action 페이지</h2>
    안녕하세요?<br><br>
   
  <c:if test="${n eq 1}">
  	<span style="color: blue; font-size: 16pt;">${message}</span>
  </c:if>  
  
  <c:if test="${n ne 1}">
  	<span style="color: red; font-size: 16pt;">${message}</span>
  </c:if>
    
</body>
</html>