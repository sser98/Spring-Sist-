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

<style type="text/css">

	table, th, td {
		border: solid 1px gray;
		border-collapse: collapse;
	}

</style>

<script type="text/javascript" src="<%= ctxPath%>/resources/js/jquery-3.3.1.min.js"></script>       
<script type="text/javascript">
	$(document).ready(function(){
		
		func_ajaxselect();
		
		$("button#btnOK").click(function(){
			var noVal = $("input#no").val();
			var nameVal = $("input#name").val();
			
			if( noVal.trim() == "" || nameVal.trim() == "" ) {
				alert("번호와 성명 모두 입력하세요!!");
				return; // 종료
			}
			
			$.ajax({
				url:"/board/test/ajax_insert.action",
				type:"post",
				data:{"no":$("input#no").val(), 
					  "name":$("input#name").val()},
				dataType:"json",
				success:function(json){  //  {"n":1}
					if(json.n == 1) {
						func_ajaxselect();
					}
				},
				error: function(request, status, error){
					alert("code: "+request.status+"\n"+"message: "+request.responseText+"\n"+"error: "+error);
			 	}
			});
			
		});
		
	}); // end of $(document).ready()-----------------------
	
	
	function func_ajaxselect() {
		
		$.ajax({
			url:"/board/test/ajax_select.action",
			dataType:"json",
			success:function(json){
				var html = "<table>" + 
				              "<tr>" + 
				                "<th>번호</th>" +
				                "<th>입력번호</th>" +
				                "<th>성명</th>" +
				                "<th>작성일자</th>" +
				              "</tr>";
				              
				$.each(json, function(index, item){
					html += "<tr>"+
					          "<td>"+(index+1)+"</td>"+
					          "<td>"+ item.no +"</td>"+
					          "<td>"+ item.name +"</td>"+
					          "<td>"+ item.writeday +"</td>"+
					        "</tr>";
				});              
				
				html += "</table>";
				
				$("div#view").html(html);
			},
			error: function(request, status, error){
				alert("code: "+request.status+"\n"+"message: "+request.responseText+"\n"+"error: "+error);
		 	}
		});
		
	}// end of function func_ajaxselect()-------------------
	
</script>
</head>
<body>

	<h2>Ajax 연습</h2>
	<p>
		안녕하세요? <br>
		여기는 /board/test/test_form3.action 페이지 입니다.
	</p>
		번호 : <input type="text" id="no" /><br>
		이름 : <input type="text" id="name" /><br>
	    <button type="button" id="btnOK">확인</button> 
	    <button type="reset"  id="btnCancel">취소</button>
	<br><br>
	
	<div id="view"></div>

</body>
</html>