
create table customer
(
cusid varchar(5) primary key,
custname varchar(20),
addresscus varchar(20),
phone char(10),
loyaltypoint int,
)
drop table customer

insert into customer values('C100',' Ravi Perera','Colombo','0112123456',1200 );
insert into customer values('C101','Nimali Alwis','Gampaha','0332212345', 275 );
select* from customer
create table staff
(
staffid varchar(5) primary key,
staffname varchar(25),
phone char(10),
)
insert into staff values('S001','Kamal Silva','0718123456' );
insert into staff values('S002','Amila Namal','0714222222' );
select * from staff
create table supplier
(
supid varchar(5) primary key,
contactnane1 varchar(30),
contactnane2 varchar(30),
phone char(10),
addresssup varchar(30),
)
insert into supplier values('1 ',' Ceylon Biscuits',' Amal Ranjith','0112111111','Ratmalana' );
insert into supplier values('2 ',' Unilvers','Nadeeka Perera','0114555666','Borella' );
select * from supplier
create table product
(
proid varchar(5) primary key,
prodname varchar(20),
quty int check (quty>0),
unitprice float,
rol int,
suppliernum varchar(5) foreign key references supplier
)
insert into product values('P0001',' Lemon Puff', 22, 85, 20, 1 );
insert into product values('P0201',' Knor Soup', 8, 100, 10, 2 );
insert into product values( 'P0084','Lipton Ceylonta',12 ,125 ,15 ,2 );
insert into product values('P0222','chocolate fingers', 14, 50, 8 ,1 );
select * from product
create table sales
(
pid varchar(5) foreign key references product,
cid varchar(5) foreign key references customer,
sid varchar(5) foreign key references staff,
salesdate date default getdate(),
primary key(pid,cid,sid,salesdate),

)

insert into sales values('P0201','C100','S001','');
insert into sales values('P0222', 'C101', 'S002' ,'');
insert into sales values('P0084', 'C100','S001' ,'');
insert into sales values('P0201','C100' ,'S002'  ,'');
select * from sales