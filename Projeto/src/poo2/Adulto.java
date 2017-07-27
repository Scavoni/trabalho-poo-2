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

    int porcentagemD = 10;
    int tempoD = 120;
    
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
    public int PorcentagemDecrescer()
    {
        return porcentagemD;
    }
    public int TempoDecrescer()
    {
        return tempoD;
    }
}