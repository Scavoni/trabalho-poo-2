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

    @Override
    public double quantidadeComidaAbsorvida() {
        return 0.3;
    }

    @Override
    public void nomeFaseVida() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double higienealcancada() {
        return 0.8;
    }

    @Override
    public double niveldediversao() {
        return 0.5;
    }
        public void verificarAlteracaoEstado() {
        if (super.getIdade()<  48 && super.getIdade()> 17) 
            super.setEstado(new Adulto());
    else if (super.getIdade() < 17)
            super.setEstado(new Crianca());
}
}
