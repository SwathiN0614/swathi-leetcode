-- Last updated: 8/13/2026, 3:44:41 PM
# Write your MySQL query statement below
SELECT person_name
FROM
(
    SELECT
        person_name,
        turn,
        SUM(weight) OVER (ORDER BY turn) AS total_weight
    FROM Queue
) q
WHERE total_weight <= 1000
ORDER BY total_weight DESC
LIMIT 1;