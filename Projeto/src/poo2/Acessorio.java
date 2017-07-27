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
    Acessorio nextAcessorio;
    
    public abstract String getVisual();
    public abstract int[] getMultiplicador();
    //multiplicador é um vetor com {multAlimentação, multSaude, multDiversão}
    
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
    
    public int[] processaMultiplicador() {
        int[] mult = this.nextAcessorio.processaMultiplicador();
        int[] mult2 = this.getMultiplicador();
        for(int i=0 ; i<3 ; i++) {
            mult[i] = mult[i] + mult2[i];
        }
        return mult;
    }
    
}
