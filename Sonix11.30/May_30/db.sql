drop database if exists exam224;

create database exam224;

use exam224;

create table Insurance
(
   InsuranceId int primary key auto_increment,
   InsuranceName varchar(30),
   LaunchedOn date,
   PremiumAmount numeric(9,2),
   ExpiresOn Date,
   PayMode INT,
   Status INT
);


Insert into Insurance(InsuranceName,LaunchedOn,PremiumAmount,
ExpiresOn,PayMode,Status) values('Children Policy','2023-10-10',
88523,'2028-10-10',2,1),('LIC Jeevan Jyothi','2010-01-01',
88774,null,3,1),('LIC Jeevan Saral','2000-01-01',88888,null,2,1),
('KOVID Kavach','2020-04-01',46453,'2020-08-01',3,1);