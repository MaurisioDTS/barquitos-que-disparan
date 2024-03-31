package game;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Game extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        
    // loaders
    
        FXMLLoader viewLoader = new FXMLLoader(getClass().getResource("Scenes/View.fxml"));
        Parent tittle = viewLoader.load();
        Scene scene = new Scene(tittle);

        FXMLLoader settingsLoader = new FXMLLoader(getClass().getResource("Scenes/Settings.fxml"));
        Parent settings = settingsLoader.load();
        Scene settingsScene = new Scene(settings);
        
        FXMLLoader boardLoader = new FXMLLoader(getClass().getResource("Scenes/Board.fxml"));
        Parent board = boardLoader.load();
        Scene boardScene = new Scene(board);
        
        FXMLLoader loginLoader = new FXMLLoader(getClass().getResource("Scenes/Login.fxml"));
        Parent login = loginLoader.load();
        Scene loginScene = new Scene(login);

        FXMLLoader profileLoader = new FXMLLoader(getClass().getResource("Scenes/UserData.fxml"));
        Parent profile = profileLoader.load();
        Scene profileScene = new Scene(profile);
        
    // injects
        
        ViewController viewPaneController = (ViewController) viewLoader.getController();
        viewPaneController.setSettingsScene(settingsScene); // toSettings
        viewPaneController.setLoginScene(loginScene);   // toLogin

        SettingsController settingsPaneController = (SettingsController) settingsLoader.getController();
        settingsPaneController.setTittleScene(scene);   // returnToTittle
        
        LoginController loginPaneController = (LoginController) loginLoader.getController();
        loginPaneController.setTittleScene(scene);  // returnToTittle
        loginPaneController.setProfileScene(profileScene);  //toProfile

    //display scene
        
        stage.setScene(scene);
        ViewController.giveStage(stage);
        stage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
