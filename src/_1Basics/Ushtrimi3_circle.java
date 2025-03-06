package _1Basics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Ushtrimi3_circle extends Application {

    @Override
    public void start(Stage primaryStage) {

        /* Nje Scene mundet me permbajte nje "Control" ose "Pane" por jo nje "Shape" ose "ImageView"!!!!!!!!!!.

           Stage -> Scene -> Parent (Pane, Control) -> ChildNodes

           Pane jane: FlowPane, GridPane, BorderPane, HBox, VBox, StackPane, AnchorPane
           Nodes jane: Shapes, ImageView, Control dhe Pane

           Panes perdoren per te mbajtur nodes,
         */

        Circle circle = new Circle();
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);

        //StackPane i vendos nodes ne qender te pane dhe mbi njera tjetren.
        Pane pane = new StackPane();
        pane.getChildren().add(circle);

        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Show Circle");
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
