create database jforceassignmnet;

use jforceassignmnet;


create table user(id int auto_increment,firstname varchar(100), lastname varchar(100),email varchar(100) unique,mobile_no varchar(100),password varchar(100),active boolean,created_date datetime ,created_by varchar(100),last_modified_date datetime, last_modified_by varchar(100),primary key(id));

create table comment 
(id int auto_increment 
,comment varchar(500),
user_id int ,
foreign key(user_id) references user(id),
active boolean,created_date datetime ,created_by varchar(100),last_modified_date datetime, last_modified_by varchar(100),primary key(id));