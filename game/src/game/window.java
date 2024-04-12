package game;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class window{
    
    private Stage stage;
    private Scene scene;
    private Parent root;

    private boolean fullScreen;
            
    window(Stage stage){
        this.stage=stage;
    }

    private window(Parent root) {
     
    }
    
    
    public void goSettings(ActionEvent event) throws Exception{
        
        root = FXMLLoader.load(getClass().getResource("Scenes/Settings.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        
        stage.setFullScreen(fullScreen);
        stage.setScene(this.scene);
        
        stage.show();
        
        
    }
    public void setFullScreen(boolean a){fullScreen=a;}
    public Stage getStage(){return stage;}
}
