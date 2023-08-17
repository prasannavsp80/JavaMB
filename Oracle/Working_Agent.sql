drop table Agent;

Create Table Agent
(
	AgentID INT Primary Key,
	FirstName varchar2(30), 
   MI varchar2(1),
   LastName varchar2(30),
   FullName varchar2(80),
   Gender varchar2(10),
    Dob TIMESTAMP,
    SSN varchar2(30),
    MaritalStatus INT,
    Address1 varchar2(30),
    Address2 varchar2(30),
    City varchar2(30),
    State varchar2(30),
    ZipCode varchar2(30),
    Country varchar2(30)
  );

  
  

Insert into Agent(AgentID,FirstName,MI,LastName,Gender,DOB,SSN,MaritalStatus,Address1,Address2,City,STATE,ZipCode,Country)
values(1,'Sunitha','P','Premjee','Female',TO_DATE('1986-01-02','yyyy-MM-dd'),'434-55-3323',1,'5th Avenue','Near Church','Parlin','NJ','434554','USA');

Insert into Agent(AgentID,FirstName,MI,LastName,Gender,DOB,SSN,MaritalStatus,Address1,Address2,City,STATE,ZipCode,Country)
values
(2,'Pranitha','R','Reddy','Female',TO_DATE('1986-01-02','yyyy-MM-dd'),'324-55-2344',1,'8th Mile','Sterling Heights','Detroit','MI','442345','USA');

Insert into Agent(AgentID,FirstName,MI,LastName,Gender,DOB,SSN,MaritalStatus,Address1,Address2,City,STATE,ZipCode,Country)
values	
(3,'Shavetha','D','Datta','Female',TO_DATE('1980-01-02','yyyy-MM-dd'),'643-34-4443',0,'Dwaraka Nagar','5th Phase','NewDelhi','UP','438533','INDIA');

Insert into Agent(AgentID,FirstName,MI,LastName,Gender,DOB,SSN,MaritalStatus,Address1,Address2,City,STATE,ZipCode,Country)
values
(4,'Shanthi','T','Tangvel','Female',TO_DATE('1983-12-03','yyyy-MM-dd'),'644-23-4534',1,'Near Food Court','2nd Phase','Chicago','MI','483845','USA');

Insert into Agent(AgentID,FirstName,MI,LastName,Gender,DOB,SSN,MaritalStatus,Address1,Address2,City,STATE,ZipCode,Country)
values
(5,'ashraf','V','Vahora','Male',TO_DATE('1983-01-01','yyyy-MM-dd'),'435-22-5212',
1,'8th Avenue','Church Road','Maywood','NJ','78434','USA');

Insert into Agent(AgentID,FirstName,MI,LastName,Gender,DOB,SSN,MaritalStatus,Address1,Address2,City,STATE,ZipCode,Country)
values
(6,'Ramesh','L','Gole','Male',TO_DATE('1981-01-02','yyyy-MM-dd'),'643-34-7373',
0,'5th Phase','Sterling Heights','Detroit','MI','477843','USA');

Insert into Agent(AgentID,FirstName,MI,LastName,Gender,DOB,SSN,MaritalStatus,Address1,Address2,City,STATE,ZipCode,Country)
values
(7,'Lavanya','S','K','FeMale',TO_DATE('1988-12-12','yyyy-MM-dd'),'335-44-2344',
0,'LIG B87','ASRAO NR','SECBAD','AP','500062','INDIA');

Insert into Agent(AgentID,FirstName,MI,LastName,Gender,DOB,SSN,MaritalStatus,Address1,Address2,City,STATE,ZipCode,Country)
values
(8,'Murali','S','Krishna','Male',TO_DATE('1986-03-09','yyyy-MM-dd'),
'234-44-2335',1,'RK HOstel','Ameerpet','HYDBAD','AP',
'500042','INDIA');

Insert into Agent(AgentID,FirstName,MI,LastName,Gender,DOB,SSN,MaritalStatus,Address1,Address2,City,STATE,ZipCode,Country)
values
(9,'Raj','S','kumar','Male',TO_DATE('1987-12-12','yyyy-MM-dd'),
'345-23-4211',0,'MadhaPur','Nr Cyber Towers','HYDBAD','AP',
'509244','INDIA');

Insert into Agent(AgentID,FirstName,MI,LastName,Gender,DOB,SSN,MaritalStatus,Address1,Address2,City,STATE,ZipCode,Country)
values
(10,'Srimukha','S','Manchu','FeMale',TO_DATE('1986-12-11','yyyy-MM-dd'),
'231-44-2335',0,'NRS','Madhapur','HYDBAD','AP',
'500042','INDIA');

Insert into Agent(AgentID,FirstName,MI,LastName,Gender,DOB,SSN,MaritalStatus,Address1,Address2,City,STATE,ZipCode,Country)
values
(11,'Lalitha','S','B','FeMale',TO_DATE('1987-11-11','yyyy-MM-dd'),
'341-23-4211',0,'KondaPur','Nr Stadium','HYDBAD','AP',
'509244','INDIA');

Insert into Agent(AgentID,FirstName,MI,LastName,Gender,DOB,SSN,MaritalStatus,Address1,Address2,City,STATE,ZipCode,Country)
values
(12,'Rakesh','K','Chowdary','Male',
TO_DATE('1986-01-12','yyyy-MM-dd'),'123-23-2444',1,'8th Mile','Church Road','Detroit','MI','484555','USA');

Insert into Agent(AgentID,FirstName,MI,LastName,Gender,DOB,SSN,MaritalStatus,Address1,Address2,City,STATE,ZipCode,Country)
values
(13,'Rama','U','Rao','Male',
TO_DATE('1983-01-12','yyyy-MM-dd'),'223-43-1444',1,'5th Mile','Ford Street','Chicago','NY','2484555','USA');

Insert into Agent(AgentID,FirstName,MI,LastName,Gender,DOB,SSN,MaritalStatus,Address1,Address2,City,STATE,ZipCode,Country)
values
(14,'Madhuri','S','M','FeMale',
TO_DATE('1989-12-12','yyyy-MM-dd'),'423-33-2444',1,'Beach Street','Univ Road','NewYork','CT','5484555','USA');

Insert into Agent(AgentID,FirstName,MI,LastName,Gender,DOB,SSN,MaritalStatus,Address1,Address2,City,STATE,ZipCode,Country)
values
(15,'Prafulla','U','Rao','FeMale',
TO_DATE('1987-12-01','yyyy-MM-dd'),'523-22-2644',1,'8th Mile','IBM Road','Detroit',
'MI','484555','USA');

Insert into Agent(AgentID,FirstName,MI,LastName,Gender,DOB,SSN,MaritalStatus,Address1,Address2,City,STATE,ZipCode,Country)
values
(16,'Prasanna','P','Kumar','Male',
TO_DATE('1980-9-03','yyyy-MM-dd'),'423-23-1444',1,'ASRAO NR','Good Luck Cafe','SECBAD','AP','500 062','INDIA');

commit;



