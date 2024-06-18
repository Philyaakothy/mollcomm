import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void AddTask(Task task) {
        tasks.add(task);
        // You can include additional logic here if needed
    }

    // Method to display all tasks
    public void ShowTasks() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    // You can add more methods as needed
}

// Assuming you have a Task class defined somewhere
