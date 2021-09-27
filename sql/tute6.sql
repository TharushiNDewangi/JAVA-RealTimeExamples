Create table Movie
(
	title char(30), 
	year int,
	length float,
	language char(15), 
	filmtype char(1),
	DirectorName varchar(15)
	primary key (title,year)
)

insert into Movie values('Spider-man',2018,2.5,'English','F','Jon Watts')
insert into Movie values('Black Panther',2018,3,'English','F','Ryan Coogler')
insert into Movie values('Avengers',2018,3,'English','F','Anthony Russo')
insert into Movie values('Ghost in Shell', 2017, 2.5,'English','D','Rupert Sanders')
insert into Movie values('Jurrasic World',2018,2.75,'English','D','Colin Trevorrow')
insert into Movie values('Passengers',2016,2.75,'English','F','Morten Tyldum')

Create table MovieStar
(
	name char(25) primary key,
	country varchar(40),
	gender char(1),
	birthdate date
)

Insert into MovieStar values('Tom Holland','England','M','1-Jun-1996')
Insert into MovieStar values('Robert Downey',' ','M','4-Apr-1963')
Insert into MovieStar values('Chadwick Boseman','America','M','29-Nov-1977')
Insert into MovieStar values('Scarlett Johansson','America','F','22-Nov-1984')
Insert into MovieStar values('Chris Pratt','England','M','21-Jun-1979')
Insert into MovieStar values('Bryce Howard','America','F','2-Mar-1981')
Insert into MovieStar values('Jennifer Lawrence','America','F','15-Aug-1990')

Create table StarsIn 
(
	movieTitle char(30), 
	movieYear int,
	starname char(25), 
	role varchar(15),
	primary key (movieTitle,movieYear,starname),
	foreign key (movieTitle,movieYear) references Movie,
	foreign key (starname) references MovieStar
)

insert into StarsIn values('Spider-man',2018,'Tom Holland','lead')
insert into StarsIn values('Spider-man',2018,'Robert Downey','support')
insert into StarsIn values('Black Panther',2018,'Chadwick Boseman','lead')
insert into StarsIn values('Black Panther',2018,'Robert Downey','support')
insert into StarsIn values('Avengers',2018,'Robert Downey','lead')
insert into StarsIn values('Avengers',2018,'Chadwick Boseman','lead')
insert into StarsIn values('Avengers',2018,'Scarlett Johansson','lead')
insert into StarsIn values('Ghost in Shell',2017,'Scarlett Johansson','lead')
insert into StarsIn values('Jurrasic World',2018,'Chris Pratt','lead')
insert into StarsIn values('Jurrasic World',2018,'Bryce Howard','lead')
insert into StarsIn values('Passengers',2016,'Chris Pratt','lead')
insert into StarsIn values('Passengers',2016,'Jennifer Lawrence','lead')

create table Theater
(
	theaterName varchar(20) primary key,
	country varchar (40), 
	city varchar (20), 
	capacity int 
)

insert into Theater values('Beverly','America','LA',300)
insert into Theater values('Electric','England','London',275)
insert into Theater values('Grand Rex','France','Paris',300)
insert into Theater values('Nitehawk','America','New York',200)
insert into Theater values('Cinnemaworld','Australia','Melbourne',250)

Create table Show 
(
showId int primary key,
movieTitle char (30),
theaterName varchar(20),
datetime datetime, 
ticketPrice real, 
spectators  int
)

insert into Show values(1,'Spider-man','Electric','1-Jan-2018',200,275)
insert into Show values(2,'Spider-man','Grand Rex','1-Jan-2018',200,200)
insert into Show values(3,'Avengers','Grand Rex','1-Apr-2018',200,98)
insert into Show values(4,'Black Panther','Beverly','1-Jan-2018',200,205)
insert into Show values(5,'Black Panther','Grand Rex','1-Jan-2018',300,300)
insert into Show values(6,'Passengers','Nitehawk','1-Jan-2018',200,176)
insert into Show values(7,'Jurrasic World','Nitehawk','1-Jan-2018',200,176)
insert into Show values(8,'Black Panther','Nitehawk','1-Jan-2018',200,219)
insert into Show values(9,'Ghost in Shell','Cinnemaworld','1-Jan-2018',200,101)
insert into Show values(10,'Black Panther','Grand Rex','1-Jan-2018',200,200)
insert into Show values(11,'Jurrasic World','Cinnemaworld','1-Jan-2018',200,188)

create table Booking
(
	showId int,
	custName varchar(25),
	numTickets int,
	primary key(showId,custName),
	Foreign key (showId) references Show(showId)
)


