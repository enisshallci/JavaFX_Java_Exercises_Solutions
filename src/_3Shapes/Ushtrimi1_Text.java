package _3Shapes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ushtrimi1_Text extends Application{

     public Ushtrimi1_Text() {
         /*
            Private nuk lejohet pse? Sepse thirrja e ketij funksioni bohet prej nje klase tjeter.
            AS Protected nuk lejohet sepse kjo qe e thirr eshte superclass nuk eshte subclass. As nuk eshte ne te njejten paketë.
            As pa modifier ngase klasa qe e thirr kete klasen tone eshte ne ndonje pakete tjeter.
          */
        System.out.println("Shtypja nga Konstruktori");
        System.out.println("Konstruktori duhet me qenë public, nuk lejohet tjeter \"modifier\".");
    }

    public void start(Stage primaryStage) {

        Pane pane = new Pane();

        Text text1 = new Text(30, 30, "Programming is Fun!");
        text1.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 35));
        text1.setStroke(Color.FIREBRICK);   //Ndryshe smun ja jep ngjyrën.
        text1.setStrokeWidth(2);

        Text text2 = new Text();
        text2.setFill(Color.FIREBRICK);     //Kjo veq ngjyren normal kurse setStroke(Color.FIREBRICK) kjo pe trash sepse bash vijen
        text2.setFont(Font.font(35));
        text2.setText("Java Programmer");
        text2.setX(30);
        text2.setY(90);
        text2.setStrikethrough(true);

        Text text3 = new Text("Spring Boot Programmer");
        text3.setFont(Font.font(35));
        text3.setFill(Color.GREEN);
        text3.setX(30);
        text3.setY(150);
        text3.setUnderline(true);

        pane.getChildren().addAll(text1, text2, text3);

        primaryStage.setScene(new Scene(pane, 425, 400));
        primaryStage.show();
        primaryStage.setTitle("Texts");
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}

