USE sql9378764;

DROP TABLE IF EXISTS MOVIE;
CREATE TABLE MOVIE (
	MovieId	int not null,
    MovieName VARCHAR(20),
	Rating VARCHAR(12),
	primary key (MovieId)
);

INSERT INTO MOVIE (MovieId, MovieName, Rating)
VALUES
(10001,	'The Dark Knight Rises', '14A'),
(10002,	'Tenet', '14A'),
(10003,	'Dunkirk', '14A');

DROP TABLE IF EXISTS THEATRE;
CREATE TABLE THEATRE (
	TheatreId	int NOT NULL,
    TheatreName VARCHAR(20),
	Address VARCHAR(30),
	primary key (TheatreId)
);

INSERT INTO THEATRE (TheatreId, TheatreName, Address)
VALUES
(10001,	'The Global Theatre', '1995 Greenview Dr. NW'),
(10002,	'Sunset Cinema', '2903 Charles Ave. SE'),
(10003,	'Cineblast', '1111 Horton Rd. NE');


DROP TABLE IF EXISTS SHOWTIME;
CREATE TABLE SHOWTIME (
	ShowtimeId	int not null,
    dateTime VARCHAR(20),
	MovieId int not null,
    TheatreId int not null,
    Restricted boolean,
	primary key (ShowtimeId)
);

INSERT INTO SHOWTIME (ShowtimeId, dateTime, MovieId, TheatreId, Restricted)
VALUES
(10001,	'2020/11/30 14:00:00', 10001, 10001, false),
(10002,	'2020/12/15 16:30:00', 10002, 10001, false),
(10003,	'2020/12/30 18:00:00', 10002, 10002, true),
(10004,	'2020/12/25 12:00:00', 10003, 10003, false),
(10005,	'2020/12/12 14:00:00', 10001, 10003, false),
(10006,	'2020/12/05 14:00:00', 10002, 10001, false),
(10007,	'2020/12/10 14:00:00', 10003, 10002, false);

DROP TABLE IF EXISTS TICKET;
CREATE TABLE TICKET (
	TicketId	int not null,
    Price double,
	IssueDate VARCHAR(20),
    ShowtimeId int not null,
    SeatNumber VARCHAR(20),
	primary key (TicketId)
);

INSERT INTO TICKET (TicketId, Price, IssueDate, ShowtimeId, SeatNumber)
VALUES
(10001,	14.50, '2020/11/20 14:00:00', 10005, 'A11'),
(10002,	14.50, '2020/11/20 14:00:00', 10005, 'A12'),
(10003,	14.50, '2020/11/20 14:00:00', 10005, 'A13'),
(10004,	14.50, '2020/11/21 15:00:00', 10001, 'B15'),
(10005,	14.50, '2020/11/22 15:00:00', 10002, 'B15'),
(10006,	14.50, '2020/11/22 15:00:00', 10002, 'B16'),
(10007,	14.50, '2020/11/21 14:00:00', 10003, 'C15'),
(10008,	14.50, '2020/11/21 15:00:00', 10003, 'C15'),
(10009,	14.50, '2020/11/19 15:00:00', 10002, 'D15'),
(10010,	14.50, '2020/11/12 14:00:00', 10004, 'D12');

DROP TABLE IF EXISTS REGISTEREDUSER;
CREATE TABLE REGISTEREDUSERS (
	Username VARCHAR(20) not null,
	FName VARCHAR(20) default null,
    LName VARCHAR(20) default null,
    CreditCard VARCHAR(20) default null,
    Address VARCHAR(20) default null,
    PostalCode VARCHAR(20) default null,
    Email VARCHAR(20) default null,
	UserPassword  VARCHAR(20) default null,
    primary key (Username)
);

INSERT INTO REGISTEREDUSERS (Username, FName, LName, CreditCard, Address, Email)
VALUES
('Dog123', 'Mary', 'Smith', '2032 2212 3545 2345', '2679 Plumber Dr. NW', 'MarySmith@gmail.com'),
('JoeyMan', 'Joe', 'Joe', '2032 2512 3785 2225', '2321 Drive Dr. NW', 'JoeJoe@gmail.com'),
('MovieLover', 'Jack', 'White', '2231 2212 3525 2312', '5555 Lane Rd. NE', 'MoviesAreCool@yahoo.ca');

DROP TABLE IF EXISTS VOUCHER;
CREATE TABLE VOUCHER (
	VoucherId int not null,
    Amount double,
    primary key (VoucherId)
);

INSERT INTO VOUCHER (VoucherId, Amount)
VALUES
(10001, 14.50),
(10002, 12.33);