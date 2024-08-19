# Write your MySQL query statement below
-- SELECT Q1.PERSON_NAME
-- FROM QUEUE Q1 INNER JOIN QUEUE Q2
-- ON Q1.TURN >= Q2.TURN
-- GROUP BY Q1.TURN
-- HAVING SUM(Q2.WEIGHT)<= 1000
-- ORDER BY SUM(Q2.WEIGHT)  DESC
-- LIMIT 1;


SELECT person_name
FROM (
    SELECT person_name, 
           SUM(weight) OVER (ORDER BY turn) AS cumulative_weight
    FROM Queue
) AS cumulative
WHERE cumulative_weight <= 1000
ORDER BY cumulative_weight DESC
LIMIT 1;

