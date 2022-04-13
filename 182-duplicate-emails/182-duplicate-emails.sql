# Write your MySQL query statement below
Select DISTINCT (A.Email)
FROM Person as A
inner join Person as B
ON A.email = B.email AND A.ID != B.ID