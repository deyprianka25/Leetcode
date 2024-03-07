# Write your MySQL query statement below
SELECT unique_id,name
FROM Employees a
LEFT JOIN EmployeeUni b
ON a.id=b.id
