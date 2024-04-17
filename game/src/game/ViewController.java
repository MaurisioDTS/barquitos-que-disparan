package game;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.media.AudioClip;

public class ViewController implements Initializable{
    
    private static Stage stage=Game.getStage();
    private Scene settings;
    private Scene login;

    public static void giveStage(Stage Stage){stage=Stage;}
    public void setSettingsScene(Scene scene){settings=scene;}
    public void setLoginScene(Scene scene){login=scene;}
    
    @FXML
    private void stop(ActionEvent Event){
        System.out.println("Exiting...");
        System.exit(0);
    }
    @FXML
    private void mute(ActionEvent Event){
        System.out.println("Toggling mute...");
        Game.toggleMute();
    }
    // 5 horas y 47 minutos para esta mierda que nisiquiera funciona bien.
    @FXML
    private void battle(ActionEvent a){
        System.out.println("login");
        Stage stage = (Stage)((Node)a.getSource()).getScene().getWindow();        
        stage.setScene(login);
    }
    @FXML
    private void settings(ActionEvent a){
        System.out.println("settings");
        Stage stage = (Stage)((Node)a.getSource()).getScene().getWindow(); 
        stage.setScene(settings);
        System.out.println(stage.getScene());
    }
    @Override
    public void initialize(URL url, ResourceBundle rb){
        // TODO
    }
}