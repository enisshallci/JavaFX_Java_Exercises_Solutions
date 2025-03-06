package _5Animations;

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

public class Ushtrimi1_PathTransition extends Application {

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();

        Rectangle rectangle = new Rectangle(0, 0, 25, 50);
        rectangle.setFill(Color.ORANGE);

        Circle circle = new Circle(125, 100, 50);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        pane.getChildren().addAll(circle, rectangle);

        PathTransition pt = new PathTransition();
        pt.setDuration(Duration.millis(4000));
        pt.setPath(circle);
        pt.setNode(rectangle);
        pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);

        pt.setCycleCount(Timeline.INDEFINITE);
        pt.setAutoReverse(true);
        pt.setCycleCount(2);
        pt.pause();

        circle.setOnMousePressed(e-> pt.pause());    //Kur e klikon rrethin ndalet rrotullimi.
        circle.setOnMouseReleased(e -> pt.play());  //Kur e leshon mausin ateher vazhdon rrotullimi.

        Scene scene = new Scene(pane, 250, 200);
        primaryStage.setTitle("PathTransition");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
