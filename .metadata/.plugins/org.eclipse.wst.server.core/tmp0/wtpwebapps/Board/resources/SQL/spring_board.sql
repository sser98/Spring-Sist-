

show user;
-- USER이(가) "MYMVC_USER"입니다.

create table spring_test1
(no         number
,name       varchar2(100)
,writeday   date default sysdate
);

select *
from spring_test1;

delete from spring_test1;
commit;

select * from spring_test1;


