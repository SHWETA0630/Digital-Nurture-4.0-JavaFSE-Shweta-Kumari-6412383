BEGIN
  FOR loan_rec IN (
    SELECT L.LoanID, C.Name, L.DueDate
    FROM Loans L
    JOIN Customers C ON L.CustomerID = C.CustomerID
    WHERE L.DueDate <= SYSDATE + 30
  ) LOOP
    DBMS_OUTPUT.PUT_LINE(
      'Reminder: Loan ' || loan_rec.LoanID || ' for ' || loan_rec.Name ||
      ' is due on ' || TO_CHAR(loan_rec.DueDate, 'DD-MON-YYYY')
    );
  END LOOP;
END;
/
