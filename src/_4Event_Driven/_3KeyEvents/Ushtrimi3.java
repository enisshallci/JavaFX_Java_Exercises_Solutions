package _4Event_Driven._3KeyEvents;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Ushtrimi3 extends Application {

    private CirclePane circlePane = new CirclePane();

    @Override
    public void start(Stage primaryStage) {

        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.CENTER);
        Button enlargeButton = new Button("Enlarge");
        Button shrinkButton = new Button("Shrink");

        hbox.getChildren().addAll(enlargeButton, shrinkButton);

        enlargeButton.setOnAction(e -> {
            circlePane.enlarge();
        });

        shrinkButton.setOnAction(e-> {
            circlePane.shrink();
        });

        circlePane.setOnMouseClicked(e-> {
            if (e.getButton() == MouseButton.PRIMARY) {
                circlePane.enlarge();
            }
            else if (e.getButton() == MouseButton.SECONDARY) {
                circlePane.shrink();
            }
        });

        circlePane.setOnKeyPressed(e -> {
           if (e.getCode() == KeyCode.E || e.getText().equalsIgnoreCase("q")) {
               circlePane.enlarge();
           }

           else if (e.getCode() == KeyCode.S) {
               circlePane.shrink();
           }
        });


        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(circlePane);
        borderPane.setBottom(hbox);
        BorderPane.setMargin(hbox, new Insets(0, 0, 50, 0));

        Scene scene = new Scene(borderPane, 400, 400);
        primaryStage.setTitle("ControlCircle"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        circlePane.requestFocus();
    }
}

class CirclePane extends StackPane {

    Circle circle = new Circle(50);

    public CirclePane() {
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        getChildren().add(circle);
    }

    public void enlarge() {
        this.circle.setRadius(circle.getRadius() + 2);
    }

    public void shrink() {
        this.circle.setRadius(circle.getRadius() > 2 ? circle.getRadius() - 2 : circle.getRadius());
    }
}
