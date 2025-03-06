package _5Animations;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Ushtrimi7_Timeline extends Application {

    @Override
    public void start(Stage primaryStage) {

        Circle circle = new Circle(50);
        circle.setFill(Color.RED);
        circle.setStroke(Color.BLACK);

        Button button1 = new Button("Play");
        Button button2 = new Button("Pause");
        HBox hbox = new HBox(15);
        hbox.setAlignment(Pos.CENTER);
        hbox.getChildren().addAll(button1, button2);

        VBox pane = new VBox(circle, hbox);
        pane.setSpacing(15);
        pane.setAlignment(Pos.CENTER);

        EventHandler<ActionEvent> eventHandler = e -> {
            if (circle.getFill() == Color.RED) {
                circle.setFill(Color.BLUE);
            }
            else {
                circle.setFill(Color.RED);
            }
        };

        Timeline animation = new Timeline(new KeyFrame(Duration.millis(2000), eventHandler));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();

        button1.setOnAction(e -> animation.play());
        button2.setOnAction(e -> animation.pause());

        primaryStage.setScene(new Scene(pane, 250, 250));
        primaryStage.setTitle("Circle Colors");
        primaryStage.show();
    }
}
