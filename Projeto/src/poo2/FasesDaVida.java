/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

/**
 *
 * @author juliana
 */
public abstract class FasesDaVida {

    public int getSaudeMaxima() {
        return saudeMaxima;
    }

    public int getNivelMaximo() {
        return nivelMaximo;
    }

    public int getFomeMaxima() {
        return fomeMaxima;
    }
    public int saudeMaxima;
    public int nivelMaximo;
    public int fomeMaxima;

    abstract FasesDaVida subirDeFase();
    abstract FasesDaVida cairDeFase();
}
