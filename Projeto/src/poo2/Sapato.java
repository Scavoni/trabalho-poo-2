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
public class Sapato extends Acessorio{
    public String getVisual() {
        return "-sapato";
    }
    
    public int[] getMultiplicador(){
        int[] mult = new int[3];
        mult[0] = 0;
        mult[1] = 3;
        mult[2] = 0;
        return mult;
    }
}
