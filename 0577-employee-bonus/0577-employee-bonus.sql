# Write your MySQL query statement below
SELECT name,
       b.bonus
FROM employee e
LEFT JOIN Bonus b
ON b.empId = e.empId
WHERE Bonus < 1000 
OR Bonus IS NULL;