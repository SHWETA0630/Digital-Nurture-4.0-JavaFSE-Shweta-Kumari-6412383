package TaskManagementDSA;

public class TaskManager {
    private Node head;

    private static class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
    }

    public Task searchTask(String taskId) {
        Node temp = head;
        while (temp != null) {
            if (temp.task.getTaskId().equals(taskId))
                return temp.task;
            temp = temp.next;
        }
        return null;
    }

    public void traverseTasks() {
        Node temp = head;
        if (temp == null) {
            System.out.println("Task list is empty.");
            return;
        }
        while (temp != null) {
            System.out.println(temp.task);
            temp = temp.next;
        }
    }

    public void deleteTask(String taskId) {
        if (head == null) return;

        if (head.task.getTaskId().equals(taskId)) {
            head = head.next;
            return;
        }

        Node prev = head, curr = head.next;
        while (curr != null) {
            if (curr.task.getTaskId().equals(taskId)) {
                prev.next = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }
}
