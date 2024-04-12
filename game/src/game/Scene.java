package game;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class Scene{
    
    private Stage stage;
    private Parent root;
    private boolean fullScreen;
            
    Scene(Stage stage){
        this.stage=stage;
    }

    private Scene(Parent root) {
     
    }
    
    
    public void goSettings() throws Exception{
        FXMLLoader Loader = new FXMLLoader(getClass().getResource());
        Parent a = Loader.load();
        javafx.scene.Scene scene = new javafx.scene.Scene(a);
        
        stage.setFullScreen(fullScreen);
        stage.setScene(scene);
        
        
        
        root = FXMLLoader.load(getClass().getResource("Scenes/Settings.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void setFullScreen(boolean a){fullScreen=a;}
    public Stage getStage(){return stage;}
}
