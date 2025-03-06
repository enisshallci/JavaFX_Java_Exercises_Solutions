package _5Animations;

import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Ushtrimi1_1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();

        Rectangle rectangle = new Rectangle(0, 0, 25, 50);
        rectangle.setFill(Color.ORANGE);

        Circle circle = new Circle(200, 200, 50);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        PathTransition pt = new PathTransition();
        pt.setDuration(Duration.seconds(4));
        pt.setPath(circle);
        pt.setNode(rectangle);
        pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt.setCycleCount(Timeline.INDEFINITE);
        pt.setAutoReverse(true);

        pt.play();

        circle.setOnMouseClicked(e -> {
            if (pt.getStatus() == PathTransition.Status.STOPPED || pt.getStatus() == Animation.Status.PAUSED) {
                pt.play();
            } else {
                pt.pause();
            }
        });

        pane.getChildren().addAll(circle, rectangle);
        primaryStage.setScene(new Scene(pane, 400, 400));
        primaryStage.setTitle("KeyEventDemo");
        primaryStage.show();
    }
}
