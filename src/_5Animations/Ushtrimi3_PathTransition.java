package _5Animations;

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Ushtrimi3_PathTransition extends Application {

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();

        Rectangle rectangle = new Rectangle(250, 250, 100, 100);
        rectangle.setFill(Color.FIREBRICK);
        rectangle.setStroke(Color.BLACK);


        Line line = new Line(0,0,100, 100);
        line.setFill(Color.RED);

        PathTransition pt = new PathTransition(Duration.seconds(5), rectangle, line);
        pt.setCycleCount(5);
        pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt.play();

        pane.getChildren().addAll(rectangle, line);

        primaryStage.setScene(new Scene(pane, 500, 500));
        primaryStage.setTitle("PathTransition");
        primaryStage.show();
    }
}
