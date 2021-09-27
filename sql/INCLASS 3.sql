//1
create table employeein3
(
eid int,
ename varchar(39) not null,
salary real,
age int,
constraint salary_ckin3 check(salary > 0),
constraint emp_pkin3 primary key (eid),
)

select *
from employeein3
//2
create table deptmentin3
(
did varchar(20),
budget real,
managerid int references employeein3,
constraint deptmentin3_pk primary key (did),
);
select *
from deptment
//3
create table worksinin3
(
eid int,
did varchar(20),
pcttime int,
constraint worlinin3_pk1 primary key (eid,did),
constraint worlinin3_fk foreign key (eid) references employeein3,
constraint worlinin3_fk1 foreign key (did) references deptmentin3,

)

select *
from worksinin3
//4
insert into employeein3 values(1001,'Ruwan',33,40000)
select *
from employeein3
//5

alter table employeein3 add hire_date datetime default getdate()
select *
from employeein3
//miss
select getdate()
alter table employeein3 add hiredate datetime default getdate()
//when we add new row getdate effected
insert into employeein3(eid,ename,age,salary) values(1002,'niuran',30,45500)
//6
update employeein3
SET hiredate = '1-1-2010'
where eid=1000

select *
from employeein3
//7
delete employeein3
where eid=1000
select *
from employeein3

//8
alter table employeein3 drop constraint DF__employeei__hired__5EDF0F2E
alter table employeein3
drop column hiredate

select *
from employeein3
//9
drop table employeein3

//10
select ename,salary
from employeein3