select * from Emp;
select max(sal) from Emp;

select  ename,max(sal) from emp group by sal 
having max(sal)
order by max(sal) desc LIMIT 1;

select ename from emp where sal =(select max(sal) from Emp);

select ename,max(sal) from Emp;

select max(sal) from Emp where sal < 
(select max(sal) from Emp);

select  ename,max(sal) from emp group by sal 
having max(sal)
order by max(sal) desc LIMIT 2;

select sal from emp order by sal desc;

select ename from emp where sal =(
select max(sal) from Emp where sal < 
(select max(sal) from Emp));

