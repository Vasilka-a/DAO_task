select product_name
from homework_2.orders
join homework_2.customers c on c.id = homework_2.orders.customer_id
where lower(c.name) = lower(:name);