package game;

import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;
import javafx.scene.media.AudioClip;

public class ViewController implements Initializable{
    
    private static Stage stage;
    public static Scene settings;
    private Scene login;

    public static void giveStage(Stage Stage){stage=Stage;}
    public void setSettingsScene(Scene scene){settings=scene;}
    public void setLoginScene(Scene scene){login=scene;}
    
    @FXML
    AudioClip intro = new AudioClip(Paths.get("res/audio/test.mp3").toUri().toString());
    
    @FXML
    private void stop(ActionEvent Event){
        System.out.println("Exiting...");
        System.exit(0);
    }
    // 5 horas y 47 minutos para esta mierda que nisiquiera funciona bien.
    @FXML
    private void battle(ActionEvent Event) throws Exception{
        intro.play();
        intro.stop();
        System.out.println("login");
        LoginController.giveStage(stage);
        stage.setScene(login);
    }
    @FXML
    private void settings(ActionEvent Event){
        System.out.println("settings");
        SettingsController.giveStage(stage);
        stage.setScene(settings);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb){
        // TODO
    }
}