
package game;

import game.Objects.Board;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DraggableController implements Initializable{
    
    private static Stage stage;
    private Scene title;
    private Scene board;
    private Scene profile;
    
    public static void giveStage(Stage Stage){stage=Stage;}
    public void setBoardScene(Scene scene){board=scene;}
    public void setProfileScene(Scene scene){profile=scene;}

    
    @FXML
    private Rectangle shipLength5;
    private Rectangle shipLength4;
    private Rectangle shipLength3;
    private Rectangle shipLength2;
    private Rectangle shipLength1;
    
    DraggableMaker draggableMaker = new DraggableMaker();
    
    Board brd=new Board("elpepe");
    
    @FXML
    public void rtn(ActionEvent a){
        Stage stage = (Stage)((Node)a.getSource()).getScene().getWindow();
        stage.setScene(profile);
    }
    public void board(ActionEvent a){
        Stage stage = (Stage)((Node)a.getSource()).getScene().getWindow();
        stage.setScene(board);
    }
     /**
        A
    **/
    @FXML
    public void a1(ActionEvent Event){
        brd.checkCheck(0,0);}
    @FXML
    public void a2(ActionEvent Event){
        brd.checkCheck(0,1);}
    @FXML
    public void a3(ActionEvent Event){
        brd.checkCheck(0,2);}
    @FXML
    public void a4(ActionEvent Event){
        brd.checkCheck(0,3);}
    @FXML
    public void a5(ActionEvent Event){
        brd.checkCheck(0,4);}
    @FXML
    public void a6(ActionEvent Event){
        brd.checkCheck(0,5);}
    @FXML
    public void a7(ActionEvent Event){
        brd.checkCheck(0,6);}
    @FXML
    public void a8(ActionEvent Event){
        brd.checkCheck(0,7);}
    @FXML
    public void a9(ActionEvent Event){
        brd.checkCheck(0,8);}
    @FXML
    public void a10(ActionEvent Event){
        brd.checkCheck(0,9);}
    /**
        B
    **/
    @FXML
    public void b1(ActionEvent Event){
        brd.checkCheck(1,0);}
    @FXML
    public void b2(ActionEvent Event){
        brd.checkCheck(1,1);}
    @FXML
    public void b3(ActionEvent Event){
        brd.checkCheck(1,2);}
    @FXML
    public void b4(ActionEvent Event){
        brd.checkCheck(1,3);}
    @FXML
    public void b5(ActionEvent Event){
        brd.checkCheck(1,4);}
    @FXML
    public void b6(ActionEvent Event){
        brd.checkCheck(1,5);}
    @FXML
    public void b7(ActionEvent Event){
        brd.checkCheck(1,6);}
    @FXML
    public void b8(ActionEvent Event){
        brd.checkCheck(1,7);}
    @FXML
    public void b9(ActionEvent Event){
        brd.checkCheck(1,8);}
    @FXML
    public void b10(ActionEvent Event){
        brd.checkCheck(1,9);}
    /**
        C
    **/
    @FXML
    public void c1(ActionEvent Event){
        brd.checkCheck(2,0);}
    @FXML
    public void c2(ActionEvent Event){
        brd.checkCheck(2,1);}
    @FXML
    public void c3(ActionEvent Event){
        brd.checkCheck(2,2);}
    @FXML
    public void c4(ActionEvent Event){
        brd.checkCheck(2,3);}
    @FXML
    public void c5(ActionEvent Event){
        brd.checkCheck(2,4);}
    @FXML
    public void c6(ActionEvent Event){
        brd.checkCheck(2,5);}
    @FXML
    public void c7(ActionEvent Event){
        brd.checkCheck(2,6);}
    @FXML
    public void c8(ActionEvent Event){
        brd.checkCheck(2,7);}
    @FXML
    public void c9(ActionEvent Event){
        brd.checkCheck(2,8);}
    @FXML
    public void c10(ActionEvent Event){
        brd.checkCheck(2,9);}
     /**
        D
    **/
    @FXML
    public void d1(ActionEvent Event){
        brd.checkCheck(3,0);}
    @FXML
    public void d2(ActionEvent Event){
        brd.checkCheck(3,1);}
    @FXML
    public void d3(ActionEvent Event){
        brd.checkCheck(3,2);}
    @FXML
    public void d4(ActionEvent Event){
        brd.checkCheck(3,3);}
    @FXML
    public void d5(ActionEvent Event){
        brd.checkCheck(3,4);}
    @FXML
    public void d6(ActionEvent Event){
        brd.checkCheck(3,5);}
    @FXML
    public void d7(ActionEvent Event){
        brd.checkCheck(3,6);}
    @FXML
    public void d8(ActionEvent Event){
        brd.checkCheck(3,7);}
    @FXML
    public void d9(ActionEvent Event){
        brd.checkCheck(3,8);}
    @FXML
    public void d10(ActionEvent Event){
        brd.checkCheck(3,9);}
    /**
        E
    **/
    @FXML
    public void e1(ActionEvent Event){
        brd.checkCheck(4,0);}
    @FXML
    public void e2(ActionEvent Event){
        brd.checkCheck(4,1);}
    @FXML
    public void e3(ActionEvent Event){
        brd.checkCheck(4,2);}
    @FXML
    public void e4(ActionEvent Event){
        brd.checkCheck(4,3);}
    @FXML
    public void e5(ActionEvent Event){
        brd.checkCheck(4,4);}
    @FXML
    public void e6(ActionEvent Event){
        brd.checkCheck(4,5);}
    @FXML
    public void e7(ActionEvent Event){
        brd.checkCheck(4,6);}
    @FXML
    public void e8(ActionEvent Event){
        brd.checkCheck(4,7);}
    @FXML
    public void e9(ActionEvent Event){
        brd.checkCheck(4,8);}
    @FXML
    public void e10(ActionEvent Event){
        brd.checkCheck(4,9);}
    /**
        F
    **/
    @FXML
    public void f1(ActionEvent Event){
        brd.checkCheck(5,0);}
    @FXML
    public void f2(ActionEvent Event){
        brd.checkCheck(5,1);}
    @FXML
    public void f3(ActionEvent Event){
        brd.checkCheck(5,2);}
    @FXML
    public void f4(ActionEvent Event){
        brd.checkCheck(5,3);}
    @FXML
    public void f5(ActionEvent Event){
        brd.checkCheck(5,4);}
    @FXML
    public void f6(ActionEvent Event){
        brd.checkCheck(5,5);}
    @FXML
    public void f7(ActionEvent Event){
        brd.checkCheck(5,6);}
    @FXML
    public void f8(ActionEvent Event){
        brd.checkCheck(5,7);}
    @FXML
    public void f9(ActionEvent Event){
        brd.checkCheck(5,8);}
    @FXML
    public void f10(ActionEvent Event){
        brd.checkCheck(5,9);}
    /**
        G
    **/
    @FXML
    public void g1(ActionEvent Event){
        brd.checkCheck(6,0);}
    @FXML
    public void g2(ActionEvent Event){
        brd.checkCheck(6,1);}
    @FXML
    public void g3(ActionEvent Event){
        brd.checkCheck(6,2);}
    @FXML
    public void g4(ActionEvent Event){
        brd.checkCheck(6,3);}
    @FXML
    public void g5(ActionEvent Event){
        brd.checkCheck(6,4);}
    @FXML
    public void g6(ActionEvent Event){
        brd.checkCheck(6,5);}
    @FXML
    public void g7(ActionEvent Event){
        brd.checkCheck(6,6);}
    @FXML
    public void g8(ActionEvent Event){
        brd.checkCheck(6,7);}
    @FXML
    public void g9(ActionEvent Event){
        brd.checkCheck(6,8);}
    @FXML
    public void g10(ActionEvent Event){
        brd.checkCheck(6,9);}
     /**
        H
    **/
    @FXML
    public void h1(ActionEvent Event){
        brd.checkCheck(7,0);}
    @FXML
    public void h2(ActionEvent Event){
        brd.checkCheck(7,1);}
    @FXML
    public void h3(ActionEvent Event){
        brd.checkCheck(7,2);}
    @FXML
    public void h4(ActionEvent Event){
        brd.checkCheck(7,3);}
    @FXML
    public void h5(ActionEvent Event){
        brd.checkCheck(7,4);}
    @FXML
    public void h6(ActionEvent Event){
        brd.checkCheck(7,5);}
    @FXML
    public void h7(ActionEvent Event){
        brd.checkCheck(7,6);}
    @FXML
    public void h8(ActionEvent Event){
        brd.checkCheck(7,7);}
    @FXML
    public void h9(ActionEvent Event){
        brd.checkCheck(7,8);}
    @FXML
    public void h10(ActionEvent Event){
        brd.checkCheck(7,9);}
    /**
        I
    **/
    @FXML
    public void i1(ActionEvent Event){
        brd.checkCheck(8,0);}
    @FXML
    public void i2(ActionEvent Event){
        brd.checkCheck(8,1);}
    @FXML
    public void i3(ActionEvent Event){
        brd.checkCheck(8,2);}
    @FXML
    public void i4(ActionEvent Event){
        brd.checkCheck(8,3);}
    @FXML
    public void i5(ActionEvent Event){
        brd.checkCheck(8,4);}
    @FXML
    public void i6(ActionEvent Event){
        brd.checkCheck(8,5);}
    @FXML
    public void i7(ActionEvent Event){
        brd.checkCheck(8,6);}
    @FXML
    public void i8(ActionEvent Event){
        brd.checkCheck(8,7);}
    @FXML
    public void i9(ActionEvent Event){
        brd.checkCheck(8,8);}
     @FXML
    public void i10(ActionEvent Event){
        brd.checkCheck(8,9);}
    /**
        J
    **/
    @FXML
    public void j1(ActionEvent Event){
        brd.checkCheck(9,0);}
    @FXML
    public void j2(ActionEvent Event){
        brd.checkCheck(9,1);}
    @FXML
    public void j3(ActionEvent Event){
        brd.checkCheck(9,2);}
    @FXML
    public void j4(ActionEvent Event){
        brd.checkCheck(9,3);}
    @FXML
    public void j5(ActionEvent Event){
        brd.checkCheck(9,4);}
    @FXML
    public void j6(ActionEvent Event){
        brd.checkCheck(9,5);}
    @FXML
    public void j7(ActionEvent Event){
        brd.checkCheck(9,6);}
    @FXML
    public void j8(ActionEvent Event){
        brd.checkCheck(9,7);}
    @FXML
    public void j9(ActionEvent Event){
        brd.checkCheck(9,8);}
    @FXML
    public void j10(ActionEvent Event){
        brd.checkCheck(9,9);}
    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        draggableMaker.makeDraggable(shipLength5);
        draggableMaker.makeDraggable(shipLength4);
        draggableMaker.makeDraggable(shipLength3);
        draggableMaker.makeDraggable(shipLength2);
        draggableMaker.makeDraggable(shipLength1);
    }

    
}
