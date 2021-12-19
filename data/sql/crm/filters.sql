-- Создание таблиц type и product
CREATE TABLE type (
    id serial PRIMARY KEY,
		name VARCHAR(255)
);		

CREATE TABLE product (
    id serial PRIMARY KEY,
		name VARCHAR(255),
    type_id INT REFERENCES type(id),
		expired_date TIMESTAMP,
		price INT
);		

-- Заполнение таблицы type
INSERT INTO type (name)
VALUES ('СЫР');
INSERT INTO type (name)
VALUES ('МЯСО');
INSERT INTO type (name)
VALUES ('МОЛОКО');


-- Заполнение таблицы product
INSERT INTO product (name, type_id, expired_date, price)
VALUES ('Колбасный сыр', 1, '2022-01-20 18:00:00', 400);
INSERT INTO product (name, type_id, expired_date, price)
VALUES ('Сыр моцарелла', 1, '2021-01-20 18:00:00', 900);
INSERT INTO product (name, type_id, expired_date, price)
VALUES ('Сыр плавленный', 1, '2020-09-20 18:00:00', 300);

INSERT INTO product (name, type_id, expired_date, price)
VALUES ('Баранина', 2, '2021-09-20 18:00:00', 1300);
INSERT INTO product (name, type_id, expired_date, price)
VALUES ('Говядина', 2, '2022-09-20 18:00:00', 1150);
INSERT INTO product (name, type_id, expired_date, price)
VALUES ('Свинина', 2, '2020-09-21 18:00:00', 930);

INSERT INTO product (name, type_id, expired_date, price)
VALUES ('Кефир', 3, '2021-09-20 18:00:00', 150);
INSERT INTO product (name, type_id, expired_date, price)
VALUES ('Ряженка', 3, '2020-09-20 18:00:00', 175);
INSERT INTO product (name, type_id, expired_date, price)
VALUES ('Молоко', 3, '2022-09-20 18:00:00', 110);
INSERT INTO product (name, type_id, expired_date, price)
VALUES ('Мороженое пломбир', 3, '2022-09-20 18:00:00', 60);
INSERT INTO product (name, type_id, expired_date, price)
VALUES ('Мороженое шоколадное', 3, '2020-09-20 18:00:00', 70);

-- Фильтры
-- Написать запрос получение всех продуктов с типом "СЫР"
SELECT *
FROM product p
JOIN type t
ON t.id = p.type_id
WHERE t.name = 'СЫР';

-- Написать запрос получения всех продуктов, у кого в имени есть слово "мороженое"
SELECT *
FROM product
WHERE name LIKE '%Мороженое%';

-- Написать запрос, который выводит все продукты, срок годности которых уже истек
SELECT *
FROM product 
WHERE expired_date < NOW();

-- Написать запрос, который выводит самый дорогой продукт.
SELECT *
FROM product 
ORDER BY price DESC
LIMIT 1;

-- OR
SELECT *
FROM product
WHERE price = (SELECT max(price) FROM product)

-- Написать запрос, который выводит для каждого типа количество продуктов к нему принадлежащих. В виде имя_типа, количество
SELECT t.name AS type_name, COUNT(p.name) AS count_products
FROM product AS p
JOIN type AS t
ON p.type_id = t.id
GROUP BY t.name;

-- Написать запрос получение всех продуктов с типом "СЫР" и "МОЛОКО"
SELECT *
FROM product p
JOIN type t
ON t.id = p.type_id
WHERE t.name = 'СЫР' OR t.name = 'МОЛОКО';

-- Написать запрос, который выводит тип продуктов, которых осталось меньше 10 штук. Под количеством подразумевается количество продуктов определенного типа. Например, если есть тип "СЫР" и продукты "Сыр плавленный" и "Сыр моцарелла", которые ему принадлежат, то количество продуктов типа "СЫР" будет 2. 
SELECT t.name AS type_name, COUNT(p.name) AS count_products
FROM product AS p
JOIN type AS t
ON p.type_id = t.id
GROUP BY t.name;
HAVING COUNT(t.name) < 10;

-- Вывести все продукты и их тип.
SELECT t.name AS type_name, p.name AS name_product
FROM product AS p
JOIN type AS t
ON p.type_id = t.id

-- OR

SELECT *
FROM product AS p
JOIN type AS t
ON p.type_id = t.id