create table result(
    result_id serial primary key,
    competition_id integer references competition(competition_id),
    sportsman_id integer references  sportsman( sportsman_id),
    results double precision,
    city varchar(50),
    hold_date date
)