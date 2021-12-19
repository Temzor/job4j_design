CREATE TABLE model (
    id serial PRIMARY KEY,
    name VARCHAR(255),
	  country VARCHAR(255)
);		

CREATE TABLE car (
    id serial PRIMARY KEY,
    name VARCHAR(255),
    model_id INT REFERENCES model(id)
);		

INSERT INTO model (name, country)
VALUES ('Alfa Romeo', 'Italy');
INSERT INTO model (name, country)
VALUES ('BMW', 'Germany');
INSERT INTO model (name, country)
VALUES ('Nissan', 'Japan');


INSERT INTO car (name, model_id)
VALUES ('MiTo', 1);
INSERT INTO car (name, model_id)
VALUES ('Giulia', 1);
INSERT INTO car (name, model_id)
VALUES ('4C', 1);



INSERT INTO car (name, model_id)
VALUES ('X6', 2);
INSERT INTO car (name, model_id)
VALUES ('Z4', 2);
INSERT INTO car (name, model_id)
VALUES ('M3', 2);

INSERT INTO car (name, model_id)
VALUES ('X-Trail', 3);
INSERT INTO car (name, model_id)
VALUES ('Murano', 3);
INSERT INTO car (name, model_id)
VALUES ('Kicks',3);

SELECT m.name as Model_name, c.name as Car_name
FROM model m
JOIN car as c on c.model_id = m.id
WHERE m.name = 'Alfa Romeo';

SELECT m.name as Model_name, c.name as Car_name
FROM model m
JOIN car as c on c.model_id = m.id
WHERE m.name = 'BMW';

SELECT m.name as Model_name, c.name as Car_name
FROM model m
JOIN car as c on c.model_id = m.id
WHERE m.name = 'Nissan';
