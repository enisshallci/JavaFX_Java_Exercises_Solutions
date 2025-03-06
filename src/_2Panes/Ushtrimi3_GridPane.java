package _2Panes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Ushtrimi3_GridPane extends Application {

    public void start(Stage primaryStage) {

        GridPane pane = new GridPane();
        pane.setVgap(10.5);
        pane.setHgap(10.5);

        pane.add(new Label("FirstName: "), 0, 0);
        pane.add(new TextField(), 1,0);
        pane.add(new Label("LastName"),0, 1);
        pane.add(new TextField(),1,1);
        pane.add(new Label("Age: "),0,2);

        /* Kete setRowIndex mundesh me perdor kur e ke vendos dikun nje node e po don tash me ja ndrru venin*/
        Label l = new Label("HAMDI");
        pane.add(l, 3, 3);
        pane.setRowIndex(l, 0);
        //pane.setColumnIndex(l, 0);  //mbishkrun permbi


        TextField t = new TextField();
        t.setPrefColumnCount(1);
        Pane pane1 = new Pane();
        pane1.getChildren().add(t);

        pane.add(pane1, 1, 2);

        pane.addRow(2, new Label("Enis Shallci"));
        pane.addRow(2, new Label("Po mëson JavaFX ☺"));
        pane.addColumn(1, new Label("Java Programmer"));

        primaryStage.setScene(new Scene(pane, 550, 550));
        primaryStage.setTitle("GridPane");
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
