# Write your MySQL query statement below
-- SELECT employee_id
-- FROM Employees e
-- WHERE salary < 30000
  -- AND manager_id IS NOT NULL
  -- AND NOT EXISTS (
    -- SELECT 1
    -- FROM Employees m
   --  WHERE m.employee_id = e.manager_id
  -- )
-- ORDER BY employee_id;


SELECT employee_id
FROM Employees e
WHERE salary < 30000
  AND manager_id IS NOT NULL
  AND manager_id NOT IN (
    SELECT employee_id
    FROM Employees
  )
ORDER BY employee_id;