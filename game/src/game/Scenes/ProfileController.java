package game.Scenes;

import javafx.fxml.*;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ProfileController {
    private static Stage stage;
    private static Scene tittle;
    private static Scene profile;
    private static String user;
    @FXML
    Label lblUsername=new Label(user);

    public  void giveStage(Stage Stage){stage=Stage;}
    public void setTittleScene(Scene scene){tittle=scene;}
    public static void setProfileScene(Scene scene, String nick){profile=scene;user=nick;}

}
