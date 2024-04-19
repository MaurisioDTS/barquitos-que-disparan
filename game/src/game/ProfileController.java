package game;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.Parent;
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
    static Label totalBattles=new Label();
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
    
    public static void cqs(){ // cqs = "calienta que sales", pide los datos de la bd para ponerlos en el perfil
       
        Gestor_conexion_POSTGRE gestor = new Gestor_conexion_POSTGRE("mdddb", true);
        String consulta="SELECT * FROM usuario where nick='"+user+"';";
        String[][] result = Bd.consultaSelect(gestor,consulta);
        for(int i=0;i<result.length;i++){
          
                 System.out.println("lvl="+result[0][2]);
                 System.out.println("elo="+result[0][3]);
                 System.out.println("wins="+result[0][4]);
                 System.out.println("loses="+result[0][5]);
            
        }
        //totalBattles.setText("Batallas totales: "+Integer.parseInt(result[0][1])+Integer.parseInt(result[0][2]));
        //loses.setText("loses="+result[0][5]);
        //wins.setText("wins="+result[0][4]);
        gestor.cerrar_Conexion(true);
    }
    
    // scene changes
    
    public void play(ActionEvent a) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Scenes/BoardShips.fxml"));
        stage.getScene().setRoot(root);
        stage.show();
    }
    public void logOff(ActionEvent a)throws Exception{//stage.setScene(title);
        Parent root = FXMLLoader.load(getClass().getResource("Scenes/Login.fxml"));
        stage.getScene().setRoot(root);
        stage.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb){
        cqs();
    }
}