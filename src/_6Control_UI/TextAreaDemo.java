package _6Control_UI;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

class Ushtrimi6_TextArea extends BorderPane {

    private Label label = new Label();

    private TextArea textArea = new TextArea();

    public Ushtrimi6_TextArea() {

        label.setContentDisplay(ContentDisplay.TOP);
        label.setPrefSize(200, 100);

        label.setFont(new Font("SansSerif", 16));
        textArea.setFont(new Font("Serif", 14));

        /*
            When you set wrapText to true, it means that the text inside the TextArea will automatically wrap to the next line
            when it reaches the edge of the TextArea instead of extending beyond the visible area.
         */
        textArea.setWrapText(true);
        textArea.setEditable(false);

        ScrollPane scrollPane = new ScrollPane(textArea);

        setLeft(label);
        setCenter(scrollPane);
        setPadding(new Insets(5, 5, 5, 5));

    }

    public void setTitle(String title) {
        label.setText(title);
    }

    public void setImageView(ImageView icon) {
        label.setGraphic(icon);
    }

    public void setDescription(String text) {
        textArea.setText(text);
    }
}

public class TextAreaDemo extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Ushtrimi6_TextArea pane = new Ushtrimi6_TextArea();

        pane.setTitle("Zuko");
//        pane.setImageView(new ImageView(new Image("C:\\Users\\Admin\\Desktop\\Zgjidhjet_EnisShallci_KNK\\src\\main\\resources\\images\\Zuko.jpg")));
        pane.setDescription("Zuko is Strong");

        stage.setScene(new Scene(pane, 450, 200));
        stage.setTitle("TextArea");
        stage.show();
    }
}