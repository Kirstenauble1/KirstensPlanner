import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Planner{

    private ArrayList<Task> tasks;

    private int size;

    public File file;

    Planner(String file){
        this.tasks = new ArrayList<>();
        this.file = new File(file);
    }

    public int getSize(){
        return this.size;
    }

    public ArrayList<Task> getTasks(){
        return this.tasks;
    }

    public void addTask(Task newTask) {
        tasks.add(newTask);
        Collections.sort(tasks);
        try{
            PrintWriter writer = new PrintWriter(file);
            writer.print("");
            writer.close();
        }catch(FileNotFoundException f){
            System.exit(0);
        }
        try {
            FileWriter writer = new FileWriter(this.file, true);
            for (int i = 0; i < tasks.size(); i++) {
                writer.write(tasks.get(i).getName());
                writer.write(" ");
                writer.write(tasks.get(i).getDueDate());
                writer.write(" ");
                writer.write(tasks.get(i).getCourse());
                writer.write("\n");
            }
        }catch(IOException i){
            System.exit(0);
        }
        this.size += 1;
    }

    public void removeTask(Task t) {
        for(int i = 0; i < this.size; i++){
            if(t.getName().equals(this.tasks.get(i).getName())){
                this.tasks.remove(i);
                Collections.sort(this.tasks);
                break;
            }
        }
    }

    public void readFile() {
        BufferedReader reader;
        try{
            reader = new BufferedReader(new FileReader(this.file));
            String line = reader.readLine();
            while(line != null){
                String[] splitOnSpace = line.split(" ");
                String name = splitOnSpace[0];
                String date = splitOnSpace[1];
                String course = splitOnSpace[2];
                Task add = new Task(name, date, course);
                addTask(add);
                this.size = this.size + 1;
                line = reader.readLine();
            }
        }catch(IOException e){
            System.exit(0);
        }
    }

}
