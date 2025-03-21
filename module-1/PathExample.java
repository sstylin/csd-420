
/* Steve Stylin */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Path;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.CubicCurveTo;
import javafx.stage.Stage;

public class PathExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create a Path object
        Path path = new Path();
        
        // Define the path using MoveTo and LineTo
        MoveTo moveTo = new MoveTo(50, 50);
        LineTo lineTo1 = new LineTo(150, 50);
        CubicCurveTo cubicCurveTo = new CubicCurveTo(200, 0, 200, 100, 150, 50);
        
        // Add the elements to the path
        path.getElements().addAll(moveTo, lineTo1, cubicCurveTo);
        
        // Set stroke properties
        path.setStroke(Color.MAGENTA);
        path.setStrokeWidth(2);
        
        // Create a layout and add the path
        Pane root = new Pane();
        root.getChildren().add(path);
        
        // Create a scene and set it on the stage
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("JavaFX Path simple Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
