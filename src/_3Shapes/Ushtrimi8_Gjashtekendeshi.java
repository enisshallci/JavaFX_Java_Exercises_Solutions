package _3Shapes;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class Ushtrimi8_Gjashtekendeshi extends Application {

    public void start(Stage primaryStage) {

        Pane pane = new Pane();

        Polygon polygon = new Polygon();
        polygon.setFill(Color.WHITE);
        polygon.setStroke(Color.BLACK);
        pane.getChildren().add(polygon);

        ObservableList<Double> list = polygon.getPoints();
        double centerX = 100;
        double centerY = 100;
        final double RADIUS = 80;

        for (int i = 0; i < 6; i++) {
            list.add(centerX + RADIUS * Math.cos(2 * i * Math.PI / 6));
            list.add(centerY - RADIUS * Math.sin(2 * i * Math.PI / 6));
        }

        primaryStage.setScene(new Scene(pane, 400, 400));
        primaryStage.setTitle("Gjashtëkëndëshi");
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
