create table car(
    id serial primary key,
    pts_number text
);

create table model(
    id serial primary key,
    model varchar(255)
);

create table car_model(
    id serial primary key,
    car_id int references car(id) unique,
    model_id int references model(id) unique
);