
package game;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DraggableController implements Initializable{
    
    private Stage stage;
    private Scene title;
    private Scene board;
    private Scene profile;
    
     public void setTittleScene(Scene scene){title=scene;}
    public void setBoardScene(Scene scene){board=scene;}
    
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
