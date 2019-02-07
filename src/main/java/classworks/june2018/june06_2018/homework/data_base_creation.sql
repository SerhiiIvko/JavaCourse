-- CREATE
-- DATABASE
-- shop;
-- USE
-- shop;
-- CREATE TABLE sellers
-- (
--   id   INT(10)      NOT NULL AUTO_INCREMENT,
--   name VARCHAR(128) NOT NULL,
--   PRIMARY KEY (id)
-- );
-- CREATE TABLE goods
-- (
--   id           INT(10)      NOT NULL AUTO_INCREMENT,
--   name         VARCHAR(128) NOT NULL,
--   seller       VARCHAR(128) NOT NULL,
--   price        DOUBLE(12)   NOT NULL,
--   date_of_sale DATE         NOT NULL,
--   isBroke      BOOLEAN      NOT NULL,
--   isRemoved    BOOLEAN      NOT NULL,
--   PRIMARY KEY (id),
--   FOREIGN KEY (id) REFERENCES sellers (id)
-- );
-- INSERT INTO sellers
-- VALUES (1, 'Alex Fookin'),
--        (2, 'Frodo Baggins'),
--        (3, 'Garry Potter');
-- INSERT INTO goods
-- VALUES (1, 'Magic stick', 'Garry Potter', 15, 2018-10-20, TRUE, FALSE),
--        (2, 'Magic powder', 'Garry Potter', 25, 2018-10-10, FALSE, FALSE),
--        (3, 'Black hat', 'Alex Fookin', 8, 2018-03-08, FALSE, FALSE),
--        (4, 'Red flower', 'Frodo Baggins', 3, 2018-03-05, FALSE, TRUE),
--        (5, 'Stone of purity', 'Alex Fookin', 70, 2018-06-06, FALSE, TRUE),
--        (6, 'Iron ore', 'Alex Fookin', 50, 2018-08-06, FALSE, FALSE),
--        (7, 'The Ring of Power', 'Frodo Baggins', 1000, 2018-06-21, FALSE, TRUE);
CREATE
DATABASE
shop1;
USE
shop1;
CREATE TABLE sellers
(
  seller_id   INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
  seller_name VARCHAR(128) NOT NULL
);

CREATE TABLE goods
(
  good_id   INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
  good_name VARCHAR(128) NOT NULL,
  price     DECIMAL      NOT NULL,
  quantity  INT          NOT NULL,
  isBroke   BOOLEAN      NOT NULL,
  isRemoved BOOLEAN      NOT NULL
);

CREATE TABLE sales
(
  sale_id    INT  NOT NULL AUTO_INCREMENT PRIMARY KEY,
  seller_id  INT  NOT NULL,
  good_id    INT  NOT NULL,
  sales_date DATE NOT NULL,
  quantity   INT  NOT NULL,
  FOREIGN KEY fk_seller(seller_id)
    REFERENCES sellers(seller_id)
    ON UPDATE CASCADE
    ON DELETE RESTRICT,
  FOREIGN KEY fk_good(good_id)
    REFERENCES goods(good_id)
    ON UPDATE CASCADE
    ON DELETE RESTRICT
);

INSERT INTO sellers
VALUES (1, 'Alex Fookin'),
       (2, 'Frodo Baggins'),
       (3, 'Garry Potter');

INSERT INTO goods
VALUES (1, 'Magic stick', 15, 10, TRUE, FALSE),
       (2, 'Magic powder', 25, 12, FALSE, FALSE),
       (3, 'Black hat', 8, 5, FALSE, FALSE),
       (4, 'Red flower', 3, 20, FALSE, TRUE),
       (5, 'Stone of purity', 70, 20, FALSE, TRUE),
       (6, 'Iron ore', 50, 100, FALSE, FALSE),
       (7, 'The Ring of Power', 1000, 1, FALSE, TRUE);

INSERT INTO sales
VALUES (1, 3, 1, '2018-10-20', 2),
       (2, 3, 2, '2018-10-10', 3),
       (3, 1, 3, '2018-08-08', 1),
       (4, 2, 4, '2018-05-03', 6),
       (5, 1, 5, '2018-06-06', 4),
       (6, 1, 6, '2018-08-06', 2),
       (7, 2, 7, '2018-06-21', 1),
       (8, 1, 2, '2018-06-21', 8),
       (9, 2, 4, '2018-06-25', 3),
       (10, 1, 5, '2018-07-21', 1);

SELECT good_id, good_name, price
FROM goods
WHERE isBroke = FALSE
ORDER BY price;

SELECT good_id, good_name
FROM goods
WHERE isRemoved = TRUE;

