# Write your MySQL query statement below
SELECT e.name
FROM Employee e
JOIN (
    SELECT managerId
    FROM Employee
    GROUP BY managerId
    having count(*) >=5
) m 
ON e.id = m.managerId;
