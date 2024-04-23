import javafx.scene.Node;
import javafx.scene.input.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

class putamierda {

    private double mouseAnchorX;
    private double mouseAnchorY;

    public void makeDraggable(HBox h){
        h.setOnDragDetected((MouseEvent event) -> {
            //We want the textArea to be dragged. Could also be copied.
            Dragboard db = h.startDragAndDrop(TransferMode.MOVE);

            // Put a string on a dragboard as an identifier
            ClipboardContent content = new ClipboardContent();
            content.putString(h.getId());
            db.setContent(content);

            //Consume the event
            event.consume();
        });
    }
    public void makeDroppable(GridPane g){
        g.addEventHandler(DragEvent.DRAG_OVER, (DragEvent event) -> {
            if (event.getGestureSource() != g
                    && event.getDragboard().hasString()) {
                event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
            }
            event.consume();
        });
        g.addEventHandler(DragEvent.DRAG_DROPPED, (DragEvent event) -> {
            //Get the dragboard back
            Dragboard db = event.getDragboard();
            boolean success = false;
            Node n=event.getPickResult().getIntersectedNode();
            //Could have some more thorough checks of course.
            if (db.hasString()) {
                //Get the textarea and place it into flowPane2 instead
                g.add(n,1,1);
                success = true;
            }
            //Complete and consume the event.
            event.setDropCompleted(success);
            event.consume();
        });
//        n.setOnDragOver(event -> {System.out.println("On drag over.");
//            //data is dragged over to target
//            //accept it only if it is not dragged from the same node
//            //and if it has image data
//            if(event.getGestureSource() != n && event.getDragboard().hasString()){
//                //allow for moving
//                event.acceptTransferModes(TransferMode.MOVE);
//            }
//            event.consume();
//        });
//        n.setOnDragDone(event -> {System.out.println("on drag done");
//            if(event.getTransferMode() == TransferMode.MOVE){
//                n.setVisible(false);}
//            event.consume();
//        });
//        n.setOnDragDropped(event -> {
//            //Get the dragboard back
//            Dragboard db = event.getDragboard();
//            boolean success = false;
//            Node node = event.getPickResult().getIntersectedNode();
//            //Could have some more thorough checks of course.
//            if (node != n && db.hasString()) {
//                Integer cIndex = GridPane.getColumnIndex(n);
//                Integer rIndex = GridPane.getRowIndex(n);
//                int x = cIndex == null ? 0 : cIndex;
//                int y = rIndex == null ? 0 : rIndex;
//                n.add(node,x,y);
//                success = true;
//                System.out.println(x + ", " + y);
//            }
//            //Complete and consume the event.
//            event.setDropCompleted(success);
//            event.consume();
//        });

    }
}


//    public void makeDraggable(Node node){
//        node.setOnMousePressed(mouseEvent -> {
//            mouseAnchorX = mouseEvent.getX();
//            mouseAnchorY = mouseEvent.getY();
//        });
//
//        node.setOnMouseDragged(mouseEvent -> {
//            node.setLayoutX(mouseEvent.getSceneX() - mouseAnchorX);
//            node.setLayoutY(mouseEvent.getSceneY() - mouseAnchorY);
//        });
