package _4Event_Driven._1setOnAction;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Ushtrimi3_Enlarge_Shrink extends Application {

    private CirclePane circlePane = new CirclePane();   // Fushë ngase kena me iu qas kesaj fushe jashta metodes start tek
                                                        // klasat e brendshme
    public void start(Stage primaryStage) {

        HBox hbox = new HBox(10);
        Button button1 = new Button("Enlarge");
        Button button2 = new Button("Shrink");
        hbox.setAlignment(Pos.CENTER);
        hbox.setPadding(new Insets(0, 0,20, 0));
        hbox.getChildren().addAll(button1, button2);

        //Create and Register the handler:
        button1.setOnAction(new EnlargeHandler());

        //Create and Register the handler:
        button2.setOnAction(new ShrinkHandler());

        circlePane.setStyle("-fx-border-color: black");

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(circlePane);
        borderPane.setBottom(hbox);

        primaryStage.setScene(new Scene(borderPane, 400, 300));
        primaryStage.setTitle("Control Circle");
        primaryStage.show();
    }

    private class EnlargeHandler implements EventHandler<ActionEvent> {
        // inner class ne menyre qe me bo te qasshëm reference variablen circlePane nga metoda handle().
        @Override
        public void handle(ActionEvent event) {
            circlePane.enLarge();
        }
    }

    private class ShrinkHandler implements EventHandler<ActionEvent> {      // inner class

        @Override
        public void handle(ActionEvent event) {
            circlePane.shrink();
        }
    }
}

/*
    Klase e re per te shtuar nje Circle ne Pane, praktike shume e mire qe te gjitha ndryshimet te behen ne te njejtin objekt.
    ndryshimet (shrink, enlarge) te behen ne te njejtin objekt (circle).
 */
class CirclePane extends StackPane {

    private Circle circle = new Circle(50);  //private kete fushë, ma mir keshtu si fushe ngase posht manipulojme me te njejtin
    //objekt gjithmone

    public CirclePane() {
        getChildren().add(circle);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
    }

    /*
        Keto dy metoda tash kane qasje ne objektin "Circle()" permes fushes(variable reference) te quajtur "circle".
    */

    public void enLarge() {
        circle.setRadius(circle.getRadius() + 2);
    }

    public void shrink() {
        circle.setRadius(circle.getRadius() > 2 ? circle.getRadius() - 2 : circle.getRadius());
        //Po sepse nese eshte 2 - 2 = 0, atehere le te kthen qysh ka qenë ne heren e fundit pra 2.
        System.out.println(circle.getRadius());
    }
}

