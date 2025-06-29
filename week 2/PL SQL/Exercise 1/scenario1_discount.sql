BEGIN
  FOR cust IN (SELECT CustomerID FROM Customers WHERE Age > 60) LOOP
    UPDATE Customers
    SET LoanInterestRate = LoanInterestRate - 1
    WHERE CustomerID = cust.CustomerID;
  END LOOP;
  COMMIT;
END;
/
