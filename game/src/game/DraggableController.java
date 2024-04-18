
package game;

import game.Objects.Board;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.DragEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class DraggableController{

    private static Stage stage=Game.getPrimaryStage();
    private Scene title;
    private Scene board;
    private Scene profile;

    public void setBoardScene(Scene scene){board=scene;}
    public void setProfileScene(Scene scene){profile=scene;}
    
    @FXML
    private HBox currentDraggedBox;
    @FXML
    private boolean rotateKeyPressed = false;
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
        draggableMaker.makeDraggable(shipLength1);
        draggableMaker.makeDraggable(shipLength2);
        draggableMaker.makeDraggable(shipLength3);
        draggableMaker.makeDraggable(shipLength4);
        draggableMaker.makeDraggable(shipLength5);
    }
    
    @FXML
    private void onDragDetected(MouseEvent event) {
        System.out.println("Drag detected");
        if (event.getSource() instanceof HBox) {
            System.out.println("HBox detected");
            currentDraggedBox = (HBox) event.getSource();
            currentDraggedBox.startFullDrag();
        }
    }

    @FXML
    private void onDragOver(DragEvent event) {
        System.out.println("Drag over");
        if (currentDraggedBox != null && rotateKeyPressed) {
            System.out.println("HBox rotated");
            currentDraggedBox.setRotate(currentDraggedBox.getRotate()+90);
        }
    }

    @FXML
    private void rotateKeyPressed(KeyEvent event) {
        System.out.println("Rotate key pressed");
        if (event.getCode() == KeyCode.R) {
            rotateKeyPressed = true;
        }
    }

    @FXML
    private void rotateKeyReleased(KeyEvent event) {
        System.out.println("Rotate key released");
        if (event.getCode() == KeyCode.R) {
            rotateKeyPressed = false;
        }
    }
}
