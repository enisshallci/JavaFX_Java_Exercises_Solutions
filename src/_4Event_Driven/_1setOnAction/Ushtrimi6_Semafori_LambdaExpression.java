package _4Event_Driven._1setOnAction;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Ushtrimi6_Semafori_LambdaExpression extends Application {

    public void start(Stage primaryStage) {

        VBox vbox = new VBox(15);
        vbox.setAlignment(Pos.CENTER);

        Circle circle1 = new Circle(50);
        Circle circle2 = new Circle(50);
        Circle circle3 = new Circle(50);

        circleColor(circle1);
        circleColor(circle2);
        circleColor(circle3);
        vbox.getChildren().addAll(circle1, circle2, circle3);
//_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _
        HBox hbox = new HBox(15);
        Button button1 = new Button("Red");
        Button button2 = new Button("Yellow");
        Button button3 = new Button("Green");
        hbox.getChildren().addAll(button1, button2, button3);
        hbox.setAlignment(Pos.CENTER);

        button1.setOnAction(e -> {
            circle1.setFill(Color.RED);
            circle2.setFill(Color.WHITE);
            circle3.setFill(null);   //e largon ngjyren (del si e hint), po e lo per me msu.
        });

        button2.setOnAction(e -> {
            circle2.setFill(Color.YELLOW);
            circle1.setFill(Color.WHITE);
            circle3.setFill(null);   //e largon ngjyren (del si e hint).
        });

        button3.setOnAction(e -> {
            circle3.setFill(Color.GREEN);
            circle1.setFill(Color.WHITE);
            circle2.setFill(null);      //e largon ngjyren (del si e hint).
        });
//_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _
        VBox pane = new VBox(15);
        pane.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(vbox, hbox);

        primaryStage.setScene(new Scene(pane));
        primaryStage.setTitle("Traffic Lights");
        primaryStage.show();

    }

    private void circleColor(Circle circle) {

        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
    }
}



