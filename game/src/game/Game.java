package game;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.text.View;
import java.util.Objects;

public class Game extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        
    // loaders
        FXMLLoader viewLoader = new FXMLLoader(getClass().getResource("Scenes/View.fxml"));
        Parent tittle = viewLoader.load();
        Scene scene = new Scene(tittle,1280,720);

        FXMLLoader settingsLoader = new FXMLLoader(getClass().getResource("Scenes/Settings.fxml"));
        Parent settings = settingsLoader.load();
        Scene settingsScene = new Scene(settings,1280,720);
        
        FXMLLoader boardLoader = new FXMLLoader(getClass().getResource("Scenes/Board.fxml"));
        Parent board = boardLoader.load();
        Scene boardScene = new Scene(board,1280,720);
        
        FXMLLoader loginLoader = new FXMLLoader(getClass().getResource("Scenes/Login.fxml"));
        Parent login = loginLoader.load();
        Scene loginScene = new Scene(login,1280,720);
        
    // injects
        
        ViewController viewPaneController = (ViewController) viewLoader.getController();
        viewPaneController.setSettingsScene(settingsScene);
        viewPaneController.setLoginScene(loginScene);
        
        
        SettingsController settingsPaneController = (SettingsController) settingsLoader.getController();
        settingsPaneController.setTittleScene(scene);

    //display scene
        
        stage.setScene(scene);
        ViewController.giveWindow(stage);
        stage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
