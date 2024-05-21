use sonixpractice;

drop table if exists menu;

drop table if exists restaurant;

create table restaurant
(
   restaurantId int primary key auto_increment,
   RestaurantName varchar(30),
   City varchar(30),
   State varchar(30),
   Rating varchar(10)
);

Insert into Restaurant(RestaurantName,City,State,Rating)
values('Mehfil','Hyderabad','TS','5.5'),
('Chutneys','Hyderabad','TS','4.5'),
('Swathi','Chennai','TN','5.6'),
('Dolphin','Vizag','AP','5.5'),
('Daspalla','Hyderabad','TS','5.2'),
('Swagath','Chennai','TN','5.6');

Create Table Menu
(
   MenuID INT Auto_Increment primary key,
   RestaurantID INT REFERENCES Restaurant(RestaurantID),
   ItemName varchar(30),
   Price numeric(9,2)
);

Insert into Menu(RestaurantId,ItemName,Price)
values(1,'Biryani',664),(1,'Paneer Butter Masala',633),
(1,'Malai Kofta',522),(2,'Rajma',525),
(2,'Butter Nan',45),(3,'French Fries',155),
(3,'Noodles',52),(3,'Chicken Biryani',676);