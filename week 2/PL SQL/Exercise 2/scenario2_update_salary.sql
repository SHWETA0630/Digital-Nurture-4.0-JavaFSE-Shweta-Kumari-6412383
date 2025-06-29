CREATE OR REPLACE PROCEDURE UpdateSalary (
    p_emp_id INT,
    p_percent NUMBER
) AS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * p_percent / 100)
    WHERE EmployeeID = p_emp_id;

    IF SQL%ROWCOUNT = 0 THEN
        RAISE_APPLICATION_ERROR(-20002, 'Employee not found');
    END IF;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Salary updated.');
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error updating salary: ' || SQLERRM);
END;
/
