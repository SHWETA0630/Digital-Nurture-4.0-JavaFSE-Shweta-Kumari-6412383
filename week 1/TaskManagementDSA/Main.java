package TaskManagementDSA;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask(new Task("T01", "Design UI", "Pending"));
        manager.addTask(new Task("T02", "Fix Bug #42", "In Progress"));
        manager.addTask(new Task("T03", "Code Review", "Completed"));

        System.out.println("All Tasks:");
        manager.traverseTasks();

        System.out.println("\nSearching for T02:");
        Task found = manager.searchTask("T02");
        System.out.println(found != null ? found : "Task not found");

        System.out.println("\nDeleting T02...");
        manager.deleteTask("T02");

        System.out.println("\nUpdated Task List:");
        manager.traverseTasks();
    }
}
