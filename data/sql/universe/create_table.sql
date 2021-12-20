CREATE TABLE universe (
 id serial PRIMARY KEY,
    name VARCHAR(255)
);
 
CREATE TABLE calm_galaxy (
    id serial PRIMARY KEY,
    name VARCHAR(255),
    universe_id INT REFERENCES universe(id)
);

CREATE TABLE active_galaxy (
    id serial PRIMARY KEY,
    name VARCHAR(255),
    universe_id INT REFERENCES universe(id)
);

CREATE TABLE galaxies (
    id serial PRIMARY KEY,
    calm_galaxy_id INT REFERENCES calm_galaxy(id),
    active_galaxy_id INT REFERENCES active_galaxy(id)
);

CREATE TABLE celestial_bodies (
    id serial PRIMARY KEY,
    name VARCHAR(255),
    galaxies_id INT REFERENCES galaxies(id)
);


CREATE TABLE star (
    id serial PRIMARY KEY,
    name VARCHAR(255),
    celestial_bodies_id INT REFERENCES celestial_bodies(id)
);

CREATE TABLE planet (
    id serial PRIMARY KEY,
    name VARCHAR(255),
    celestial_bodies_id INT REFERENCES celestial_bodies(id)
);




