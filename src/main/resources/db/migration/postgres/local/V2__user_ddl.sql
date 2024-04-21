
DROP TABLE IF EXISTS aviva_users;

CREATE TABLE aviva_users
(
    id  SERIAL,
    first_name  VARCHAR(100) NOT NULL,
    last_name  VARCHAR(100) NOT NULL,
    email VARCHAR(200) NOT NULL,
    password VARCHAR(32) NOT NULL,
    city  VARCHAR(100) NOT NULL,
    country  VARCHAR(50) NOT NULL,
    PRIMARY KEY (id)
);