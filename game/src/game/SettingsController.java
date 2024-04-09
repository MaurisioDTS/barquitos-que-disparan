package game;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SettingsController {

    private static Stage stage;
    private Scene title;
    
    public static void giveStage(Stage Stage){stage=Stage;}
    public void setTittleScene(Scene scene){title=scene;}
    
    @FXML
    CheckBox cbFs=new CheckBox();
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
        System.out.println("Full Screen");
        stage.setFullScreen(cbFs.isSelected());
        
    }
    @FXML
    private void btnreturn(ActionEvent Event){
        ViewController.giveStage(stage);
        System.out.println("return");
        stage.setScene(title);
    }
}
