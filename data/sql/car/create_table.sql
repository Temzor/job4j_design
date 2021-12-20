-- Создание таблиц carcase, engine, transmission, car.
CREATE TABLE carcase (
    id serial PRIMARY KEY,
    name VARCHAR(255)
);

CREATE TABLE engine (
    id serial PRIMARY KEY,
    name VARCHAR(255),
		fuel VARCHAR(255)
);

CREATE TABLE transmission (
    id serial PRIMARY KEY,
    name VARCHAR(255)
);

CREATE TABLE car (
    id serial PRIMARY KEY,
    name VARCHAR(255),
		model VARCHAR(255),
		carcase_id INT REFERENCES carcase(id) NOT NULL,
		engine_id INT REFERENCES engine(id) NOT NULL,
		transmission_id INT REFERENCES transmission(id) NOT NULL
);




