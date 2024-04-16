package game.Objects;

public class Ship {
    
    private String shipType;
    private int shipLength;
    private boolean horizontal;
    private int initialHorizontalCoordinate;
    private int initialVerticalCoordinate;
    private int [][] restShipCoordinatesHV;
    
    public Ship(String sT,int l,int x,int y,boolean horizontal){
        shipType=sT;
        shipLength=l;
        this.horizontal=horizontal;
        initialHorizontalCoordinate=x;
        initialVerticalCoordinate=y;
        restShipCoordinatesHV=new int[l][2];
        createShipChunks();
    }
    public Ship(String sT,int l,int x,int y){
        shipType=sT;
        shipLength=l;
        this.horizontal=horizontal;
        initialHorizontalCoordinate=x;
        initialVerticalCoordinate=y;
        restShipCoordinatesHV=new int[l][2];
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
    
    public int getInitialHorizontalCoordinate(){
        return initialHorizontalCoordinate;
    }
    
    public int getInitialVerticalCoordinate(){
        return initialVerticalCoordinate;
    }
    
    public void createShipChunks(){
        //The +1 is added to prevent the second coordinate from being identical to the initial one.
        for (int i = 0; i < shipLength-1; i++) {
            restShipCoordinatesHV[i][0]=initialHorizontalCoordinate+i+1;
            restShipCoordinatesHV[i][1]=initialVerticalCoordinate+i+1;
        }
    }
    
    public String getRestShipCoordinates(){
        String temp="";
        for (int i = 0; i < shipLength-1; i++) {
            temp+="H: "+restShipCoordinatesHV[i][0]+", V: "+restShipCoordinatesHV[i][1];
        }
        return temp;
    }
    
    @Override
    public String toString(){
        String temp="";
        for (int i = 0; i < shipLength-1; i++) {
            temp+="H: "+restShipCoordinatesHV[i][0]+", V: "+restShipCoordinatesHV[i][1]+" ; ";
        }
        return "-------"+shipType+"-------\nLength= "+shipLength+"\nHorizontal= "+horizontal+"\nInitialCoordinates= H: "+initialHorizontalCoordinate+", V: "+initialVerticalCoordinate+"\nRestShipCoordinatesHV= "+temp;
    }
}
