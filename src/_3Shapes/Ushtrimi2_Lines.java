package _3Shapes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Ushtrimi2_Lines extends Application {

    public void start(Stage primaryStage) {

//        Line line = new Line();

        Scene scene = new Scene(new LinePane(), 500, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Lines");
        primaryStage.show();

    }
}

class LinePane extends Pane {

    public LinePane() {
        Line line = new Line(0, 0, 10, 10);     //Kto dyja veq hajt sa me mbush konstruktorin se ki mi ndrru posht!
        line.endXProperty().bind(widthProperty());  //bon edhe pa to.
        line.endYProperty().bind(heightProperty().subtract(1));
        line.setStrokeWidth(5);
        getChildren().add(line);

        Line line2 = new Line(0,0,0,0);     // tparen veq met kallxu qe posht ki mi ndrru
        line2.startXProperty().bind(widthProperty().subtract(1));
        line2.endYProperty().bind(heightProperty().subtract(1));
        line2.setStroke(Color.GREEN);
        line2.setStrokeWidth(5);
        getChildren().add(line2);

    }
}