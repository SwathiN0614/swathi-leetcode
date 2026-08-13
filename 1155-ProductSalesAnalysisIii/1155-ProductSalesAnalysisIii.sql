-- Last updated: 8/13/2026, 3:45:14 PM
# Write your MySQL query statement below

select product_id,year as first_year, quantity, price
from Sales
where(product_id, year) in (select  product_id, min(year) from Sales group by product_id)