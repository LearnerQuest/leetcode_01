# Write your MySQL query statement below
SELECT 
     ROUND(
         SUM(d.order_date = d.customer_pref_delivery_date) * 100.0
        / COUNT(*),
        2
     ) AS immediate_percentage
FROM Delivery d
JOIN (
    SELECT customer_id,
           MIN(order_date) AS first_order
    FROM Delivery
    GROUP BY customer_id
) t
ON d.customer_id = t.customer_id
AND d.order_date = t.first_order;
