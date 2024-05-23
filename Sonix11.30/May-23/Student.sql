use SonixPractice;

drop table if exists student;

create table student
(
	sno int primary key auto_increment,
    sname varchar(30),
    Sub1 INT, Sub2 INT, Sub3 INT,
    Total INT, Aveg numeric(9,2)
);

Insert into Student(Sno, Sname, Sub1, Sub2, Sub3) 
values(1,'Shiva',67,88,87),
(2,'Jogesh',99,87,90),
(3,'Akhil',99,98,67),
(4,'Sudharshan',77,98,66);

select * from Student;