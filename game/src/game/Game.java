package game;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.nio.file.Paths;

public class Game extends Application{

    private static Stage pStage;
    public static Stage getPrimaryStage() {return pStage;}
    private void setPrimaryStage(Stage pStage) {
        Game.pStage = pStage;
    }

    static Media defaultMedia=new Media(Paths.get("src/game/Scenes/Sin_titulo.wav").toUri().toString());
    static MediaPlayer defaultAudio=new MediaPlayer(defaultMedia);

    // Settings
    public static void setFs(boolean b){pStage.setFullScreen(b);}
    public static void setVol(double d){defaultAudio.setVolume(d);}
    public static void toggleMute(){defaultAudio.setMute(!defaultAudio.isMute());/** probablemente la linea de código más inteligente que ha salido de mi mente**/}

    @Override
    public void start(Stage s) throws Exception {
        setPrimaryStage(s);
        pStage=s;

//    // loaders
//    
        FXMLLoader viewLoader = new FXMLLoader(getClass().getResource("Scenes/View.fxml"));
        Parent title = viewLoader.load();
        Scene scene = new Scene(title);
        
        FXMLLoader settingsLoader = new FXMLLoader(getClass().getResource("Scenes/Settings.fxml"));
        Parent settings = settingsLoader.load();
        Scene settingsScene = new Scene(settings);
        
        FXMLLoader loginLoader = new FXMLLoader(getClass().getResource("Scenes/Login.fxml"));
        Parent login = loginLoader.load();
        Scene loginScene = new Scene(login);

        FXMLLoader profileLoader = new FXMLLoader(getClass().getResource("Scenes/Profile.fxml"));
        Parent profile = profileLoader.load();
        Scene profileScene = new Scene(profile);
        
        FXMLLoader dragLoader = new FXMLLoader(getClass().getResource("Scenes/BoardShips.fxml"));
        Parent drag = dragLoader.load();
        Scene dragScene = new Scene(drag);
        
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
        profilePaneController.setDragScene(dragScene);  //toBoard
        
        DraggableController dragPaneController = (DraggableController) dragLoader.getController();
        dragPaneController.setBoardScene(boardScene);  // returnToTittle
        dragPaneController.setProfileScene(profileScene);
        
        BoardController boardPaneController = (BoardController) boardLoader.getController();
        boardPaneController.setTittleScene(scene);  // returnToTittle
        
        //display scene
        
        pStage.setScene(scene);
        pStage.setTitle("Barquitos que disparan!!!11!11");
        pStage.getIcons().add(new Image(Game.class.getResourceAsStream("Scenes/jerma.jpg")));
        pStage.show();
        defaultAudio.setVolume(0.5);/**pastkeysAudio.setVolume(0.5);metalAudio.setVolume(0.5);**/
        defaultAudio.setOnEndOfMedia(()-> {defaultAudio.seek(Duration.ZERO);});

        defaultAudio.play();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

//    static Media pastkeys=new Media(Paths.get("game/res/audio/past keys.wav").toUri().toString());
//    static MediaPlayer pastkeysAudio=new MediaPlayer(defaultMedia);
//
//    static Media metal=new Media(Paths.get("game/res/audio/metal.wav").toUri().toString());
//    static MediaPlayer metalAudio=new MediaPlayer(defaultMedia);

/**public static void changeMusic(int i){
 defaultAudio.stop();
 pastkeysAudio.stop();
 metalAudio.stop();

 switch (i) {
 case 1:
 defaultAudio.play();
 case 2:
 pastkeysAudio.play();
 case 3:
 metalAudio.play();
 default:
 defaultAudio.play();
 }
}**/

/**pastkeysAudio.setOnEndOfMedia(new Runnable() {
 public void run() {
 pastkeysAudio.seek(Duration.ZERO);
 }
 });metalAudio.setOnEndOfMedia(new Runnable() {
 public void run() {
 metalAudio.seek(Duration.ZERO);
 }
 });**/