select temp.machine_id, round(avg(temp.diff), 3) as processing_time
from 
    (select s.machine_id, s.process_id, e.timestamp - s.timestamp as diff
    from Activity s
    join Activity e
    on s.machine_id = e.machine_id and s.process_id = e.process_id and s.timestamp < e.timestamp) as temp
group by temp.machine_id