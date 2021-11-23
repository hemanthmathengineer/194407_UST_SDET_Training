create database demo1;
use demo1;
show databases;

create table student(id int,studentname varchar(20),course varchar(30));
show tables;

alter table student add email varchar(50);

describe student;

insert into student(id,studentname,course,email)
values(123,'mr.a','eee','hemanth@gmail.com');

insert into student(id,studentname,course,email)
values(124,'mr.b','ece','hanish@gmail.com');

insert into student(id,studentname,course,email)
values(125,'mr.c','cse','ramam@gmail.com');

insert into student(id,studentname,course,email)
values(126,'mr.d','mech','rossy@gmail.com');

insert into student(id,studentname,course)
values(127,'mr.e','chem');

describe student;

select id from student;
select studentname from student;
select course from student;
select email from student;


select * from student;

select * from student where email is null;

select * from student where course='eee';
select * from student where course='ece';
select * from student where course='cse';

select * from student where id = 123 and course="eee";
select * from student where id = 123 and course="eee";
select * from student where not studentname="hemanth";
select * from student where not studentname="mr.a";

select * from student where course in ('eee','cse');

select * from student where id between 124 and 125;

select * from student where email like "r%";

select * from student where email like "%@gmail.com";

select * from student where email like "%12%";



 

