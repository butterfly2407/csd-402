// Katie Hilliard, 02/23/2024 Module 10 Assignment

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX example using a ScrollPane and TitledPane
 */
public class ScrollTitledPaneDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create TitlePane Content
        VBox content = new VBox();
        for (int i = 1; i <= 10; i++) {
            content.getChildren().add(new Label("Item " + i));
        }
        
        // Create TitlePane
        TitledPane titledPane = new TitledPane("Expandable Section", content);
        titledPane.setExpanded(true);

        // Wrap TitledPane in a ScrollPane
        ScrollPane scrollPane = new ScrollPane(titledPane);
        scrollPane.setFitToWidth(true);
        scrollPane.setPannable(true);
        
        // ScrollPane appears AS NEEDED
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);

        // Define dimensions
        Scene scene = new Scene(scrollPane, 400, 400);
        primaryStage.setTitle("JavaFX Single ScrollPane and TitledPane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Main method to launch the JavaFX application.
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        launch(args);
    }
}
