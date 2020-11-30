package com.spring.board.common;

import javax.servlet.http.HttpServletRequest;

public class MyUtil {

	// *** ? 다음의 데이터까지 포함한 현재 URL 주소를 알려주는 메소드를 생성 *** //
	public static String getCurrentURL(HttpServletRequest request) {
		
		String currentURL = request.getRequestURL().toString();
		// http://localhost:9090/MyMVC/member/memberList.up
		
		String queryString = request.getQueryString();
		// currentShowPageNo=15&sizePerPage=5&searchType=name&searchWord=홍승의 
		
		if(queryString != null) {
			currentURL += "?" + queryString;
		 // http://localhost:9090/MyMVC/member/memberList.up?currentShowPageNo=15&sizePerPage=5&searchType=name&searchWord=홍승의 
		}
		
		
		String ctxPath = request.getContextPath();
		//     /MyMVC
		
		int beginIndex = currentURL.indexOf(ctxPath) + ctxPath.length();
		//   27        =           21                +        6
		
		currentURL = currentURL.substring(beginIndex + 1);
		//           member/memberList.up?currentShowPageNo=15&sizePerPage=5&searchType=name&searchWord=홍승의 
		
		return currentURL;
	}
	
	
	// **** 크로스 사이트 스크립트 공격에 대응하는 안전한 코드(시큐어 코드) 작성하기 **** // 
	public static String secureCode(String str) {
		
		str = str.replaceAll("<", "&lt;");
		str = str.replaceAll(">", "&gt;");
		
		return str;
	}
	
	
	
	
	
	
	
	
}
