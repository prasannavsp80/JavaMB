drop database if exists TechShop;
create database TechShop;
use TechShop;

drop table if exists customers;
create table customers
(
  CustomerID  int Primary Key,
  FirstName varchar(30),
  LastName varchar(30),
  Email varchar(30),
  Phone varchar(30),
  Address varchar(30)
);

drop table if exists products;
create table products
(
   ProductID int Primary Key,
   ProductName varchar(30),
   Description varchar(50),
   Price numeric(9,2)
);

drop table if exists orders;
create table orders
(
   OrderID int Primary Key,
   CustomerID int,
   OrderDate varchar(30),
   TotalAmount numeric(9,2),
   foreign key(customerid) references customers(customerid) on delete cascade
);

drop table if exists orderdetails;
create table orderdetails
(
  OrderDetailID int Primary Key,
  OrderID int,
  ProductID int,
  Quantity int,
  foreign key(orderid) references orders(orderid) on delete cascade,
  foreign key(productid) references products(productid) on delete cascade
);

drop table if exists inventory;
create table inventory
(
  InventoryID int Primary Key,
  ProductID int,
  LastStockUpdate varchar(30),
  foreign key(productid) references products(productid)
);



