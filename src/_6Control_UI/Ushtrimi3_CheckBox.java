package _6Control_UI;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Ushtrimi3_CheckBox extends Ushtrimi2_Button {

    @Override
    protected BorderPane getPane() {

        BorderPane pane = super.getPane();
        Font fontBoldItalic = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20);
        Font fontBold = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 20);
        Font fontItalic = Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.ITALIC, 20);
        Font fontNormal = Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR, 20);

        text.setFont(fontNormal);
        VBox vbox = new VBox(20);
        vbox.setPadding(new Insets(5, 5, 5, 5));
        vbox.setStyle("-fx-border-color: green");
        pane.setRight(vbox);

        CheckBox checkBox1 = new CheckBox("Bold");
        CheckBox checkBox2 = new CheckBox("Italic");

        vbox.getChildren().addAll(checkBox1, checkBox2);

        EventHandler<ActionEvent> handler = e -> {
            if (checkBox1.isSelected() && checkBox2.isSelected()) {
                text.setFont(fontBoldItalic);
            }
            else if (checkBox1.isSelected()) {
                text.setFont(fontBold);
            }
            else if (checkBox2.isSelected()) {
                text.setFont(fontItalic);
            }
            else {
                text.setFont(fontNormal);
            }
        };

        checkBox1.setOnAction(handler);
        checkBox2.setOnAction(handler);

        return pane;
    }

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setScene(new Scene(getPane(), 500, 500));
        primaryStage.setTitle("CheckBox-es");
        primaryStage.show();
    }
}
