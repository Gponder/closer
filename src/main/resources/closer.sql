create database closer;
use closer;

//User
create table t_user(
	id bigint primary key not null auto_increment,
	username varchar(20) not null unique, 
	password varchar(20) not null,
	gender int,
	birthday date,
	alias varchar(20),
	address varchar(100),
	phone varchar(11),
	qq varchar(11),
	wechar varchar(20),
	weibo varchar(30),
	registDate date,
	token varchar(32)
);

