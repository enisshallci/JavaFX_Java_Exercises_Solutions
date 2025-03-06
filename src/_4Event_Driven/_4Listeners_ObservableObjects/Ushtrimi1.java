package _4Event_Driven._4Listeners_ObservableObjects;

import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.stage.Stage;

public class Ushtrimi1 extends Application {

    @Override
    public void start(Stage primaryStage) {

        DoubleProperty balance = new SimpleDoubleProperty();
        //Krejt kta munesh me zevendesu me Lambda expression.
        balance.addListener(observable -> {        // Method for handling the value change.
            System.out.println("The new value is: " + balance.doubleValue());
        });

        balance.set(15.5);
        /*
            Kur line 23 ekzekutohet shkakton nje ndryshim ne balancë, i cili e njofton "listener" duke ia thirrur
            metodën: invalidated të listener.
        */
    }
}
