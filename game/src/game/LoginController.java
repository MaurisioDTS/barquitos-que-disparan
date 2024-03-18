/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import utilidades.bbdd.Bd;
import utilidades.bbdd.Gestor_conexion_POSTGRE;

/**
 *
 * @author Usuario
 */
public class LoginController {
    private static Stage stage;
    private Scene board;
    
    @FXML
    TextField tbRegUser=new TextField();
    @FXML        
    PasswordField tbRegPass=new PasswordField();
    @FXML
    Button register=new Button();
    
    Gestor_conexion_POSTGRE gestor=new Gestor_conexion_POSTGRE("mdddb", true);
    
    public void setBoardScene(Scene scene){board=scene;}
    
    public void register(ActionEvent Event){
        String consulta;
        String user = "'"+tbRegUser.getText()+"'";
        String password=tbRegPass.getText();
        String sha256hex = "'"+org.apache.commons.codec.digest.DigestUtils.sha256Hex(password)+"'";
        
        consulta ="insert into usuario (nick,passinsha256,lvl,elo) values ("+user+","+sha256hex+",0,0);";
    
        System.out.println(Bd.consultaModificacion(gestor,consulta));  
        gestor.cerrar_Conexion(true);
    }
    public void login(ActionEvent Event){
        String consulta;
        consulta ="select nick from usuario";
        
        System.out.println(Bd.consultaSelect(gestor,consulta));
        gestor.cerrar_Conexion(true);
        System.out.println("pec");
    }
}
