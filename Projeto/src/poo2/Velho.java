/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

/**
 *
 * @author juliana
 */
public class Velho extends FasesDaVida {

    public Velho(){
        super.fomeMaxima = 50;
        super.saudeMaxima = 50;
        super.nivelMaximo = 200;
    }
    
    public FasesDaVida subirDeFase() {
        return new Velho();
    }
    
    public FasesDaVida cairDeFase() {
        return new Adulto();
    }
    
    public String nomeFase() {
        return "Velho";
    }
}
