package game;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class Scene{
    
    private Stage stage;
    private boolean fullScreen;
    
    FXMLLoader Loader = new FXMLLoader(getClass().getResource("Scenes/Settings.fxml"));
    Parent a = Loader.load();
    javafx.scene.Scene scene = new javafx.scene.Scene(a);
            
    Scene(Stage stage){
        this.stage=stage;
        
    }
    public void goSettings() throws Exception{
        
        scene.setRoot(root);
        
        stage.setFullScreen(fullScreen);
        stage.setScene(scene);
    }
    public void setFullScreen(boolean a){fullScreen=a;}
    public Stage getStage(){return stage;}
}
