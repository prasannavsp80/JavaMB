drop database if exists gadjets;

create database gadjets;

use gadjets;

create table Customers
(
   CustomerID INt Primary key,
   FirstName varchar(30),
   LastName varchar(30),
   Email varchar(30),
   Phone varchar(30),
   Address varchar(30)
);

Insert into Customers values(1,'Satish','Gavini','satish@gmail.com','8482355',
'Hyderabad'), (2,'Adi','Lakshmi','adi@gmail.com', '88563455','Chennai'),
(3,'Sai',' Sampath','sai@gmail.com', '885666','Vizag');

create table Login
(
   userName varchar(30),
   passCode varchar(30)
);

Insert into Login values('Satish','Gavini'),('Adi','Lakshmi'),
('Sai','Sampath');