package _6Control_UI;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ushtrimi2_Button extends Application {

    protected Text text = new Text(50, 50, "JavaFX Programming");

    protected BorderPane getPane() {
        HBox hbox = new HBox(20);
        Button button1 = new Button("Left", new Text("<-"));
        Button button2 = new Button("Right", new Text("->"));
        button2.setContentDisplay(ContentDisplay.RIGHT);

        hbox.getChildren().addAll(button1, button2);
        hbox.setAlignment(Pos.CENTER);
        hbox.setStyle("-fx-border-color: green");

        BorderPane pane = new BorderPane();
        pane.setBottom(hbox);

        Pane paneText = new Pane();
        paneText.getChildren().add(text);
        pane.setCenter(paneText);

        button1.setOnAction(e-> text.setX(text.getX() - 10));
        button2.setOnAction(e -> text.setX(text.getX() + 10));

        return pane;
    }

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setScene(new Scene(getPane(), 400, 400));
        primaryStage.show();
        primaryStage.setTitle("ButtonDemo");
    }
}
