

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.event.EventHandler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


public class View {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private AnchorPane pane;
    private Scene scene;
    private Stage stage;

    private final static int BUTTONS_MENU_START_X = 530;
    private final static int BUTTONS_MENU_START_Y = 150;
    ArrayList<SpaceButton> menu;



    public View() throws FileNotFoundException {
        menu = new ArrayList<>();
        pane = new AnchorPane();
        scene  = new Scene(pane, WIDTH, HEIGHT);
        stage = new Stage();
        stage.setScene(scene);
        createButtons();
        createBackgroundScene();
        createLogo();
        SpaceSubscene subScene = new SpaceSubscene();
        subScene.setLayoutX(100);
        subScene.setLayoutY(100);
        pane.getChildren().add(subScene);

    }

    public Stage getStage() {
        return stage;
    }

    private void addMenu(SpaceButton button) {

        button.setLayoutX(BUTTONS_MENU_START_X);
        button.setLayoutY(BUTTONS_MENU_START_Y + (menu.size() * 100));
        menu.add(button);
        pane.getChildren().add(button);

    }


    public void createButtons(){
        createButtonStart();
        createButtonHelp();
        createButtonRanking();
        createButtonExit();
    }

    public void createButtonStart(){
        SpaceButton startButton = new SpaceButton("Start!");
        addMenu(startButton);
    }

    public void createButtonHelp(){
        SpaceButton helpButton = new SpaceButton("Help");
        addMenu(helpButton);
    }

    public void createButtonRanking(){
        SpaceButton rankingButton = new SpaceButton("Ranking");
        addMenu(rankingButton);
    }

    public void createButtonExit(){
        SpaceButton exitButton = new SpaceButton("Exit");
        addMenu(exitButton);
    }




        /*SpaceButton button = new SpaceButton("Click!");
        pane.getChildren().add(button);
        button.setLayoutX(200);
        button.setLayoutY(200); */


    private void createBackgroundScene(){
        Image backgroundImage = new Image("stars.jpg", 256, 256, false, true);
        BackgroundImage background = new BackgroundImage(backgroundImage, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, null);
        pane.setBackground(new Background(background));
    }

    private void createLogo() {
        Text t = new Text();
        t.setText("SPACE RUNNER");
        t.setFont((Font.loadFont(getClass().getResourceAsStream("kenvector_future.ttf"), 23)));
        t.setFill(Color.DARKBLUE);
        /*ImageView logo = new ImageView("logo.png");
        logo.setLayoutX(400);
        logo.setLayoutY(50);*/
        /*logo.setOnMouseEntered(new EventHandler <MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                logo.setEffect(new DropShadow());

            }
        });*/

        /*pane.getChildren().add(t);*/
    }
}