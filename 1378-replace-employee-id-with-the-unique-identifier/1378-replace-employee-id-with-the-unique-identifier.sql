# Write your MySQL query statement below
SELECT Name,
       unique_id
FROM Employees e
LEFT JOIN  EmployeeUNI eu
ON e.id = eu.id;