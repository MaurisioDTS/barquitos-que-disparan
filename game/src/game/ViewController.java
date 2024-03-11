package game;

import java.io.File;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class ViewController implements Initializable {

    @FXML
    Media intro = new Media(Paths.get("res/audio/test.mp3").toUri().toString());
    MediaPlayer m=new MediaPlayer(intro);
    
    
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
        System.out.println("Settings");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
