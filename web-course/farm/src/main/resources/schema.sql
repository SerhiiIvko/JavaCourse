CREATE TABLE plants (
    id bigint auto_increment PRIMARY KEY,
    name varchar(100),
    seedPrice double not null,
    harvestPrice double not null,
    isGrowing boolean NOT NULL,
    isRipen boolean NOT NULL,
    ripenTime long not null,
    startGrowingTime DATE not null,
    endGrowingTime DATE not null
);
CREATE TABLE users (
    id bigint auto_increment PRIMARY KEY,
    name varchar(100),
    balance double NOT NULL
)