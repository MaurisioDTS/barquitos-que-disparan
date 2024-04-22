
package game;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

public class BoardShips implements Initializable {
    
    static String player1,player2;

    static String getPlayer1() {return player1;}

    static String getPlayer2() {return player2;}
    @Override
    public void initialize(URL url,ResourceBundle r){
        player1=BoardShips.getPlayer1();
        player2=BoardShips.getPlayer2();
    }
}
