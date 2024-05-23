select * from Employ;

set autocommit = off;

start transaction;
delete from Employ where empno = 3;

select * from Employ;

rollback;