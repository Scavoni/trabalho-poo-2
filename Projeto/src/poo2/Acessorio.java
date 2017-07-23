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
public abstract class Acessorio {
    String visual;
    Acessorio nextAcessorio;

    public abstract String getVisual();
    
    public void setSucessor(Acessorio nextAcessorio) {
        this.nextAcessorio = nextAcessorio;
    }
    
    public String processaVisual() {
        if(this.nextAcessorio != null) {
            return this.nextAcessorio.processaVisual() + this.getVisual();
        }
        else {
            return this.getVisual();
        }
            
    }
}
