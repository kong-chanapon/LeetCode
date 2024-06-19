# Write your MySQL query statement below
select sd.student_id, sd.student_name, sj.subject_name, count(e.student_id) as attended_exams 
from Students sd
join Subjects sj
left join Examinations e
on sd.student_id = e.student_id and sj.subject_name = e.subject_name 
group by sd.student_id, sd.student_name, sj.subject_name
order by sd.student_id, subject_name, attended_exams desc