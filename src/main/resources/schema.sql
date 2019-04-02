DROP TABLE IF EXISTS user;
CREATE TABLE user (
    id          int         PRIMARY KEY     AUTO_INCREMENT,
    user_id     varchar(16) unique          not null,
    password    varchar(16)                 not null,
    create_date datetime                    not null
);

DROP TABLE IF EXISTS spending;
CREATE TABLE spending(
    id            int           PRIMARY KEY AUTO_INCREMENT,
    category_id   int                       not null,
    product_name  varchar(128)              not null,
    amount        int                       not null,
    purchace_date datetime                  not null
);

DROP TABLE IF EXISTS category;
CREATE TABLE category(
    id   int          PRIMARY KEY AUTO_INCREMENT,
    name varchar(128)             not null
);