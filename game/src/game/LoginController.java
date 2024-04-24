package game;

import java.net.ConnectException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import utilidades.bbdd.Bd;
import utilidades.bbdd.Gestor_conexion_POSTGRE;

import static game.Utils.digest256;
import javafx.scene.Node;

public class LoginController implements Initializable{
//TODO
    private static Stage stage=Game.getPrimaryStage();
    
    static private boolean isPlayer2=false;

    static void isPlayer2(){isPlayer2=true;}
    private Scene title;
    private Scene profile;

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
    Label lblWrongCredentials=new Label();
    @FXML
    Label lblNoDb=new Label();
    
    public void clearTBs(){tbRegUser.setText("");tbRegPass.setText("");tbLogUser.setText("");tbLogPass.setText("");}
    
    @FXML
    private void btnReturn(ActionEvent a) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Scenes/View.fxml"));
        stage.getScene().setRoot(root);
        stage.show();
    }
    
    Gestor_conexion_POSTGRE gestor;

    public void noDb(){lblNoDb.setVisible(true);}
    @FXML
    private void register() throws NoSuchAlgorithmException {
        //TODO add already existing user message
        Gestor_conexion_POSTGRE gestor=new Gestor_conexion_POSTGRE("mdddb", true);

        String user = tbRegUser.getText(), pass=digest256(tbRegPass.getText());

        String consulta ="insert into usuario (nick,passinsha256,lvl,elo) values ('"+user+"','"+pass+"',0,0);";
        Bd.consultaModificacion(gestor,consulta);
        clearTBs();
        gestor.cerrar_Conexion(true);
    }
    @FXML
    private void login(ActionEvent a) throws Exception{ lblWrongCredentials.setVisible(false);
        Gestor_conexion_POSTGRE gestor = new Gestor_conexion_POSTGRE("mdddb", true);
        String nick=tbLogUser.getText(), pass=digest256(tbLogPass.getText());

        String consulta="SELECT passinsha256 FROM usuario where nick='"+nick+"';";
        String[][] result = Bd.consultaSelect(gestor,consulta);

         System.out.println(result[0][0]);

        try{ // If the credentials match, goes to profile. Otherwise, shows an error message
            if (result[0][0].equals(pass)&&!isPlayer2){
                ProfileController.setUser(nick);
                clearTBs();
                Parent root = FXMLLoader.load(getClass().getResource("Scenes/Profile.fxml"));
                stage.getScene().setRoot(root);
                stage.show();
            }
            if (result[0][0].equals(pass)&&isPlayer2){ 
                //ProfileController.setGuest(nick);
                clearTBs();
                ((Node)(a.getSource())).getScene().getWindow().hide();

            }
            else {lblWrongCredentials.setVisible(true);}
        }
        catch(java.lang.NullPointerException n) {lblWrongCredentials.setVisible(true);}
        gestor.cerrar_Conexion(true);
    }
    public void initialize(URL url, ResourceBundle rb){ // Checks if dB is up
        try{
            Gestor_conexion_POSTGRE test=new Gestor_conexion_POSTGRE("mdddb",true);
            Bd.consultaSelect(test,"select * from usuario;");
            test.cerrar_Conexion(true);
        } catch(Exception e){noDb();}
        btnReturn.setVisible(!isPlayer2);
    }
}
