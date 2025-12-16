CREATE OR REPLACE FUNCTION total_purchase_amount()
RETURNS DOUBLE PRECISION AS
$$
DECLARE
    total DOUBLE PRECISION;
BEGIN
    SELECT COALESCE(SUM(price), 0)
    INTO total
    FROM purchase;

    RETURN total;
END;
$$ LANGUAGE plpgsql;


CREATE OR REPLACE PROCEDURE increase_prices(percent_in DOUBLE PRECISION)
    LANGUAGE plpgsql
AS
$$
BEGIN
    UPDATE purchase
    SET price = price * (1 + percent_in / 100)
    WHERE id > 1;
END;
$$;
