package _3Shapes;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class Ushtrimi7_Trekendesh extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    public void start(Stage primaryStage) {

        Pane pane = new Pane();

        Polygon polygon = new Polygon(100,200,200,20,300,200);
        pane.getChildren().add(polygon);
        polygon.setFill(Color.GREEN);
        polygon.setStroke(Color.BLACK);

        ObservableList<Double> list = polygon.getPoints();
        System.out.println(list);


        Scene scene = new Scene(pane, 400,400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Trekendeshi 1");
        primaryStage.show();

        //______________________________________________________________________________________________________________

        Pane pane2 = new Pane();

        Polygon polygon2 = new Polygon();
        ObservableList<Double> list2 = polygon2.getPoints();
        System.out.println("Para vendosjes se pikave: " + list2);

        list2.add(100.0);
        list2.add(200.0);

        list2.add(200.0);
        list2.add(20.0);

        list2.add(300.0);
        list2.add(200.0);

        System.out.println("Pas vendosjes se pikave: " + list2);

        pane2.getChildren().add(polygon2);
        Stage stage2 = new Stage();
        stage2.setTitle("Trekendeshi 2");
        stage2.setScene(new Scene(pane2, 400, 400));
        stage2.show();
    }
}
