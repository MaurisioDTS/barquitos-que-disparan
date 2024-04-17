
package game;

import game.Objects.Board;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
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
    private HBox shipLength1;
    @FXML
    private HBox shipLength2;
    @FXML
    private HBox shipLength3;
    @FXML
    private HBox shipLength4;
    @FXML
    private HBox shipLength5;
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
    
    public void rotateShip(KeyEvent rotate) {
        Node ship = (Node) rotate.getSource();
        
        switch(rotate.getCode()){
            case R: ship.setRotate(ship.getRotate()+90);
                break;
            default:
                break;
        }
    }
}
