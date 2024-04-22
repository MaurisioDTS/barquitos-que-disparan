package game;

import game.Objects.Board;
import java.net.URL;
import java.util.ResourceBundle;

import game.Objects.Ship;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class BoardController implements Initializable{

    private static Stage stage=Game.getPrimaryStage();

    static String player1="elpepe";
    static String player2="etesech";
    public void setPlayer1(String s) {BoardController.player1=s;}
    public void setPlayer2(String s) {BoardController.player2=s;}
    
    @FXML
    GridPane board1=new GridPane();
    @FXML
    GridPane board2=new GridPane();
    @FXML
    Button btn;

    private boolean isPlayer1;


    Board brd1 =new Board(player1);
    Board brd2=new Board(player2);
    
    Ship one=new Ship("portaaviones",5,0,0,false);
    Ship two=new Ship("buque telepata de guerra",4,1,1,false);
    Ship thr=new Ship("submarino no sumergible",3,2,2,false);
    Ship fou=new Ship("el yate de hijacked",2,3,3,false);
    Ship fiv=new Ship("lancha de poliester",1,4,4,false);

    @FXML
    public void button(ActionEvent e){
        Node n = (Node) e.getTarget();
        brd1.checkCheck(0,1);}
    
     /**
        A
    **/
    @FXML
    public void a1(ActionEvent Event){
        if(isPlayer1){brd1.checkCheck(0,0);}
        else{brd2.checkCheck(0,0);}}
    @FXML
    public void a2(ActionEvent Event){
        brd1.checkCheck(0,1);}
    @FXML
    public void a3(ActionEvent Event){
        brd1.checkCheck(0,2);}
    @FXML
    public void a4(ActionEvent Event){
        brd1.checkCheck(0,3);}
    @FXML
    public void a5(ActionEvent Event){
        brd1.checkCheck(0,4);}
    @FXML
    public void a6(ActionEvent Event){
        brd1.checkCheck(0,5);}
    @FXML
    public void a7(ActionEvent Event){
        brd1.checkCheck(0,6);}
    @FXML
    public void a8(ActionEvent Event){
        brd1.checkCheck(0,7);}
    @FXML
    public void a9(ActionEvent Event){
        brd1.checkCheck(0,8);}
    @FXML
    public void a10(ActionEvent Event){
        brd1.checkCheck(0,9);}
    /**
        B
    **/
    @FXML
    public void b1(ActionEvent Event){
        brd1.checkCheck(1,0);}
    @FXML
    public void b2(ActionEvent Event){
        brd1.checkCheck(1,1);}
    @FXML
    public void b3(ActionEvent Event){
        brd1.checkCheck(1,2);}
    @FXML
    public void b4(ActionEvent Event){
        brd1.checkCheck(1,3);}
    @FXML
    public void b5(ActionEvent Event){
        brd1.checkCheck(1,4);}
    @FXML
    public void b6(ActionEvent Event){
        brd1.checkCheck(1,5);}
    @FXML
    public void b7(ActionEvent Event){
        brd1.checkCheck(1,6);}
    @FXML
    public void b8(ActionEvent Event){
        brd1.checkCheck(1,7);}
    @FXML
    public void b9(ActionEvent Event){
        brd1.checkCheck(1,8);}
    @FXML
    public void b10(ActionEvent Event){
        brd1.checkCheck(1,9);}
    /**
        C
    **/
    @FXML
    public void c1(ActionEvent Event){
        brd1.checkCheck(2,0);}
    @FXML
    public void c2(ActionEvent Event){
        brd1.checkCheck(2,1);}
    @FXML
    public void c3(ActionEvent Event){
        brd1.checkCheck(2,2);}
    @FXML
    public void c4(ActionEvent Event){
        brd1.checkCheck(2,3);}
    @FXML
    public void c5(ActionEvent Event){
        brd1.checkCheck(2,4);}
    @FXML
    public void c6(ActionEvent Event){
        brd1.checkCheck(2,5);}
    @FXML
    public void c7(ActionEvent Event){
        brd1.checkCheck(2,6);}
    @FXML
    public void c8(ActionEvent Event){
        brd1.checkCheck(2,7);}
    @FXML
    public void c9(ActionEvent Event){
        brd1.checkCheck(2,8);}
    @FXML
    public void c10(ActionEvent Event){
        brd1.checkCheck(2,9);}
     /**
        D
    **/
    @FXML
    public void d1(ActionEvent Event){
        brd1.checkCheck(3,0);}
    @FXML
    public void d2(ActionEvent Event){
        brd1.checkCheck(3,1);}
    @FXML
    public void d3(ActionEvent Event){
        brd1.checkCheck(3,2);}
    @FXML
    public void d4(ActionEvent Event){
        brd1.checkCheck(3,3);}
    @FXML
    public void d5(ActionEvent Event){
        brd1.checkCheck(3,4);}
    @FXML
    public void d6(ActionEvent Event){
        brd1.checkCheck(3,5);}
    @FXML
    public void d7(ActionEvent Event){
        brd1.checkCheck(3,6);}
    @FXML
    public void d8(ActionEvent Event){
        brd1.checkCheck(3,7);}
    @FXML
    public void d9(ActionEvent Event){
        brd1.checkCheck(3,8);}
    @FXML
    public void d10(ActionEvent Event){
        brd1.checkCheck(3,9);}
    /**
        E
    **/
    @FXML
    public void e1(ActionEvent Event){
        brd1.checkCheck(4,0);}
    @FXML
    public void e2(ActionEvent Event){
        brd1.checkCheck(4,1);}
    @FXML
    public void e3(ActionEvent Event){
        brd1.checkCheck(4,2);}
    @FXML
    public void e4(ActionEvent Event){
        brd1.checkCheck(4,3);}
    @FXML
    public void e5(ActionEvent Event){
        brd1.checkCheck(4,4);}
    @FXML
    public void e6(ActionEvent Event){
        brd1.checkCheck(4,5);}
    @FXML
    public void e7(ActionEvent Event){
        brd1.checkCheck(4,6);}
    @FXML
    public void e8(ActionEvent Event){
        brd1.checkCheck(4,7);}
    @FXML
    public void e9(ActionEvent Event){
        brd1.checkCheck(4,8);}
    @FXML
    public void e10(ActionEvent Event){
        brd1.checkCheck(4,9);}
    /**
        F
    **/
    @FXML
    public void f1(ActionEvent Event){
        brd1.checkCheck(5,0);}
    @FXML
    public void f2(ActionEvent Event){
        brd1.checkCheck(5,1);}
    @FXML
    public void f3(ActionEvent Event){
        brd1.checkCheck(5,2);}
    @FXML
    public void f4(ActionEvent Event){
        brd1.checkCheck(5,3);}
    @FXML
    public void f5(ActionEvent Event){
        brd1.checkCheck(5,4);}
    @FXML
    public void f6(ActionEvent Event){
        brd1.checkCheck(5,5);}
    @FXML
    public void f7(ActionEvent Event){
        brd1.checkCheck(5,6);}
    @FXML
    public void f8(ActionEvent Event){
        brd1.checkCheck(5,7);}
    @FXML
    public void f9(ActionEvent Event){
        brd1.checkCheck(5,8);}
    @FXML
    public void f10(ActionEvent Event){
        brd1.checkCheck(5,9);}
    /**
        G
    **/
    @FXML
    public void g1(ActionEvent Event){
        brd1.checkCheck(6,0);}
    @FXML
    public void g2(ActionEvent Event){
        brd1.checkCheck(6,1);}
    @FXML
    public void g3(ActionEvent Event){
        brd1.checkCheck(6,2);}
    @FXML
    public void g4(ActionEvent Event){
        brd1.checkCheck(6,3);}
    @FXML
    public void g5(ActionEvent Event){
        brd1.checkCheck(6,4);}
    @FXML
    public void g6(ActionEvent Event){
        brd1.checkCheck(6,5);}
    @FXML
    public void g7(ActionEvent Event){
        brd1.checkCheck(6,6);}
    @FXML
    public void g8(ActionEvent Event){
        brd1.checkCheck(6,7);}
    @FXML
    public void g9(ActionEvent Event){
        brd1.checkCheck(6,8);}
    @FXML
    public void g10(ActionEvent Event){
        brd1.checkCheck(6,9);}
     /**
        H
    **/
    @FXML
    public void h1(ActionEvent Event){
        brd1.checkCheck(7,0);}
    @FXML
    public void h2(ActionEvent Event){
        brd1.checkCheck(7,1);}
    @FXML
    public void h3(ActionEvent Event){
        brd1.checkCheck(7,2);}
    @FXML
    public void h4(ActionEvent Event){
        brd1.checkCheck(7,3);}
    @FXML
    public void h5(ActionEvent Event){
        brd1.checkCheck(7,4);}
    @FXML
    public void h6(ActionEvent Event){
        brd1.checkCheck(7,5);}
    @FXML
    public void h7(ActionEvent Event){
        brd1.checkCheck(7,6);}
    @FXML
    public void h8(ActionEvent Event){
        brd1.checkCheck(7,7);}
    @FXML
    public void h9(ActionEvent Event){
        brd1.checkCheck(7,8);}
    @FXML
    public void h10(ActionEvent Event){
        brd1.checkCheck(7,9);}
    /**
        I
    **/
    @FXML
    public void i1(ActionEvent Event){
        brd1.checkCheck(8,0);}
    @FXML
    public void i2(ActionEvent Event){
        brd1.checkCheck(8,1);}
    @FXML
    public void i3(ActionEvent Event){
        brd1.checkCheck(8,2);}
    @FXML
    public void i4(ActionEvent Event){
        brd1.checkCheck(8,3);}
    @FXML
    public void i5(ActionEvent Event){
        brd1.checkCheck(8,4);}
    @FXML
    public void i6(ActionEvent Event){
        brd1.checkCheck(8,5);}
    @FXML
    public void i7(ActionEvent Event){
        brd1.checkCheck(8,6);}
    @FXML
    public void i8(ActionEvent Event){
        brd1.checkCheck(8,7);}
    @FXML
    public void i9(ActionEvent Event){
        brd1.checkCheck(8,8);}
     @FXML
    public void i10(ActionEvent Event){
        brd1.checkCheck(8,9);}
    /**
        J
    **/
    @FXML
    public void j1(ActionEvent Event){
        brd1.checkCheck(9,0);}
    @FXML
    public void j2(ActionEvent Event){
        brd1.checkCheck(9,1);}
    @FXML
    public void j3(ActionEvent Event){
        brd1.checkCheck(9,2);}
    @FXML
    public void j4(ActionEvent Event){
        brd1.checkCheck(9,3);}
    @FXML
    public void j5(ActionEvent Event){
        brd1.checkCheck(9,4);}
    @FXML
    public void j6(ActionEvent Event){
        brd1.checkCheck(9,5);}
    @FXML
    public void j7(ActionEvent Event){
        brd1.checkCheck(9,6);}
    @FXML
    public void j8(ActionEvent Event){
        brd1.checkCheck(9,7);}
    @FXML
    public void j9(ActionEvent Event){
        brd1.checkCheck(9,8);}
    @FXML
    public void j10(ActionEvent Event){
        brd1.checkCheck(9,9);}
    
    @Override
    public void initialize(URL url, ResourceBundle rb){
        //System.out.println(player1.);
        brd1.insertShip(one);
        brd2.insertShip(one);
//        brd.insertShip(thr);
//        brd.insertShip(fou);
//        brd.insertShip(fiv);
    }
}
