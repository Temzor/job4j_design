INSERT INTO universe(name)
VALUES ('Обозримая'), ('Не обозримая');

INSERT INTO calm_galaxy(name, universe_id)
VALUES ('MC89', 1), ('GH535', 1), ('HUGO8', 2);

INSERT INTO active_galaxy(name, universe_id)
VALUES ('MMC89', 2), ('GJ78', 2), ('M4213', 2);

INSERT INTO galaxies(calm_galaxy_id, active_galaxy_id)
VALUES (1, 1), (2, 2), (3, 2);

INSERT INTO celestial_bodies(name, galaxies_id)
VALUES ('Звезды', 1), ('Планеты', 2);

INSERT INTO star(name, celestial_bodies_id)
VALUES ('Гиганты', 1), ('Белые карлики', 1), ('Сверхгиганты', 1);

INSERT INTO planet(name, celestial_bodies_id)
VALUES ('Газовые гиганты', 2), ('Карликовые планеты', 2), ('Планеты земной группы', 2);
