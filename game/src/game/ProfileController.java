                                                                                                                                                                                                                                                                                                                                                                                         package game;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import utilidades.bbdd.Bd;
import utilidades.bbdd.Gestor_conexion_POSTGRE;

public class ProfileController implements Initializable{
    private Stage stage=Game.getPrimaryStage();
    private Scene title;
    private Scene drag;
    private static Scene profile;
    private static String user;

    @FXML
    Label lblUsername=new Label();
    @FXML
    Label totalBattles=new Label();
    @FXML
    Label loses=new Label();
    @FXML
    Label wins=new Label();
    @FXML
    Label ratio=new Label();

    public void setTittleScene(Scene scene){title=scene;}
    public void setDragScene(Scene scene){drag=scene;}
    
    @FXML
    public static void setUser(String s){user=s;}
    
    private void cqs(){ // cqs = calienta que sales, pide los datos de la bd para ponerlos en el perfil
        Gestor_conexion_POSTGRE gestor = new Gestor_conexion_POSTGRE("mdddb", true);
        String consulta="SELECT lvl,wins,loses,elo FROM usuario where nick='"+user+"';";
        String[][] result = Bd.consultaSelect(gestor,consulta);
    } 
    
    // scene changes
    
    public void play(ActionEvent a){stage.setScene(drag);}
    public void logOff(ActionEvent a){stage.setScene(title);}
    @Override
    public void initialize(URL url, ResourceBundle rb){
    }
}