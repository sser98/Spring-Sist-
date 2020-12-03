<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<% String ctxPath = request.getContextPath(); %>
    
<style type="text/css">
	table, th, td {border: solid 1px gray;}

    #table {width: 970px; border-collapse: collapse;}
    #table th, #table td {padding: 5px;}
    #table th {background-color: #DDD;}
     
    .subjectStyle {font-weight: bold;
                   color: navy;
                   cursor: pointer;} 
</style>

<script type="text/javascript">

	$(document).ready(function(){
		
		$("span.subject").bind("mouseover", function(event){
			var $target = $(event.target);
			$target.addClass("subjectStyle");
		});
		
		$("span.subject").bind("mouseout", function(event){
			var $target = $(event.target);
			$target.removeClass("subjectStyle");
		});
		
		$("input#searchWord").keyup(function(event){
			if(event.keyCode == 13) {
				// 엔터를 했을 경우 
				goSearch();
			}
		});
		
		
		<%-- === #107. 검색어 입력시 자동글 완성하기 2 === --%>
		$("div#displayList").hide();
		
		$("input#searchWord").keyup(function(){
			
			var wordLength = $(this).val().length;
			// 검색어의 길이를 알아온다.
			
			if(wordLength == 0) {
				$("div#displayList").hide();
				// 검색어 입력후 백스페이스키를 눌러서 검색어를 모두 지우면 검색된 내용이 안 나오도록 해야 한다.
			}
			else {
				$.ajax({
					url:"<%= request.getContextPath()%>/wordSearchShow.action", 
					type:"GET",
					data:{"searchType":$("select#searchType").val()
						 ,"searchWord":$("input#searchWord").val()},
					dataType:"JSON",
					success:function(json){
						<%-- === #112. 검색어 입력시 자동글 완성하기 7 === --%>
						if(json.length > 0) {
							// 검색된 데이터가 있는 경우임.
							
							var html = "";
							
							$.each(json, function(index, item){
								var word = item.word;
								// word ==> 프로그램은 JAVA 가 쉬운가요?
								
								var index = word.toLowerCase().indexOf($("input#searchWord").val().toLowerCase()); 
								//          프로그램은 java 가 쉬운가요?
								// 검색어(JAVA)가 나오는 index   6 
								
								var len = $("input#searchWord").val().length;
								//  len = 4
										
							//	console.log(word.substr(0, index));   // 검색어 앞까지의 글자  "프로그램은 "
							//	console.log(word.substr(index, len)); // 검색어 글자     "JAVA"
							//	console.log(word.substr(index+len));  // 검색어 뒤부터 끝까지의 글자    " 가 쉬운가요?"
								
								var result = "<span style='color:blue;'>"+word.substr(0, index)+"</span><span style='color:red;'>"+word.substr(index, len)+"</span><span style='color:blue;'>"+word.substr(index+len)+"</span>";
										
								html += "<span style='cursor:pointer;' class='result'>"+result+"</span><br>";
							});
							
							$("div#displayList").html(html);
							$("div#displayList").show();
						}
					},
					error: function(request, status, error){
						alert("code: "+request.status+"\n"+"message: "+request.responseText+"\n"+"error: "+error);
				 	}
				});
			}
			
		});// end of $("input#searchWord").keyup()-----------------
		
		
		<%-- === #113. 검색어 입력시 자동글 완성하기 8 === --%>
		$(document).on("click",".result",function(){
			var word = $(this).text();
			$("input#searchWord").val(word); // 텍스트박스에 검색된 결과의 문자열을 입력해준다.
			$("div#displayList").hide();
			goSearch();
		});
		
		
		// 검색시 검색조건 및 검색어 값 유지시키기
		if( ${not empty paraMap} ) {  // 또는 if( ${paraMap != null} ) { 
			$("select#searchType").val("${paraMap.searchType}");
			$("input#searchWord").val("${paraMap.searchWord}");
		}
		
	});// end of $(document).ready(function(){})-------------------
 	 	 
	
	function goView(seq,fk_userid) {
		location.href="<%= ctxPath%>/view.action?seq="+seq; 
	}// end of function goView(seq){}----------------------------------------------
	
	
	function goSearch() {
		var frm = document.searchFrm;
		frm.method = "GET";
		frm.action = "<%= request.getContextPath()%>/list.action";
		frm.submit();
	}// end of function goSearch() {}-----------------------
	
</script>
	
<div style="padding-left: 3%;">
	<h2 style="margin-bottom: 30px;">글목록</h2>
	
	<table id="table">
		<tr>
			<th style="width: 70px;  text-align: center;">글번호</th>
			<th style="width: 360px; text-align: center;">제목</th>
			<th style="width: 70px;  text-align: center;">성명</th>
			<th style="width: 150px; text-align: center;">날짜</th>
			<th style="width: 70px;  text-align: center;">조회수</th>
		</tr>	
		<c:forEach var="boardvo" items="${boardList}" varStatus="status">
			<tr>
				<td align="center">
					${boardvo.seq} 
				</td>
				<td align="left">
				   <%--  === 댓글쓰기가 없는 게시판 ===
				   <span class="subject" onclick="goView('${boardvo.seq}')">${boardvo.subject}</span>
				   --%>
				   
				   <%--  === 댓글쓰기가 있는 게시판 === --%>
				   <c:if test="${boardvo.commentCount > 0}">
				   <span class="subject" onclick="goView('${boardvo.seq}')">${boardvo.subject} <span style="vertical-align: super;">[<span style="color: red; font-size: 9pt; font-style: italic; font-weight: bold;">${boardvo.commentCount}</span>]</span> </span> 
				   </c:if>
				   
				   <c:if test="${boardvo.commentCount == 0}">
				   <span class="subject" onclick="goView('${boardvo.seq}')">${boardvo.subject}</span>  
				   </c:if>
				</td>
				<td align="center">${boardvo.name}</td>
				<td align="center">${boardvo.regDate}</td>
				<td align="center">${boardvo.readCount}</td>
            </tr>
		</c:forEach>
	</table>
	
	<%-- === #122. 페이지바 보여주기 === --%>
	
	
	<%-- === #101. 글검색 폼 추가하기 : 글제목, 글쓴이로 검색을 하도록 한다. === --%>
	<form name="searchFrm" style="margin-top: 20px;">
		<select name="searchType" id="searchType" style="height: 26px;">
			<option value="subject">글제목</option>
			<option value="name">글쓴이</option>
		</select>
		<input type="text" name="searchWord" id="searchWord" size="40" autocomplete="off" /> 
		<button type="button" onclick="goSearch()">검색</button>
	</form>
	
	
	<%-- === #106. 검색어 입력시 자동글 완성하기 1 === --%>
	<div id="displayList" style="border:solid 1px gray; border-top:0px; width:326px; height:100px; margin-left:70px; margin-top:-1px; overflow:auto;">
	</div>
	
</div>
    
    
    
    
    
    