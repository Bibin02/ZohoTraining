-- Task 1 Practical(L1): Using SQL

-- 1. Open the postgres relational DBMS software and do the following

-- Using the SQL command create a DB for people management

-- Using the SQL command create a table called Details by having fields (name, adhaar number, phno,address)

-- Using the SQL command, Insert the values to the corresponding fields.

-- Using the SQL command, select the information from the table.

-- Using the SQL command Update the phone number from the table.

-- Using the SQL command Delete the updated phone number from the table.

create database peoplemgmt;

create table details (adhaar_no int primary key, pname varchar(50), phno varchar(15), address varchar(50));

insert into details values (1001, 'Person1', '9090909091', 'address1');
insert into details values (1002, 'Person2', '9090909092', 'address2');
insert into details values (1003, 'Person3', '9090909093', 'address3');
insert into details values (1004, 'Person4', '9090909094', 'address4');
insert into details values (1005, 'Person5', '9090909095', 'address5');

update details set address = 'updated address' where pname = 'Person2';

delete from details where phno = '9090909093';

select * from details;

drop table details;