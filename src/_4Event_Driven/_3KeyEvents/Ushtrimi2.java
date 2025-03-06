package _4Event_Driven._3KeyEvents;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ushtrimi2 extends Application {

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();
        Text text = new Text(30, 30, "A");

        text.setOnKeyPressed(e -> {
            System.out.println("Unicode Character: " + e.getCharacter());      //svyn sen
            System.out.println("The value as defined in the Table page 604: " + e.getCode());
            System.out.println("String that describes the keyCode: " + e.getText().toString());
            System.out.println("-".repeat(30));
        });

        pane.getChildren().add(text);
        primaryStage.setScene(new Scene(pane, 400, 400));
        primaryStage.setTitle("KeyEventDemo");
        primaryStage.show();

        text.requestFocus();        // text is focused to receive key input.
    }
}
