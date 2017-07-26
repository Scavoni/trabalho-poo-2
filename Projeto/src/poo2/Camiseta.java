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
        return "-camiseta";
    }
    
    public double[] getMultiplicador(){
        double[] mult = new double[3];
        mult[0] = 0.5;
        mult[1] = 0.0;
        mult[2] = 0.0;
        return mult;
    }
}
