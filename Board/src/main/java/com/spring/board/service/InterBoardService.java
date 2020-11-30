package com.spring.board.service;

import java.util.List;
import java.util.Map;

import com.spring.board.model.BoardVO;
import com.spring.board.model.CommentVO;
import com.spring.board.model.MemberVO;
import com.spring.board.model.TestVO;

public interface InterBoardService {

	int test_insert(); // model단(BoardDAO)에 존재하는 메소드( test_insert() )를 호출 한다.   

	List<TestVO> test_select(); // model단(BoardDAO)에 존재하는 메소드( test_select() )를 호출 한다.

	int test_insert(Map<String, String> paraMap); // model단(BoardDAO)에 존재하는 메소드( test_insert(Map<String, String> paraMap) )를 호출 한다.   

	int test_insert(TestVO vo); // model단(BoardDAO)에 존재하는 메소드( test_insert(TestVO vo) )를 호출 한다. 

	List<Map<String, String>> test_employees(); // model단(BoardDAO)에 존재하는 메소드( test_employees() )를 호출 한다. 
	
	/////////////////////////////////////////////////////////
	
	// 시작페이지에서 메인 이미지를 보여주는 것 
	List<String> getImgfilenameList();

	// 로그인 처리하기
	MemberVO getLoginMember(Map<String, String> paraMap);

	// 글쓰기(파일첨부가 없는 글쓰기)
	int add(BoardVO boardvo);

	// == 페이징 처리를 안한 검색어가 없는 전체 글목록 보여주기 == //
	List<BoardVO> boardListNoSearch();

	// 글1개를 보여주기 
	BoardVO getView(String seq, String login_userid);
	
	// 글 조회수 증가는 없고 단순히 글 1개만 보여주어야 한다.
	BoardVO getViewWithNoAddCount(String seq);
	
	// 1개 글 수정하기
	int edit(BoardVO boardvo);
	
	// 1개 글 삭제하기
	int del(Map<String, String> paraMap);
	
	// 댓글쓰기 (transaction 처리)
	int addComment(CommentVO commentvo) throws Throwable;
	
	
	
	

	
	
	
	
	
}






