package game;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Objects;

public class Game extends Application {
    @Override
    public void start(Stage stage) throws Exception {        
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Scenes/Settings.fxml")));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
