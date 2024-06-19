# Write your MySQL query statement below

select e.employee_id, e.name, mr.reports_count, mr.average_age
from Employees e
join (
    select reports_to, count(*) as reports_count, round(avg(age)) as average_age
    from Employees
    group by reports_to
    having count(reports_to) >= 1 and reports_to is not null
    ) as mr
on e.employee_id = mr.reports_to
order by e.employee_id