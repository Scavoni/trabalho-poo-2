/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

/**
 *
 * @author juliana
 */
public class Adulto extends FasesDaVida {

    public Adulto() {
        super.saudeMaxima = 100;
        super.fomeMaxima = 100;
        super.nivelMaximo = 100;
    }
    public FasesDaVida subirDeFase() {
        return new Velho();
    }
    
    public FasesDaVida cairDeFase() {
        return new Crianca();
    }

    public String nomeFase() {
        return "Adulto";
    }
}