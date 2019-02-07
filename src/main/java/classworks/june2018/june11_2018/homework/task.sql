CREATE
DATABASE
university;
USE
university;
CREATE TABLE employees
(
  emp_id      INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
  emp_name    VARCHAR(128) NOT NULL,
  emp_surname VARCHAR(128) NOT NULL
);
CREATE TABLE students
(
  stud_id      INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
  stud_name    VARCHAR(128) NOT NULL,
  stud_surname VARCHAR(128) NOT NULL
);

