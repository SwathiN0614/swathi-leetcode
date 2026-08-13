-- Last updated: 8/13/2026, 3:43:41 PM
# Write your MySQL query statement below
SELECT  
    u.name,
    SUM(t.amount) AS balance
FROM Transactions t
LEFT JOIN Users u
    ON t.account = u.account
GROUP BY u.account, u.name
HAVING SUM(t.amount) > 10000;