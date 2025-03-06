package _2Panes;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ushtrimi2_FlowPane2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        HBox pane1 = new HBox(15);
        Button butoni1 = new Button("Butoni 1");
        Button butoni2 = new Button("Butoni 2");
        ImageView image1 = new ImageView(new Image("C:\\Users\\Admin\\Desktop\\Zgjidhjet_EnisShallci_KNK\\src\\main\\resources\\images\\Zuko.jpg"));

        pane1.getChildren().addAll(butoni1, butoni2, image1);

        primaryStage.setScene(new Scene(pane1));
        primaryStage.setTitle("Me HBox");
        primaryStage.show();
//______________________________________________________________________________________________________________________
        FlowPane pane = new FlowPane(Orientation.VERTICAL);
        Button butoni3 = new Button("Butoni 3");
        Button butoni4 = new Button("Butoni 4");
        ImageView image2 = new ImageView(new Image("C:\\Users\\Admin\\Desktop\\Zgjidhjet_EnisShallci_KNK\\src\\main\\resources\\images\\Zuko.jpg"));

        pane.getChildren().addAll(butoni3, butoni4, image2);
        pane.setHgap(15);

        Stage stage = new Stage();
        stage.setScene(new Scene(pane));
        stage.setTitle("Me FlowPane");
        stage.show();
    }
}




