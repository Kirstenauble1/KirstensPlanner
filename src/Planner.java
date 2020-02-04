import java.util.ArrayList;

public class Planner {

    private ArrayList<Task> tasks = new ArrayList<>();

    private int size;

    public int getSize(){
        return this.size;
    }

    public ArrayList<Task> getTasks(){
        return this.tasks;
    }

    public void addTask(Task newTask) {
        tasks.add(newTask);
    }
}
