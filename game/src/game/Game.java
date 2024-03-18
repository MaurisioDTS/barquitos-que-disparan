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
        FXMLLoader viewLoader = new FXMLLoader(getClass().getResource("Scenes/View.fxml"));
        Parent tittle = viewLoader.load();
        Scene scene = new Scene(tittle,1280,720);

        FXMLLoader settingsLoader = new FXMLLoader(getClass().getResource("Scenes/Settings.fxml"));
        Parent settings = settingsLoader.load();
        Scene settingsScene = new Scene(settings,1280,720);
        
        FXMLLoader loginLoader = new FXMLLoader(getClass().getResource("Scenes/Login.fxml"));
        Parent login = loginLoader.load();
        Scene loginScene = new Scene(login,1280,720);

        stage.setScene(loginScene);
        ViewController.giveWindow(stage);
        stage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
