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


--1. Create a view to show the customer name, branch name, branch address, 
--and balance of top 3 customers of Sampath bank. 
-- The top 3 customers are the customers with the 3 highest balances in the Bank

create view topCustomerdetails(name,cusname,branchaddress,balance)
as
select top 4  b.name,c.name,b.address_,a.balance as maxbal
from branch b,customer c,account a,bank ba,belongsto bl
where a.code = b.code and ba.name ='sampath bank' and b.code=ba.code
and bl.accnum=a.accnum and bl.num=c.cusnum 
and a.balance in(select max(balance)
				 from account
				 )




--2. Create a view which shows the total number of deposits (i.e ‘Credits’) 
-- made by customers in different banks. 
create view showtotalNumOfDeposit(bank_name,total_deposit)
as
select b.name ,sum(t.amount)
from has h,account a,transaction_ t,branch br,bank b
where h.accnum=a.accnum and t.tid = h.tid and b.code=br.code
group by b.name 

select * from showtotalNumOfDeposit

--3. Create a function which returns the total of account balances 
--in a given branch in a given bank. 

create function ReturnTotalAccountBalance(@branch char(6),@bank char(12))returns int
as 
begin
declare @totalaccbal int
select @totalaccbal = sum(a.balance)
from branch br,bank b,account a
where b.code=br.code and a.code=br.code and br.name = @branch  and b.name = @bank
return @totalaccbal
end;

declare @resulttotalaccbal int
exec @resulttotalaccbal = ReturnTotalAccountBalance'malabe','sampath bank'
print 'total account balance :' 
print @resulttotalaccbal



--4. Create a function which returns the total of withdrawals(i.e ‘Debit’) 
-- made in a given year by a given customer using a given method (ex: ‘Teller’). 
create function ReturnTotalwithdrawals(@year int,@user int,@method char(3))returns int
as 
begin
declare @totalwithbal int
select @totalwithbal = sum(t.amount)
from has h,account a,transaction_ t,belongsto b,customer c
where h.accnum=a.accnum and t.tid = h.tid and b.num=c.cusnum and h.banktype ='debit' 
  and t.executedby = @method and c.cusnum = @user and datepart(year,t.dateandtime)= @year
return @totalwithbal
end;

declare @resulTotalwithdrawals int
exec @resulTotalwithdrawals = ReturnTotalwithdrawals 2020,7452,'ATM'
print @resulTotalwithdrawals
print'dew'

--5. Create a procedure to update a given account by a 
--given amount of money and given the operation (ex: ‘Credit’ or ‘Debit).

 create procedure updateaccinformation(@amount int,@opration char(6),@accnum int)
as 
begin


if (@opration = 'credit')
	begin
	update account 
	set account.balance=account.balance +@amount
	where account.accnum=@accnum
	end
else if(@opration = 'debit')	
	begin
	update account 
	set account.balance=account.balance -@amount
	where account.accnum=@accnum
	end
Else
	begin
	print 'Check again'
	print 'try again '
    end;
end;

exec updateaccinformation 1000,credit,7451

select * from account
select * from branch
select * from belongsto
select * from transaction_
select * from has
select * from account
select * from customer
--6. Create a procedure which is capable of transferring  
--a given amount of money between two given accounts
 create procedure transferringamount(@transferacc int,@receiveacc int,@amount int)
as 
begin
declare @seats int

	update account 
	set account.balance=account.balance +@amount
	where account.accnum=@receiveacc
	

	update account 
	set account.balance=account.balance - @amount
	where account.accnum=@transferacc

end;

exec transferringamount 7451,7450,1000

--7. Assuming that each account should have a minimum balance of Rs. 500, 
--create a trigger to ensure that 
--each withdrawal would not result in a balance below the above amount
alter table transaction_ 
add accnum  int references account
select * from transaction_ 

create trigger withdrawal
on transaction_
for insert
as
begin
	declare @bal int
	declare @withdowacc int
	select @bal = i.amount
	from inserted i
	select @withdowacc = a.balance
	from account a,belongsto b,transaction_ t,customer c
	where t.tid = a.accnum and b.num=c.cusnum
	print @withdowacc
	if(@withdowacc - @bal < 500)
	begin
	   rollback transaction
	   print 'check balance'
    end
end
insert into transaction_ values(8111,45000,'null','ATM','',8000);
insert into transaction_ values(7565,45000,'null','ATM','',500);
insert into transaction_ values(7564,45000,'null','ATM','',100);
insert into transaction_ values(7566,45000,'null','ATM','',100);
insert into transaction_ values(88,450,'null','ATM','',7453);
insert into transaction_ values(88,450,'null','ATM','');

select * from transaction_
--8. Assuming that the daily withdrawal limit via ‘ATM’ is 80000, create a trigger 
--to ensure that no more than Rs. 80,000 is withdrawn from an account. 
create trigger Dailwithdowlimit
on transaction_
for insert
as
begin
	declare @bal int
	declare @withdowacc int
	select @bal = i.amount
	from inserted i
	where executedby = 'ATM'
	
	if(@bal > 80000)
	begin
	   rollback transaction
	   print'cannot withdow'
	
	end  

end
insert into transaction_ values(8300,85000,'null','ATM','');

--9.  Create a trigger to update the balance column in the account table 
--whenever a transaction occurs based on the transaction type 
--(ex: If certain account is credited with some amount of money, 
--add that amount to the account table).
-- Note: Use the procedure you have used in question 5 to do this
create trigger updatebalanc
on account
for insert,update
as
begin
declare @amount int
declare @type int
declare @user int

select @amount from transaction_
select @type from transaction_
select @user from account

declare @total int
exec updateaccinformation @amount,@type,@user 


end;



select * from account
select * from branch
select * from belongsto
select * from transaction_
select * from has
select * from account
select * from customer