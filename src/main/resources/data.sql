DROP TABLE IF EXISTS product;

CREATE TABLE product (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL
);

INSERT INTO product (name) VALUES ('Car');
INSERT INTO product (name) VALUES ('Bike');
INSERT INTO product (name) VALUES ('Boat');