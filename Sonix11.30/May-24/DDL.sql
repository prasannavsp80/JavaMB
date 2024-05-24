drop database if exists sonixjdbc;

create database sonixjdbc;

use sonixjdbc;


Create Table Employ
(
   Empno INT primary key,
   Name varchar(30),
   Gender enum('MALE', 'FEMALE'),
   Dept varchar(30),
   Desig varchar(30),
   Basic numeric(9,2)
);
