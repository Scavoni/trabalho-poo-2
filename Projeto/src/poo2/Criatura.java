    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

import java.util.ArrayList;

/**
 *
 * @author Vinicius
 */
public class Criatura implements Subject
{
    //Os valores de alimentacao, higiene e diversão variam de 0 a 100 e diminuem a saude se forem menos que 0 ou maiores que 100.
    
    int saude; // Se chegar a 0 bichinho morre.
    int nivel; 
    String nome;
    int idade=  0;
    public static int fome = 0;
    public static int higiene; 
    public static int felicidade = 0;
    double[] multiplicador;
    
    public static void Alimentar(Alimento al)  
    {
        Criatura.fome += al.Alimentar();
    }
    
    public static void Banho()
    {
        Criatura.higiene += 50;        
    }
    
    public static void Banheiro()
    {
        Criatura.higiene += 10;
    }
    
    FasesDaVida faseatual;
    
    public void setFase(FasesDaVida fase) 
    {
        this.faseatual = fase;
    }
    
    public void subirDeFase(){
        setFase(this.faseatual.subirDeFase());
    }
    
    public void cairDeFase(){
        setFase(this.faseatual.cairDeFase());
    }
    
    public void atualizaSaude(int valor) {
        this.saude -= this.multiplicador[1]*saude;
        if(this.saude<=0)
        {
            this.cairDeFase();
        }
    }
    
    public void atualizaNivel(int valor) {
        this.nivel += nivel;
        if(this.nivel >= faseatual.getNivelMaximo())
        {
            this.subirDeFase();
        }
    }
    
    public ArrayList<Observer> observadores;

    @Override
    public void registrarObservador(Observer o) {
        observadores.add(o);
    }

    @Override
    public void removerObservador(Observer o) {
        int i = observadores.indexOf(o);
        if(i>=0){
            observadores.remove(o);
        }
    }

    @Override
    public void notificarObservador() {
        for(int i=0; i < observadores.size();i++){
            Observer obs = (Observer) observadores.get(i);
            obs.atualizar(nome, nivel, fome, saude, felicidade, higiene);
        }
    }
    
    
    
    
}
