package _4Event_Driven._2MouseEvents;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Ushtrimi5_Methods extends Application {

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();
        Circle circle = new Circle(200,200,50);
        Scene scene = new Scene(pane,400,600);

        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        scene.setOnMouseClicked((MouseEvent event) -> {
            System.out.println("X cordinate of mouse on scene: " + event.getSceneX());
            System.out.println("Y cordinate of mouse on scene: " + event.getSceneY());

            System.out.println("X cordinate of mouse point on screen: " + event.getScreenX());
            System.out.println("Y cordinate of mouse point on screen: " + event.getScreenY());
        });

//        scene.setOnMouseClicked(event -> {        Me ja hek komentet e "Mbishkruan" event handlerin nalt.
//            System.out.println(event.isAltDown());
//            System.out.println(event.isShiftDown());
//        });

        pane.getChildren().add(circle);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Mouse Methods");
        primaryStage.show();

    }
}
