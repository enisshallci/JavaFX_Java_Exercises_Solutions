package _4Event_Driven._1setOnAction;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ushtrimi5_LambdaExpression extends Application {

    public void start(Stage primaryStage) {

        HBox hbox = new HBox(15);
        hbox.setAlignment(Pos.CENTER);
        Button button1 = new Button("Enis Shallci");
        Button button2 = new Button("Albion Xhema");
        Button button3 = new Button("Ibush Vilanci");
        Button button4 = new Button("Berat Qerkezi");
        hbox.getChildren().addAll(button1, button2, button3, button4);

        button1.setOnAction(e -> {
            System.out.println("Une jame Enis Shallci");
        });

        button2.setOnAction((ActionEvent e) -> {      //Edhe pse e din vetë programi qe "e" eshte e tipit "ActionEvent".
            System.out.println("Une jam Albion Xhema");
        });

        button3.setOnAction((e) -> {    //Nese kemi ma shume se nje parameter duhet kllapa, ne rastin tone nuk duhet.
            System.out.println("Une jam Ibush Vilanci");
        });

        button4.setOnAction(e ->    //Pasi e kemi nje statment posht po i largoj kllapat gjarperore.
                System.out.println("Une jam Berat Qerkezi")
        );

        primaryStage.setScene(new Scene(hbox, 400, 400));
        primaryStage.setTitle("Buttonat");
        primaryStage.show();

    }
}
