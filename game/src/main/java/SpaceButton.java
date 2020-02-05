import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.event.EventHandler;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.text.Font;

public class SpaceButton extends javafx.scene.control.Button {

    public SpaceButton(String text) {

        BackgroundImage backgroundImage = new BackgroundImage(new Image(getClass().getResourceAsStream("blue_button04.jpg")),
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