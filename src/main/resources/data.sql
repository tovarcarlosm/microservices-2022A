INSERT INTO category (id, name) VALUES (1, 'Tecnología');
INSERT INTO category (id, name) VALUES (2, 'Ropa');
INSERT INTO category (id, name) VALUES (3, 'Deportes');
INSERT INTO category (id, name) VALUES (4, 'Aseo');
INSERT INTO category (id, name) VALUES (5, 'Restaurante');

INSERT INTO product (id, name, description, price, status, stock, category_id)
VALUES (1, 'PS4', 'Consola para videojuegos', 1000, 'CREATED', 20, 1);

INSERT INTO product (id, name, description, price, status, stock, category_id)
VALUES (2, 'Balón de fútbol', 'Balón #5 para fútbol (soccer)', 25, 'CREATED', 100, 3);

INSERT INTO product (id, name, description, price, status, stock, category_id)
VALUES (3, 'Pizza Hawaina', 'Ingredientes de la pizza', 5, 'CREATED', 20, 5);

INSERT INTO product (id, name, description, price, status, stock, category_id)
VALUES (4, 'Xbox One', 'Consola para videojuegos', 1800, 'CREATED', 30, 1);

INSERT INTO product (id, name, description, price, status, stock, category_id)
VALUES (5, 'Nintendo Wii', 'Consola para videojuegos', 1500, 'CREATED', 35, 1);