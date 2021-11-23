create database demo2;
use demo2;
create table boys(id int,boyname varchar(20),skills varchar(20));
create table girls(id int,girlname varchar(20),skills varchar(20));
create table common(id int,studentname varchar(20),skills varchar(20));

insert into boys(id,boyname,skills) values (100,'ranjan','play,dance and jump');
insert into boys(id,boyname,skills) values (101,'heman','play');
insert into boys(id,boyname,skills) values (102,'ash','dance and jump');
insert into boys(id,boyname,skills) values (103,'ramama','jump');
insert into boys(id,boyname,skills) values (104,'steve','eat');
insert into boys(id,boyname,skills) values (105,'steve');

insert into girls(id,girlname,skills) values (200,'rani1','slide');
insert into girls(id,girlname,skills) values (201,'rani2','play,eat');
insert into girls(id,girlname,skills) values (202,'rani3','run');
insert into girls(id,girlname,skills) values (203,'rani4','sing');
insert into girls(id,girlname,skills) values (204,'rani8','play, sing');
insert into girls(id,girlname,skills) values (206,'rani9','hurry');
insert into girls(id,girlname) values (207,'rani97');
insert into girls(id,girlname) values (208,'rani98');
insert into girls(id,girlname) values (209,'rani99');

select * from boys;
truncate table boys;

select * from girls;
truncate table girls;


select id,boyname,skills from boys order by id; 

select id,boyname,skills from boys order by id desc;

select skills from boys group by skills;
select skills from girls group by skills;

select skills,avg(id) from girls;

select id,boyname,sum(skills) from boys group by id,boyname having sum(skills)>'play';

select boys.id,boys.boyname,boys.skills from boys inner join girls on boys.skills=girls.skills;




