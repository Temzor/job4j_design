INSERT INTO rules (name_rule, active)
VALUES ('CREATE', TRUE);
INSERT INTO rules (name_rule, active)
VALUES ('READ', TRUE);
INSERT INTO rules (name_rule, active)
VALUES ('UPDATE', TRUE);
INSERT INTO rules (name_rule, active)
VALUES ('DELETE', TRUE);

INSERT INTO role (name_role)
VALUES ('Administrator');
INSERT INTO role (name_role)
VALUES ('CEO');


INSERT INTO role_rules (rules_id, role_id)
SELECT ru.id, ro.id
FROM rules ru
CROSS JOIN role ro 
WHERE ru.name_rule IS NOT NULL
AND ro.name_role IS NOT NULL;


INSERT INTO users (date_create, name, surname, tab_number, role_id)
VALUES (now(), 'Dmitrii', 'Kapustin', 4212, 1);
INSERT INTO users (date_create, name, surname, tab_number, role_id)
VALUES (now(), 'Peter', 'Arsentiev', 80, 2);

INSERT INTO state (name)
VALUES ('New');
INSERT INTO state (name)
VALUES ('In work');
INSERT INTO state (name)
VALUES ('Done');

INSERT INTO category (name_category, sla_react)
VALUES ('Minor', 72);
INSERT INTO category (name_category, sla_react)
VALUES ('Major', 24);
INSERT INTO category (name_category, sla_react)
VALUES ('Critical', 12);
INSERT INTO category (name_category, sla_react)
VALUES ('Blocker', 3);

INSERT INTO item (date_create, number_item, name_item, user_id, category_id, state_id)
VALUES (now(), random()*(1000000-10)+1, 'Пожар! Спасите!', 2, 4, 1);

INSERT INTO comments (date_create, comment, item_id )
VALUES (now(), 'Уже догарает последний сарай!', 5);

INSERT INTO attachs (date_create, link_attach, item_id )
VALUES (now(), '{"these are photographs of burnt barns" :{ "images": [ "1.png", "2.png", "3.png"]}}', 5);
