package _3Shapes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class Ushtrimi4_Circle_Ellipse extends Application {

    public void start(Stage primaryStage) {

        Pane pane = new Pane();

//        Ellipse ellipse = new Ellipse();

        for (int i = 0; i < 16; i++) {
            Ellipse e = new Ellipse(150, 100, 100, 50);
            e.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
            e.setFill(Color.WHITE);
            e.setRotate(i * 180 / 16);
            pane.getChildren().add(e);
        }

        primaryStage.setScene(new Scene(pane, 300, 300));
        primaryStage.setTitle("Ellipses");
        primaryStage.show();

        //______________________________________________________________________________________________________________

        //BONE ELIPSEN RRETH
        Pane pane2 = new Pane();

        Ellipse e = new Ellipse();
        e.centerXProperty().bind(pane2.widthProperty().divide(2));
        e.centerYProperty().bind(pane2.heightProperty().divide(2));
        e.setRadiusX(100);
        e.setRadiusY(100);
        e.setFill(Color.WHITE);
        e.setStroke(Color.BLACK);

        pane2.getChildren().add(e);

        Scene scene = new Scene(pane2, 300, 300);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Elipsa 1");
        stage.show();

        //______________________________________________________________________________________________________________

        //BONE ELIPSEN RRETH
        Pane pane3 = new Pane();

        Ellipse e2 = new Ellipse();
        e2.centerXProperty().bind(pane2.widthProperty().divide(2));
        e2.centerYProperty().bind(pane2.heightProperty().divide(2));
        e2.setRadiusX(100);
        e2.setRadiusY(50);
        e2.setFill(Color.WHITE);
        e2.setStroke(Color.BLACK);

        pane3.getChildren().add(e2);

        Scene scene2 = new Scene(pane3, 300, 300);
        Stage stage2 = new Stage();
        stage2.setScene(scene2);
        stage2.setTitle("Elipsa 2");
        stage2.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
