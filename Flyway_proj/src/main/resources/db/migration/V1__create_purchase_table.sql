CREATE TABLE IF NOT EXISTS purchase (
    id SERIAL PRIMARY KEY,
    product VARCHAR(50) NOT NULL,
    price DOUBLE PRECISION NOT NULL
    );

INSERT INTO purchase(product, price) VALUES
    ('Laptop', 3500),
    ('Mouse', 120),
    ('Keyboard', 220);
