module Zgjidhjet.EnisShallci.KNK {

    requires javafx.controls;
    requires javafx.fxml;

    opens _1Basics;
    exports _1Basics;

    opens _2Panes;
    exports _2Panes;


    opens _3Shapes;

    opens _4Event_Driven._1setOnAction;
    opens _4Event_Driven._2MouseEvents;
    opens _4Event_Driven._3KeyEvents;
    opens _4Event_Driven._4Listeners_ObservableObjects;

    opens _5Animations;

    opens _6Control_UI;
}