package com.spring.board.model;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//=== #32. DAO 선언 ===
@Repository 
public class BoardDAO implements InterBoardDAO {

	// === #33. 의존객체 주입하기(DI: Dependency Injection) ===
	// >>> 의존 객체 자동 주입(Automatic Dependency Injection)은
	//     스프링 컨테이너가 자동적으로 의존 대상 객체를 찾아서 해당 객체에 필요한 의존객체를 주입하는 것을 말한다. 
	//     단, 의존객체는 스프링 컨테이너속에 bean 으로 등록되어 있어야 한다. 

	//     의존 객체 자동 주입(Automatic Dependency Injection)방법 3가지 
	//     1. @Autowired ==> Spring Framework에서 지원하는 어노테이션이다. 
	//                       스프링 컨테이너에 담겨진 의존객체를 주입할때 타입을 찾아서 연결(의존객체주입)한다.
	
	//     2. @Resource  ==> Java 에서 지원하는 어노테이션이다.
	//                       스프링 컨테이너에 담겨진 의존객체를 주입할때 필드명(이름)을 찾아서 연결(의존객체주입)한다.
	
	//     3. @Inject    ==> Java 에서 지원하는 어노테이션이다.
    //                       스프링 컨테이너에 담겨진 의존객체를 주입할때 타입을 찾아서 연결(의존객체주입)한다.	
	
    /*	
	@Autowired
	private SqlSessionTemplate abc; */
	// Type 에 따라 Spring 컨테이너가 알아서 root-context.xml 에 생성된 org.mybatis.spring.SqlSessionTemplate 의 bean 을  abc 에 주입시켜준다. 
    // 그러므로 abc 는 null 이 아니다.

	@Resource
	private SqlSessionTemplate sqlsession; // 로컬DB에 연결
	// Type 에 따라 Spring 컨테이너가 알아서 root-context.xml 에 생성된 org.mybatis.spring.SqlSessionTemplate 의 bean 을  abc 에 주입시켜준다. 
    // 그러므로 sqlsession 는 null 이 아니다.
	
	@Resource
	private SqlSessionTemplate sqlsession2; // 원격DB에 연결
	// Type 에 따라 Spring 컨테이너가 알아서 root-context.xml 에 생성된 org.mybatis.spring.SqlSessionTemplate 의 bean 을  abc 에 주입시켜준다. 
    // 그러므로 sqlsession2 는 null 이 아니다.
	
	@Resource
	private SqlSessionTemplate sqlsession3; // 원격DB의 HR에 연결
	// Type 에 따라 Spring 컨테이너가 알아서 root-context.xml 에 생성된 org.mybatis.spring.SqlSessionTemplate 의 bean 을  abc 에 주입시켜준다. 
    // 그러므로 sqlsession3 는 null 이 아니다.
	
	
	// spring_test 테이블에 insert 하기 
	@Override
	public int test_insert() {
		int n = sqlsession.insert("board.test_insert");
		return n;
	}

	
	// spring_test 테이블에 select 하기
	@Override
	public List<TestVO> test_select() {
		List<TestVO> testvoList = sqlsession.selectList("board.test_select");
		return testvoList;
	}


	// view단의 form 태그에서 입력받은 값을 spring_test 테이블에  insert 하기
	@Override
	public int test_insert(Map<String, String> paraMap) {
		int n = sqlsession.insert("board.test_insert_map", paraMap);
		return n;
	}


	// view단의 form 태그에서 입력받은 값을 spring_test 테이블에  insert 하기 
	@Override
	public int test_insert(TestVO vo) {
		int n = sqlsession.insert("board.test_insert_vo", vo);
		return n;
	}


	// hr.employees 테이블의 정보를 select 해오기 
	@Override
	public List<Map<String, String>> test_employees() {
		List<Map<String, String>> empList = sqlsession3.selectList("hr.test_employees"); 
		return empList;
	}


