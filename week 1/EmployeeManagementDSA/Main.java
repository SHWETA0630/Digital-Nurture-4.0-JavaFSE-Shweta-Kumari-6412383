package EmployeeManagementDSA;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        manager.addEmployee(new Employee("E101", "Riya", "Analyst", 48000));
        manager.addEmployee(new Employee("E102", "Arjun", "Manager", 75000));
        manager.addEmployee(new Employee("E103", "Meera", "HR", 52000));

        System.out.println("All Employees:");
        manager.traverseEmployees();

        System.out.println("\nSearching E102:");
        Employee found = manager.searchEmployee("E102");
        System.out.println(found != null ? found : "Not Found");

        System.out.println("\nDeleting E102:");
        manager.deleteEmployee("E102");
        manager.traverseEmployees();
    }
}
