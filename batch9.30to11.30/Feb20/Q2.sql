-- String Functions 

select instr('Guruvardhan','u');
select instr('ananth','a'); 

-- Length : Used to display length of given string 

select length('Manikantha');

select ename, length(ename) from Emp; 

-- Reverse : Used to display string in reverse order. 

select reverse('Rajkishore');

select ename, reverse(ename) from emp;

-- left() : displays no.of left-side chars 

select Left('Guruvardhan',4);

-- right() : Displays no.of right-side chars 

select right('Chinmai',5);

-- lower () : Displays in lower case

select Lower('Sanghavi');

-- Upper() : Displays in upper case

select upper('Muskan');

-- replace() : Replaces old char or word with new char or word in all 
-- occurrences

select replace('Java Training','Java','Sql');

-- Concat() : used to concatenate given strings. 

select concat('Guru',' ','Vardhan');