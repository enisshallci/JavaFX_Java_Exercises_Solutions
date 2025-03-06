package _1Basics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Ushtrimi1 extends Application {
    /*
        Application eshte Abstract class qe definon framework-un esenciale per te shkruar JavaFX aplikacione.
        Çdo JavaFX aplikacioni definohet ne nje klase qe e bon extends Application.
    */

    /*
        Swing dhe AWT jane zevendesuar nga JavaFX per te zhvilluar RIA (Rich Internet Application).
        RIA (Rich Internet Application) eshte Web Application qe permbane te njejta funksione dhe veçori qe jane te asocuara
        me Desktop Application.
    */
    public static void main(String[] args) {
        launch(args);
    }
    /*
        launch(args) ose Application.launch (dyjat bojn), kjo shkruhet nese e kemi metoden "main", nese e fshijm metoden main
        dhe e bojm run, atehere JVM shkon edhe e thirr metoden launch automatikisht ne Application (klasen).
        Por per shkak qe e kemi perdor metoden "main" atehere duhet gjithqysh me thirr kete metode sepse JVM shkon e ekzekuton
        metoden main. Keshtu qe e shkruajme launch(args) ose Application.launch

        Kjo metoda launch eshte metode statike qe perdoret per te krijuar nje instance te Application subclass dhe e thirr
        metoden start e cila mbishkruhet nga Aplikacioni jone.
        "Pra launch metoda e inicializon JavaFX runtime dhe e starton application".
     */

    /*
        Nje Pane mundet mu vendos ne nje skene, smundet nje pane mu vendos ne dy skena. Vlen e njejta edhe per Nodes te tjera.
        Nuk mundet n'dy vene mu "qky" hehehe.
     */
    @Override
    public void start(Stage primaryStage) {
        /* Metoda start eshte metode abstrakte e definuar ne Application class, ketu behet @Override */
        Button btn1 = new Button("Button 1");
        Scene scene1 = new Scene(btn1, 400, 400);

        primaryStage.setScene(scene1);
        primaryStage.setTitle("First JavaFX program");
        primaryStage.setResizable(false);   //By default eshte true
        primaryStage.show();

        //___________________Stage2________________________
        Button btn2 = new Button("Button 2");

        Stage stage = new Stage();      //Duhet me kriju nje stage te ri
        stage.setTitle("Second Stage");
        stage.setScene(new Scene(btn2, 400, 400));
        stage.setResizable(false);  //By default eshte true
        stage.show();

        //MOS HARRO KETO POSHTE NUK JANE TE QASSHME JASHTA BLLOKUT (for loop-es)
        for (int i = 3; i < 5; i++) {
            //Button btn1 = new Button();     //Nuk lejohet sepse blloku i madh osht metoda start e tash kjo nuk lejohet ktu!
            Button btn = new Button("Buttoni " + i);
            Scene scene3 = new Scene(btn,400,400);

            Stage stages = new Stage();
            stages.setScene(scene3);
            stages.setTitle("Buttoni " + i);
            stages.setResizable(false);
            stages.show();
        }
    }
}
