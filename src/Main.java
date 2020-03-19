import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage){
        stage.setTitle("Kirsten's Planner");
        GridPane pane = new GridPane();
        Scene sc = new Scene(pane);
        Planner planner = new Planner("C:/Users/kirst/OneDrive/Desktop/random.txt");
        for(int i = 0; i < planner.getSize(); i ++){
            TextField t = new TextField(planner.getTasks().get(i).getName() + " " + planner.getTasks().get(i).getDueDate());
            pane.add(t, 0, i);
            Button remove = new Button("Mark as Done");
            Task temp = planner.getTasks().get(i);
            remove.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent e) {
                    planner.removeTask(temp);
                }
            });
            pane.add(remove, i, 4);
        }
        Button addTask = new Button("Add Task");
        addTask.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                // must open input box for task information, seperated by commas
                //
            }
        });
        pane.add(addTask, 10, 2);
        stage.setScene(sc);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);

    }
}
