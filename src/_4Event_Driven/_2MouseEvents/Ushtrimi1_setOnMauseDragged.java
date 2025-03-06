package _4Event_Driven._2MouseEvents;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ushtrimi1_setOnMauseDragged extends Application {

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane(); //StackPane nuk leviz tani teksti, mbetet qaty nmes gjith KUJDES!!!
        Text text = new Text(20, 60, "Programming is Fun");
        text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
        text.setFill(Color.BLUE);

        //Kordinatat x dhe y të text behen set ne pozicionin e mausit.
        text.setOnMouseDragged(e -> {
            text.setX(e.getX());
            text.setY(e.getY());
        });

        pane.getChildren().add(text);
        primaryStage.setScene(new Scene(pane, 400, 400));
        primaryStage.show();
        primaryStage.setTitle("Mouse Dragged");

    }
}
