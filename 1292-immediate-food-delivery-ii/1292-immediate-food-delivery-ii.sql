# Write your MySQL query statement belo
select round(count(if(d.order_date = d.customer_pref_delivery_date, 1, null)) / count(*) * 100, 2) as immediate_percentage 
from Delivery d
join (
    select customer_id, min(order_date) as date_first
    from Delivery
    group by customer_id
) t
on  d.customer_id = t.customer_id and d.order_date = t.date_first

