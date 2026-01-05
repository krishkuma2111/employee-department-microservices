drop table if exists department;

drop table if exists employee;

create table employee(
    id int generated always as identity primary key,
    name varchar(15),
    salary double precision,
    departmentId int
);

create table department(
    id int generated always as identity primary key,
    departmentId int, 
    name varchar(15)
);


