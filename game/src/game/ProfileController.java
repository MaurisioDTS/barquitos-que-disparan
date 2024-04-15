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
    private static Stage stage;
    private Scene title;
    private Scene board;
    private static Scene profile;
    private static String user;

    @FXML
    Label lblUsername=new Label();

    public static void giveStage(Stage Stage){stage=Stage;}
    public void setTittleScene(Scene scene){title=scene;}
    public void setBoardScene(Scene scene){board=scene;}
    public static void setProfileScene(Scene scene, String nick){profile=scene;user=nick;}
    
    public void play(ActionEvent a){
        lblUsername.setText(user);
        BoardController.giveStage(stage);
        Stage stage = (Stage)((Node)a.getSource()).getScene().getWindow();
        stage.setScene(board);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb){
        lblUsername.setText(user);
    }
}