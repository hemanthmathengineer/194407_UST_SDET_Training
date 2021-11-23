create database bms1;
drop database bms1;
use bms1;

show databases;

create table customer_info(customer_id int,
customer_name varchar(20),
dob date,
guardian_name varchar(20),
contact bigint(10),
email varchar(20),
gender varchar(10), 
married varchar(10),
identification_type varchar(20),
id_number varchar(20),
citizenship varchar(10),
constraint cust_pers_info_pk primary key(customer_id));

show tables;

create table customer_reference_info(

customer_id int,
reference_acc_name varchar(20),
reference_acc_no bigint(20),
reference_acc_address varchar(50),
relation varchar(25),
constraint cust_pers_info_pk primary key(customer_id),
constraint cust_pers_info_fk foreign key(customer_id) references 



