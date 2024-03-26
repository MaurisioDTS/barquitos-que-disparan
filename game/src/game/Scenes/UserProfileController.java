package game.Scenes;

import javafx.fxml.*;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class UserProfileController {
    private static Stage stage;
    private Scene tittle;
    private Scene profile;
    
    private String user;
    
    public static void giveStage(Stage Stage){stage=Stage;}
    public void setTittleScene(Scene scene){tittle=scene;}
    public void setProfileScene(Scene scene, String nick){profile=scene;user=nick;}
    
    @FXML
    lb
}
