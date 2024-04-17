package game;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import utilidades.bbdd.Bd;
import utilidades.bbdd.Gestor_conexion_POSTGRE;

public class LoginController implements Initializable{
//TODO

    private static Stage stage;
    private Scene title;
    private Scene profile;
    
    public static void giveStage(Stage Stage){stage=Stage;}
    public void setTittleScene(Scene scene){title=scene;}
    public void setProfileScene(Scene scene){profile=scene;}
    
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
    Label lblNoUser=new Label();
    @FXML
    Label lblWrongCredentials=new Label();
    @FXML
    static Label lblNoDb=new Label();
    
    @FXML
    private void btnReturn(ActionEvent a){
        System.out.println("return");
        Stage stage = (Stage)((Node)a.getSource()).getScene().getWindow(); 
        stage.setScene(title);
    }
    static Gestor_conexion_POSTGRE gestor;

    public void register(ActionEvent Event){
        tryDb();
        Gestor_conexion_POSTGRE gestor=new Gestor_conexion_POSTGRE("mdddb", true);
        String consulta;
        String user = "'"+tbRegUser.getText()+"'";
        String password=tbRegPass.getText();
        String sha256hex = "'"+org.apache.commons.codec.digest.DigestUtils.sha256Hex(password)+"'";
        
        consulta ="insert into usuario (nick,passinsha256,lvl,elo) values ("+user+","+sha256hex+",0,0);";
    
        System.out.println(Bd.consultaModificacion(gestor,consulta));  
        gestor.cerrar_Conexion(true);
    }
    public void login(ActionEvent a){
        lblNoUser.setVisible(false);
        tryDb();
        Gestor_conexion_POSTGRE gestor=new Gestor_conexion_POSTGRE("mdddb", true);
        lblWrongCredentials.setVisible(false);
        String nick="'"+tbLogUser.getText()+"'";
        String pass=tbLogPass.getText();
        String sha256hex = org.apache.commons.codec.digest.DigestUtils.sha256Hex(pass);
        
        String consulta="SELECT * FROM usuario where nick="+nick+";";
        String[][] result = Bd.consultaSelect(gestor,consulta);
        
        //System.out.println(result[0][1]); //SHOW HASHED PASSWORD

        try{ // como detesto haber programado esto
            if (result[0][1].equals(sha256hex)){
                Stage stage = (Stage)((Node)a.getSource()).getScene().getWindow();
                ProfileController.setProfileScene(profile,tbLogUser.getText());
                
                stage.setScene(profile);
            }
            else{
                lblWrongCredentials.setVisible(true);
                System.out.println("pec");
            }
        }
        catch (java.lang.NullPointerException n){
            lblNoUser.setVisible(true);
            System.out.println("that user doesnt exist");
        }
        gestor.cerrar_Conexion(true);
    }
    public static void tryDb(){
        lblNoDb.setVisible(false);
        try{
            Gestor_conexion_POSTGRE temp=new Gestor_conexion_POSTGRE("mdddb", true);
            System.out.println(Bd.consultaSelect(temp,"select * from usuario;"));
            gestor.cerrar_Conexion(true);
        }
        catch (NullPointerException a) {
            lblNoDb.setVisible(true);
            System.out.println("DB NOT FOUND!!!!!!!!!!!!1!!!!!!1");
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb){
        //TODO
        tryDb();
    }
}
