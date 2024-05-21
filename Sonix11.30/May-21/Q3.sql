use sonixpractice;

select D.Deptno, Dname, Empno, Ename, job,loc, sal,comm
from Dept D INNER JOIN EMp E on
D.Deptno = E.Deptno;

select A.AgentId, FirstName, LastName, City, State, 
P.PolicyID, AppNumber,ModalPremium,AnnualPremium
from Agent A INNER JOIN AgentPolicy AP
on A.AgentID = AP.AgentID 
INNER JOIN Policy P On 
P.PolicyID = Ap.PolicyId;

-- Applying Left Outer Join

select D.Deptno, Dname, Empno, Ename, job,loc, sal,comm
from Dept D LEFT JOIN EMp E on
D.Deptno = E.Deptno;

-- Left outer Join 

select A.AgentId, FirstName, LastName, City, State, 
P.PolicyID, AppNumber,ModalPremium,AnnualPremium
from Agent A LEFT JOIN AgentPolicy AP
on A.AgentID = AP.AgentID 
LEFT JOIN Policy P On 
P.PolicyID = Ap.PolicyId;

-- Right outer Join

select A.AgentId, FirstName, LastName, City, State, 
P.PolicyID, AppNumber,ModalPremium,AnnualPremium
from Agent A RIGHT JOIN AgentPolicy AP
on A.AgentID = AP.AgentID 
RIGHT JOIN Policy P On 
P.PolicyID = Ap.PolicyId;

-- Cross Join

select * from Dept cross Join Emp;

select count(*) from Dept cross join emp;

select empno, ename, mgr from Emp;

select E1.Empno 'Manager Id', 
E2.Empno 'Employ Id', 
E1.Ename 'Manager Name', 
E2.Ename 'Employ Name'
from Emp E1 RIGHT JOIN Emp E2 On
E1.Empno = E2.mgr;
