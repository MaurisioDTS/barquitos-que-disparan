package game;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BoardControllerTest implements Initializable {
    
    private static Stage stage;
    private static Scene title;
    private static Scene profile;
    
    public void giveStage(Stage Stage){stage=Stage;}
    public void setTittleScene(Scene scene){title=scene;}
    
    Board board=new Board("elpepe");
    
    Ship elpepe=new Ship("portaaviones",5,0,0);
    Ship two=new Ship("buque de telepata de guerra",4,0,1);
    Ship thr=new Ship("submarino no sumergible",3,0,2);
    Ship fou=new Ship("el yate de hijacked",2,0,3);
    Ship fiv=new Ship("lancha de poliester",1,0,4);
    
    System.out.println(elpepe.toString());
    
    @Override
    public void initialize(URL url, ResourceBundle rb){
    }
}
