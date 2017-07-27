/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

/**
 *
 * @author pc
 */
public class AcessorioInicial extends Acessorio{
    public String getVisual() {
        return "";
    }
    
    public int[] getMultiplicador(){
        int[] mult = new int[3];
        mult[0] = 1;
        mult[1] = 1;
        mult[2] = 1;
        return mult;
    }
}
