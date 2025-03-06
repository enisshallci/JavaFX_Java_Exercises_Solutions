package _2Panes;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Interesting2 extends Application {

    public static void main(String[] args) {
        Application.launch(args);            //ose vetëm launch(args);
    }

    public void start(Stage primaryStage) {

        GridPane pane = new GridPane();

        Label label = new Label("Name: ");
        fontLabel(label);
        GridPane.setRowIndex(label, 0);
        GridPane.setColumnIndex(label, 0);

        TextField t = new TextField();
        GridPane.setRowIndex(t, 0);
        GridPane.setColumnIndex(t, 1);
//_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _
        Label label2 = new Label("LastName: ");
        fontLabel(label2);
        GridPane.setRowIndex(label2,1);
        GridPane.setColumnIndex(label2, 0);

        TextField t2 = new TextField();
        GridPane.setRowIndex(t2, 1);
        GridPane.setColumnIndex(t2, 1);
//_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _

        Label label3 = new Label("Age: ");
        fontLabel(label3);

        TextField t3 = new TextField();
        Pane paneT3 = new Pane();
        t3.setPrefColumnCount(2);
        paneT3.getChildren().add(t3);

        pane.addRow(2, label3, paneT3);
        System.out.println("paneT3 RowIndex e ka në = " + GridPane.getRowIndex(paneT3));
//_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _

        Button btn1 = new Button("ENTER");
        Button btn2 = new Button("Clear All");

        pane.addColumn(0, btn1, btn2);
//_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _

        pane.getChildren().addAll(label, t, label2, t2);
        pane.setAlignment(Pos.CENTER);
        pane.setVgap(10.5);
        pane.setHgap(10.5);

        primaryStage.setScene(new Scene(pane, 500, 500));
        primaryStage.setTitle("setRowIndex dhe setColumnIndex");
        primaryStage.show();
    }

    public void fontLabel(Label label) {

        label.setFont(Font.font(15));
//        label.setFont(Font.font(null, FontWeight.NORMAL, FontPosture.REGULAR, 12));       //normal size 12 dikun
    }
}

