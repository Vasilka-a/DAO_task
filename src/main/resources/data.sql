insert into homework_2.customers (name, surname, age, phone_number)
values ('Anna', 'Ivanova', 25, 89026588793),
       ('Alexey', 'Fedorov', 38, 89092568974),
       ('Olga', 'Romashkina', 31, 89270256324),
       ('Ivan', 'Matveev', 41, 89367480302),
       ('Alexey', 'Sidorov', 26, 89250014536),
       ('Yaroslav', 'Sobolev', 29, 89254789652),
       ('Alexey', 'Petrov', 34, 89023695847),
       ('Marina', 'Smolenceva', 43, 89063562697),
       ('Anna', 'Orlova', 22, 89278568877),
       ('Ivan', 'Ivanov', 32, 89563698502),
       ('Olga', 'Rybakova', 37, 89874563220);

insert into homework_2.ORDERS (date, product_name, customer_id, amount)
values (now(), 'Dress', 1, 10000),
       (now(), 'Dress', 1, 8000),
       (now(), 'Shirt', 2, 6000),
       (now(), 'Jacket', 4, 11000),
       (now(), 'Jeans', 3, 6000),
       (now(), 'Dress', 8, 5000),
       (now(), 'Boots', 7, 19000),
       (now(), 'Boots', 10, 21000),
       (now(), 'Suit', 7, 45000),
       (now(), 'Pants',5, 12000),
       (now(), 'Jacket', 11, 15000),
       (now(), 'Jeans', 6, 8000),
       (now(), 'Jeans', 9, 9000),
       (now(), 'Jacket', 9, 15000);

