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

public class Ushtrimi7_Semafori_this extends Application implements EventHandler<ActionEvent> {

    Button button1 = new Button("Red");
    Button button2 = new Button("Yellow");
    Button button3 = new Button("Green");

    Circle circle1 = new Circle(50);
    Circle circle2 = new Circle(50);
    Circle circle3 = new Circle(50);

    public void start(Stage primaryStage) {

        VBox vbox = new VBox(15);
        vbox.setAlignment(Pos.CENTER);

        circleColor(circle1);
        circleColor(circle2);
        circleColor(circle3);
        vbox.getChildren().addAll(circle1, circle2, circle3);
//_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _
        HBox hbox = new HBox(15);

        hbox.getChildren().addAll(button1, button2, button3);
        hbox.setAlignment(Pos.CENTER);

//_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _
        VBox pane = new VBox(15);
        pane.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(vbox, hbox);

        primaryStage.setScene(new Scene(pane));
        primaryStage.setTitle("Traffic Lights");
        primaryStage.show();

        button1.setOnAction(this);
        button2.setOnAction(this);
        button3.setOnAction(this);

    }

    private void circleColor(Circle circle) {

        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
    }

    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() == button1) {
            circle1.setFill(Color.RED);
            circle2.setFill(Color.WHITE);
            circle3.setFill(Color.WHITE);
        }
        else if (event.getSource() == button2) {
            circle2.setFill(Color.YELLOW);
            circle1.setFill(Color.WHITE);
            circle3.setFill(Color.WHITE);
        }
        else if (event.getSource() == button3) {
            circle3.setFill(Color.GREEN);
            circle1.setFill(Color.WHITE);
            circle2.setFill(Color.WHITE);
        }
    }

}


