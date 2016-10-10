DROP DATABASE IF EXISTS wijs_reservation;
CREATE DATABASE wijs_reservation;
USE wijs_reservation;
CREATE TABLE MyGuests (
    id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY, 
    name VARCHAR(30) NOT NULL,
    lastname VARCHAR(30) NOT NULL,
    email VARCHAR(50),
    phoneNumber VARCHAR(50),
    regDate TIMESTAMP
    );