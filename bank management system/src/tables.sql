create database bank;

use bank;

create table signup(formno varchar(20),
name varchar(25),
fname varchar(25),
dob varchar(25),
gender varchar(25),
email varchar(50),
marital varchar(25),
address varchar(25),
city varchar(25),
pin varchar(25),
state varchar(25));

use bank;
create table signup1(formno varchar(20),
religion varchar(25),
category varchar(25),
income varchar(25),
education varchar(25),
occupation varchar(50),
pan varchar(25),
aadhar varchar(25),
seniorcitizen varchar(25),
existingaccount varchar(25)
);

use bank;
create table signup2(formno varchar(20),
accountType varchar(25),
cardnumber varchar(25),
pinnumber varchar(25),
facility varchar(100)

);

create table login(formno varchar(20),
cardnumber varchar(25),
pinnumber varchar(25)

);

use bank;
drop table bank;
create table bank(pin varchar(20),
date varchar(55),
type varchar(25),
amount varchar(25)
);
