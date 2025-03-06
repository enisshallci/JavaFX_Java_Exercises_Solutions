package _4Event_Driven._1setOnAction;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ushtrimi4_AnonymousHandler extends Application {

    @Override
    public void start(Stage primaryStage) {

        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.CENTER);
        Button button1 = new Button("New");
        Button button2 = new Button("Open");
        Button button3 = new Button("Save");
        Button button4 = new Button("Print");

        hbox.getChildren().addAll(button1, button2, button3, button4);

        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Process New");
            }
        });

        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Process Open");
            }
        });

        button3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Process Save");
            }
        });

        button4.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               System.out.println("Process Print");
           }
        });

        primaryStage.setScene(new Scene(hbox, 350, 350));
        primaryStage.setTitle("Anonymous Inner Class Handlers");
        primaryStage.show();

    }
}
