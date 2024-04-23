package game.Objects;

public class Board {
    
    private final Ship[][] board = new Ship[10][10];//he hecho que el array guarde barcos en lugar de ints, estoy probando una forma de estructurarlo 
    String user;
    
    public Board(String nick){ //de momento solo esto. no puede ser que no tenga constructor, de otra forma no podríamos sacarle partido a la poo
        user=nick;
    }

    public void insertShip(Ship s){// para insertar barcos al tablero
        if (board[s.getInitialHorizontalCoordinate()][s.getInitialVerticalCoordinate()]==null){
            board[s.getInitialHorizontalCoordinate()][s.getInitialVerticalCoordinate()]=s;}
    }
    
    public boolean checkCheck(int x, int y){boolean impakt=false;
        if (board[x][y]==null){impakt=false;}
        if (board[x][y]!=null){ impakt=true; }

        System.out.println(user+" on x="+x+" y="+y+impakt);
        return impakt;
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