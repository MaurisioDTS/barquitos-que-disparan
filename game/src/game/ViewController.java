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
import javafx.scene.Parent;
import javafx.scene.media.AudioClip;

public class ViewController implements Initializable{
    
    private static Stage stage;
    private Scene settings;
    private Scene login;

    public static void giveStage(Stage Stage){stage=Stage;}
    public void setSettingsScene(Scene scene){settings=scene;}
    public void setLoginScene(Scene scene){login=scene;}
    
   // @FXML
   // AudioClip intro = new AudioClip(Paths.get("game/res/audio/test.mp3").toUri().toString());
    
    @FXML
    private void stop(ActionEvent Event){
        System.out.println("Exiting...");
        System.exit(0);
    }
    // 5 horas y 47 minutos para esta mierda que nisiquiera funciona bien.
    @FXML
    private void battle(ActionEvent Event) throws Exception{
        //intro.play();

        System.out.println("login");
        LoginController.giveStage(stage);
        stage.setScene(login);
    }
    @FXML
    private void settings(ActionEvent Event) throws IOException{
        System.out.println("settings");
        
        FXMLLoader settLoader = new FXMLLoader(getClass().getResource("Scenes/Settings.fxml"));
        Parent settings = settLoader.load();
        Scene scene = new Scene(settings);
        scene.setRoot(root);

        stage.setScene(scene);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb){
        // TODO
    }
}