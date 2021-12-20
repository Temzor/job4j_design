-- 1) Вывести список всех машин и все привязанные к ним детали.
SELECT c.name as Марка, c.model as Модель, ca.name as Тип_кузова, e.name as Тип_двигателя, e.fuel as Тип_топлива, t.name as КПП
FROM car c
JOIN carcase ca ON c.carcase_id = ca.id
JOIN engine e ON c.engine_id = e.id
JOIN transmission t ON c.transmission_id = t.id;

-- 2) Вывести отдельно детали (1 деталь - 1 запрос), которые не используются НИ в одной машине, кузова, двигатели, коробки передач.
SELECT ca.name as Тип_кузова
FROM carcase ca
LEFT JOIN car c
ON ca.id = c.carcase_id
WHERE c.carcase_id IS NULL;

SELECT e.name as Тип_двигателя 
FROM engine e
LEFT JOIN car c
ON e.id = c.engine_id
WHERE c.engine_id IS NULL;


SELECT t.name as КПП
FROM transmission t
LEFT JOIN car c
ON t.id = c.transmission_id
WHERE c.transmission_id IS NULL;