	// === #38. 메인 페이지용 이미지 파일을 가져오기 === //
	@Override
	public List<String> getImgfilenameList() {
		List<String> imgfilenameList = sqlsession.selectList("board.getImgfilenameList");
		return imgfilenameList;
	}


	// === #46. 로그인 처리하기 === //
	@Override
	public MemberVO getLoginMember(Map<String, String> paraMap) {
		
		MemberVO loginuser = sqlsession.selectOne("board.getLoginMember", paraMap);
		return loginuser;
	}

	@Override
	public int updateIdle(String userid) {
		int n = sqlsession.update("board.updateIdle", userid);
		return n;
	}


	// === #56. 글쓰기(파일첨부가 없는 글쓰기) === // 
	@Override
	public int add(BoardVO boardvo) {
		int n = sqlsession.insert("board.add", boardvo);
		return n;
	}


	// == #60. 페이징 처리를 안한 검색어가 없는 전체 글목록 보여주기 == //
	@Override
	public List<BoardVO> boardListNoSearch() {
		List<BoardVO> boardList = sqlsession.selectList("board.boardListNoSearch");
		return boardList;
	}


	// == #64. 글조회수 1증가 하기  == 
	@Override
	public void setAddReadCount(String seq) {
		sqlsession.update("board.setAddReadCount", seq);		
	}

	// == #65. 글1개 조회하기  == 
	@Override
	public BoardVO getView(String seq) {
		BoardVO boardvo = sqlsession.selectOne("board.getView", seq);
		return boardvo;
	}


	// == #74. 1개글 수정하기 == 
	@Override
	public int edit(BoardVO boardvo) {
		int n = sqlsession.update("board.edit", boardvo);
		return n;
	}


	// == #79. 1개글 수정하기 == 
	@Override
	public int del(Map<String, String> paraMap) {
		int n = sqlsession.delete("board.del", paraMap);
		return n;
	}


	// == #86. 댓글쓰기(tbl_comment 테이블에 insert) == 
	@Override
	public int addComment(CommentVO commentvo) {
		int n = sqlsession.insert("board.addComment", commentvo);
		return n;
	}

    // == #87. tbl_board 테이블에 commentCount 컬럼의 값을 1증가(update) == 
	@Override
	public int updateCommentCount(String parentSeq) {
		int n = sqlsession.update("board.updateCommentCount", parentSeq);
		return n;
	}

	// == #87.-2  tbl_member 테이블에 point 컬럼의 값을 50증가(update) == 
	@Override
	public int updateMemberPoint(Map<String, String> paraMap) {
		int n = sqlsession.update("board.updateMemberPoint", paraMap);
		return n;
	}


	// == #92. 원게시글에 딸린 댓글들을 조회해오는 것 == // 
	@Override
	public List<CommentVO> getCommentList(String parentSeq) {
		List<CommentVO> commentList = sqlsession.selectList("board.getCommentList", parentSeq);
		return commentList;
	}


	// == #99. BoardAOP 클래스에 사용하는 것으로 특정 회원에게 특정 점수만큼 포인트를 증가하기 위한 것 
	@Override
	public void pointPlus(Map<String, String> paraMap) {
		sqlsession.update("board.pointPlus", paraMap);
	}


	// == #104. 페이징 처리를 안한 검색어가 있는 전체 글목록 보여주기 == //
	@Override
	public List<BoardVO> boardListSearch(Map<String, String> paraMap) {
		List<BoardVO> boardList = sqlsession.selectList("board.boardListSearch", paraMap);
		return boardList;
	}


	// === #110. 검색어 입력시 자동글 완성하기 5 === //
	@Override
	public List<String> wordSearchShow(Map<String, String> paraMap) {
		List<String> wordList = sqlsession.selectList("board.wordSearchShow", paraMap);
		return wordList;
	}
	
	
	
	
	
	
	
	
	
	
}
