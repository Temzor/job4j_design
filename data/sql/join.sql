


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


