DROP TABLE IF EXISTS PRODUCT;

CREATE TABLE PRODUCT (
  ID INT AUTO_INCREMENT  PRIMARY KEY,
  NAME VARCHAR(250) NOT NULL
);

INSERT INTO PRODUCT (name) VALUES ('Car');
INSERT INTO PRODUCT (name) VALUES ('Bike');
INSERT INTO PRODUCT (name) VALUES ('Boat');

DROP TABLE IF EXISTS APPLICATION_USER;

CREATE TABLE APPLICATION_USER (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    USERNAME VARCHAR(100) NOT NULL,
    PASSWORD VARCHAR(100) NOT NULL
);

INSERT INTO APPLICATION_USER (ID, USERNAME, PASSWORD) VALUES (1, 'admin', '$2a$10$D8Zhm5q4KRgWe4QoBfpmQuo8Kck1kwuEk5GsBBRZbRw4FEFlaBoji');