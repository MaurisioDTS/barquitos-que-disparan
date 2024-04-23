
package game;

import game.Objects.Board;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class DraggableController{

    private static Stage stage=Game.getPrimaryStage();

    @FXML
    private HBox currentDraggedBox;
    @FXML
    private boolean rotateKey = false;
    @FXML
    private GridPane boardP1;
    @FXML
    private GridPane boardP2;
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
    @FXML
    private HBox draggedBox;
    
    
    
   @FXML
    private void onDragDropped(DragEvent event) {
        if (event.getGestureSource() instanceof HBox && event.getGestureTarget() instanceof GridPane) {
            HBox dragged = (HBox) event.getGestureSource();
            GridPane targetGrid = (GridPane) event.getGestureTarget();
        
            int column = (int) (event.getX() / (targetGrid.getWidth()/10));
            int row = (int) (event.getY() / (targetGrid.getWidth()/10));
        
            addShipToGrid(dragged, targetGrid, column, row);
        
            event.setDropCompleted(true);
            event.consume();
    }
}

    private void addShipToGrid(HBox ship, GridPane grid, int column, int row) {
        grid.add(ship, column, row);
        ship.setTranslateX(0);
        ship.setTranslateY(0);
    }




    @FXML
    private void onMousePressed(MouseEvent event){
        if (event.getSource() instanceof HBox){
            draggedBox = (HBox) event.getSource();
        }
    }

    @FXML
    private void onMouseDragged(MouseEvent event){
        if (draggedBox != null){
            draggedBox.setTranslateX(event.getSceneX());
            draggedBox.setTranslateY(event.getSceneY());
        }
    }

    @FXML
    private void onMouseReleased(MouseEvent event){
        if (currentDraggedBox != null){
            currentDraggedBox = null;
        }
    }
    Board brd=new Board("elpepe");
    
    // changes in scene
    
    public void rtn(ActionEvent a) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Scenes/Profile.fxml"));
        stage.getScene().setRoot(root);
        stage.show();
    }
    public void board(ActionEvent a) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Scenes/Board.fxml"));
        stage.getScene().setRoot(root);
        stage.show();
    }
        
    @FXML
    public void initialize() {
        draggableMaker = new DraggableMaker();
        draggableMaker.makeDraggable(shipLength1);
        draggableMaker.makeDraggable(shipLength2);
        draggableMaker.makeDraggable(shipLength3);
        draggableMaker.makeDraggable(shipLength4);
        draggableMaker.makeDraggable(shipLength5);
        
        boardP1.setOnDragOver(this::onDragOver);
        boardP2.setOnDragOver(this::onDragOver);
    }
    
    private void onDragOver(DragEvent event){
        if(event.getGestureSource() instanceof HBox && event.getGestureTarget() instanceof GridPane){
            event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
            event.consume();
        }
    }
    
    @FXML
    private void onDragDetected(MouseEvent event) {
        if (event.getSource() instanceof HBox) {
            currentDraggedBox = (HBox) event.getSource();
            currentDraggedBox.startFullDrag();
        }
    }

    @FXML
    private void rotateKeyPressed(KeyEvent event) {
        if (event.getCode() == KeyCode.R) {
            rotateKey = true;
            if (currentDraggedBox != null) {
                currentDraggedBox.setRotate(currentDraggedBox.getRotate() + 90);
            }
        }
    }

    @FXML
    private void rotateKeyReleased(KeyEvent event) {
        if (event.getCode() == KeyCode.R) {
            rotateKey = false;
        }
    }
}
