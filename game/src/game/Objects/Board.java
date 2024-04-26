package game.Objects;

import java.util.Random;

public class Board {Random rng=new Random();
    
    private final ShipChunk[][] board = new ShipChunk[10][10];//he hecho que el array guarde barcos en lugar de ints, estoy probando una forma de estructurarlo 
    String user;
    
    public Board(String nick){ //de momento solo esto. no puede ser que no tenga constructor, de otra forma no podríamos hacer nada con ella
        user=nick;
    }
    public void gen(Ship s){
        if(s.getHorizontal()){
            for(int i=0;i<s.getLength();i++){
                board[s.getInitialHorizontalCoordinate()+i][s.getInitialVerticalCoordinate()]= new ShipChunk(s.getInitialHorizontalCoordinate()+i,s.getInitialVerticalCoordinate());
            }
        }else{
            for(int i=0;i<s.getLength();i++){
                board[s.getInitialHorizontalCoordinate()][s.getInitialVerticalCoordinate()+i]= new ShipChunk(s.getInitialHorizontalCoordinate(),s.getInitialVerticalCoordinate()+i);
            }
        }
    }
    
    public void insertShipRnd(Ship s){// para insertar barcos al tablero (random), si esa casilla ya está ocupada, no genera nada
        if(s.getHorizontal()){
            if(s.getInitialHorizontalCoordinate()+s.getLength()-1<board.length){
                if (board[s.getInitialHorizontalCoordinate()][s.getInitialVerticalCoordinate()]==null){
                    board[s.getInitialHorizontalCoordinate()][s.getInitialVerticalCoordinate()]=s;
                    gen(s);
                }
            }
        }
        else{
            if(s.getInitialVerticalCoordinate()+s.getLength()-1<board.length){
                if (board[s.getInitialHorizontalCoordinate()][s.getInitialVerticalCoordinate()]==null){
                    board[s.getInitialHorizontalCoordinate()][s.getInitialVerticalCoordinate()]=s;
                    gen(s);
                }
            }
        }
    }
    
    public void insertShip(String sT,int l,int initialHorizontalCoordinate,int initialVerticalCoordinate,boolean horizontal){// para insertar barcos al tablero, si esa casilla ya está ocupada, no genera nada
            Ship ship=new Ship(sT, l, initialHorizontalCoordinate, initialVerticalCoordinate, horizontal);
            board[initialHorizontalCoordinate][initialVerticalCoordinate]=ship;
            gen(ship);
    }
    
    public boolean checkCheck(int x, int y){boolean impakt=false;
        if (board[x][y]==null){impakt=false;}
        if (board[x][y]!=null){ impakt=true; }

        System.out.println(user+" on x="+x+" y="+y+impakt);
        return impakt;
    }
    public int getAllPos(){int temp=0;
        
        for(int i=0;i<board.length-1;i++){
            for(int j=0;j<board.length-1;j++){
                System.out.println(board[i][j]);
                if(board[i][j]!=null)temp++;
        }   }
        return temp;
    }
    
    @Override
    public String toString(){return "----- "+user+" -----"+" ";}
}

//       if(isPlayer1){brd1.checkCheck(0,0);}}
//        else{brd2.checkCheck(0,0);}

//Metodo que compruebe que haya barco, agua e impactado. -1-agua, 0-aguaImpactado, 1-barco, 2-barco impactado.
    //public boolean checkPosition(int[][] coords){
    //}
    
    //Metodo provisional
    /**public int checkBo(int row, int column) {
        if (row < 0 || row >= board.length || column < 0 || column >= board[0].length) {
            return -1; // celda inválida
        }

        int celda = board[row][column];

        switch (celda) {
            case -1:
                return 0; // agua
            case 1:
                return 2; // barco
            case 2:
                return 3; // barco impactado
            default:
                return -1; // celda inválida
        }
     * @param a}**/