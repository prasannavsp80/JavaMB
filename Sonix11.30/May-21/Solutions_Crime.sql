-- show all open incidents
select * from crime where status='Open';

-- Find the total number of incidents
select count(*) from Crime;

-- List all unique incident types

select * from crime where status='open';

select incidentType,count(*) from Crime
where status='open'
group by incidentType ;

select * from victim where crimeId  IN(
select crimeId from crime where crimeID = ANY(select crimeId from suspect)
AND Status IN('OPEN','CLOSED'));

select distinct incidentType from crime;

-- Retrieve incidents that occurred between '2023-09-01' and '2023-09-10'

select * from crime where IncidentDate between
'2023-09-01' and '2023-09-10';

select * from suspect order by dob desc;
select name,dob,suspectid,ceil(datediff(curdate(),dob)/365.25)
from suspect;

select avg(datediff(curdate(),dob)/365.25) from suspect;

select name,dob,suspectid,ceil(datediff(curdate(),dob)/365.25)
from suspect 
where ceil(datediff(curdate(),dob)/365.25) between 35 and  40;


select * from suspect where crimeID = ANY (select crimeId from 
crime where IncidentType='Robbery');


select incidentType,count(*) from Crime
where status='open'
group by incidentType 
having count(*) > 1;

select * from crime where crimeId <>ALL(select crimeId from suspect); 