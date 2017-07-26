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


    @Override
    public double quantidadeComidaAbsorvida() {
        return 0.8;
    }

   
    @Override
    public double higienealcancada() {
        return 1.0;
    }

    @Override
    public double niveldediversao() {
        return 1.0;
    }

    @Override
    void nomeFaseVida() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
   
    
    public void verificarAlteracaoEstado() {
        if (super.getIdade()> 48) 
            super.setEstado(new Velho());
    else if (super.getIdade() < 17)
            super.setEstado(new Adulto());
}
}