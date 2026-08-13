-- Last updated: 8/13/2026, 3:47:45 PM
# Write your MySQL query statement below
UPDATE salary SET sex =
CASE sex
    WHEN 'm' THEN 'f'
    ELSE 'm'
END;