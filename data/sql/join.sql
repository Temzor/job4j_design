-- Создание таблиц departments и emploers.
CREATE TABLE departments (
    id serial PRIMARY KEY,
    name VARCHAR(255)
);

CREATE TABLE emploers(
    id serial PRIMARY KEY,
    name VARCHAR(255),
    department_id int references owners(id)
);

-- Заполнение таблицы departments.
INSERT INTO departments(name) VALUES ('Depart 1');
INSERT INTO departments(name) VALUES ('Depart 2');
INSERT INTO departments(name) VALUES ('Depart 3');
INSERT INTO departments(name) VALUES ('Depart 4');
INSERT INTO departments(name) VALUES ('Depart 5');


-- Заполнение таблицы emploers
INSERT INTO emploers(name, department_id) 
VALUES ('Till Lindemann', 1);
INSERT INTO emploers(name, department_id) 
VALUES ('Richard Z. Kruspe Bernstein', 2);
INSERT INTO emploers(name, department_id) 
VALUES ('Paul H. Landers', 3);
INSERT INTO emploers(name, department_id) 
VALUES ('Oliver «Ollie» Riedel', null);
INSERT INTO emploers(name, department_id) 
VALUES ('ChrIStian Flake Lorenz', null);
INSERT INTO emploers(name, department_id) 
VALUES ('ChrIStoph «Doom» Schneider', 1);

-- Выполнить запросы с left, rigth, full, cross соединениями.
-- Free
SELECT * 
FROM emploers em
JOIN departments d
ON em.department_id = d.id;

-- Left
SELECT * 
FROM emploers em
LEFT JOIN departments d
ON em.department_id = d.id;

-- Right
SELECT * 
FROM departments d 
RIGHT JOIN emploers em
ON  d.id = em.department_id;

-- Full
SELECT * 
FROM emploers em
FULL JOIN departments d
ON em.department_id = d.id;

-- Cross
SELECT * 
FROM emploers em
CROSS JOIN departments d;

-- Используя LEFT JOIN найти департаменты, у которых нет работников.
SELECT * 
FROM departments d 
LEFT JOIN emploers em
ON  d.id = em.department_id
WHERE em.department_id IS NULL;

-- Используя left и right join написать запросы, которые давали бы одинаковый результат.
-- Left
SELECT * 
FROM emploers em
LEFT JOIN departments d
ON em.department_id = d.id;

-- OR without NULL
SELECT *
FROM departments d
LEFT JOIN emploers e 
ON e.department_id = d.id
WHERE e.department_id IS NOT NULL;

-- Right
SELECT * 
FROM departments d 
RIGHT JOIN emploers em
ON  d.id = em.department_id;

-- OR without NULL
SELECT *
FROM departments d
right join emploers e 
ON e.department_id = d.id  
WHERE e.department_id IS NOT NULL;

-- Создать таблицу teens с атрибутами name, gender и заполнить ее. Используя cross join составить все возможные разнополые пары.
-- Создание таблицы teens.
CREATE TABLE teens (
    id serial PRIMARY KEY,
    name VARCHAR(255),
		sex BOOL
);

-- Заполняем таблицу 
INSERT INTO teens(name, sex) 
VALUES ('Harry JacksON', TRUE);
INSERT INTO teens(name, sex) 
VALUES ('Mark Gutierrez', TRUE);
INSERT INTO teens(name, sex) 
VALUES ('Susan Brown', FALSE);
INSERT INTO teens(name, sex) 
VALUES ('June Miles', FALSE);

-- Cross
SELECT (t1.name || ' and  ' || t2.name) as "pair" 
FROM teens t1
CROSS JOIN teens t2
WHERE t1.sex <> t2.sex and t1.sex = TRUE
ORDER BY t1.name;


