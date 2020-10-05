create trigger info_change
    after insert or update or delete on sportsman for each statement execute
    procedure add_to_log();

create trigger increment_number
    before delete on result for each statement execute
    procedure increment(1);


