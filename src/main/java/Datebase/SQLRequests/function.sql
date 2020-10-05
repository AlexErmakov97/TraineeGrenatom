create function add_to_log() returns trigger as
$emp_stamp$
declare
    mstr   varchar(30);
    astr   varchar(100);
    retstr varchar(254);
begin
    if tg_op = 'insert' then
        astr = new.name;
        mstr := 'Add new sportsman';
        retstr := mstr || astr;
        insert into log(text, time_of_change) values (retstr, now());
        return new;
    elsif tg_op = 'update' then
        astr = new.name;
        mstr := 'update sportsman';
        retstr := mstr || astr;
        insert into log(text, time_of_change) values (retstr, now());
        return new;
    elsif tg_op = 'delete' then
        astr = old.name;
        mstr := 'Remove user';
        insert into log(text, time_of_change) values (retstr, now());
        return old;
    end if;
    return new;
end;
$emp_stamp$ LANGUAGE plpgsql;

create function increment() returns trigger as
$emp_stamp$
declare
    array_arg text[];
    inc integer;
    rstr varchar(255);
begin
    array_arg := tg_nargs;
    inc := cast(array_arg[1] as integer) + 1;
    return inc;
end;
$emp_stamp$ LANGUAGE plpgsql;

