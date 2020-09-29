insert into sportsman(sportsman_name, rank, year_of_birth,
                      personal_record, country) values ('Igor', 3, '12/08/2001',12,'Russia');
insert into sportsman(sportsman_name, rank, year_of_birth,
                      personal_record, country) values ('Jhon', 6, '17/07/1996',12,'USA');
insert into sportsman(sportsman_name, rank, year_of_birth,
                      personal_record, country) values ('Messi', 12, '14/03/1986',12,'Argentina');
insert into sportsman(sportsman_name, rank, year_of_birth,
                      personal_record, country) values ('Gena', 1, '14/08/1984',12,'Russia');
insert into sportsman(sportsman_name, rank, year_of_birth,
                      personal_record, country) values ('Lena', 3, '12/01/2001',12,'Ukraine');
insert into sportsman(sportsman_name, rank, year_of_birth,
                      personal_record, country) values ('Miron', 7, '12/08/1997',12,'Russia');

insert into competition(competition_name, world_record,
                        set_date) values ('международные игры','10','07/09/2001');
insert into competition(competition_name, world_record,
                        set_date) values ('чемпионат мира по теннису','10','07/09/2001');
insert into competition(competition_name, world_record,
                        set_date) values ('чемпионат бани №5','10','07/09/2009');
insert into competition(competition_name, world_record,
                        set_date) values ('голодные игры','10','07/09/1978');
insert into competition(competition_name, world_record,
                        set_date) values ('дурацкие игры','10','07/09/2000');
insert into competition(competition_name, world_record,
                        set_date) values ('международный турнир','10','07/09/1986');

insert into result(competition_id, sportsman_id, results,
                   city, hold_date)  values (1,2,10,'Moscow','12/04/2015');
insert into result(competition_id, sportsman_id, results,
                   city, hold_date)  values (3,3,12,'Lesobon','14/03/2020');
insert into result(competition_id, sportsman_id, results,
                   city, hold_date)  values (6,5,11,'Moscow','20/04/2015');
insert into result(competition_id, sportsman_id, results,
                   city, hold_date)  values (4,6,8,'Kiev','14/03/2020');
insert into result(competition_id, sportsman_id, results,
                   city, hold_date)  values (5,1,6,'Samara','14/03/2020');
insert into result(competition_id, sportsman_id, results,
                   city, hold_date)  values (2,4,4,'London','14/03/2020');

