package _4Event_Driven._3KeyEvents;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ushtrimi1 extends Application {

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();
        Text text = new Text(20, 20, "A");

        pane.getChildren().add(text);
        text.setOnKeyPressed(e -> {
           switch(e.getCode()) {
               case DOWN -> text.setY(text.getY() + 10);
               case UP -> text.setY(text.getY() - 10);
               case LEFT -> text.setX(text.getX() - 10);
               case RIGHT -> text.setX(text.getX() + 10);
               default -> {
                   if (e.getText().length() > 0) {
                       if (Character.isLetterOrDigit(e.getText().charAt(0))) {
                           text.setText(e.getText());
                       }
                       else {
                           text.setText(e.getCode().toString());
                       }
                   }
                   else {
                       text.setText(e.getCode().toString());        //Sepse Shift, ALT e do qishtu e kane length 0.
                   }
               }
           }
        });

        primaryStage.setScene(new Scene(pane, 400, 400));
        primaryStage.setTitle("KeyEventDemo");
        primaryStage.show();

        text.requestFocus();        // text is focused to receive key input.
    }
}
