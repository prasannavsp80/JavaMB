-- From EmployeeNew table display all Male records 

select * from EmployeeNew where gender='MALE';
-- Display total male employees count 

select count(*) from EmployeeNew where
gender='MALE';

-- Dispaly all records whose position is 'TL'

select empno, name,gender,position,salary
from EmployeeNew
where position='TL';

select * from Employeenew;

-- Display all records who born on 1999

select * from EmployeeNew 
where year(dob)=1999;

-- Displaly Unique position records 

select distinct position from EmployeeNew;

-- Define runtime field as location as
-- for postition SWE location is Hyderabad
-- for position TL location is Chennai
-- for position Manager location is Bangalore

select empno, name,position,salary,
case position
WHEN 'SWE' THEN 'Hyderabad'
WHEN 'TL' THEN 'Chennai'
WHEN 'Manager' THEN 'Bangalore'
else 'Invalid Option'
end location
 from EmployeeNew;
 -- Write a query to increment salary as for position
 -- for SWE increment by 5k
 -- for TL increment by 12k
 -- for manager increment by 18k and 
 -- generate runtime column TakeHome
 select empno, upper(name),position,salary,
 case position
  WHEN 'SWE' THEN salary+5000
  WHEN 'TL' THEN salary+12000
  WHEN 'Manager' THEN Salary+18000
 end TakeHome
 from EmployeeNew;

-- Write a query as display message as who born before 2000 as '20th century'
-- who born after 2000 as '21st century'
 select empno, upper(name),position,salary,dob,
 case when year(dob) < 2000 then '20th Century'
 else '21st century' end Message
 from EmployeeNew;
 
 -- show count of records how many born in 20th century
 
 select count(*) from EmployeeNew where year(dob) < 2000;

