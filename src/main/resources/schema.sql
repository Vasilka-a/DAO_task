create table homework_2.CUSTOMERS
(
    id           serial primary key,
    name         varchar(20) not null,
    surname      varchar(20) not null,
    age          integer check (age > 0 and age < 120),
    phone_number bigint unique
);
create table homework_2.ORDERS
(
    id           serial primary key,
    date         date,
    customer_id  integer,
    product_name varchar(20) not null ,
    amount       bigint,
    foreign key (customer_id) REFERENCES homework_2.CUSTOMERS (id)
)
