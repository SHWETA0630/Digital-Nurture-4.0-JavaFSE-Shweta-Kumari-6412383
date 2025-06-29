CREATE OR REPLACE PROCEDURE SafeTransferFunds (
    p_from_account INT,
    p_to_account INT,
    p_amount NUMBER
) AS
    v_balance NUMBER;
BEGIN
    -- Check balance of sender
    SELECT Balance INTO v_balance FROM Accounts WHERE AccountID = p_from_account;

    IF v_balance < p_amount THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds');
    END IF;

    -- Perform transfer
    UPDATE Accounts SET Balance = Balance - p_amount WHERE AccountID = p_from_account;
    UPDATE Accounts SET Balance = Balance + p_amount WHERE AccountID = p_to_account;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Transfer successful.');
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Transfer failed: ' || SQLERRM);
END;
/
