-- Создаем таблицы
create table devices(
    id serial primary key,
    name varchar(255),
    price float
);

create table people (
    id serial primary key,
    name varchar(255)
);

create table devices_people(
    id serial primary key,
    device_id int references devices(id),
    people_id int references people(id)
);

--Заполняет таблицу devices.
INSERT INTO devices (name, price)
VALUES ('smartphone', 3000.30);
INSERT INTO devices (name, price)
VALUES ('table', 22000.50);
INSERT INTO devices (name, price)
VALUES ('laptop', 58000.80);

--Заполняет таблицу people.
INSERT INTO people (name)
VALUES ('Till Lindemann');
INSERT INTO people (name)
VALUES ('Oliver «Ollie» Riedel');
INSERT INTO people (name)
VALUES ('Christoph «Doom» Schneider');

--Заполняет таблицу devices_people (many-to-many).
INSERT INTO devices_people (people_id, device_id)
VALUES (1, 1);
INSERT INTO devices_people (people_id, device_id)
VALUES (2, 1);
INSERT INTO devices_people (people_id, device_id)
VALUES (2, 2);
INSERT INTO devices_people (people_id, device_id)
VALUES (3, 1);
INSERT INTO devices_people (people_id, device_id)
VALUES (3, 2);
INSERT INTO devices_people (people_id, device_id)
VALUES (3, 3);

--Используя агрегатные функции вывести среднюю цену устройств.
SELECT AVG(price) FROM devices;


--Используя группировку вывести для каждого человека среднюю цену его устройств.
SELECT p.name, AVG(d.price)
FROM devices_people dp
JOIN people p
ON dp.people_id = p.id
JOIN devices d
ON dp.device_id = d.id
GROUP BY p.name;

--Дополнить запрос п.4. условием, что средняя стоимость устройств должна быть больше 5000.
SELECT p.name, AVG(d.price)
FROM devices_people dp
JOIN people p
ON dp.people_id = p.id
JOIN devices d
ON dp.device_id = d.id
GROUP BY p.name
HAVING avg(d.price) > 5000;

