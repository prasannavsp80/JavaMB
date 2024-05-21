use practice;

drop table if exists bonus;

drop table if exists EmpDetails;

create table EmpDetails
(
   Empno INT primary key auto_increment,
   Name varchar(30),
   Salary numeric(9,2)
);

Insert into EmpDetails(Name,Salary)
values('Satya',88233),
('Rajendra',88665),
('Keerthi',82255),
('Madhuri',88776);

Create Table Bonus
(
   BonusId INT Primary Key Auto_Increment,
   EmpId INT ReFERENCES EmpDetails(Empno),
   BonusName varchar(10),
   BonusAmount numeric(9,2),
   BonusFlag INT
);

Insert into Bonus(EmpId,BonusName,BonusAmount,
BonusFlag) values(1,'HRA',4000,1),
(1,'DA',2000,1),
(1,'TAX',3000,-1),
(1,'PF',1200,-1),
(2,'HRA',4000,1),
(2,'DA',2000,1),
(2,'TAX',3000,-1),
(2,'PF',1200,-1),
(3,'HRA',4000,1),
(3,'DA',2000,1),
(3,'TAX',3000,-1),
(3,'PF',1200,-1);