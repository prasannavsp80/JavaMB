-- DDL 

drop database if exists dbnew;

create database dbnew;

use dbnew;

create table EmployeeNew
(
   empno int primary key auto_increment,
   name varchar(30),
   Gender Enum('MALE','FEMALE'),
   Position varchar(30),
   dob date,
   salary numeric(9,2)
);

Insert into EmployeeNew(Name,Gender,Position,Dob,Salary)
values('Shiva','MALE','SWE','2000-10-10',88322),
('AbhiReddy','MALE','TL','1999-12-12',88324),
('Ramesh','MALE','Manager','1990-11-11',90044),
('Jayasimha','MALE','TL','1999-12-12',88554),
('Prathyusha','FEMALE','Manager','1900-12-12',88522),
('Shilpa','FEMALE','TL','1999-10-10',88422),
('Kavitha','FEMALE','SWE','2000-10-10',99942);