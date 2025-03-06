package _4Event_Driven._2MouseEvents;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Ushtrimi2_switchingBetweenScenes extends Application {

    private Stage primaryStage;
    private Scene scene1;
    private Scene scene2;

    @Override
    public void start(Stage primaryStage) {

        this.primaryStage = primaryStage;

        //Create Scenes
        createScene1();
        createScene2();

        primaryStage.setScene(scene1);
        primaryStage.setTitle("Multiple Scenes Example");
        primaryStage.show();
    }

    private void createScene1() {
        Button switchSceneButton = new Button("Switch to Scene 2");
        switchSceneButton.setOnAction(e -> {
            primaryStage.setScene(scene2);
        });

        Circle circle = new Circle(50);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        StackPane layout = new StackPane(circle, switchSceneButton);
        scene1 = new Scene(layout, 300, 200);   //krijimi i scene1
    }

    private void createScene2() {
        Button switchSceneButton = new Button("Switch to Scene 1");
        switchSceneButton.setOnAction(e -> primaryStage.setScene(scene1));

        StackPane layout = new StackPane(switchSceneButton);
        scene2 = new Scene(layout, 300, 200);   //krijimi i scene2
    }
}
