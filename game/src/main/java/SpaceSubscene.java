import javafx.scene.Parent;
import javafx.scene.SubScene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

public class SpaceSubscene extends SubScene {

    private final static String FONT_PATH = "kenvector_future.ttf";
    private final static String BACKGROUND_IMAGE = "blue_panel.jpg";




    public SpaceSubscene() {
        super(new AnchorPane(), 600, 400);
        prefWidth(600);
        prefHeight(400);

        BackgroundImage image = new BackgroundImage(new Image(BACKGROUND_IMAGE, 600, 400, false, true), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, null);
        AnchorPane root2 = (AnchorPane) this.getRoot();

        root2.setBackground(new Background(image));

        this.setOnMouseClicked(event -> {
            System.out.println("Space subscene clicked !");
        });
    }
}
