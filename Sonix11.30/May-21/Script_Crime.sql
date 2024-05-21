
drop database if exists crime;

create database crime;

use crime;

-- Create tables
CREATE TABLE Crime (
 CrimeID INT PRIMARY KEY,
 IncidentType VARCHAR(255),
 IncidentDate DATE,
 Location VARCHAR(255),
 Description TEXT,
 Status VARCHAR(20)
);
CREATE TABLE Victim (
 VictimID INT PRIMARY KEY,
 CrimeID INT,
 Name VARCHAR(255),
 Dob Date,
 ContactInfo VARCHAR(255),
 Injuries VARCHAR(255),
 FOREIGN KEY (CrimeID) REFERENCES Crime(CrimeID)
);
CREATE TABLE Suspect (
 SuspectID INT PRIMARY KEY,
 CrimeID INT,
 Name VARCHAR(255),
 Dob date,
 Description TEXT,
 CriminalHistory TEXT,
 FOREIGN KEY (CrimeID) REFERENCES Crime(CrimeID)
);

-- Insert sample data
INSERT INTO Crime (CrimeID, IncidentType, IncidentDate, Location, Description, Status)
VALUES
 (1, 'Robbery', '2023-09-15', '123 Main St, Cityville', 'Armed robbery at a convenience store', 'Open'),
 (2, 'Homicide', '2023-09-20', '456 Elm St, Townsville', 'Investigation into a murder case', 'Under 
Investigation'),
 (3, 'Robbery', '2023-09-10', '789 Oak St, Villagetown', 'Shoplifting incident at a mall', 'Closed'),
 (4, 'Murder', '2023-09-10', '789 Oak St, Villagetown', 'Shoplifting incident at a mall', 'Open'),
 (5, 'Robbery', '2023-09-10', 'TRT 81', 'Shoplifting incident at a mall', 'Open'),
 (6, 'Murder', '2023-09-10', '789 Oak St, Villagetown', 'Shoplifting incident at a mall', 'Open'),
 (7, 'Homicide', '2023-09-10', '789 Oak St, Villagetown', 'Shoplifting incident at a mall', 'Open');
INSERT INTO Victim (VictimID, CrimeID, Name, ContactInfo, Injuries,dob)
VALUES
 (1, 1, 'John Doe', 'johndoe@example.com', 'Minor injuries','2000-10-10'),
  (4, 1, 'Scott Styres', 'Scott@example.com', 'Hand Break','1988-10-10'),
 (5, 1, 'Rachel Shelly', 'rachel@example.com', 'Legments Break','1977-10-10'),
 (2, 2, 'Jane Smith', 'janesmith@example.com', 'Deceased','1980-10-09'),
 (6, 2, 'Allan Jones', 'allan@example.com', 'Minor Injuries','1999-10-08'),
 (3, 3, 'Alice Johnson', 'alicejohnson@example.com', 'None','1977-10-08');
 
INSERT INTO Suspect (SuspectID, CrimeID, Name, Description, CriminalHistory
,dob)
VALUES
 (1, 1, 'Robber 1', 'Armed and masked robber', 'Previous robbery convictions',
 '1990-01-01'),
  (4, 1, 'Scott Styres', 'Doubtful', NULL,'1977-01-01'),
 (2, 2, 'Unknown', 'Investigation ongoing', NULL, '1988-10-10'),
 (3, 3, 'Suspect 1', 'Shoplifting suspect', 'Prior shoplifting arrests',
 '1999-10-10');