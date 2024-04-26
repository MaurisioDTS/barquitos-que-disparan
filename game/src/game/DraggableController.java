
package game;

import game.Objects.Board;
import game.Objects.Ship;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
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
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class DraggableController{

    private static Stage stage = Game.getPrimaryStage();
    
    @FXML
    private GridPane boardP1;
    @FXML
    private GridPane boardP2;
    @FXML
    private HBox shipLength1T1of5P1;
    @FXML
    private HBox shipLength1T1of5P2;
    @FXML
    private HBox shipLength1T2of5P1;
    @FXML
    private HBox shipLength1T2of5P2;
    @FXML
    private HBox shipLength1T3of5P1;
    @FXML
    private HBox shipLength1T3of5P2;
    @FXML
    private HBox shipLength1T4of5P1;
    @FXML
    private HBox shipLength1T4of5P2;
    @FXML
    private HBox shipLength1T5of5P1;
    @FXML
    private HBox shipLength1T5of5P2;
    @FXML
    private HBox shipLength2T1of4P1;
    @FXML
    private HBox shipLength2T1of4P2;
    @FXML
    private HBox shipLength2T2of4P1;
    @FXML
    private HBox shipLength2T2of4P2;
    @FXML
    private HBox shipLength2T3of4P1;
    @FXML
    private HBox shipLength2T3of4P2;
    @FXML
    private HBox shipLength2T4of4P1;
    @FXML
    private HBox shipLength2T4of4P2;
    @FXML
    private HBox shipLength3T1of3P1;
    @FXML
    private HBox shipLength3T1of3P2;
    @FXML
    private HBox shipLength3T2of3P1;
    @FXML
    private HBox shipLength3T2of3P2;
    @FXML
    private HBox shipLength3T3of3P1;
    @FXML
    private HBox shipLength3T3of3P2;
    @FXML
    private HBox shipLength4T1of2P1;
    @FXML
    private HBox shipLength4T1of2P2;
    @FXML
    private HBox shipLength4T2of2P1;
    @FXML
    private HBox shipLength4T2of2P2;
    @FXML
    private HBox shipLength5T1of1P1;
    @FXML
    private HBox shipLength5T1of1P2;
    @FXML
    private DraggableMaker draggableMaker;
    @FXML
    private ImageView shipDirection;
    @FXML
    private Button readyP1;
    @FXML
    private Button readyP2;
    @FXML
    private Button playButton;
    @FXML
    private Rectangle player1R;
    @FXML
    private Rectangle player2R;
    
    private boolean [][] boardCheckP1 = new boolean[10][10];
    
    private boolean [][] boardCheckP2 = new boolean[10][10];
    
    private boolean p1Ready=false;
    
    private boolean p2Ready=false;
    
    private String shipType;
    
    private int totalP1=0;
    
    private int totalP2=0;
    
    private double rotationAngle = 0.0;

    Board brd=new Board("elpepe");
    
    // changes in scene
    
    public void reset(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Scenes/BoardShips.fxml"));
        stage.getScene().setRoot(root);
        stage.show();
    }
    
    public void readyP1(ActionEvent event){
        player1R.setVisible(true);
        readyP1.setVisible(false);
        p1Ready=true;
        if(p1Ready && p2Ready){
            playButton.setVisible(true);
        }
    }
    
    public void readyP2(ActionEvent event){
        player2R.setVisible(true);
        readyP2.setVisible(false);
        p2Ready=true;
        if(p1Ready && p2Ready){
            playButton.setVisible(true);
        }
    }
    
    public void rtn(ActionEvent a) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Scenes/Profile.fxml"));
        stage.getScene().setRoot(root);
        stage.show();
    }
    public void board(ActionEvent a) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Scenes/Board.fxml"));
        
        BoardController.brd1Ships=totalP2;
        BoardController.brd2Ships=totalP1;
        stage.getScene().setRoot(root);
        stage.show();
    }
    
    // Ships and Grids
    
    @FXML
    public void initialize() {
        draggableMaker = new DraggableMaker();
        draggableMaker.makeDraggable(shipLength1T1of5P1);
        draggableMaker.makeDraggable(shipLength1T1of5P2);
        draggableMaker.makeDraggable(shipLength1T2of5P1);
        draggableMaker.makeDraggable(shipLength1T2of5P2);
        draggableMaker.makeDraggable(shipLength1T3of5P1);
        draggableMaker.makeDraggable(shipLength1T3of5P2);
        draggableMaker.makeDraggable(shipLength1T4of5P1);
        draggableMaker.makeDraggable(shipLength1T4of5P2);
        draggableMaker.makeDraggable(shipLength1T5of5P1);
        draggableMaker.makeDraggable(shipLength1T5of5P2);
        draggableMaker.makeDraggable(shipLength2T1of4P1);
        draggableMaker.makeDraggable(shipLength2T1of4P2);
        draggableMaker.makeDraggable(shipLength2T2of4P1);
        draggableMaker.makeDraggable(shipLength2T2of4P2);
        draggableMaker.makeDraggable(shipLength2T3of4P1);
        draggableMaker.makeDraggable(shipLength2T3of4P2);
        draggableMaker.makeDraggable(shipLength2T4of4P1);
        draggableMaker.makeDraggable(shipLength2T4of4P2);
        draggableMaker.makeDraggable(shipLength3T1of3P1);
        draggableMaker.makeDraggable(shipLength3T1of3P2);
        draggableMaker.makeDraggable(shipLength3T2of3P1);
        draggableMaker.makeDraggable(shipLength3T2of3P2);
        draggableMaker.makeDraggable(shipLength3T3of3P1);
        draggableMaker.makeDraggable(shipLength3T3of3P2);
        draggableMaker.makeDraggable(shipLength4T1of2P1);
        draggableMaker.makeDraggable(shipLength4T1of2P2);
        draggableMaker.makeDraggable(shipLength4T2of2P1);
        draggableMaker.makeDraggable(shipLength4T2of2P2);
        draggableMaker.makeDraggable(shipLength5T1of1P1);
        draggableMaker.makeDraggable(shipLength5T1of1P2);
        
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
            
            //Type of ship
            
            if(shipLengthCount==1){
                shipType="boat";
            }
            else if(shipLengthCount==2){
                shipType="armored boat";
            }
            else if(shipLengthCount==3){
                shipType="armed ship";
            }
            else if(shipLengthCount==4){
                shipType="battleship";
            }
            else{
                shipType="aircraft carrier";
            }
            
            //Check ship colisions and positions
            //Player 1
            
            if(event.getTarget()==boardP1){
                
                //Horizontal
                
                if(shipDirection.getRotate() == 0){
                    for(int i=column;i<boardCheckP1.length && i<column+shipLengthCount;i++){
                        
                        //First ship part
                        
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
                            if(boardCheckP1[i][row] == true){
                                notEmpty=true;
                            }
                            if(shipLengthCount==1 && i+1<=targetGrid.getColumnConstraints().size()-1){
                                if(boardCheckP1[i+1][row] == true){
                                    notEmpty=true;
                                }
                            }
                            BoardController.brd1.insertShip(shipType,shipLengthCount,column,row,true);
                            totalP1++;
                        }
                        
                        //Last ship part
                        
                        else if(i==column+shipLengthCount-1){
                            if(i+1<targetGrid.getColumnConstraints().size()-1){
                                if(boardCheckP1[i+1][row] == true){
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
                            if(boardCheckP1[i][row] == true){
                                notEmpty=true;
                            }
                            totalP1++;
                        }
                        
                        //Midle ship part
                        
                        else{
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
                            if(boardCheckP1[i][row] == true){
                                notEmpty=true;
                            }
                            totalP1++;
                        }
                    }
                }
                
                //Vertical
                
                else{
                    for(int i=row;i<boardCheckP1.length && i<row+shipLengthCount;i++){
                        
                        //First ship part
                        
                        if(i==row){
                            if(i-1>=0){
                                if(boardCheckP1[column][i-1] == true){
                                    notEmpty=true;
                                }
                            }
                            if(column-1>=0){
                                if(boardCheckP1[column-1][i] == true){
                                    notEmpty=true;
                                }
                            }
                            if(column+1<=targetGrid.getRowConstraints().size()-1){
                                if(boardCheckP1[column+1][i] == true){
                                    notEmpty=true;
                                }
                            }
                            if(boardCheckP1[column][i] == true){
                                notEmpty=true;
                            }
                            if(shipLengthCount==1 && i+1<=targetGrid.getRowConstraints().size()-1){
                                if(boardCheckP1[column][i+1] == true){
                                    notEmpty=true;
                                }
                            }
                            BoardController.brd1.insertShip(shipType,shipLengthCount,column,row,false);
                            totalP1++;
                        }
                        
                        //Last ship part
                        
                        else if(i==row+shipLengthCount-1){
                            if(i+1<targetGrid.getColumnConstraints().size()-1){
                                if(boardCheckP1[column][i+1] == true){
                                    notEmpty=true;
                                }
                            }
                            if(column-1>=0){
                                if(boardCheckP1[column-1][i] == true){
                                    notEmpty=true;
                                }
                            }
                            if(column+1<=targetGrid.getRowConstraints().size()-1){
                                if(boardCheckP1[column+1][i] == true){
                                    notEmpty=true;
                                }
                            }
                            if(boardCheckP1[column][i] == true){
                                notEmpty=true;
                            }
                            totalP1++;
                        }
                        
                        //Midle ship part
                        
                        else{
                            if(column-1>=0){
                                if(boardCheckP1[column-1][i] == true){
                                    notEmpty=true;
                                }
                            }
                            if(column+1<=targetGrid.getRowConstraints().size()-1){
                                if(boardCheckP1[column+1][i] == true){
                                    notEmpty=true;
                                }
                            }
                            if(boardCheckP1[column][i] == true){
                                notEmpty=true;
                            }
                            totalP1++;
                        }
                    }
                }
            }
            
            //Player 2
            
            else{
                
                //Horizontal
                
                if(shipDirection.getRotate() == 0){
                    for(int i=column;i<boardCheckP2.length && i<column+shipLengthCount;i++){
                        
                        //First ship part
                        
                        if(i==column){
                            if(i-1>=0){
                                if(boardCheckP2[i-1][row] == true){
                                    notEmpty=true;
                                }
                            }
                            if(row-1>=0){
                                if(boardCheckP2[i][row-1] == true){
                                    notEmpty=true;
                                }
                            }
                            if(row+1<=targetGrid.getRowConstraints().size()-1){
                                if(boardCheckP2[i][row+1] == true){
                                    notEmpty=true;
                                }
                            }
                            if(boardCheckP2[i][row] == true){
                                notEmpty=true;
                            }
                            if(shipLengthCount==1 && i+1<=targetGrid.getColumnConstraints().size()-1){
                                if(boardCheckP2[i+1][row] == true){
                                    notEmpty=true;
                                }
                            }
                            BoardController.brd2.insertShip(shipType,shipLengthCount,column,row,true);
                            totalP2++;
                        }
                        
                        //Last ship part
                        
                        else if(i==column+shipLengthCount-1){
                            if(i+1<targetGrid.getColumnConstraints().size()-1){
                                if(boardCheckP2[i+1][row] == true){
                                    notEmpty=true;
                                }
                            }
                            if(row-1>=0){
                                if(boardCheckP2[i][row-1] == true){
                                    notEmpty=true;
                                }
                            }
                            if(row+1<=targetGrid.getRowConstraints().size()-1){
                                if(boardCheckP2[i][row+1] == true){
                                    notEmpty=true;
                                }
                            }
                            if(boardCheckP2[i][row] == true){
                                notEmpty=true;
                            }
                            totalP2++;
                        }
                        
                        //Midle ship part
                        
                        else{
                            if(row-1>=0){
                                if(boardCheckP2[i][row-1] == true){
                                    notEmpty=true;
                                }
                            }
                            if(row+1<=targetGrid.getRowConstraints().size()-1){
                                if(boardCheckP2[i][row+1] == true){
                                    notEmpty=true;
                                }
                            }
                            if(boardCheckP2[i][row] == true){
                                notEmpty=true;
                            }
                            totalP2++;
                        }
                    }
                }
                
                //Vertical
                
                else{
                    for(int i=row;i<boardCheckP2.length && i<row+shipLengthCount;i++){
                        
                        //First ship part
                        
                        if(i==row){
                            if(i-1>=0){
                                if(boardCheckP2[column][i-1] == true){
                                    notEmpty=true;
                                }
                            }
                            if(column-1>=0){
                                if(boardCheckP2[column-1][i] == true){
                                    notEmpty=true;
                                }
                            }
                            if(column+1<=targetGrid.getRowConstraints().size()-1){
                                if(boardCheckP2[column+1][i] == true){
                                    notEmpty=true;
                                }
                            }
                            if(boardCheckP2[column][i] == true){
                                notEmpty=true;
                            }
                            if(shipLengthCount==1 && i+1<=targetGrid.getRowConstraints().size()-1){
                                if(boardCheckP2[column][i+1] == true){
                                    notEmpty=true;
                                }
                            }
                            BoardController.brd2.insertShip(shipType,shipLengthCount,column,row,false);
                            totalP2++;
                        }
                        
                        //Last ship part
                        
                        else if(i==row+shipLengthCount-1){
                            if(i+1<targetGrid.getColumnConstraints().size()-1){
                                if(boardCheckP2[column][i+1] == true){
                                    notEmpty=true;
                                }
                            }
                            if(column-1>=0){
                                if(boardCheckP2[column-1][i] == true){
                                    notEmpty=true;
                                }
                            }
                            if(column+1<=targetGrid.getRowConstraints().size()-1){
                                if(boardCheckP2[column+1][i] == true){
                                    notEmpty=true;
                                }
                            }
                            if(boardCheckP2[column][i] == true){
                                notEmpty=true;
                            }
                            totalP2++;
                        }
                        
                        //Midle ship part
                        
                        else{
                            if(column-1>=0){
                                if(boardCheckP2[column-1][i] == true){
                                    notEmpty=true;
                                }
                            }
                            if(column+1<=targetGrid.getRowConstraints().size()-1){
                                if(boardCheckP1[column+1][i] == true){
                                    notEmpty=true;
                                }
                            }
                            if(boardCheckP2[column][1] == true){
                                notEmpty=true;
                            }
                            totalP2++;
                        }
                    }
                }
            }
            
            //Moves ships between gridpanes
            
            if(shipDirection.getRotate() == 0){
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
            if(shipDirection.getRotate() == 0){
                shipDirection.setRotate(90);
            }
            else{
                shipDirection.setRotate(0);
            }
        }
    }
}
