DROP TABLE IF EXISTS Product;

CREATE TABLE Product (
                         product_Id INT AUTO_INCREMENT  PRIMARY KEY,
                         product_Name VARCHAR(250) NOT NULL,
                         image_Name VARCHAR(250) DEFAULT NULL,
                         description VARCHAR(250) NOT NULL,
                         price double NOT NULL,
                         available BOOLEAN NOT NULL DEFAULT 1
);

INSERT INTO Product (product_Name, image_Name, description, price, available) VALUES ('Pretty Dress', 'prettydress.jpg', 'Pretty dress with flowers', 500, 1);
INSERT INTO Product (product_Name, image_Name, description, price, available) VALUES ('Green Dress', 'greendress.jpg', 'Pretty dress with a green color', 600, 1);
INSERT INTO Product (product_Name, image_Name, description, price, available) VALUES ('Shirts for men', 'threeshirts.jpg', 'Three shirts for men', 500, 1);
INSERT INTO Product (product_Name, image_Name, description, price, available) VALUES ('Blue Dress', 'bluedress.jpg', 'Pretty dress with a blue color', 1000, 1);
INSERT INTO Product (product_Name, image_Name, description, price, available) VALUES ('Kawasaki shirt', 'kawasaki.jpg', 'Kawasaki shirt, unisex', 400, 1);
INSERT INTO Product (product_Name, image_Name, description, price, available) VALUES ('Tropical Dress', 'tropical.jpg', 'Tropical themed dress', 1700, 1);
INSERT INTO Product (product_Name, image_Name, description, price, available) VALUES ('Leopard Dress', 'leopard.jpg', 'Pretty dress with leopard print', 1700, 1);