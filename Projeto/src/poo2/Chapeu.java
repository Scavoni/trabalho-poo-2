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
public class Chapeu extends Acessorio{
    
    public String getVisual() {
        return "-chapeu";
    }
    
    public double[] getMultiplicador(){
        double[] mult = new double[3];
        mult[0] = 0.0;
        mult[1] = 0.0;
        mult[2] = 1.5;
        return mult;
    }
}
