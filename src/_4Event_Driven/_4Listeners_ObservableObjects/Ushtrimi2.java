package _4Event_Driven._4Listeners_ObservableObjects;

import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class Ushtrimi2 extends Application {

    @Override
    public void start(Stage primaryStage) {

        //Krijimi i StringProperty (observable property)
        StringProperty stringProperty = new SimpleStringProperty("Initial Value");

        // This method will be called when the property is invalidated (changed)
        stringProperty.addListener(observable -> {
            System.out.println("Property " + stringProperty.getValue());
            if (observable == stringProperty) {
                System.out.println("stringProperty has been invalidated:");
                System.out.println(observable.getClass().getSimpleName());
            }
        });


        stringProperty.setValue("My name is Enis Shallci");
    }
}
