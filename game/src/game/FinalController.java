/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class FinalController implements Initializable {
    
    private static Stage stage=Game.getPrimaryStage();

    @FXML
    private Label lblWinner;

    @FXML
    private Label lblWarshipsDestroyed;

    @FXML
    private TextField tfUser;

    @FXML
    private TextField tfComments;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    public void btnFinish(ActionEvent a) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Scenes/View.fxml"));
        stage.getScene().setRoot(root);
        stage.show();
    }
    
}
