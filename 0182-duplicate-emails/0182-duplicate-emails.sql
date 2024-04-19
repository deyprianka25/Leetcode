# Write your MySQL query statement belo
SELECT email Email 
from Person
group by email having count(email)>1