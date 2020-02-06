import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.text.Font;

public class SpaceButton extends javafx.scene.control.Button {

    public SpaceButton(String text) {

        this.setOnMouseClicked(event -> {
            System.out.println("Clicked button " + text);
        });

        Image image = new Image("blue_button04.jpg");
        BackgroundImage backgroundImage = new BackgroundImage(image,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        Background background = new Background(backgroundImage);

        setBackground(background);
        setText(text);
        setFont();
        setPrefWidth(190);
        setPrefHeight(49);
    }

    private void setFont() {
        setFont(Font.loadFont(getClass().getResourceAsStream("kenvector_future.ttf"), 23));
    }

}