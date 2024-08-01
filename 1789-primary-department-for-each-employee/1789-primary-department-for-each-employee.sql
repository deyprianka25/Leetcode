# Write your MySQL query statement below
SELECT EMPLOYEE_ID,DEPARTMENT_ID
FROM EMPLOYEE
WHERE PRIMARY_FLAG='Y'
UNION 
SELECT 
  employee_id, 
  department_id 
FROM 
  Employee 
GROUP BY 
  employee_id 
HAVING 
  COUNT(employee_id) = 1;