package _1Basics;

import javafx.application.Application;
import javafx.stage.Stage;

public class Ushtrimi2 extends Application {

    public Ushtrimi2() {
        System.out.println("Shtypja nga Konstruktori i JavaFX Aplikacion-it");
    }

    @Override
    public void start(Stage primaryStage) {
        System.out.println("Shtypja nga Start metoda");
    }

    public static void main(String[] args) {
        System.out.println("Shtypja nga metoda main");
        launch(args);
    }
}
    /*
        1) Se pari shtypet statment ne main metoden, pastaj metoda statike launch thirret dhe kjo metode e inicializon
         JavaFX runtime dhe e starton applikacion-in. Ne momentin qe thirret launch metoda,
         JavaFX runtime e inicializon Ushtrimi2 duke ia thirrur konstruktor-in.
         Keshtu ekzekutohet konstruktori i Ushtrimi2 edhe shtypet statment....
         3) Pasi perfundon inicializimi start metoda thirret automatikisht nga JavaFX runtime.

        -----------------------------------------
        Nese nuk kishte me ekzistu konstruktori, javaFX runtime e inicializon Ushtrimi2 edhe pasi nuk ka Ushtrimi2 konstruktor,
        automatikisht
        e gjeneron nje konstruktor default. Default konstruktori nuk ka ndonje statment (System.out.println).
     */


