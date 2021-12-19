create table fauna (
    id serial primary key,
    name text,
    avg_age int,
    discovery_date date
);

INSERT INTO fauna (name, avg_age, discovery_date)
VALUES ('fish', 12000, '1920-01-01');

INSERT INTO fauna (name, avg_age, discovery_date)
VALUES ('wild pig', 44000, '1930-01-01');

INSERT INTO fauna (name, avg_age, discovery_date)
VALUES ('bird', 20000, '1960-01-01');

INSERT INTO fauna (name, avg_age, discovery_date)
VALUES ('crocodile', 90000, '1840-01-01');

INSERT INTO fauna (name, avg_age, discovery_date)
VALUES ('tartile', 1000000, '1980-01-01');

INSERT INTO fauna (name, avg_age, discovery_date)
VALUES ('varan', 19000, NULL);



SELECT * FROM fauna WHERE name like '%fish%';
SELECT * FROM fauna WHERE avg_age BETWEEN 10000 AND 21000;
SELECT * FROM fauna WHERE discovery_date < '1950-01-01';