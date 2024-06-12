# Write your MySQL query statement below
select distinct d.id, jan.revenue as Jan_Revenue, 
feb.revenue as Feb_Revenue, mar.revenue as Mar_Revenue, aprs.revenue as Apr_Revenue,
may.revenue as May_Revenue, jun.revenue as Jun_Revenue, jul.revenue as Jul_Revenue, 
aug.revenue as Aug_Revenue, sep.revenue as Sep_Revenue, octs.revenue as Oct_Revenue,
nov.revenue as Nov_Revenue, decs.revenue as Dec_Revenue
from (select id from Department) d
left join (select * from Department where month = 'Jan') jan
on d.id = jan.id
left join (select * from Department where month = 'Feb') feb
on d.id = feb.id
left join (select * from Department where month = 'Mar') mar
on d.id = mar.id
left join (select * from Department where month = 'Apr') aprs
on d.id = aprs.id
left join (select * from Department where month = 'May') may
on d.id = may.id
left join (select * from Department where month = 'Jun') jun
on d.id = jun.id
left join (select * from Department where month = 'Jul') jul
on d.id = jul.id
left join (select * from Department where month = 'Aug') aug
on d.id = aug.id
left join (select * from Department where month = 'Sep') sep
on d.id = sep.id
left join (select * from Department where month = 'Oct') octs
on d.id = octs.id
left join (select * from Department where month = 'Nov') nov
on d.id = nov.id
left join (select * from Department where month = 'Dec') decs
on d.id = decs.id
