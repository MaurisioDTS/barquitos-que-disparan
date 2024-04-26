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
    public static Stage getPrimaryStage(){return pStage;}
    private void setPrimaryStage(Stage pStage){Game.pStage = pStage;}
    private static Media defaultMedia=new Media(Paths.get("res/audio/explosion.wav").toUri().toString());
    private static MediaPlayer defaultAudio=new MediaPlayer(defaultMedia);

// Settings

    private static double globalVolume=0.5;
    private static boolean fullScreen=false;
    public static void setFs(boolean b){fullScreen=b; pStage.setFullScreen(b);}
    public static void setVol(double d){globalVolume=d;defaultAudio.setVolume(globalVolume);}
    public static double getVol(){return globalVolume;}
    public static boolean getFs(){return fullScreen;}
    public static void toggleMute(){defaultAudio.setMute(!defaultAudio.isMute());/** probablemente la linea de código más inteligente que ha salido de mi mente**/}

    @Override
    public void start(Stage s) throws Exception {
        setPrimaryStage(s);  // gets the primary stage and saves it for later...

    // scene loader

        FXMLLoader viewLoader = new FXMLLoader(getClass().getResource("Scenes/View.fxml"));
        Parent title = viewLoader.load();
        Scene scene = new Scene(title);

    // display scene
        
        pStage.setScene(scene);
        pStage.setTitle("Barquitos que disparan!!!11!11");
        pStage.getIcons().add(new Image(Game.class.getResourceAsStream("img/icon.png")));
        pStage.setFullScreen(fullScreen);
        pStage.setWidth(1280);
        pStage.setHeight(720);
        pStage.show();
        
    // audio setup
        
//        defaultAudio.setVolume(globalVolume);
//        defaultAudio.setOnEndOfMedia(()->{defaultAudio.seek(Duration.ZERO);}); // expresion lambda que loopea el audio hasta el infinito
//        defaultAudio.play();
    }
    public static void main(String[] args) {launch(args);}
}