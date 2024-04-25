/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class RecordController implements Initializable {
    
    private Stage stage=Game.getPrimaryStage();
    
    @FXML
    private TextField textField;
    
    @FXML
    private TableView<String> tableView;
    
    @FXML
    void captureText(ActionEvent event){
        String texto = textField.getText();
        System.out.println("Contenido: "+texto);
    } 
    
    @FXML
    void btnReturn(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Scenes/Profile.fxml"));
        stage.getScene().setRoot(root);
        stage.show();
    }
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void makeTableView() {
           String[] array = obtenerArray();

           ObservableList<String> list = FXCollections.observableArrayList(array);

           tableView.setItems(list);

           TableColumn<String, String> columna = new TableColumn<>("Comentario");
           columna.setCellValueFactory(data -> {
               return new SimpleStringProperty(data.getValue());
           });
           tableView.getColumns().add(columna);

        }    

        private String[] obtenerArray() {
            return new String[]{"2", "123456789", "Comentario de prueba"};
        }    
    
}
