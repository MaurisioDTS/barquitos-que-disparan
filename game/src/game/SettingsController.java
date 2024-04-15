package game;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Slider;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SettingsController {

    private static Stage stage=Game.getStage();
    private Scene title;
    
    public static void giveStage(Stage Stage){stage=Stage;}
    public void setTittleScene(Scene scene){title=scene;}
    
    @FXML
    CheckBox cbFs=new CheckBox();
    @FXML
    Slider sldVolume=new Slider();
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
}