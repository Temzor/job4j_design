CREATE TABLE rules (
		id serial PRIMARY KEY,
		name_rule TEXT,
		active BOOLEAN
);

CREATE TABLE role (
		id serial PRIMARY KEY,
		name_role TEXT
);

create table role_rules(
    id serial primary key,
    role_id int references role(id),
    rules_id int references rules(id)
);

CREATE TABLE users (
		id serial PRIMARY KEY,
		date_create timestamp,
		name TEXT,
		surname TEXT,
		tab_number INT,
		role_id INT REFERENCES role(id)
		
);

CREATE TABLE state (
		id serial PRIMARY KEY,
		state_number BIT
);

CREATE TABLE category (
		id serial PRIMARY KEY,
		name_category TEXT,
		sla_react INT4
);

CREATE TABLE item (
		id serial PRIMARY KEY,
		date_create timestamp,
		number_item INT,
		name_item TEXT,
		user_id INT REFERENCES users(id),
		category_id INT REFERENCES category(id),
		state_id INT REFERENCES state(id)
);

CREATE TABLE comments (
		id serial PRIMARY KEY,
		date_create timestamp,
		comment TEXT,
		item_id INT REFERENCES item(id)
);

CREATE TABLE attachs (
		id serial PRIMARY KEY,
		date_create TIMESTAMP,
		link_attach JSON,
		item_id INT REFERENCES item(id)
);


