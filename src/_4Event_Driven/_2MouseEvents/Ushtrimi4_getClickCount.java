package _4Event_Driven._2MouseEvents;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ushtrimi4_getClickCount extends Application {

    private static int count;

    @Override
    public void start(Stage primaryStage) {

        HBox hbox = new HBox(20);

        Button button1 = new Button("Click +");
        button1.setPrefHeight(100);
        button1.setPrefWidth(100);
        hbox.getChildren().addAll(button1);
        hbox.setAlignment(Pos.CENTER);

        button1.setOnMouseClicked(event -> {
            clickCount(event);
        });

        primaryStage.setScene(new Scene(hbox, 400, 400));
        primaryStage.show();
        primaryStage.setTitle("Click Counts");
    }

    private void clickCount(MouseEvent event) {
        System.out.println("Mouse Clicked: " + event.getClickCount());
//        count = event.getClickCount();
    }



}
