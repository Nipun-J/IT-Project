create table hotel_management.customer (
Cid VARCHAR(2) primary key, 
Cname VARCHAR(45) NOT NULL,
CEmail VARCHAR(45) NOT NULL,
NIC VARCHAR(10) NOT NULL,
CContact int NOT NULL

);


create table hotel_management.Reservation (
RecID VARCHAR(2)  primary key NOT NULL,
CusID VARCHAR(2) NOT NULL,
checkIn date NOT NULL,
checkOut date ,
Rno int,
Hname VARCHAR(1),
type_ VARCHAR(3),
foreign key (CusID) references hotel_management.customer(Cid),
foreign key (Rno) references hotel_management.Rooms(Room_Number),
foreign key (Hname) references hotel_management.Halls(HallName)
);




create table hotel_management.Receptionist (
EID char(4) primary key NOT NULL,
UserName VARCHAR(45) NOT NULL,
RPassword varchar(45) NOT NULL
);



create table hotel_management.Halls (
HallName VARCHAR(1) primary key NOT NULL,
price float,
status_ boolean
);

create table hotel_management.Rooms (
Room_Number int primary key NOT NULL,
price float,
status_ boolean
);


insert into hotel_management.customer(Cname,CEmail,CContact) values('sarath','sarath@gmail.com',725284260);
insert into hotel_management.customer(Cname,CEmail,CContact) values('rath','rath@gmail.com',779684260);

insert into hotel_management.Rooms values(001,3500,false);
insert into hotel_management.Rooms values(002,3500,false);
insert into hotel_management.Rooms values(003,3500,false);
insert into hotel_management.Rooms values(004,3500,false);

insert into hotel_management.Halls values('A',9500,false);
insert into hotel_management.Halls values('B',9500,false);
insert into hotel_management.Halls values('C',9500,false);

UPDATE Rooms SET status_= FALSE WHERE Room_Number = 001;

insert into hotel_management.Reservation (RecID,CusID,checkIn,checkOut,Rno,Hname) values('R1','c1','2020-10-18','2020-10-25',003,null) ;
insert into hotel_management.Reservation (RecID,CusID,checkIn,checkOut,Rno,Hname) values('R2','c2','2020-09-18','2020-09-25',002,null) ;
insert into hotel_management.Reservation (RecID,CusID,checkIn,checkOut,Rno,Hname) values ('R3','c2','2020-10-03',null,null,'B');
insert into hotel_management.Reservation (RecID,CusID,checkIn,checkOut,Rno,Hname) values('R2','c2','2020-09-18','2020-09-25',002,null) ;


insert into hotel_management.customer (Cid,Cname,CEmail,NIC,Ccontact) values ('c1','etharu','etharu@gmail.com','982832810V',0123456789);
insert into hotel_management.customer (Cid,Cname,CEmail,Ccontact) values ('c2','sdczdv','dFSu@gmail.com',0123456789)  ;
insert into hotel_management.customer (Cid,Cname,CEmail,Ccontact) values ('c3','faris','faris@gmail.com',0345547771);


insert into hotel_management.ResInput (Cname,CEmail,CContact,checkIn,checkOut) values ('sarath','sarath@gmail.com',725284260,'2020-09-18','2020-09-25');

delete from hotel_management.Rooms where Room_Number=1;
delete from hotel_management.Reservation where Rno=001;
delete from hotel_management.customer where Cid='C2';

select * from hotel_management.customer;
select * from hotel_management.Rooms;
select * from hotel_management.Halls;
select * from hotel_management.Reservation;
select * from hotel_management.ResInput;


UPDATE Reservation SET RecID = 'R2', checkIn ='2020-10-18' , checkOut ='2020-10-20'  WHERE Rno = '2';

SELECT customer.Cname,customer.CEmail,customer.CContact,Reservation.checkIn,Reservation.checkOut,Reservation.Rno
from customer,Reservation  
where customer.Cid = Reservation.CusID AND Rno='3';

 SELECT customer.Cid,customer.Cname,customer.CEmail,customer.CContact,Reservation.checkIn,Reservation.checkOut
 from customer,Reservation
 where customer.Cid = Reservation.CusID;


SELECT customer.Cname,customer.CEmail,customer.CContact,Reservation.checkIn,Reservation.checkOut from customer,Reservation where customer.Cid = Reservation.CusID AND Rno ='3';
SELECT customer.Cname,customer.CEmail,customer.CContact,Reservation.checkIn from customer,Reservation where customer.Cid = Reservation.CusID AND Hname ='B';
                 

select c.Cname,c.CEmail,c.CContact,R.checkIn,R.checkOut
from hotel_management.customer c,hotel_management.Reservation R
where c.Cid =R.CusID AND Rno=3;