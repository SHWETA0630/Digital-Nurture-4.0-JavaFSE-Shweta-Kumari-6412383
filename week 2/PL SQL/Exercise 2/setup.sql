CREATE TABLE Accounts (
    AccountID INT PRIMARY KEY,
    AccountHolder VARCHAR2(100),
    Balance NUMBER(10,2)
);

CREATE TABLE Employees (
    EmployeeID INT PRIMARY KEY,
    Name VARCHAR2(100),
    Salary NUMBER(10,2)
);

CREATE TABLE Customers (
    CustomerID INT PRIMARY KEY,
    Name VARCHAR2(100),
    Age INT,
    Balance NUMBER(10,2),
    IsVIP CHAR(1),
    LoanInterestRate NUMBER(5,2)
);

INSERT INTO Accounts VALUES (1, 'Arjun', 10000);
INSERT INTO Accounts VALUES (2, 'Meera', 5000);

INSERT INTO Employees VALUES (101, 'Ravi', 40000);
INSERT INTO Employees VALUES (102, 'Sneha', 55000);

COMMIT;
