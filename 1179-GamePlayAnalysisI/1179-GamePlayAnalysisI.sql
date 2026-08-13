-- Last updated: 8/13/2026, 3:45:09 PM
# Write your MySQL query statement below
select player_id,min(event_date) as first_login
from Activity
group by player_id