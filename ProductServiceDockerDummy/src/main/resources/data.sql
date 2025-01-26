CREATE TABLE IF NOT EXISTS product (
    product_id BIGSERIAL PRIMARY KEY,
    product_name VARCHAR(255),
    product_quantity BIGINT,
    product_description TEXT
);
INSERT INTO product (product_name, product_quantity, product_description)
VALUES
('Laptop', 150, 'High-performance laptop with 16GB RAM and 512GB SSD'),
('Smartphone', 300, 'Latest model smartphone with 128GB storage and 5G connectivity'),
('Wireless Mouse', 500, 'Ergonomic wireless mouse with Bluetooth connectivity'),
('Bluetooth Speaker', 200, 'Portable Bluetooth speaker with waterproof feature and 20 hours battery life'),
('Gaming Monitor', 80, 'Curved 27-inch gaming monitor with 144Hz refresh rate and 1ms response time'),
('Mechanical Keyboard', 120, 'RGB mechanical keyboard with customizable keys and tactile feedback'),
('External Hard Drive', 150, '1TB external hard drive with USB 3.0 support'),
('Smartwatch', 250, 'Fitness tracking smartwatch with heart-rate monitoring and sleep tracking'),
('4K Camera', 100, 'Ultra-high-definition camera with 60fps video recording'),
('Headphones', 350, 'Noise-cancelling over-ear headphones with high-fidelity sound');