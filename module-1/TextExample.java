
/*Steve Stylin Module 1: Discussion board */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TextExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create a Text object
        Text text = new Text("Hi guys Welcome back to our fun Java class");
        
        // Set font properties
        text.setFont(Font.font("Arial", 36));
        text.setFill(javafx.scene.paint.Color.GREEN);
        
        // Create a layout and add the text
        StackPane root = new StackPane();
        root.getChildren().add(text);
        
        // Create a scene and set it on the stage
        Scene scene = new Scene(root, 800, 800);
        primaryStage.setTitle("JavaFX Text Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
