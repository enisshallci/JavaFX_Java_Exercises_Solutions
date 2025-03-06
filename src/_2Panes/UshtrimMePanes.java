package _2Panes;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class UshtrimMePanes extends Application{

    public void start(Stage primaryStage) {
        BorderPane pane = new BorderPane();

        //1)............................................................................................................
        HBox hbox1 = new HBox(15);
        hbox1.setPadding(new Insets(15, 15, 15, 15));
        hbox1.setStyle("-fx-border-width: 0 0 2 0; -fx-border-color: black");

        GridPane gPane1 = new GridPane();
        gPane1.add(new Label("FirstName: "), 0, 0);
        gPane1.add(new TextField(), 1, 0);
        gPane1.addRow(1, new Label("LastName: "), new TextField());
        gPane1.setVgap(15.5);
        gPane1.setVgap(15.5);

        Button b1 = new Button("Register");
        gPane1.add(b1, 1,3);
        GridPane.setHalignment(b1, HPos.RIGHT);

        TextField t = new TextField();
        t.setPrefColumnCount(1);
        Pane paneT = new Pane();
        paneT.getChildren().add(t);
        gPane1.addRow(2, new Label("Age: "), paneT);

        hbox1.getChildren().addAll(gPane1, new ImageView(new Image("C:\\Users\\Admin\\Desktop\\Zgjidhjet_EnisShallci_KNK\\src\\main\\resources\\images\\Zuko.jpg")));

        //2)____________________________________________________________________________________________________________

        StackPane paneS = new StackPane();

        Circle circle = new Circle();
        circle.setFill(Color.FIREBRICK);
        circle.setStroke(Color.BLACK);
        circle.setRadius(50);
        paneS.setMargin(circle, new Insets(50, 0, 50, 0));

        Label label = new Label("Japonia");
        label.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
        label.setStyle("-fx-text-fill: white");

        paneS.setStyle("-fx-background-color: white");
        paneS.getChildren().addAll(circle, label);

        //3)____________________________________________________________________________________________________________

        HBox hbox2 = new HBox(15);

        VBox vbox = new VBox();
        vbox.getChildren().add(new Label("Courses In Japonia: "));
        vbox.setPadding(new Insets(15, 5, 5, 5));

        Label[] courses = {new Label("Java"), new Label("Spring Boot"), new Label("JavaFX")};

        for (Label course : courses) {
            vbox.setMargin(course, new Insets(15, 105, 15, 15));     //setMargin eshte metode Statike.
            vbox.getChildren().add(course);
        }

        vbox.setStyle("-fx-border-width: 0 2 0 0; -fx-border-color: black");

        StackPane stackPane = new StackPane();
        stackPane.setPrefWidth(200);
        stackPane.setStyle("-fx-background-color: gold");
        stackPane.getChildren().add(new Label("Enis Shallci"));
        hbox2.getChildren().addAll(vbox, stackPane);

        //..............................................................................................................
        pane.setTop(hbox1);
        pane.setCenter(paneS);
        pane.setBottom(hbox2);

        primaryStage.setScene(new Scene(pane));
        primaryStage.setTitle("Ushtrime_PANES");
        primaryStage.setResizable(false);
        primaryStage.show();

}

    public static void main(String[] args) {
        Application.launch(args);
    }
}