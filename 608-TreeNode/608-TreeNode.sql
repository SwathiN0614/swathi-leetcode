-- Last updated: 8/13/2026, 3:47:55 PM
# Write your MySQL query statement below
# Write your MySQL query statement below
SELECT id,

    CASE 
        WHEN p_id IS NULL THEN 'Root'
        WHEN id IN (SELECT p_id FROM Tree)THEN 'Inner'
        ELSE 'Leaf'
        END AS type
 FROM Tree
		