# Write your MySQL query statement below
select b.id as Id
from Weather b
join Weather a
where DATEDIFF(b.recordDate, a.recordDate) = 1
and b.temperature > a.temperature