drop database if exists may21;
create database may21;
use may21;
create table Agent
(
   AgentId Int Primary Key Auto_Increment,
   FirstName varchar(30),
   LastName varchar(30),
   userName varchar(30) Unique,
   password varchar(100),
   email varchar(100),
   city varchar(30)
);
Create Table Authorization
(
    AuthId int primary key auto_increment,
    AgentID INT REFERENCES Agent(AgentID),
    AuthCode varchar(30),
    AuthReason varchar(30),
    Status varchar(10) default 'active'
);
