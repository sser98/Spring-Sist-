<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% String ctxPath = request.getContextPath(); %>    

<style type="text/css">

   table, th, td, input, textarea {border: solid gray 1px;}
   
   #table {border-collapse: collapse;
          width: 900px;
          }
   #table th, #table td{padding: 5px;}
   #table th{width: 120px; background-color: #DDDDDD;}
   #table td{width: 860px;}
   .long {width: 470px;}
   .short {width: 120px;}

</style>


<script type="text/javascript">
   $(document).ready(function(){
      
            
	  $("button#btnDel").click(function () {
				
			// 글암호 유효성 검사		
			var pwVal = $("#pw").val().trim();
			if (pwVal == "") {
				alert("글암호를 입력하세요!!");
				return;

			}
			
			
			var frm = document.delFrm;
			frm.method ="POST";
			frm.action ="<%= ctxPath%>/delEnd.action";
			frm.submit();
			
		});

	});// end of $(document).ready(function(){})----------------
</script>

<div style="padding-left: 10%;">
   <h1>글수정</h1>

   <form name="delFrm">
      <table id="table">
			
			<tr>
            <th>글암호</th>
            <td>
               <input type="password" name="pw" id="pw" class="short" />
				<input type="none" name="seq" value="${seq}" />       
            </td>
         </tr>
      </table>
      
      <div style="margin: 20px;">
         <button type="button" id="btnDel">완료</button>
         <button type="button" onclick="javascript:history.back()">취소</button>
      </div>
         
   </form>
   
</div>
