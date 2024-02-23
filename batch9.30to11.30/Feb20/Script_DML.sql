use ExcelrPractice;

truncate table Employ;

insert into Employ(Empno,Name,Gender,Dept,Desig,Basic)
values(1,'Manikantha','MALE','Java','Programmer',88424),
(2,'Leela','FEMALE','React','Programmer',88424),
(3,'Balaji','MALE','Dotnet','Expert',55211),
(4,'Muskan','FEMALE','Java','Expert',89224),
(5,'Guru','MALE','React','Manager',98842);

select * from Employ;