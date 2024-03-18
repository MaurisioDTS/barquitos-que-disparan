package game;

import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;

public class ViewController implements Initializable{

    private Scene settings;
    public void setSettingsScene(Scene scene){settings=scene;}
    private Scene battle;
    private static Stage stage;

    public static void giveWindow(Stage window){
        stage=window;
    }
    @FXML
    Media intro = new Media(Paths.get("res/audio/test.mp3").toUri().toString());
    @FXML
    MediaPlayer m=new MediaPlayer(intro);


    @FXML
    AnchorPane anchorPane=new AnchorPane();
    @FXML
    private void stop(ActionEvent Event){
        System.out.println("Exiting...");
        System.exit(0);
    }
    // 5 horas y 47 minutos para esta mierda que nisiquiera funciona bien.
    @FXML
    private void battle(ActionEvent Event){
        System.out.println("Battle");
        m.play();
    }
    @FXML
    private void settings(ActionEvent Event){
        System.out.println("settings");
        stage.setScene(settings);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb){
        // TODO
    }
}
