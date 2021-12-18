create table birth_certificate(
    id serial primary key,
    state_body text,
		area text,
		sex bool
		
);
create table people(
    id serial primary key,
    name varchar(255),
		certificate_id int references birth_certificate(id) unique
);
