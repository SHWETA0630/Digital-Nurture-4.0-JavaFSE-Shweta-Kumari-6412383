CREATE TABLE Customers (
    CustomerID INT PRIMARY KEY,
    Name VARCHAR2(100),
    Age INT,
    Balance NUMBER(10,2),
    IsVIP CHAR(1),
    LoanInterestRate NUMBER(5,2)
);

CREATE TABLE Loans (
    LoanID INT PRIMARY KEY,
    CustomerID INT,
    LoanAmount NUMBER(10,2),
    DueDate DATE
);

INSERT INTO Customers VALUES (1, 'Arjun', 65, 12000, 'N', 8.5);
INSERT INTO Customers VALUES (2, 'Meera', 45, 8000, 'N', 9.2);
INSERT INTO Customers VALUES (3, 'Ravi', 70, 15000, 'N', 7.5);

INSERT INTO Loans VALUES (101, 1, 50000, SYSDATE + 10);
INSERT INTO Loans VALUES (102, 2, 30000, SYSDATE + 40);
INSERT INTO Loans VALUES (103, 3, 45000, SYSDATE + 5);

COMMIT;
