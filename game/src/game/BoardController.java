package game;

import game.Objects.Board;
import java.net.URL;
import java.util.ResourceBundle;

import game.Objects.Ship;
import java.util.Random;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class BoardController implements Initializable{

    private static final Stage stage=Game.getPrimaryStage();

    static String player1="1";
    static String player2="2";

    
    static void setBoard1(boolean[][] boardCheckP1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void setBoard2(boolean[][] boardCheckP2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void setPlayer1(String s){player1=s;}
    public void setPlayer2(String s){player2=s;}

    BackgroundImage waterImage = new BackgroundImage( new Image( getClass().getResource("img/water.png").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT);
    Background water = new Background(waterImage);
    
    BackgroundImage fireImage = new BackgroundImage( new Image( getClass().getResource("img/fire.png").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT);
    Background fire = new Background(fireImage);

    private boolean isPlayer1,isRandom=false;
    public void setRandom(boolean b){isRandom=b;}
    
    public static Board brd1=new Board(player1);
    private static int brd1Ships=0;
    public static Board brd2=new Board(player2);
    private static int brd2Ships=0;

    @FXML
    Rectangle recPlayer1,recPlayer2;//para tapar los tableros
    
    private void changeTurns(){ //cambio de turno
        if(isPlayer1){recPlayer2.setVisible(true);recPlayer1.setVisible(false);}
        else{recPlayer1.setVisible(true);recPlayer2.setVisible(false);}
        isPlayer1 = !isPlayer1;
    }
    
    private boolean checkTurn(int x, int y){ // gestiona los turnos
        boolean temp;
        if(isPlayer1)temp=brd1.checkCheck(x,y);
        else{temp=brd2.checkCheck(x,y);}
        return temp;
    }
    private void buttonCopy(ActionEvent Event,boolean temp){//aplica imagen y deshabilita boton al ser pulsadod
        ((Button) Event.getSource()).setDisable(true);
        if(temp){((Button) Event.getSource()).setBackground(fire);
            if(isPlayer1)brd2Ships--;
            else if(!isPlayer1)brd1Ships--;
        }
        else if(!temp){((Button) Event.getSource()).setBackground(water);changeTurns();}
        ((Button) Event.getSource()).setOpacity(1);
    } 
     /**
        A
    **/
    @FXML
    public void a1(ActionEvent Event){
        int x=0,y=0;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }

    @FXML
    public void a2(ActionEvent Event){
        int x=1,y=0;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void a3(ActionEvent Event){
        int x=2,y=0;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void a4(ActionEvent Event){
        int x=3,y=0;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void a5(ActionEvent Event){
        int x=4,y=0;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void a6(ActionEvent Event){
        int x=5,y=0;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void a7(ActionEvent Event){
        int x=6,y=0;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void a8(ActionEvent Event){
        int x=7,y=0;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void a9(ActionEvent Event){
        int x=8,y=0;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void a10(ActionEvent Event){
        int x=9,y=0;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    /**
        B
    **/
    @FXML
    public void b1(ActionEvent Event){
        int x=0,y=1;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void b2(ActionEvent Event){
        int x=1,y=1;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void b3(ActionEvent Event){
        int x=2,y=1;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void b4(ActionEvent Event){
        int x=3,y=1;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void b5(ActionEvent Event){
        int x=4,y=1;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void b6(ActionEvent Event){
        int x=5,y=1;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void b7(ActionEvent Event){
        int x=6,y=1;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void b8(ActionEvent Event){
        int x=7,y=1;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void b9(ActionEvent Event){
        int x=8,y=1;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void b10(ActionEvent Event){
        int x=9,y=1;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    /**
        C
    **/
    @FXML
    public void c1(ActionEvent Event){
        int x=0,y=2;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void c2(ActionEvent Event){
        int x=1,y=2;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void c3(ActionEvent Event){
        int x=2,y=2;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void c4(ActionEvent Event){
        int x=3,y=2;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void c5(ActionEvent Event){
        int x=4,y=2;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void c6(ActionEvent Event){
        int x=5,y=2;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void c7(ActionEvent Event){
        int x=6,y=2;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void c8(ActionEvent Event){
        int x=7,y=2;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void c9(ActionEvent Event){
        int x=8,y=2;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void c10(ActionEvent Event){
        int x=9,y=2;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
     /**
        D
    **/
    @FXML
    public void d1(ActionEvent Event){
        int x=0,y=3;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void d2(ActionEvent Event){
        int x=1,y=3;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void d3(ActionEvent Event){
        int x=2,y=3;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void d4(ActionEvent Event){
        int x=3,y=3;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void d5(ActionEvent Event){
        int x=4,y=3;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void d6(ActionEvent Event){
        int x=5,y=3;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void d7(ActionEvent Event){
        int x=6,y=3;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void d8(ActionEvent Event){
        int x=7,y=3;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void d9(ActionEvent Event){
        int x=8,y=3;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void d10(ActionEvent Event){
        int x=9,y=3;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    /**
        E
    **/
    @FXML
    public void e1(ActionEvent Event){
        int x=0,y=4;
       boolean temp=checkTurn(x,y);
        ((Button) Event.getSource()).setDisable(true);
        buttonCopy(Event,temp);
    }
    @FXML
    public void e2(ActionEvent Event){
        int x=1,y=4;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void e3(ActionEvent Event){
        int x=2,y=4;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void e4(ActionEvent Event){
        int x=3,y=4;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void e5(ActionEvent Event){
        int x=4,y=4;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void e6(ActionEvent Event){
        int x=5,y=4;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void e7(ActionEvent Event){
        int x=6,y=4;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void e8(ActionEvent Event){
        int x=7,y=4;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void e9(ActionEvent Event){
        int x=8,y=4;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void e10(ActionEvent Event){
        int x=9,y=4;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    /**
        F
    **/
    @FXML
    public void f1(ActionEvent Event){
        int x=0,y=5;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void f2(ActionEvent Event){
        int x=1,y=5;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void f3(ActionEvent Event){
        int x=2,y=5;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void f4(ActionEvent Event){
        int x=3,y=5;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void f5(ActionEvent Event){
        int x=4,y=5;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void f6(ActionEvent Event){
        int x=5,y=5;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void f7(ActionEvent Event){
        int x=6,y=5;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void f8(ActionEvent Event){
        int x=7,y=5;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void f9(ActionEvent Event){
        int x=8,y=5;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void f10(ActionEvent Event){
        int x=9,y=5;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    /**
        G
    **/
    @FXML
    public void g1(ActionEvent Event){
        int x=0,y=6;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void g2(ActionEvent Event){
        int x=1,y=6;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void g3(ActionEvent Event){
        int x=2,y=6;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void g4(ActionEvent Event){
        int x=3,y=6;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void g5(ActionEvent Event){
        int x=4,y=6;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void g6(ActionEvent Event){
        int x=5,y=6;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void g7(ActionEvent Event){
        int x=6,y=6;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void g8(ActionEvent Event){
        int x=7,y=6;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void g9(ActionEvent Event){
        int x=8,y=6;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void g10(ActionEvent Event){
        int x=9,y=6;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
     /**
        H
    **/
    @FXML
    public void h1(ActionEvent Event){
        int x=0,y=7;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void h2(ActionEvent Event){
        int x=1,y=7;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void h3(ActionEvent Event){
        int x=2,y=7;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void h4(ActionEvent Event){
        int x=3,y=7;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void h5(ActionEvent Event){
        int x=4,y=7;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void h6(ActionEvent Event){
        int x=5,y=7;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void h7(ActionEvent Event){
        int x=6,y=7;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void h8(ActionEvent Event){
        int x=7,y=7;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void h9(ActionEvent Event){
        int x=8,y=7;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void h10(ActionEvent Event){
        int x=9,y=7;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    /**
        I
    **/
    @FXML
    public void i1(ActionEvent Event){
        int x=0,y=8;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void i2(ActionEvent Event){
        int x=1,y=8;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void i3(ActionEvent Event){
        int x=2,y=8;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void i4(ActionEvent Event){
        int x=3,y=8;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void i5(ActionEvent Event){
        int x=4,y=8;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void i6(ActionEvent Event){
        int x=5,y=8;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void i7(ActionEvent Event){
        int x=6,y=8;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void i8(ActionEvent Event){
        int x=7,y=8;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void i9(ActionEvent Event){
        int x=8,y=8;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
     @FXML
    public void i10(ActionEvent Event){
        int x=9,y=8;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    /**
        J
    **/
    @FXML
    public void j1(ActionEvent Event){
        int x=0,y=9;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void j2(ActionEvent Event){
        int x=1,y=9;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void j3(ActionEvent Event){
        int x=2,y=9;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void j4(ActionEvent Event){
        int x=3,y=9;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void j5(ActionEvent Event){
        int x=4,y=9;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void j6(ActionEvent Event){
        int x=5,y=9;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void j7(ActionEvent Event){
        int x=6,y=9;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void j8(ActionEvent Event){
        int x=7,y=9;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void j9(ActionEvent Event){
        int x=8,y=9;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    @FXML
    public void j10(ActionEvent Event){
        int x=9,y=9;
        boolean temp=checkTurn(x,y);
        buttonCopy(Event,temp);
    }
    private void genAllRandom() {
        if(isRandom){ Random rng=new Random();
            for(int i=1;i<6;i++){
                brd1.insertShipRnd(new Ship("rnd",i,rng.nextInt(9),rng.nextInt(9),rng.nextBoolean()));
            }
            for(int i=1;i<6;i++){
                brd2.insertShipRnd(new Ship("rnd",i,rng.nextInt(9),rng.nextInt(9),rng.nextBoolean()));
            }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb){
        isRandom=true;
        if(isRandom)genAllRandom();
        
        
        
        brd1Ships=brd1.getAllPos();
        brd2Ships=brd2.getAllPos();
        changeTurns();
    }
}