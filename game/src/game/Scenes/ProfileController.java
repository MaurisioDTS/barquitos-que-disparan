package game.Scenes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ProfileController implements Initializable{
    private static Stage stage;
    private static Scene title;
    private static Scene profile;
    private static String user;

    @FXML
    Label lblUsername=new Label();

    public void giveStage(Stage Stage){stage=Stage;}
    public void setTittleScene(Scene scene){title=scene;}
    public static void setProfileScene(Scene scene, String nick){profile=scene;user=nick;}
    
    public void play(ActionEvent Action){
        System.out.println(user);
        lblUsername.setText(user);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb){
        lblUsername.setText(user);
    }
}
