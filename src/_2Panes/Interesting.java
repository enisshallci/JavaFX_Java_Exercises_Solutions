package _2Panes;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Interesting extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        GridPane pane = new GridPane();
        pane.setVgap(10.5);
        pane.setHgap(10.5);
        pane.setPadding(new Insets(41.5, 42.5, 13.5, 14.5));
        pane.setAlignment(Pos.TOP_RIGHT);
        pane.setBackground(new Background(new BackgroundFill(Color.SKYBLUE, null, null)));

        //CENTER, CENTER_RIGHT
        //TOP_CENTER, TOP_RIGHT
        //BOTTOM_RIGHT, BOTTOM_LEFT, BOTTOM_CENTER

        pane.add(new Label("Name:"), 0,0);
        pane.add(new TextField(),1,0);
        pane.add(new Label("LastName"),0,1);
        pane.add(new TextField(),1,1);
        pane.add(new Label("Age"),0,2);

        Button button = new Button("Register");
        pane.add(button,1,3);
        pane.setHalignment(button, HPos.RIGHT);

        //Ma interesantja kjo poshte.
        TextField f = new TextField();
        f.setPrefColumnCount(1);            //direkt ne GridPane se merrke parasysh keshtu qe e bona ne kete forme.
        Pane pane1 = new Pane();
        pane1.getChildren().add(f);
        pane.add(pane1,1,2);

        primaryStage.setScene(new Scene(pane,500,500));
        primaryStage.setTitle("GridPane");
        primaryStage.show();

    }
}

