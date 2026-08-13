-- Last updated: 8/13/2026, 3:43:59 PM
# Write your MySQL query statement below
SELECT DISTINCT
    u.name,
    IFNULL(
        SUM(t.distance) OVER (PARTITION BY u.id),
        0
    ) AS travelled_distance
FROM Users u
LEFT JOIN Rides t
    ON u.id = t.user_id
ORDER BY travelled_distance DESC, u.name ASC;