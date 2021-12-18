create table cheque(
    id serial primary key,
    name varchar(255)
);

create table position(
    id serial primary key,
    name varchar(255),
		price money,
		cheque_id int references cheque(id)
		
);