import java.util.ArrayList;
import java.util.Collections;

public class Planner{

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
        Collections.sort(tasks);
    }


}
