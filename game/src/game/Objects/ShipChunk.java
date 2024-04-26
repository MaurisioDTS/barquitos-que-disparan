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
        return "InitialCoordinates= H: "+initialHorizontalCoordinate+", V: "+initialVerticalCoordinate;
    }
}

