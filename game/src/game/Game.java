package game;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Game extends Application {
    @Override
    public void start(Stage stage) throws Exception {   
        
//    // loaders
//    
        FXMLLoader viewLoader = new FXMLLoader(getClass().getResource("Scenes/View.fxml"));
        Parent root = viewLoader.load();
        Scene scene = new Scene(root);
        
        Scene main=new Scene(root);
//
//        
//        FXMLLoader loginLoader = new FXMLLoader(getClass().getResource("Scenes/Login.fxml"));
//        Parent login = loginLoader.load();
//        Scene loginScene = new Scene(login);
//
//        FXMLLoader profileLoader = new FXMLLoader(getClass().getResource("Scenes/Profile.fxml"));
//        Parent profile = profileLoader.load();
//        Scene profileScene = new Scene(profile);
//
//        FXMLLoader boardLoader = new FXMLLoader(getClass().getResource("Scenes/Board.fxml"));
//        Parent board = boardLoader.load();
//        Scene boardScene = new Scene(board);
//        
//    // injects
//        
//        ViewController viewPaneController = (ViewController) viewLoader.getController();
//        viewPaneController.setLoginScene(loginScene);   // toLogin
//
//        
//        LoginController loginPaneController = (LoginController) loginLoader.getController();
//        loginPaneController.setTittleScene(scene);  // returnToTittle
//        loginPaneController.setProfileScene(profileScene);  //toProfile
//
//        ProfileController profilePaneController = (ProfileController) profileLoader.getController();
//        profilePaneController.setTittleScene(scene);  // returnToTittle
//        profilePaneController.setBoardScene(boardScene);  //toBoard
//
//        BoardController boardPaneController = (BoardController) boardLoader.getController();
//        boardPaneController.setTittleScene(scene);  // returnToTittle

        //display scene
        
        stage.setScene(scene);
        ViewController.giveStage(stage);
        stage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
