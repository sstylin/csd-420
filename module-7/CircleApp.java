
/*  Steve Stylin Module 7.2: More JavaFx
 * CircleApp
 */


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        // Create circles
        Circle circle1 = new Circle(50, Color.WHITE);
        circle1.setStyle("-fx-fill: white; -fx-stroke: black; -fx-stroke-width: 2;");
        circle1.setCenterX(100);
        circle1.setCenterY(100);

        Circle circle2 = new Circle(50, Color.RED);
        circle2.setId("redcircle");
        circle2.setCenterX(250);
        circle2.setCenterY(100);

        Circle circle3 = new Circle(50, Color.GREEN);
        circle3.setId("greencircle");
        circle3.setCenterX(400);
        circle3.setCenterY(100);

        Circle circle4 = new Circle(50, Color.WHITE);
        circle4.setStyle("-fx-fill: white; -fx-stroke: black; -fx-stroke-width: 2;");
        circle4.setCenterX(550);
        circle4.setCenterY(100);

        // Add circles to the pane
        pane.getChildren().addAll(circle1, circle2, circle3, circle4);

        // Create a scene and set the stylesheet
        Scene scene = new Scene(pane, 700, 200);
        scene.getStylesheets().add(getClass().getResource("mystyle.css").toExternalForm());

        primaryStage.setTitle("Steve Stylin Module7 Cicrle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
