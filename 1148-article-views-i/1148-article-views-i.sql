# Write your MySQL query statement below
SELECT DISTINCT(A.author_id) as id
FROM Views AS A
inner JOIN Views AS B
ON A.author_id = B.viewer_id AND
A.viewer_id = B.viewer_id
ORDER BY A.author_id