package _2Panes;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Ushtrimi1_FlowPane extends Application{

    public void start(Stage primaryStage) {

        FlowPane pane = new FlowPane(Orientation.VERTICAL, 15, 15);
        pane.setPadding(new Insets(11,12,13,14));       //Padding nalt posht anash

        pane.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(new Label("FirstName: "), new TextField(), new Label("MI: "));

        TextField t = new TextField();
        t.setPrefColumnCount(1);        //Sa kolona mi pas TextField (gjatesia)     //Në GridPane nuk vlejke.
        pane.getChildren().addAll(t, new Label("Last Name: "), new TextField());

        primaryStage.setScene(new Scene(pane, 850, 250));
        primaryStage.setTitle("ShowFlowPane");
        primaryStage.show();

        /*
            Nuk mundesh me shtu nje node te njejte disa here ne Pane, ngase shfaqet Runtime Error.
            D.m.th. gjithmone duhet me ndertu nje node te ri per ta shtuar atë.
         */

    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
