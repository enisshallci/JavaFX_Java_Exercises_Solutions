package _4Event_Driven._2MouseEvents;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Ushtrimi3_getButton extends Application {

    @Override
    public void start(Stage primaryStage) {

        Label label = new Label("Click Me!");
        StackPane root = new StackPane(label);
        Scene scene = new Scene(root, 400, 400);

        scene.setOnMouseClicked(event -> {
            handleMouseClicked(event);
        });

        primaryStage.setScene(scene);
        primaryStage.setTitle("MouseButton");
        primaryStage.show();
    }

    private void handleMouseClicked(MouseEvent event) {
        MouseButton button = event.getButton();
        switch (button) {
            case PRIMARY -> System.out.println("Me të Majtën");
            case SECONDARY -> System.out.println("Me të Djathtën");
            case MIDDLE -> System.out.println("Me Rrotë");
            default -> System.out.println("Asnjëra");
        }

        if (event.getButton() == MouseButton.PRIMARY) {
            System.out.println("Ne rregull, vazhdo!");
        }
    }
}
