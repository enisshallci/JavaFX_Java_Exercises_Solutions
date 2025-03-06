package _1Basics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Ushtrimi8_Color_FONT extends Application {

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new StackPane();
        pane.setBackground(new Background(new BackgroundFill(Color.SKYBLUE, null, null)));

        Circle circle = new Circle();
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.FIREBRICK);
        //Me Color.WHITE, Color.SKYBLUE etj me keto e mbishkrun perndryshe perzihet ngjyra e pane me kta.

        Label label = new Label("JavaFX");
        label.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));

        pane.getChildren().addAll(circle, label);

        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setTitle("Colors and Fonts");
    }

    public static void main(String[] args) {
        Application.launch();
    }
}