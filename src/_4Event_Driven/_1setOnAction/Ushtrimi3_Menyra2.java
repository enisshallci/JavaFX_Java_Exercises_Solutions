package _4Event_Driven._1setOnAction;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Ushtrimi3_Menyra2 extends Application implements EventHandler<ActionEvent> {

    CirclePanee circlePane = new CirclePanee();
    Button button1;
    Button button2;
    @Override
    public void start(Stage primaryStage) {

        BorderPane pane = new BorderPane();

        button1 = new Button("Enlarge");
        button2 = new Button("Shrink");
        HBox hbox = new HBox(15, button1, button2);
        hbox.setAlignment(Pos.CENTER);
        hbox.setPadding(new Insets(15, 0, 15,0));

        //
        button1.setOnAction(this);
        button2.setOnAction(this);

        pane.setCenter(circlePane);
        circlePane.setStyle("-fx-border-color: black");
        pane.setBottom(hbox);

        primaryStage.setScene(new Scene(pane, 450, 400));
        primaryStage.show();
        primaryStage.setTitle("Ushtrime");
    }

    @Override
    public void handle(ActionEvent e) {
        if (e.getSource() == button1) {
            circlePane.enlarge();
        } else {
            circlePane.shrink();
        }
    }
}

class CirclePanee extends StackPane {

    Circle circle = new Circle(50);

    public CirclePanee() {
        getChildren().add(this.circle);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
    }

    public void enlarge() {
        this.circle.setRadius(this.circle.getRadius() + 2);
    }

    public void shrink() {
        if (circle.getRadius() > 2) {
            this.circle.setRadius(this.circle.getRadius() - 2);
        }
    }
}

