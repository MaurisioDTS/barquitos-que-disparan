package game.Objects;
public class ShipChunk{
    
    private int initialHorizontalCoordinate;
    private int initialVerticalCoordinate;
    
    public ShipChunk(int initialHorizontalCoordinate, int initialVerticalCoordinate){
        this.initialHorizontalCoordinate=initialHorizontalCoordinate;
        this.initialVerticalCoordinate=initialVerticalCoordinate;
    }

    public int getInitialHorizontalCoordinate(){return initialHorizontalCoordinate;
    }
    
    public int getInitialVerticalCoordinate(){return initialVerticalCoordinate;}
    
    public String toString(){
//        String temp="";
//        for (int i = 0; i < shipLength-1; i++) {
//            temp+="H: "+restShipCoordinatesHV[i][0]+", V: "+restShipCoordinatesHV[i][1]+" ; ";
//        }
        return "InitialCoordinates= H: "+initialHorizontalCoordinate+", V: "+initialVerticalCoordinate;
    }
}

