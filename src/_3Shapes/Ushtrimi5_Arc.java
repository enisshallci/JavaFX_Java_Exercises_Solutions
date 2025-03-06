package _3Shapes;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Ushtrimi5_Arc extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    public void start(Stage primaryStage) {

        Pane pane = new Pane();

        Arc arc1 = new Arc(150, 150, 80, 80, 0 + 30, 35);
        arcColor(arc1);

        Arc arc2 = new Arc(150, 150, 80, 80,  90 + 30, 35);
        arcColor(arc2);

        Arc arc3 = new Arc(150, 150, 80, 80,  180 + 30, 35);
        arcColor(arc3);

        Arc arc4 = new Arc(150, 150, 80, 80, 270 + 30, 35);
        arcColor(arc4);

        pane.getChildren().addAll(arc1, arc2, arc3, arc4);

        primaryStage.setScene(new Scene(pane, 300, 300));
        primaryStage.show();
        primaryStage.setResizable(false);
        primaryStage.setTitle("Arcusa");
    }

    private void arcColor(Arc arc) {
        arc.setFill(Color.FIREBRICK);
        arc.setType(ArcType.ROUND);
    }
}