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
    @FXML
    CheckBox cbFs=new CheckBox();
    @FXML
    Button apply=new Button();
    @FXML
    AnchorPane anchorPane=new AnchorPane();

    public void setTittle(Scene scene) {
        tittle = scene;
    }
    public void openFirstScene(ActionEvent actionEvent) {
        Stage primaryStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        primaryStage.setScene(tittle);
    }
    @FXML
    private void setSettings(ActionEvent Event){
        Stage stage = (Stage) anchorPane.getScene().getWindow();
        System.out.println("Full Screen");
        stage.setFullScreen(cbFs.isSelected());
    }
}
