package _4Event_Driven._1setOnAction;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

//SA KODIN E KE KURSE ME LAMBDA EXPRESSION!!!!!!!!
public class Ushtrimi8_Semafori_InnerClass extends Application {

    CircleVbox circleVbox = new CircleVbox();

    public void start(Stage primaryStage) {

        Button button1 = new Button("Red");
        Button button2 = new Button("Yellow");
        Button button3 = new Button("Green");

        button1.setOnAction(new handleRed());
        button2.setOnAction(new handleYellow());
        button3.setOnAction(new handleGreen());

        HBox hbox = new HBox(15);

        hbox.getChildren().addAll(button1, button2, button3);
        hbox.setAlignment(Pos.CENTER);

        VBox pane = new VBox(15);   //Kryesorja
        pane.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(circleVbox, hbox);

        primaryStage.setScene(new Scene(pane));
        primaryStage.setTitle("Traffic Lights");
        primaryStage.show();
    }

    class handleRed implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            circleVbox.redCircle();
        }
    }

    class handleYellow implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            circleVbox.yellowCircle();
        }
    }

    class handleGreen implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            circleVbox.greenCircle();
        }
    }
}

class CircleVbox extends VBox {

    Circle circle1 = new Circle(50);
    Circle circle2 = new Circle(50);
    Circle circle3 = new Circle(50);

    public CircleVbox() {

        setAlignment(Pos.CENTER);

        circleColor(circle1);
        circleColor(circle2);
        circleColor(circle3);
        getChildren().addAll(circle1, circle2, circle3);
    }

    public void redCircle() {           //Metoda1

        circle1.setFill(Color.RED);
        circle2.setFill(Color.WHITE);
        circle3.setFill(Color.WHITE);
    }

    public void yellowCircle() {        //Metoda2

        circle2.setFill(Color.YELLOW);
        circle1.setFill(Color.WHITE);
        circle3.setFill(Color.WHITE);
    }

    public void greenCircle() {         //Metoda3

        circle3.setFill(Color.GREEN);
        circle1.setFill(Color.WHITE);
        circle2.setFill(Color.WHITE);
    }

    private void circleColor(Circle circle) {

        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
    }
}

