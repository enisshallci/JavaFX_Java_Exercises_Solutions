package _5Animations;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Ushtrimi6_Timeline extends Application {

    @Override
    public void start(Stage primaryStage) {

        StackPane pane = new StackPane();
        Text text = new Text(20, 50, "Programming is fun");
        text.setFont(Font.font(20));
        text.setFill(Color.RED);
        pane.getChildren().add(text);

        //Create a handler for changing text
        EventHandler<ActionEvent> eventHandler = e -> {
           if (text.getText().length() != 0) {
               text.setText("");
           }
           else {
               text.setText("Programming is fun!");
           }
        };

        // Create animation for alternating text.
        Timeline animation = new Timeline(new KeyFrame(Duration.millis(1000), eventHandler));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();

        // Pause and Resume animation
        text.setOnMouseClicked(e -> {
            if (animation.getStatus() == Animation.Status.PAUSED) {
                animation.play();
            }
            else {
                animation.pause();
            }
        });

        primaryStage.setScene(new Scene(pane, 250, 250));
        primaryStage.setTitle("Timeline Demo");
        primaryStage.show();
    }
}
