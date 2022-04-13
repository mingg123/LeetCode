# Write your MySQL query statement below
SELECT name as Customers
FROM Customers AS A
left join Orders AS B
ON A.id = B.customerId
WHERE customerId IS NULL