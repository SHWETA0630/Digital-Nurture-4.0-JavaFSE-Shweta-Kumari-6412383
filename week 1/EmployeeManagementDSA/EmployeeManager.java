package EmployeeManagementDSA;

public class EmployeeManager {
    private Employee[] employees;
    private int size;

    public EmployeeManager(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    public void addEmployee(Employee emp) {
        if (size < employees.length) {
            employees[size++] = emp;
        } else {
            System.out.println("Array is full. Cannot add employee.");
        }
    }

    public Employee searchEmployee(String empId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(empId)) {
                return employees[i];
            }
        }
        return null;
    }

    public void traverseEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public void deleteEmployee(String empId) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(empId)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Employee not found.");
            return;
        }
        for (int j = index; j < size - 1; j++) {
            employees[j] = employees[j + 1];
        }
        employees[--size] = null;
    }
}
