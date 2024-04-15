package game;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Slider;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

import static javafx.scene.input.KeyCode.T;

public class SettingsController implements Initializable{

    private static Stage stage=Game.getStage();
    private Scene title;
    
    public static void giveStage(Stage Stage){stage=Stage;}
    public void setTittleScene(Scene scene){title=scene;}
    
    @FXML
    CheckBox cbFs=new CheckBox();
    @FXML
    Slider sldVolume=new Slider();
    @FXML
    ChoiceBox cbLang=new ChoiceBox(FXCollections.observableArrayList("1", "2", "3"));

    @FXML
    Button apply=new Button();
    @FXML
    AnchorPane anchorPane=new AnchorPane();
    @FXML
    private void stop(ActionEvent Event){
        System.out.println("Exiting...");
        System.exit(0);
    }
    @FXML
    private void setSettings(ActionEvent Event){
        Stage stage = (Stage)((Node)Event.getSource()).getScene().getWindow();
        System.out.println(sldVolume.getValue());

        Game.setVol(sldVolume.getValue());
        Game.setFs(stage,cbFs.isSelected());
    }
    @FXML
    private void btnreturn(ActionEvent a){
        System.out.println("return");
        Stage stage = (Stage)((Node)a.getSource()).getScene().getWindow();
        stage.setScene(title);
        System.out.println(stage.getScene());
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}