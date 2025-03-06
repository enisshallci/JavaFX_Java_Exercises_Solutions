package _5Animations;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Ushtrimi5_FadeTransition extends Application {

    @Override
    public void start(Stage primaryStage) {

        VBox vbox = new VBox(15);
        HBox hbox = new HBox(15);

        Text text = new Text(0, 0, "Learning Java, JavaFX, SpringBoot");
        text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));

        Button button1 = new Button("Start");
        Button button2 = new Button("Stop");


        hbox.getChildren().addAll(button1, button2);
        hbox.setAlignment(Pos.CENTER);

        FadeTransition ft = new FadeTransition(Duration.millis(3000), text);
        ft.setFromValue(1.0);
        ft.setToValue(0.0);
        ft.setAutoReverse(true);
        ft.setCycleCount(Timeline.INDEFINITE);
        ft.pause();

        //Events
        button1.setOnAction(e -> ft.play());
        button2.setOnAction(e -> ft.stop());

        vbox.getChildren().addAll(text, hbox);
        vbox.setAlignment(Pos.CENTER);

        primaryStage.setScene(new Scene(vbox, 400, 350));
        primaryStage.show();
    }
}
