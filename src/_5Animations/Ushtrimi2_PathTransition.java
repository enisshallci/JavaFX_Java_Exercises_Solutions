package _5Animations;

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Ushtrimi2_PathTransition extends Application {

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();

        ImageView imageView = new ImageView("C:\\Users\\Admin\\Desktop\\Zgjidhjet_EnisShallci_KNK\\src\\main\\resources\\images\\Zuko.jpg");
        pane.getChildren().add(imageView);

        PathTransition pt = new PathTransition(Duration.millis(4000), new Line(100, 200, 100, 0), imageView);
        pt.setCycleCount(5);
        pt.setOrientation(PathTransition.OrientationType.NONE);
        pt.play();

        Scene scene = new Scene(pane, 450, 450);
        primaryStage.setTitle("FlagRisingAnimation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
