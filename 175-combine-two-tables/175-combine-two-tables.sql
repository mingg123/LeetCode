# Write your MySQL query statement below
SELECT firstName, lastNAme, city, state
FROM Person as P LEFT OUTER JOIN Address as A
ON P.personId = A.personId