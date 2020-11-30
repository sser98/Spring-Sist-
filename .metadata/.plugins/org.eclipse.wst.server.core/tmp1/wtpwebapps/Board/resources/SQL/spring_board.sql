------ **** 스프링 게시판 **** ------

show user;
-- USER이(가) "MYMVC_USER"입니다.

create table spring_test
(no         number
,name       varchar2(100)
,writeday   date default sysdate
);

select *
from spring_test;

delete from spring_test;
commit;

-----------------------------------------------------------------------------------------
show user;
-- USER이(가) "HR"입니다.

select employee_id, first_name || ' ' || last_name AS ename,
       nvl( (salary + salary*commission_pct)*12 ,  salary*12) AS yearpay,
       case when substr(jubun,7,1) in ('1','3') then '남' else '여' end AS gender,
       extract(year from sysdate) - ( case when substr(jubun,7,1) in('1','2') then 1900 else 2000 end + to_number(substr(jubun,1,2)) ) + 1 AS age         
from employees
order by 1;


show user;
-- USER이(가) "MYMVC_USER"입니다.

select * from tab;

select *
from tbl_main_image;

select *
from tbl_member;


select userid, name, email, mobile, postcode, address, detailaddress, extraaddress, gender
     , birthyyyy, birthmm, birthdd, coin, point, registerday, pwdchangegap
     , nvl( lastlogingap, trunc( months_between(sysdate, registerday) )) as lastlogingap
from
(
select userid, name, email, mobile, postcode, address, detailaddress, extraaddress, gender
     , substr(birthday,1,4) as birthyyyy, substr(birthday,6,2) as birthmm, substr(birthday,9) as birthdd
     , coin, point, to_char(registerday,'yyyy-mm-dd') as registerday
     , trunc( months_between(sysdate, lastpwdchangedate) ) as pwdchangegap
from tbl_member
where status = 1 and userid = 'kangkc' and pwd = '9695b88a59a1610320897fa84cb7e144cc51f2984520efb77111d94b402a8382' 
) M 
cross join 
(
select trunc( months_between(sysdate, max(logindate)) ) as lastlogingap 
from tbl_loginhistory 
where fk_userid = 'kangkc' 
) H;

select *
from tbl_loginhistory;


    ------- **** 게시판(답변글쓰기가 없고, 파일첨부도 없는) 글쓰기 **** -------
desc tbl_member;

create table tbl_board
(seq         number                not null    -- 글번호
,fk_userid   varchar2(20)          not null    -- 사용자ID
,name        varchar2(20)          not null    -- 글쓴이 
,subject     Nvarchar2(200)        not null    -- 글제목
,content     Nvarchar2(2000)       not null    -- 글내용   -- clob (최대 4GB까지 허용) 
,pw          varchar2(20)          not null    -- 글암호
,readCount   number default 0      not null    -- 글조회수
,regDate     date default sysdate  not null    -- 글쓴시간
,status      number(1) default 1   not null    -- 글삭제여부   1:사용가능한 글,  0:삭제된글
,constraint PK_tbl_board_seq primary key(seq)
,constraint FK_tbl_board_fk_userid foreign key(fk_userid) references tbl_member(userid)
,constraint CK_tbl_board_status check( status in(0,1) )
);

create sequence boardSeq
start with 1
increment by 1
nomaxvalue
nominvalue
nocycle
nocache;

select *
from tbl_board
order by seq desc;


select seq, fk_userid, name, subject  
     , readcount, to_char(regDate, 'yyyy-mm-dd hh24:mi:ss') as regDate
from tbl_board
where status = 1
order by seq desc

select* from tbl_board;












