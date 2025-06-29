CREATE OR REPLACE PROCEDURE AddNewCustomer (
    p_id INT,
    p_name VARCHAR2,
    p_age INT,
    p_balance NUMBER,
    p_isvip CHAR,
    p_rate NUMBER
) AS
BEGIN
    INSERT INTO Customers
    VALUES (p_id, p_name, p_age, p_balance, p_isvip, p_rate);

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Customer added.');
EXCEPTION
    WHEN DUP_VAL_ON_INDEX THEN
        DBMS_OUTPUT.PUT_LINE('Error: Customer with ID ' || p_id || ' already exists.');
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Unexpected error: ' || SQLERRM);
END;
/
