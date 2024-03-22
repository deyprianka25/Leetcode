# Write your MySQL query statement below
#SELECT NAME,BONUS
#FROM EMPLOYEE E LEFT JOIN BONUS B
#ON E.EMPLOYEEID = B.EMPLOYEEID
#WHERE IFNULL(BONUS,0)<1000;
SELECT
    Employee.name, Bonus.bonus
FROM
    Employee
        LEFT JOIN
    Bonus ON Employee.empid = Bonus.empid
WHERE
    bonus < 1000 OR bonus IS NULL
;