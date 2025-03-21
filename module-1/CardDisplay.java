/*  Steve Stylin
 3/21/2025
 Assignment: JavaFX Card Display Application 
 Purpose: To display four randomly selected playing cards from a deck of 52 cards.
 Card list provided in assignment:  The AssignmentCards.zip
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CardDisplay extends Application {

    private static final String IMAGE_PATH = "cards/";
    private static final int TOTAL_CARDS = 52;
    private List<ImageView> cardViews = new ArrayList<>();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox(10);
        Button refreshButton = new Button("Refresh Cards");

        // Initialize card views
        for (int i = 0; i < 4; i++) {
            ImageView cardView = new ImageView();
            cardView.setFitWidth(100);
            cardView.setFitHeight(140);
            cardViews.add(cardView);
            root.getChildren().add(cardView);
        }

        // Load initial cards
        loadRandomCards();

        // Set up button action using a lambda expression
        refreshButton.setOnAction(event -> loadRandomCards());

        root.getChildren().add(refreshButton);
        Scene scene = new Scene(root, 200, 700);
        primaryStage.setTitle("Random Card Display");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void loadRandomCards() {
        List<Integer> cardIndices = new ArrayList<>();
        for (int i = 1; i <= TOTAL_CARDS; i++) {
            cardIndices.add(i);
        }

        // Shuffle the card indices
        Collections.shuffle(cardIndices);

        // Load images for the first four shuffled indices
        for (int i = 0; i < 4; i++) {
            String imagePath = IMAGE_PATH + cardIndices.get(i) + ".png";
            Image cardImage = new Image(new File(imagePath).toURI().toString());
            cardViews.get(i).setImage(cardImage);
        }
    }
}
