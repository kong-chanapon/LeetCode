select distinct author_id 'id'
from Views
where author_id = viewer_id 
order by author_id asc;
