SELECT * FROM excelr930.emp;

select empno, ename, job,sal,hiredate 
from emp
order by sal desc;

select empno, ename, job, sal, hiredate 
from Emp 
order by job;

select empno, ename, job, sal, hiredate 
from Emp 
order by job,ename;

select empno, ename, job, sal, hiredate
from Emp 
order by job, ename desc;

select empno, ename,job,sal,comm from Emp;

-- Write a query ensure if comm is null then replace with 0 else print comm

select empno,ename,job,sal,comm,
case 
   when comm is null then 0 else comm
end upcomm
 from Emp;

-- write a query ensure if comm is null then return sal else sal+comm as takehome

select empno,ename,job,sal,comm,
case 
   when comm is null then 0 else comm
end upcomm,
case 
  when comm is null then sal 
  else sal+comm
end takehome
 from Emp;






