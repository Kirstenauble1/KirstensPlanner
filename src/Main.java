import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application{

    @Override
    public void start(Stage stage){
        stage.setTitle("Kirsten's Planner");
        Planner planner = new Planner("C:/Users/kirst/OneDrive/Desktop/random.txt");
        for(int i = 0; i < planner.getSize(); i ++){

        }
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);

    }
}
