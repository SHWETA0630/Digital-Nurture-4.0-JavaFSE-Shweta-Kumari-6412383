CREATE TABLE SavingsAccounts (
    AccountID INT PRIMARY KEY,
    AccountHolder VARCHAR2(100),
    Balance NUMBER(10,2)
);

CREATE TABLE Employees (
    EmployeeID INT PRIMARY KEY,
    Name VARCHAR2(100),
    Department VARCHAR2(50),
    Salary NUMBER(10,2)
);

INSERT INTO SavingsAccounts VALUES (1, 'Arjun', 10000);
INSERT INTO SavingsAccounts VALUES (2, 'Meera', 15000);
INSERT INTO SavingsAccounts VALUES (3, 'Ravi', 20000);

INSERT INTO Employees VALUES (101, 'Sneha', 'Sales', 50000);
INSERT INTO Employees VALUES (102, 'Ravi', 'Sales', 45000);
INSERT INTO Employees VALUES (103, 'Neha', 'HR', 48000);

COMMIT;
