package _6Control_UI;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Ushtrimi4_RadioButton extends Ushtrimi3_CheckBox {

    @Override
    protected BorderPane getPane() {

        BorderPane pane = super.getPane();

        VBox vbox = new VBox(20);
        vbox.setPadding(new Insets(5, 5, 5, 5));
        vbox.setStyle("-fx-border-color: green; -fx-border-width: 2");

        RadioButton button1 = new RadioButton("Red");
        RadioButton button2 = new RadioButton("Green");
        RadioButton button3 = new RadioButton("Blue");
        vbox.getChildren().addAll(button1, button2, button3);
        pane.setLeft(vbox);

        ToggleGroup group = new ToggleGroup();
        button1.setToggleGroup(group);
        button2.setToggleGroup(group);
        button3.setToggleGroup(group);

        button1.setOnAction( e-> {
                text.setFill(Color.RED);
        });

        button2.setOnAction( e-> {
                text.setFill(Color.GREEN);
        });

        button3.setOnAction( e-> {
                text.setFill(Color.BLUE);
        });

        return pane;
    }

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setScene(new Scene(getPane(), 500, 500));
        primaryStage.setTitle("CheckBox-es");
        primaryStage.show();
    }
}
