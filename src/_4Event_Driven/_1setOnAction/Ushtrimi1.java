package _4Event_Driven._1setOnAction;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ushtrimi1 extends Application {

    @Override
    public void start(Stage primaryStage) {

        /*
            1) Clicking the Button fires an action event (Event source object) --> Button

            2) An event is an object (Event object). -> ActionEvent

            3) The event handler processes the event (Event handler object). --> OkHandlerCLass
         */

        HBox pane = new HBox(10);
        pane.setAlignment(Pos.CENTER);
        Button btn = new Button("OK");          //Event Source Object
        Button cancel = new Button("Cancel");   //Event Source Object
        Button enisi = new Button("Enisi");

        OKHandlerClass handler1 = new OKHandlerClass();     // create handler, Event handler object
        btn.setOnAction(handler1);              //register handler, event object

        cancelHandlerClass handler2 = new cancelHandlerClass();
        cancel.setOnAction(handler2);

        enisi.setOnAction(handler2); //Eventet tash bohen handle nga metoda "handle" e kesaj klase (per te gjitha objektet vlen).

        pane.getChildren().addAll(btn, cancel, enisi);

        primaryStage.setScene(new Scene(pane, 500, 500));
        primaryStage.setTitle("Handle Events");
        primaryStage.show();
    }
}

class OKHandlerClass implements EventHandler<ActionEvent> {
    //Proceson ActionEvent, qikjo e pret nje eventObject qe eshte "e" e tipit ActionEvent.
    //e-ja perfaqeson ActionEventin(Event object) e krijuar.
    @Override
    public void handle(ActionEvent e) {
        System.out.println("OK button clicked");
        System.out.println(e.getSource().getClass().getSimpleName());  //kthen source object e event-it.
    }
}

class cancelHandlerClass implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent e) {     //Proceson ActionEvent.
        System.out.println("Cancel button clicked");
    }
}

/*
     - Pra event source objekti eshte buttoni, pasi kur e klikojme atë na behet ndonje event.
     - Pastaj krijohet Event handler object i cili duhet me qene instance e EventHandler<ActionEvent> ky event handler object.
     - Event Object eshte ActionEvent ne rastin tone.

       "event handler object" eshte nje objekt i cili pra eshte instance e interface-it EventHandler<ActionEvent>
       i cili pasi krijohet, regjistrohet me ane te "source objektit" duke e perdorur metoden setOnAction().

       Pra: sourceObject.setOnAction(eventHandlerObject);

       Ne momentin qe behet ky register handler thirret metoda handle(ActionEvent) qe e proceson ActionEvent-in.

       EventHandler<ActionEvent> interface e permbane metoden handle(ActionEvent e) te cilen ne e mbishkruajme dhe kjo metode
       e proceson action event-in.
 */
