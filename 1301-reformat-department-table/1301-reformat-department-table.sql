# Write your MySQL query statement below
SELECT id,
SUM(IF(month='Jan', revenue, NULL)) AS Jan_Revenue,
SUM(IF(month='Feb', revenue, NULL)) AS Feb_Revenue,
SUM(IF(month='Mar', revenue, NULL)) AS Mar_Revenue,
SUM(IF(month='Apr', revenue, NULL)) AS Apr_Revenue,
SUM(IF(month='May', revenue, NULL)) AS May_Revenue,
SUM(IF(month='Jun', revenue, NULL)) AS Jun_Revenue,
SUM(IF(month='Jul', revenue, NULL)) AS Jul_Revenue,
SUM(IF(month='Aug', revenue, NULL)) AS Aug_Revenue,
SUM(IF(month='Sep', revenue, NULL)) AS Sep_Revenue,
SUM(IF(month='Oct', revenue, NULL)) AS Oct_Revenue,
SUM(IF(month='Nov', revenue, NULL)) AS Nov_Revenue,
SUM(IF(month='Dec', revenue, NULL)) AS Dec_Revenue
FROM Department
Group BY id;


-- select distinct d.id, jan.revenue as Jan_Revenue, 
-- feb.revenue as Feb_Revenue, mar.revenue as Mar_Revenue, aprs.revenue as Apr_Revenue,
-- may.revenue as May_Revenue, jun.revenue as Jun_Revenue, jul.revenue as Jul_Revenue, 
-- aug.revenue as Aug_Revenue, sep.revenue as Sep_Revenue, octs.revenue as Oct_Revenue,
-- nov.revenue as Nov_Revenue, decs.revenue as Dec_Revenue
-- from (select id from Department) d
-- left join (select * from Department where month = 'Jan') jan
-- on d.id = jan.id
-- left join (select * from Department where month = 'Feb') feb
-- on d.id = feb.id
-- left join (select * from Department where month = 'Mar') mar
-- on d.id = mar.id
-- left join (select * from Department where month = 'Apr') aprs
-- on d.id = aprs.id
-- left join (select * from Department where month = 'May') may
-- on d.id = may.id
-- left join (select * from Department where month = 'Jun') jun
-- on d.id = jun.id
-- left join (select * from Department where month = 'Jul') jul
-- on d.id = jul.id
-- left join (select * from Department where month = 'Aug') aug
-- on d.id = aug.id
-- left join (select * from Department where month = 'Sep') sep
-- on d.id = sep.id
-- left join (select * from Department where month = 'Oct') octs
-- on d.id = octs.id
-- left join (select * from Department where month = 'Nov') nov
-- on d.id = nov.id
-- left join (select * from Department where month = 'Dec') decs
-- on d.id = decs.id
