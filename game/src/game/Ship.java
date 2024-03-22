/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author Usuario
 */
public class Ship {
    
    private String shipType;
    private int length;
    private boolean horizontal;
    private int initialHorizontalCoordinate;
    private int initialVerticalCoordinate;
    //Vector para guardar el resto de las coordenadas, crear un metodo que mire si es horizontal y las coodenadas iniciales, y sume de 1 en 1 hasta llegar a la longitud maxima del barco
    
    Ship(String sT,int l,boolean h,int iCH,int iCV){
        shipType=sT;
        length=l;
        horizontal=h;
        initialHorizontalCoordinate=iCH;
        initialVerticalCoordinate=iCV;
    }
    
    public void setShipType(String sT){
        shipType=sT;
    }
    
    public String getShipType(){
        return shipType;
    }
    
    public void setLength(int l){
        length=l;
    }
    
    public int getLength(){
        return length;
    }
    
    public void setHorizontal(boolean h){
        horizontal=h;
    }
    
    public boolean getHorizontal(){
        return horizontal;
    }
    
    public void setinitialHorizontalCoordinate(int iCH){
        initialHorizontalCoordinate=iCH;
    }
    
    public int getinitialHorizontalCoordinate(){
        return initialHorizontalCoordinate;
    }
    
    public void setinitialVerticalCoordinate(int iCV){
        initialVerticalCoordinate=iCV;
    }
    
    public int getinitialVerticalCoordinate(){
        return initialVerticalCoordinate;
    }
    
    @Override
    public String toString(){
        return "Ship type: "+shipType+"\nLength: "+length+"\nHorizontal: "+horizontal+"\nInitialCoordinates: "+initialHorizontalCoordinate+";"+initialVerticalCoordinate;
    }
}
