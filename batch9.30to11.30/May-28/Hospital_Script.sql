drop database if exists hospitalproject;

create database hospitalproject;

use hospitalproject;

create table hospital
(
    hospitalId int primary key auto_increment,
    hospitalName varchar(30),
    IsNetwork BIT,
    hospitalType varchar(100),
    City varchar(30),
    Address varchar(30),
    Mobile varchar(20),
    email varchar(30)
);
