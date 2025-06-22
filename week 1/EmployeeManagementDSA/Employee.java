package EmployeeManagementDSA;

public class Employee {
    String employeeId;
    String name;
    String position;
    double salary;

    public Employee(String employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String toString() {
        return employeeId + " | " + name + " | " + position + " | Rs." + salary;
    }
}
