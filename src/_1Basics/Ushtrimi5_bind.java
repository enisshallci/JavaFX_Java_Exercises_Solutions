package _1Basics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Ushtrimi5_bind extends Application {

    public void start(Stage primaryStage) {


        Pane pane = new Pane();

        Circle circle = new Circle();
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));
        circle.setRadius(50);
        circle.setFill(Color.FIREBRICK);
        circle.setStrokeWidth(2);
        circle.setStroke(Color.DARKBLUE);

        pane.getChildren().add(circle);

        primaryStage.setScene(new Scene(pane, 400, 400));
        primaryStage.setTitle("Circle");
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
