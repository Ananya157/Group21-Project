CREATE DATABASE onlineiplauction;
use onlineiplauction;
drop 
  table loginDetails;
CREATE TABLE loginDetails (
  Id int NOT NULL, 
  userName varchar(255) NOT NULL, 
  password varchar(255) NOT NULL, 
  PRIMARY KEY (Id)
);
INSERT INTO loginDetails 
values 
  (1, 'amogh', 'amogh');
INSERT INTO loginDetails 
values 
  (2, 'samyak', 'samyak');
INSERT INTO loginDetails 
values 
  (3, 'jatin', 'jatin');
INSERT INTO loginDetails 
values 
  (4, 'ambhika', 'ambhika');
drop 
  table playerDetails CREATE TABLE playerDetails (
    Id int NOT NULL, 
    userName varchar(255) not null, 
    FirstName varchar(255) NOT NULL, 
    LastName varchar(255) NOT NULL, 
    Age int not null, 
    Country varchar(255), 
    Record varchar(Max), 
    PreviousTeam varchar(255), 
    LastBidValue int, 
    BatingAverage double precision, 
    BolwingAverage double precision, 
    isAdmin bit not null, 
    isTeamOwner bit not null, 
    isPlayer bit not null, 
    isNominated bit, 
    Status bit, 
    CurrentTeam varchar(255), 
    isFreezed bit PRIMARY KEY (Id)
  );
insert into playerdetails 
values 
  (
    1, 'amogh', 'Amogh', 'Shetty', 19, null, 
    null, null, null, null, null, 0, 1, 0, 
    null, null, null, null
  );
insert into playerdetails 
values 
  (
    2, 'jatin', 'Jatin', 'Kholiya', 19, 
    null, null, null, null, null, null, 
    0, 1, 0, null, null, null, null
  );
insert into playerdetails 
values 
  (
    3, 'samyak', 'Samyak', 'Jain', 19, null, 
    null, null, null, null, null, 1, 0, 0, 
    null, null, null, null
  );
insert into playerdetails 
values 
  (
    4, 'ambhika', 'Ambhika', 'NA', 19, null, 
    null, null, null, null, null, 1, 0, 0, 
    null, null, null, null
  );
insert into playerdetails 
values 
  (
    5, 'virat', 'Virat', 'Kohli', 32, 'India', 
    '90 matches, 3159 Runs', 'RCB', 
    1000000, 52.65, 0, 0, 0, 1, 1, 0, null, 
    0
  );
insert into playerdetails 
values 
  (
    6, 'rohit', 'Rohit', 'sharma', 34, 'India', 
    '4 centuries in T20 format', 'MI', 
    900000, 32.65, 0, 0, 0, 1, 1, 0, null, 
    0
  );
insert into playerdetails 
values 
  (
    7, 'ishant', 'Ishant', 'Sharma', 36, 
    'India', '90 matches, 72 Wickets, 2700 Runs', 
    'MI', 700000, 10.65, 52.65, 0, 0, 1, 
    1, 0, null, 0
  );
insert into playerdetails 
values 
  (
    8, 'ishan', 'Ishan', 'Kishan', 20, 'India', 
    '34 matches, 1000 Runs', 'MI', 600000, 
    51.65, 0, 0, 0, 1, 1, 0, null, 0
  );
insert into playerdetails 
values 
  (
    9, 'russel', 'Russel', 'R', 34, 'WestIndies', 
    '84 matches, 2000 Runs', 'KKR', 
    400000, 53.25, 30.69, 0, 0, 1, 1, 0, null, 
    0
  );
insert into playerdetails 
values 
  (
    10, 'abd', 'Ab', 'D', 33, 'South Africa', 
    '100 matches, 3500 Runs', 'RCB', 
    1100000, 40.15, 0, 0, 0, 1, 1, 0, null, 
    0
  );
insert into playerdetails 
values 
  (
    11, 'chris', 'Chris', 'Gayle', 37, 'WestIndies', 
    '120 matches, 3700 Runs', 'RCB', 
    1200000, 33.70, 0, 0, 0, 1, 0, 1, 'KP', 
    1
  );
insert into playerdetails 
values 
  (
    12, 'chahal', 'Yuzi', 'Chahal', 29, 
    'India', '30 matches, 500 Runs, 60 Wickets', 
    'RCB', 600000, 15.95, 40.67, 0, 0, 1, 
    1, 0, null, 0
  );
insert into playerdetails 
values 
  (
    13, 'rahul', 'KL', 'Rahul', 28, 'India', 
    '50 matches, 1324 Runs', 'KP', 900000, 
    50.34, 0, 0, 0, 1, 1, 0, null, 0
  );
insert into playerdetails 
values 
  (
    14, 'warner', 'David', 'Warner', 32, 
    'Australia', '75 matches, 1250 Runs', 
    'SRH', 900000, 20.15, 0, 0, 0, 1, 1, 0, 
    null, 0
  );
insert into playerdetails 
values 
  (
    15, 'karthik', 'Dinesh', 'Karthik', 
    34, 'India', '40 matches, 600 Runs', 
    'KKR', 200000, 35.79, 0, 0, 0, 1, 1, 0, 
    null, 0
  );
insert into playerdetails 
values 
  (
    16, 'chahar', 'R', 'Chahar', 26, 'India', 
    '20 matches, 160 Runs, 30 Wickets', 
    'MI', 100000, 10.57, 45.67, 0, 0, 1, 
    0, 1, 'CSK', 1
  );
insert into playerdetails 
values 
  (
    17, 'dhoni', 'MD', 'Dhoni', 36, 'India', 
    '150 matches, 4000 Runs', 'CSK', 
    1200000, 45.98, 0, 0, 0, 1, 1, 0, null, 
    0
  );
insert into playerdetails 
values 
  (
    18, 'bravo', 'DJ', 'Bravo', 35, 'WestIndies', 
    '100 matches, 23456 Runs, 70 Wickets', 
    'CSK', 1000000, 25.67, 35.67, 0, 0, 
    1, 1, 0, null, 0
  );
insert into playerdetails 
values 
  (
    19, 'smith', 'Steve', 'Smith', 33, 'Australia', 
    '60 matches, 3100 Runs', 'RR', 1100000, 
    50.65, 0, 0, 0, 1, 1, 0, null, 0
  );
insert into playerdetails 
values 
  (
    20, 'buttler', 'Jos', 'Buttler', 31, 
    'England', '70 matches, 2500 Runs', 
    'RR', 600000, 51.65, 0, 0, 0, 1, 1, 0, 
    null, 0
  );
insert into playerdetails 
values 
  (
    21, 'williams', 'Kane', 'williamson', 
    30, 'Newzeland', '75 matches, 2165 Runs', 
    'CSK', 700000, 53.65, 0, 0, 0, 1, 1, 0, 
    null, 0
  );
insert into playerdetails 
values 
  (
    22, 'joe', 'Joe', 'Root', 35, 'Newzeland', 
    '120 matches, 4100 Runs', 'RR', 
    1000000, 54.65, 0, 0, 0, 1, 1, 0, null, 
    0
  );
insert into playerdetails 
values 
  (
    23, 'archar', 'Jofra', 'Archar', 27, 
    'England', '75 matches, 123 Runs, 60 Wickets', 
    'CSK', 800000, 17.65, 45.67, 0, 0, 1, 
    1, 0, null, 0
  );
insert into playerdetails 
values 
  (
    24, 'morris', 'Chris', 'Morris', 29, 
    'South Africa', '20 matches, 200 Runs,25 Wickets ', 
    'KP', 300000, 59.65, 0, 0, 0, 1, 1, 0, 
    null, 0
  );
