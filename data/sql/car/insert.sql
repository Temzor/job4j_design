-- Заполняю таблицу carcase.
INSERT INTO carcase (name)
VALUES('hatchback'), ('sedan'), ('cabriolet');

-- Заполняю таблицу engine.
INSERT INTO engine (name, fuel)
VALUES('Electric', 'Electric Energy'), ('V8 Turbo', 'Bezin'), ('1,6 DCi', 'diesel');

-- Заполняю таблицу transmission.
INSERT INTO transmission (name)
VALUES('DSG'), ('Auto'), ('Manual');

-- Заполняю таблицу car.
INSERT INTO car (name, model, carcase_id, engine_id, transmission_id)
VALUES('Volkswagen', 'Golf 8', 1, 2, 1), 
('BMW', '320Cd', 3, 3, 3),
('Tesla', 'Model X', 2, 1, 2);

