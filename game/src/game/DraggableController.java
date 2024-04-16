
package game;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import java.net.URL;
import java.util.ResourceBundle;

public class DraggableController implements Initializable{
     @FXML
    private Rectangle shipLength5;
    private Rectangle shipLength4;
    private Rectangle shipLength3;
    private Rectangle shipLength2;
    private Rectangle shipLength1;


    DraggableMaker draggableMaker = new DraggableMaker();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        draggableMaker.makeDraggable(shipLength5);
        draggableMaker.makeDraggable(shipLength4);
        draggableMaker.makeDraggable(shipLength3);
        draggableMaker.makeDraggable(shipLength2);
        draggableMaker.makeDraggable(shipLength1);
    }
}
