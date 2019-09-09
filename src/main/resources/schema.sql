DROP TABLE IF EXISTS CARS;

CREATE TABLE CARS (
  id INT AUTO_INCREMENT PRIMARY KEY,
  MAKE VARCHAR(250),
  MODEL VARCHAR(250),
  YEAR INTEGER
);

INSERT INTO CARS
  (MAKE, MODEL, YEAR)
VALUES
  ('Lexus', 'ES300', 2002),
  ('Lexus', 'IS250', 2015),
  ('Lexus', 'IS250', 2016),
  ('Toyota', 'Camry', 2015),
  ('Toyota', 'Forerunner', 2019),
  ('Ford', 'Mustang', 2017),
  ('Ford', 'Mustang', 2018);
