package TaskManagementDSA;

public class Task {
    String taskId;
    String taskName;
    String status;

    public Task(String taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
    }

    public String getTaskId() {
        return taskId;
    }

    public String toString() {
        return taskId + " | " + taskName + " | " + status;
    }
}
