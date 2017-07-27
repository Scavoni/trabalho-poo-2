/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

/**
 *
 * @author juliana
 */
public class Crianca extends FasesDaVida {
    
    int porcentagemD = 20;
    int tempoD = 50;
    
    public Crianca() {
        super.saudeMaxima = 200;
        super.fomeMaxima = 200;
        super.nivelMaximo = 50;
    }
    
    public FasesDaVida subirDeFase() {
        return new Adulto();
    }
    
    public FasesDaVida cairDeFase() {
        return new Crianca();
    }
    
    public String nomeFase() {
        return "Criança";
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
