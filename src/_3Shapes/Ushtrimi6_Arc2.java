package _3Shapes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class Ushtrimi6_Arc2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {

        Pane pane = new Pane();

        Arc arc1 = new Arc(150, 150, 50, 50, 0, 45);
        arcFormat(arc1);

        Arc arc2 = new Arc(150,150,50,50, 120,45);
        arcFormat(arc2);

        Arc arc3 = new Arc(150, 150, 50, 50,  240, 45);
        arcFormat(arc3);

        pane.getChildren().addAll(arc1, arc2, arc3);
        primaryStage.setScene(new Scene(pane, 300, 300));
        primaryStage.show();
        primaryStage.setTitle("Arc");
    }

    private void arcFormat(Arc arc) {
        arc.setFill(Color.FIREBRICK);
        arc.setType(ArcType.ROUND);
    }
}
