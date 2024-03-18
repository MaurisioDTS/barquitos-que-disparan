package game;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class SettingsController {

    
    private Scene tittle;
    private static Stage stage;
    @FXML
    CheckBox cbFs=new CheckBox();
    @FXML
    Button apply=new Button();
    @FXML
    AnchorPane anchorPane=new AnchorPane();

    public void setTittleScene(Scene scene){tittle=scene;}
   
    @FXML
    private void setSettings(ActionEvent Event){
        Stage stage = (Stage) anchorPane.getScene().getWindow();
        System.out.println("Full Screen");
        stage.setFullScreen(cbFs.isSelected());
    }
    @FXML
    private void btnreturn(ActionEvent Event){
        System.out.println("return");
        stage.setScene(tittle);
    }
}
