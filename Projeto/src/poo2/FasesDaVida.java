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
    private FasesDaVida estado;
    private int idade;
    abstract double quantidadeComidaAbsorvida();
    abstract double higienealcancada();
    abstract double niveldediversao();
    abstract void nomeFaseVida();
    
    void setIdade(int a){
        this.idade = a;
    }
     int getIdade(){
        return this.idade;
    }

    void setEstado(FasesDaVida a) {
        this.estado = a;
    }
}
