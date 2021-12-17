CREATE TABLE products (
id serial PRIMARY KEY,
createtime timestamp(6) NOT NULL,
name text COLLATE "pg_catalog"."default",
price int8 NOT NULL,
mark bool NOT NULL DEFAULT false);

INSERT INTO products(createtime, name, price, mark) 
VALUES(now(), 'Фуа-гра', 100500, TRUE);

UPDATE products SET price = 80000 WHERE name like ('Фуа-гра');

DELETE FROM products WHERE id BETWEEN 0 and 10;
