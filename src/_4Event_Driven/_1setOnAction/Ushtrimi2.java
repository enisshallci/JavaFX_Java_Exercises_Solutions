package _4Event_Driven._1setOnAction;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ushtrimi2 extends Application implements EventHandler<ActionEvent>{

    Button button;
    Button buttoni2;

    public void start(Stage primaryStage) {

        //Event Source Object
        button = new Button("OK");
        buttoni2 = new Button("Stop");
        button.setPrefWidth(100);
        buttoni2.setPrefWidth(100);
        HBox pane = new HBox(25);
        pane.setAlignment(Pos.CENTER);

        //Krijimi i Event Handler Object
        button.setOnAction(this);   // vetë instancen e applikacionit tem (klases teme).
        buttoni2.setOnAction(this);

        System.out.println(this);

        pane.getChildren().addAll(button, buttoni2);
        primaryStage.setScene(new Scene(pane, 500, 500));
        primaryStage.setTitle("Pane");
        primaryStage.show();
    }

    public void handle(ActionEvent event) {
        if (event.getSource() == button) {  //slejohet button nese nuk eshte fushë e klases, instance variable e jo e metodes
            System.out.println("OK, vazhdo!");
        } else {
            System.out.println("Stop, mos vazhdo");
        }
    }

    //Automatikisht
    public String toString() {
        return "Ky eshte JavaFX Aplikacioni (klasa) ime e krijuar nga unë ";
    }
}

