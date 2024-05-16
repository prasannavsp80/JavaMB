use sonixpractice;

drop table if exists EmployPayroll;

create table EmployPayRoll
(
   Empno INT Primary Key,
   Name varchar(30) NOT NULL,
   Salary numeric(9,2),
   Hra numeric(9,2),
   Da numeric(9,2),
   Tax numeric(9,2),
   Pf numeric(9,2),
   GrossPay numeric(9,2),
   NetPay Numeric(9,2)
);