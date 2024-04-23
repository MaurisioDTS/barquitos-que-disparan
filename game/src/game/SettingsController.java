package game;

import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Slider;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;
import javafx.scene.control.Label;
import utilidades.bbdd.Bd;
import utilidades.bbdd.Gestor_conexion_POSTGRE;


public class SettingsController implements Initializable{

    private static Stage stage=Game.getPrimaryStage();


    MediaPlayer test = new MediaPlayer(new Media(Paths.get("res/audio/test.wav").toUri().toString()));
    private int count=0;
    MediaPlayer eE = new MediaPlayer(new Media(Paths.get("res/audio/eE.wav").toUri().toString()));

    
    @FXML
    Label lblDbWarning=new Label();
    @FXML
    CheckBox cbFs=new CheckBox();
    @FXML
    Slider sldVolume=new Slider();
    @FXML
    ChoiceBox cbLang=new ChoiceBox(FXCollections.observableArrayList("1", "2", "3"));
    @FXML
    private void stop(ActionEvent Event){System.exit(0);}
    @FXML
    private void setSettings(ActionEvent Event){
        Game.setVol(sldVolume.getValue());
        Game.setFs(cbFs.isSelected());
    }
    
    @FXML
    private void createDb(ActionEvent a){ // creates the inintial dB with no data, from the sql script
        Gestor_conexion_POSTGRE postgres=new Gestor_conexion_POSTGRE("postgres", true);
        Bd.consultaModificacion(postgres, "CREATE DATABASE mdddb;");
        postgres.cerrar_Conexion(true);
        Gestor_conexion_POSTGRE gestor=new Gestor_conexion_POSTGRE("mdddb", true);
        Bd.importar("res/mdddb.sql",gestor);
        gestor.cerrar_Conexion(true);
    }
    
    @FXML
    private void deleteDb(ActionEvent a){ // DROPS THE ENTIRE DATABASE
        lblDbWarning.setVisible(false);
        Gestor_conexion_POSTGRE gestor=new Gestor_conexion_POSTGRE("postgres", true);
        
        try {Bd.consultaModificacion(gestor,"drop database mdddb"); gestor.cerrar_Conexion(true);}
        catch(Exception e){lblDbWarning.setVisible(true);}
    }
    
    @FXML
    private void test(ActionEvent a){count++;
        if(count==5){count=0;
            test.stop();
            eE.setVolume(Game.getVol());
            eE.setOnEndOfMedia(()->{eE.stop();});
            eE.play();
        }
        else{
            test.setVolume(Game.getVol());
            test.setOnEndOfMedia(()->{test.stop();});
            test.play();
        }
    }
    @FXML
    private void btnreturn(ActionEvent a) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Scenes/View.fxml"));
        stage.getScene().setRoot(root);
        stage.show();
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        sldVolume.setValue(Game.getVol());
        cbFs.setSelected(Game.getFs());
    }
}