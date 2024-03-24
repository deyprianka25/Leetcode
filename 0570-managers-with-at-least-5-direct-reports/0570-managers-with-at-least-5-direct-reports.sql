# Write your MySQL query statement below
WITH CTE AS
(SELECT MANAGERID,COUNT(*) CT
FROM EMPLOYEE
WHERE MANAGERID IS NOT NULL
GROUP BY MANAGERID
HAVING COUNT(*)>=5)

SELECT NAME 
FROM EMPLOYEE
WHERE ID IN (SELECT MANAGERID FROM CTE)
