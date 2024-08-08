create table users (uname varchar(20) primary key, pass varchar(20));

create table voters (vid varchar(50) primary key, party int, foreign key(party) references parties(party_code));

create table parties (party_code int primary key, party_name varchar(20));

insert into users values ('admin', '123');

insert into parties values (1, 'Party1');
insert into parties values (2, 'Party2');
insert into parties values (3, 'Party3');
insert into parties values (4, 'Party4');
insert into parties values (5, 'Party5');

insert into voters values ('52011'), ('52012'), ('52013'), ('52014'), ('52015'), 
	('52016'), ('52017'), ('52018'), ('52019'), ('52020');

update voters set party = 1 where vid = '52001';

delete from voters where vid = '53021';

select parties.party_name, parties.party_code, count(voters.party) as total_voters from parties
	left join voters on parties.party_code = voters.party group by parties.party_code
	order by total_voters desc;

SELECT 
    parties.party_name, 
    parties.party_code, 
    COUNT(voters.party) AS total_voters
FROM 
    parties
LEFT JOIN 
    voters ON parties.party_code = voters.party
GROUP BY 
    parties.party_name, 
    parties.party_code
order by 
	total_voters desc;


select * from users;
select * from parties;
select * from voters;
