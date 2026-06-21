# Write your MySQL query statement below
SELECT p.product_name,
       year,
       price
FROM Sales s
INNER JOIN  Product p 
ON p.product_id = s.product_id;
