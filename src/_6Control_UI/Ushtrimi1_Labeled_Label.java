package _6Control_UI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Ushtrimi1_Labeled_Label extends Application {

    @Override
    public void start(Stage primaryStage) {

        ImageView zuko = new ImageView(new Image("C:\\Users\\Admin\\Desktop\\Zgjidhjet_EnisShallci_KNK\\src\\main\\resources\\images\\Zuko.jpg"));

        Label label1 = new Label("Zuko", zuko);
        label1.setStyle("-fx-border-color: green; -fx-border-width: 2");
        label1.setContentDisplay(ContentDisplay.BOTTOM);
        label1.setTextFill(Color.RED);

        //____________________________________________________________________________________________
        Label label2 = new Label("Circle", new Circle(50, 50, 25));
        label2.setContentDisplay(ContentDisplay.TOP);
        label2.setTextFill(Color.ORANGE);

        //____________________________________________________________________________________________
        Label label3 = new Label("Rectangle", new Rectangle(10, 10, 50, 25));
        label3.setContentDisplay(ContentDisplay.RIGHT);

        //____________________________________________________________________________________________
        Label label4 = new Label("Ellipse", new Ellipse(90, 50, 50, 25));
        label4.setContentDisplay(ContentDisplay.LEFT);

        //____________________________________________________________________________________________
        Ellipse ellipse = new Ellipse(50, 50, 50, 25);
        ellipse.setStroke(Color.GREEN);
        ellipse.setFill(Color.WHITE);
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(ellipse, new Label("JavaFX"));

        Label label5 = new Label("A pane inside a label", stackPane);
        label5.setContentDisplay(ContentDisplay.BOTTOM);
        //____________________________________________________________________________________________

        Label label6 = new Label("Java SpringBoot");
        label6.setUnderline(true);


        HBox pane = new HBox(20);
        pane.getChildren().addAll(label1, label2, label3, label4, label5, label6);

        Scene scene = new Scene(pane, 1000, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("LabelWithGraphic");
        primaryStage.show();
    }
}
