                                                                                                                                                                                                                                                                                                                                                                                                                           package game;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ProfileController implements Initializable{
    private Stage stage=Game.getPrimaryStage();
    private Scene title;
    private Scene drag;
    private static Scene profile;
    private static String user;

    @FXML
    Label lblUsername=new Label();

    public void setTittleScene(Scene scene){title=scene;}
    public void setDragScene(Scene scene){drag=scene;}
    
    @FXML
    public static void setUser(String s){user=s;}
    
    // scene changes
    
    public void play(ActionEvent a){stage.setScene(drag);}
    public void logOff(ActionEvent a){stage.setScene(title);}
    @Override
    public void initialize(URL url, ResourceBundle rb){
    }
}