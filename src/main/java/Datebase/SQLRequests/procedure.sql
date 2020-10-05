create or replace procedure temp_table()
    LANGUAGE plpgsql as
$$

DECLARE
    i INTEGER;
    j INTEGER;
    q TEXT;
BEGIN
    FOR i IN 1 .. 6
        LOOP
            q = 'create table temp_table_' || i || '(';
            FOR j IN 1 .. 3
                LOOP
                    IF j <> 1 THEN
                        q = q || ',';
                    END IF;
                    q = q || 'attr_' || j || ' int';
                END LOOP;
            q = q || ');';
            EXECUTE q;
        END LOOP;
END;
$$;
