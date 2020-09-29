create table competition
(
    competition_id serial primary key,
    competition_name varchar(25),
    world_record real,
    set_date date
)