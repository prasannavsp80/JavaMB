Drop database  if exists ExcelrPractice;

Create Database ExcelrPractice;

Use ExcelrPractice;

Create Table Employ
(
    Empno INT Primary Key, 
    Name varchar(15),
    Gender ENUM('MALE','FEMALE'),
    Dept varchar(15),
    Desig varchar(15),
    Basic numeric(9,2)
);