--1. Create a view to show the title of the movie being shown, 
--theater name, country and city for shows which the theater is fully booked
create view showdetails
as
select s.movieTitle,s.theaterName,t.country,t.city
from Theater t,Show s
where s.theaterName=t.theaterName and s.spectators = t.capacity

select * from showdetails
--2. Create a view to show the name, country, and number of movies
-- each actor has starred in. 
create view startdetails(Name,country,numberofmovies)
as
select m.name,m.country ,count(s.movieTitle)
from MovieStar m,StarsIn s
where m.name=s.starname
group by m.name,m.country 

select * from startdetails

--3. Create a function which returns the total earning given a movie title. 
create function displaytotalearnings(@title char(20))returns int
as 
begin
declare @totalearnings int
select @totalearnings = sum(s.ticketPrice * s.spectators)
from Show s
where s.movieTitle=@title
return @totalearnings
end;

select * from Show
declare @result int
exec @result = displaytotalearnings 'Spider-man'
print @result

--4. Create a function which returns the number of remaining seats in a given show. 
create function Display_Remaining_Seats(@showid int)returns int
as 
begin
declare @remainingSeats int
select @remainingSeats = t.capacity - s.spectators
from Show s,Theater t
where s.showId=@showid and s.theaterName=t.theaterName
return @remainingSeats
end;
select * from Theater
select * from Show
declare @resultSeat int
exec @resultSeat = Display_Remaining_Seats 3
print @resultSeat

--5. Create a stored procedure which is capable of inserting a booking to the booking table.
-- The procedure should accept the show id, customer name and number of tickets as 
-- the parameters and it should update the number of spectators in the show table. 
create procedure insertingbook(@showid int, @cname char(20), @numberoftickets int)
as
begin
declare @seats int
exec @seats = Display_Remaining_Seats @showid
if (@seats >= @numberoftickets)
	begin
	insert into Booking values(@showid, @cname, @numberoftickets)

	update Show 
    set spectators = spectators + @numberoftickets 
	where showId = @showid
	end;
end;
select * from Show
select * from Booking
select * from Show
exec insertingbook 3,'dew',20

--mytry
create procedure insertingbookOrElse(@showid int, @cname char(20), @numberoftickets int)
as
begin
declare @seats int
exec @seats = Display_Remaining_Seats @showid
if (@seats >= @numberoftickets)
	begin
	insert into Booking values(@showid, @cname, @numberoftickets)

	update Show 
    set spectators = spectators + @numberoftickets 
	where showId = @showid
	end;
Else
	begin
	print 'no seats'
	print 'sorry '
	print 'try again '
    end;
end;
select * from Show
select * from Booking
select * from Show
exec insertingbookOrElse 3,'dewelse',2000

--6. Assume that each movie star is assigned with a rank based on the number of lead roles
-- he/she had played. Create a procedure to update a rank attribute added to the MovieStar
-- table for each movie star. 
select * from MovieStar
alter table MovieStar add rank int

create procedure updateinfo
as 
begin
	update MovieStar
	set MovieStar.rank =subtable.total
	from (
		select s.starname,count(s.movieTitle) as total
		from StarsIn s
		where s.role = 'lead'
		group by s.starname
			) as subtable
	where MovieStar.name = subtable.starname
end;

exec updateinfo
select * from MovieStar
--my wrong it
create procedure assignedrank(@starName char(20), @role char(20), @numberoftickets int)
as
begin
declare @movierole char(20)
declare @sum int
if (@movierole = 'lead')
	begin
	
	
	@sum = @sum +1;

	update Show 
    set spectators = spectators + @numberoftickets 
	where showId = @showid
	end;
end;

select * from MovieStar
select * from StarsIn
--7. Create a trigger to ensure that the number of spectators in the show table
-- does not exceed the capacity of the theater its shown in. 
create trigger checkTheater
on Booking
for insert
as
begin
	declare @show int
	declare @seatremaing int
	select @show = i.showId
	from inserted i
	exec @seatremaing = Display_Remaining_Seats @show

	if(@seatremaing <= 0)
	   rollback transaction

end

	insert into Booking values(2 ,'hohn smith',5)
	insert into Booking values(5 ,'lix rex',2)

select * from Show
select * from Theater
select * from Booking
--8. Assuming that the Movie Star table already store the rank of each movie star
-- based on the criteria in 5, write a trigger to update the rank
-- when the movie star appears in a new movie.
create trigger updateRank
on StarsIn
for insert,update
as
begin
declare @name char(50)
declare @total int

select @total = count(*)
from inserted
where role = 'lead'

select @name
from inserted i

update MovieStar 
set rank = rank + @total
where name = @name

end;
select * from StarsIn