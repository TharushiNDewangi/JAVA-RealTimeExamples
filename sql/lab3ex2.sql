create table bank
(
code int primary key,
registration varchar(36),
name varchar(18),

)
create table branch
(
branchnum int ,
code int foreign key references bank,
name varchar(28),
address_ varchar(12),
primary key(code,branchnum),
)
create table accounttype
(
code int primary key,
name varchar(20),
description varchar(20),

)
!--Ensure that the interest_rate of Savings account is a non-negative number (>= 0). 
!--Ensure that the balance in an account is always non-negative number (>= 0)
create table account
(
accnum int primary key,
balance float check (balance>=0),
code int ,
branchnum int ,
acctypecode int foreign key references accounttype,
foreign key(code,branchnum)references branch

) 
create table savingacc
(
code int primary key,
interrate real check(interrate>=0),
foreign key(code) references accounttype,
)
create table currentacc
(
code int primary key,
maxcheques real,
foreign key(code) references accounttype,
)
!--Ensure that the customer’s PIN number is a four digit (0-9) number 
!--Ensure that the customer’s NIC number contains 10 digits
!--Ensure that the customer’s name is not null
create table customerl
(
cusnum int primary key,
nic varchar(10)check(nic like '[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][V|v]'),
name varchar(40) not null,
address_ varchar(30),
phone varchar(10),
pin char(4) check(pin like '[0-9][0-9][0-9][0-9]'),
)
--In the Transaction table, the default value for date&time should be the system datetime.
--In the Transaction table, the value for by attribute must be one of the following: “ATM”, 
--“Teller”, “Bank”, “Standing Order”, “Cheque”, “On-Line” or “Other”.
create table transaction_
(
tid int primary key,
amount float,
description varchar(27),
executedby varchar(40) check(executedby in ('ATM','Teller','Bank','standing order','online','other')) ,
dateandtime datetime default getdate(),
)
create table belongsto
(
num int foreign key references customer,
accnum int foreign key references account,
primary key(num,accnum),
)
--The type descriptive attribute of the “has” relationship between Transaction table and 
--Account table should have one of the following values: “credit” or “debit”.
create table has
(
accnum int foreign key references account,
tid int foreign key references transaction_,
banktype varchar(10) check(banktype in('credit','debit')),
primary key(accnum,tid),
)


drop table accounttype
drop table bank
drop table branch

drop table account
drop table customer
drop table transaction_
drop table has
drop table belongsto
drop table savingacc
drop table currentacc

insert into bank values(111,'null','boc');
insert into bank values(113,'null','peaple');
insert into bank values(222,'null','nsb');
insert into bank values(122,'null','sampath bank');
select * from bank

insert into branch values(333,111,'kurunegala','kurunegala');
insert into branch values(441,122,'anuradhapura','malabe');
insert into branch values(442,111,'habarana','malabe');
insert into branch values(445,122,'malabe','malabe');
select * from branch

insert into accounttype values(555,'saving','null');
insert into accounttype values(666,'saving','null');
select * from accounttype

insert into account values(7457,3400000,111,333,555);
insert into account values(7456,3700000,111,442,666);
insert into account values(7454,6290000,111,333,666);
--insert into branch values(445,122,'malabe','malabe');
insert into account values(7455,6700000,122,441,666);
insert into account values(7451,7700000,122,445,666);
insert into account values(7452,8700000,122,441,666);
insert into account values(7453,5700000,122,445,666);
insert into account values(7458,1400000,111,333,555);
insert into account values(7459,2700000,111,442,555);
insert into account values(7450,3290000,111,442,555);
insert into account values(8000,700,111,333,555);
insert into account values(500,700,111,442,666);
insert into account values(100,770,122,445,666);
select * from account


insert into savingacc values(555,34);
insert into savingacc values(666,56);
select * from savingacc

insert into currentacc values(666,5670000);
insert into currentacc values(555,5980000);
select * from currentacc

insert into customer values(777,'123456789v','tharushi n dewangi','kurunegala','0712345345',1234);
insert into customer values(888,'123456789v','naveen gunarathna','kurunegala','0712345345',1234);
insert into customer values(999,'123456789v','sayani nimesha','kurunegala','0712345345',1234);
insert into customer values(1010,'123456789v','navodya thenuwara','kurunegala','0712345345',1234);
insert into customer values(1111,'123456789v','heshani nanayakkara','kurunegala','0712345345',1234);
select * from customer

drop table belongsto 


insert into transaction_ values(1212,45000,'null','ATM','');
insert into transaction_ values(1313,45000,'null','ATM','');
insert into transaction_ values(1214,45000,'null','ATM','');
insert into transaction_ values(1315,45000,'null','ATM','');
insert into transaction_ values(1216,45000,'null','ATM','');
insert into transaction_ values(1317,45000,'null','ATM','');



select * from transaction_

insert into belongsto values(777,7452);
insert into belongsto values(888,7451);
insert into belongsto values(999,7455);
insert into belongsto values(1111,7453);
insert into belongsto values(1010,7867);
insert into belongsto values(777,7456);
insert into belongsto values(888,7454);
insert into belongsto values(999,7450);
insert into belongsto values(1111,7458);
insert into belongsto values(1010,7869);


select * from belongsto

insert into has values(7457,1212,'credit');
insert into has values(7456,1313,'debit');
insert into has values(7454,1214,'credit');
insert into has values(7455,1315,'debit');
insert into has values(7451,1216,'credit');
insert into has values(7452,1317,'debit');
insert into has values(7453,1313,'debit');
insert into has values(7458,1212,'credit');
insert into has values(7459,1313,'debit');
insert into has values(7450,1212,'credit');
insert into has values(8000,1212,'credit');
select * from has

insert into account values(8000,700,111,333,555);