package _6Control_UI;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Ushtrimi5_TextField extends Ushtrimi4_RadioButton {

    @Override
    protected BorderPane getPane() {

        BorderPane pane = super.getPane();

        BorderPane paneForTextField = new BorderPane();
        paneForTextField.setPadding(new Insets(5, 5, 5, 5));
        paneForTextField.setStyle("-fx-border-color: green");
        paneForTextField.setLeft(new Label("Enter a new message"));

        TextField tf = new TextField();
//        tf.setAlignment(Pos.CENTER);    //qysh ka mu shfaq teksti ne TextField
        paneForTextField.setCenter(tf);
        pane.setTop(paneForTextField);

        tf.setOnAction(e -> text.setText(tf.getText()));

        return pane;
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setScene(new Scene(getPane(), 500, 500));
        primaryStage.setTitle("CheckBox-es");
        primaryStage.show();
    }
}
