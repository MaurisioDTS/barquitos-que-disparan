package game;

import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.fxml.Initializable;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class ViewController implements Initializable{
    
    /** mi propia creación me da por detrás
    @FXML
    Media intro = new Media(Paths.get("res/audio/test.wav").toUri().toString());
    @FXML
    MediaPlayer m=new MediaPlayer(intro);
    **/
    @FXML
    private void stop(ActionEvent Event){
        System.out.println("Exiting...");
        System.exit(0);
    }
    @FXML
    private void fs(ActionEvent Event){
        System.out.println("togglin screen...");   
    }
    // 5 horas y 47 minutos para esta mierda que nisiquiera funciona bien.
    @FXML
    private void battle(ActionEvent Event){
        System.out.println("Battle");
       // m.play();
    }
    @FXML
    private void settings(ActionEvent Event){
        System.out.println("Settings");
    }
    @FXML
    CheckBox cbFs=new CheckBox();
    @FXML
    private void fullScreen(ActionEvent Event){
        System.out.println("Full Screen");
        if(cbFs.isSelected())
            root.setFullScreen(true);
        else
            stage.setFullScreen(false);
    }
    @FXML
void onFullScreenExecuted(ActionEvent event) {
    Stage stage = (Stage) btnFullScreen.getScene().getWindow();
    stage.setFullScreen(true);

    if (stage.isFullScreen()) {
        controlBox.setVisible(false);
    } else {
        controlBox.setVisible(true);
    }

}
    @Override
    public void initialize(URL url, ResourceBundle rb){
        // TODO
    }
}
