SELECT * FROM sonixpractice.login;

select count(*) cnt from Login
where userName='Akhil' and passcode='adsf';

drop table CustomerDetails;

select * from CustomerDetails;

create table CustomerDetails
(
   CustId INT Primary key auto_increment,
   CustomerName varchar(30),
   CustomerEmail varchar(30),
   AuthCode varchar(100),
   CustomerUser varchar(30),
   CustomerPassword varchar(30),
   AuthStatus varchar(30) DEFAULT 'ACTIVE'
);