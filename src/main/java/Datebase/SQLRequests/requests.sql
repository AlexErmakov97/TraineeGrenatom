select *
from sportsman;

select competition_name, world_record
from competition;

select sportsman_name
from sportsman
where EXTRACT(YEAR FROM year_of_birth) = '1990';

select competition_name, world_record
from competition
where set_date = '2010-05-12'
   or set_date = '2010-05-15';

select hold_date
from result
where city = 'Москва'
  and results = 10;

select sportsman_name
from sportsman
where personal_record != 25;

select competition_name
from competition
where world_record = 15
  and set_date != '2015-02-12';

select city
from result
where results in (13, 25, 17, 9);

select sportsman_name
from sportsman
where (year_of_birth between '2000-01-01' and '2000-12-31')
  and rank not in (3, 7, 9);

select hold_date
from result
where city like 'M%';

select sportsman_name
from sportsman
where sportsman_name like 'M%'
  and (cast(EXTRACT(YEAR FROM year_of_birth) as varchar(4)) not like '___6');

select competition_name
from competition
where competition_name like '%международные%';

select distinct year_of_birth
from sportsman;

select count(*)
from result
where hold_date = '2014-05-12';

select max(result.result)
from result
where city = 'Moscow';

select min(year_of_birth)
from sportsman
where rank = 1;






