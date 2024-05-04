# Write your MySQL query statement below
select employee_id, department_id
from Employee
where (employee_id, department_id) in 
    (
        select employee_id, department_id
        from Employee
        group by employee_id
        having count(*) = 1 
    )
    or
    (employee_id, department_id) in
    (
        select employee_id, department_id
        from Employee
        where primary_flag = 'Y'
    )