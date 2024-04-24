
package game;

import game.Objects.Board;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class DraggableController{

    private static Stage stage = Game.getPrimaryStage();
    
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
    
    private boolean [][] boardCheckP1 = new boolean[10][10];
    
    private boolean [][] boardCheckP2 = new boolean[10][10];
    
    private double rotationAngle = 0.0;

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
    
    // Ships and Grids
    
    @FXML
    public void initialize() {
        draggableMaker = new DraggableMaker();
        draggableMaker.makeDraggable(shipLength1);
        draggableMaker.makeDraggable(shipLength2);
        draggableMaker.makeDraggable(shipLength3);
        draggableMaker.makeDraggable(shipLength4);
        draggableMaker.makeDraggable(shipLength5);
        
        boardP1.setOnDragOver(this::onDragOver);
        boardP1.setOnDragDropped(this::onDragDropped);
        boardP2.setOnDragOver(this::onDragOver);
        boardP2.setOnDragDropped(this::onDragDropped);
    }
    
    @FXML
    private void onDragDetected(MouseEvent event) {
        if (event.getSource() instanceof HBox) {
            HBox dragged = (HBox) event.getSource();
            rotationAngle = dragged.getRotate();
            Dragboard dragboard = dragged.startDragAndDrop(TransferMode.MOVE);
            ClipboardContent content = new ClipboardContent();
            content.putString("HBox");
            dragboard.setContent(content);
            event.consume();
        }
    }
    
    @FXML
    private void onMousePressed(MouseEvent event) {
        if (event.getSource() instanceof HBox) {
            HBox dragged = (HBox) event.getSource();
            dragged.startFullDrag();
            event.consume();
        }
    }
    
    @FXML
    private void onMouseDragged(MouseEvent event) {
        if (event.getSource() instanceof HBox) {
            HBox dragged = (HBox) event.getSource();
            dragged.setTranslateX(event.getSceneX());
            dragged.setTranslateY(event.getSceneY());
            event.consume();
        }
    }
    
    @FXML
    private void onMouseReleased(MouseEvent event){
        if (event.getSource() instanceof HBox && event.getTarget() instanceof GridPane) {
            HBox dragged = (HBox) event.getSource();
            GridPane targetGrid = (GridPane) event.getTarget();

            double cellWidth = targetGrid.getWidth() / targetGrid.getColumnConstraints().size();
            double cellHeight = targetGrid.getHeight() / targetGrid.getRowConstraints().size();

            int column = (int) (event.getX() / cellWidth);
            int row = (int) (event.getY() / cellHeight);

            targetGrid.add(dragged, column, row);

            event.consume();
        }
    }
    
    private void onDragOver(DragEvent event) {
        if (event.getGestureSource() != event.getSource() && event.getDragboard().hasString()) {
            event.acceptTransferModes(TransferMode.MOVE);
        }
        event.consume();
    }
    
    private void onDragDropped(DragEvent event) {
        if (event.getGestureSource() != event.getTarget() && event.getTarget() instanceof GridPane) {
            int shipLengthCount=0;
            boolean notEmpty = false;
            
            GridPane targetGrid = (GridPane) event.getTarget();

            HBox draggedHBox = (HBox) event.getGestureSource();

            for (Node node : draggedHBox.getChildren()) {
                shipLengthCount++;
            }

            double cellWidth = targetGrid.getWidth() / targetGrid.getColumnConstraints().size();
            double cellHeight = targetGrid.getHeight() / targetGrid.getRowConstraints().size();
            
            int column = (int) (event.getX() / cellWidth);
            int row = (int) (event.getY() / cellHeight);
            if(event.getTarget()==boardP1){
                if(rotationAngle == 0){
                    for(int i=column;i<boardCheckP1.length && i<column+shipLengthCount;i++){
                        if(i==column){
                            if(i-1>=0){
                                if(boardCheckP1[i-1][row] == true){
                                    notEmpty=true;
                                }
                            }
                            if(row-1>=0){
                                if(boardCheckP1[i][row-1] == true){
                                    notEmpty=true;
                                }
                            }
                            if(row+1<=targetGrid.getRowConstraints().size()-1){
                                if(boardCheckP1[i][row+1] == true){
                                    notEmpty=true;
                                }
                            }
                        }
                        else if(i==column+shipLengthCount){
System.out.println("Fin");
                            if(i+1<targetGrid.getColumnConstraints().size() || row-1>=0 && row+1<targetGrid.getRowConstraints().size()){
System.out.println("Fin 1");
                                if(boardCheckP1[i][row] == true || boardCheckP1[i+1][row] == true || boardCheckP1[i][row-1] == true || boardCheckP1[i][row+1] == true){
System.out.println("Fin 2");
                                    notEmpty=true;
                                }
                            }
                        }
                        else if(row-1>=0 && row+1<targetGrid.getRowConstraints().size()){
System.out.println("Medio");
                            if(boardCheckP1[i][row] == true || boardCheckP1[i][row-1] == true || boardCheckP1[i][row+1] == true){
System.out.println("Medio 1");
                                notEmpty=true;
                            }
                        }
                    }
                }
                else{
                    for(int i=row;i<boardCheckP1.length && i<row+shipLengthCount;i++){
                        if(boardCheckP1[column][i] == true){
                            notEmpty=true;
                        }
                    }
                }
            }
            else{
                if(rotationAngle == 0){
                    for(int i=column;i<boardCheckP2.length && i<column+shipLengthCount;i++){
                        if(boardCheckP2[i][row] == true){
                            notEmpty=true;
                        }
                    }
                }
                else{
                    for(int i=row;i<boardCheckP2.length && i<row+shipLengthCount;i++){
                        if(boardCheckP2[column][i] == true){
                            notEmpty=true;
                        }
                    }
                }
            }
            
            
            if(rotationAngle == 0){
                if(column+shipLengthCount<=targetGrid.getRowConstraints().size() && !notEmpty){
                    for (Node node : draggedHBox.getChildren()) {
                        if (node instanceof ImageView) {
                            ImageView imageView = (ImageView) node;
                            ImageView newImageView = new ImageView(imageView.getImage());
                            newImageView.setFitWidth(imageView.getFitWidth());
                            newImageView.setFitHeight(imageView.getFitHeight());
                            targetGrid.add(newImageView, column, row);
                            if(event.getTarget()==boardP1){
                                boardCheckP1[column][row]=true;
                            }
                            else{
                                boardCheckP2[column][row]=true;
                            }
                            column++;
                        }
                    }
                    ((Pane) draggedHBox.getParent()).getChildren().remove(draggedHBox);
                }
            }
            else{
                if(row+shipLengthCount<=targetGrid.getRowConstraints().size() && !notEmpty){
                    for (Node node : draggedHBox.getChildren()) {
                        if (node instanceof ImageView) {
                            ImageView imageView = (ImageView) node;
                            ImageView newImageView = new ImageView(imageView.getImage());
                            newImageView.setFitWidth(imageView.getFitWidth());
                            newImageView.setFitHeight(imageView.getFitHeight());
                            newImageView.setRotate(90);
                            targetGrid.add(newImageView, column, row);
                            if(event.getTarget()==boardP1){
                                boardCheckP1[column][row]=true;
                            }
                            else{
                                boardCheckP2[column][row]=true;
                            }
                            row++;
                        }
                    }
                    ((Pane) draggedHBox.getParent()).getChildren().remove(draggedHBox);
                }
            }
            
            event.setDropCompleted(true);
            event.consume();
        }
    }
    
    @FXML
    private void rotateKeyPressed(KeyEvent event) {
        if (event.getCode() == KeyCode.R) {
            if(shipLength1.getRotate() == 0){
                shipLength1.setRotate(90);
            }
            else{
                shipLength1.setRotate(0);
            }
            
            if(shipLength2.getRotate() == 0){
                shipLength2.setRotate(90);
            }
            else{
                shipLength2.setRotate(0);
            }
            
            if(shipLength3.getRotate() == 0){
                shipLength3.setRotate(90);
            }
            else{
                shipLength3.setRotate(0);
            }
            
            if(shipLength4.getRotate() == 0){
                shipLength4.setRotate(90);
            }
            else{
                shipLength4.setRotate(0);
            }
            
            if(shipLength5.getRotate() == 0){
                shipLength5.setRotate(90);
            }
            else{
                shipLength5.setRotate(0);
            }
        }
    }
}
