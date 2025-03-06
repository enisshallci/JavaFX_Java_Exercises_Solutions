package _2Panes;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Ushtrimi4_BorderPane extends Application {

    public void start(Stage primaryStage) {

        BorderPane pane = new BorderPane();

        pane.setTop(new CustomPane("Top"));
        pane.setRight(new CustomPane("Right"));
        pane.setBottom(new CustomPane("Bottom"));
        pane.setLeft(new CustomPane("Left"));

        primaryStage.setScene(new Scene(pane, 950, 250));
        primaryStage.setTitle("BorderPane1");
        primaryStage.show();

        //_______________________Stage2________________________

        BorderPane pane2 = new BorderPane();

        Button topButton = new Button("Top");
        Button bottomButton = new Button("Bottom");
        Button leftButton = new Button("Left");
        Button rightButton = new Button("Right");
        Button centerButton = new Button("Center");

        pane2.setTop(topButton);
        pane2.setBottom(bottomButton);
        pane2.setRight(rightButton);
        pane2.setLeft(leftButton);
        pane2.setCenter(centerButton);

        Button[] buttons = {topButton, bottomButton, leftButton, rightButton, centerButton};
        for (Button button : buttons) {
            pane2.setAlignment(button, Pos.CENTER);
        }

        //pane2.setTop(null);      // Këtu s'ka remove();

        Stage stage2 = new Stage();
        stage2.setScene(new Scene(pane2, 950, 250));
        stage2.setTitle("BorderPane1");
        stage2.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}


class CustomPane extends StackPane {       //Arsyeja pse po na dalin n'mes.

    public CustomPane(String title) {
        getChildren().add(new Label(title));        //ne fakt ti prap po i bjen si me perdor pane.get....
        setStyle("-fx-background-color: skyblue");          ///. vetem se tash direkt ne objekt mrena
        setPadding(new Insets(11.5, 12.5 ,13.5, 14.5));
    }

}