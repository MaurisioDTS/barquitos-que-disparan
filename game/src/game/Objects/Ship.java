package game.Objects;

public class Ship extends ShipChunk{
    
    private String shipType;
    private int shipLength;
    private boolean horizontal;
    
    public Ship(String sT,int l,int initialHorizontalCoordinate,int initialVerticalCoordinate,boolean horizontal){
        super(initialHorizontalCoordinate,initialVerticalCoordinate);
        shipType=sT;
        shipLength=l;
        this.horizontal=horizontal;
    }
    public String getShipType(){
        return shipType;
    }
    
    public int getLength(){
        return shipLength;
    }
    
    public void setHorizontal(){
        if (!horizontal) {
            horizontal=true;
        } else {
            horizontal=false;
        }
    }
    
    public boolean getHorizontal(){
        return horizontal;
    }
    
    public int getInitialHorizontalCoordinate(){return super.getInitialHorizontalCoordinate();}
    
    public int getInitialVerticalCoordinate(){return super.getInitialVerticalCoordinate();}
    
//    public void createShipChunks(){
//        //The +1 is added to prevent the second coordinate from being identical to the initial one.
//        for (int i = 0; i < shipLength-1; i++) {
//            restShipCoordinatesHV[i][0]=initialHorizontalCoordinate+i+1;
//            restShipCoordinatesHV[i][1]=initialVerticalCoordinate+i+1;
//        }
//    }
    
//    public String getRestShipCoordinates(){
//        String temp="";
//        for (int i = 0; i < shipLength-1; i++) {
//            temp+="H: "+restShipCoordinatesHV[i][0]+", V: "+restShipCoordinatesHV[i][1];
//        }
//        return temp;
//    }
    
    @Override
    public String toString(){
//        String temp="";
//        for (int i = 0; i < shipLength-1; i++) {
//            temp+="H: "+restShipCoordinatesHV[i][0]+", V: "+restShipCoordinatesHV[i][1]+" ; ";
//        }
        return "-------"+shipType+"-------\nLength= "+shipLength+"\nHorizontal= "+horizontal+super.toString();
    }
}
