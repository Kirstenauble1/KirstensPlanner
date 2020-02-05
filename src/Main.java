import javafx.application.Application;
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
import java.awt.event.ActionEvent;

public class Main extends Application {

    @Override
    public void start(Stage stage){
        stage.setTitle("Kirsten's Planner");
        GridPane pane = new GridPane();
        Planner planner = new Planner("C:/Users/kirst/OneDrive/Desktop/random.txt");
        for(int i = 0; i < planner.getSize(); i ++){
            TextField t = new TextField(planner.getTasks().get(i).getName() + " " + planner.getTasks().get(i).getDueDate());
            pane.add(t, 0, i);
            Button remove = new Button("Mark as Done");


            remove.setOnAction();
            pane.add(remove, i, 4);
        }
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);

    }
}
