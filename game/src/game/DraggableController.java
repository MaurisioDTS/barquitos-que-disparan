
package game;

import game.Objects.Board;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DraggableController{
    
    private static Stage stage;
    private Scene title;
    private Scene board;
    private Scene profile;
    
    public static void giveStage(Stage Stage){stage=Stage;}
    public void setBoardScene(Scene scene){board=scene;}
    public void setProfileScene(Scene scene){profile=scene;}

    
    @FXML
    private Rectangle shipLength5;
    @FXML
    private Rectangle shipLength4;
    @FXML
    private Rectangle shipLength3;
    @FXML
    private Rectangle shipLength2;
    @FXML
    private Rectangle shipLength1;
    @FXML
    private DraggableMaker draggableMaker;
    
    Board brd=new Board("elpepe");
    
    @FXML
    public void rtn(ActionEvent a){
        Stage stage = (Stage)((Node)a.getSource()).getScene().getWindow();
        stage.setScene(profile);
    }
    public void board(ActionEvent a){
        Stage stage = (Stage)((Node)a.getSource()).getScene().getWindow();
        stage.setScene(board);
    }
        
    @FXML
    public void initialize() {
        draggableMaker = new DraggableMaker();
        draggableMaker.makeDraggable(shipLength5);
        draggableMaker.makeDraggable(shipLength4);
        draggableMaker.makeDraggable(shipLength3);
        draggableMaker.makeDraggable(shipLength2);
        draggableMaker.makeDraggable(shipLength1);
    }

    
}
