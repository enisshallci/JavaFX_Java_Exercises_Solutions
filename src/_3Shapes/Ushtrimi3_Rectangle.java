package _3Shapes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ushtrimi3_Rectangle extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    public void start(Stage primaryStage) {

        Pane pane = new Pane();

        //Gjithmone merre nje pike referente

        //Drejtkendeshi 1
        Rectangle r1 = new Rectangle(25, 10, 90, 50);
        r1.setStroke(Color.FIREBRICK);
        r1.setFill(Color.WHITE);
        pane.getChildren().addAll(r1, new Text(10, 27, "R1"));

        //Drejtkendeshi2
        Rectangle r2 = new Rectangle(25, 70, 90, 50);
        pane.getChildren().addAll(r2, new Text(10, 87, "R2"));

        //Drejtkendeshi3
        Rectangle r3 = new Rectangle(25, 130, 90, 50);
        r3.setArcWidth(25);
        r3.setArcHeight(25);
        r3.setFill(Color.FIREBRICK);
        r3.setStroke(Color.BLACK);
        pane.getChildren().addAll(r3, new Text(10, 150, "R3"));

        //Drejtkendeshat
        for (int i = 0; i < 4; i++) {
            Rectangle r = new Rectangle(155, 70, 100, 30);
            r.setRotate(i * 360 / 8);
            r.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
            r.setFill(Color.WHITE);

            pane.getChildren().add(r);
        }

        //Drejtkendeshi4
        Rectangle r4 = new Rectangle(295, 10, 90, 50);
        r4.setFill(Color.FIREBRICK);
        r4.setStroke(Color.BLACK);
        r4.setArcWidth(30);
        r4.setArcHeight(30);
        Text text4 = new Text(280, 27, "R4");
        pane.getChildren().addAll(r4, text4);

        //Drejtkendeshi5
        Rectangle r5 = new Rectangle(295, 70, 90, 50);
        r5.setFill(Color.WHITE);
        r5.setStroke(Color.BLACK);
        pane.getChildren().addAll(r5, new Text(280, 87, "R5"));


        //Drejtkendeshi6
        Rectangle r6 = new Rectangle(295, 130, 90, 50);
        pane.getChildren().addAll(r6, new Text(280, 147, "R6"));


        //Drejtkendeshi i madh
        Rectangle r7 = new Rectangle(25, 200, 360, 50);
        Text text = new Text(10, 217, "R7");
        pane.getChildren().addAll(r7, text);

        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Rectangles");
        primaryStage.show();

    }

}
