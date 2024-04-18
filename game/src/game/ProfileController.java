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
    private static Stage stage=Game.getPrimaryStage();
    private Scene title;
    private Scene drag;
    private static Scene profile;
    private static String user;

    @FXML
    static Label lblUsername=new Label();

    public void setTittleScene(Scene scene){title=scene;}
    public void setDragScene(Scene scene){drag=scene;}
    
    public static void setProfileScene(Scene scene, String nick){profile=scene;user=nick;lblUsername.setText(user);}
    
    public void play(ActionEvent a){
        lblUsername.setText(user);
        Stage stage = (Stage)((Node)a.getSource()).getScene().getWindow();
        stage.setScene(drag);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb){
    }
}