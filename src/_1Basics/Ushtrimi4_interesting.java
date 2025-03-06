package _1Basics;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Ushtrimi4_interesting extends Application {

    @Override
    public void start(Stage primaryStage) {
        //me Pane(100,100) mos e provo sepse e rrit pak nuk e len sakt 100 pane-in. se tani shum e vogel

        Circle circle1 = new Circle();
        circle1.setRadius(98);
        circle1.setCenterX(0);
        circle1.setCenterY(0);
        circle1.setFill(Color.ANTIQUEWHITE);
        circle1.setStroke(Color.BLACK);

        Circle circle2 = new Circle();
        circle2.setRadius(98);
        circle2.setCenterX(200);
        circle2.setCenterY(200);
        circle2.setFill(Color.ANTIQUEWHITE);
        circle2.setStroke(Color.BLACK);

        Circle circle4 = new Circle();
        circle4.setRadius(98);
        circle4.setCenterX(200);
        circle4.setCenterY(0);
        circle4.setFill(Color.ANTIQUEWHITE);
        circle4.setStroke(Color.BLACK);

        Circle circle5 = new Circle();
        circle5.setRadius(98);
        circle5.setCenterX(0);
        circle5.setCenterY(200);
        circle5.setFill(Color.ANTIQUEWHITE);
        circle5.setStroke(Color.BLACK);

        Pane pane = new Pane();
        pane.getChildren().addAll(circle1, circle2, circle4, circle5);
        pane.setBackground(new Background(new BackgroundFill(Color.FIREBRICK, null, null)));

        //Ngjyrat FIREBRICK E KTO E MBISHKRUAJNE NJERA TJETREN, a kto tjerat si dihet


        primaryStage.setScene(new Scene(pane, 200, 200));
        primaryStage.setTitle("Circles");
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
