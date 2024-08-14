select * from studetails;

create table studue(reg_no int primary key, stu_name varchar(20), paid_amount int, due_amount int, due_date date);

insert into studue values (101, 'raj', 12000, 8000, '2024-09-01'),
(102, 'mohan', 12000, 8000, '2024-09-01'),
(103, 'dilli', 12000, 8000, '2024-09-01'),
(104, 'ramesh', 12000, 8000, '2024-09-01'),
(105, 'joseph', 12000, 8000, '2024-09-01'),
(106, 'harish', 12000, 8000, '2024-09-01');

select * from studue;