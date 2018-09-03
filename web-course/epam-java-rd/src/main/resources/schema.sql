CREATE TABLE app_user (
    id bigint auto_increment PRIMARY KEY,
    name varchar(100),
    surname varchar(100),
    age int,
    email varchar(255) NOT NULL,
    password varchar(255)
)