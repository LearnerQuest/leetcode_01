# Write your MySQL query statement below
SELECT e.name
FROM Employee e
WHERE id IN (
    SELECT managerId
    FROM Employee
    GROUP BY managerId
    HAVING count(*) >=5
) 
