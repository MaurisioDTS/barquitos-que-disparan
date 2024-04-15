package game;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.nio.file.Paths;

public class Game extends Application{

    static Stage nose=new Stage();
    public static Stage getStage(){return nose;}

    static Media song=new Media(Paths.get("game/src/game/Scenes/Sin_titulo.wav").toUri().toString());
    static MediaPlayer audio=new MediaPlayer(song);

    // Settings
    public static void setFs(Stage s,boolean b){nose.setFullScreen(b);}
    public static void setVol(double d){audio.setVolume(d);}

    @Override
    public void start(Stage stage) throws Exception { nose=stage;
//    // loaders
//    
        FXMLLoader viewLoader = new FXMLLoader(getClass().getResource("Scenes/View.fxml"));
        Parent root = viewLoader.load();
        Scene scene = new Scene(root);
        
        FXMLLoader settingsLoader = new FXMLLoader(getClass().getResource("Scenes/Settings.fxml"));
        Parent settings = settingsLoader.load();
        Scene settingsScene = new Scene(settings);
        
        FXMLLoader loginLoader = new FXMLLoader(getClass().getResource("Scenes/Login.fxml"));
        Parent login = loginLoader.load();
        Scene loginScene = new Scene(login);

        FXMLLoader profileLoader = new FXMLLoader(getClass().getResource("Scenes/Profile.fxml"));
        Parent profile = profileLoader.load();
        Scene profileScene = new Scene(profile);

        FXMLLoader boardLoader = new FXMLLoader(getClass().getResource("Scenes/Board.fxml"));
        Parent board = boardLoader.load();
        Scene boardScene = new Scene(board);
        
    // injects
        
        ViewController viewPaneController = (ViewController) viewLoader.getController();
        viewPaneController.setLoginScene(loginScene);   // toLogin
        viewPaneController.setSettingsScene(settingsScene);

        SettingsController settingsPaneController = (SettingsController) settingsLoader.getController();
        settingsPaneController.setTittleScene(scene);   // toLogin

        LoginController loginPaneController = (LoginController) loginLoader.getController();
        loginPaneController.setTittleScene(scene);  // returnToTittle
        loginPaneController.setProfileScene(profileScene);  //toProfile

        ProfileController profilePaneController = (ProfileController) profileLoader.getController();
        profilePaneController.setTittleScene(scene);  // returnToTittle
        profilePaneController.setBoardScene(boardScene);  //toBoard

        BoardController boardPaneController = (BoardController) boardLoader.getController();
        boardPaneController.setTittleScene(scene);  // returnToTittle

        //display scene

        stage.setScene(scene);
        stage.show();
        audio.setVolume(0.5);
        audio.setOnEndOfMedia(new Runnable() {
            public void run() {
                audio.seek(Duration.ZERO);
            }
        });
        audio.play();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
