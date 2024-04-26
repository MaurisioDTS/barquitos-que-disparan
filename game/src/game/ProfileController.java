package game;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import utilidades.bbdd.Bd;
import utilidades.bbdd.Gestor_conexion_POSTGRE;

public class ProfileController implements Initializable{
    private Stage stage=Game.getPrimaryStage();
  
    private static String player1;
    private static String player2;
    
    public String getPlayer1(){return player1;}
    public String getPlayer2(){return player2;}

    @FXML
    private Label lblUsername;
    @FXML
    private Label lblGuest;
    @FXML
    private Label loses,wins,ratio,totalBattles;

    public static void setUser(String s){player1=s;}
    public static String getUser(){return player1;}
    public static void setGuest(String s){player2=s;}
    public static String getGuest(){return player2;}
    
    public void cqs(){ // cqs = "calienta que sales", pide los datos de la bd para ponerlos en el perfil
        
        Gestor_conexion_POSTGRE gestor = new Gestor_conexion_POSTGRE("mdddb", true);
        String consulta="SELECT * FROM usuario where nick='"+player1+"';";
        String[][] result = Bd.consultaSelect(gestor,consulta);
        totalBattles.setText("total battles="+(Integer.parseInt(result[0][4])+Integer.parseInt(result[0][5])));
        loses.setText("loses="+result[0][5]);
        wins.setText("wins="+result[0][4]);
        gestor.cerrar_Conexion(true);
    }
    
    // scene changes
    @FXML
    public void play(ActionEvent a) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Scenes/BoardShips.fxml"));
        stage.getScene().setRoot(root);
        stage.show();
    }
    @FXML
    public void playVsCpu(ActionEvent a) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Scenes/BoardShips.fxml"));
        stage.getScene().setRoot(root);
        stage.show();
    }
    @FXML
    public void random(ActionEvent a) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Scenes/BoardShips.fxml"));
        BoardController.isRandom=true;
        
        stage.getScene().setRoot(root);
        stage.show();
    }
    @FXML
    public void randomVsCpu(ActionEvent a) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Scenes/BoardShips.fxml"));
        stage.getScene().setRoot(root);
        stage.show();
    }
    @FXML
    public void player2Login(ActionEvent a)throws Exception{//stage.setScene(title);
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("Scenes/Login.fxml"));
        LoginController.isPlayer2();
        Scene scene = new Scene(fxmlLoader.load(), 630, 400);
        Stage stage = new Stage();
        stage.setTitle("Player 2 login");
        stage.getIcons().add(new Image(Game.class.getResourceAsStream("Scenes/jerma.jpg")));
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void logOff(ActionEvent a)throws Exception{//stage.setScene(title);
        Parent root = FXMLLoader.load(getClass().getResource("Scenes/Login.fxml"));
        stage.getScene().setRoot(root);
        stage.show();
    }
    @FXML
    public void history(ActionEvent a)throws Exception{//stage.setScene(title);
        lblGuest.setText(player2);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb){
        System.out.println(player1);
        cqs();
        lblUsername.setText(player1);
        
    }
    
    public void btnRecord(ActionEvent a) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Scenes/Record.fxml"));
        stage.getScene().setRoot(root);
        stage.show();
    }
}