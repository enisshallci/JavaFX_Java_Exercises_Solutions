package _2Panes;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ushtrimi5_Hbox_And_Vbox extends Application {

    public void start(Stage primaryStage) {

        BorderPane pane = new BorderPane();
        pane.setTop(getHBox());
        pane.setLeft(getVBox());

        primaryStage.setScene(new Scene(pane));
        primaryStage.setTitle("HBox and VBox");
        primaryStage.show();
        /*
            Dallimi FlowPane dhe HBox eshte se FlowPane i ben wrap kur ska ven nalt i vendos nodes posht ne rresht te ri. Kurse HBox jo nuk i vendos posht.
         */
    }

    private HBox getHBox() {

        HBox hbox = new HBox(15);
        hbox.setPadding(new Insets(15, 35, 15, 15));
        hbox.setStyle("-fx-background-color: gold");

        Button button1 = new Button("Computer Science");
        button1.setMaxHeight(55.5);
        hbox.getChildren().add(button1);
        hbox.getChildren().add(new Button("Computer Engineering"));
        ImageView imageView = new ImageView(new Image("C:\\Users\\Admin\\Desktop\\Zgjidhjet_EnisShallci_KNK\\src\\main\\resources\\images\\Zuko.jpg"));
        hbox.getChildren().add(imageView);

        //Properties
        hbox.setAlignment(Pos.TOP_CENTER);
        hbox.setSpacing(6);
        hbox.setFillHeight(true);

        return hbox;
    }

    private VBox getVBox() {

        VBox vbox = new VBox();
        vbox.setPadding(new Insets(15, 5, 5, 5));
        vbox.setStyle("-fx-border-color: red");

        Label label = new Label("Courses");
        vbox.setMargin(label, new Insets(0, 0, 15, 0));
        vbox.getChildren().add(label);

        Label[] courses = {new Label("Java Programming Language"), new Label("Spring Framework"), new Label("MySQL"),
        new Label("React JS")};

        for (Label course : courses) {
            VBox.setMargin(course, new Insets(0, 0, 10, 15));
            vbox.getChildren().add(course);
        }

        return vbox;
    }


    public static void main(String[] args) {
        Application.launch(args);
    }
}
