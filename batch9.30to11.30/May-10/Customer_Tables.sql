drop database if exists customerdb;

create database customerdb;

use customerdb;

Create Table CustomerSonix
(
   CustId int primary key auto_increment,
   CustomerFirstName varchar(30),
   CustomerLastName varchar(30),
   CustomerUserName varchar(20),
   CustomerPassword varchar(20),
   CustomerCity varchar(30),
   CustomerEmail varchar(30)
);

Create Table CustomerAuth
(
    AuthId INT Primary Key auto_increment, 
    CustId INT references CustomerSonix(CustId),
    PassWordReason varchar(100),
    GenCode varchar(15),
    status varchar(10) default 'Enabled'
);


