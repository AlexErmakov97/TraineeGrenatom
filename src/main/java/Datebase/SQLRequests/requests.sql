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

select s.sportsman_name
from sportsman s
         left join result r on s.sportsman_id = r.sportsman_id
where r.hold_date = '2014-04-12'
  and s.personal_record = r.results;

select c.competition_name
from competition c
         left join result r on c.competition_id = r.competition_id
where c.set_date = '2015-04-20'
  and r.city = 'Moscow';

select s.sportsman_name, avg(s.personal_record)
from sportsman s
group by s.sportsman_name;

select sportsman_name as спортсмен, r.results as показал_результат, r.city as в_городе
from sportsman
         left outer join result r on sportsman.sportsman_id = r.sportsman_id;

select s.year_of_birth
from sportsman s
         left join result r on s.sportsman_id = r.sportsman_id
where r.city = 'Moscow'
  and r.results > (select avg(s.personal_record)
                   from sportsman s);

select s.sportsman_name
from sportsman s
         left join result r on s.sportsman_id = r.sportsman_id
where s.year_of_birth > (select set_date
                         from competition
                         where world_record = 12);

select sportsman_name
from sportsman
where extract(year from year_of_birth) = '2000'
  and rank < (select avg(s.rank)
              from sportsman s);

select *
from sportsman s
         left outer join result r on s.sportsman_id = r.sportsman_id
where s.personal_record = (select world_record
                           from competition c
                                    left join result r2 on c.competition_id = r2.competition_id
                           where r2.sportsman_id = r.sportsman_id);


select count(s.sportsman_name)
from sportsman s
         left join result r on s.sportsman_id = r.sportsman_id
where sportsman_name = 'Igor'
  and r.competition_id = (select c.competition_id
                          from competition c
                          where c.competition_name like '%Регионлаьные%');

select r.city
from result r
         left join competition c on c.competition_id = r.competition_id
where r.results = (select world_record
                   from competition
                   where competition.competition_id = r.competition_id);

select min(s.rank)
from sportsman s
         left join result r on s.sportsman_id = r.sportsman_id
where s.personal_record = (select c.world_record
                           from competition c
                                    left join result r2 on c.competition_id = r2.competition_id
                           where r.sportsman_id = r2.sportsman_id);

select competition_name, max(rec)
from (select competition_name, count(world_record) as rec
      from competition
      group by competition_name) as T
group by competition_name;

update sportsman
set rank = rank + 1
where personal_record = (select c.world_record
                         from competition c
                                  left join result r2 on c.competition_id = r2.competition_id
                         where sportsman.sportsman_id = r2.sportsman_id);

SELECT date_part('year', age(s.year_of_birth::date))
from sportsman s
         LEFT JOIN result r on s.sportsman_id = r.sportsman_id
where r.city = 'Moscow';

update sportsman
set country = 'Italy'
where rank in (1, 2)
  and country = 'Russia';

update competition
set competition_name = 'Бег с препятсвием'
where competition_name = 'Бег';

update competition
set world_record = world_record + 2
where set_date < '2005-03-20';

delete
from competition
where (select city
       from result
                left join sportsman s on s.sportsman_id = result.sportsman_id
       where city = 'Moscow' and extract(year from s.year_of_birth) > '1980');

delete from competition where world_record = 20;

delete from sportsman where extract(year from year_of_birth) = '2001';
















