package _4Event_Driven._3KeyEvents;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ushtrimi1_2 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Text text = new Text(20, 20, "A");

        pane.getChildren().add(text);
        text.setOnKeyPressed(e -> {
            System.out.print(e.getCode().toString());      //Shkruan texte ne terminal.
        });

        primaryStage.setScene(new Scene(pane, 400, 400));
        primaryStage.setTitle("KeyEventDemo");
        primaryStage.show();

        text.requestFocus();        // text is focused to receive key input.
    }
}
