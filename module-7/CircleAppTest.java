import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleAppTest extends Application {

    @Override
    public void start(Stage primaryStage) {
        // This method is required for JavaFX applications
    }

    @Test
    public void testCircleProperties() {
        Circle circle = new Circle();
        circle.setId("redcircle");
        circle.setCenterX(250);
        circle.setCenterY(100);

        assertEquals("redcircle", circle.getId());
        assertEquals(250, circle.getCenterX());
        assertEquals(100, circle.getCenterY());
    }
}
