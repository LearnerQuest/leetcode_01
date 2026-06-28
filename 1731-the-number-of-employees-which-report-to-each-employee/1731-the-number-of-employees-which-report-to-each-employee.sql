# Write your MySQL query statement below
SELECT e.employee_id,
       e.name,
       COUNT(s.employee_id) AS reports_count,
       ROUND(AVG(s.age),0) AS average_age
FROM Employees e 
JOIN Employees s
ON e.employee_id = s.reports_to
GROUP BY e.employee_id, e.name
ORDER BY e.employee_id;

