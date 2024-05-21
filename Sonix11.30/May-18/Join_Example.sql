desc Dept;
desc Emp;
-- the above tables deptno is primary key in dept table and foreign key in emp table
select Dept.Deptno, Dname, Empno, Ename, job,Loc,Mgr
from Dept INNER JOIN EMP ON
Dept.Deptno = Emp.Deptno;

select D.Deptno,Dname,Empno,Ename,job,Loc,Mgr
from Dept D INNER JOIN EMP E ON 
D.Deptno = E.Deptno ;

-- Joining 3 tables 

select A.AgentID,FirstName,LastName,City,State,
P.PolicyId,AppNumber,ModalPremium,AnnualPremium
from Agent A INNER JOIN AgentPolicy AP 
ON A.AgentId = AP.AgentID
INNER JOIN Policy P ON P.PolicyID = AP.PolicyID;
