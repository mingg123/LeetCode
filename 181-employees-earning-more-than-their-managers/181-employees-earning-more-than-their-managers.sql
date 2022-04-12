# Write your MySQL query statement below
Select A.name as Employee
From Employee as A inner join Employee as B
ON A.managerId = B.id AND A.salary > B.salary