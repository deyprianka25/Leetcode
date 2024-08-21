# Write your MySQL query statement below
SELECT 'Low Salary' AS CATEGORY, 
       SUM(CASE WHEN income < 20000 THEN 1 ELSE 0 END) AS ACCOUNTS_COUNT
FROM Accounts

UNION 

SELECT 'Average Salary' AS CATEGORY, 
       SUM(CASE WHEN income BETWEEN 20000 AND 50000 THEN 1 ELSE 0 END) AS ACCOUNTS_COUNT
FROM Accounts

UNION 

SELECT 'High Salary' AS CATEGORY, 
       SUM(CASE WHEN income > 50000 THEN 1 ELSE 0 END) AS ACCOUNTS_COUNT
FROM Accounts;