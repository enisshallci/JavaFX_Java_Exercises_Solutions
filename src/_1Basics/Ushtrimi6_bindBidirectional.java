package _1Basics;

import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.stage.Stage;

public class Ushtrimi6_bindBidirectional extends Application {

    @Override
    public void start(Stage primaryStage) {

    }

    public static void main(String[] args) {

        //Binding Demo
        DoubleProperty d1 = new SimpleDoubleProperty(1);
        DoubleProperty d2 = new SimpleDoubleProperty(2);
        d1.bind(d2);
        System.out.println("d1 is " + d1.getValue() + " and d2 is " + d2.getValue());
        d2.setValue(70);
        System.out.println("d1 is " + d1.getValue() + "and d2 is " + d2.getValue());


        //d1.setValue(80); nuk lejohet sepse u lidh me d2, stlejon me ndryshu d1.
        System.out.println("d1 is " + d1.getValue() + "and d2 is " + d2.getValue());

        // Per me ndryshu d1 ose d2 edhe ndryshimi mu shfaqe te te dyjat e perdorim
        //  d1.bindBidirectional(d2)

    }
}
