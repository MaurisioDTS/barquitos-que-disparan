package game;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.media.AudioClip;

public class ViewController implements Initializable {
    @FXML
    public Button button;
    @FXML
    private Label label;
    @FXML
    ProgressBar progress = new ProgressBar(0.0);
    //AudioClip intro = new AudioClip("res/audio/test.mp3");

    @FXML

    // 5 horas y 47 minutos para esta mierda que nisiquiera funciona bien.

    private void handleButtonAction(ActionEvent Event) throws Exception {
        System.out.println("y pa activar a lo anormale");
        button.setVisible(false);
        progress.setVisible(true);

         for (double i : new double[]{0.25, 0.5, 0.75,1.0}) {
             Thread.sleep(1000);
             progress.setProgress(i);
         }
        /*for(double i=1.0;i>0.0;i=i-0.1){

            System.out.println(progress.getOpacity());
            progress.setOpacity(i);
            Thread.sleep(1000);
        }*/

        label.setText("Barquitos que disparan!!1!1!!!!");
        //intro.play();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
