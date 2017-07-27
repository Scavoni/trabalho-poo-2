/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

/**
 *
 * @author Rafael
 */
public class Camiseta extends Acessorio{
    public String getVisual() {
        return " Camiseta ";
    }
    
    public int[] getMultiplicador(){
        int[] mult = new int[3];
        mult[0] = 2;
        mult[1] = 0;
        mult[2] = 0;
        return mult;
    }
}
