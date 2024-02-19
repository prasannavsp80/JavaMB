-- How to change to particular database
use Excelr930;

-- Display list of tables in current db 

show tables;

-- Display info. about Dept table 

desc Dept;

-- Display info. about Emp table 

desc Emp;

-- Display all records from Emp table 

select * from Emp; 

-- Display all records from Dept table 

select * from Dept;

-- Display Empno, Ename, Job, Sal, Hiredate, Mgr from Emp 

select Empno, Ename, Job, Sal, Hiredate, Mgr
from Emp;

-- Display Deptno,Dname from Dept table 

select Deptno, Dname from Dept;

-- Where Clause : Used to display filtered records from table 

-- Display all records whose sal >= 2000;

select * from Emp where sal >= 2000;

-- Display info about Empno is 7900 

select * from Emp where Empno = 7900;

-- Display info. whose job is 'Manager' 

select * from Emp where job='Manager';

-- Display info. whose Ename is 'KING' 

-- between...and : Used to display records from start to end range 

select * from Emp where ename='KING';

-- Display all records whose sal from 1000 to 3000;

select * from Emp 
where sal between 1000 and 3000;

select * from Emp 
where sal NOT between 1000 and 3000;

-- IN Clause : Used to retrieve records for multiple values of particular column

-- Display info whose ename is SCOTT OR FORD OR KING OR JAMES 

select * from Emp where ename in('SCOTT','FORD','KING','JAMES');

select * from Emp where ename not in('SCOTT','FORD','KING','JAMES');

-- like OPERATOR : Used to display data w.r.t Wild cards 

-- Display all records whose name starts with 'S'

select * from Emp where ename like 'S%';

-- Display all records whose name ends with 'S'

select * from Emp where ename like '%S';




