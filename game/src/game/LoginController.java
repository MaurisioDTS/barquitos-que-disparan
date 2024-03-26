package game;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import utilidades.bbdd.Bd;
import utilidades.bbdd.Gestor_conexion_POSTGRE;

public class LoginController implements Initializable{
//TODO "programar el login, pues simplemente multiplica x2 y se lo pasa a la siguiente escena"

    private static Stage stage;
    private Scene tittle;
    private Scene board;
    
    public static void giveStage(Stage Stage){stage=Stage;}
    public void setTittleScene(Scene scene){tittle=scene;}
    public void setBoardScene(Scene scene){board=scene;}
    
    @FXML
    TextField tbRegUser=new TextField();
    @FXML        
    PasswordField tbRegPass=new PasswordField();
    @FXML
    TextField tbLogUser=new TextField();
    @FXML        
    PasswordField tbLogPass=new PasswordField();
    @FXML
    Button register=new Button();
    @FXML
    Button btnReturn=new Button();
    @FXML
    Label lblWrongCredentials=new Label();
    
    @FXML
    private void btnReturn(ActionEvent Event){
        System.out.println("return");
        stage.setScene(tittle);
    }
    
    Gestor_conexion_POSTGRE gestor=new Gestor_conexion_POSTGRE("mdddb", true);
    
    public void register(ActionEvent Event){
        String consulta;
        String user = "'"+tbRegUser.getText()+"'";
        String password=tbRegPass.getText();
        String sha256hex = "'"+org.apache.commons.codec.digest.DigestUtils.sha256Hex(password)+"'";
        
        consulta ="insert into usuario (nick,passinsha256,lvl,elo) values ("+user+","+sha256hex+",0,0);";
    
        System.out.println(Bd.consultaModificacion(gestor,consulta));  
        //gestor.cerrar_Conexion(true);
    }
    public void login(ActionEvent Event){
        lblWrongCredentials.setVisible(false);
        String nick="'"+tbLogUser.getText()+"'";
        String pass=tbLogPass.getText();
        String sha256hex = org.apache.commons.codec.digest.DigestUtils.sha256Hex(pass);
        
        String consulta="SELECT * FROM usuario where nick="+nick+";";
        String[][] result = Bd.consultaSelect(gestor,consulta);
        
        //System.out.println(result[0][1]); //SHOW HASHED PASSWORD
        
        if (result[0][1].equals(sha256hex)){
            stage.setScene(board);
        }
        else{
            lblWrongCredentials.setVisible(true);
            System.out.println("pec");
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb){
        // TODO
    }
}
