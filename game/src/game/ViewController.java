package game;

import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ViewController implements Initializable{
    
    private final Stage stage=Game.getPrimaryStage();
    
    // extra controls
    
    @FXML
    private void stop(ActionEvent Event){System.out.println("Exiting...");System.exit(0);}
    @FXML
    private void mute(ActionEvent Event){System.out.println("Toggling mute...");Game.toggleMute();}
    
    // scene changes
    
    @FXML
    private void battle(ActionEvent a) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Scenes/Login.fxml"));
        stage.getScene().setRoot(root);
        stage.show();
    }
    @FXML
    private void settings(ActionEvent a) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Scenes/Settings.fxml"));
        stage.getScene().setRoot(root);
        stage.show();
    }
    
    @FXML
    private void ffinal(ActionEvent a) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Scenes/Final.fxml"));
        stage.getScene().setRoot(root);
        stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb){
        // TODO metodo que se burle del jugar más malo, aunque puede ser no haga falta que sea en esta escena
    }
}