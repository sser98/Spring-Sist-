<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String ctxPath = request.getContextPath();
    //     /board 
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript" src="<%= ctxPath%>/resources/js/jquery-3.3.1.min.js"></script>       
<script type="text/javascript">
	$(document).ready(function(){
		
		$("form[name=testFrm]").submit(function(){
			var noVal = $("input[name=no]").val();
			var nameVal = $("input[name=name]").val();
			
			if( noVal.trim() == "" || nameVal.trim() == "" ) {
				alert("번호와 성명 모두 입력하세요!!");
				return false; // 전송을 하지말라는 뜻이다.
			}
		});
		
	});
</script>
</head>
<body>

	<form name="testFrm" action="<%= ctxPath%>/test/test_form.action" method="POST">
		번호 : <input type="text" name="no" /><br>
		성명 : <input type="text" name="name" /><br>
	    <input type="submit" value="확인" />
	    <input type="reset"  value="취소" /> 
	</form>

</body>
</html>