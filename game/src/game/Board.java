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
public class Board {
    private int [][] board = new int [10][10]; 
    //Metodo que compruebe que haya barco, agua e impactado. -1-agua, 0-aguaImpactado, 1-barco, 2-barco impactado.
    //public boolean checkPosition(int[][] coords){
    //}
    
    //Metodo provisional
    public int checkBo(int row, int column) {
        if (row < 0 || row >= board.length || column < 0 || column >= board[0].length) {
            return -1; // celda inválida
        }

        int celda = board[row][column];

        if (celda == -1) {
            return 0; // agua
        } else if (celda == 1) {
            return 2; // barco
        } else if (celda == 2) {
            return 3; // barco impactado
        } else {
            return -1; // celda inválida
        }
    }
}
