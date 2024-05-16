use sonixpractice;

drop table if exists Login;

create table Login
(
   userName varchar(30) primary key,
   passCode varchar(30) NOT NULL
);

Insert into login(userName,PassCode) values('Akhil',
'Kumar'),('Baba','Sai'),('Parusha','Ramulu');

select count(*) cnt from Login where userName='Akhil' AND PassCode='Kumar';