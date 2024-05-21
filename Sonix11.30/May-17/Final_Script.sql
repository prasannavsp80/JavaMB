use practice;


drop table if exists EmpDetailsFinal;

create table EmpDetailsFinal
(
   Empno INT,
   Name varchar(30),
   Salary numeric(9,2),
    BonusName varchar(10),
   BonusAmount numeric(9,2),
   BonusFlag INT,
   Primary Key(Empno,BonusName)
);

Insert into EmpDetailsFinal(Empno,Name,Salary,BonusName,
BonusAmount,BonusFlag)
values(1,'Satya',88233,'HRA',4000,1),
(1,'Satya',88233,'DA',2000,1),
(1,'Satya',88233,'TAX',3000,-1),
(1,'Satya',88233,'PF',1200,-1),
(2,'Rajendra',88665,'HRA',3000,1),
(2,'Rajendra',88665,'DA',1400,1),
(2,'Rajendra',88665,'TAX',8000,-1),
(2,'Rajendra',88665,'PF',3000,-1),
(3,'Keerthi',82255,'HRA',1200,1),
(3,'Keerthi',82255,'DA',1200,1),
(3,'Keerthi',82255,'TAX',2200,-1),
(3,'Keerthi',82255,'PF',2800,-1),
(4,'Madhuri',88776,'HRA',1900,1),
(4,'Madhuri',88776,'DA',2900,1),
(4,'Madhuri',88776,'TAX',1900,-1),
(4,'Madhuri',88776,'PF',1900,-1);

