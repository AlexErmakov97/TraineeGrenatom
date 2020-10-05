create table sportsman(
    sportsman_id serial primary key,
    sportsman_name varchar(25),
    rank smallint,
    year_of_birth date,
    personal_record real,
    country varchar(50)
)