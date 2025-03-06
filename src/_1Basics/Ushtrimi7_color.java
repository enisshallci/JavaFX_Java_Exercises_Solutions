package _1Basics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Ushtrimi7_color extends Application {

    @Override
    public void start(Stage primaryStage) {
        //Nese ka ndonje gabim ne CSS programi prap do te kompajlohet dhe ekzekutohet por css do te injorohet.
        StackPane pane = new StackPane();
        Button btn = new Button("JavaFX");
        btn.setStyle("-fx-border-color: blue");

        pane.getChildren().add(btn);
        pane.setRotate(45); //bashk me pane kane mu rrotullu edhe nodes brenda saj.
        pane.setStyle("-fx-border-color: red; -fx-background-color: lightgrey");

        Scene scene = new Scene(pane, 400, 400);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Styles");
        primaryStage.show();
    }


    public static void main(String[] args) {
        Application.launch(args);
    }
}
